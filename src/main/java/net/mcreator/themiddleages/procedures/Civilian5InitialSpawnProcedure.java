package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.Civilian5Entity;

public class Civilian5InitialSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Civilian5Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian5Entity.DATA_hungry, 20);
		TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians + 1;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
	}
}