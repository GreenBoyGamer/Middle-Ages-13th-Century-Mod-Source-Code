package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.BuyerEntity;

public class BuyerOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BuyerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BuyerEntity.DATA_hungry, 20);
	}
}