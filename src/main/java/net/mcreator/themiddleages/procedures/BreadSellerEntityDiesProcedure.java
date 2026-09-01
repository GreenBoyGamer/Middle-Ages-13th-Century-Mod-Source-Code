package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.BreadSellerEntity;

public class BreadSellerEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.setInvulnerable(true);
		if (entity instanceof BreadSellerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BreadSellerEntity.DATA_die, 1);
	}
}