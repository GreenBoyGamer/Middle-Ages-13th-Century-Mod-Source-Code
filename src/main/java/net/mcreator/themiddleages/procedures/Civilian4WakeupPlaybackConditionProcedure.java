package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.Civilian4Entity;

public class Civilian4WakeupPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Civilian4Entity _datEntL0 && _datEntL0.getEntityData().get(Civilian4Entity.DATA_stillDoing)) == true;
	}
}