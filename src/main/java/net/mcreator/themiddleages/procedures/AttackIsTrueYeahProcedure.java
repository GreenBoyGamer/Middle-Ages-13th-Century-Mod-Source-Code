package net.mcreator.themiddleages.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AttackIsTrueYeahProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (TheMiddleAgesModVariables.MapVariables.get(world).Attack == true) {
			TheMiddleAgesModVariables.MapVariables.get(world).ticksforAttacks = TheMiddleAgesModVariables.MapVariables.get(world).ticksforAttacks + 1;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if (TheMiddleAgesModVariables.MapVariables.get(world).ticksforAttacks >= 10000) {
				TheMiddleAgesModVariables.MapVariables.get(world).Attack = false;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).Attack == false) {
			TheMiddleAgesModVariables.MapVariables.get(world).ticksforAttacks = TheMiddleAgesModVariables.MapVariables.get(world).ticksforAttacks + 1;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if (TheMiddleAgesModVariables.MapVariables.get(world).ticksforAttacks >= 5000) {
				TheMiddleAgesModVariables.MapVariables.get(world).Attack = true;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		}
	}
}