/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.themiddleages.TheMiddleAgesMod;

public class TheMiddleAgesModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, TheMiddleAgesMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SLEEPING = REGISTRY.register("sleeping", () -> new SimpleParticleType(true));
}