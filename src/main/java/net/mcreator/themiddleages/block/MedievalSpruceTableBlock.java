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

public class MedievalSpruceTableBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public MedievalSpruceTableBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				case NORTH -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(16, 14, 0, 32, 16, 16), box(27.33333, -0.33333, 12.33333, 30.66667, 15, 15), box(27.33333, -0.33333, -15, 30.66667, 15, -12.33333),
						box(-15.33333, -0.33333, 12.33333, -12, 15, 15), box(-15.33333, -0.33333, -15, -12, 15, -12.33333), box(-16, 14, 0, 0, 16, 16), box(16, 14, -16, 32, 16, 0), box(0, 14, -16, 16, 16, 0), box(-16, 14, -16, 0, 16, 0));
				case EAST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(0, 14, 16, 16, 16, 32), box(1, -0.33333, 27.33333, 3.66667, 15, 30.66667), box(28.33333, -0.33333, 27.33333, 31, 15, 30.66667), box(1, -0.33333, -15.33333, 3.66667, 15, -12),
						box(28.33333, -0.33333, -15.33333, 31, 15, -12), box(0, 14, -16, 16, 16, 0), box(16, 14, 16, 32, 16, 32), box(16, 14, 0, 32, 16, 16), box(16, 14, -16, 32, 16, 0));
				case WEST -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(0, 14, -16, 16, 16, 0), box(12.33333, -0.33333, -14.66667, 15, 15, -11.33333), box(-15, -0.33333, -14.66667, -12.33333, 15, -11.33333),
						box(12.33333, -0.33333, 28, 15, 15, 31.33333), box(-15, -0.33333, 28, -12.33333, 15, 31.33333), box(0, 14, 16, 16, 16, 32), box(-16, 14, -16, 0, 16, 0), box(-16, 14, 0, 0, 16, 16), box(-16, 14, 16, 0, 16, 32));
				default -> Shapes.or(box(0, 14, 0, 16, 16, 16), box(-16, 14, 0, 0, 16, 16), box(-14.66667, -0.33333, 1, -11.33333, 15, 3.66667), box(-14.66667, -0.33333, 28.33333, -11.33333, 15, 31), box(28, -0.33333, 1, 31.33333, 15, 3.66667),
						box(28, -0.33333, 28.33333, 31.33333, 15, 31), box(16, 14, 0, 32, 16, 16), box(-16, 14, 16, 0, 16, 32), box(0, 14, 16, 16, 16, 32), box(16, 14, 16, 32, 16, 32));
			};
		});
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.apply(state);
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