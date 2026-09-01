package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.DarkkingEntity;

public class KingAttackAniamtion1PlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof DarkkingEntity _datEntI ? _datEntI.getEntityData().get(DarkkingEntity.DATA_actionstate) : 0) == 1;
	}
}