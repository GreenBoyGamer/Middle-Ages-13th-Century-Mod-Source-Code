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

import net.mcreator.themiddleages.procedures.TradeClicksCV4Procedure;
import net.mcreator.themiddleages.procedures.ExileClicksCV4Procedure;
import net.mcreator.themiddleages.procedures.ExecuteClicksCV4Procedure;
import net.mcreator.themiddleages.TheMiddleAgesMod;

@EventBusSubscriber
public record Civilian4GUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {
	public static final Type<Civilian4GUIButtonMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(TheMiddleAgesMod.MODID, "civilian_4_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, Civilian4GUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, Civilian4GUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new Civilian4GUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<Civilian4GUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final Civilian4GUIButtonMessage message, final IPayloadContext context) {
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

			ExecuteClicksCV4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ExileClicksCV4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			TradeClicksCV4Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TheMiddleAgesMod.addNetworkMessage(Civilian4GUIButtonMessage.TYPE, Civilian4GUIButtonMessage.STREAM_CODEC, Civilian4GUIButtonMessage::handleData);
	}
}