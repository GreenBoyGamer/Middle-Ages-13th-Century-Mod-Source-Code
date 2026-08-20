package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class CivlianRendersProcedure {
	public static String execute(LevelAccessor world) {
		return "" + Math.round(TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians);
	}
}