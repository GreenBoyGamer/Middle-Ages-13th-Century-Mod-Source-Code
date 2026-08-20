package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.BreadSellerEntity;

public class BreadSellerthanksPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BreadSellerEntity _datEntI ? _datEntI.getEntityData().get(BreadSellerEntity.DATA_giveThanks) : 0) == 1;
	}
}