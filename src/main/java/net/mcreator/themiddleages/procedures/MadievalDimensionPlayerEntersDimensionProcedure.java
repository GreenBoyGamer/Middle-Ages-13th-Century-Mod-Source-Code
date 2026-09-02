package net.mcreator.themiddleages.procedures;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.network.PlayPlayerAnimationMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModItems;
import net.mcreator.themiddleages.init.TheMiddleAgesModBlocks;
import net.mcreator.themiddleages.TheMiddleAgesMod;

public class MadievalDimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		TheMiddleAgesMod.queueServerWork(20, () -> {
			TheMiddleAgesModVariables.MapVariables.get(world).days_Count = true;
			TheMiddleAgesModVariables.MapVariables.get(world).GUIController = 1;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "tp @p 421 91 100");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"effect give @p resistance 10 255 true");
			world.setBlock(new BlockPos(421, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 421, 100), 100), TheMiddleAgesModBlocks.DEAD_SKELETON.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(421, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 421, 102), 102), TheMiddleAgesModBlocks.CROWN_BLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(423, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 423, 101), 101), TheMiddleAgesModBlocks.DEAD_SKELETON_POS_2.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(419, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 419, 97), 97), TheMiddleAgesModBlocks.DEAD_SKELETON_POS_3.get().defaultBlockState(), 3);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack10 = new ItemStack(TheMiddleAgesModItems.MEDIEVAL_IRON_SWORD.get()).copy();
				_setstack10.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack10);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModItems.REMOTE.get()).copy();
				_setstack.setCount(1);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player) {
				if (entity.level().isClientSide()) {
					CompoundTag data = entity.getPersistentData();
					data.putString("PlayerCurrentAnimation", "the_middle_ages:won");
					data.putBoolean("OverrideCurrentAnimation", true);
					data.putBoolean("FirstPersonAnimation", true);
				} else {
					PacketDistributor.sendToPlayersInDimension((ServerLevel) entity.level(), new PlayPlayerAnimationMessage(entity.getId(), "the_middle_ages:won", true, true));
				}
			}
		});
	}
}