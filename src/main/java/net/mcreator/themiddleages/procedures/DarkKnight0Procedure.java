package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.DarkKnightEntity;

public class DarkKnight0Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TheMiddleAgesModVariables.MapVariables.get(world).Dignity = TheMiddleAgesModVariables.MapVariables.get(world).Dignity + 0.4;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		if (entity instanceof DarkKnightEntity _datEntSetI)
			_datEntSetI.getEntityData().set(DarkKnightEntity.DATA_actionstate, 1000);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.getPersistentData().putDouble("actionTicks", 0);
		entity.setInvulnerable(true);
	}
}