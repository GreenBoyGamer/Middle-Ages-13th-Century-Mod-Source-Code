package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.BuyerEntity;

public class BuyerDiePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof BuyerEntity _datEntI ? _datEntI.getEntityData().get(BuyerEntity.DATA_TimeToDie) : 0) == 1;
	}
}