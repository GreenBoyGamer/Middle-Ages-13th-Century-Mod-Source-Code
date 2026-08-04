package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.init.TheMiddleAgesModEntities;
import net.mcreator.themiddleages.entity.DarkSoldierEntity;

public class ModelProviderProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new DarkSoldierEntity(TheMiddleAgesModEntities.DARK_SOLDIER.get(), _level) : null;
	}
}