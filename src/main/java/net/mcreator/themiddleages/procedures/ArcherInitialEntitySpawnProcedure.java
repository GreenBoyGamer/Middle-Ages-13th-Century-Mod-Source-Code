package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class ArcherInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			TheMiddleAgesModVariables.PlayerVariables _vars = entity.getData(TheMiddleAgesModVariables.PLAYER_VARIABLES);
			_vars.Soldiers = entity.getData(TheMiddleAgesModVariables.PLAYER_VARIABLES).Soldiers + 1;
			_vars.markSyncDirty();
		}
	}
}