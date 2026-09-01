package net.mcreator.themiddleages.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class MedievalIronSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 124173, 8f, 0, 12, TagKey.create(Registries.ITEM, Identifier.parse("the_middle_ages:medieval_iron_sword_repair_items")));

	public MedievalIronSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 8f, -2.4f).fireResistant());
	}
}