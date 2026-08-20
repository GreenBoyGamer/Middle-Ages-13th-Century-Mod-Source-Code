package net.mcreator.themiddleages.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.procedures.*;

public class DarkSoldierEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_actionstate = SynchedEntityData.defineId(DarkSoldierEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_fightingState = SynchedEntityData.defineId(DarkSoldierEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_notgonnarob = SynchedEntityData.defineId(DarkSoldierEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_Scared = SynchedEntityData.defineId(DarkSoldierEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_StopRobbing = SynchedEntityData.defineId(DarkSoldierEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();
	public final AnimationState animationState4 = new AnimationState();
	public final AnimationState animationState5 = new AnimationState();
	public final AnimationState animationState6 = new AnimationState();
	public final AnimationState animationState7 = new AnimationState();
	public final AnimationState animationState8 = new AnimationState();

	public DarkSoldierEntity(EntityType<DarkSoldierEntity> type, Level world) {
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
		builder.define(DATA_notgonnarob, false);
		builder.define(DATA_Scared, 0);
		builder.define(DATA_StopRobbing, 0);
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
				double x = DarkSoldierEntity.this.getX();
				double y = DarkSoldierEntity.this.getY();
				double z = DarkSoldierEntity.this.getZ();
				Entity entity = DarkSoldierEntity.this;
				Level world = DarkSoldierEntity.this.level();
				return super.canUse() && Set0SoldierProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DarkSoldierEntity.this.getX();
				double y = DarkSoldierEntity.this.getY();
				double z = DarkSoldierEntity.this.getZ();
				Entity entity = DarkSoldierEntity.this;
				Level world = DarkSoldierEntity.this.level();
				return super.canContinueToUse() && Set0SoldierProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = DarkSoldierEntity.this.getX();
				double y = DarkSoldierEntity.this.getY();
				double z = DarkSoldierEntity.this.getZ();
				Entity entity = DarkSoldierEntity.this;
				Level world = DarkSoldierEntity.this.level();
				return super.canUse() && Set0SoldierProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DarkSoldierEntity.this.getX();
				double y = DarkSoldierEntity.this.getY();
				double z = DarkSoldierEntity.this.getZ();
				Entity entity = DarkSoldierEntity.this;
				Level world = DarkSoldierEntity.this.level();
				return super.canContinueToUse() && Set0SoldierProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = DarkSoldierEntity.this.getX();
				double y = DarkSoldierEntity.this.getY();
				double z = DarkSoldierEntity.this.getZ();
				Entity entity = DarkSoldierEntity.this;
				Level world = DarkSoldierEntity.this.level();
				return super.canUse() && Set0SoldierProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DarkSoldierEntity.this.getX();
				double y = DarkSoldierEntity.this.getY();
				double z = DarkSoldierEntity.this.getZ();
				Entity entity = DarkSoldierEntity.this;
				Level world = DarkSoldierEntity.this.level();
				return super.canContinueToUse() && Set0SoldierProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new FloatGoal(this));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, KnightEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, SoldierEntity.class, false, false));
		this.goalSelector.addGoal(8, new AvoidEntityGoal<>(this, Player.class, (float) 12, 1.2, 1.2));
		this.goalSelector.addGoal(9, new FollowMobGoal(this, 1, (float) 10, (float) 5));
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
		DarkSoldierDiesProcedure.execute(this);
	}

	@Override
	public void addAdditionalSaveData(ValueOutput valueOutput) {
		super.addAdditionalSaveData(valueOutput);
		valueOutput.putInt("Dataactionstate", this.entityData.get(DATA_actionstate));
		valueOutput.putInt("DatafightingState", this.entityData.get(DATA_fightingState));
		valueOutput.putBoolean("Datanotgonnarob", this.entityData.get(DATA_notgonnarob));
		valueOutput.putInt("DataScared", this.entityData.get(DATA_Scared));
		valueOutput.putInt("DataStopRobbing", this.entityData.get(DATA_StopRobbing));
	}

	@Override
	public void readAdditionalSaveData(ValueInput valueInput) {
		super.readAdditionalSaveData(valueInput);
		this.entityData.set(DATA_actionstate, valueInput.getIntOr("Dataactionstate", 0));
		this.entityData.set(DATA_fightingState, valueInput.getIntOr("DatafightingState", 0));
		this.entityData.set(DATA_notgonnarob, valueInput.getBooleanOr("Datanotgonnarob", false));
		this.entityData.set(DATA_Scared, valueInput.getIntOr("DataScared", 0));
		this.entityData.set(DATA_StopRobbing, valueInput.getIntOr("DataStopRobbing", 0));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.SUCCESS;
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level();

		DarkSoldierRightclickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
		return retval;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(DarkSoldierBlockingPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState2.animateWhen(SoldierSprintPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(DarkSoldierPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState4.animateWhen(DarkSoldierAttack2PlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState5.animateWhen(DarkSoldierDeadPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState6.animateWhen(DarkSoldierNotAnythuingDoingMeansIdleProcedure.execute(this), this.tickCount);
			this.animationState7.animateWhen(DarkSoldierThreatPlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState8.animateWhen(DarkSoldierScaredPlaybackConditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		DarkSoldierOnEntityTicksProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
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