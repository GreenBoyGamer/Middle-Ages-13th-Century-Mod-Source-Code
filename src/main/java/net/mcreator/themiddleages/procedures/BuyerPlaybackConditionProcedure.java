package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.BuyerEntity;

public class BuyerPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BuyerEntity _datEntL0 && _datEntL0.getEntityData().get(BuyerEntity.DATA_stillDoing)) == true;
	}
}