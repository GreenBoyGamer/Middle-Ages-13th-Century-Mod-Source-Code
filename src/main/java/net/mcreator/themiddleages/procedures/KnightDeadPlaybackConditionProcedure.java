package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.KnightEntity;

public class KnightDeadPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof KnightEntity _datEntI ? _datEntI.getEntityData().get(KnightEntity.DATA_actionstate) : 0) == 1000;
	}
}