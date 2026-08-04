package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.entity.PassengerCartEntity;
import net.mcreator.themiddleages.entity.MadievalHorseEntity;

import java.util.Comparator;

public class MadievalHorseOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean riding = false;
		if ((entity instanceof MadievalHorseEntity _datEntI ? _datEntI.getEntityData().get(MadievalHorseEntity.DATA_actionState) : 0) == 100) {
			entity.getPersistentData().putDouble("HorseDying", (entity.getPersistentData().getDouble("HorseDying") + 1));
			if (entity.getPersistentData().getDouble("HorseDying") == 100) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.horse.hurt")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.horse.hurt")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
				if (!entity.level().isClientSide())
					entity.discard();
				entity.getPersistentData().putDouble("HorseDying", 0);
			}
		}
		if (!world.getEntitiesOfClass(PassengerCartEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(2 / 2d), e -> true).isEmpty()) {
			if (entity instanceof Mob _entity)
				_entity.getNavigation().stop();
		} else if (!world.getEntitiesOfClass(PassengerCartEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(8 / 2d), e -> true).isEmpty()) {
			if (!(findEntityInWorldRange(world, PassengerCartEntity.class, x, y, z, 8)).isVehicle()) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((findEntityInWorldRange(world, PassengerCartEntity.class, x, y, z, 8)).getX()), ((findEntityInWorldRange(world, PassengerCartEntity.class, x, y, z, 8)).getY()),
							((findEntityInWorldRange(world, PassengerCartEntity.class, x, y, z, 8)).getZ()), 1);
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}