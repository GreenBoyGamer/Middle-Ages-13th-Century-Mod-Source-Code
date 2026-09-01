package net.mcreator.themiddleages.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.SitEntity;

public class SitOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setInvulnerable(true);
		if (entity.isVehicle()) {
			if (entity instanceof SitEntity _datEntSetI)
				_datEntSetI.getEntityData().set(SitEntity.DATA_mount, 1);
		} else if (!entity.isVehicle()) {
			if ((entity instanceof SitEntity _datEntI ? _datEntI.getEntityData().get(SitEntity.DATA_mount) : 0) == 1) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (entity instanceof SitEntity _datEntSetI)
					_datEntSetI.getEntityData().set(SitEntity.DATA_mount, 1);
			}
		}
	}
}