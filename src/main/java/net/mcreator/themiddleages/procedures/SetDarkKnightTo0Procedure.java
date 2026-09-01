package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.KnightEntity;

public class SetDarkKnightTo0Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof KnightEntity _datEntI ? _datEntI.getEntityData().get(KnightEntity.DATA_actionstate) : 0) == 0;
	}
}