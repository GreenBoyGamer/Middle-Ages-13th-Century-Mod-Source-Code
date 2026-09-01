package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.EnemyArcherEntity;

public class EnemyArcherDiePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof EnemyArcherEntity _datEntI ? _datEntI.getEntityData().get(EnemyArcherEntity.DATA_actionstate) : 0) == 100;
	}
}