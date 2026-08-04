/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.themiddleages.client.particle.SleepingParticle;

@EventBusSubscriber(Dist.CLIENT)
public class TheMiddleAgesModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(TheMiddleAgesModParticleTypes.SLEEPING.get(), SleepingParticle::provider);
	}
}