package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.Civilian5Entity;

public class Civilian5WakeupPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Civilian5Entity _datEntL0 && _datEntL0.getEntityData().get(Civilian5Entity.DATA_stillDoing)) == true;
	}
}