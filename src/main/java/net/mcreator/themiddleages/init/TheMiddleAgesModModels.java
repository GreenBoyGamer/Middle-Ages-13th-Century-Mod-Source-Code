/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.themiddleages.client.model.*;

@EventBusSubscriber(Dist.CLIENT)
public class TheMiddleAgesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelseller1.LAYER_LOCATION, Modelseller1::createBodyLayer);
		event.registerLayerDefinition(Modelknight.LAYER_LOCATION, Modelknight::createBodyLayer);
		event.registerLayerDefinition(Modelfruitsellet.LAYER_LOCATION, Modelfruitsellet::createBodyLayer);
		event.registerLayerDefinition(ModelMadievalHorseCartss.LAYER_LOCATION, ModelMadievalHorseCartss::createBodyLayer);
		event.registerLayerDefinition(Modelcivilian2.LAYER_LOCATION, Modelcivilian2::createBodyLayer);
		event.registerLayerDefinition(Modelcivilian1.LAYER_LOCATION, Modelcivilian1::createBodyLayer);
		event.registerLayerDefinition(ModelEnemySoldier.LAYER_LOCATION, ModelEnemySoldier::createBodyLayer);
		event.registerLayerDefinition(ModelSoldier.LAYER_LOCATION, ModelSoldier::createBodyLayer);
		event.registerLayerDefinition(Modelarchermodel.LAYER_LOCATION, Modelarchermodel::createBodyLayer);
		event.registerLayerDefinition(Modelhorseknight.LAYER_LOCATION, Modelhorseknight::createBodyLayer);
		event.registerLayerDefinition(Modelhorse_cart.LAYER_LOCATION, Modelhorse_cart::createBodyLayer);
		event.registerLayerDefinition(Modelknightdark.LAYER_LOCATION, Modelknightdark::createBodyLayer);
		event.registerLayerDefinition(Modelcivilian3.LAYER_LOCATION, Modelcivilian3::createBodyLayer);
		event.registerLayerDefinition(ModelMadievalHorse.LAYER_LOCATION, ModelMadievalHorse::createBodyLayer);
	}
}