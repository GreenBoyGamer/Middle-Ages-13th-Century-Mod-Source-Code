package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.Civilian5Entity;

public class Civilian5EatPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Civilian5Entity _datEntI ? _datEntI.getEntityData().get(Civilian5Entity.DATA_Eat) : 0) == 1;
	}
}