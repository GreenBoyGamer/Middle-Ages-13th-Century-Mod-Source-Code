package net.mcreator.themiddleages.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.themiddleages.init.TheMiddleAgesModItems;
import net.mcreator.themiddleages.entity.BountyProviderEntity;

public class BountyProviderRightclickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof BountyProviderEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BountyProviderEntity.DATA_TickCounts, 1);
		if (sourceentity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(TheMiddleAgesModItems.GHOST_SUMMONER.get()).copy();
			_setstack.setCount(1);
			_player.getInventory().placeItemBackInInventory(_setstack);
		}
	}
}