package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.SoldierEntity;

public class SoldierAttack1PlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof SoldierEntity _datEntI ? _datEntI.getEntityData().get(SoldierEntity.DATA_actionstate) : 0) == 1;
	}
}