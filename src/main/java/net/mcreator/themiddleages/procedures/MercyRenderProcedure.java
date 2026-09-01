package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class MercyRenderProcedure {
	public static String execute(LevelAccessor world) {
		return "" + TheMiddleAgesModVariables.MapVariables.get(world).Dignity;
	}
}