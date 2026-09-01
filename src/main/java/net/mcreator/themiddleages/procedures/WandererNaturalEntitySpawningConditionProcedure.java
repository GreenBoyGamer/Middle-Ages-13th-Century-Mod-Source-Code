package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class WandererNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (!(TheMiddleAgesModVariables.MapVariables.get(world).saved == true)) {
			return true;
		}
		return false;
	}
}