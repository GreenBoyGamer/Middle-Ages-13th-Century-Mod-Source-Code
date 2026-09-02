package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.init.TheMiddleAgesModItems;
import net.mcreator.themiddleages.entity.EnemyArcherEntity;
import net.mcreator.themiddleages.entity.DarkkingEntity;
import net.mcreator.themiddleages.entity.DarkSoldierEntity;
import net.mcreator.themiddleages.entity.DarkKnightEntity;
import net.mcreator.themiddleages.TheMiddleAgesMod;

import java.util.Set;
import java.util.Comparator;

public class KingEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
			StringBuilder _titleTextBuilder = new StringBuilder();
			_titleTextBuilder.append("Congratulations!");
			String _titleText = _titleTextBuilder.toString();
			net.minecraft.network.chat.Component _comp = net.minecraft.network.chat.Component.literal(_titleText);
			int _fadeTicks = (int) (0.5 * 20.0D);
			int _holdTicks = (int) (2 * 20.0D);
			java.util.List<net.minecraft.server.level.ServerPlayer> _targetPlayers = new java.util.ArrayList<>();
			net.minecraft.world.entity.player.Player _closest = _servLvl.getNearestPlayer((double) x, (double) y, (double) z, 100.0D, false);
			if (_closest instanceof net.minecraft.server.level.ServerPlayer _sp) {
				_targetPlayers.add(_sp);
			}
			for (net.minecraft.server.level.ServerPlayer _sp : _targetPlayers) {
				_sp.connection.send(new net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket(_fadeTicks, _holdTicks, _fadeTicks));
				_sp.connection.send(new net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket(_comp));
			}
		}
		if (sourceentity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(TheMiddleAgesModItems.CROWN_HELMET.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (!world.getEntitiesOfClass(DarkKnightEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(128 / 2d), e -> true).isEmpty()) {
			if (!(findEntityInWorldRange(world, DarkKnightEntity.class, x, y, z, 128)).level().isClientSide())
				(findEntityInWorldRange(world, DarkKnightEntity.class, x, y, z, 128)).discard();
		} else if (!world.getEntitiesOfClass(DarkSoldierEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(128 / 2d), e -> true).isEmpty()) {
			if (!(findEntityInWorldRange(world, DarkSoldierEntity.class, x, y, z, 128)).level().isClientSide())
				(findEntityInWorldRange(world, DarkSoldierEntity.class, x, y, z, 128)).discard();
		} else if (!world.getEntitiesOfClass(EnemyArcherEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(128 / 2d), e -> true).isEmpty()) {
			if (!(findEntityInWorldRange(world, EnemyArcherEntity.class, x, y, z, 128)).level().isClientSide())
				(findEntityInWorldRange(world, EnemyArcherEntity.class, x, y, z, 128)).discard();
		}
		TheMiddleAgesMod.queueServerWork(20, () -> {
			TheMiddleAgesModVariables.MapVariables.get(world).Victory = 2;
			TheMiddleAgesModVariables.MapVariables.get(world).final_Attack = 0;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModItems.WRITTEN.get()).copy();
				_setstack.setCount(1);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModItems.HISTORY.get()).copy();
				_setstack.setCount(1);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
				StringBuilder _titleTextBuilder = new StringBuilder();
				_titleTextBuilder.append("You Win! MR KING");
				String _titleText = _titleTextBuilder.toString();
				net.minecraft.network.chat.Component _comp = net.minecraft.network.chat.Component.literal(_titleText);
				int _fadeTicks = (int) (0.5 * 20.0D);
				int _holdTicks = (int) (2 * 20.0D);
				java.util.List<net.minecraft.server.level.ServerPlayer> _targetPlayers = new java.util.ArrayList<>();
				net.minecraft.world.entity.player.Player _closest = _servLvl.getNearestPlayer((double) x, (double) y, (double) z, 100.0D, false);
				if (_closest instanceof net.minecraft.server.level.ServerPlayer _sp) {
					_targetPlayers.add(_sp);
				}
				for (net.minecraft.server.level.ServerPlayer _sp : _targetPlayers) {
					_sp.connection.send(new net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket(_fadeTicks, _holdTicks, _fadeTicks));
					_sp.connection.send(new net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket(_comp));
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect give @p darkness 3 5 true");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"effect give @p resistance 10 255 true");
			TheMiddleAgesMod.queueServerWork(20, () -> {
				if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(128 / 2d), e -> true).isEmpty()) {
					if (sourceentity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _serverLevel) {
						ResourceKey<Level> destinationType = Level.OVERWORLD;
						if (_player.level().dimension() == destinationType)
							return;
						ServerLevel nextLevel = _serverLevel.getServer().getLevel(destinationType);
						if (nextLevel != null) {
							_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
							_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), Set.of(), _player.getYRot(), _player.getXRot(), true);
							_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
							for (MobEffectInstance _effectinstance : _player.getActiveEffects())
								_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
							_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
						}
					}
					TheMiddleAgesModVariables.MapVariables.get(world).GUIController = 0;
					TheMiddleAgesModVariables.MapVariables.get(world).GUI_loader = 1;
					TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
				}
				TheMiddleAgesMod.queueServerWork(40, () -> {
					TheMiddleAgesModVariables.MapVariables.get(world).Victory = 1;
					TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
				});
			});
		});
		if (entity instanceof DarkkingEntity _datEntSetI)
			_datEntSetI.getEntityData().set(DarkkingEntity.DATA_actionstate, 1000);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.getPersistentData().putDouble("actionTicks", 0);
		entity.setInvulnerable(true);
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}