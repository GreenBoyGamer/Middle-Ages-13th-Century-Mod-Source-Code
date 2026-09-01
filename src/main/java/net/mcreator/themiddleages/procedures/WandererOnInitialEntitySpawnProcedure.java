package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.WandererEntity;

public class WandererOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof WandererEntity _datEntSetI)
			_datEntSetI.getEntityData().set(WandererEntity.DATA_thirsty, 1);
	}
}