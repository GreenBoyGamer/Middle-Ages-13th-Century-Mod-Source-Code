package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.KnightRidingHorseEntity;

public class HorseKnightDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof KnightRidingHorseEntity _datEntSetI)
			_datEntSetI.getEntityData().set(KnightRidingHorseEntity.DATA_actionstate, 100);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.getPersistentData().putDouble("actionTicks", 0);
		entity.setInvulnerable(true);
	}
}