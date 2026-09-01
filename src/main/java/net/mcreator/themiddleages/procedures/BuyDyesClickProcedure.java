package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;

public class BuyDyesClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (TheMiddleAgesModVariables.MapVariables.get(world).Wealth > 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.BLACK_DYE).copy();
				_setstack.setCount(12);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.RED_DYE).copy();
				_setstack.setCount(12);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.GREEN_DYE).copy();
				_setstack.setCount(12);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.BROWN_DYE).copy();
				_setstack.setCount(12);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.BLUE_DYE).copy();
				_setstack.setCount(12);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.PURPLE_DYE).copy();
				_setstack.setCount(12);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.CYAN_DYE).copy();
				_setstack.setCount(12);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.YELLOW_DYE).copy();
				_setstack.setCount(12);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.BONE_MEAL).copy();
				_setstack.setCount(12);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.LIME_DYE).copy();
				_setstack.setCount(12);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			TheMiddleAgesModVariables.MapVariables.get(world).Wealth = TheMiddleAgesModVariables.MapVariables.get(world).Wealth - 2;
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