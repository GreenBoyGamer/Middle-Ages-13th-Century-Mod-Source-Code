package net.mcreator.themiddleages.entity;

import net.neoforged.neoforge.transfer.item.LivingEntityEquipmentWrapper;
import net.neoforged.neoforge.transfer.item.ItemUtil;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.neoforged.neoforge.transfer.CombinedResourceHandler;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.themiddleages.world.inventory.Civilian2GUIMenu;
import net.mcreator.themiddleages.procedures.*;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

public class Civilian2Entity extends Monster {
	public static final EntityDataAccessor<Boolean> DATA_wasDoing = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_stillDoing = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_Eat = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_giveThanks = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_moneyGive = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_farming = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_buy = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_hungry = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_TimeToDie = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_GraveCarry = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_gettingrobbed = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_notRobbingAgain = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_Dontdo = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Meet = SynchedEntityData.defineId(Civilian2Entity.class, EntityDataSerializers.INT);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();
	public final AnimationState animationState4 = new AnimationState();
	public final AnimationState animationState5 = new AnimationState();
	public final AnimationState animationState6 = new AnimationState();
	public final AnimationState animationState7 = new AnimationState();
	public final AnimationState animationState8 = new AnimationState();

	public Civilian2Entity(EntityType<Civilian2Entity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_wasDoing, false);
		builder.define(DATA_stillDoing, false);
		builder.define(DATA_Eat, 0);
		builder.define(DATA_giveThanks, 0);
		builder.define(DATA_moneyGive, 0);
		builder.define(DATA_farming, 0);
		builder.define(DATA_buy, 0);
		builder.define(DATA_hungry, 0);
		builder.define(DATA_TimeToDie, 0);
		builder.define(DATA_GraveCarry, 0);
		builder.define(DATA_gettingrobbed, 0);
		builder.define(DATA_notRobbingAgain, false);
		builder.define(DATA_Dontdo, 0);
		builder.define(DATA_Meet, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(3, new FloatGoal(this));
		this.goalSelector.addGoal(4, new PanicGoal(this, 1));
		this.goalSelector.addGoal(5, new OpenDoorGoal(this, true));
		this.goalSelector.addGoal(6, new OpenDoorGoal(this, false));
		this.goalSelector.addGoal(7, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(8, new AvoidEntityGoal<>(this, DarkKnightEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(9, new AvoidEntityGoal<>(this, EnemyArcherEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(10, new AvoidEntityGoal<>(this, DarkSoldierEntity.class, (float) 6, 1, 1.2));
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		Civilian2DiesProcedure.execute(this.level(), this);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, EntitySpawnReason reason, @Nullable SpawnGroupData livingdata) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
		Civilian2InitialSpawnProcedure.execute(world, this);
		return retval;
	}

	private final ItemStacksResourceHandler inventory = new ItemStacksResourceHandler(0);
	private final CombinedResourceHandler combined = new CombinedResourceHandler(inventory, LivingEntityEquipmentWrapper.of(this, EquipmentSlot.Type.HAND), LivingEntityEquipmentWrapper.of(this, EquipmentSlot.Type.HUMANOID_ARMOR));

	public CombinedResourceHandler getCombinedInventory() {
		return combined;
	}

	@Override
	protected void dropEquipment(ServerLevel serverLevel) {
		super.dropEquipment(serverLevel);
		for (int i = 0; i < inventory.size(); i++) {
			ItemStack itemstack = ItemUtil.getStack(inventory, i);
			if (!itemstack.isEmpty() && !EnchantmentHelper.has(itemstack, EnchantmentEffectComponents.PREVENT_EQUIPMENT_DROP)) {
				this.spawnAtLocation(serverLevel, itemstack);
			}
		}
	}

	@Override
	public void addAdditionalSaveData(ValueOutput valueOutput) {
		super.addAdditionalSaveData(valueOutput);
		valueOutput.putBoolean("DatawasDoing", this.entityData.get(DATA_wasDoing));
		valueOutput.putBoolean("DatastillDoing", this.entityData.get(DATA_stillDoing));
		valueOutput.putInt("DataEat", this.entityData.get(DATA_Eat));
		valueOutput.putInt("DatagiveThanks", this.entityData.get(DATA_giveThanks));
		valueOutput.putInt("DatamoneyGive", this.entityData.get(DATA_moneyGive));
		valueOutput.putInt("Datafarming", this.entityData.get(DATA_farming));
		valueOutput.putInt("Databuy", this.entityData.get(DATA_buy));
		valueOutput.putInt("Datahungry", this.entityData.get(DATA_hungry));
		valueOutput.putInt("DataTimeToDie", this.entityData.get(DATA_TimeToDie));
		valueOutput.putInt("DataGraveCarry", this.entityData.get(DATA_GraveCarry));
		valueOutput.putInt("Datagettingrobbed", this.entityData.get(DATA_gettingrobbed));
		valueOutput.putBoolean("DatanotRobbingAgain", this.entityData.get(DATA_notRobbingAgain));
		valueOutput.putInt("DataDontdo", this.entityData.get(DATA_Dontdo));
		valueOutput.putInt("DataMeet", this.entityData.get(DATA_Meet));
		inventory.serialize(valueOutput.child("InventoryCustom"));
	}

	@Override
	public void readAdditionalSaveData(ValueInput valueInput) {
		super.readAdditionalSaveData(valueInput);
		this.entityData.set(DATA_wasDoing, valueInput.getBooleanOr("DatawasDoing", false));
		this.entityData.set(DATA_stillDoing, valueInput.getBooleanOr("DatastillDoing", false));
		this.entityData.set(DATA_Eat, valueInput.getIntOr("DataEat", 0));
		this.entityData.set(DATA_giveThanks, valueInput.getIntOr("DatagiveThanks", 0));
		this.entityData.set(DATA_moneyGive, valueInput.getIntOr("DatamoneyGive", 0));
		this.entityData.set(DATA_farming, valueInput.getIntOr("Datafarming", 0));
		this.entityData.set(DATA_buy, valueInput.getIntOr("Databuy", 0));
		this.entityData.set(DATA_hungry, valueInput.getIntOr("Datahungry", 0));
		this.entityData.set(DATA_TimeToDie, valueInput.getIntOr("DataTimeToDie", 0));
		this.entityData.set(DATA_GraveCarry, valueInput.getIntOr("DataGraveCarry", 0));
		this.entityData.set(DATA_gettingrobbed, valueInput.getIntOr("Datagettingrobbed", 0));
		this.entityData.set(DATA_notRobbingAgain, valueInput.getBooleanOr("DatanotRobbingAgain", false));
		this.entityData.set(DATA_Dontdo, valueInput.getIntOr("DataDontdo", 0));
		this.entityData.set(DATA_Meet, valueInput.getIntOr("DataMeet", 0));
		valueInput.child("InventoryCustom").ifPresent(input -> inventory.deserialize(input));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.SUCCESS;
		if (sourceentity instanceof ServerPlayer serverPlayer) {
			serverPlayer.openMenu(new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Civilian 2");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
					packetBuffer.writeBlockPos(sourceentity.blockPosition());
					packetBuffer.writeByte(0);
					packetBuffer.writeVarInt(Civilian2Entity.this.getId());
					return new Civilian2GUIMenu(id, inventory, packetBuffer);
				}
			}, buf -> {
				buf.writeBlockPos(sourceentity.blockPosition());
				buf.writeByte(0);
				buf.writeVarInt(this.getId());
			});
		}
		super.mobInteract(sourceentity, hand);
		return retval;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
			this.animationState2.animateWhen(Civilian2SprintPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(Civilian2PlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState4.animateWhen(Civilian2eakePlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState5.animateWhen(Civilian2BuyPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState6.animateWhen(Civilian2EatPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState7.animateWhen(Civilian2DiePlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState8.animateWhen(Civilian2MeetPlaybackConditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		Civilian2OnEntityUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}