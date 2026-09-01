package net.mcreator.themiddleages.client.screens;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.themiddleages.procedures.WorldldProcedure;
import net.mcreator.themiddleages.procedures.WorldldCoordsProcedure;
import net.mcreator.themiddleages.procedures.HDisplayOverlayIngameProcedure;

@EventBusSubscriber(Dist.CLIENT)
public class HOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (HDisplayOverlayIngameProcedure.execute(world)) {
			event.getGuiGraphics().text(Minecraft.getInstance().font,

					WorldldProcedure.execute(world), 39, 8, -1, false);
			event.getGuiGraphics().text(Minecraft.getInstance().font, Component.translatable("gui.the_middle_ages.h.label_days"), 8, 8, -1, false);
			event.getGuiGraphics().text(Minecraft.getInstance().font, Component.translatable("gui.the_middle_ages.h.label_target_coords"), 8, 21, -1, false);
			event.getGuiGraphics().text(Minecraft.getInstance().font,

					WorldldCoordsProcedure.execute(world), 47, 21, -1, false);
		}
	}
}