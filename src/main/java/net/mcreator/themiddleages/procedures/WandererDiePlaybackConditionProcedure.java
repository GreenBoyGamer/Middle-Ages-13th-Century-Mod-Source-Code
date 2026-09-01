package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.WandererEntity;

public class WandererDiePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof WandererEntity _datEntI ? _datEntI.getEntityData().get(WandererEntity.DATA_actionState) : 0) == 100;
	}
}