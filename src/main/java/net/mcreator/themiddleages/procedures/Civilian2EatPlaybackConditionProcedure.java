package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.Civilian2Entity;

public class Civilian2EatPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Civilian2Entity _datEntI ? _datEntI.getEntityData().get(Civilian2Entity.DATA_Eat) : 0) == 1;
	}
}