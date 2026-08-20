/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.Identifier;
import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.themiddleages.network.StatsMessage;
import net.mcreator.themiddleages.network.HireGUIMessage;

@EventBusSubscriber(Dist.CLIENT)
public class TheMiddleAgesModKeyMappings {
	public static final KeyMapping.Category CATEGORY_MADIEVAL = new KeyMapping.Category(Identifier.parse("the_middle_ages:madieval"));
	public static final KeyMapping STATS = new KeyMapping("key.the_middle_ages.stats", GLFW.GLFW_KEY_I, CATEGORY_MADIEVAL) {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new StatsMessage(0, 0));
				StatsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping HIRE_GUI = new KeyMapping("key.the_middle_ages.hire_gui", GLFW.GLFW_KEY_U, CATEGORY_MADIEVAL) {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new HireGUIMessage(0, 0));
				HireGUIMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.registerCategory(CATEGORY_MADIEVAL);
		event.register(STATS);
		event.register(HIRE_GUI);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				STATS.consumeClick();
				HIRE_GUI.consumeClick();
			}
		}
	}
}