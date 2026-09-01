package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

public class KingPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isSprinting();
	}
}