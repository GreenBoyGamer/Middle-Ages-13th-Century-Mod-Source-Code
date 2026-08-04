package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.MadievalHorseEntity;

public class MadievalHorsePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof MadievalHorseEntity _datEntI ? _datEntI.getEntityData().get(MadievalHorseEntity.DATA_actionState) : 0) == 100;
	}
}