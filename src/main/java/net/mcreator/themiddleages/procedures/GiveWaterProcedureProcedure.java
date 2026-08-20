package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class GiveWaterProcedureProcedure {
	public static void execute(LevelAccessor world) {
		TheMiddleAgesModVariables.MapVariables.get(world).saved = true;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
	}
}