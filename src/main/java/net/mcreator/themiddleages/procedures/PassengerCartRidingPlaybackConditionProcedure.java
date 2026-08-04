package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.PassengerCartRidingEntity;

public class PassengerCartRidingPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof PassengerCartRidingEntity _datEntI ? _datEntI.getEntityData().get(PassengerCartRidingEntity.DATA_dead) : 0) == 1;
	}
}