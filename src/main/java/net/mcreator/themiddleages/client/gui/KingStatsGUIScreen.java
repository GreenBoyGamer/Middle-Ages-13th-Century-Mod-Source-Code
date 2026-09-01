package net.mcreator.themiddleages.client.gui;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphicsExtractor;

import net.mcreator.themiddleages.world.inventory.KingStatsGUIMenu;
import net.mcreator.themiddleages.procedures.*;
import net.mcreator.themiddleages.network.KingStatsGUIButtonMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class KingStatsGUIScreen extends AbstractContainerScreen<KingStatsGUIMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private ImageButton imagebutton_basebuttons;
	private ImageButton imagebutton_basebuttons1;
	private ImageButton imagebutton_basebuttons2;
	private ImageButton imagebutton_basebuttons3;
	private ImageButton imagebutton_basebuttons4;
	private static final Identifier IMAGE_0 = Identifier.parse("the_middle_ages:textures/screens/background.png");
	private static final Identifier IMAGE_1 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_2 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_3 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_4 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_5 = Identifier.parse("the_middle_ages:textures/screens/civilians.png");
	private static final Identifier IMAGE_6 = Identifier.parse("the_middle_ages:textures/screens/danger.png");
	private static final Identifier IMAGE_7 = Identifier.parse("the_middle_ages:textures/screens/wealth.png");
	private static final Identifier IMAGE_8 = Identifier.parse("the_middle_ages:textures/screens/dignity.png");
	private static final Identifier IMAGE_9 = Identifier.parse("the_middle_ages:textures/screens/swordclashiamge.png");
	private static final Identifier IMAGE_10 = Identifier.parse("the_middle_ages:textures/screens/world.png");
	private static final Identifier IMAGE_11 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_12 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");

	public KingStatsGUIScreen(KingStatsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text, 176, 166);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void extractRenderState(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		if (mouseX > leftPos + 15 && mouseX < leftPos + 39 && mouseY > topPos + 146 && mouseY < topPos + 170) {
			guiGraphics.setTooltipForNextFrame(font, Component.translatable("gui.the_middle_ages.king_stats_gui.tooltip_your_local_civilians_that_are_in"), mouseX, mouseY);
		}
		super.extractRenderState(guiGraphics, mouseX, mouseY, partialTicks);
		if (ModelRendererForKingProcedure.execute(world, x, y, z, entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -863, this.topPos + -847, this.leftPos + 1137, this.topPos + 1153, 50, -livingEntity.getBbHeight() / (2.0f * livingEntity.getScale()), 2.25f, 0,
					livingEntity);
		}
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + 13, this.topPos + 55, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + 13, this.topPos + 87, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_3, this.leftPos + 13, this.topPos + 129, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_4, this.leftPos + 22, this.topPos + -25, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_5, this.leftPos + 75, this.topPos + 128, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_6, this.leftPos + 74, this.topPos + 145, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_7, this.leftPos + 76, this.topPos + 56, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_8, this.leftPos + 79, this.topPos + 70, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_9, this.leftPos + 117, this.topPos + -3, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_10, this.leftPos + 117, this.topPos + 15, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_11, this.leftPos + -25, this.topPos + 0, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_12, this.leftPos + 142, this.topPos + -1, 0, 0, 64, 32, 64, 32);
	}

	@Override
	public boolean keyPressed(KeyEvent event) {
		int key = InputConstants.getKey(event).getValue();
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(event);
	}

	@Override
	protected void extractLabels(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY) {
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_statics"), 27, 43, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_locals"), 29, 118, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_locals1"), 16, 132, -16711707, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_danger"), 16, 144, -16711724, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_wealth"), 16, 59, -16711900, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_dignity"), 15, 70, -15794432, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_soldiers"), 17, 90, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_knight"), 18, 101, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_enemies_preparing"), 42, -17, -12829636, false);
		guiGraphics.text(this.font, WealthRednerProcedure.execute(world), 55, 59, -16777216, false);
		guiGraphics.text(this.font, MercyRenderProcedure.execute(world), 58, 71, -16777216, false);
		guiGraphics.text(this.font, SoldierRendersProcedure.execute(world), 60, 90, -16777216, false);
		guiGraphics.text(this.font, KnightsRenderProcedure.execute(world), 56, 101, -16777216, false);
		guiGraphics.text(this.font, CivlianRendersProcedure.execute(world), 54, 132, -16777216, false);
		guiGraphics.text(this.font, DangerCivliansRenderProcedure.execute(world), 54, 145, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_attack"), 69, 1, -65536, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_piece"), 72, 19, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_wagoner"), -23, 8, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_follow"), 165, -4, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_unfollow"), 162, 16, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_basebuttons = new ImageButton(this.leftPos + 52, this.topPos + -2, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KingStatsGUIScreen.this.x;
					int y = KingStatsGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KingStatsGUIButtonMessage(0, x, y, z));
						KingStatsGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons);
		imagebutton_basebuttons1 = new ImageButton(this.leftPos + 52, this.topPos + 17, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KingStatsGUIScreen.this.x;
					int y = KingStatsGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KingStatsGUIButtonMessage(1, x, y, z));
						KingStatsGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons1);
		imagebutton_basebuttons2 = new ImageButton(this.leftPos + -37, this.topPos + 7, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KingStatsGUIScreen.this.x;
					int y = KingStatsGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KingStatsGUIButtonMessage(2, x, y, z));
						KingStatsGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons2);
		imagebutton_basebuttons3 = new ImageButton(this.leftPos + 151, this.topPos + -6, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KingStatsGUIScreen.this.x;
					int y = KingStatsGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KingStatsGUIButtonMessage(3, x, y, z));
						KingStatsGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons3);
		imagebutton_basebuttons4 = new ImageButton(this.leftPos + 151, this.topPos + 13, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KingStatsGUIScreen.this.x;
					int y = KingStatsGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KingStatsGUIButtonMessage(4, x, y, z));
						KingStatsGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons4);
	}
}