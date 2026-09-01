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

import net.mcreator.themiddleages.procedures.*;
import net.mcreator.themiddleages.TheMiddleAgesMod;

@EventBusSubscriber
public record CutterGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {
	public static final Type<CutterGUIButtonMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(TheMiddleAgesMod.MODID, "cutter_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, CutterGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, CutterGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new CutterGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<CutterGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final CutterGUIButtonMessage message, final IPayloadContext context) {
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

			PlanksClickCutterGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			StairClickCutterGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			SlabClickCutterGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			FenceClickCutterGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			StickClickCutterGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			SignClickCutterGUIProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TheMiddleAgesMod.addNetworkMessage(CutterGUIButtonMessage.TYPE, CutterGUIButtonMessage.STREAM_CODEC, CutterGUIButtonMessage::handleData);
	}
}