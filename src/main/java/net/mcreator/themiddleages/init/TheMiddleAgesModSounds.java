/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.themiddleages.TheMiddleAgesMod;

public class TheMiddleAgesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, TheMiddleAgesMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> YAWN_MALE = REGISTRY.register("yawn_male", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("the_middle_ages", "yawn_male")));
	public static final DeferredHolder<SoundEvent, SoundEvent> YAWN_FEMALE = REGISTRY.register("yawn_female", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("the_middle_ages", "yawn_female")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ATTACK_SHOUT = REGISTRY.register("attack_shout", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("the_middle_ages", "attack_shout")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DYING_SOUND = REGISTRY.register("dying_sound", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("the_middle_ages", "dying_sound")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HUMING = REGISTRY.register("huming", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("the_middle_ages", "huming")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FEMALE_HUMING = REGISTRY.register("female_huming", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("the_middle_ages", "female_huming")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FEMALE_DIES = REGISTRY.register("female_dies", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("the_middle_ages", "female_dies")));
	public static final DeferredHolder<SoundEvent, SoundEvent> AMBIENCE_BIRDS = REGISTRY.register("ambience_birds", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("the_middle_ages", "ambience_birds")));
}