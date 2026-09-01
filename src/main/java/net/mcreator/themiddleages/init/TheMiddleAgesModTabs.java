/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.themiddleages.TheMiddleAgesMod;

@EventBusSubscriber
public class TheMiddleAgesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheMiddleAgesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_MIDDLE_AGES_ENTITIES = REGISTRY.register("the_middle_ages_entities",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_middle_ages.the_middle_ages_entities")).icon(() -> new ItemStack(Blocks.SPAWNER)).displayItems((parameters, tabData) -> {
				tabData.accept(TheMiddleAgesModItems.KNIGHT_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.CIVILIAN_1_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.BREAD_SELLER_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.SOLDIER_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.DARK_KNIGHT_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.DARK_SOLDIER_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.MEDIEVAL_HORSE_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.ARCHER_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.ENEMY_ARCHER_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.CIVILIAN_2_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.PASSENGER_CART_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.BUYER_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.CIVILIAN_3_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.WANDERER_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.CIVILIAN_5_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.CIVILIAN_4_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.DARKKING_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.GHOST_OF_CRUEL_KING_SPAWN_EGG.get());
				tabData.accept(TheMiddleAgesModItems.BOUNTY_PROVIDER_SPAWN_EGG.get());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_MIDDLE_AGES_BLOCKS = REGISTRY.register("the_middle_ages_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_middle_ages.the_middle_ages_blocks")).icon(() -> new ItemStack(TheMiddleAgesModBlocks.MEDIEVALBED.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheMiddleAgesModBlocks.GRAVE.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_CLOCK.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVALBED.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_OAK_WINDOW_BARS.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_SPRUCE_WINDOW_BARS.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_DARK_OAK_WINDOW_BAR.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_IRON_BARS.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_CHIMNEY.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_SHELF.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_WALL_TORCH.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_CHAIR.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_CHAIR_OAK.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_CHAIR_DARK_OAK.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_SPRUCE_TABLE.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_OAK_TABLE.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_DARK_OAK_TABLE.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.WOODEN_PLATE.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.MEDIEVAL_CANDLE.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.DEAD_SKELETON.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.DEAD_SKELETON_POS_2.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.DEAD_SKELETON_POS_3.get().asItem());
				tabData.accept(TheMiddleAgesModItems.WRITTEN.get());
				tabData.accept(TheMiddleAgesModBlocks.CROWN_BLOCK.get().asItem());
				tabData.accept(TheMiddleAgesModItems.HISTORY.get());
			}).withTabsBefore(THE_MIDDLE_AGES_ENTITIES.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_MIDDLE_AGES_COMBAT_ITEMS = REGISTRY.register("the_middle_ages_combat_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_middle_ages.the_middle_ages_combat_items")).icon(() -> new ItemStack(TheMiddleAgesModItems.SOLDIER_ARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheMiddleAgesModItems.REMOTE.get());
				tabData.accept(TheMiddleAgesModItems.SOLDIER_ARMOR_HELMET.get());
				tabData.accept(TheMiddleAgesModItems.SOLDIER_ARMOR_CHESTPLATE.get());
				tabData.accept(TheMiddleAgesModItems.SOLDIER_ARMOR_LEGGINGS.get());
				tabData.accept(TheMiddleAgesModItems.SOLDIER_ARMOR_BOOTS.get());
				tabData.accept(TheMiddleAgesModItems.CROWN_HELMET.get());
				tabData.accept(TheMiddleAgesModItems.LEATHER_CLOTHS_CHESTPLATE.get());
				tabData.accept(TheMiddleAgesModItems.LEATHER_CLOTHS_LEGGINGS.get());
				tabData.accept(TheMiddleAgesModItems.LEATHER_CLOTHS_BOOTS.get());
				tabData.accept(TheMiddleAgesModItems.GHOST_SUMMONER.get());
				tabData.accept(TheMiddleAgesModItems.MEDIEVAL_IRON_SWORD.get());
			}).withTabsBefore(THE_MIDDLE_AGES_BLOCKS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_MIDDLE_AGES = REGISTRY.register("the_middle_ages",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_middle_ages.the_middle_ages")).icon(() -> new ItemStack(TheMiddleAgesModBlocks.WATER_MILL_HUB.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheMiddleAgesModBlocks.WATER_MILL_HUB.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.WATER_MILL_EXTENDER.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.WATER_MILL_EXTENDER_CORNER.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.WATER_MILL_GEAR.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.WATER_MILL_WATER_PUMP.get().asItem());
				tabData.accept(TheMiddleAgesModBlocks.WATER_MILL_LOG_CUTTER.get().asItem());
				tabData.accept(TheMiddleAgesModItems.WHEEL.get());
			}).withTabsBefore(THE_MIDDLE_AGES_COMBAT_ITEMS.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TheMiddleAgesModItems.MEDIEVAL_DIMENSION.get());
		}
	}
}