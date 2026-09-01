/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.themiddleages.client.gui.*;

@EventBusSubscriber(Dist.CLIENT)
public class TheMiddleAgesModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(TheMiddleAgesModMenus.KNIGHT_GUI.get(), KnightGUIScreen::new);
		event.register(TheMiddleAgesModMenus.KING_STATS_GUI.get(), KingStatsGUIScreen::new);
		event.register(TheMiddleAgesModMenus.WAGONER_GUI.get(), WagonerGUIScreen::new);
		event.register(TheMiddleAgesModMenus.CIVILIAN_1_GUI.get(), Civilian1GUIScreen::new);
		event.register(TheMiddleAgesModMenus.CIVILIAN_2_GUI.get(), Civilian2GUIScreen::new);
		event.register(TheMiddleAgesModMenus.CIVILIAN_3_GUI.get(), Civilian3GUIScreen::new);
		event.register(TheMiddleAgesModMenus.KNIGHTS_AND_SOLDIERS.get(), KnightsAndSoldiersScreen::new);
		event.register(TheMiddleAgesModMenus.BOOK_GUI.get(), BookGUIScreen::new);
		event.register(TheMiddleAgesModMenus.WANDERER_GUI.get(), WandererGUIScreen::new);
		event.register(TheMiddleAgesModMenus.CIVILIAN_5_GUI.get(), Civilian5GUIScreen::new);
		event.register(TheMiddleAgesModMenus.JOHN_SMITH_GUI.get(), JohnSmithGUIScreen::new);
		event.register(TheMiddleAgesModMenus.CIVILIAN_4_GUI.get(), Civilian4GUIScreen::new);
		event.register(TheMiddleAgesModMenus.ALICE_GUI.get(), AliceGUIScreen::new);
		event.register(TheMiddleAgesModMenus.BREAD_SELLER_GUI.get(), BreadSellerGUIScreen::new);
		event.register(TheMiddleAgesModMenus.HENRY_GUI.get(), HenryGUIScreen::new);
		event.register(TheMiddleAgesModMenus.CUTTER_GUI.get(), CutterGUIScreen::new);
		event.register(TheMiddleAgesModMenus.HISTORY_GUI.get(), HistoryGUIScreen::new);
		event.register(TheMiddleAgesModMenus.HISTORY_GUI_2.get(), HistoryGUI2Screen::new);
		event.register(TheMiddleAgesModMenus.BUYER_GUI.get(), BuyerGUIScreen::new);
		event.register(TheMiddleAgesModMenus.BUYER_STATS_GUI.get(), BuyerStatsGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}