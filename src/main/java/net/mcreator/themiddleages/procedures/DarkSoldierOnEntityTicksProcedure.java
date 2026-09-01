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

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.*;

import java.util.Comparator;

public class DarkSoldierOnEntityTicksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity target = null;
		double dist = 0;
		double Ydiff = 0;
		double actionState = 0;
		double AttackDamage = 0;
		boolean dontRob = false;
		boolean notRobbingAgain = false;
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
				if ((findEntityInWorldRange(world, Player.class, x, y, z, 12)) instanceof Mob _entity)
					_entity.setTarget(null);
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
			}
		}
		if (!world.isClientSide()) {
			actionState = entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_actionstate) : 0;
			if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_fightingState) : 0) == 0) {
				if (actionState == 0) {
					entity.getPersistentData().putDouble("ticks", (entity.getPersistentData().getDoubleOr("ticks", 0) + 1));
					if (entity.getPersistentData().getDoubleOr("ticks", 0) > 4) {
						entity.getPersistentData().putDouble("ticks", 0);
						target = entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null;
						if (target != null) {
							dist = Math.pow(target.getX() - x, 2) + Math.pow(target.getZ() - z, 2);
							Ydiff = target.getY() - y;
							if (dist < Math.pow(entity.getBbWidth() * 1.2 + target.getBbWidth() * 0.5, 2) && Ydiff < entity.getBbHeight() && Ydiff > target.getBbHeight() * (-1)) {
								if (entity instanceof DarkSoldierEntity _datEntSetI)
									_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, Mth.nextInt(RandomSource.create(), 1, 2));
								entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((target.getX()), (target.getY()), (target.getZ())));
							}
						}
					}
				} else {
					entity.getPersistentData().putDouble("actionTicks", (entity.getPersistentData().getDoubleOr("actionTicks", 0) + 1));
					if (actionState < 3) {
						AttackDamage = entity instanceof LivingEntity _livingEntity49 && _livingEntity49.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity49.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0;
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
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
							entity.getPersistentData().putDouble("actionTicks", 0);
						}
					} else if (actionState == 100) {
						if (entity.getPersistentData().getDoubleOr("actionTicks", 0) > 20) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.big_fall")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.big_fall")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (!entity.level().isClientSide())
								entity.discard();
							entity.getPersistentData().putDouble("actionTicks", 0);
						}
					}
				}
			} else {
				if (entity instanceof DarkSoldierEntity _datEntSetI)
					_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
			}
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null) {
			if (!((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_fightingState) : 0) == 1)) {
				entity.getPersistentData().putDouble("InaFight", (entity.getPersistentData().getDoubleOr("InaFight", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("InaFight", 0) > 119) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_fightingState, 1);
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, true));
					entity.getPersistentData().putDouble("InaFight", 0);
					entity.setInvulnerable(true);
				}
			}
		}
		if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_fightingState) : 0) == 1) {
			entity.getPersistentData().putDouble("Bakwas", (entity.getPersistentData().getDoubleOr("Bakwas", 0) + 1));
			if (entity instanceof DarkSoldierEntity _datEntSetI)
				_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, true));
			if (entity.getPersistentData().getDoubleOr("Bakwas", 0) > 65) {
				if (entity instanceof DarkSoldierEntity _datEntSetI)
					_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_fightingState, 0);
				entity.getPersistentData().putDouble("Bakwas", 0);
				entity.setInvulnerable(false);
			}
		}
		if (!world.getEntitiesOfClass(Civilian1Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
			if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(48 / 2d), e -> true).isEmpty())) {
				if ((entity instanceof DarkSoldierEntity _datEntL96 && _datEntL96.getEntityData().get(DarkSoldierEntity.DATA_notgonnarob)) == false) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 10);
					if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_actionstate) : 0) == 10) {
						entity.getPersistentData().putDouble("BuyingYes", (entity.getPersistentData().getDoubleOr("BuyingYes", 0) + 1));
						if (entity.getPersistentData().getDoubleOr("BuyingYes", 0) == 1) {
							TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger + 1;
							TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
						} else if (entity.getPersistentData().getDoubleOr("BuyingYes", 0) >= 37) {
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_Peasents_Carry_Amount,
										(int) ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Carry_Amount) : 0) + 1));
							if (!(findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 3)).level().isClientSide())
								(findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 3)).discard();
							entity.getPersistentData().putDouble("BuyingYes", 0);
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
							if (entity instanceof DarkSoldierEntity _datEntSetL)
								_datEntSetL.getEntityData().set(DarkSoldierEntity.DATA_notgonnarob, true);
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_StopRobbing, 1);
						}
					}
				} else if ((entity instanceof DarkSoldierEntity _datEntL111 && _datEntL111.getEntityData().get(DarkSoldierEntity.DATA_notgonnarob)) == true) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
					entity.getPersistentData().putDouble("DonTrob", (entity.getPersistentData().getDoubleOr("DonTrob", 0) + 1));
					if (entity.getPersistentData().getDoubleOr("DonTrob", 0) >= 60) {
						if (entity instanceof DarkSoldierEntity _datEntSetL)
							_datEntSetL.getEntityData().set(DarkSoldierEntity.DATA_notgonnarob, false);
						entity.getPersistentData().putDouble("DonTrob", 0);
					}
				}
			}
		} else if (!world.getEntitiesOfClass(Civilian2Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
			if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(48 / 2d), e -> true).isEmpty())) {
				if ((entity instanceof DarkSoldierEntity _datEntL120 && _datEntL120.getEntityData().get(DarkSoldierEntity.DATA_notgonnarob)) == false) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 10);
					if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_actionstate) : 0) == 10) {
						entity.getPersistentData().putDouble("BuyingYes", (entity.getPersistentData().getDoubleOr("BuyingYes", 0) + 1));
						if (entity.getPersistentData().getDoubleOr("BuyingYes", 0) == 1) {
							TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger + 1;
							TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
						} else if (entity.getPersistentData().getDoubleOr("BuyingYes", 0) >= 37) {
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_Peasents_Amount2, (int) ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount2) : 0) + 1));
							entity.getPersistentData().putDouble("BuyingYes", 0);
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
							if (entity instanceof DarkSoldierEntity _datEntSetL)
								_datEntSetL.getEntityData().set(DarkSoldierEntity.DATA_notgonnarob, true);
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_StopRobbing, 1);
							if (!(findEntityInWorldRange(world, Civilian2Entity.class, x, y, z, 3)).level().isClientSide())
								(findEntityInWorldRange(world, Civilian2Entity.class, x, y, z, 3)).discard();
						}
					}
				} else if ((entity instanceof DarkSoldierEntity _datEntL135 && _datEntL135.getEntityData().get(DarkSoldierEntity.DATA_notgonnarob)) == true) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
					entity.getPersistentData().putDouble("DonTrob", (entity.getPersistentData().getDoubleOr("DonTrob", 0) + 1));
					if (entity.getPersistentData().getDoubleOr("DonTrob", 0) >= 60) {
						if (entity instanceof DarkSoldierEntity _datEntSetL)
							_datEntSetL.getEntityData().set(DarkSoldierEntity.DATA_notgonnarob, false);
						entity.getPersistentData().putDouble("DonTrob", 0);
					}
				}
			}
		} else if (!world.getEntitiesOfClass(Civilian3Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
			if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(48 / 2d), e -> true).isEmpty())) {
				if ((entity instanceof DarkSoldierEntity _datEntL144 && _datEntL144.getEntityData().get(DarkSoldierEntity.DATA_notgonnarob)) == false) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 10);
					if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_actionstate) : 0) == 10) {
						entity.getPersistentData().putDouble("BuyingYes", (entity.getPersistentData().getDoubleOr("BuyingYes", 0) + 1));
						if (entity.getPersistentData().getDoubleOr("BuyingYes", 0) == 1) {
							TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger + 1;
							TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
						} else if (entity.getPersistentData().getDoubleOr("BuyingYes", 0) >= 37) {
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_Peasents_Amount3, (int) ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount3) : 0) + 1));
							entity.getPersistentData().putDouble("BuyingYes", 0);
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
							if (entity instanceof DarkSoldierEntity _datEntSetL)
								_datEntSetL.getEntityData().set(DarkSoldierEntity.DATA_notgonnarob, true);
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_StopRobbing, 1);
							if (!(findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 3)).level().isClientSide())
								(findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 3)).discard();
						}
					}
				} else if ((entity instanceof DarkSoldierEntity _datEntL159 && _datEntL159.getEntityData().get(DarkSoldierEntity.DATA_notgonnarob)) == true) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
					entity.getPersistentData().putDouble("DonTrob", (entity.getPersistentData().getDoubleOr("DonTrob", 0) + 1));
					if (entity.getPersistentData().getDoubleOr("DonTrob", 0) >= 60) {
						if (entity instanceof DarkSoldierEntity _datEntSetL)
							_datEntSetL.getEntityData().set(DarkSoldierEntity.DATA_notgonnarob, false);
						entity.getPersistentData().putDouble("DonTrob", 0);
					}
				}
			}
		} else if (!world.getEntitiesOfClass(Civilian4Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
			if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(48 / 2d), e -> true).isEmpty())) {
				if ((entity instanceof DarkSoldierEntity _datEntL168 && _datEntL168.getEntityData().get(DarkSoldierEntity.DATA_notgonnarob)) == false) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 10);
					if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_actionstate) : 0) == 10) {
						entity.getPersistentData().putDouble("BuyingYes", (entity.getPersistentData().getDoubleOr("BuyingYes", 0) + 1));
						if (entity.getPersistentData().getDoubleOr("BuyingYes", 0) == 1) {
							TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger + 1;
							TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
						} else if (entity.getPersistentData().getDoubleOr("BuyingYes", 0) >= 37) {
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_Peasents_Amount4, (int) ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount4) : 0) + 1));
							entity.getPersistentData().putDouble("BuyingYes", 0);
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
							if (entity instanceof DarkSoldierEntity _datEntSetL)
								_datEntSetL.getEntityData().set(DarkSoldierEntity.DATA_notgonnarob, true);
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_StopRobbing, 1);
							if (!(findEntityInWorldRange(world, Civilian4Entity.class, x, y, z, 3)).level().isClientSide())
								(findEntityInWorldRange(world, Civilian4Entity.class, x, y, z, 3)).discard();
						}
					}
				} else if ((entity instanceof DarkSoldierEntity _datEntL183 && _datEntL183.getEntityData().get(DarkSoldierEntity.DATA_notgonnarob)) == true) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
					entity.getPersistentData().putDouble("DonTrob", (entity.getPersistentData().getDoubleOr("DonTrob", 0) + 1));
					if (entity.getPersistentData().getDoubleOr("DonTrob", 0) >= 60) {
						if (entity instanceof DarkSoldierEntity _datEntSetL)
							_datEntSetL.getEntityData().set(DarkSoldierEntity.DATA_notgonnarob, false);
						entity.getPersistentData().putDouble("DonTrob", 0);
					}
				}
			}
		} else if (!world.getEntitiesOfClass(Civilian5Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
			if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(48 / 2d), e -> true).isEmpty())) {
				if ((entity instanceof DarkSoldierEntity _datEntL192 && _datEntL192.getEntityData().get(DarkSoldierEntity.DATA_notgonnarob)) == false) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 10);
					if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_actionstate) : 0) == 10) {
						entity.getPersistentData().putDouble("BuyingYes", (entity.getPersistentData().getDoubleOr("BuyingYes", 0) + 1));
						if (entity.getPersistentData().getDoubleOr("BuyingYes", 0) == 1) {
							TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger + 1;
							TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
						} else if (entity.getPersistentData().getDoubleOr("BuyingYes", 0) >= 37) {
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_Peasents_Amount5, (int) ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount5) : 0) + 1));
							entity.getPersistentData().putDouble("BuyingYes", 0);
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
							if (entity instanceof DarkSoldierEntity _datEntSetL)
								_datEntSetL.getEntityData().set(DarkSoldierEntity.DATA_notgonnarob, true);
							if (entity instanceof DarkSoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_StopRobbing, 1);
							if (!(findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 3)).level().isClientSide())
								(findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 3)).discard();
						}
					}
				} else if ((entity instanceof DarkSoldierEntity _datEntL207 && _datEntL207.getEntityData().get(DarkSoldierEntity.DATA_notgonnarob)) == true) {
					if (entity instanceof DarkSoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 0);
					entity.getPersistentData().putDouble("DonTrob", (entity.getPersistentData().getDoubleOr("DonTrob", 0) + 1));
					if (entity.getPersistentData().getDoubleOr("DonTrob", 0) >= 60) {
						if (entity instanceof DarkSoldierEntity _datEntSetL)
							_datEntSetL.getEntityData().set(DarkSoldierEntity.DATA_notgonnarob, false);
						entity.getPersistentData().putDouble("DonTrob", 0);
					}
				}
			}
		}
		if (!world.getEntitiesOfClass(Civilian1Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)).getX()), ((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)).getY()),
							((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)).getZ()), 1.2);
			}
		} else if (!world.getEntitiesOfClass(Civilian2Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Civilian2Entity.class, x, y, z, 7)).getX()), ((findEntityInWorldRange(world, Civilian2Entity.class, x, y, z, 7)).getY()),
							((findEntityInWorldRange(world, Civilian2Entity.class, x, y, z, 7)).getZ()), 1.2);
			}
		} else if (!world.getEntitiesOfClass(Civilian3Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 7)).getX()), ((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 7)).getY()),
							((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 7)).getZ()), 1.2);
			}
		} else if (!world.getEntitiesOfClass(Civilian4Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Civilian4Entity.class, x, y, z, 7)).getX()), ((findEntityInWorldRange(world, Civilian4Entity.class, x, y, z, 7)).getY()),
							((findEntityInWorldRange(world, Civilian4Entity.class, x, y, z, 7)).getZ()), 1.2);
			}
		} else if (!world.getEntitiesOfClass(Civilian5Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 7)).getX()), ((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 7)).getY()),
							((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 7)).getZ()), 1.2);
			}
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).Attack == true) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
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