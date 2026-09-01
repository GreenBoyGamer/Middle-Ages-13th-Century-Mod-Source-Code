package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

public class Civilian1PlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isSprinting();
	}
}