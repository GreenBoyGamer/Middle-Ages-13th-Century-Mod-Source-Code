package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.themiddleages.init.TheMiddleAgesModEntities;
import net.mcreator.themiddleages.entity.KnightRidingHorseEntity;

public class HorserKnightOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity target = null;
		double dist = 0;
		double Ydiff = 0;
		double actionState = 0;
		double AttackDamage = 0;
		if (!world.isClientSide()) {
			actionState = entity instanceof KnightRidingHorseEntity _datEntI ? _datEntI.getEntityData().get(KnightRidingHorseEntity.DATA_actionstate) : 0;
			if (actionState == 0) {
				entity.getPersistentData().putDouble("ticks", (entity.getPersistentData().getDouble("ticks") + 1));
				if (entity.getPersistentData().getDouble("ticks") > 4) {
					entity.getPersistentData().putDouble("ticks", 0);
					target = entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null;
					if (target != null) {
						dist = Math.pow(target.getX() - x, 2) + Math.pow(target.getZ() - z, 2);
						Ydiff = target.getY() - y;
						if (dist < Math.pow(entity.getBbWidth() * 1.2 + target.getBbWidth() * 0.5, 2) && Ydiff < entity.getBbHeight() && Ydiff > target.getBbHeight() * (-1)) {
							if (entity instanceof KnightRidingHorseEntity _datEntSetI)
								_datEntSetI.getEntityData().set(KnightRidingHorseEntity.DATA_actionstate, Mth.nextInt(RandomSource.create(), 1, 2));
							entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((target.getX()), (target.getY()), (target.getZ())));
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("actionTicks", (entity.getPersistentData().getDouble("actionTicks") + 1));
				if (actionState < 3) {
					AttackDamage = entity instanceof LivingEntity _livingEntity22 && _livingEntity22.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity22.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0;
					if (entity.getPersistentData().getDouble("actionTicks") == 4) {
						for (Entity entityiterator : world.getEntities(null, new AABB((x + (entity.getLookAngle().x * 0.6 + 0.5) * entity.getBbWidth()), y, (z + (entity.getLookAngle().z * 0.6 + 0.5) * entity.getBbWidth()),
								(x + (entity.getLookAngle().x * 0.6 - 0.5) * entity.getBbWidth()), (y + entity.getBbHeight()), (z + (entity.getLookAngle().z * 0.6 - 0.5) * entity.getBbWidth())))) {
							if (!(entity == entityiterator)) {
								entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MOB_ATTACK), entity), (float) AttackDamage);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else if (entity.getPersistentData().getDouble("actionTicks") == 14) {
						if (entity instanceof KnightRidingHorseEntity _datEntSetI)
							_datEntSetI.getEntityData().set(KnightRidingHorseEntity.DATA_actionstate, 0);
						entity.getPersistentData().putDouble("actionTicks", 0);
					}
				} else if (actionState == 100) {
					if (entity.getPersistentData().getDouble("actionTicks") > 20) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_iron")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_iron")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (!entity.level().isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = TheMiddleAgesModEntities.KNIGHT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				}
			}
			if ((entity instanceof KnightRidingHorseEntity _datEntI ? _datEntI.getEntityData().get(KnightRidingHorseEntity.DATA_alive) : 0) == 1) {
				entity.getPersistentData().putDouble("SpawnTicks", (entity.getPersistentData().getDouble("SpawnTicks") + 1));
				if (entity.getPersistentData().getDouble("SpawnTicks") >= 50) {
					if (entity instanceof KnightRidingHorseEntity _datEntSetI)
						_datEntSetI.getEntityData().set(KnightRidingHorseEntity.DATA_alive, 0);
				}
			}
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null) {
			if ((entity.position()).distanceTo(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).position())) > 3) {
				entity.setSprinting(true);
			}
		} else {
			entity.setSprinting(false);
		}
	}
}