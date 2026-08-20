package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.init.TheMiddleAgesModEntities;

public class RenderCartProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? TheMiddleAgesModEntities.PASSENGER_CART_RIDING.get().create(_level, EntitySpawnReason.EVENT) : null;
	}
}