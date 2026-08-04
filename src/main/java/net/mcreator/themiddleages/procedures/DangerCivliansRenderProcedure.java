package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class DangerCivliansRenderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + Math.round(entity.getData(TheMiddleAgesModVariables.PLAYER_VARIABLES).Local_Civilians_In_Danger);
	}
}