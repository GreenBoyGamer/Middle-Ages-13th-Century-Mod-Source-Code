package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.KnightRidingHorseEntity;

public class KnightRidingHorseOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof KnightRidingHorseEntity _datEntSetI)
			_datEntSetI.getEntityData().set(KnightRidingHorseEntity.DATA_alive, 1);
	}
}