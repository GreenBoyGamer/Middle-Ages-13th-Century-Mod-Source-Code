package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class MadievalDimensionPlayerLeavesDimensionProcedure {
	public static void execute(LevelAccessor world) {
		TheMiddleAgesModVariables.MapVariables.get(world).GUIController = 0;
		TheMiddleAgesModVariables.MapVariables.get(world).world_Time = 0;
		TheMiddleAgesModVariables.MapVariables.get(world).days_Count = false;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
	}
}