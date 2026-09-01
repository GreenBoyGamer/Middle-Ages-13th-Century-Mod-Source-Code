package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class FollowNoClicksProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TheMiddleAgesModVariables.MapVariables.get(world).follow = false;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}