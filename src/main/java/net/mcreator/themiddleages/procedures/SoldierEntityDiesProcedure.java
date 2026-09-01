package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.SoldierEntity;

public class SoldierEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof SoldierEntity _datEntSetI)
			_datEntSetI.getEntityData().set(SoldierEntity.DATA_actionstate, 100);
		if (entity instanceof SoldierEntity _datEntSetI)
			_datEntSetI.getEntityData().set(SoldierEntity.DATA_fightingState, 0);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.getPersistentData().putDouble("actionTicks", 0);
		entity.setInvulnerable(true);
	}
}