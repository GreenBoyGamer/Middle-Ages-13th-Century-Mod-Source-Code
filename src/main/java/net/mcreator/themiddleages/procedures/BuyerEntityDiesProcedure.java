package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.BuyerEntity;

public class BuyerEntityDiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BuyerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BuyerEntity.DATA_TimeToDie, 1);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.setInvulnerable(true);
		TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians - 1;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
	}
}