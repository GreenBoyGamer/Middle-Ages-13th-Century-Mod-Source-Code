package net.mcreator.themiddleages.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.function.Function;

public class GraveBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public GraveBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				case NORTH -> Shapes.or(box(0.66667, 0, 12, 15.33333, 14, 15.33333), box(4.66667, 6, 10, 11.33333, 12.66667, 14.66667), box(2.66667, 0, 11.9995, 13.33333, 16, 15.33283), box(0.66667, 0, 0.66667, 15.33333, 2, 15.33333),
						box(2.66667, 0, 2.66667, 13.33333, 2.5, 11.33333), box(0, 0, 0, 2, 2.66667, 16), box(2, 0, 0, 14, 2.66667, 2), box(2, 0, 14, 14, 2.66667, 16), box(14, 0, 0, 16, 2.66667, 16));
				case EAST -> Shapes.or(box(0.66667, 0, 0.66667, 4, 14, 15.33333), box(1.33333, 6, 4.66667, 6, 12.66667, 11.33333), box(0.66717, 0, 2.66667, 4.0005, 16, 13.33333), box(0.66667, 0, 0.66667, 15.33333, 2, 15.33333),
						box(4.66667, 0, 2.66667, 13.33333, 2.5, 13.33333), box(0, 0, 0, 16, 2.66667, 2), box(14, 0, 2, 16, 2.66667, 14), box(0, 0, 2, 2, 2.66667, 14), box(0, 0, 14, 16, 2.66667, 16));
				case WEST -> Shapes.or(box(12, 0, 0.66667, 15.33333, 14, 15.33333), box(10, 6, 4.66667, 14.66667, 12.66667, 11.33333), box(11.9995, 0, 2.66667, 15.33283, 16, 13.33333), box(0.66667, 0, 0.66667, 15.33333, 2, 15.33333),
						box(2.66667, 0, 2.66667, 11.33333, 2.5, 13.33333), box(0, 0, 14, 16, 2.66667, 16), box(0, 0, 2, 2, 2.66667, 14), box(14, 0, 2, 16, 2.66667, 14), box(0, 0, 0, 16, 2.66667, 2));
				default -> Shapes.or(box(0.66667, 0, 0.66667, 15.33333, 14, 4), box(4.66667, 6, 1.33333, 11.33333, 12.66667, 6), box(2.66667, 0, 0.66717, 13.33333, 16, 4.0005), box(0.66667, 0, 0.66667, 15.33333, 2, 15.33333),
						box(2.66667, 0, 4.66667, 13.33333, 2.5, 13.33333), box(14, 0, 0, 16, 2.66667, 16), box(2, 0, 14, 14, 2.66667, 16), box(2, 0, 0, 14, 2.66667, 2), box(0, 0, 0, 2, 2.66667, 16));
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