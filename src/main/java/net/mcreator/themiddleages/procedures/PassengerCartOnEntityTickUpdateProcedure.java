package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.entity.PassengerCartEntity;
import net.mcreator.themiddleages.entity.MadievalHorseEntity;
import net.mcreator.themiddleages.TheMiddleAgesMod;

import java.util.Comparator;

public class PassengerCartOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean Following = false;
		double cartYaw = 0;
		if (!world.getEntitiesOfClass(MadievalHorseEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
			cartYaw = (findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 4)).getYRot() - (entity instanceof PassengerCartEntity _datEntI ? _datEntI.getEntityData().get(PassengerCartEntity.DATA_entityYaw) : 0);
			if (entity instanceof PassengerCartEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PassengerCartEntity.DATA_entityYaw, (int) ((entity instanceof PassengerCartEntity _datEntI ? _datEntI.getEntityData().get(PassengerCartEntity.DATA_entityYaw) : 0)
						+ ((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 4)).getYRot() - (entity instanceof PassengerCartEntity _datEntI ? _datEntI.getEntityData().get(PassengerCartEntity.DATA_entityYaw) : 0)) * 0.2));
			TheMiddleAgesMod.queueServerWork(4, () -> {
				if (!world.getEntitiesOfClass(MadievalHorseEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity instanceof PassengerCartEntity _datEntI ? _datEntI.getEntityData().get(PassengerCartEntity.DATA_entityYaw) : 0));
						_ent.setXRot((findEntityInWorldRange(world, MadievalHorseEntity.class, x, y, z, 4)).getXRot());
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				}
			});
			Entity horse = findEntityInWorldRange(world, net.mcreator.themiddleages.entity.MadievalHorseEntity.class, x, y, z, 4);
			if (horse != null) {
				double distance = 1.5;
				float horseYaw = horse.getYRot();
				double offsetX = Math.sin(Math.toRadians(horseYaw)) * distance;
				double offsetZ = -Math.cos(Math.toRadians(horseYaw)) * distance;
				// Teleport position immediately
				entity.teleportTo(horse.getX() + offsetX, horse.getY(), horse.getZ() + offsetZ);
				// Smooth rotation only
				float currentYaw = entity.getYRot();
				float rotationSpeed = 0.15F;
				float difference = horseYaw - currentYaw;
				// Fix 360 degree rotation issue
				while (difference > 180)
					difference -= 360;
				while (difference < -180)
					difference += 360;
				float newYaw = currentYaw + difference * rotationSpeed;
				entity.setYRot(newYaw);
				entity.yRotO = newYaw;
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}