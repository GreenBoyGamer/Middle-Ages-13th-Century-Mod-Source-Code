package net.mcreator.themiddleages.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.function.Function;

public class MedievalCandleBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public MedievalCandleBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f).lightLevel(blockstate -> 14).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				case NORTH -> Shapes.or(box(4.66667, 0.66667, 4.66667, 11.33333, 1.33333, 11.33333), box(5.33333, 0.66667, 5.33333, 10.66667, 2, 10.66667), box(6.67095, 2, 6.69734, 9.33762, 8, 9.36401),
						box(7.43333, 8.66667, 7.43333, 8.56667, 14.66667, 8.56667), box(7.53333, 13.33333, 7.23333, 8.46667, 14.66276, 8.76667), box(7.53333, 12.08333, 7.33333, 8.46667, 14.65495, 8.66667),
						box(7.58267, 12.08333, 7.30433, 8.516, 14.65495, 8.63767), box(7.58267, 13.33333, 7.20433, 8.516, 14.66276, 8.73767), box(7.83333, 12.91667, 7.83333, 8.16667, 15.41667, 8.16667),
						box(7.80417, 15.24461, 8.02583, 8.27417, 15.47961, 8.3), box(7.80417, 15.24461, 7.79083, 8.27417, 15.47961, 8.065), box(7.75717, 15.24461, 7.99024, 8.32117, 15.47961, 8.2644),
						box(7.80417, 15.47961, 7.67333, 8.27417, 15.71461, 7.9475), box(7.80417, 15.47961, 8.07283, 8.27417, 15.71461, 8.347), box(7.80417, 15.71461, 7.74383, 8.27417, 15.94961, 8.018),
						box(7.92167, 15.71461, 7.9994, 8.15667, 15.94961, 8.2295), box(7.80417, 15.47961, 7.88483, 8.27417, 15.71461, 8.159), box(7.08333, 8.66667, 7.08333, 8.91667, 9.33333, 8.91667),
						box(6.42095, 8, 6.44734, 9.58762, 8.66667, 9.61401), box(6.42095, 2.66667, 6.44734, 9.58762, 3.33333, 9.61401), box(6.17095, 5.33333, 6.19734, 9.83762, 6.66667, 9.86401),
						box(5.92095, 5.58333, 5.94734, 10.08762, 6.41667, 10.11401), box(4, 0, 4, 12, 0.66667, 12));
				case EAST -> Shapes.or(box(4.66667, 0.66667, 4.66667, 11.33333, 1.33333, 11.33333), box(5.33333, 0.66667, 5.33333, 10.66667, 2, 10.66667), box(6.63599, 2, 6.67095, 9.30266, 8, 9.33762),
						box(7.43333, 8.66667, 7.43333, 8.56667, 14.66667, 8.56667), box(7.23333, 13.33333, 7.53333, 8.76667, 14.66276, 8.46667), box(7.33333, 12.08333, 7.53333, 8.66667, 14.65495, 8.46667),
						box(7.36233, 12.08333, 7.58267, 8.69567, 14.65495, 8.516), box(7.26233, 13.33333, 7.58267, 8.79567, 14.66276, 8.516), box(7.83333, 12.91667, 7.83333, 8.16667, 15.41667, 8.16667),
						box(7.7, 15.24461, 7.80417, 7.97417, 15.47961, 8.27417), box(7.935, 15.24461, 7.80417, 8.20917, 15.47961, 8.27417), box(7.7356, 15.24461, 7.75717, 8.00976, 15.47961, 8.32117),
						box(8.0525, 15.47961, 7.80417, 8.32667, 15.71461, 8.27417), box(7.653, 15.47961, 7.80417, 7.92717, 15.71461, 8.27417), box(7.982, 15.71461, 7.80417, 8.25617, 15.94961, 8.27417),
						box(7.7705, 15.71461, 7.92167, 8.0006, 15.94961, 8.15667), box(7.841, 15.47961, 7.80417, 8.11517, 15.71461, 8.27417), box(7.08333, 8.66667, 7.08333, 8.91667, 9.33333, 8.91667),
						box(6.38599, 8, 6.42095, 9.55266, 8.66667, 9.58762), box(6.38599, 2.66667, 6.42095, 9.55266, 3.33333, 9.58762), box(6.13599, 5.33333, 6.17095, 9.80266, 6.66667, 9.83762),
						box(5.88599, 5.58333, 5.92095, 10.05266, 6.41667, 10.08762), box(4, 0, 4, 12, 0.66667, 12));
				case WEST -> Shapes.or(box(4.66667, 0.66667, 4.66667, 11.33333, 1.33333, 11.33333), box(5.33333, 0.66667, 5.33333, 10.66667, 2, 10.66667), box(6.69734, 2, 6.66238, 9.36401, 8, 9.32905),
						box(7.43333, 8.66667, 7.43333, 8.56667, 14.66667, 8.56667), box(7.23333, 13.33333, 7.53333, 8.76667, 14.66276, 8.46667), box(7.33333, 12.08333, 7.53333, 8.66667, 14.65495, 8.46667),
						box(7.30433, 12.08333, 7.484, 8.63767, 14.65495, 8.41733), box(7.20433, 13.33333, 7.484, 8.73767, 14.66276, 8.41733), box(7.83333, 12.91667, 7.83333, 8.16667, 15.41667, 8.16667),
						box(8.02583, 15.24461, 7.72583, 8.3, 15.47961, 8.19583), box(7.79083, 15.24461, 7.72583, 8.065, 15.47961, 8.19583), box(7.99024, 15.24461, 7.67883, 8.2644, 15.47961, 8.24283),
						box(7.67333, 15.47961, 7.72583, 7.9475, 15.71461, 8.19583), box(8.07283, 15.47961, 7.72583, 8.347, 15.71461, 8.19583), box(7.74383, 15.71461, 7.72583, 8.018, 15.94961, 8.19583),
						box(7.9994, 15.71461, 7.84333, 8.2295, 15.94961, 8.07833), box(7.88483, 15.47961, 7.72583, 8.159, 15.71461, 8.19583), box(7.08333, 8.66667, 7.08333, 8.91667, 9.33333, 8.91667),
						box(6.44734, 8, 6.41238, 9.61401, 8.66667, 9.57905), box(6.44734, 2.66667, 6.41238, 9.61401, 3.33333, 9.57905), box(6.19734, 5.33333, 6.16238, 9.86401, 6.66667, 9.82905),
						box(5.94734, 5.58333, 5.91238, 10.11401, 6.41667, 10.07905), box(4, 0, 4, 12, 0.66667, 12));
				default -> Shapes.or(box(4.66667, 0.66667, 4.66667, 11.33333, 1.33333, 11.33333), box(5.33333, 0.66667, 5.33333, 10.66667, 2, 10.66667), box(6.66238, 2, 6.63599, 9.32905, 8, 9.30266),
						box(7.43333, 8.66667, 7.43333, 8.56667, 14.66667, 8.56667), box(7.53333, 13.33333, 7.23333, 8.46667, 14.66276, 8.76667), box(7.53333, 12.08333, 7.33333, 8.46667, 14.65495, 8.66667),
						box(7.484, 12.08333, 7.36233, 8.41733, 14.65495, 8.69567), box(7.484, 13.33333, 7.26233, 8.41733, 14.66276, 8.79567), box(7.83333, 12.91667, 7.83333, 8.16667, 15.41667, 8.16667),
						box(7.72583, 15.24461, 7.7, 8.19583, 15.47961, 7.97417), box(7.72583, 15.24461, 7.935, 8.19583, 15.47961, 8.20917), box(7.67883, 15.24461, 7.7356, 8.24283, 15.47961, 8.00976),
						box(7.72583, 15.47961, 8.0525, 8.19583, 15.71461, 8.32667), box(7.72583, 15.47961, 7.653, 8.19583, 15.71461, 7.92717), box(7.72583, 15.71461, 7.982, 8.19583, 15.94961, 8.25617),
						box(7.84333, 15.71461, 7.7705, 8.07833, 15.94961, 8.0006), box(7.72583, 15.47961, 7.841, 8.19583, 15.71461, 8.11517), box(7.08333, 8.66667, 7.08333, 8.91667, 9.33333, 8.91667),
						box(6.41238, 8, 6.38599, 9.57905, 8.66667, 9.55266), box(6.41238, 2.66667, 6.38599, 9.57905, 3.33333, 9.55266), box(6.16238, 5.33333, 6.13599, 9.82905, 6.66667, 9.80266),
						box(5.91238, 5.58333, 5.88599, 10.07905, 6.41667, 10.05266), box(4, 0, 4, 12, 0.66667, 12));
			};
		});
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.apply(state);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		return state.setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}