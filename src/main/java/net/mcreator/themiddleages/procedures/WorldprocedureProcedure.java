package net.mcreator.themiddleages.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

import javax.annotation.Nullable;

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
		TheMiddleAgesModVariables.MapVariables.get(world).world_Time = TheMiddleAgesModVariables.MapVariables.get(world).world_Time + 1;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time > 24000) {
			TheMiddleAgesModVariables.MapVariables.get(world).world_Time = 0;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}