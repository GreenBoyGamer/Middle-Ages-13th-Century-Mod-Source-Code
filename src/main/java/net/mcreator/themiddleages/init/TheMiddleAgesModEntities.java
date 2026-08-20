/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themiddleages.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.themiddleages.entity.*;
import net.mcreator.themiddleages.TheMiddleAgesMod;

@EventBusSubscriber
public class TheMiddleAgesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, TheMiddleAgesMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<KnightEntity>> KNIGHT = register("knight",
			EntityType.Builder.<KnightEntity>of(KnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Civilian1Entity>> CIVILIAN_1 = register("civilian_1",
			EntityType.Builder.<Civilian1Entity>of(Civilian1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BreadSellerEntity>> BREAD_SELLER = register("bread_seller",
			EntityType.Builder.<BreadSellerEntity>of(BreadSellerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SoldierEntity>> SOLDIER = register("soldier",
			EntityType.Builder.<SoldierEntity>of(SoldierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkKnightEntity>> DARK_KNIGHT = register("dark_knight",
			EntityType.Builder.<DarkKnightEntity>of(DarkKnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkSoldierEntity>> DARK_SOLDIER = register("dark_soldier",
			EntityType.Builder.<DarkSoldierEntity>of(DarkSoldierEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MadievalHorseEntity>> MEDIEVAL_HORSE = register("medieval_horse",
			EntityType.Builder.<MadievalHorseEntity>of(MadievalHorseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KnightRidingHorseEntity>> KNIGHT_RIDING_HORSE = register("knight_riding_horse",
			EntityType.Builder.<KnightRidingHorseEntity>of(KnightRidingHorseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ArcherEntity>> ARCHER = register("archer",
			EntityType.Builder.<ArcherEntity>of(ArcherEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnemyArcherEntity>> ENEMY_ARCHER = register("enemy_archer",
			EntityType.Builder.<EnemyArcherEntity>of(EnemyArcherEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Civilian2Entity>> CIVILIAN_2 = register("civilian_2",
			EntityType.Builder.<Civilian2Entity>of(Civilian2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PassengerCartEntity>> PASSENGER_CART = register("passenger_cart",
			EntityType.Builder.<PassengerCartEntity>of(PassengerCartEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuyerEntity>> BUYER = register("buyer",
			EntityType.Builder.<BuyerEntity>of(BuyerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PassengerCartRidingEntity>> PASSENGER_CART_RIDING = register("passenger_cart_riding",
			EntityType.Builder.<PassengerCartRidingEntity>of(PassengerCartRidingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Civilian3Entity>> CIVILIAN_3 = register("civilian_3",
			EntityType.Builder.<Civilian3Entity>of(Civilian3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EntityPathFinderEntity>> ENTITY_PATH_FINDER = register("entity_path_finder",
			EntityType.Builder.<EntityPathFinderEntity>of(EntityPathFinderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SitEntity>> SIT = register("sit",
			EntityType.Builder.<SitEntity>of(SitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<WandererEntity>> WANDERER = register("wanderer",
			EntityType.Builder.<WandererEntity>of(WandererEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.95f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(TheMiddleAgesMod.MODID, registryname))));
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerEntity(Capabilities.Item.ENTITY, CIVILIAN_3.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, WANDERER.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, CIVILIAN_2.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, CIVILIAN_1.get(), (living, context) -> living.getCombinedInventory());
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		KnightEntity.init(event);
		Civilian1Entity.init(event);
		BreadSellerEntity.init(event);
		SoldierEntity.init(event);
		DarkKnightEntity.init(event);
		DarkSoldierEntity.init(event);
		MadievalHorseEntity.init(event);
		KnightRidingHorseEntity.init(event);
		ArcherEntity.init(event);
		EnemyArcherEntity.init(event);
		Civilian2Entity.init(event);
		PassengerCartEntity.init(event);
		BuyerEntity.init(event);
		PassengerCartRidingEntity.init(event);
		Civilian3Entity.init(event);
		EntityPathFinderEntity.init(event);
		SitEntity.init(event);
		WandererEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(KNIGHT.get(), KnightEntity.createAttributes().build());
		event.put(CIVILIAN_1.get(), Civilian1Entity.createAttributes().build());
		event.put(BREAD_SELLER.get(), BreadSellerEntity.createAttributes().build());
		event.put(SOLDIER.get(), SoldierEntity.createAttributes().build());
		event.put(DARK_KNIGHT.get(), DarkKnightEntity.createAttributes().build());
		event.put(DARK_SOLDIER.get(), DarkSoldierEntity.createAttributes().build());
		event.put(MEDIEVAL_HORSE.get(), MadievalHorseEntity.createAttributes().build());
		event.put(KNIGHT_RIDING_HORSE.get(), KnightRidingHorseEntity.createAttributes().build());
		event.put(ARCHER.get(), ArcherEntity.createAttributes().build());
		event.put(ENEMY_ARCHER.get(), EnemyArcherEntity.createAttributes().build());
		event.put(CIVILIAN_2.get(), Civilian2Entity.createAttributes().build());
		event.put(PASSENGER_CART.get(), PassengerCartEntity.createAttributes().build());
		event.put(BUYER.get(), BuyerEntity.createAttributes().build());
		event.put(PASSENGER_CART_RIDING.get(), PassengerCartRidingEntity.createAttributes().build());
		event.put(CIVILIAN_3.get(), Civilian3Entity.createAttributes().build());
		event.put(ENTITY_PATH_FINDER.get(), EntityPathFinderEntity.createAttributes().build());
		event.put(SIT.get(), SitEntity.createAttributes().build());
		event.put(WANDERER.get(), WandererEntity.createAttributes().build());
	}
}