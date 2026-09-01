package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.Civilian1Entity;

public class Civilian1MeetPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_giveThanks) : 0) == 1;
	}
}