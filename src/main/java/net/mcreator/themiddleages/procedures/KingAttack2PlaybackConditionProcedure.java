package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.DarkkingEntity;

public class KingAttack2PlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof DarkkingEntity _datEntI ? _datEntI.getEntityData().get(DarkkingEntity.DATA_actionstate) : 0) == 2;
	}
}