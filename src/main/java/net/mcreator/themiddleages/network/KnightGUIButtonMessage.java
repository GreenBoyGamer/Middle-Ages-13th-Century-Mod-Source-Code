package net.mcreator.themiddleages.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

import net.mcreator.themiddleages.procedures.MercyProcedureProcedure;
import net.mcreator.themiddleages.procedures.FinishProcedureProcedure;
import net.mcreator.themiddleages.procedures.FineProcedureProcedure;
import net.mcreator.themiddleages.TheMiddleAgesMod;

@EventBusSubscriber
public record KnightGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {
	public static final Type<KnightGUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(TheMiddleAgesMod.MODID, "knight_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, KnightGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, KnightGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new KnightGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<KnightGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final KnightGUIButtonMessage message, final IPayloadContext context) {
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

			MercyProcedureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			FinishProcedureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			FineProcedureProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TheMiddleAgesMod.addNetworkMessage(KnightGUIButtonMessage.TYPE, KnightGUIButtonMessage.STREAM_CODEC, KnightGUIButtonMessage::handleData);
	}
}