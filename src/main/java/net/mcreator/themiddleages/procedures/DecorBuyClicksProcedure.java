package net.mcreator.themiddleages.procedures;

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
import net.mcreator.themiddleages.init.TheMiddleAgesModBlocks;

public class DecorBuyClicksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (TheMiddleAgesModVariables.MapVariables.get(world).Wealth > 3) {
			TheMiddleAgesModVariables.MapVariables.get(world).Wealth = TheMiddleAgesModVariables.MapVariables.get(world).Wealth - 4;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModBlocks.MEDIEVALBED.get()).copy();
				_setstack.setCount(1);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModBlocks.MEDIEVAL_OAK_WINDOW_BARS.get()).copy();
				_setstack.setCount(3);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModBlocks.MEDIEVAL_SPRUCE_WINDOW_BARS.get()).copy();
				_setstack.setCount(3);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModBlocks.MEDIEVAL_DARK_OAK_WINDOW_BAR.get()).copy();
				_setstack.setCount(3);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModBlocks.MEDIEVAL_IRON_BARS.get()).copy();
				_setstack.setCount(3);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModBlocks.MEDIEVAL_CHIMNEY.get()).copy();
				_setstack.setCount(1);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_SHELF.get()).copy();
				_setstack.setCount(3);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModBlocks.MEDIEVAL_CANDLE.get()).copy();
				_setstack.setCount(3);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
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