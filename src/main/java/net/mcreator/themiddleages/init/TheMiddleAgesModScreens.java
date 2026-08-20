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
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}