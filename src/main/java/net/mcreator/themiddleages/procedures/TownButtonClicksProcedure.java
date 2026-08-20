package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.PassengerCartRidingEntity;
import net.mcreator.themiddleages.entity.EntityPathFinderEntity;

import java.util.Comparator;

public class TownButtonClicksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("forceload add " + Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordX) + " " + Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordZ)));
		if (!world.getEntitiesOfClass(EntityPathFinderEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(512 / 2d), e -> true).isEmpty()) {
			TheMiddleAgesModVariables.MapVariables.get(world).CoordX = Math.round((findEntityInWorldRange(world, EntityPathFinderEntity.class, x, y, z, 512)).getX());
			TheMiddleAgesModVariables.MapVariables.get(world).CoordZ = Math.round((findEntityInWorldRange(world, EntityPathFinderEntity.class, x, y, z, 512)).getZ());
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (!world.getEntitiesOfClass(PassengerCartRidingEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
			if ((findEntityInWorldRange(world, PassengerCartRidingEntity.class, x, y, z, 4)) instanceof PassengerCartRidingEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PassengerCartRidingEntity.DATA_move, 1);
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}