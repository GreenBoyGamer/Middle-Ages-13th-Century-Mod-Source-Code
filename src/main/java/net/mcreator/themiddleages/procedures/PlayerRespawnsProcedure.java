package net.mcreator.themiddleages.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.gamerules.GameRules;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.init.TheMiddleAgesModItems;
import net.mcreator.themiddleages.TheMiddleAgesMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerRespawnsProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (TheMiddleAgesModVariables.MapVariables.get(world).final_Attack > 0) {
			if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
				StringBuilder _titleTextBuilder = new StringBuilder();
				_titleTextBuilder.append("YOU LOSE!");
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
			TheMiddleAgesModVariables.MapVariables.get(world).Attack = false;
			TheMiddleAgesModVariables.MapVariables.get(world).final_Attack = 0;
			TheMiddleAgesModVariables.MapVariables.get(world).GUIController = 0;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModItems.WRITTEN.get()).copy();
				_setstack.setCount(1);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheMiddleAgesModItems.HISTORY.get()).copy();
				_setstack.setCount(1);
				_player.getInventory().placeItemBackInInventory(_setstack);
			}
			TheMiddleAgesMod.queueServerWork(60, () -> {
				if (world instanceof ServerLevel _serverLevel)
					_serverLevel.getGameRules().set(GameRules.KEEP_INVENTORY, false, world.getServer());
			});
		}
	}
}