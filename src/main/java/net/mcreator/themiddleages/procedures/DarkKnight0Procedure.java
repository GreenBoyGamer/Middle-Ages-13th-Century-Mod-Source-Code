package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.DarkKnightEntity;

public class DarkKnight0Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof DarkKnightEntity _datEntSetI)
			_datEntSetI.getEntityData().set(DarkKnightEntity.DATA_actionstate, 1000);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.getPersistentData().putDouble("actionTicks", 0);
		entity.setInvulnerable(true);
	}
}