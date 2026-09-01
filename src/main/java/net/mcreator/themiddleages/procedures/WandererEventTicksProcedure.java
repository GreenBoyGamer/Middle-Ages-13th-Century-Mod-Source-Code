package net.mcreator.themiddleages.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.init.TheMiddleAgesModEntities;

import javax.annotation.Nullable;

import java.util.Comparator;

@EventBusSubscriber
public class WandererEventTicksProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			TheMiddleAgesModVariables.MapVariables.get(world).GUIController = 0;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time == 20) {
			if ((world instanceof Level _level3 ? _level3.getDefaultClockTime() : 0) == 1000) {
				if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(32 / 2d), e -> true).isEmpty()) {
					if (!(TheMiddleAgesModVariables.MapVariables.get(world).saved == true)) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = TheMiddleAgesModEntities.WANDERER.get().spawn(_level, BlockPos.containing((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getX() + 7,
									(findEntityInWorldRange(world, Player.class, x, y, z, 32)).getY(), (findEntityInWorldRange(world, Player.class, x, y, z, 32)).getZ() + 7), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				}
			}
		} else if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time == 100) {
			if ((world instanceof Level _level12 ? _level12.getDefaultClockTime() : 0) == 100) {
				if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(32 / 2d), e -> true).isEmpty()) {
					if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
						StringBuilder _titleTextBuilder = new StringBuilder();
						_titleTextBuilder.append("Battle OF Life!");
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
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = TheMiddleAgesModEntities.DARKKING.get().spawn(_level, BlockPos.containing((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getX() + 12,
								(findEntityInWorldRange(world, Player.class, x, y, z, 32)).getY(), (findEntityInWorldRange(world, Player.class, x, y, z, 32)).getZ() + 12), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = TheMiddleAgesModEntities.DARK_KNIGHT.get().spawn(_level, BlockPos.containing((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getX() + 11,
								(findEntityInWorldRange(world, Player.class, x, y, z, 32)).getY(), (findEntityInWorldRange(world, Player.class, x, y, z, 32)).getZ() + 12), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = TheMiddleAgesModEntities.DARK_KNIGHT.get().spawn(_level, BlockPos.containing((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getX() + 13,
								(findEntityInWorldRange(world, Player.class, x, y, z, 32)).getY(), (findEntityInWorldRange(world, Player.class, x, y, z, 32)).getZ() + 12), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = TheMiddleAgesModEntities.DARK_KNIGHT.get().spawn(_level, BlockPos.containing((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getX() + 13,
								(findEntityInWorldRange(world, Player.class, x, y, z, 32)).getY(), (findEntityInWorldRange(world, Player.class, x, y, z, 32)).getZ() + 7), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = TheMiddleAgesModEntities.DARK_KNIGHT.get().spawn(_level, BlockPos.containing((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getX() + 1,
								(findEntityInWorldRange(world, Player.class, x, y, z, 32)).getY(), (findEntityInWorldRange(world, Player.class, x, y, z, 32)).getZ() + 12), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					TheMiddleAgesModVariables.MapVariables.get(world).Attack = true;
					TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
				}
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}