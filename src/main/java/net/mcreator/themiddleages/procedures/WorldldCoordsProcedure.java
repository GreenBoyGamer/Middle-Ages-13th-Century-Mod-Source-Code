package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class WorldldCoordsProcedure {
	public static String execute(LevelAccessor world) {
		return Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordX) + " , " + Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordZ);
	}
}