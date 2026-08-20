package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.ArcherEntity;

public class ArcherNotDoingAndIdleProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof ArcherEntity _datEntI ? _datEntI.getEntityData().get(ArcherEntity.DATA_actionstate) : 0) != 100;
	}
}