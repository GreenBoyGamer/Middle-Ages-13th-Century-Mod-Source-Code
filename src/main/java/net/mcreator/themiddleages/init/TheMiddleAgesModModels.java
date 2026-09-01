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
		event.registerLayerDefinition(Modelcrown.LAYER_LOCATION, Modelcrown::createBodyLayer);
		event.registerLayerDefinition(Modelsoldier_chest.LAYER_LOCATION, Modelsoldier_chest::createBodyLayer);
		event.registerLayerDefinition(ModelWater_mill_extender.LAYER_LOCATION, ModelWater_mill_extender::createBodyLayer);
		event.registerLayerDefinition(Modelknight.LAYER_LOCATION, Modelknight::createBodyLayer);
		event.registerLayerDefinition(ModelWater_mill_extendercurvve.LAYER_LOCATION, ModelWater_mill_extendercurvve::createBodyLayer);
		event.registerLayerDefinition(Modelmadeival_buyer.LAYER_LOCATION, Modelmadeival_buyer::createBodyLayer);
		event.registerLayerDefinition(Modelmadieval_civilian_boy.LAYER_LOCATION, Modelmadieval_civilian_boy::createBodyLayer);
		event.registerLayerDefinition(ModelSoldier.LAYER_LOCATION, ModelSoldier::createBodyLayer);
		event.registerLayerDefinition(Modelarchermodelenemy.LAYER_LOCATION, Modelarchermodelenemy::createBodyLayer);
		event.registerLayerDefinition(Modelarchermodel.LAYER_LOCATION, Modelarchermodel::createBodyLayer);
		event.registerLayerDefinition(Modelbread_seller.LAYER_LOCATION, Modelbread_seller::createBodyLayer);
		event.registerLayerDefinition(Modellog_cutter.LAYER_LOCATION, Modellog_cutter::createBodyLayer);
		event.registerLayerDefinition(Modelfemale_civilian_1.LAYER_LOCATION, Modelfemale_civilian_1::createBodyLayer);
		event.registerLayerDefinition(Modelwater_mill_gear.LAYER_LOCATION, Modelwater_mill_gear::createBodyLayer);
		event.registerLayerDefinition(Modelknightdark.LAYER_LOCATION, Modelknightdark::createBodyLayer);
		event.registerLayerDefinition(Modelcivilian3.LAYER_LOCATION, Modelcivilian3::createBodyLayer);
		event.registerLayerDefinition(ModelGhostOfTheKing.LAYER_LOCATION, ModelGhostOfTheKing::createBodyLayer);
		event.registerLayerDefinition(ModelWater_mill_main.LAYER_LOCATION, ModelWater_mill_main::createBodyLayer);
		event.registerLayerDefinition(Modelmadieval_farmer_civilian.LAYER_LOCATION, Modelmadieval_farmer_civilian::createBodyLayer);
		event.registerLayerDefinition(Modelcivilian4.LAYER_LOCATION, Modelcivilian4::createBodyLayer);
		event.registerLayerDefinition(Modelarchermodelmanhus.LAYER_LOCATION, Modelarchermodelmanhus::createBodyLayer);
		event.registerLayerDefinition(ModelWagoner.LAYER_LOCATION, ModelWagoner::createBodyLayer);
		event.registerLayerDefinition(Modeltaskprovider.LAYER_LOCATION, Modeltaskprovider::createBodyLayer);
		event.registerLayerDefinition(Modelclothes_chest.LAYER_LOCATION, Modelclothes_chest::createBodyLayer);
		event.registerLayerDefinition(Modelsoldier_boots.LAYER_LOCATION, Modelsoldier_boots::createBodyLayer);
		event.registerLayerDefinition(Modelcivilian5.LAYER_LOCATION, Modelcivilian5::createBodyLayer);
		event.registerLayerDefinition(Modelwanderer.LAYER_LOCATION, Modelwanderer::createBodyLayer);
		event.registerLayerDefinition(ModelWater_mill_pump.LAYER_LOCATION, ModelWater_mill_pump::createBodyLayer);
		event.registerLayerDefinition(ModelenemyArcher.LAYER_LOCATION, ModelenemyArcher::createBodyLayer);
		event.registerLayerDefinition(ModelMadievalHorseCartss.LAYER_LOCATION, ModelMadievalHorseCartss::createBodyLayer);
		event.registerLayerDefinition(Modelmadieval_passenger_cart_operator.LAYER_LOCATION, Modelmadieval_passenger_cart_operator::createBodyLayer);
		event.registerLayerDefinition(ModelEnemyKing.LAYER_LOCATION, ModelEnemyKing::createBodyLayer);
		event.registerLayerDefinition(Modelsoldier_heml.LAYER_LOCATION, Modelsoldier_heml::createBodyLayer);
		event.registerLayerDefinition(Modelsoldier_leggings.LAYER_LOCATION, Modelsoldier_leggings::createBodyLayer);
		event.registerLayerDefinition(Modelhorse_cart.LAYER_LOCATION, Modelhorse_cart::createBodyLayer);
		event.registerLayerDefinition(ModelMadievalHorse.LAYER_LOCATION, ModelMadievalHorse::createBodyLayer);
		event.registerLayerDefinition(Modelcloths_leggings.LAYER_LOCATION, Modelcloths_leggings::createBodyLayer);
		event.registerLayerDefinition(ModelEnemySoldier.LAYER_LOCATION, ModelEnemySoldier::createBodyLayer);
		event.registerLayerDefinition(Modelcloths_boots.LAYER_LOCATION, Modelcloths_boots::createBodyLayer);
		event.registerLayerDefinition(Modelhorseknight.LAYER_LOCATION, Modelhorseknight::createBodyLayer);
	}
}