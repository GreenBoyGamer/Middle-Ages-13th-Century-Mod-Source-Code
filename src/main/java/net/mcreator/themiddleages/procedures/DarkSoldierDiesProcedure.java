package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.init.TheMiddleAgesModEntities;
import net.mcreator.themiddleages.entity.DarkSoldierEntity;

public class DarkSoldierDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Carry_Amount) : 0) > 0) {
			for (int index170 = 0; index170 < (int) (entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Carry_Amount) : 0); index170++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.CIVILIAN_1.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger - 1;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		}
		if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount2) : 0) > 0) {
			for (int index171 = 0; index171 < (int) (entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount2) : 0); index171++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.CIVILIAN_2.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger - 1;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		}
		if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount3) : 0) > 0) {
			for (int index172 = 0; index172 < (int) (entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount3) : 0); index172++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.CIVILIAN_3.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger - 1;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		}
		if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount4) : 0) > 0) {
			for (int index173 = 0; index173 < (int) (entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount4) : 0); index173++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.CIVILIAN_4.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger - 1;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		}
		if ((entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount5) : 0) > 0) {
			for (int index174 = 0; index174 < (int) (entity instanceof DarkSoldierEntity _datEntI ? _datEntI.getEntityData().get(DarkSoldierEntity.DATA_Peasents_Amount5) : 0); index174++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.CIVILIAN_5.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians_In_Danger - 1;
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
		}
		TheMiddleAgesModVariables.MapVariables.get(world).Dignity = TheMiddleAgesModVariables.MapVariables.get(world).Dignity + 1;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		if (entity instanceof DarkSoldierEntity _datEntSetI)
			_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_actionstate, 100);
		if (entity instanceof DarkSoldierEntity _datEntSetI)
			_datEntSetI.getEntityData().set(DarkSoldierEntity.DATA_fightingState, 0);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.getPersistentData().putDouble("actionTicks", 0);
		entity.setInvulnerable(true);
	}
}