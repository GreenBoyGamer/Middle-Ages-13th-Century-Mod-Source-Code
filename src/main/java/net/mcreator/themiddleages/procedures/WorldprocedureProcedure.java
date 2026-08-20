package net.mcreator.themiddleages.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

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
		TheMiddleAgesModVariables.MapVariables.get(world).world_Time = world instanceof Level _level0 ? _level0.getDefaultClockTime() : 0;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time > 24000) {
			TheMiddleAgesModVariables.MapVariables.get(world).world_Time = 0;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).animation_blank == 1) {
			TheMiddleAgesModVariables.MapVariables.get(world).tick_passing_animation = TheMiddleAgesModVariables.MapVariables.get(world).tick_passing_animation + 1;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if (TheMiddleAgesModVariables.MapVariables.get(world).tick_passing_animation > 512) {
				TheMiddleAgesModVariables.MapVariables.get(world).animation_blank = TheMiddleAgesModVariables.MapVariables.get(world).animation_blank + 1;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		} else if (TheMiddleAgesModVariables.MapVariables.get(world).animation_blank == 2) {
			if (TheMiddleAgesModVariables.MapVariables.get(world).tick_passing_animation > 60) {
				TheMiddleAgesModVariables.MapVariables.get(world).animation_blank = TheMiddleAgesModVariables.MapVariables.get(world).animation_blank + 1;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		} else if (TheMiddleAgesModVariables.MapVariables.get(world).animation_blank == 3) {
			if (TheMiddleAgesModVariables.MapVariables.get(world).tick_passing_animation > 60) {
				TheMiddleAgesModVariables.MapVariables.get(world).animation_blank = 0;
				TheMiddleAgesModVariables.MapVariables.get(world).tick_passing_animation = 0;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		}
	}
}