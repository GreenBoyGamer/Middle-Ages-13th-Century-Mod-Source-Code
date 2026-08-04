package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.PassengerCartRidingEntity;

public class PassengerCartRidingEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.setInvulnerable(true);
		if (entity instanceof PassengerCartRidingEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PassengerCartRidingEntity.DATA_dead, 1);
	}
}