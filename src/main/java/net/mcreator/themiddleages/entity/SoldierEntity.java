package net.mcreator.themiddleages.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.procedures.*;

import javax.annotation.Nullable;

public class SoldierEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_actionstate = SynchedEntityData.defineId(SoldierEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_fightingState = SynchedEntityData.defineId(SoldierEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();
	public final AnimationState animationState4 = new AnimationState();
	public final AnimationState animationState5 = new AnimationState();
	public final AnimationState animationState6 = new AnimationState();

	public SoldierEntity(EntityType<SoldierEntity> type, Level world) {
		super(type, world);
		xpReward = 10;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_actionstate, 0);
		builder.define(DATA_fightingState, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < 0 && this.mob.getSensing().hasLineOfSight(entity);
			}

			@Override
			public boolean canUse() {
				double x = SoldierEntity.this.getX();
				double y = SoldierEntity.this.getY();
				double z = SoldierEntity.this.getZ();
				Entity entity = SoldierEntity.this;
				Level world = SoldierEntity.this.level();
				return super.canUse() && Set0SoldierProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = SoldierEntity.this.getX();
				double y = SoldierEntity.this.getY();
				double z = SoldierEntity.this.getZ();
				Entity entity = SoldierEntity.this;
				Level world = SoldierEntity.this.level();
				return super.canContinueToUse() && Set0SoldierProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = SoldierEntity.this.getX();
				double y = SoldierEntity.this.getY();
				double z = SoldierEntity.this.getZ();
				Entity entity = SoldierEntity.this;
				Level world = SoldierEntity.this.level();
				return super.canUse() && Set0SoldierProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = SoldierEntity.this.getX();
				double y = SoldierEntity.this.getY();
				double z = SoldierEntity.this.getZ();
				Entity entity = SoldierEntity.this;
				Level world = SoldierEntity.this.level();
				return super.canContinueToUse() && Set0SoldierProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = SoldierEntity.this.getX();
				double y = SoldierEntity.this.getY();
				double z = SoldierEntity.this.getZ();
				Entity entity = SoldierEntity.this;
				Level world = SoldierEntity.this.level();
				return super.canUse() && Set0SoldierProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = SoldierEntity.this.getX();
				double y = SoldierEntity.this.getY();
				double z = SoldierEntity.this.getZ();
				Entity entity = SoldierEntity.this;
				Level world = SoldierEntity.this.level();
				return super.canContinueToUse() && Set0SoldierProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new FloatGoal(this));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DarkKnightEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, DarkSoldierEntity.class, false, false));
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.armor.equip_iron")), 0.15f, 1);
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
		SoldierEntityDiesProcedure.execute(this);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, EntitySpawnReason reason, @Nullable SpawnGroupData livingdata) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
		SoldierOnInitialEntitySpawnProcedure.execute(world);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(ValueOutput valueOutput) {
		super.addAdditionalSaveData(valueOutput);
		valueOutput.putInt("Dataactionstate", this.entityData.get(DATA_actionstate));
		valueOutput.putInt("DatafightingState", this.entityData.get(DATA_fightingState));
	}

	@Override
	public void readAdditionalSaveData(ValueInput valueInput) {
		super.readAdditionalSaveData(valueInput);
		this.entityData.set(DATA_actionstate, valueInput.getIntOr("Dataactionstate", 0));
		this.entityData.set(DATA_fightingState, valueInput.getIntOr("DatafightingState", 0));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(SoldierBlockingPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState2.animateWhen(SoldierSprintPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(SoldierAttack1PlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState4.animateWhen(SoldierPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState5.animateWhen(SoldierOndeathPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState6.animateWhen(true, this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		SoldierOnTicksProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 60);
		builder = builder.add(Attributes.ARMOR, 8);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 5);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1);
		return builder;
	}
}