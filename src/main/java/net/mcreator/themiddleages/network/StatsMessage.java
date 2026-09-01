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

import net.mcreator.themiddleages.procedures.StatsOnKeyPressedProcedure;
import net.mcreator.themiddleages.TheMiddleAgesMod;

@EventBusSubscriber
public record StatsMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<StatsMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(TheMiddleAgesMod.MODID, "key_stats"));
	public static final StreamCodec<RegistryFriendlyByteBuf, StatsMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, StatsMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new StatsMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<StatsMessage> type() {
		return TYPE;
	}

	public static void handleData(final StatsMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.getChunkSource().hasChunk(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z)))
			return;
		if (type == 0) {

			StatsOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TheMiddleAgesMod.addNetworkMessage(StatsMessage.TYPE, StatsMessage.STREAM_CODEC, StatsMessage::handleData);
	}
}