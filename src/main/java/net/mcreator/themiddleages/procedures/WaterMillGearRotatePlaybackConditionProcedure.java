package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.init.TheMiddleAgesModBlocks;

public class WaterMillGearRotatePlaybackConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.NORTH) {
			if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER_CORNER.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z - 1), "Connected") > 0) {
					return true;
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z - 1), "Connected") > 0) {
					return true;
				}
			}
		} else if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.SOUTH) {
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER_CORNER.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z + 1), "Connected") > 0) {
					return true;
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z + 1), "Connected") > 0) {
					return true;
				}
			}
		} else if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.EAST) {
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER_CORNER.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x - 1, y, z), "Connected") > 0) {
					return true;
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x - 1, y, z), "Connected") > 0) {
					return true;
				}
			}
		} else if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.WEST) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER_CORNER.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x + 1, y, z), "Connected") > 0) {
					return true;
				}
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x + 1, y, z), "Connected") > 0) {
					return true;
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER_CORNER.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER.get()) {
			return true;
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER_CORNER.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_EXTENDER.get()) {
			return true;
		}
		return false;
	}

	private static Direction getBlockDirection(LevelAccessor world, BlockPos pos) {
		BlockState blockState = world.getBlockState(pos);
		Property<?> property = blockState.getBlock().getStateDefinition().getProperty("facing");
		if (property != null && blockState.getValue(property) instanceof Direction direction)
			return direction;
		else if (blockState.hasProperty(BlockStateProperties.AXIS))
			return Direction.fromAxisAndDirection(blockState.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
		else if (blockState.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
			return Direction.fromAxisAndDirection(blockState.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
		return Direction.NORTH;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}