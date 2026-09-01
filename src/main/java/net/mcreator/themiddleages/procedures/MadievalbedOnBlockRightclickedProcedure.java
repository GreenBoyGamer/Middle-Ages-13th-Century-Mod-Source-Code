package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.storage.LevelData;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.clock.WorldClock;
import net.minecraft.world.clock.ServerClockManager;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import java.util.Optional;

public class MadievalbedOnBlockRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl0 && _lvl0.isBrightOutside())) {
			if (world instanceof ServerLevel _level) {
				ServerClockManager _clockManager = _level.getServer().clockManager();
				Optional<Holder<WorldClock>> _clock = _level.dimensionType().defaultClock();
				if (_clock.isPresent())
					_clockManager.setTotalTicks(_clock.get(), 0);
			}
			if (entity.getPersistentData().getBooleanOr("setSpawn", false) == false) {
				if (entity instanceof ServerPlayer _player)
					_player.sendSystemMessage(Component.literal("Respawn Point Set!"), true);
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.setRespawnPosition(new ServerPlayer.RespawnConfig(LevelData.RespawnData.of(_serverPlayer.level().dimension(), BlockPos.containing(x, y, z), _serverPlayer.getYRot(), _serverPlayer.getXRot()), true), false);
				entity.getPersistentData().putBoolean("setSpawn", true);
			}
		} else {
			if (entity instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal("You Can't Sleep At Day!"), true);
		}
	}
}