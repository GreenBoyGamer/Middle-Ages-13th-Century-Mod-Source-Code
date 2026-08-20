package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class ArcherInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world) {
		TheMiddleAgesModVariables.MapVariables.get(world).Soldiers = TheMiddleAgesModVariables.MapVariables.get(world).Soldiers + 1;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
	}
}