package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.GhostOfCruelKingEntity;

public class GhostNotPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof GhostOfCruelKingEntity _datEntI ? _datEntI.getEntityData().get(GhostOfCruelKingEntity.DATA_actionstate) : 0) != 100
				&& (entity instanceof GhostOfCruelKingEntity _datEntI ? _datEntI.getEntityData().get(GhostOfCruelKingEntity.DATA_fightingState) : 0) == 0;
	}
}