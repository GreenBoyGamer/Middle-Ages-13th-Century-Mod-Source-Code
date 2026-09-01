package net.mcreator.themiddleages.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.clock.WorldClock;
import net.minecraft.world.clock.ServerClockManager;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Holder;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

import javax.annotation.Nullable;

import java.util.Optional;

@EventBusSubscriber
public class WorldprocedureProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof Level _level0 ? _level0.getDefaultClockTime() : 0) >= 24000) {
			if (world instanceof ServerLevel _level) {
				ServerClockManager _clockManager = _level.getServer().clockManager();
				Optional<Holder<WorldClock>> _clock = _level.dimensionType().defaultClock();
				if (_clock.isPresent())
					_clockManager.setTotalTicks(_clock.get(), 0);
			}
			if (TheMiddleAgesModVariables.MapVariables.get(world).GUIController > 0) {
				TheMiddleAgesModVariables.MapVariables.get(world).world_Time = TheMiddleAgesModVariables.MapVariables.get(world).world_Time + 1;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			} else if (TheMiddleAgesModVariables.MapVariables.get(world).GUIController == 0) {
				TheMiddleAgesModVariables.MapVariables.get(world).world_Time = 0;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).Dignity < 0) {
			TheMiddleAgesModVariables.MapVariables.get(world).Dignity = 0;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		} else if (TheMiddleAgesModVariables.MapVariables.get(world).Dignity > 100) {
			TheMiddleAgesModVariables.MapVariables.get(world).Dignity = 100;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time == 3) {
			TheMiddleAgesModVariables.MapVariables.get(world).Attack = true;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		} else if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time > 3 && TheMiddleAgesModVariables.MapVariables.get(world).world_Time < 10) {
			TheMiddleAgesModVariables.MapVariables.get(world).Attack = false;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		} else if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time == 10) {
			TheMiddleAgesModVariables.MapVariables.get(world).Attack = true;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		} else if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time > 10 && TheMiddleAgesModVariables.MapVariables.get(world).world_Time < 12) {
			TheMiddleAgesModVariables.MapVariables.get(world).Attack = false;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}