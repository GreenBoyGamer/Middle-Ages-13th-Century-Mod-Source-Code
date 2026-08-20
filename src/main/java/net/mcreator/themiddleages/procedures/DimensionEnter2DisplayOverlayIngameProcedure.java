package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class DimensionEnter2DisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world) {
		return TheMiddleAgesModVariables.MapVariables.get(world).animation_blank == 2;
	}
}