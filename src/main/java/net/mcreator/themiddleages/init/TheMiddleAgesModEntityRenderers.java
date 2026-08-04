/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.themiddleages.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class TheMiddleAgesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheMiddleAgesModEntities.KNIGHT.get(), KnightRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.CIVILIAN_1.get(), Civilian1Renderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.BREAD_SELLER.get(), BreadSellerRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.SOLDIER.get(), SoldierRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.DARK_KNIGHT.get(), DarkKnightRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.DARK_SOLDIER.get(), DarkSoldierRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.MADIEVAL_HORSE.get(), MadievalHorseRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.KNIGHT_RIDING_HORSE.get(), KnightRidingHorseRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.ARCHER.get(), ArcherRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.ENEMY_ARCHER.get(), EnemyArcherRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.CIVILIAN_2.get(), Civilian2Renderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.PASSENGER_CART.get(), PassengerCartRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.BUYER.get(), BuyerRenderer::new);
		event.registerEntityRenderer(TheMiddleAgesModEntities.PASSENGER_CART_RIDING.get(), PassengerCartRidingRenderer::new);
	}
}