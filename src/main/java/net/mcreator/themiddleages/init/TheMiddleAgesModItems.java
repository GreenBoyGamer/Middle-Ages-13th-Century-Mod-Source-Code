/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.themiddleages.item.inventory.WrittenInventoryCapability;
import net.mcreator.themiddleages.item.WrittenItem;
import net.mcreator.themiddleages.item.RemoteItem;
import net.mcreator.themiddleages.item.MadievalDimensionItem;
import net.mcreator.themiddleages.TheMiddleAgesMod;

import java.util.function.Function;

@EventBusSubscriber
public class TheMiddleAgesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TheMiddleAgesMod.MODID);
	public static final DeferredItem<Item> KNIGHT_SPAWN_EGG;
	public static final DeferredItem<Item> CIVILIAN_1_SPAWN_EGG;
	public static final DeferredItem<Item> BREAD_SELLER_SPAWN_EGG;
	public static final DeferredItem<Item> GRAVE;
	public static final DeferredItem<Item> SOLDIER_SPAWN_EGG;
	public static final DeferredItem<Item> DARK_KNIGHT_SPAWN_EGG;
	public static final DeferredItem<Item> DARK_SOLDIER_SPAWN_EGG;
	public static final DeferredItem<Item> MEDIEVAL_DIMENSION;
	public static final DeferredItem<Item> MEDIEVAL_HORSE_SPAWN_EGG;
	public static final DeferredItem<Item> ARCHER_SPAWN_EGG;
	public static final DeferredItem<Item> ENEMY_ARCHER_SPAWN_EGG;
	public static final DeferredItem<Item> CIVILIAN_2_SPAWN_EGG;
	public static final DeferredItem<Item> PASSENGER_CART_SPAWN_EGG;
	public static final DeferredItem<Item> BUYER_SPAWN_EGG;
	public static final DeferredItem<Item> PASSENGER_CART_RIDING_SPAWN_EGG;
	public static final DeferredItem<Item> CIVILIAN_3_SPAWN_EGG;
	public static final DeferredItem<Item> MEDIEVAL_CLOCK;
	public static final DeferredItem<Item> MEDIEVALBED;
	public static final DeferredItem<Item> MEDIEVAL_OAK_WINDOW_BARS;
	public static final DeferredItem<Item> MEDIEVAL_SPRUCE_WINDOW_BARS;
	public static final DeferredItem<Item> MEDIEVAL_DARK_OAK_WINDOW_BAR;
	public static final DeferredItem<Item> MEDIEVAL_IRON_BARS;
	public static final DeferredItem<Item> MEDIEVAL_CHIMNEY;
	public static final DeferredItem<Item> MEDIEVAL_WOODEN_SHELF;
	public static final DeferredItem<Item> MEDIEVAL_WALL_TORCH;
	public static final DeferredItem<Item> MEDIEVAL_WOODEN_CHAIR;
	public static final DeferredItem<Item> MEDIEVAL_WOODEN_CHAIR_OAK;
	public static final DeferredItem<Item> MEDIEVAL_WOODEN_CHAIR_DARK_OAK;
	public static final DeferredItem<Item> MEDIEVAL_SPRUCE_TABLE;
	public static final DeferredItem<Item> MEDIEVAL_OAK_TABLE;
	public static final DeferredItem<Item> MEDIEVAL_DARK_OAK_TABLE;
	public static final DeferredItem<Item> WOODEN_PLATE;
	public static final DeferredItem<Item> WOODEN_PLATE_COOKED_CHICKEN;
	public static final DeferredItem<Item> WOODEN_PLATE_RAW_CHICKEN;
	public static final DeferredItem<Item> WOODEN_PLATE_RAW_COOKIES;
	public static final DeferredItem<Item> MEDIEVAL_CANDLE;
	public static final DeferredItem<Item> DEAD_SKELETON;
	public static final DeferredItem<Item> DEAD_SKELETON_POS_2;
	public static final DeferredItem<Item> DEAD_SKELETON_POS_3;
	public static final DeferredItem<Item> WANDERER_SPAWN_EGG;
	public static final DeferredItem<Item> WRITTEN;
	public static final DeferredItem<Item> REMOTE;
	public static final DeferredItem<Item> WATER_MILL_HUB;
	public static final DeferredItem<Item> WATER_MILL_EXTENDER;
	public static final DeferredItem<Item> WATER_MILL_EXTENDER_CORNER;
	public static final DeferredItem<Item> WATER_MILL_GEAR;
	static {
		KNIGHT_SPAWN_EGG = register("knight_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.KNIGHT.get())));
		CIVILIAN_1_SPAWN_EGG = register("civilian_1_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.CIVILIAN_1.get())));
		BREAD_SELLER_SPAWN_EGG = register("bread_seller_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.BREAD_SELLER.get())));
		GRAVE = block(TheMiddleAgesModBlocks.GRAVE);
		SOLDIER_SPAWN_EGG = register("soldier_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.SOLDIER.get())));
		DARK_KNIGHT_SPAWN_EGG = register("dark_knight_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.DARK_KNIGHT.get())));
		DARK_SOLDIER_SPAWN_EGG = register("dark_soldier_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.DARK_SOLDIER.get())));
		MEDIEVAL_DIMENSION = register("medieval_dimension", MadievalDimensionItem::new);
		MEDIEVAL_HORSE_SPAWN_EGG = register("medieval_horse_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.MEDIEVAL_HORSE.get())));
		ARCHER_SPAWN_EGG = register("archer_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.ARCHER.get())));
		ENEMY_ARCHER_SPAWN_EGG = register("enemy_archer_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.ENEMY_ARCHER.get())));
		CIVILIAN_2_SPAWN_EGG = register("civilian_2_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.CIVILIAN_2.get())));
		PASSENGER_CART_SPAWN_EGG = register("passenger_cart_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.PASSENGER_CART.get())));
		BUYER_SPAWN_EGG = register("buyer_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.BUYER.get())));
		PASSENGER_CART_RIDING_SPAWN_EGG = register("passenger_cart_riding_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.PASSENGER_CART_RIDING.get())));
		CIVILIAN_3_SPAWN_EGG = register("civilian_3_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.CIVILIAN_3.get())));
		MEDIEVAL_CLOCK = block(TheMiddleAgesModBlocks.MEDIEVAL_CLOCK);
		MEDIEVALBED = block(TheMiddleAgesModBlocks.MEDIEVALBED);
		MEDIEVAL_OAK_WINDOW_BARS = block(TheMiddleAgesModBlocks.MEDIEVAL_OAK_WINDOW_BARS);
		MEDIEVAL_SPRUCE_WINDOW_BARS = block(TheMiddleAgesModBlocks.MEDIEVAL_SPRUCE_WINDOW_BARS);
		MEDIEVAL_DARK_OAK_WINDOW_BAR = block(TheMiddleAgesModBlocks.MEDIEVAL_DARK_OAK_WINDOW_BAR);
		MEDIEVAL_IRON_BARS = block(TheMiddleAgesModBlocks.MEDIEVAL_IRON_BARS);
		MEDIEVAL_CHIMNEY = block(TheMiddleAgesModBlocks.MEDIEVAL_CHIMNEY);
		MEDIEVAL_WOODEN_SHELF = block(TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_SHELF);
		MEDIEVAL_WALL_TORCH = block(TheMiddleAgesModBlocks.MEDIEVAL_WALL_TORCH);
		MEDIEVAL_WOODEN_CHAIR = block(TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_CHAIR);
		MEDIEVAL_WOODEN_CHAIR_OAK = block(TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_CHAIR_OAK);
		MEDIEVAL_WOODEN_CHAIR_DARK_OAK = block(TheMiddleAgesModBlocks.MEDIEVAL_WOODEN_CHAIR_DARK_OAK);
		MEDIEVAL_SPRUCE_TABLE = block(TheMiddleAgesModBlocks.MEDIEVAL_SPRUCE_TABLE);
		MEDIEVAL_OAK_TABLE = block(TheMiddleAgesModBlocks.MEDIEVAL_OAK_TABLE);
		MEDIEVAL_DARK_OAK_TABLE = block(TheMiddleAgesModBlocks.MEDIEVAL_DARK_OAK_TABLE);
		WOODEN_PLATE = block(TheMiddleAgesModBlocks.WOODEN_PLATE);
		WOODEN_PLATE_COOKED_CHICKEN = block(TheMiddleAgesModBlocks.WOODEN_PLATE_COOKED_CHICKEN);
		WOODEN_PLATE_RAW_CHICKEN = block(TheMiddleAgesModBlocks.WOODEN_PLATE_RAW_CHICKEN);
		WOODEN_PLATE_RAW_COOKIES = block(TheMiddleAgesModBlocks.WOODEN_PLATE_RAW_COOKIES);
		MEDIEVAL_CANDLE = block(TheMiddleAgesModBlocks.MEDIEVAL_CANDLE);
		DEAD_SKELETON = block(TheMiddleAgesModBlocks.DEAD_SKELETON);
		DEAD_SKELETON_POS_2 = block(TheMiddleAgesModBlocks.DEAD_SKELETON_POS_2);
		DEAD_SKELETON_POS_3 = block(TheMiddleAgesModBlocks.DEAD_SKELETON_POS_3);
		WANDERER_SPAWN_EGG = register("wanderer_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(TheMiddleAgesModEntities.WANDERER.get())));
		WRITTEN = register("written", WrittenItem::new);
		REMOTE = register("remote", RemoteItem::new);
		WATER_MILL_HUB = block(TheMiddleAgesModBlocks.WATER_MILL_HUB);
		WATER_MILL_EXTENDER = block(TheMiddleAgesModBlocks.WATER_MILL_EXTENDER);
		WATER_MILL_EXTENDER_CORNER = block(TheMiddleAgesModBlocks.WATER_MILL_EXTENDER_CORNER);
		WATER_MILL_GEAR = block(TheMiddleAgesModBlocks.WATER_MILL_GEAR);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.Item.ITEM, (stack, access) -> new WrittenInventoryCapability(access), WRITTEN.get());
	}
}