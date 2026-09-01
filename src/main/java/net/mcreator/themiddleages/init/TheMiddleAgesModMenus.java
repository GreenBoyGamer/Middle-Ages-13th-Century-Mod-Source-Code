/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.themiddleages.world.inventory.*;
import net.mcreator.themiddleages.network.MenuStateUpdateMessage;
import net.mcreator.themiddleages.TheMiddleAgesMod;

import java.util.Map;

public class TheMiddleAgesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, TheMiddleAgesMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<KnightGUIMenu>> KNIGHT_GUI = REGISTRY.register("knight_gui", () -> IMenuTypeExtension.create(KnightGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<KingStatsGUIMenu>> KING_STATS_GUI = REGISTRY.register("king_stats_gui", () -> IMenuTypeExtension.create(KingStatsGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WagonerGUIMenu>> WAGONER_GUI = REGISTRY.register("wagoner_gui", () -> IMenuTypeExtension.create(WagonerGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Civilian1GUIMenu>> CIVILIAN_1_GUI = REGISTRY.register("civilian_1_gui", () -> IMenuTypeExtension.create(Civilian1GUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Civilian2GUIMenu>> CIVILIAN_2_GUI = REGISTRY.register("civilian_2_gui", () -> IMenuTypeExtension.create(Civilian2GUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Civilian3GUIMenu>> CIVILIAN_3_GUI = REGISTRY.register("civilian_3_gui", () -> IMenuTypeExtension.create(Civilian3GUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<KnightsAndSoldiersMenu>> KNIGHTS_AND_SOLDIERS = REGISTRY.register("knights_and_soldiers", () -> IMenuTypeExtension.create(KnightsAndSoldiersMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BookGUIMenu>> BOOK_GUI = REGISTRY.register("book_gui", () -> IMenuTypeExtension.create(BookGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WandererGUIMenu>> WANDERER_GUI = REGISTRY.register("wanderer_gui", () -> IMenuTypeExtension.create(WandererGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Civilian5GUIMenu>> CIVILIAN_5_GUI = REGISTRY.register("civilian_5_gui", () -> IMenuTypeExtension.create(Civilian5GUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<JohnSmithGUIMenu>> JOHN_SMITH_GUI = REGISTRY.register("john_smith_gui", () -> IMenuTypeExtension.create(JohnSmithGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Civilian4GUIMenu>> CIVILIAN_4_GUI = REGISTRY.register("civilian_4_gui", () -> IMenuTypeExtension.create(Civilian4GUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AliceGUIMenu>> ALICE_GUI = REGISTRY.register("alice_gui", () -> IMenuTypeExtension.create(AliceGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BreadSellerGUIMenu>> BREAD_SELLER_GUI = REGISTRY.register("bread_seller_gui", () -> IMenuTypeExtension.create(BreadSellerGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<HenryGUIMenu>> HENRY_GUI = REGISTRY.register("henry_gui", () -> IMenuTypeExtension.create(HenryGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CutterGUIMenu>> CUTTER_GUI = REGISTRY.register("cutter_gui", () -> IMenuTypeExtension.create(CutterGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<HistoryGUIMenu>> HISTORY_GUI = REGISTRY.register("history_gui", () -> IMenuTypeExtension.create(HistoryGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<HistoryGUI2Menu>> HISTORY_GUI_2 = REGISTRY.register("history_gui_2", () -> IMenuTypeExtension.create(HistoryGUI2Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BuyerGUIMenu>> BUYER_GUI = REGISTRY.register("buyer_gui", () -> IMenuTypeExtension.create(BuyerGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BuyerStatsGUIMenu>> BUYER_STATS_GUI = REGISTRY.register("buyer_stats_gui", () -> IMenuTypeExtension.create(BuyerStatsGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide()) {
				if (Minecraft.getInstance().screen instanceof TheMiddleAgesModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ClientPacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}