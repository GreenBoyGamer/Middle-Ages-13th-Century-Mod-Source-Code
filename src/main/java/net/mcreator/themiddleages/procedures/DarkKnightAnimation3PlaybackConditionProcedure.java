package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.DarkKnightEntity;

public class DarkKnightAnimation3PlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof DarkKnightEntity _datEntI ? _datEntI.getEntityData().get(DarkKnightEntity.DATA_actionstate) : 0) == 3;
	}
}