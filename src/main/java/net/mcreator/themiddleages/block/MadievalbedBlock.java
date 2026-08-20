package net.mcreator.themiddleages.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.Containers;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.procedures.MadievalbedOnBlockRightclickedProcedure;
import net.mcreator.themiddleages.block.entity.MadievalbedBlockEntity;

import java.util.function.Function;

public class MadievalbedBlock extends Block implements EntityBlock {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public MadievalbedBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				case NORTH -> Shapes.or(box(-0.66667, 12, -2.66667, 16.66666, 12.66667, 21.33334), box(15.66667, 18.66667, -11.33333, 17.66667, 21.33333, -9.33333), box(14.33333, 14.66667, 21.33333, 16.33333, 17.33333, 23.33333),
						box(4, 16.66667, -10.66667, 12.66666, 18, -9.33333), box(4, 12, -10.66667, 12.66666, 13.33333, -9.33333), box(3.15326, 14.51519, -10.25, 8.75326, 15.18186, -9.75), box(0, 5.333, -9.333, 16, 12, 21.467),
						box(-1, 18.667, -11.333, 1, 21.333, -9.333), box(15.333, 4, -2.667, 16.667, 12, 22));
				case EAST -> Shapes.or(box(-5.33334, 12, -0.66667, 18.66667, 12.66667, 16.66666), box(25.33333, 18.66667, 15.66667, 27.33333, 21.33333, 17.66667), box(-7.33333, 14.66667, 14.33333, -5.33333, 17.33333, 16.33333),
						box(25.33333, 16.66667, 4, 26.66667, 18, 12.66666), box(25.33333, 12, 4, 26.66667, 13.33333, 12.66666), box(25.75, 14.51519, 3.15326, 26.25, 15.18186, 8.75326), box(-5.467, 5.333, 0, 25.333, 12, 16),
						box(25.333, 18.667, -1, 27.333, 21.333, 1), box(-6, 4, 15.333, 18.667, 12, 16.667));
				case WEST -> Shapes.or(box(-2.66667, 12, -0.66666, 21.33334, 12.66667, 16.66667), box(-11.33333, 18.66667, -1.66667, -9.33333, 21.33333, 0.33333), box(21.33333, 14.66667, -0.33333, 23.33333, 17.33333, 1.66667),
						box(-10.66667, 16.66667, 3.33334, -9.33333, 18, 12), box(-10.66667, 12, 3.33334, -9.33333, 13.33333, 12), box(-10.25, 14.51519, 7.24674, -9.75, 15.18186, 12.84674), box(-9.333, 5.333, 0, 21.467, 12, 16),
						box(-11.333, 18.667, 15, -9.333, 21.333, 17), box(-2.667, 4, -0.667, 22, 12, 0.667));
				default -> Shapes.or(box(-0.66666, 12, -5.33334, 16.66667, 12.66667, 18.66667), box(-1.66667, 18.66667, 25.33333, 0.33333, 21.33333, 27.33333), box(-0.33333, 14.66667, -7.33333, 1.66667, 17.33333, -5.33333),
						box(3.33334, 16.66667, 25.33333, 12, 18, 26.66667), box(3.33334, 12, 25.33333, 12, 13.33333, 26.66667), box(7.24674, 14.51519, 25.75, 12.84674, 15.18186, 26.25), box(0, 5.333, -5.467, 16, 12, 25.333),
						box(15, 18.667, 25.333, 17, 21.333, 27.333), box(-0.667, 4, -6, 0.667, 12, 18.667));
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
		MadievalbedOnBlockRightclickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new MadievalbedBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity != null && blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	protected void affectNeighborsAfterRemoval(BlockState blockstate, ServerLevel world, BlockPos blockpos, boolean flag) {
		Containers.updateNeighboursAfterDestroy(blockstate, world, blockpos);
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos, Direction direction) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof MadievalbedBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}