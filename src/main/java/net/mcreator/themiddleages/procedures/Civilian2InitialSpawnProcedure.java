package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.Civilian1Entity;

public class Civilian2InitialSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Civilian1Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian1Entity.DATA_hungry, 20);
		{
			TheMiddleAgesModVariables.PlayerVariables _vars = entity.getData(TheMiddleAgesModVariables.PLAYER_VARIABLES);
			_vars.Local_Civilians = entity.getData(TheMiddleAgesModVariables.PLAYER_VARIABLES).Local_Civilians + 1;
			_vars.markSyncDirty();
		}
	}
}