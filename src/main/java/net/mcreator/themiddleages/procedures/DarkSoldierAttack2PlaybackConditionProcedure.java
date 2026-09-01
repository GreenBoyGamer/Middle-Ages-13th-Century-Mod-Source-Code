package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.DarkSoldierEntity;

public class DarkSoldierAttack2PlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_actionstate) : 0) == 2;
	}
}