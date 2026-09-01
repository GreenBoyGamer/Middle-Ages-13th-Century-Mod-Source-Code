package net.mcreator.themiddleages.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
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

import net.mcreator.themiddleages.network.TheMiddleAgesModVariables;
import net.mcreator.themiddleages.init.TheMiddleAgesModItems;
import net.mcreator.themiddleages.init.TheMiddleAgesModEntities;

import java.util.Comparator;

public class RemoteRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (TheMiddleAgesModVariables.MapVariables.get(world).world_Time > 29) {
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(48 / 2d), e -> true).isEmpty()) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheMiddleAgesModEntities.DARKKING.get().spawn(_level, BlockPos.containing((findEntityInWorldRange(world, Player.class, x, y, z, 48)).getX() + 12,
							(findEntityInWorldRange(world, Player.class, x, y, z, 48)).getY(), (findEntityInWorldRange(world, Player.class, x, y, z, 48)).getZ() + 12), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:attack_shout")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("the_middle_ages:attack_shout")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			TheMiddleAgesModVariables.MapVariables.get(world).final_Attack = 1;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
			if (world instanceof net.minecraft.server.level.ServerLevel _servLvl) {
				StringBuilder _titleTextBuilder = new StringBuilder();
				_titleTextBuilder.append("§c" + "FINAL BATTLE STARTED!");
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
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(TheMiddleAgesModItems.REMOTE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			TheMiddleAgesModVariables.MapVariables.get(world).Attack = true;
			TheMiddleAgesModVariables.MapVariables.get(world).markSyncDirty();
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}