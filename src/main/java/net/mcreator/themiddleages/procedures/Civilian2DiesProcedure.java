package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.Civilian2Entity;

public class Civilian2DiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians - 1;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 60, 255, false, false));
		if (entity instanceof Civilian2Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian2Entity.DATA_TimeToDie, 1);
		if (entity instanceof Civilian2Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian2Entity.DATA_Eat, 0);
		if (entity instanceof Civilian2Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian2Entity.DATA_farming, 0);
		if (entity instanceof Civilian2Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian2Entity.DATA_buy, 0);
		if (entity instanceof Civilian2Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian2Entity.DATA_hungry, 0);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.setInvulnerable(true);
	}
}