package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
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

import net.mcreator.themiddleages.entity.GhostOfCruelKingEntity;

public class GhostOnTicksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity target = null;
		double dist = 0;
		double Ydiff = 0;
		double actionState = 0;
		double AttackDamage = 0;
		if (!world.isClientSide()) {
			actionState = entity instanceof GhostOfCruelKingEntity _datEntI ? _datEntI.getEntityData().get(GhostOfCruelKingEntity.DATA_actionstate) : 0;
			if ((entity instanceof GhostOfCruelKingEntity _datEntI ? _datEntI.getEntityData().get(GhostOfCruelKingEntity.DATA_fightingState) : 0) == 0) {
				if (actionState == 0) {
					entity.getPersistentData().putDouble("ticks", (entity.getPersistentData().getDoubleOr("ticks", 0) + 1));
					if (entity.getPersistentData().getDoubleOr("ticks", 0) > 4) {
						target = entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null;
						entity.getPersistentData().putDouble("ticks", 0);
						if (target != null) {
							dist = Math.pow(target.getX() - x, 2) + Math.pow(target.getZ() - z, 2);
							Ydiff = target.getY() - y;
							if (dist < Math.pow(entity.getBbWidth() * 1.2 + target.getBbWidth() * 0.5, 2) && Ydiff < entity.getBbHeight() && Ydiff > target.getBbHeight() * (-1)) {
								if (entity instanceof GhostOfCruelKingEntity _datEntSetI)
									_datEntSetI.getEntityData().set(GhostOfCruelKingEntity.DATA_actionstate, Mth.nextInt(RandomSource.create(), 1, 2));
								entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((target.getX()), (target.getY()), (target.getZ())));
							}
						}
					}
				} else {
					entity.getPersistentData().putDouble("actionTicks", (entity.getPersistentData().getDoubleOr("actionTicks", 0) + 1));
					if (actionState < 3) {
						AttackDamage = entity instanceof LivingEntity _livingEntity23 && _livingEntity23.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity23.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0;
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
						} else if (entity.getPersistentData().getDoubleOr("actionTicks", 0) > 14) {
							if (entity instanceof GhostOfCruelKingEntity _datEntSetI)
								_datEntSetI.getEntityData().set(GhostOfCruelKingEntity.DATA_actionstate, 0);
							entity.getPersistentData().putDouble("actionTicks", 0);
						}
					} else if (actionState == 100) {
						if (entity.getPersistentData().getDoubleOr("actionTicks", 0) > 20) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (!entity.level().isClientSide())
								entity.discard();
							entity.getPersistentData().putDouble("actionTicks", 0);
						}
					}
				}
			}
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null) {
			entity.getPersistentData().putDouble("Fighting", (entity.getPersistentData().getDoubleOr("Fighting", 0) + 1));
			if (entity.getPersistentData().getDoubleOr("Fighting", 0) == 120) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.PARCHED.spawn(_level, BlockPos.containing(x + 1, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.PARCHED.spawn(_level, BlockPos.containing(x - 1, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.PARCHED.spawn(_level, BlockPos.containing(x - 2, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.PARCHED.spawn(_level, BlockPos.containing(x + 2, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity.getPersistentData().getDoubleOr("Fighting", 0) >= 240) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 2, false, false));
				entity.getPersistentData().putDouble("Fighting", 0);
			}
		}
	}
}