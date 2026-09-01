package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.Civilian4Entity;

public class Civilian4SmithingPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Civilian4Entity _datEntI ? _datEntI.getEntityData().get(Civilian4Entity.DATA_DoingJob) : 0) == 1;
	}
}