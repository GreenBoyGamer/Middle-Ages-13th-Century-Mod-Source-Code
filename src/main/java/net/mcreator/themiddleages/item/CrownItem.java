package net.mcreator.themiddleages.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.themiddleages.procedures.CrownHelmetTickEventProcedure;

import javax.annotation.Nullable;

import java.util.Map;

public abstract class CrownItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(1024, Map.of(ArmorType.BOOTS, 1024, ArmorType.LEGGINGS, 1024, ArmorType.CHESTPLATE, 1024, ArmorType.HELMET, 1024, ArmorType.BODY, 1024), 13,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 128f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("the_middle_ages:crown_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("the_middle_ages:crown")));

	private CrownItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends CrownItem {
		public Helmet(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
			super.inventoryTick(itemstack, world, entity, equipmentSlot);
			if (entity instanceof Player player && (equipmentSlot != null && equipmentSlot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR)) {
				CrownHelmetTickEventProcedure.execute(entity);
			}
		}
	}
}