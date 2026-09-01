/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.transfer.item.WorldlyContainerWrapper;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.themiddleages.block.entity.*;
import net.mcreator.themiddleages.TheMiddleAgesMod;

@EventBusSubscriber
public class TheMiddleAgesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, TheMiddleAgesMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MadievalbedBlockEntity>> MEDIEVALBED = register("medievalbed", TheMiddleAgesModBlocks.MEDIEVALBED, MadievalbedBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MedievalChimneyBlockEntity>> MEDIEVAL_CHIMNEY = register("medieval_chimney", TheMiddleAgesModBlocks.MEDIEVAL_CHIMNEY, MedievalChimneyBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MedievalWoodenChairBlockEntity>> MEDIEVAL_WOODEN_CHAIR = register("medieval_wooden_chair", TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_CHAIR, MedievalWoodenChairBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MedievalWoodenChairOakBlockEntity>> MEDIEVAL_WOODEN_CHAIR_OAK = register("medieval_wooden_chair_oak", TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_CHAIR_OAK,
			MedievalWoodenChairOakBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MedievalWoodenChairDarkOakBlockEntity>> MEDIEVAL_WOODEN_CHAIR_DARK_OAK = register("medieval_wooden_chair_dark_oak", TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_CHAIR_DARK_OAK,
			MedievalWoodenChairDarkOakBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WaterMillHubBlockEntity>> WATER_MILL_HUB = register("water_mill_hub", TheMiddleAgesModBlocks.WATER_MILL_HUB, WaterMillHubBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WaterMillExtenderBlockEntity>> WATER_MILL_EXTENDER = register("water_mill_extender", TheMiddleAgesModBlocks.WATER_MILL_EXTENDER, WaterMillExtenderBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WaterMillExtenderCornerBlockEntity>> WATER_MILL_EXTENDER_CORNER = register("water_mill_extender_corner", TheMiddleAgesModBlocks.WATER_MILL_EXTENDER_CORNER,
			WaterMillExtenderCornerBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WaterMillGearBlockEntity>> WATER_MILL_GEAR = register("water_mill_gear", TheMiddleAgesModBlocks.WATER_MILL_GEAR, WaterMillGearBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CrownBlockBlockEntity>> CROWN_BLOCK = register("crown_block", TheMiddleAgesModBlocks.CROWN_BLOCK, CrownBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WaterMillWaterPumpBlockEntity>> WATER_MILL_WATER_PUMP = register("water_mill_water_pump", TheMiddleAgesModBlocks.WATER_MILL_WATER_PUMP, WaterMillWaterPumpBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WaterMillLogCutterBlockEntity>> WATER_MILL_LOG_CUTTER = register("water_mill_log_cutter", TheMiddleAgesModBlocks.WATER_MILL_LOG_CUTTER, WaterMillLogCutterBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.Item.BLOCK, MEDIEVAL_WOODEN_CHAIR_OAK.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, MEDIEVAL_WOODEN_CHAIR.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, WATER_MILL_GEAR.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, CROWN_BLOCK.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, MEDIEVAL_CHIMNEY.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, WATER_MILL_EXTENDER_CORNER.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, MEDIEVAL_WOODEN_CHAIR_DARK_OAK.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, MEDIEVALBED.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, WATER_MILL_HUB.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, WATER_MILL_WATER_PUMP.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, WATER_MILL_EXTENDER.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, WATER_MILL_LOG_CUTTER.get(), WorldlyContainerWrapper::new);
	}
}