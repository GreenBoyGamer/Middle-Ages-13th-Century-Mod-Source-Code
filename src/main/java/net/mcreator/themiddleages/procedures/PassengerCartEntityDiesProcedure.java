package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

public class PassengerCartEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}