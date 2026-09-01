package net.mcreator.themiddleages.procedures;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.themiddleages.network.PlayPlayerAnimationMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModItems;
import net.mcreator.themiddleages.TheMiddleAgesMod;

public class CrownBlockOnBlockRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack3 = new ItemStack(TheMiddleAgesModItems.CROWN_HELMET.get()).copy();
				_setstack3.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (entity instanceof Player) {
				if (entity.level().isClientSide()) {
					CompoundTag data = entity.getPersistentData();
					data.putString("PlayerCurrentAnimation", "the_middle_ages:crown_equip");
					data.putBoolean("OverrideCurrentAnimation", false);
					data.putBoolean("FirstPersonAnimation", true);
				} else {
					PacketDistributor.sendToPlayersInDimension((ServerLevel) entity.level(), new PlayPlayerAnimationMessage(entity.getId(), "the_middle_ages:crown_equip", false, true));
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			TheMiddleAgesMod.queueServerWork(40, () -> {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack8 = ItemStack.EMPTY.copy();
					_setstack8.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack8);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(TheMiddleAgesModItems.CROWN_HELMET.get()));
				}
				if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
					StringBuilder _titleTextBuilder = new StringBuilder();
					_titleTextBuilder.append("Welcome MR King");
					String _titleText = _titleTextBuilder.toString();
					net.minecraft.network.chat.Component _comp = net.minecraft.network.chat.Component.literal(_titleText);
					int _fadeTicks = (int) (0.5 * 20.0D);
					int _holdTicks = (int) (1 * 20.0D);
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
						_titleTextBuilder.append("To Middle Ages!");
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
		}
	}
}