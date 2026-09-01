package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.MadievalHorseEntity;

public class MadievalHorseEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MadievalHorseEntity _datEntSetI)
			_datEntSetI.getEntityData().set(MadievalHorseEntity.DATA_actionState, 100);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.setInvulnerable(true);
	}
}