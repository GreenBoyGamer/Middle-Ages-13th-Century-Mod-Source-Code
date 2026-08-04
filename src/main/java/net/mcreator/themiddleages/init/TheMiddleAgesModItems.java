/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.themiddleages.item.MadievalDimensionItem;
import net.mcreator.themiddleages.TheMiddleAgesMod;

public class TheMiddleAgesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TheMiddleAgesMod.MODID);
	public static final DeferredItem<Item> KNIGHT_SPAWN_EGG;
	public static final DeferredItem<Item> CIVILIAN_1_SPAWN_EGG;
	public static final DeferredItem<Item> BREAD_SELLER_SPAWN_EGG;
	public static final DeferredItem<Item> GRAVE;
	public static final DeferredItem<Item> SOLDIER_SPAWN_EGG;
	public static final DeferredItem<Item> DARK_KNIGHT_SPAWN_EGG;
	public static final DeferredItem<Item> DARK_SOLDIER_SPAWN_EGG;
	public static final DeferredItem<Item> MADIEVAL_DIMENSION;
	public static final DeferredItem<Item> MADIEVAL_HORSE_SPAWN_EGG;
	public static final DeferredItem<Item> ARCHER_SPAWN_EGG;
	public static final DeferredItem<Item> ENEMY_ARCHER_SPAWN_EGG;
	public static final DeferredItem<Item> CIVILIAN_2_SPAWN_EGG;
	public static final DeferredItem<Item> PASSENGER_CART_SPAWN_EGG;
	public static final DeferredItem<Item> BUYER_SPAWN_EGG;
	public static final DeferredItem<Item> PASSENGER_CART_RIDING_SPAWN_EGG;
	static {
		KNIGHT_SPAWN_EGG = REGISTRY.register("knight_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.KNIGHT, -13421773, -10079488, new Item.Properties()));
		CIVILIAN_1_SPAWN_EGG = REGISTRY.register("civilian_1_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.CIVILIAN_1, -1, -16711732, new Item.Properties()));
		BREAD_SELLER_SPAWN_EGG = REGISTRY.register("bread_seller_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.BREAD_SELLER, -1, -16724788, new Item.Properties()));
		GRAVE = block(TheMiddleAgesModBlocks.GRAVE);
		SOLDIER_SPAWN_EGG = REGISTRY.register("soldier_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.SOLDIER, -13421773, -6750208, new Item.Properties()));
		DARK_KNIGHT_SPAWN_EGG = REGISTRY.register("dark_knight_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.DARK_KNIGHT, -13421773, -16777216, new Item.Properties()));
		DARK_SOLDIER_SPAWN_EGG = REGISTRY.register("dark_soldier_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.DARK_SOLDIER, -13421773, -16777216, new Item.Properties()));
		MADIEVAL_DIMENSION = REGISTRY.register("madieval_dimension", MadievalDimensionItem::new);
		MADIEVAL_HORSE_SPAWN_EGG = REGISTRY.register("madieval_horse_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.MADIEVAL_HORSE, -11719936, -7528, new Item.Properties()));
		ARCHER_SPAWN_EGG = REGISTRY.register("archer_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.ARCHER, -14935012, -6750208, new Item.Properties()));
		ENEMY_ARCHER_SPAWN_EGG = REGISTRY.register("enemy_archer_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.ENEMY_ARCHER, -14935012, -16777216, new Item.Properties()));
		CIVILIAN_2_SPAWN_EGG = REGISTRY.register("civilian_2_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.CIVILIAN_2, -1, -16738048, new Item.Properties()));
		PASSENGER_CART_SPAWN_EGG = REGISTRY.register("passenger_cart_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.PASSENGER_CART, -1, -1, new Item.Properties()));
		BUYER_SPAWN_EGG = REGISTRY.register("buyer_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.BUYER, -1, -16777114, new Item.Properties()));
		PASSENGER_CART_RIDING_SPAWN_EGG = REGISTRY.register("passenger_cart_riding_spawn_egg", () -> new DeferredSpawnEggItem(TheMiddleAgesModEntities.PASSENGER_CART_RIDING, -1, -1, new Item.Properties()));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}