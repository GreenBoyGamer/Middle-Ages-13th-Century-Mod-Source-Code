package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.Civilian3Entity;

public class Civilian3diePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Civilian3Entity _datEntI ? _datEntI.getEntityData().get(Civilian3Entity.DATA_TimeToDie) : 0) == 1;
	}
}