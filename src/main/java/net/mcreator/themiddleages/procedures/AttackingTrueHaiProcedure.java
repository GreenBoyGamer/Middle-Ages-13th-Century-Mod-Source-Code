package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class AttackingTrueHaiProcedure {
	public static boolean execute(LevelAccessor world) {
		if (TheMiddleAgesModVariables.MapVariables.get(world).Attack == true) {
			return true;
		}
		return false;
	}
}