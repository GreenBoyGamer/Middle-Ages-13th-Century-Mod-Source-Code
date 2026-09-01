package net.mcreator.themiddleages.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.saveddata.SavedDataType;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;

import net.mcreator.themiddleages.TheMiddleAgesMod;

@EventBusSubscriber
public class TheMiddleAgesModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, TheMiddleAgesMod.MODID);
	public static Entity entity_gotAttacked = null;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		TheMiddleAgesMod.addNetworkMessage(SavedDataSyncMessage.TYPE, SavedDataSyncMessage.STREAM_CODEC, SavedDataSyncMessage::handleData);
	}

	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (event.getEntity() instanceof ServerPlayer player) {
			SavedData mapdata = MapVariables.get(player.level());
			SavedData worlddata = WorldVariables.get(player.level());
			if (mapdata != null)
				PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (event.getEntity() instanceof ServerPlayer player) {
			SavedData worlddata = WorldVariables.get(player.level());
			if (worlddata != null)
				PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		if (event.getLevel() instanceof ServerLevel level) {
			WorldVariables worldVariables = WorldVariables.get(level);
			if (worldVariables._syncDirty) {
				PacketDistributor.sendToPlayersInDimension(level, new SavedDataSyncMessage(1, worldVariables));
				worldVariables._syncDirty = false;
			}
			MapVariables mapVariables = MapVariables.get(level);
			if (mapVariables._syncDirty) {
				PacketDistributor.sendToAllPlayers(new SavedDataSyncMessage(0, mapVariables));
				mapVariables._syncDirty = false;
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final SavedDataType<WorldVariables> TYPE = new SavedDataType<>(Identifier.parse("the_middle_ages:worldvars"), level -> new WorldVariables(), level -> CompoundTag.CODEC.xmap(tag -> {
			WorldVariables instance = new WorldVariables();
			instance.read(tag, level.registryAccess());
			return instance;
		}, instance -> instance.save(new CompoundTag(), level.registryAccess())));
		boolean _syncDirty = false;

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
		}

		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			return nbt;
		}

		public void markSyncDirty() {
			this.setDirty();
			this._syncDirty = true;
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(WorldVariables.TYPE);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final SavedDataType<MapVariables> TYPE = new SavedDataType<>(Identifier.parse("the_middle_ages:mapvars"), level -> new MapVariables(), level -> CompoundTag.CODEC.xmap(tag -> {
			MapVariables instance = new MapVariables();
			instance.read(tag, level.registryAccess());
			return instance;
		}, instance -> instance.save(new CompoundTag(), level.registryAccess())));
		boolean _syncDirty = false;
		public double Wealth = 100.0;
		public double Dignity = 10.0;
		public double Local_Civilians = 0.0;
		public double Local_Civilians_In_Danger = 0.0;
		public double Soldiers = 0.0;
		public double Knights = 0.0;
		public boolean Attack = false;
		public double ticksforAttacks = 0;
		public double world_Time = 0;
		public double CoordX = 0;
		public double CoordY = 0;
		public double CoordZ = 0;
		public String XText = "\"\"";
		public String YText = "\"\"";
		public String ZText = "\"\"";
		public double dist = 0;
		public double animation_blank = 0;
		public double tick_passing_animation = 0;
		public boolean saved = false;
		public double lettoDie = 0;
		public double GUIController = 0;
		public boolean days_Count = false;
		public double final_Attack = 0;
		public boolean Win = false;
		public boolean override = false;
		public double Victory = 1.0;
		public boolean follow = false;
		public double item_number = 0;
		public double GUI_loader = 0;

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			Wealth = nbt.getDoubleOr("Wealth", 0);
			Dignity = nbt.getDoubleOr("Dignity", 0);
			Local_Civilians = nbt.getDoubleOr("Local_Civilians", 0);
			Local_Civilians_In_Danger = nbt.getDoubleOr("Local_Civilians_In_Danger", 0);
			Soldiers = nbt.getDoubleOr("Soldiers", 0);
			Knights = nbt.getDoubleOr("Knights", 0);
			Attack = nbt.getBooleanOr("Attack", false);
			ticksforAttacks = nbt.getDoubleOr("ticksforAttacks", 0);
			world_Time = nbt.getDoubleOr("world_Time", 0);
			CoordX = nbt.getDoubleOr("CoordX", 0);
			CoordY = nbt.getDoubleOr("CoordY", 0);
			CoordZ = nbt.getDoubleOr("CoordZ", 0);
			XText = nbt.getStringOr("XText", "");
			YText = nbt.getStringOr("YText", "");
			ZText = nbt.getStringOr("ZText", "");
			dist = nbt.getDoubleOr("dist", 0);
			animation_blank = nbt.getDoubleOr("animation_blank", 0);
			tick_passing_animation = nbt.getDoubleOr("tick_passing_animation", 0);
			saved = nbt.getBooleanOr("saved", false);
			lettoDie = nbt.getDoubleOr("lettoDie", 0);
			GUIController = nbt.getDoubleOr("GUIController", 0);
			days_Count = nbt.getBooleanOr("days_Count", false);
			final_Attack = nbt.getDoubleOr("final_Attack", 0);
			Win = nbt.getBooleanOr("Win", false);
			override = nbt.getBooleanOr("override", false);
			Victory = nbt.getDoubleOr("Victory", 0);
			follow = nbt.getBooleanOr("follow", false);
			item_number = nbt.getDoubleOr("item_number", 0);
			GUI_loader = nbt.getDoubleOr("GUI_loader", 0);
		}

		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			nbt.putDouble("Wealth", Wealth);
			nbt.putDouble("Dignity", Dignity);
			nbt.putDouble("Local_Civilians", Local_Civilians);
			nbt.putDouble("Local_Civilians_In_Danger", Local_Civilians_In_Danger);
			nbt.putDouble("Soldiers", Soldiers);
			nbt.putDouble("Knights", Knights);
			nbt.putBoolean("Attack", Attack);
			nbt.putDouble("ticksforAttacks", ticksforAttacks);
			nbt.putDouble("world_Time", world_Time);
			nbt.putDouble("CoordX", CoordX);
			nbt.putDouble("CoordY", CoordY);
			nbt.putDouble("CoordZ", CoordZ);
			nbt.putString("XText", XText);
			nbt.putString("YText", YText);
			nbt.putString("ZText", ZText);
			nbt.putDouble("dist", dist);
			nbt.putDouble("animation_blank", animation_blank);
			nbt.putDouble("tick_passing_animation", tick_passing_animation);
			nbt.putBoolean("saved", saved);
			nbt.putDouble("lettoDie", lettoDie);
			nbt.putDouble("GUIController", GUIController);
			nbt.putBoolean("days_Count", days_Count);
			nbt.putDouble("final_Attack", final_Attack);
			nbt.putBoolean("Win", Win);
			nbt.putBoolean("override", override);
			nbt.putDouble("Victory", Victory);
			nbt.putBoolean("follow", follow);
			nbt.putDouble("item_number", item_number);
			nbt.putDouble("GUI_loader", GUI_loader);
			return nbt;
		}

		public void markSyncDirty() {
			this.setDirty();
			this._syncDirty = true;
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAccessor) {
				return serverLevelAccessor.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(MapVariables.TYPE);
			} else {
				return clientSide;
			}
		}
	}

	public record SavedDataSyncMessage(int dataType, SavedData data) implements CustomPacketPayload {
		public static final Type<SavedDataSyncMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(TheMiddleAgesMod.MODID, "saved_data_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, SavedDataSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SavedDataSyncMessage message) -> {
			buffer.writeInt(message.dataType);
			if (message.data instanceof MapVariables mapVariables)
				buffer.writeNbt(mapVariables.save(new CompoundTag(), buffer.registryAccess()));
			else if (message.data instanceof WorldVariables worldVariables)
				buffer.writeNbt(worldVariables.save(new CompoundTag(), buffer.registryAccess()));
		}, (RegistryFriendlyByteBuf buffer) -> {
			int dataType = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			SavedData data = null;
			if (nbt != null) {
				data = dataType == 0 ? new MapVariables() : new WorldVariables();
				if (data instanceof MapVariables mapVariables)
					mapVariables.read(nbt, buffer.registryAccess());
				else if (data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt, buffer.registryAccess());
			}
			return new SavedDataSyncMessage(dataType, data);
		});

		@Override
		public Type<SavedDataSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final SavedDataSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> {
					if (message.dataType == 0)
						MapVariables.clientSide.read(((MapVariables) message.data).save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
					else
						WorldVariables.clientSide.read(((WorldVariables) message.data).save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}