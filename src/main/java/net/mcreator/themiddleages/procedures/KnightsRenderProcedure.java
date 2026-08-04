package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class KnightsRenderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + Math.round(entity.getData(TheMiddleAgesModVariables.PLAYER_VARIABLES).Knights);
	}
}