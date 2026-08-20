/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.themiddleages.block.*;
import net.mcreator.themiddleages.TheMiddleAgesMod;

import java.util.function.Function;

public class TheMiddleAgesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TheMiddleAgesMod.MODID);
	public static final DeferredBlock<Block> GRAVE;
	public static final DeferredBlock<Block> MEDIEVAL_DIMENSION_PORTAL;
	public static final DeferredBlock<Block> MEDIEVAL_CLOCK;
	public static final DeferredBlock<Block> MEDIEVALBED;
	public static final DeferredBlock<Block> MEDIEVAL_OAK_WINDOW_BARS;
	public static final DeferredBlock<Block> MEDIEVAL_SPRUCE_WINDOW_BARS;
	public static final DeferredBlock<Block> MEDIEVAL_DARK_OAK_WINDOW_BAR;
	public static final DeferredBlock<Block> MEDIEVAL_IRON_BARS;
	public static final DeferredBlock<Block> MEDIEVAL_CHIMNEY;
	public static final DeferredBlock<Block> MEDIEVAL_WOODEN_SHELF;
	public static final DeferredBlock<Block> MEDIEVAL_WALL_TORCH;
	public static final DeferredBlock<Block> MEDIEVAL_WOODEN_CHAIR;
	public static final DeferredBlock<Block> MEDIEVAL_WOODEN_CHAIR_OAK;
	public static final DeferredBlock<Block> MEDIEVAL_WOODEN_CHAIR_DARK_OAK;
	public static final DeferredBlock<Block> MEDIEVAL_SPRUCE_TABLE;
	public static final DeferredBlock<Block> MEDIEVAL_OAK_TABLE;
	public static final DeferredBlock<Block> MEDIEVAL_DARK_OAK_TABLE;
	public static final DeferredBlock<Block> WOODEN_PLATE;
	public static final DeferredBlock<Block> WOODEN_PLATE_COOKED_CHICKEN;
	public static final DeferredBlock<Block> WOODEN_PLATE_RAW_CHICKEN;
	public static final DeferredBlock<Block> WOODEN_PLATE_RAW_COOKIES;
	public static final DeferredBlock<Block> MEDIEVAL_CANDLE;
	public static final DeferredBlock<Block> DEAD_SKELETON;
	public static final DeferredBlock<Block> DEAD_SKELETON_POS_2;
	public static final DeferredBlock<Block> DEAD_SKELETON_POS_3;
	public static final DeferredBlock<Block> WATER_MILL_HUB;
	public static final DeferredBlock<Block> WATER_MILL_EXTENDER;
	public static final DeferredBlock<Block> WATER_MILL_EXTENDER_CORNER;
	public static final DeferredBlock<Block> WATER_MILL_GEAR;
	static {
		GRAVE = register("grave", GraveBlock::new);
		MEDIEVAL_DIMENSION_PORTAL = register("medieval_dimension_portal", MadievalDimensionPortalBlock::new);
		MEDIEVAL_CLOCK = register("medieval_clock", MadievalClockBlock::new);
		MEDIEVALBED = register("medievalbed", MadievalbedBlock::new);
		MEDIEVAL_OAK_WINDOW_BARS = register("medieval_oak_window_bars", MedievalOakWindowBarsBlock::new);
		MEDIEVAL_SPRUCE_WINDOW_BARS = register("medieval_spruce_window_bars", MedievalSpruceWindowBarsBlock::new);
		MEDIEVAL_DARK_OAK_WINDOW_BAR = register("medieval_dark_oak_window_bar", MedievalDarkOakWindowBarBlock::new);
		MEDIEVAL_IRON_BARS = register("medieval_iron_bars", MedievalIronBarsBlock::new);
		MEDIEVAL_CHIMNEY = register("medieval_chimney", MedievalChimneyBlock::new);
		MEDIEVAL_WOODEN_SHELF = register("medieval_wooden_shelf", MedievalWoodenShelfBlock::new);
		MEDIEVAL_WALL_TORCH = register("medieval_wall_torch", MedievalWallTorchBlock::new);
		MEDIEVAL_WOODEN_CHAIR = register("medieval_wooden_chair", MedievalWoodenChairBlock::new);
		MEDIEVAL_WOODEN_CHAIR_OAK = register("medieval_wooden_chair_oak", MedievalWoodenChairOakBlock::new);
		MEDIEVAL_WOODEN_CHAIR_DARK_OAK = register("medieval_wooden_chair_dark_oak", MedievalWoodenChairDarkOakBlock::new);
		MEDIEVAL_SPRUCE_TABLE = register("medieval_spruce_table", MedievalSpruceTableBlock::new);
		MEDIEVAL_OAK_TABLE = register("medieval_oak_table", MedievalOakTableBlock::new);
		MEDIEVAL_DARK_OAK_TABLE = register("medieval_dark_oak_table", MedievalDarkOakTableBlock::new);
		WOODEN_PLATE = register("wooden_plate", WoodenPlateBlock::new);
		WOODEN_PLATE_COOKED_CHICKEN = register("wooden_plate_cooked_chicken", WoodenPlateCookedChickenBlock::new);
		WOODEN_PLATE_RAW_CHICKEN = register("wooden_plate_raw_chicken", WoodenPlateRawChickenBlock::new);
		WOODEN_PLATE_RAW_COOKIES = register("wooden_plate_raw_cookies", WoodenPlateRawCookiesBlock::new);
		MEDIEVAL_CANDLE = register("medieval_candle", MedievalCandleBlock::new);
		DEAD_SKELETON = register("dead_skeleton", DeadSkeletonBlock::new);
		DEAD_SKELETON_POS_2 = register("dead_skeleton_pos_2", DeadSkeletonPos2Block::new);
		DEAD_SKELETON_POS_3 = register("dead_skeleton_pos_3", DeadSkeletonPos3Block::new);
		WATER_MILL_HUB = register("water_mill_hub", WaterMillHubBlock::new);
		WATER_MILL_EXTENDER = register("water_mill_extender", WaterMillExtenderBlock::new);
		WATER_MILL_EXTENDER_CORNER = register("water_mill_extender_corner", WaterMillExtenderCornerBlock::new);
		WATER_MILL_GEAR = register("water_mill_gear", WaterMillGearBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}