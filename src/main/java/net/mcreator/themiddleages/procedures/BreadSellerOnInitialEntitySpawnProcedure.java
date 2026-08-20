package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class BreadSellerOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world) {
		TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians + 1;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
	}
}