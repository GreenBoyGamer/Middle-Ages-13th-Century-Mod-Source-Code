package net.mcreator.themiddleages.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.Identifier;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

import net.mcreator.themiddleages.procedures.BuyWoolClicksProcedure;
import net.mcreator.themiddleages.procedures.BuyDyesClickProcedure;
import net.mcreator.themiddleages.procedures.BuyClothsClicksProcedure;
import net.mcreator.themiddleages.TheMiddleAgesMod;

@EventBusSubscriber
public record AliceGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {
	public static final Type<AliceGUIButtonMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(TheMiddleAgesMod.MODID, "alice_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, AliceGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, AliceGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new AliceGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<AliceGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final AliceGUIButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.getChunkSource().hasChunk(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z)))
			return;
		if (buttonID == 0) {

			BuyWoolClicksProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			BuyClothsClicksProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			BuyDyesClickProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TheMiddleAgesMod.addNetworkMessage(AliceGUIButtonMessage.TYPE, AliceGUIButtonMessage.STREAM_CODEC, AliceGUIButtonMessage::handleData);
	}
}