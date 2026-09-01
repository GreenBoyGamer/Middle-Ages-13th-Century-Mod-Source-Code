package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.init.TheMiddleAgesModItems;
import net.mcreator.themiddleages.init.TheMiddleAgesModEntities;

public class GhostSummonerRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(TheMiddleAgesModItems.GHOST_SUMMONER.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
			StringBuilder _titleTextBuilder = new StringBuilder();
			_titleTextBuilder.append("DEFEAT HIM!!");
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
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = TheMiddleAgesModEntities.GHOST_OF_CRUEL_KING.get().spawn(_level, BlockPos.containing(x, y + 1, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ambient.cave")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ambient.cave")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}