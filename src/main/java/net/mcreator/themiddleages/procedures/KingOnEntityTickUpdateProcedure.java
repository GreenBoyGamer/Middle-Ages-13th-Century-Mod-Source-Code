package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.*;
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

import net.mcreator.themiddleages.init.TheMiddleAgesModEntities;
import net.mcreator.themiddleages.entity.EnemyArcherEntity;
import net.mcreator.themiddleages.entity.DarkkingEntity;
import net.mcreator.themiddleages.entity.DarkSoldierEntity;
import net.mcreator.themiddleages.entity.DarkKnightEntity;

public class KingOnEntityTickUpdateProcedure {
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
		if (!world.isClientSide()) {
			actionState = entity instanceof DarkkingEntity _datEntI ? _datEntI.getEntityData().get(DarkkingEntity.DATA_actionstate) : 0;
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
							if (entity instanceof DarkkingEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkkingEntity.DATA_actionstate, Mth.nextInt(RandomSource.create(), 1, 2));
							entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((target.getX()), (target.getY()), (target.getZ())));
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("actionTicks", (entity.getPersistentData().getDoubleOr("actionTicks", 0) + 1));
				if (actionState < 3) {
					AttackDamage = entity instanceof LivingEntity _livingEntity40 && _livingEntity40.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity40.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0;
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
						if (entity instanceof DarkkingEntity _datEntSetI)
							_datEntSetI.getEntityData().set(DarkkingEntity.DATA_actionstate, 0);
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
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null) {
			entity.getPersistentData().putDouble("BossAttacksTicking", (entity.getPersistentData().getDoubleOr("BossAttacksTicking", 0) + 1));
			if (entity.getPersistentData().getDoubleOr("BossAttacksTicking", 0) == 100) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.DARK_KNIGHT.get().spawn(_level, BlockPos.containing(x + 2, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.DARK_KNIGHT.get().spawn(_level, BlockPos.containing(x, y, z + 2), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.DARK_KNIGHT.get().spawn(_level, BlockPos.containing(x - 2, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.DARK_SOLDIER.get().spawn(_level, BlockPos.containing(x + 2, y, z + 2), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.DARK_SOLDIER.get().spawn(_level, BlockPos.containing(x, y, z - 2), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.DARK_SOLDIER.get().spawn(_level, BlockPos.containing(x - 2, y, z - 2), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.ENEMY_ARCHER.get().spawn(_level, BlockPos.containing(x + 3, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.ENEMY_ARCHER.get().spawn(_level, BlockPos.containing(x - 3, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.ENEMY_ARCHER.get().spawn(_level, BlockPos.containing(x, y, z + 3), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
					entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x + 2, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
					entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z + 2)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
					entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x - 2, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
					entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x + 2, y, z + 2)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
					entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z - 2)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
					entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x - 2, y, z - 2)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
					entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x + 3, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
					entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x - 3, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
					entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z + 3)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (entity.getPersistentData().getDoubleOr("BossAttacksTicking", 0) > 250) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 255, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 10, false, false));
				entity.getPersistentData().putDouble("BossAttacksTicking", 0);
			}
		}
	}
}