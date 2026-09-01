package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.init.TheMiddleAgesModMenus;
import net.mcreator.themiddleages.entity.PassengerCartRidingEntity;

import java.util.Comparator;

public class DoneButtonClicksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		TheMiddleAgesModVariables.MapVariables.get(world).CoordX = parseDouble((entity instanceof Player _entity0 && _entity0.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(0, "TextField1", "") : "");
		TheMiddleAgesModVariables.MapVariables.get(world).CoordZ = parseDouble((entity instanceof Player _entity1 && _entity1.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu1) ? _menu1.getMenuState(0, "TextField2", "") : "");
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("forceload add" + Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordX) + Math.round(TheMiddleAgesModVariables.MapVariables.get(world).CoordZ)));
		if (!(parseDouble((entity instanceof Player _entity3 && _entity3.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu3) ? _menu3.getMenuState(0, "TextField1", "") : "") > 2048
				&& parseDouble((entity instanceof Player _entity4 && _entity4.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu4) ? _menu4.getMenuState(0, "TextField1", "") : "") < -2048
				&& parseDouble((entity instanceof Player _entity5 && _entity5.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu5) ? _menu5.getMenuState(0, "TextField2", "") : "") > 2048
				&& parseDouble((entity instanceof Player _entity6 && _entity6.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu6) ? _menu6.getMenuState(0, "TextField2", "") : "") < -2048)) {
			if (TheMiddleAgesModVariables.MapVariables.get(world).Wealth > 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, (float) 1.3, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, (float) 1.3, 1, false);
					}
				}
				if (!world.getEntitiesOfClass(PassengerCartRidingEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
					if ((findEntityInWorldRange(world, PassengerCartRidingEntity.class, x, y, z, 4)) instanceof PassengerCartRidingEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PassengerCartRidingEntity.DATA_move, 1);
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				TheMiddleAgesModVariables.MapVariables.get(world).Wealth = Math.round(TheMiddleAgesModVariables.MapVariables.get(world).Wealth - 1);
				TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			} else {
				if (entity instanceof ServerPlayer _player)
					_player.sendSystemMessage(Component.literal("<Wagoner> You Don't Have Enough Gems.."), false);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(2 / 2d), e -> true).isEmpty()) {
					(findEntityInWorldRange(world, Player.class, x, y, z, 2)).stopRiding();
				}
			}
		} else {
			if (entity instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal("<Wagoner> Sorry Mr King, That Is Way Too Far"), false);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, (float) 1.3, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, (float) 1.3, 1, false);
				}
			}
		}
	}

	private static double parseDouble(String s) {
		try {
			return Double.parseDouble(s.trim());
		} catch (Exception e) {
			return 0;
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}