package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.entity.Civilian4Entity;

public class Civilian4DiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
				StringBuilder _titleTextBuilder = new StringBuilder();
				_titleTextBuilder.append("Dignity -8");
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
			TheMiddleAgesModVariables.MapVariables.get(world).Dignity = TheMiddleAgesModVariables.MapVariables.get(world).Dignity - 8;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.big_fall")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.big_fall")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 60, 255, false, false));
		TheMiddleAgesModVariables.MapVariables.get(world).Wealth = TheMiddleAgesModVariables.MapVariables.get(world).Wealth - 10;
		TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians = TheMiddleAgesModVariables.MapVariables.get(world).Local_Civilians - 1;
		TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		if (entity instanceof Civilian4Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian4Entity.DATA_TimeToDie, 1);
		if (entity instanceof Civilian4Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian4Entity.DATA_Eat, 0);
		if (entity instanceof Civilian4Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian4Entity.DATA_DoingJob, 0);
		if (entity instanceof Civilian4Entity _datEntSetI)
			_datEntSetI.getEntityData().set(Civilian4Entity.DATA_buy, 0);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(1);
		entity.setInvulnerable(true);
	}
}