package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class KnightOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world) {
		TheMiddleAgesModVariables.MapVariables.get(world).Knights = TheMiddleAgesModVariables.MapVariables.get(world).Knights + 1;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
	}
}