package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.Civilian3Entity;

public class Civilian3wakePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Civilian3Entity _datEntL0 && _datEntL0.getEntityData().get(Civilian3Entity.DATA_stillDoing)) == true;
	}
}