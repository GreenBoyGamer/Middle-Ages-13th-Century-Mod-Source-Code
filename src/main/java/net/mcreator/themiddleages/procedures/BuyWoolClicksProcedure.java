package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class BuyWoolClicksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (TheMiddleAgesModVariables.MapVariables.get(world).Wealth > 0) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.WHITE_WOOL).copy();
				_setstack.setCount(64);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			TheMiddleAgesModVariables.MapVariables.get(world).Wealth = TheMiddleAgesModVariables.MapVariables.get(world).Wealth - 1;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}