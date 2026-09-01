package net.mcreator.themiddleages.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.Map;

public abstract class SoldierArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(145, Map.of(ArmorType.BOOTS, 7, ArmorType.LEGGINGS, 11, ArmorType.CHESTPLATE, 12, ArmorType.HELMET, 7, ArmorType.BODY, 12), 13,
			DeferredHolder.create(Registries.SOUND_EVENT, Identifier.parse("item.armor.equip_diamond")), 3f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("the_middle_ages:soldier_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("the_middle_ages:soldier_armor")));

	private SoldierArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends SoldierArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends SoldierArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends SoldierArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends SoldierArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}