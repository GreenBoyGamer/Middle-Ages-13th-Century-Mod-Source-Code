package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.Civilian1Entity;
import net.mcreator.themiddleages.entity.BuyerEntity;

import java.util.Comparator;

public class BuyerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(Civilian1Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(5 / 2d), e -> true).isEmpty()) {
			if (((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 5)) instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_carry) : 0) == 1) {
				if (entity instanceof BuyerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BuyerEntity.DATA_giveThanks, 1);
				entity.getPersistentData().putDouble("buyerBuyingTicks", (entity.getPersistentData().getDoubleOr("buyerBuyingTicks", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("buyerBuyingTicks", 0) > 25) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, (float) 1.3);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:huming")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof BuyerEntity _datEntSetI)
						_datEntSetI.getEntityData().set(BuyerEntity.DATA_buy, 1);
					if (entity instanceof BuyerEntity _datEntSetI)
						_datEntSetI.getEntityData().set(BuyerEntity.DATA_giveThanks, 0);
					entity.getPersistentData().putDouble("buyerBuyingTicks", 0);
				}
			}
			if ((entity instanceof BuyerEntity _datEntI ? _datEntI.getEntityData().get(BuyerEntity.DATA_buy) : 0) == 1) {
				entity.getPersistentData().putDouble("BuyingDone", (entity.getPersistentData().getDoubleOr("BuyingDone", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("BuyingDone", 0) > 30) {
					if (entity instanceof BuyerEntity _datEntSetI)
						_datEntSetI.getEntityData().set(BuyerEntity.DATA_buy, 0);
					if (!world.getEntitiesOfClass(Civilian1Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
						if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time > 16000) {
							if ((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)) instanceof Civilian1Entity _datEntSetI)
								_datEntSetI.getEntityData().set(Civilian1Entity.DATA_stop, 0);
						}
						if ((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)) instanceof Civilian1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian1Entity.DATA_carry, 0);
						if ((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)) instanceof Civilian1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian1Entity.DATA_Vegetables, 0);
						if ((findEntityInWorldRange(world, Civilian1Entity.class, x, y, z, 7)) instanceof Civilian1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(Civilian1Entity.DATA_Money,
									(int) ((entity instanceof Civilian1Entity _datEntI ? _datEntI.getEntityData().get(Civilian1Entity.DATA_Vegetables) : 0) + Mth.nextInt(RandomSource.create(), 3, 7)));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				}
			}
		}
		if ((entity instanceof BuyerEntity _datEntI ? _datEntI.getEntityData().get(BuyerEntity.DATA_TimeToDie) : 0) == 1) {
			entity.getPersistentData().putDouble("AmDying", (entity.getPersistentData().getDoubleOr("AmDying", 0) + 1));
			if (entity.getPersistentData().getDoubleOr("AmDying", 0) > 30) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:dying_sound")), SoundSource.NEUTRAL, 1, (float) 1.3);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:dying_sound")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
		if (entity instanceof LivingEntity livingEntity && !livingEntity.level().isClientSide()) {
			// Check if the entity is not already sleeping
			if (!livingEntity.isSleeping()) {
				// Look for a nearby bed block within a 6 block radius
				BlockPos entityPos = livingEntity.blockPosition();
				BlockPos targetBedPos = null;
				for (BlockPos pos : BlockPos.betweenClosed(entityPos.offset(-6, -3, -6), entityPos.offset(6, 3, 6))) {
					if (livingEntity.level().getBlockState(pos).is(net.minecraft.tags.BlockTags.BEDS)) {
						targetBedPos = pos.immutable();
						break;
					}
				}
				// If a bed is found, force the entity to sleep on it
				if (targetBedPos != null) {
					livingEntity.setPos(targetBedPos.getX() + 0.5, targetBedPos.getY(), targetBedPos.getZ() + 0.5);
					livingEntity.startSleeping(targetBedPos);
				}
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}