package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.init.TheMiddleAgesModEntities;
import net.mcreator.themiddleages.entity.*;

import java.util.Comparator;

public class Civilian2OnEntityUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		boolean NotRobbing = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double targetX = 0;
		double targetY = 0;
		double targetZ = 0;
		Entity targett = null;
		entity.setCustomName(Component.literal("§l" + ("§a" + "Mr. William " + "" + "§b" + "(PEASANT)")));
		if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_TimeToDie) : 0) == 1) {
			entity.getPersistentData().putDouble("DeathTimeTicks", (entity.getPersistentData().getDoubleOr("DeathTimeTicks", 0) + 1));
			if (entity.getPersistentData().getDoubleOr("DeathTimeTicks", 0) > 20) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:dying_sound")), SoundSource.NEUTRAL, 1, (float) 0.7);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:dying_sound")), SoundSource.NEUTRAL, 1, (float) 0.7, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 0.5);
				entity.getPersistentData().putDouble("DeathTimeTicks", 0);
			}
		}
		if (entity.getPersistentData().getDoubleOr("TimeUntilDead", 0) >= 10000) {
			if (entity instanceof Civilian2Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian2Entity.DATA_TimeToDie, 1);
			entity.getPersistentData().putDouble("TimeUntilDead", 0);
			TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians - 1;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_hungry) : 0) > 0) {
			entity.getPersistentData().putDouble("WaitForHunger", (entity.getPersistentData().getDoubleOr("WaitForHunger", 0) + 1));
			entity.getPersistentData().putDouble("TimeUntilDead", 0);
		} else if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_hungry) : 0) <= 0) {
			entity.setCustomName(Component.literal("§l" + ("§a" + "Mr. William " + "" + ("§b" + "(PEASANT)" + "" + "§2" + "[HUNGRY]"))));
			entity.getPersistentData().putDouble("TimeUntilDead", (entity.getPersistentData().getDoubleOr("TimeUntilDead", 0) + 1));
		}
		if (entity.getPersistentData().getDoubleOr("WaitForHunger", 0) > 250) {
			if (entity instanceof Civilian2Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian2Entity.DATA_hungry, (int) ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_hungry) : 0) - 1));
			entity.getPersistentData().putDouble("WaitForHunger", 0);
		}
		if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_hungry) : 0) < 1) {
			if (!world.getEntitiesOfClass(BreadSellerEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
				if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Eat) : 0) == 0) {
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_buy, 1);
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, false));
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 3)).getX()), ((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 3)).getY()),
						((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 3)).getZ())));
			} else if (!world.getEntitiesOfClass(BreadSellerEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(128 / 2d), e -> true).isEmpty()) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 128)).getX()), ((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 128)).getY()),
							((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 128)).getZ()), 1);
			}
			if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_buy) : 0) == 1) {
				entity.getPersistentData().putDouble("buyingTicks", (entity.getPersistentData().getDoubleOr("buyingTicks", 0) + 1));
			}
			if (entity.getPersistentData().getDoubleOr("buyingTicks", 0) == 10) {
				TheMiddleAgesModVariables.MapVariables.get(world).Wealth = TheMiddleAgesModVariables.MapVariables.get(world).Wealth + 3;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 2, 1, false);
					}
				}
			} else if (entity.getPersistentData().getDoubleOr("buyingTicks", 0) >= 37) {
				if (entity instanceof Civilian2Entity _datEntSetI)
					_datEntSetI.getEntityData().set(Civilian2Entity.DATA_buy, 0);
				entity.getPersistentData().putDouble("WaitingTicks", (entity.getPersistentData().getDoubleOr("WaitingTicks", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("WaitingTicks", 0) >= 20) {
					if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_buy) : 0) == 0) {
						if (entity instanceof Civilian2Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Eat, 1);
					}
					entity.getPersistentData().putDouble("buyingTicks", 0);
					entity.getPersistentData().putDouble("WaitingTicks", 0);
				}
			}
			if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Eat) : 0) == 1) {
				entity.getPersistentData().putDouble("EatingIsOnTicks", (entity.getPersistentData().getDoubleOr("EatingIsOnTicks", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("EatingIsOnTicks", 0) == 4) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else if (entity.getPersistentData().getDoubleOr("EatingIsOnTicks", 0) >= 21) {
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Eat, 0);
					entity.getPersistentData().putDouble("EatingIsOnTicks", 0);
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_hungry, 20);
				}
			}
		} else {
			if (entity instanceof Civilian2Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Eat, 0);
			if (entity instanceof Civilian2Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian2Entity.DATA_buy, 0);
		}
		if (!world.isClientSide()) {
			if (entity instanceof LivingEntity _livEnt80 && _livEnt80.isSleeping()) {
				if (entity instanceof Civilian2Entity _datEntSetL)
					_datEntSetL.getEntityData().set(Civilian2Entity.DATA_wasDoing, true);
				entity.getPersistentData().putDouble("SleepTicks", (entity.getPersistentData().getDoubleOr("SleepTicks", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("SleepTicks", 0) > 4) {
					entity.getPersistentData().putDouble("SleepTicks", 0);
				}
			} else {
				if ((entity instanceof Civilian2Entity _datEntL86 && _datEntL86.getEntityData().get(Civilian2Entity.DATA_wasDoing)) == true) {
					if (world instanceof Level _lvl87 && _lvl87.isBrightOutside()) {
						if (entity instanceof Civilian2Entity _datEntSetL)
							_datEntSetL.getEntityData().set(Civilian2Entity.DATA_stillDoing, true);
						entity.getPersistentData().putDouble("tickWake", (entity.getPersistentData().getDoubleOr("tickWake", 0) + 1));
						if (entity.getPersistentData().getDoubleOr("tickWake", 0) == 2) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:yawn_male")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:yawn_male")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else if (entity.getPersistentData().getDoubleOr("tickWake", 0) >= 30) {
							if (entity instanceof Civilian2Entity _datEntSetL)
								_datEntSetL.getEntityData().set(Civilian2Entity.DATA_stillDoing, false);
							if (entity instanceof Civilian2Entity _datEntSetL)
								_datEntSetL.getEntityData().set(Civilian2Entity.DATA_wasDoing, false);
							entity.getPersistentData().putDouble("tickWake", 0);
						}
					}
				}
			}
		}
		if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_giveThanks) : 0) == 1) {
			if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Meet) : 0) == 1) {
				if (!world.getEntitiesOfClass(Civilian1Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, false));
					if ((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, false));
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)).getX()), ((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)).getY()),
							((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)).getZ())));
					(findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)).lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())));
					if ((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)) instanceof Civilian1Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian1Entity.DATA_giveThanks, 1);
				}
				entity.getPersistentData().putDouble("meeting", (entity.getPersistentData().getDoubleOr("meeting", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("meeting", 0) == 3) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, (float) 1.3);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
						}
					}
				} else if (entity.getPersistentData().getDoubleOr("meeting", 0) >= 20) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entity.getX() + 9), (entity.getY()), (entity.getZ() + 9), 1);
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_giveThanks, 0);
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Meet, 0);
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_GraveCarry, 1);
					if (!world.getEntitiesOfClass(Civilian1Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
						if ((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)) instanceof Civilian1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian1Entity.DATA_giveThanks, 0);
					}
					entity.getPersistentData().putDouble("meeting", 0);
				}
			} else if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Meet) : 0) == 2) {
				if (!world.getEntitiesOfClass(Civilian3Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, false));
					if ((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 7)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, false));
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 7)).getX()), ((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 7)).getY()),
							((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 7)).getZ())));
					(findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 7)).lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())));
					if ((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 7)) instanceof Civilian3Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian3Entity.DATA_giveThanks, 1);
				}
				entity.getPersistentData().putDouble("meeting", (entity.getPersistentData().getDoubleOr("meeting", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("meeting", 0) == 3) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, (float) 1.3);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
						}
					}
				} else if (entity.getPersistentData().getDoubleOr("meeting", 0) >= 20) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeAllEffects();
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entity.getX() + 9), (entity.getY()), (entity.getZ() + 9), 1);
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_giveThanks, 0);
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_GraveCarry, 1);
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Meet, 0);
					if (!world.getEntitiesOfClass(Civilian3Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
						if ((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 7)) instanceof Civilian3Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian3Entity.DATA_giveThanks, 0);
					}
					entity.getPersistentData().putDouble("meeting", 0);
				}
			} else if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Meet) : 0) == 3) {
				if (!world.getEntitiesOfClass(Civilian5Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, false));
					if ((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 7)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, false));
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 7)).getX()), ((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 7)).getY()),
							((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 7)).getZ())));
					(findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 7)).lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())));
					if ((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 7)) instanceof Civilian5Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian5Entity.DATA_giveThanks, 1);
				}
				entity.getPersistentData().putDouble("meeting", (entity.getPersistentData().getDoubleOr("meeting", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("meeting", 0) == 3) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, (float) 1.3);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
						}
					}
				} else if (entity.getPersistentData().getDoubleOr("meeting", 0) >= 20) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeAllEffects();
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entity.getX() + 9), (entity.getY()), (entity.getZ() + 9), 1);
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_giveThanks, 0);
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_GraveCarry, 1);
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Meet, 0);
					if (!world.getEntitiesOfClass(Civilian3Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
						if ((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 7)) instanceof Civilian5Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian5Entity.DATA_giveThanks, 0);
					}
					entity.getPersistentData().putDouble("meeting", 0);
				}
			}
		}
		if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_GraveCarry) : 0) == 1) {
			entity.getPersistentData().putDouble("CurrentlyInMeeting", (entity.getPersistentData().getDoubleOr("CurrentlyInMeeting", 0) + 1));
			if (entity.getPersistentData().getDoubleOr("CurrentlyInMeeting", 0) > 200) {
				entity.getPersistentData().putDouble("CurrentlyInMeeting", 0);
				if (entity instanceof Civilian2Entity _datEntSetI)
					_datEntSetI.getEntityData().set(Civilian2Entity.DATA_GraveCarry, 0);
			}
		}
		if ((world instanceof Level _level211 ? _level211.getDefaultClockTime() : 0) == 50) {
			if (entity instanceof Civilian2Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian2Entity.DATA_hungry, 0);
		} else if ((world instanceof Level _level213 ? _level213.getDefaultClockTime() : 0) > 300 && (world instanceof Level _level214 ? _level214.getDefaultClockTime() : 0) < 1600) {
			if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Meet) : 0) == 0) {
				if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_GraveCarry) : 0) == 0) {
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Meet, Mth.nextInt(RandomSource.create(), 1, 3));
				}
			}
			if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Meet) : 0) == 1) {
				if (!world.getEntitiesOfClass(Civilian1Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
					if (!((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Dontdo) : 0) == 1)) {
						if (entity instanceof Civilian2Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian2Entity.DATA_giveThanks, 1);
					}
				} else if (!world.getEntitiesOfClass(Civilian1Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(32 / 2d), e -> true).isEmpty()) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 32)).getX()), (entity.getY()), ((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 32)).getZ()), 1);
				} else {
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Meet, 0);
				}
			} else if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Meet) : 0) == 2) {
				if (!world.getEntitiesOfClass(Civilian3Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
					if (!((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Dontdo) : 0) == 1)) {
						if (entity instanceof Civilian2Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian2Entity.DATA_giveThanks, 1);
					}
				} else if (!world.getEntitiesOfClass(Civilian3Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(32 / 2d), e -> true).isEmpty()) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 32)).getX()), (entity.getY()), ((findEntityInWorldRange(world, Civilian3Entity.class, x, y, z, 32)).getZ()), 1);
				} else {
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Meet, 0);
				}
			} else if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Meet) : 0) == 3) {
				if (!world.getEntitiesOfClass(Civilian5Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
					if (!((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Dontdo) : 0) == 1)) {
						if (entity instanceof Civilian2Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian2Entity.DATA_giveThanks, 1);
					}
				} else if (!world.getEntitiesOfClass(Civilian5Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(32 / 2d), e -> true).isEmpty()) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 32)).getX()), (entity.getY()), ((findEntityInWorldRange(world, Civilian5Entity.class, x, y, z, 32)).getZ()), 1);
				} else {
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Meet, 0);
				}
			}
		} else {
			if ((world instanceof Level _level255 ? _level255.getDefaultClockTime() : 0) > 3300 && (world instanceof Level _level256 ? _level256.getDefaultClockTime() : 0) < 13500) {
				if (!world.getEntitiesOfClass(MadievalHorseEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
					if (((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 3)) instanceof MadievalHorseEntity _datEntI ? _datEntI.getEntityData().get(MadievalHorseEntity.DATA_nowWhat) : 0) == 1) {
						if (!world.getEntitiesOfClass(PassengerCartEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
							if (!(findEntityInWorldRange(world, PassengerCartEntity.class, x, y, z, 4)).level().isClientSide())
								(findEntityInWorldRange(world, PassengerCartEntity.class, x, y, z, 4)).discard();
						}
						if (!world.getEntitiesOfClass(MadievalHorseEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
							if (!(findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 4)).level().isClientSide())
								(findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 4)).discard();
						}
						if (!entity.level().isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = TheMiddleAgesModEntities.PASSENGER_CART_RIDING.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				} else if (!world.getEntitiesOfClass(MadievalHorseEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(128 / 2d), e -> true).isEmpty()) {
					if (((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 64)) instanceof MadievalHorseEntity _datEntI ? _datEntI.getEntityData().get(MadievalHorseEntity.DATA_nowWhat) : 0) == 1) {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().moveTo(((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 64)).getX()), ((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 64)).getY()),
									((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 64)).getZ()), 1);
					}
				}
				if (entity instanceof LivingEntity _livEnt278 && _livEnt278.isSleeping()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, false));
				}
				if ((entity instanceof Civilian2Entity _datEntL280 && _datEntL280.getEntityData().get(Civilian2Entity.DATA_notRobbingAgain)) == false) {
					if (!world.getEntitiesOfClass(DarkSoldierEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()
							&& !(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(12 / 2d), e -> true).isEmpty())) {
						if ((findEntityInWorldRange(world, DarkSoldierEntity.class, x, y, z, 3)) instanceof DarkSoldierEntity _datEntSetI)
							_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 10);
						if (((findEntityInWorldRange(world, DarkSoldierEntity.class, x, y, z, 3)) instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_actionstate) : 0) == 10) {
							if (entity instanceof Civilian2Entity _datEntSetI)
								_datEntSetI.getEntityData().set(Civilian2Entity.DATA_buy, 1);
							entity.getPersistentData().putDouble("GettingStole", (entity.getPersistentData().getDoubleOr("GettingStole", 0) + 1));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 20, 255, false, false));
							if (entity.getPersistentData().getDoubleOr("GettingStole", 0) == 4) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
							}
							if (entity.getPersistentData().getDoubleOr("GettingStole", 0) >= 60) {
								if (entity instanceof Civilian2Entity _datEntSetL)
									_datEntSetL.getEntityData().set(Civilian2Entity.DATA_notRobbingAgain, true);
								if (entity instanceof Civilian2Entity _datEntSetI)
									_datEntSetI.getEntityData().set(Civilian2Entity.DATA_buy, 0);
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(MobEffects.SLOWNESS);
								entity.getPersistentData().putDouble("GettingStole", 0);
								if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(245 / 2d), e -> true).isEmpty()) {
									if (entity instanceof Mob _entity)
										_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Player.class, x, y, z, 245)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 245)).getY()),
												((findEntityInWorldRange(world, Player.class, x, y, z, 245)).getZ()), 1);
									if (entity instanceof Civilian2Entity _datEntSetI)
										_datEntSetI.getEntityData().set(Civilian2Entity.DATA_moneyGive, 1);
								}
							}
						}
					}
				}
				if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_moneyGive) : 0) == 1) {
					if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
						entity.getPersistentData().putDouble("Stolen", (entity.getPersistentData().getDoubleOr("Stolen", 0) + 1));
						if (entity.getPersistentData().getDoubleOr("Stolen", 0) == 10) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, (float) 0.5, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
								}
							}
							if (world instanceof ServerLevel _level) {
								_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Civilian_William> H.. Hey.. MR.King.."), false);
							}
						}
						if (entity.getPersistentData().getDoubleOr("Stolen", 0) >= 50) {
							if (entity instanceof Mob _entity)
								_entity.getNavigation().moveTo((entity.getX() + 7), (entity.getY()), (entity.getZ() + 7), 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, (float) 0.5, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
								}
							}
							if (world instanceof ServerLevel _level) {
								_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Civilian_William> The Dark Warriors Stole My Emeralds And My Vegetables"), false);
							}
							entity.getPersistentData().putDouble("Stolen", 0);
							if (entity instanceof Civilian2Entity _datEntSetI)
								_datEntSetI.getEntityData().set(Civilian2Entity.DATA_moneyGive, 0);
							if (entity instanceof Civilian2Entity _datEntSetI)
								_datEntSetI.getEntityData().set(Civilian2Entity.DATA_buy, 0);
						}
					}
				}
				if ((entity instanceof Civilian2Entity _datEntL324 && _datEntL324.getEntityData().get(Civilian2Entity.DATA_notRobbingAgain)) == true) {
					entity.getPersistentData().putDouble("NotGonnaBeRobbed", (entity.getPersistentData().getDoubleOr("NotGonnaBeRobbed", 0) + 1));
					if (entity.getPersistentData().getDoubleOr("NotGonnaBeRobbed", 0) >= 60) {
						entity.getPersistentData().putDouble("NotGonnaBeRobbed", 0);
						if (entity instanceof Civilian2Entity _datEntSetL)
							_datEntSetL.getEntityData().set(Civilian2Entity.DATA_notRobbingAgain, false);
					}
				}
			}
		}
		if (entity instanceof net.minecraft.world.entity.Mob mobEntity) {
			net.minecraft.world.level.Level level = mobEntity.level();
			// =========================================================
			// NIGHT CHECK
			// =========================================================
			int skyDarkness = level.getSkyDarken();
			boolean isNight = skyDarkness >= 10;
			boolean isCustomSleeping = mobEntity.getPersistentData().getBoolean("sleeping").orElse(false);
			// =========================================================
			// NIGHT
			// =========================================================
			if (isNight) {
				// Already sleeping
				if (mobEntity.isSleeping() || isCustomSleeping) {
					mobEntity.getNavigation().stop();
					return;
				}
				// =====================================================
				// SETTINGS
				// =====================================================
				int radius = 32;
				long currentTime = level.getGameTime();
				// =====================================================
				// WAIT TIMER
				// =====================================================
				long waitStart = mobEntity.getPersistentData().getLong("bed_wait_start").orElse(0L);
				// Start waiting timer if it doesn't exist
				if (waitStart <= 0L) {
					mobEntity.getPersistentData().putLong("bed_wait_start", currentTime);
					waitStart = currentTime;
				}
				// =====================================================
				// IF WAITED 2-3 MINUTES -> SLEEP ON FLOOR
				// =====================================================
				long waitedTime = currentTime - waitStart;
				// Random time between 2 and 3 minutes
				long waitLimit = 2400L + Math.abs(mobEntity.getId() * 7919L) % 1200L;
				if (waitedTime >= waitLimit) {
					// Stop moving
					mobEntity.getNavigation().stop();
					// Sleep on floor
					net.minecraft.core.BlockPos floorPos = mobEntity.blockPosition();
					mobEntity.startSleeping(floorPos);
					mobEntity.getPersistentData().putBoolean("sleeping", true);
					return;
				}
				// =====================================================
				// FIND FREE BED
				// =====================================================
				net.minecraft.core.BlockPos mobPos = mobEntity.blockPosition();
				net.minecraft.core.BlockPos targetBedPos = null;
				for (int bx = -radius; bx <= radius && targetBedPos == null; bx++) {
					for (int by = -5; by <= 5 && targetBedPos == null; by++) {
						for (int bz = -radius; bz <= radius; bz++) {
							net.minecraft.core.BlockPos checkPos = mobPos.offset(bx, by, bz);
							net.minecraft.world.level.block.state.BlockState state = level.getBlockState(checkPos);
							// Must be a bed
							if (state.getBlock() instanceof net.minecraft.world.level.block.BedBlock) {
								// Must be HEAD
								if (state.hasProperty(net.minecraft.world.level.block.BedBlock.PART) && state.getValue(net.minecraft.world.level.block.BedBlock.PART) == net.minecraft.world.level.block.state.properties.BedPart.HEAD) {
									boolean occupied = false;
									if (state.hasProperty(net.minecraft.world.level.block.BedBlock.OCCUPIED)) {
										occupied = state.getValue(net.minecraft.world.level.block.BedBlock.OCCUPIED);
									}
									// FREE BED
									if (!occupied) {
										targetBedPos = checkPos;
										break;
									}
								}
							}
						}
					}
				}
				// =====================================================
				// BED FOUND
				// =====================================================
				if (targetBedPos != null) {
					// We found a bed, reset waiting timer
					mobEntity.getPersistentData().putLong("bed_wait_start", currentTime);
					double bedX = targetBedPos.getX() + 0.5D;
					double bedY = targetBedPos.getY();
					double bedZ = targetBedPos.getZ() + 0.5D;
					double distanceSq = mobEntity.distanceToSqr(bedX, bedY, bedZ);
					// =================================================
					// CLOSE TO BED
					// =================================================
					if (distanceSq <= 3.0D) {
						net.minecraft.world.level.block.state.BlockState bedState = level.getBlockState(targetBedPos);
						// =================================================
						// BED STILL EXISTS
						// =================================================
						if (bedState.getBlock() instanceof net.minecraft.world.level.block.BedBlock) {
							boolean occupied = false;
							if (bedState.hasProperty(net.minecraft.world.level.block.BedBlock.OCCUPIED)) {
								occupied = bedState.getValue(net.minecraft.world.level.block.BedBlock.OCCUPIED);
							}
							// =================================================
							// BED FREE -> SLEEP
							// =================================================
							if (!occupied) {
								mobEntity.getNavigation().stop();
								mobEntity.startSleeping(targetBedPos);
								mobEntity.getPersistentData().putBoolean("sleeping", true);
								return;
							}
							// =================================================
							// BED GOT OCCUPIED
							// =================================================
							else {
								// DO NOT SLEEP HERE
								// Immediately search again next tick
								mobEntity.getNavigation().stop();
								return;
							}
						}
					}
					// =================================================
					// WALK TO BED
					// =================================================
					else {
						// IMPORTANT:
						// Check if target bed is STILL FREE
						net.minecraft.world.level.block.state.BlockState currentBedState = level.getBlockState(targetBedPos);
						boolean bedOccupied = false;
						if (currentBedState.getBlock() instanceof net.minecraft.world.level.block.BedBlock) {
							if (currentBedState.hasProperty(net.minecraft.world.level.block.BedBlock.OCCUPIED)) {
								bedOccupied = currentBedState.getValue(net.minecraft.world.level.block.BedBlock.OCCUPIED);
							}
						}
						// =================================================
						// BED BECAME OCCUPIED
						// =================================================
						if (bedOccupied) {
							// Stop immediately.
							// On the next tick a NEW bed will be searched.
							mobEntity.getNavigation().stop();
							return;
						}
						// =================================================
						// BED STILL FREE -> KEEP WALKING
						// =================================================
						mobEntity.getNavigation().moveTo(bedX, bedY, bedZ, 1.1D);
					}
				}
				// =====================================================
				// NO BED FOUND
				// =====================================================
				else {
					// No bed available.
					// Keep waiting until the 2-3 minute timer expires.
					mobEntity.getNavigation().stop();
				}
			}
			// =========================================================
			// DAYTIME -> WAKE UP
			// =========================================================
			else {
				if (mobEntity.isSleeping() || isCustomSleeping) {
					mobEntity.stopSleeping();
					mobEntity.getPersistentData().putBoolean("sleeping", false);
					mobEntity.getPersistentData().putLong("bed_wait_start", 0L);
					mobEntity.getNavigation().stop();
				}
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}