package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
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
import net.mcreator.themiddleages.entity.DarkSoldierEntity;
import net.mcreator.themiddleages.entity.Civilian1Entity;
import net.mcreator.themiddleages.entity.BuyerEntity;
import net.mcreator.themiddleages.entity.BreadSellerEntity;

import java.util.Comparator;

public class Civilian1OnEntityTickUpdateProcedure {
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
		if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_TimeToDie) : 0) == 1) {
			entity.getPersistentData().putDouble("DeathTimeTicks", (entity.getPersistentData().getDouble("DeathTimeTicks") + 1));
			if (entity.getPersistentData().getDouble("DeathTimeTicks") > 20) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.villager.death")), SoundSource.NEUTRAL, 1, (float) 0.7);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.villager.death")), SoundSource.NEUTRAL, 1, (float) 0.7, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 0.5);
				entity.getPersistentData().putDouble("DeathTimeTicks", 0);
			}
		}
		if (entity.getPersistentData().getDouble("TimeUntilDead") >= 450) {
			if (entity instanceof Civilian1Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian1Entity.DATA_TimeToDie, 1);
		}
		if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_hungry) : 0) > 0) {
			entity.getPersistentData().putDouble("WaitForHunger", (entity.getPersistentData().getDouble("WaitForHunger") + 1));
			entity.getPersistentData().putDouble("TimeUntilDead", 0);
		} else if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_hungry) : 0) <= 0) {
			entity.getPersistentData().putDouble("TimeUntilDead", (entity.getPersistentData().getDouble("TimeUntilDead") + 1));
		}
		if (entity.getPersistentData().getDouble("WaitForHunger") == 250) {
			if (entity instanceof Civilian1Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian1Entity.DATA_hungry, (int) ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_hungry) : 0) - 1));
			entity.getPersistentData().putDouble("WaitForHunger", 0);
		}
		if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_hungry) : 0) < 1) {
			if (!world.getEntitiesOfClass(BreadSellerEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(3 / 2d), e -> true).isEmpty()) {
				if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_Eat) : 0) == 0) {
					if (entity instanceof Civilian1Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian1Entity.DATA_buy, 1);
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
			if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_buy) : 0) == 1) {
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
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Civilian> Hey Mr Seller! I Want Some Food. "), false);
				}
			} else if (entity.getPersistentData().getDouble("buyingTicks") >= 37) {
				if (entity instanceof Civilian1Entity _datEntSetI)
					_datEntSetI.getEntityData().set(Civilian1Entity.DATA_buy, 0);
				entity.getPersistentData().putDouble("WaitingTicks", (entity.getPersistentData().getDouble("WaitingTicks") + 1));
				if (entity.getPersistentData().getDouble("WaitingTicks") >= 20) {
					if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_buy) : 0) == 0) {
						if (entity instanceof Civilian1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian1Entity.DATA_Eat, 1);
					}
					if (world instanceof ServerLevel _level) {
						_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Seller> Sure! Here's Your Food"), false);
					}
					entity.getPersistentData().putDouble("buyingTicks", 0);
					entity.getPersistentData().putDouble("WaitingTicks", 0);
				}
			}
			if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_Eat) : 0) == 1) {
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
					if (entity instanceof Civilian1Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian1Entity.DATA_Eat, 0);
					entity.getPersistentData().putDouble("EatingIsOnTicks", 0);
					if (entity instanceof Civilian1Entity _datEntSetI)
						_datEntSetI.getEntityData().set(Civilian1Entity.DATA_hungry, 20);
				}
			}
		} else {
			if (entity instanceof Civilian1Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian1Entity.DATA_Eat, 0);
			if (entity instanceof Civilian1Entity _datEntSetI)
				_datEntSetI.getEntityData().set(Civilian1Entity.DATA_buy, 0);
		}
		if (!world.isClientSide()) {
			if (entity instanceof LivingEntity _livEnt72 && _livEnt72.isSleeping()) {
				if (entity instanceof Civilian1Entity _datEntSetL)
					_datEntSetL.getEntityData().set(Civilian1Entity.DATA_wasDoing, true);
				entity.getPersistentData().putDouble("SleepTicks", (entity.getPersistentData().getDouble("SleepTicks") + 1));
				if (entity.getPersistentData().getDouble("SleepTicks") > 4) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (TheMiddleAgesModParticleTypes.SLEEPING.get()), x, y, z, 1, 0, (entity.getBbWidth() / 2d), 0, 0.12);
					entity.getPersistentData().putDouble("SleepTicks", 0);
				}
			} else {
				if ((entity instanceof Civilian1Entity _datEntL80 && _datEntL80.getEntityData().get(Civilian1Entity.DATA_wasDoing)) == true) {
					if (world instanceof Level _lvl81 && _lvl81.isDay()) {
						if (entity instanceof Civilian1Entity _datEntSetL)
							_datEntSetL.getEntityData().set(Civilian1Entity.DATA_stillDoing, true);
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
							if (entity instanceof Civilian1Entity _datEntSetL)
								_datEntSetL.getEntityData().set(Civilian1Entity.DATA_stillDoing, false);
							if (entity instanceof Civilian1Entity _datEntSetL)
								_datEntSetL.getEntityData().set(Civilian1Entity.DATA_wasDoing, false);
							entity.getPersistentData().putDouble("tickWake", 0);
						}
					}
				}
			}
		}
		found = false;
		if (!((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_hungry) : 0) <= 1)) {
			if (world instanceof net.minecraft.world.level.Level _level
					? net.minecraft.core.BlockPos.betweenClosedStream(net.minecraft.core.BlockPos.containing((double) x, (double) y, (double) z).offset(-(int) 12, -(int) 12, -(int) 12),
							net.minecraft.core.BlockPos.containing((double) x, (double) y, (double) z).offset((int) 12, (int) 12, (int) 12)).anyMatch(_pos -> {
								net.minecraft.world.item.Item _item = Blocks.FARMLAND.asItem();
								if (_item instanceof net.minecraft.world.item.BlockItem _bi) {
									return _level.getBlockState(_pos).is(_bi.getBlock());
								}
								return false;
							})
					: false) {
				found = true;
			}
			if (found == true) {
				net.minecraft.core.BlockPos mobPos = entity.blockPosition();
				net.minecraft.core.BlockPos targetPos = null;
				int radius = 10;
				for (net.minecraft.core.BlockPos pos : net.minecraft.core.BlockPos.betweenClosed(mobPos.offset(-radius, -2, -radius), mobPos.offset(radius, 2, radius))) {
					if (world.getBlockState(pos).is(net.minecraft.world.level.block.Blocks.FARMLAND)) {
						targetPos = pos.immutable();
						break;
					}
				}
				if (targetPos != null && entity instanceof net.minecraft.world.entity.Mob mob) {
					if (mob.getNavigation().isDone()) {
						mob.getNavigation().moveTo(targetPos.getX() + 0.5, targetPos.getY() + 1.0, targetPos.getZ() + 0.5, 1.25D);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CARROTS) {
					if ((getPropertyByName((world.getBlockState(BlockPos.containing(x, y, z))), "age") instanceof IntegerProperty _getip98 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip98) : -1) > 6) {
						if (entity instanceof Civilian1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian1Entity.DATA_farming, 1);
						if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_farming) : 0) == 1) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 255, false, false));
							entity.getPersistentData().putDouble("BreakingTicks", (entity.getPersistentData().getDouble("BreakingTicks") + 1));
							if (entity.getPersistentData().getDouble("BreakingTicks") >= 100) {
								if (entity instanceof Civilian1Entity _datEntSetI)
									_datEntSetI.getEntityData().set(Civilian1Entity.DATA_hungry, (int) ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_hungry) : 0) - 1));
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (entity instanceof Civilian1Entity _datEntSetI)
									_datEntSetI.getEntityData().set(Civilian1Entity.DATA_Vegetables, (int) ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_Vegetables) : 0) + 1));
								entity.getPersistentData().putDouble("BreakingTicks", 0);
								if (entity instanceof Civilian1Entity _datEntSetI)
									_datEntSetI.getEntityData().set(Civilian1Entity.DATA_farming, 0);
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo((entity.getX() + Mth.nextInt(RandomSource.create(), -5, 5)), (entity.getY()), (entity.getZ() + Mth.nextInt(RandomSource.create(), -5, 5)), 1);
								if (entity instanceof Civilian1Entity _datEntSetI)
									_datEntSetI.getEntityData().set(Civilian1Entity.DATA_farming, 0);
								found = false;
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
							}
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CARROTS) {
					if ((getPropertyByName((world.getBlockState(BlockPos.containing(x, y, z))), "age") instanceof IntegerProperty _getip125 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip125) : -1) < 6) {
						if (entity instanceof Civilian1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian1Entity.DATA_farming, 1);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 255, false, false));
						if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_farming) : 0) == 1) {
							entity.getPersistentData().putDouble("AndhaTicks", (entity.getPersistentData().getDouble("AndhaTicks") + 1));
							if (entity.getPersistentData().getDouble("AndhaTicks") >= 100) {
								if (entity instanceof Civilian1Entity _datEntSetI)
									_datEntSetI.getEntityData().set(Civilian1Entity.DATA_hungry, (int) ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_hungry) : 0) - 1));
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
								if (world instanceof Level _level) {
									BlockPos _bp = BlockPos.containing(x, y, z);
									if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
										if (!_level.isClientSide())
											_level.levelEvent(2005, _bp, 0);
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bone_meal.use")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (entity instanceof Civilian1Entity _datEntSetI)
									_datEntSetI.getEntityData().set(Civilian1Entity.DATA_farming, 0);
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo((entity.getX() + Mth.nextInt(RandomSource.create(), -5, 5)), (entity.getY()), (entity.getZ() + Mth.nextInt(RandomSource.create(), -5, 5)), 1);
								found = false;
								entity.getPersistentData().putDouble("AndhaTicks", 0);
							}
						}
					}
				} else {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
						if (entity instanceof Civilian1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian1Entity.DATA_farming, 1);
						if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_farming) : 0) == 1) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 255, false, false));
							entity.getPersistentData().putDouble("farmerTicks", (entity.getPersistentData().getDouble("farmerTicks") + 1));
							if (entity.getPersistentData().getDouble("farmerTicks") >= 100) {
								if (entity instanceof Civilian1Entity _datEntSetI)
									_datEntSetI.getEntityData().set(Civilian1Entity.DATA_hungry, (int) ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_hungry) : 0) - 1));
								found = false;
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
								world.setBlock(BlockPos.containing(x, y, z), Blocks.CARROTS.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.crop.plant")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.crop.plant")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo((entity.getX() + Mth.nextInt(RandomSource.create(), -5, 5)), (entity.getY()), (entity.getZ() + Mth.nextInt(RandomSource.create(), -5, 5)), 1);
								entity.getPersistentData().putDouble("farmerTicks", 0);
								if (entity instanceof Civilian1Entity _datEntSetI)
									_datEntSetI.getEntityData().set(Civilian1Entity.DATA_farming, 0);
							}
						}
					}
				}
			} else {
				if (entity instanceof Civilian1Entity _datEntSetI)
					_datEntSetI.getEntityData().set(Civilian1Entity.DATA_farming, 0);
			}
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
		if (entity instanceof LivingEntity _livEnt167 && _livEnt167.isSleeping()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WHITE_ASH, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 0.5);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 255));
		}
		if ((entity instanceof Civilian1Entity _datEntL173 && _datEntL173.getEntityData().get(Civilian1Entity.DATA_notRobbingAgain)) == false) {
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
		if ((entity instanceof Civilian1Entity _datEntL216 && _datEntL216.getEntityData().get(Civilian1Entity.DATA_notRobbingAgain)) == true) {
			entity.getPersistentData().putDouble("NotGonnaBeRobbed", (entity.getPersistentData().getDouble("NotGonnaBeRobbed") + 1));
			if (entity.getPersistentData().getDouble("NotGonnaBeRobbed") >= 60) {
				entity.getPersistentData().putDouble("NotGonnaBeRobbed", 0);
				if (entity instanceof Civilian1Entity _datEntSetL)
					_datEntSetL.getEntityData().set(Civilian1Entity.DATA_notRobbingAgain, false);
			}
		}
		if (!world.getEntitiesOfClass(BuyerEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 255, false, false));
		} else if (!world.getEntitiesOfClass(BuyerEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(256 / 2d), e -> true).isEmpty()) {
			if ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_Vegetables) : 0) >= 3) {
				if (entity instanceof Civilian1Entity _datEntSetI)
					_datEntSetI.getEntityData().set(Civilian1Entity.DATA_carry, 1);
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((findEntityInWorldRange(world, BuyerEntity.class, x, y, z, 256)).getX()), ((findEntityInWorldRange(world, BuyerEntity.class, x, y, z, 256)).getY()),
							((findEntityInWorldRange(world, BuyerEntity.class, x, y, z, 256)).getZ()), 1);
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}

	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
	}
}