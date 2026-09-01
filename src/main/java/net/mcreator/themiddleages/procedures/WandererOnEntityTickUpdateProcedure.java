package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.WandererEntity;
import net.mcreator.themiddleages.TheMiddleAgesMod;

public class WandererOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setCustomName(Component.literal("§6" + ("John Hand " + "§a" + "Author ")));
		if ((entity instanceof WandererEntity _datEntI ? _datEntI.getEntityData().get(WandererEntity.DATA_thirsty) : 0) == 1) {
			entity.setCustomName(Component.literal("§6" + ("John Hand " + "§a" + ("Author " + "§c" + "[THRISTY]"))));
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(16 / 2d), e -> true).isEmpty()) {
				if (TheMiddleAgesModVariables.MapVariables.get(world).saved == true) {
					TheMiddleAgesModVariables.MapVariables.get(world).lettoDie = 0;
					TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
					entity.getPersistentData().putDouble("ChatTicks", (entity.getPersistentData().getDoubleOr("ChatTicks", 0) + 1));
					if (entity.getPersistentData().getDoubleOr("ChatTicks", 0) == 20) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.drink")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.drink")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof WandererEntity _datEntSetI)
							_datEntSetI.getEntityData().set(WandererEntity.DATA_EatState, 1);
						if (world instanceof ServerLevel _level) {
							_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Wanderer> Thanks, Mr King"), false);
						}
					} else if (entity.getPersistentData().getDoubleOr("ChatTicks", 0) == 40) {
						if (entity instanceof WandererEntity _datEntSetI)
							_datEntSetI.getEntityData().set(WandererEntity.DATA_EatState, 0);
						if (entity instanceof WandererEntity _datEntSetI)
							_datEntSetI.getEntityData().set(WandererEntity.DATA_thirsty, 0);
						TheMiddleAgesModVariables.MapVariables.get(world).Wealth = TheMiddleAgesModVariables.MapVariables.get(world).Wealth + 45;
						TheMiddleAgesModVariables.MapVariables.get(world).Dignity = TheMiddleAgesModVariables.MapVariables.get(world).Dignity + 5;
						TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel _level) {
							_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Wanderer> Here Is Your Reward, For Saving My Life"), false);
						}
						if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
							StringBuilder _titleTextBuilder = new StringBuilder();
							_titleTextBuilder.append("Wealth +45");
							String _titleText = _titleTextBuilder.toString();
							net.minecraft.network.chat.Component _comp = net.minecraft.network.chat.Component.literal(_titleText);
							int _fadeTicks = (int) (0.5 * 20.0D);
							int _holdTicks = (int) (2 * 20.0D);
							java.util.List<net.minecraft.server.level.ServerPlayer> _targetPlayers = new java.util.ArrayList<>();
							net.minecraft.world.entity.player.Player _closest = _servLvl.getNearestPlayer((double) x, (double) y, (double) z, 100.0D, false);
							if (_closest instanceof net.minecraft.server.level.ServerPlayer _sp) {
								_targetPlayers.add(_sp);
							}
							for (net.minecraft.server.level.ServerPlayer _sp : _targetPlayers) {
								_sp.connection.send(new net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket(_fadeTicks, _holdTicks, _fadeTicks));
								_sp.connection.send(new net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket(_comp));
							}
						}
						TheMiddleAgesMod.queueServerWork(20, () -> {
							if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
								StringBuilder _titleTextBuilder = new StringBuilder();
								_titleTextBuilder.append("Dignity +5");
								String _titleText = _titleTextBuilder.toString();
								net.minecraft.network.chat.Component _comp = net.minecraft.network.chat.Component.literal(_titleText);
								int _fadeTicks = (int) (0.5 * 20.0D);
								int _holdTicks = (int) (2 * 20.0D);
								java.util.List<net.minecraft.server.level.ServerPlayer> _targetPlayers = new java.util.ArrayList<>();
								net.minecraft.world.entity.player.Player _closest = _servLvl.getNearestPlayer((double) x, (double) y, (double) z, 100.0D, false);
								if (_closest instanceof net.minecraft.server.level.ServerPlayer _sp) {
									_targetPlayers.add(_sp);
								}
								for (net.minecraft.server.level.ServerPlayer _sp : _targetPlayers) {
									_sp.connection.send(new net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket(_fadeTicks, _holdTicks, _fadeTicks));
									_sp.connection.send(new net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket(_comp));
								}
							}
						});
						if (entity instanceof Mob _entity)
							_entity.getNavigation().moveTo((entity.getX() + 100), (entity.getY()), (entity.getZ() + 100), 1);
						TheMiddleAgesMod.queueServerWork(60, () -> {
							if (!entity.level().isClientSide())
								entity.discard();
						});
					} else if (entity.getPersistentData().getDoubleOr("ChatTicks", 0) == 100) {
						if (!entity.level().isClientSide())
							entity.discard();
					} else if (entity.getPersistentData().getDoubleOr("ChatTicks", 0) > 1000) {
						entity.getPersistentData().putDouble("ChatTicks", 0);
					}
				} else if (TheMiddleAgesModVariables.MapVariables.get(world).saved == false) {
					entity.getPersistentData().putDouble("ChatTicks2", (entity.getPersistentData().getDoubleOr("ChatTicks2", 0) + 1));
					entity.getPersistentData().putDouble("TimeUntilDeath", (entity.getPersistentData().getDoubleOr("TimeUntilDeath", 0) + 1));
					if (entity.getPersistentData().getDoubleOr("ChatTicks2", 0) == 20) {
						if (world instanceof ServerLevel _level) {
							_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Wanderer> Help!"), false);
						}
					} else if (entity.getPersistentData().getDoubleOr("ChatTicks2", 0) > 40) {
						if (world instanceof ServerLevel _level) {
							_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Wanderer> Please MR King Help!"), false);
						}
						entity.getPersistentData().putDouble("ChatTicks2", 0);
					}
					if (entity.getPersistentData().getDoubleOr("TimeUntilDeath", 0) > 350) {
						TheMiddleAgesModVariables.MapVariables.get(world).Dignity = TheMiddleAgesModVariables.MapVariables.get(world).Dignity - 15;
						TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
						entity.getPersistentData().putDouble("TimeUntilDeath", 0);
						if (entity instanceof WandererEntity _datEntSetI)
							_datEntSetI.getEntityData().set(WandererEntity.DATA_actionState, 100);
						TheMiddleAgesModVariables.MapVariables.get(world).lettoDie = 1;
						TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
					}
				}
			}
		}
		if ((entity instanceof WandererEntity _datEntI ? _datEntI.getEntityData().get(WandererEntity.DATA_actionState) : 0) == 100) {
			entity.getPersistentData().putDouble("DyingTicks", (entity.getPersistentData().getDoubleOr("DyingTicks", 0) + 1));
			if (entity.getPersistentData().getDoubleOr("DyingTicks", 0) > 20) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:dying_sound")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:dying_sound")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
				entity.getPersistentData().putDouble("DyingTicks", 0);
			}
		}
	}
}