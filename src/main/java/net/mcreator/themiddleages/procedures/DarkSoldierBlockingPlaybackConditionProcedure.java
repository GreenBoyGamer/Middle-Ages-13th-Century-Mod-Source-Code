package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.DarkSoldierEntity;

public class DarkSoldierBlockingPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_fightingState) : 0) == 1;
	}
}