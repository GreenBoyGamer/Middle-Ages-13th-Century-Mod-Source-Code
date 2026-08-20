package net.mcreator.themiddleages.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.block.state.BlockState;
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
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.procedures.*;

public class DarkKnightEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_actionstate = SynchedEntityData.defineId(DarkKnightEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();
	public final AnimationState animationState4 = new AnimationState();
	public final AnimationState animationState5 = new AnimationState();
	public final AnimationState animationState6 = new AnimationState();

	public DarkKnightEntity(EntityType<DarkKnightEntity> type, Level world) {
		super(type, world);
		xpReward = 23;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_actionstate, 0);
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
				double x = DarkKnightEntity.this.getX();
				double y = DarkKnightEntity.this.getY();
				double z = DarkKnightEntity.this.getZ();
				Entity entity = DarkKnightEntity.this;
				Level world = DarkKnightEntity.this.level();
				return super.canUse() && Set0Procedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DarkKnightEntity.this.getX();
				double y = DarkKnightEntity.this.getY();
				double z = DarkKnightEntity.this.getZ();
				Entity entity = DarkKnightEntity.this;
				Level world = DarkKnightEntity.this.level();
				return super.canContinueToUse() && Set0Procedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = DarkKnightEntity.this.getX();
				double y = DarkKnightEntity.this.getY();
				double z = DarkKnightEntity.this.getZ();
				Entity entity = DarkKnightEntity.this;
				Level world = DarkKnightEntity.this.level();
				return super.canUse() && Set0Procedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DarkKnightEntity.this.getX();
				double y = DarkKnightEntity.this.getY();
				double z = DarkKnightEntity.this.getZ();
				Entity entity = DarkKnightEntity.this;
				Level world = DarkKnightEntity.this.level();
				return super.canContinueToUse() && Set0Procedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = DarkKnightEntity.this.getX();
				double y = DarkKnightEntity.this.getY();
				double z = DarkKnightEntity.this.getZ();
				Entity entity = DarkKnightEntity.this;
				Level world = DarkKnightEntity.this.level();
				return super.canUse() && Set0Procedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DarkKnightEntity.this.getX();
				double y = DarkKnightEntity.this.getY();
				double z = DarkKnightEntity.this.getZ();
				Entity entity = DarkKnightEntity.this;
				Level world = DarkKnightEntity.this.level();
				return super.canContinueToUse() && Set0Procedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new FloatGoal(this));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, KnightEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, SoldierEntity.class, false, false));
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
		DarkKnight0Procedure.execute(this);
	}

	@Override
	public void addAdditionalSaveData(ValueOutput valueOutput) {
		super.addAdditionalSaveData(valueOutput);
		valueOutput.putInt("Dataactionstate", this.entityData.get(DATA_actionstate));
	}

	@Override
	public void readAdditionalSaveData(ValueInput valueInput) {
		super.readAdditionalSaveData(valueInput);
		this.entityData.set(DATA_actionstate, valueInput.getIntOr("Dataactionstate", 0));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(DarkKnightPlaybackConditionNeverProcedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(DarkKnightPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState4.animateWhen(DarkKnightAttack2PlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState5.animateWhen(DarkKnightAnimation3PlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState6.animateWhen(DarkKnightdeadPlaybackConditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		DarkKnightOnTicksProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 135);
		builder = builder.add(Attributes.ARMOR, 10);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 7);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1);
		return builder;
	}
}