package net.mcreator.themiddleages.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.procedures.WoodenPlateCookedChickenOnBlockRightclickedProcedure;

import java.util.function.Function;

public class WoodenPlateCookedChickenBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public WoodenPlateCookedChickenBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.BASS));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				case NORTH -> Shapes.or(box(4, 0, 4.66667, 12, 1.33333, 12), box(4, 1.08333, 3.33333, 12, 2.41667, 4.66667), box(4, 1.08333, 12, 12, 2.41667, 13.33333), box(12, 1.08333, 4.66667, 13.33333, 2.41667, 12),
						box(2.66667, 1.08333, 4.66667, 4, 2.41667, 12));
				case EAST -> Shapes.or(box(4, 0, 4, 11.33333, 1.33333, 12), box(11.33333, 1.08333, 4, 12.66667, 2.41667, 12), box(2.66667, 1.08333, 4, 4, 2.41667, 12), box(4, 1.08333, 12, 11.33333, 2.41667, 13.33333),
						box(4, 1.08333, 2.66667, 11.33333, 2.41667, 4));
				case WEST -> Shapes.or(box(4.66667, 0, 4, 12, 1.33333, 12), box(3.33333, 1.08333, 4, 4.66667, 2.41667, 12), box(12, 1.08333, 4, 13.33333, 2.41667, 12), box(4.66667, 1.08333, 2.66667, 12, 2.41667, 4),
						box(4.66667, 1.08333, 12, 12, 2.41667, 13.33333));
				default -> Shapes.or(box(4, 0, 4, 12, 1.33333, 11.33333), box(4, 1.08333, 11.33333, 12, 2.41667, 12.66667), box(4, 1.08333, 2.66667, 12, 2.41667, 4), box(2.66667, 1.08333, 4, 4, 2.41667, 11.33333),
						box(12, 1.08333, 4, 13.33333, 2.41667, 11.33333));
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

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		WoodenPlateCookedChickenOnBlockRightclickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}