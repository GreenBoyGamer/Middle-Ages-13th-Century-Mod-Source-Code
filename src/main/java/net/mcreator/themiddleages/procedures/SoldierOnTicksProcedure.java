package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.themiddleages.entity.SoldierEntity;

public class SoldierOnTicksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity target = null;
		double dist = 0;
		double Ydiff = 0;
		double actionState = 0;
		double AttackDamage = 0;
		if (!world.isClientSide()) {
			actionState = entity instanceof SoldierEntity _datEntI ? _datEntI.getEntityData().get(SoldierEntity.DATA_actionstate) : 0;
			if ((entity instanceof SoldierEntity _datEntI ? _datEntI.getEntityData().get(SoldierEntity.DATA_fightingState) : 0) == 0) {
				if (actionState == 0) {
					entity.getPersistentData().putDouble("ticks", (entity.getPersistentData().getDouble("ticks") + 1));
					if (entity.getPersistentData().getDouble("ticks") > 4) {
						target = entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null;
						entity.getPersistentData().putDouble("ticks", 0);
						if (target != null) {
							dist = Math.pow(target.getX() - x, 2) + Math.pow(target.getZ() - z, 2);
							Ydiff = target.getY() - y;
							if (dist < Math.pow(entity.getBbWidth() * 1.2 + target.getBbWidth() * 0.5, 2) && Ydiff < entity.getBbHeight() && Ydiff > target.getBbHeight() * (-1)) {
								if (entity instanceof SoldierEntity _datEntSetI)
									_datEntSetI.getEntityData().set(SoldierEntity.DATA_actionstate, Mth.nextInt(RandomSource.create(), 1, 2));
								entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((target.getX()), (target.getY()), (target.getZ())));
							}
						}
					}
				} else {
					entity.getPersistentData().putDouble("actionTicks", (entity.getPersistentData().getDouble("actionTicks") + 1));
					if (actionState < 3) {
						AttackDamage = entity instanceof LivingEntity _livingEntity23 && _livingEntity23.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity23.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0;
						if (entity.getPersistentData().getDouble("actionTicks") == 4) {
							for (Entity entityiterator : world.getEntities(null, new AABB((x + (entity.getLookAngle().x * 0.6 + 0.5) * entity.getBbWidth()), y, (z + (entity.getLookAngle().z * 0.6 + 0.5) * entity.getBbWidth()),
									(x + (entity.getLookAngle().x * 0.6 - 0.5) * entity.getBbWidth()), (y + entity.getBbHeight()), (z + (entity.getLookAngle().z * 0.6 - 0.5) * entity.getBbWidth())))) {
								if (!(entity == entityiterator)) {
									entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MOB_ATTACK), entity), (float) AttackDamage);
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
							}
						} else if (entity.getPersistentData().getDouble("actionTicks") > 14) {
							if (entity instanceof SoldierEntity _datEntSetI)
								_datEntSetI.getEntityData().set(SoldierEntity.DATA_actionstate, 0);
							entity.getPersistentData().putDouble("actionTicks", 0);
						}
					} else if (actionState == 100) {
						if (entity.getPersistentData().getDouble("actionTicks") > 20) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.big_fall")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.big_fall")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (!entity.level().isClientSide())
								entity.discard();
							entity.getPersistentData().putDouble("actionTicks", 0);
						}
					}
				}
			}
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null) {
			if (!((entity instanceof SoldierEntity _datEntI ? _datEntI.getEntityData().get(SoldierEntity.DATA_fightingState) : 0) == 1)) {
				entity.getPersistentData().putDouble("InaFight", (entity.getPersistentData().getDouble("InaFight") + 1));
				if (entity.getPersistentData().getDouble("InaFight") > 119) {
					if (entity instanceof SoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(SoldierEntity.DATA_fightingState, 1);
					if (entity instanceof SoldierEntity _datEntSetI)
						_datEntSetI.getEntityData().set(SoldierEntity.DATA_actionstate, 0);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 255, false, true));
					entity.getPersistentData().putDouble("InaFight", 0);
					entity.setInvulnerable(true);
				}
			}
		}
		if ((entity instanceof SoldierEntity _datEntI ? _datEntI.getEntityData().get(SoldierEntity.DATA_fightingState) : 0) == 1) {
			entity.getPersistentData().putDouble("Bakwas", (entity.getPersistentData().getDouble("Bakwas") + 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 255, false, false));
			if (entity.getPersistentData().getDouble("Bakwas") > 65) {
				if (entity instanceof SoldierEntity _datEntSetI)
					_datEntSetI.getEntityData().set(SoldierEntity.DATA_fightingState, 0);
				entity.getPersistentData().putDouble("Bakwas", 0);
				entity.setInvulnerable(false);
			}
		}
	}
}