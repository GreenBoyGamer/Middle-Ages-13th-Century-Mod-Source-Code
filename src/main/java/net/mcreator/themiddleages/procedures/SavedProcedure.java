package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class SavedProcedure {
	public static boolean execute(LevelAccessor world) {
		return TheMiddleAgesModVariables.MapVariables.get(world).saved == true;
	}
}