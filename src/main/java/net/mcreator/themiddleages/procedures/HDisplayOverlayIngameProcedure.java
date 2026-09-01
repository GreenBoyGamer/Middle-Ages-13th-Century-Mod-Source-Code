package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class HDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world) {
		return TheMiddleAgesModVariables.MapVariables.get(world).GUIController == 1;
	}
}