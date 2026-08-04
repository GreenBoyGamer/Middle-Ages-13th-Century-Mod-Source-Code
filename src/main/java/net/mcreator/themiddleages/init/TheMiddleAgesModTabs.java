/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.themiddleages.TheMiddleAgesMod;

@EventBusSubscriber
public class TheMiddleAgesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheMiddleAgesMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TheMiddleAgesModItems.KNIGHT_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.CIVILIAN_1_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.BREAD_SELLER_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.SOLDIER_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.DARK_KNIGHT_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.DARK_SOLDIER_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.MADIEVAL_HORSE_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.ARCHER_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.ENEMY_ARCHER_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.CIVILIAN_2_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.PASSENGER_CART_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.BUYER_SPAWN_EGG.get());
			tabData.accept(TheMiddleAgesModItems.PASSENGER_CART_RIDING_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TheMiddleAgesModItems.MADIEVAL_DIMENSION.get());
		}
	}
}