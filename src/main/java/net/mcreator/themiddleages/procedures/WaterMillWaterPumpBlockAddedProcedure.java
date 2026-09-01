package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.init.TheMiddleAgesModBlocks;

public class WaterMillWaterPumpBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.NORTH) {
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_GEAR.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z + 1), "Connected") > 0) {
					if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
						if (!((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR)) {
							if (!((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR)) {
								{
									BlockPos _bp = BlockPos.containing(x, y - 4, z);
									BlockState _bs = Blocks.WATER.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Property<?> _propertyOld : _bso.getProperties()) {
										Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
										if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
											try {
												_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
								world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.WATER.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
							}
						}
					}
				}
			}
		} else if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.SOUTH) {
			if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_GEAR.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z - 1), "Connected") > 0) {
					if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
						if (!((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR)) {
							if (!((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR)) {
								{
									BlockPos _bp = BlockPos.containing(x, y - 4, z);
									BlockState _bs = Blocks.WATER.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Property<?> _propertyOld : _bso.getProperties()) {
										Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
										if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
											try {
												_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
								world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.WATER.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
							}
						}
					}
				}
			}
		} else if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.EAST) {
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_GEAR.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x - 1, y, z), "Connected") > 0) {
					if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
						if (!((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR)) {
							if (!((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR)) {
								{
									BlockPos _bp = BlockPos.containing(x, y - 4, z);
									BlockState _bs = Blocks.WATER.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Property<?> _propertyOld : _bso.getProperties()) {
										Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
										if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
											try {
												_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
								world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.WATER.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
							}
						}
					}
				}
			}
		} else if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.WEST) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == TheMiddleAgesModBlocks.WATER_MILL_GEAR.get()) {
				if (getBlockNBTNumber(world, BlockPos.containing(x + 1, y, z), "Connected") > 0) {
					if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
						if (!((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR)) {
							if (!((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR)) {
								{
									BlockPos _bp = BlockPos.containing(x, y - 4, z);
									BlockState _bs = Blocks.WATER.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Property<?> _propertyOld : _bso.getProperties()) {
										Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
										if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
											try {
												_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
								world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.WATER.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
							}
						}
					}
				}
			}
		}
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