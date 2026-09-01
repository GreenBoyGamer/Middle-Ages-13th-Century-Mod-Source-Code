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

import net.mcreator.themiddleages.init.TheMiddleAgesModMenus;

public class StairClickCutterGUIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.OAK_STAIRS).copy();
				_setstack.setCount(32);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu5 ? _menu5.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_LOG.asItem()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.SPRUCE_STAIRS).copy();
				_setstack.setCount(32);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_LOG.asItem()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.BIRCH_STAIRS).copy();
				_setstack.setCount(32);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu15 ? _menu15.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_LOG.asItem()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.JUNGLE_STAIRS).copy();
				_setstack.setCount(32);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu20 ? _menu20.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_LOG.asItem()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.ACACIA_STAIRS).copy();
				_setstack.setCount(32);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu25 ? _menu25.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.PALE_OAK_LOG.asItem()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.PALE_OAK_STAIRS).copy();
				_setstack.setCount(32);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu30 ? _menu30.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_LOG.asItem()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_STAIRS).copy();
				_setstack.setCount(32);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu35 ? _menu35.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_LOG.asItem()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.MANGROVE_STAIRS).copy();
				_setstack.setCount(32);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
		} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu40 ? _menu40.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_LOG.asItem()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof TheMiddleAgesModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.CHERRY_STAIRS).copy();
				_setstack.setCount(32);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
		}
	}
}