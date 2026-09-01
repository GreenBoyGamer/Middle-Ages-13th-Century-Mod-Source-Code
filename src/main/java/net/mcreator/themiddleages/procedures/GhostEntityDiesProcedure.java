package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.GhostOfCruelKingEntity;
import net.mcreator.themiddleages.TheMiddleAgesMod;

public class GhostEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
			StringBuilder _titleTextBuilder = new StringBuilder();
			_titleTextBuilder.append("You Win!");
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
		TheMiddleAgesMod.queueServerWork(20, () -> {
			if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
				StringBuilder _titleTextBuilder = new StringBuilder();
				_titleTextBuilder.append("Wealth +120");
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
			TheMiddleAgesMod.queueServerWork(20, () -> {
				if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
					StringBuilder _titleTextBuilder = new StringBuilder();
					_titleTextBuilder.append("Dignity +12");
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
			});
		});
		TheMiddleAgesModVariables.MapVariables.get(world).Wealth = TheMiddleAgesModVariables.MapVariables.get(world).Wealth + 120;
		TheMiddleAgesModVariables.MapVariables.get(world).Dignity = TheMiddleAgesModVariables.MapVariables.get(world).Dignity + 12;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		if (entity instanceof GhostOfCruelKingEntity _datEntSetI)
			_datEntSetI.getEntityData().set(GhostOfCruelKingEntity.DATA_actionstate, 100);
		if (entity instanceof GhostOfCruelKingEntity _datEntSetI)
			_datEntSetI.getEntityData().set(GhostOfCruelKingEntity.DATA_fightingState, 0);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.getPersistentData().putDouble("actionTicks", 0);
		entity.setInvulnerable(true);
	}
}