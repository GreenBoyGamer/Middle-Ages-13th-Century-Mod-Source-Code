package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.Civilian1Entity;

public class Civilian1OnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Civilian1Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian1Entity.DATA_hungry, 20);
		TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians + 1;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
	}
}