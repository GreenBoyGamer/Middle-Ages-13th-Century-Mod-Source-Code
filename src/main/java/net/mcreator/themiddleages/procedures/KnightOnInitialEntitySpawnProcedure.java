package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class KnightOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			TheMiddleAgesModVariables.PlayerVariables _vars = entity.getData(TheMiddleAgesModVariables.PLAYER_VARIABLES);
			_vars.Knights = entity.getData(TheMiddleAgesModVariables.PLAYER_VARIABLES).Knights + 1;
			_vars.markSyncDirty();
		}
	}
}