package net.mcreator.themiddleages.item.inventory;

import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ItemAccessItemHandler;
import net.neoforged.neoforge.transfer.access.ItemAccess;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.core.component.DataComponents;

import net.mcreator.themiddleages.world.inventory.BookGUIMenu;
import net.mcreator.themiddleages.init.TheMiddleAgesModItems;

@EventBusSubscriber
public class WrittenInventoryCapability extends ItemAccessItemHandler {
	@SubscribeEvent
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == TheMiddleAgesModItems.WRITTEN.get()) {
			Player player = event.getPlayer();
			if (player.containerMenu instanceof BookGUIMenu)
				player.closeContainer();
		}
	}

	public WrittenInventoryCapability(ItemAccess access) {
		super(access, DataComponents.CONTAINER, 0);
	}

	@Override
	public boolean isValid(int index, ItemResource resource) {
		return super.isValid(index, resource) && resource.getItem() != TheMiddleAgesModItems.WRITTEN.get();
	}
}