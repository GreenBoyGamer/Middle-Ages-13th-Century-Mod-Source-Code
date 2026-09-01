package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.EnemyArcherEntity;
import net.mcreator.themiddleages.entity.DarkkingEntity;
import net.mcreator.themiddleages.entity.DarkSoldierEntity;
import net.mcreator.themiddleages.entity.DarkKnightEntity;

import java.util.Comparator;

public class DarkKnightOnTicksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity target = null;
		double dist = 0;
		double Ydiff = 0;
		double actionState = 0;
		double AttackDamage = 0;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof DarkKnightEntity) {
				if (entity instanceof Mob _entity)
					_entity.setTarget(null);
			} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof DarkSoldierEntity) {
				if (entity instanceof Mob _entity)
					_entity.setTarget(null);
			} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof EnemyArcherEntity) {
				if (entity instanceof Mob _entity)
					_entity.setTarget(null);
			} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof DarkkingEntity) {
				if (entity instanceof Mob _entity)
					_entity.setTarget(null);
			}
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).Attack == true) {
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(512 / 2d), e -> true).isEmpty()) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Player.class, x, y, z, 512)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 512)).getY()),
								((findEntityInWorldRange(world, Player.class, x, y, z, 512)).getZ()), 1);
				}
			} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(12 / 2d), e -> true).isEmpty()) {
				if (entity instanceof Mob _entity && (findEntityInWorldRange(world, Player.class, x, y, z, 12)) instanceof LivingEntity _ent)
					_entity.setTarget(_ent);
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
			}
		}
		if (!world.isClientSide()) {
			actionState = entity instanceof DarkKnightEntity _datEntI ? _datEntI.getEntityData().get(DarkKnightEntity.DATA_actionstate) : 0;
			if (actionState == 0) {
				entity.getPersistentData().putDouble("ticks", (entity.getPersistentData().getDoubleOr("ticks", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("ticks", 0) > 4) {
					entity.getPersistentData().putDouble("ticks", 0);
					target = entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null;
					if (target != null) {
						if (entity.getDeltaMovement().x() > 0 && entity.getDeltaMovement().y() > 0 && entity.getDeltaMovement().z() > 0) {
							entity.setSprinting(true);
						} else {
							entity.setSprinting(false);
						}
						dist = Math.pow(target.getX() - x, 2) + Math.pow(target.getZ() - z, 2);
						Ydiff = target.getY() - y;
						if (dist < Math.pow(entity.getBbWidth() * 1.2 + target.getBbWidth() * 0.5, 2) && Ydiff < entity.getBbHeight() && Ydiff > target.getBbHeight() * (-1)) {
							if (entity instanceof DarkKnightEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkKnightEntity.DATA_actionstate, Mth.nextInt(RandomSource.create(), 1, 3));
							entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((target.getX()), (target.getY()), (target.getZ())));
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("actionTicks", (entity.getPersistentData().getDoubleOr("actionTicks", 0) + 1));
				if (actionState < 4) {
					AttackDamage = entity instanceof LivingEntity _livingEntity53 && _livingEntity53.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity53.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0;
					if (entity.getPersistentData().getDoubleOr("actionTicks", 0) == 4) {
						for (Entity entityiterator : world.getEntities(null, new AABB((x + (entity.getLookAngle().x * 0.6 + 0.5) * entity.getBbWidth()), y, (z + (entity.getLookAngle().z * 0.6 + 0.5) * entity.getBbWidth()),
								(x + (entity.getLookAngle().x * 0.6 - 0.5) * entity.getBbWidth()), (y + entity.getBbHeight()), (z + (entity.getLookAngle().z * 0.6 - 0.5) * entity.getBbWidth())))) {
							if (!(entity == entityiterator)) {
								{
									Entity _ent = entityiterator;
									if (_ent.level() instanceof ServerLevel _serverLevel) {
										_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.MOB_ATTACK), entity), (float) AttackDamage);
									}
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else if (entity.getPersistentData().getDoubleOr("actionTicks", 0) == 14) {
						if (entity instanceof DarkKnightEntity _datEntSetI)
							_datEntSetI.getEntityData().set(DarkKnightEntity.DATA_actionstate, 0);
						entity.getPersistentData().putDouble("actionTicks", 0);
					}
				} else if (actionState == 1000) {
					if (entity.getPersistentData().getDoubleOr("actionTicks", 0) > 20) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.armor.equip_iron")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.armor.equip_iron")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (!entity.level().isClientSide())
							entity.discard();
					}
				}
			}
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).Attack == true) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null) {
				if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(5 / 2d), e -> true).isEmpty()) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().stop();
				} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(128 / 2d), e -> true).isEmpty()) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Player.class, x, y, z, 128)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 128)).getY()),
								((findEntityInWorldRange(world, Player.class, x, y, z, 128)).getZ()), 1);
				}
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}