package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class AttackingIsFalseProcedure {
	public static boolean execute(LevelAccessor world) {
		if (TheMiddleAgesModVariables.MapVariables.get(world).Attack == false) {
			return false;
		}
		return false;
	}
}