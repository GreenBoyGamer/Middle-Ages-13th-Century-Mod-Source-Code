package net.mcreator.themiddleages.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.themiddleages.procedures.*;

import javax.annotation.Nullable;

public class BuyerEntity extends Monster {
	public static final EntityDataAccessor<Boolean> DATA_wasDoing = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_stillDoing = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_Eat = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_giveThanks = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_moneyGive = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_farming = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_buy = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_hungry = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_TimeToDie = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_GraveCarry = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_gettingrobbed = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_notRobbingAgain = SynchedEntityData.defineId(BuyerEntity.class, EntityDataSerializers.BOOLEAN);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();
	public final AnimationState animationState4 = new AnimationState();
	public final AnimationState animationState5 = new AnimationState();
	public final AnimationState animationState6 = new AnimationState();
	public final AnimationState animationState7 = new AnimationState();

	public BuyerEntity(EntityType<BuyerEntity> type, Level world) {
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
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(3, new FloatGoal(this));
		this.goalSelector.addGoal(4, new PanicGoal(this, 2));
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
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		BuyerEntityDiesProcedure.execute(this);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
		BuyerOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("DatawasDoing", this.entityData.get(DATA_wasDoing));
		compound.putBoolean("DatastillDoing", this.entityData.get(DATA_stillDoing));
		compound.putInt("DataEat", this.entityData.get(DATA_Eat));
		compound.putInt("DatagiveThanks", this.entityData.get(DATA_giveThanks));
		compound.putInt("DatamoneyGive", this.entityData.get(DATA_moneyGive));
		compound.putInt("Datafarming", this.entityData.get(DATA_farming));
		compound.putInt("Databuy", this.entityData.get(DATA_buy));
		compound.putInt("Datahungry", this.entityData.get(DATA_hungry));
		compound.putInt("DataTimeToDie", this.entityData.get(DATA_TimeToDie));
		compound.putInt("DataGraveCarry", this.entityData.get(DATA_GraveCarry));
		compound.putInt("Datagettingrobbed", this.entityData.get(DATA_gettingrobbed));
		compound.putBoolean("DatanotRobbingAgain", this.entityData.get(DATA_notRobbingAgain));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DatawasDoing"))
			this.entityData.set(DATA_wasDoing, compound.getBoolean("DatawasDoing"));
		if (compound.contains("DatastillDoing"))
			this.entityData.set(DATA_stillDoing, compound.getBoolean("DatastillDoing"));
		if (compound.contains("DataEat"))
			this.entityData.set(DATA_Eat, compound.getInt("DataEat"));
		if (compound.contains("DatagiveThanks"))
			this.entityData.set(DATA_giveThanks, compound.getInt("DatagiveThanks"));
		if (compound.contains("DatamoneyGive"))
			this.entityData.set(DATA_moneyGive, compound.getInt("DatamoneyGive"));
		if (compound.contains("Datafarming"))
			this.entityData.set(DATA_farming, compound.getInt("Datafarming"));
		if (compound.contains("Databuy"))
			this.entityData.set(DATA_buy, compound.getInt("Databuy"));
		if (compound.contains("Datahungry"))
			this.entityData.set(DATA_hungry, compound.getInt("Datahungry"));
		if (compound.contains("DataTimeToDie"))
			this.entityData.set(DATA_TimeToDie, compound.getInt("DataTimeToDie"));
		if (compound.contains("DataGraveCarry"))
			this.entityData.set(DATA_GraveCarry, compound.getInt("DataGraveCarry"));
		if (compound.contains("Datagettingrobbed"))
			this.entityData.set(DATA_gettingrobbed, compound.getInt("Datagettingrobbed"));
		if (compound.contains("DatanotRobbingAgain"))
			this.entityData.set(DATA_notRobbingAgain, compound.getBoolean("DatanotRobbingAgain"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
			this.animationState2.animateWhen(Civilian1PlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(BuyerSleepPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState4.animateWhen(BuyerPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState5.animateWhen(BuyerEatPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState6.animateWhen(BuyerDiePlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState7.animateWhen(BuyerThanksPlaybackConditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		BuyerOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
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