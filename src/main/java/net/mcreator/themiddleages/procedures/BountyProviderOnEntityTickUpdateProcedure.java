package net.mcreator.themiddleages.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import net.mcreator.themiddleages.entity.BountyProviderEntity;

public class BountyProviderOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof BountyProviderEntity _datEntI ? _datEntI.getEntityData().get(BountyProviderEntity.DATA_TickCounts) : 0) == 1) {
			entity.getPersistentData().putDouble("TicksUpdate", (entity.getPersistentData().getDoubleOr("TicksUpdate", 0) + 1));
			if (entity.getPersistentData().getDoubleOr("TicksUpdate", 0) == 1) {
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Old Max> Hey King! "), false);
				}
			} else if (entity.getPersistentData().getDoubleOr("TicksUpdate", 0) == 10) {
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Old Max> I have got a work for you."), false);
				}
			} else if (entity.getPersistentData().getDoubleOr("TicksUpdate", 0) == 20) {
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("<Old Max> " + "§b" + "You have to defeat the ghost of OLD CRUEL KING")), false);
				}
			} else if (entity.getPersistentData().getDoubleOr("TicksUpdate", 0) == 30) {
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("<Old Max> " + "§b" + "The thing in your hand, it is the ghost summoner. it will summon the ghost of OLD CRUEL KING")), false);
				}
			} else if (entity.getPersistentData().getDoubleOr("TicksUpdate", 0) == 40) {
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Old Max> You will get reward for doing it"), false);
				}
			} else if (entity.getPersistentData().getDoubleOr("TicksUpdate", 0) > 50) {
				entity.getPersistentData().putDouble("TicksUpdate", 0);
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Old Max> Good Luck! I Am Leaving"), false);
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}