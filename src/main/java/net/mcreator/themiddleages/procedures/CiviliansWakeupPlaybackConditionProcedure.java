package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.Civilian1Entity;

public class CiviliansWakeupPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Civilian1Entity _datEntL0 && _datEntL0.getEntityData().get(Civilian1Entity.DATA_stillDoing)) == true;
	}
}