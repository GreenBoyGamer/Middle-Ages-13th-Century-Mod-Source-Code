/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.themiddleages.block.MadievalDimensionPortalBlock;
import net.mcreator.themiddleages.block.GraveBlock;
import net.mcreator.themiddleages.TheMiddleAgesMod;

public class TheMiddleAgesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TheMiddleAgesMod.MODID);
	public static final DeferredBlock<Block> GRAVE;
	public static final DeferredBlock<Block> MADIEVAL_DIMENSION_PORTAL;
	static {
		GRAVE = REGISTRY.register("grave", GraveBlock::new);
		MADIEVAL_DIMENSION_PORTAL = REGISTRY.register("madieval_dimension_portal", MadievalDimensionPortalBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}