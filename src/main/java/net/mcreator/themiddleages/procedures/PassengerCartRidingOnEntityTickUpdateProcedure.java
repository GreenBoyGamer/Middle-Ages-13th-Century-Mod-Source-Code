package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.init.TheMiddleAgesModEntities;
import net.mcreator.themiddleages.entity.PassengerCartRidingEntity;
import net.mcreator.themiddleages.entity.EntityPathFinderEntity;

import java.util.Comparator;

public class PassengerCartRidingOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle()) {
			TheMiddleAgesModVariables.MapVariables.get(world).CoordX = Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordX);
			TheMiddleAgesModVariables.MapVariables.get(world).CoordZ = Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordZ);
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if ((entity instanceof PassengerCartRidingEntity _datEntI ? _datEntI.getEntityData().get(PassengerCartRidingEntity.DATA_move) : 0) == 1) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("forceload add " + Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordX) + " " + Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordZ)));
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(TheMiddleAgesModVariables.MapVariables.get(world).CoordX, y, TheMiddleAgesModVariables.MapVariables.get(world).CoordZ, 1.2);
			}
		} else {
			if (entity instanceof PassengerCartRidingEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PassengerCartRidingEntity.DATA_move, 0);
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time >= 14000) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("forceload add " + Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordX) + " " + Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordZ)));
			if (!world.getEntitiesOfClass(EntityPathFinderEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(1024 / 2d), e -> true).isEmpty()) {
				TheMiddleAgesModVariables.MapVariables.get(world).CoordX = (findEntityInWorldRange(world, EntityPathFinderEntity.class, x, y, z, 1024)).getX();
				TheMiddleAgesModVariables.MapVariables.get(world).CoordZ = (findEntityInWorldRange(world, EntityPathFinderEntity.class, x, y, z, 1024)).getZ();
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			}
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo(TheMiddleAgesModVariables.MapVariables.get(world).CoordX, y, TheMiddleAgesModVariables.MapVariables.get(world).CoordZ, 1.2);
			if (!world.getEntitiesOfClass(EntityPathFinderEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(2 / 2d), e -> true).isEmpty()) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.PASSENGER_CART.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.MEDIEVAL_HORSE.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.CIVILIAN_2.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
		if (entity.getX() == TheMiddleAgesModVariables.MapVariables.get(world).CoordX && entity.getZ() == TheMiddleAgesModVariables.MapVariables.get(world).CoordZ) {
			TheMiddleAgesModVariables.MapVariables.get(world).CoordX = 0;
			TheMiddleAgesModVariables.MapVariables.get(world).CoordZ = 0;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}