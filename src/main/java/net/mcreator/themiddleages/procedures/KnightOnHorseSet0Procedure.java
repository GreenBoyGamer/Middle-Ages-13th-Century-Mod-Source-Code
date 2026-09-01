package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.KnightRidingHorseEntity;

public class KnightOnHorseSet0Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof KnightRidingHorseEntity _datEntI ? _datEntI.getEntityData().get(KnightRidingHorseEntity.DATA_actionstate) : 0) == 0;
	}
}