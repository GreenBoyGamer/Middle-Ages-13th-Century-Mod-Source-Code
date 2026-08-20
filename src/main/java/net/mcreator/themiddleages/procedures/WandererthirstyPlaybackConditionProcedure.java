package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.WandererEntity;

public class WandererthirstyPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof WandererEntity _datEntI ? _datEntI.getEntityData().get(WandererEntity.DATA_thirsty) : 0) == 1;
	}
}