package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.arrow.Arrow;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.EnemyArcherEntity;
import net.mcreator.themiddleages.entity.DarkkingEntity;
import net.mcreator.themiddleages.entity.DarkSoldierEntity;
import net.mcreator.themiddleages.entity.DarkKnightEntity;

import java.util.Comparator;

public class EnemyArcheronTicksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity target = null;
		double dist = 0;
		double Ydiff = 0;
		double actionState = 0;
		double AttackDamage = 0;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof DarkKnightEntity) {
				if (entity instanceof Mob _entity)
					_entity.setTarget(null);
			} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof DarkSoldierEntity) {
				if (entity instanceof Mob _entity)
					_entity.setTarget(null);
			} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof EnemyArcherEntity) {
				if (entity instanceof Mob _entity)
					_entity.setTarget(null);
			} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof DarkkingEntity) {
				if (entity instanceof Mob _entity)
					_entity.setTarget(null);
			}
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).Attack == true) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
				if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(512 / 2d), e -> true).isEmpty()) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Player.class, x, y, z, 512)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 512)).getY()),
								((findEntityInWorldRange(world, Player.class, x, y, z, 512)).getZ()), 1);
				} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(12 / 2d), e -> true).isEmpty()) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().stop();
					if ((findEntityInWorldRange(world, Player.class, x, y, z, 512)) instanceof Mob _entity)
						_entity.setTarget(null);
				}
			}
		}
		if (!world.isClientSide()) {
			actionState = entity instanceof EnemyArcherEntity _datEntI ? _datEntI.getEntityData().get(EnemyArcherEntity.DATA_actionstate) : 0;
			if ((entity instanceof EnemyArcherEntity _datEntI ? _datEntI.getEntityData().get(EnemyArcherEntity.DATA_actionstate) : 0) == 0) {
				entity.getPersistentData().putDouble("ticks", (entity.getPersistentData().getDoubleOr("ticks", 0) + 1));
				if (entity.getPersistentData().getDoubleOr("ticks", 0) > 4) {
					target = entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null;
					entity.getPersistentData().putDouble("ticks", 0);
					if (target != null) {
						if (entity instanceof EnemyArcherEntity _datEntSetI)
							_datEntSetI.getEntityData().set(EnemyArcherEntity.DATA_actionstate, 1);
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((target.getX()), (target.getY()), (target.getZ())));
					}
				}
			} else {
				entity.getPersistentData().putDouble("actionTicks", (entity.getPersistentData().getDoubleOr("actionTicks", 0) + 1));
				if ((entity instanceof EnemyArcherEntity _datEntI ? _datEntI.getEntityData().get(EnemyArcherEntity.DATA_actionstate) : 0) == 1) {
					AttackDamage = entity instanceof LivingEntity _livingEntity42 && _livingEntity42.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity42.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0;
					if (entity.getPersistentData().getDoubleOr("actionTicks", 0) == 18) {
						for (Entity entityiterator : world.getEntities(null, new AABB((x + (entity.getLookAngle().x * 0.6 + 0.5) * entity.getBbWidth()), y, (z + (entity.getLookAngle().z * 0.6 + 0.5) * entity.getBbWidth()),
								(x + (entity.getLookAngle().x * 0.6 - 0.5) * entity.getBbWidth()), (y + entity.getBbHeight()), (z + (entity.getLookAngle().z * 0.6 - 0.5) * entity.getBbWidth())))) {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = initArrowProjectile(
											new Arrow(projectileLevel, 0, 0, 0, new Arrow(EntityType.ARROW, projectileLevel).getPickupItemStackOrigin(), createArrowWeaponItemStack(projectileLevel, 1, (byte) 0)), null, 8, false, false, false,
											AbstractArrow.Pickup.DISALLOWED);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.crossbow.loading_start")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.crossbow.loading_start")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else if (entity.getPersistentData().getDoubleOr("actionTicks", 0) > 40) {
						if (entity instanceof EnemyArcherEntity _datEntSetI)
							_datEntSetI.getEntityData().set(EnemyArcherEntity.DATA_actionstate, 0);
						entity.getPersistentData().putDouble("actionTicks", 0);
					}
				} else if (actionState == 100) {
					if (entity.getPersistentData().getDoubleOr("actionTicks", 0) > 20) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.big_fall")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.big_fall")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (!entity.level().isClientSide())
							entity.discard();
						entity.getPersistentData().putDouble("actionTicks", 0);
					}
				}
			}
		}
		if (actionState == 100) {
			if (entity.getPersistentData().getDoubleOr("actionTicks", 0) > 20) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), (entity.getBbWidth() / 2d), 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.big_fall")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.big_fall")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
				entity.getPersistentData().putDouble("actionTicks", 0);
			}
		}
		if (TheMiddleAgesModVariables.MapVariables.get(world).Attack == true) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null) {
				if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(5 / 2d), e -> true).isEmpty()) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().stop();
				} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(128 / 2d), e -> true).isEmpty()) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(((findEntityInWorldRange(world, Player.class, x, y, z, 128)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 128)).getY()),
								((findEntityInWorldRange(world, Player.class, x, y, z, 128)).getZ()), 1);
				}
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}

	private static AbstractArrow initArrowProjectile(AbstractArrow entityToSpawn, Entity shooter, float damage, boolean silent, boolean fire, boolean particles, AbstractArrow.Pickup pickup) {
		entityToSpawn.setOwner(shooter);
		entityToSpawn.setBaseDamage(damage);
		if (silent)
			entityToSpawn.setSilent(true);
		if (fire)
			entityToSpawn.igniteForSeconds(100);
		if (particles)
			entityToSpawn.setCritArrow(true);
		entityToSpawn.pickup = pickup;
		return entityToSpawn;
	}

	private static ItemStack createArrowWeaponItemStack(Level level, int knockback, byte piercing) {
		ItemStack weapon = new ItemStack(Items.ARROW);
		if (knockback > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.KNOCKBACK), knockback);
		if (piercing > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PIERCING), piercing);
		return weapon;
	}
}