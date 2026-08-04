package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.themiddleages.init.TheMiddleAgesModParticleTypes;
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
		if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_TimeToDie) : 0) == 1) {
			entity.getPersistentData().putDouble("DeathTimeTicks", (entity.getPersistentData().getDouble("DeathTimeTicks") + 1));
			if (entity.getPersistentData().getDouble("DeathTimeTicks") > 20) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("the_middle_ages:dying_sound")), SoundSource.NEUTRAL, 1, (float) 0.7);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("the_middle_ages:dying_sound")), SoundSource.NEUTRAL, 1, (float) 0.7, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 0.5);
				entity.getPersistentData().putDouble("DeathTimeTicks", 0);
			}
		}
		if (entity.getPersistentData().getDouble("TimeUntilDead") >= 450) {
			if (entity instanceof Civilian2Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian2Entity.DATA_TimeToDie, 1);
		}
		if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_hungry) : 0) > 0) {
			entity.getPersistentData().putDouble("WaitForHunger", (entity.getPersistentData().getDouble("WaitForHunger") + 1));
			entity.getPersistentData().putDouble("TimeUntilDead", 0);
		} else if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_hungry) : 0) <= 0) {
			entity.getPersistentData().putDouble("TimeUntilDead", (entity.getPersistentData().getDouble("TimeUntilDead") + 1));
		}
		if (entity.getPersistentData().getDouble("WaitForHunger") == 250) {
			if (entity instanceof Civilian2Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian2Entity.DATA_hungry, (int) ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_hungry) : 0) - 1));
			entity.getPersistentData().putDouble("WaitForHunger", 0);
		}
		if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_hungry) : 0) < 1) {
			if (!world.getEntitiesOfClass(BreadSellerEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
				if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Eat) : 0) == 0) {
					if (entity instanceof Civilian2Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian2Entity.DATA_buy, 1);
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 255, false, false));
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 3)).getX()), ((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 3)).getY()),
						((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 3)).getZ())));
			} else if (!world.getEntitiesOfClass(BreadSellerEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(64 / 2d), e -> true).isEmpty()) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 64)).getX()), ((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 64)).getY()),
							((findEntityInWorldRange(world, BreadSellerEntity.class, x, y, z, 64)).getZ()), 1);
			}
			if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_buy) : 0) == 1) {
				entity.getPersistentData().putDouble("buyingTicks", (entity.getPersistentData().getDouble("buyingTicks") + 1));
			}
			if (entity.getPersistentData().getDouble("buyingTicks") == 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.item.pickup")), SoundSource.NEUTRAL, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.item.pickup")), SoundSource.NEUTRAL, 2, 1, false);
					}
				}
			} else if (entity.getPersistentData().getDouble("buyingTicks") >= 37) {
				if (entity instanceof Civilian2Entity _datEntSetI)
					_datEntSetI.getEntityData().set(Civilian2Entity.DATA_buy, 0);
				entity.getPersistentData().putDouble("WaitingTicks", (entity.getPersistentData().getDouble("WaitingTicks") + 1));
				if (entity.getPersistentData().getDouble("WaitingTicks") >= 20) {
					if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_buy) : 0) == 0) {
						if (entity instanceof Civilian2Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Eat, 1);
					}
					entity.getPersistentData().putDouble("buyingTicks", 0);
					entity.getPersistentData().putDouble("WaitingTicks", 0);
				}
			}
			if ((entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Eat) : 0) == 1) {
				entity.getPersistentData().putDouble("EatingIsOnTicks", (entity.getPersistentData().getDouble("EatingIsOnTicks") + 1));
				if (entity.getPersistentData().getDouble("EatingIsOnTicks") == 4) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.eat")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else if (entity.getPersistentData().getDouble("EatingIsOnTicks") >= 21) {
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
			if (entity instanceof LivingEntity _livEnt70 && _livEnt70.isSleeping()) {
				if (entity instanceof Civilian2Entity _datEntSetL)
					_datEntSetL.getEntityData().set(Civilian2Entity.DATA_wasDoing, true);
				entity.getPersistentData().putDouble("SleepTicks", (entity.getPersistentData().getDouble("SleepTicks") + 1));
				if (entity.getPersistentData().getDouble("SleepTicks") > 4) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (TheMiddleAgesModParticleTypes.SLEEPING.get()), x, y, z, 1, 0, (entity.getBbWidth() / 2d), 0, 0.12);
					entity.getPersistentData().putDouble("SleepTicks", 0);
				}
			} else {
				if ((entity instanceof Civilian2Entity _datEntL78 && _datEntL78.getEntityData().get(Civilian2Entity.DATA_wasDoing)) == true) {
					if (world instanceof Level _lvl79 && _lvl79.isDay()) {
						if (entity instanceof Civilian2Entity _datEntSetL)
							_datEntSetL.getEntityData().set(Civilian2Entity.DATA_stillDoing, true);
						entity.getPersistentData().putDouble("tickWake", (entity.getPersistentData().getDouble("tickWake") + 1));
						if (entity.getPersistentData().getDouble("tickWake") == 2) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("the_middle_ages:yawn_male")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("the_middle_ages:yawn_male")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else if (entity.getPersistentData().getDouble("tickWake") >= 30) {
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
		if (!world.getEntitiesOfClass(MadievalHorseEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(2 / 2d), e -> true).isEmpty()) {
			if (!world.getEntitiesOfClass(PassengerCartEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
				entity.startRiding((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 2)));
			}
		} else if (!world.getEntitiesOfClass(MadievalHorseEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(16 / 2d), e -> true).isEmpty()) {
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo(((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 16)).getX()), ((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 16)).getY()),
						((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 16)).getZ()), 1);
		}
		if (entity instanceof LivingEntity livingEntity && !livingEntity.level().isClientSide()) {
			// Check if the entity is not already sleeping
			if (!livingEntity.isSleeping()) {
				// Look for a nearby bed block within a 6 block radius
				BlockPos entityPos = livingEntity.blockPosition();
				BlockPos targetBedPos = null;
				for (BlockPos pos : BlockPos.betweenClosed(entityPos.offset(-6, -3, -6), entityPos.offset(6, 3, 6))) {
					if (livingEntity.level().getBlockState(pos).is(net.minecraft.tags.BlockTags.BEDS)) {
						targetBedPos = pos.immutable();
						break;
					}
				}
				// If a bed is found, force the entity to sleep on it
				if (targetBedPos != null) {
					livingEntity.setPos(targetBedPos.getX() + 0.5, targetBedPos.getY(), targetBedPos.getZ() + 0.5);
					livingEntity.startSleeping(targetBedPos);
				}
			}
		}
		if (entity instanceof LivingEntity _livEnt101 && _livEnt101.isSleeping()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WHITE_ASH, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 0.5);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 255));
		}
		if ((entity instanceof Civilian1Entity _datEntL107 && _datEntL107.getEntityData().get(Civilian1Entity.DATA_notRobbingAgain)) == false) {
			if (!world.getEntitiesOfClass(DarkSoldierEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()
					&& !(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(12 / 2d), e -> true).isEmpty())) {
				if (entity instanceof DarkSoldierEntity _datEntSetI)
					_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 10);
				if (((findEntityInWorldRange(world, DarkSoldierEntity.class, x, y, z, 3)) instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_actionstate) : 0) == 10) {
					if (entity instanceof Civilian1Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian1Entity.DATA_buy, 1);
					entity.getPersistentData().putDouble("GettingStole", (entity.getPersistentData().getDouble("GettingStole") + 1));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 255, false, false));
					if (entity.getPersistentData().getDouble("GettingStole") == 4) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
					if (entity.getPersistentData().getDouble("GettingStole") >= 60) {
						if (entity instanceof Civilian1Entity _datEntSetL)
							_datEntSetL.getEntityData().set(Civilian1Entity.DATA_notRobbingAgain, true);
						if (entity instanceof Civilian1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian1Entity.DATA_buy, 0);
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
						entity.getPersistentData().putDouble("GettingStole", 0);
						if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(64 / 2d), e -> true).isEmpty()) {
							if (entity instanceof Mob _entity)
								_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Player.class, x, y, z, 64)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 64)).getY()),
										((findEntityInWorldRange(world, Player.class, x, y, z, 64)).getZ()), 1);
							if (entity instanceof Civilian1Entity _datEntSetI)
								_datEntSetI.getEntityData().set(Civilian1Entity.DATA_moneyGive, 1);
						}
					}
				}
			}
		}
		if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_moneyGive) : 0) == 1) {
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
				entity.getPersistentData().putDouble("Stolen", (entity.getPersistentData().getDouble("Stolen") + 1));
				if (entity.getPersistentData().getDouble("Stolen") == 10) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ui.button.click")), SoundSource.NEUTRAL, (float) 0.5, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ui.button.click")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Civilian> H.. Hey.. MR.King.."), false);
					}
				}
				if (entity.getPersistentData().getDouble("Stolen") >= 50) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entity.getX() + 7), (entity.getY()), (entity.getZ() + 7), 1);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ui.button.click")), SoundSource.NEUTRAL, (float) 0.5, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ui.button.click")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Civilian> The Dark Warriors Stole My Emeralds And My Vegetables"), false);
					}
					entity.getPersistentData().putDouble("Stolen", 0);
					if (entity instanceof Civilian1Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian1Entity.DATA_moneyGive, 0);
					if (entity instanceof Civilian1Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian1Entity.DATA_buy, 0);
				}
			}
		}
		if ((entity instanceof Civilian1Entity _datEntL150 && _datEntL150.getEntityData().get(Civilian1Entity.DATA_notRobbingAgain)) == true) {
			entity.getPersistentData().putDouble("NotGonnaBeRobbed", (entity.getPersistentData().getDouble("NotGonnaBeRobbed") + 1));
			if (entity.getPersistentData().getDouble("NotGonnaBeRobbed") >= 60) {
				entity.getPersistentData().putDouble("NotGonnaBeRobbed", 0);
				if (entity instanceof Civilian1Entity _datEntSetL)
					_datEntSetL.getEntityData().set(Civilian1Entity.DATA_notRobbingAgain, false);
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}