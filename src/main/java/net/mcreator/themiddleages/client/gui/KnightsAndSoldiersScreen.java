package net.mcreator.themiddleages.client.gui;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphicsExtractor;

import net.mcreator.themiddleages.world.inventory.KnightsAndSoldiersMenu;
import net.mcreator.themiddleages.network.KnightsAndSoldiersButtonMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class KnightsAndSoldiersScreen extends AbstractContainerScreen<KnightsAndSoldiersMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private ImageButton imagebutton_basebuttons;
	private ImageButton imagebutton_basebuttons1;
	private ImageButton imagebutton_basebuttons2;
	private static final Identifier IMAGE_0 = Identifier.parse("the_middle_ages:textures/screens/background.png");
	private static final Identifier IMAGE_1 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_2 = Identifier.parse("the_middle_ages:textures/screens/peace.png");
	private static final Identifier IMAGE_3 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_4 = Identifier.parse("the_middle_ages:textures/screens/swordclashiamge.png");
	private static final Identifier IMAGE_5 = Identifier.parse("the_middle_ages:textures/screens/wealth.png");
	private static final Identifier IMAGE_6 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_7 = Identifier.parse("the_middle_ages:textures/screens/peace.png");
	private static final Identifier IMAGE_8 = Identifier.parse("the_middle_ages:textures/screens/wealth.png");
	private static final Identifier IMAGE_9 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_10 = Identifier.parse("the_middle_ages:textures/screens/peace.png");
	private static final Identifier IMAGE_11 = Identifier.parse("the_middle_ages:textures/screens/wealth.png");
	private static final Identifier IMAGE_12 = Identifier.parse("the_middle_ages:textures/screens/world.png");
	private static final Identifier IMAGE_13 = Identifier.parse("the_middle_ages:textures/screens/world.png");
	private static final Identifier IMAGE_14 = Identifier.parse("the_middle_ages:textures/screens/world.png");

	public KnightsAndSoldiersScreen(KnightsAndSoldiersMenu container, Inventory inventory, Component text) {
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
		super.extractRenderState(guiGraphics, mouseX, mouseY, partialTicks);
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + 0, this.topPos + -1, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + 21, this.topPos + -27, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + 37, this.topPos + 12, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_3, this.leftPos + 17, this.topPos + 47, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_4, this.leftPos + 13, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_5, this.leftPos + 90, this.topPos + 45, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_6, this.leftPos + 17, this.topPos + 86, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_7, this.leftPos + 12, this.topPos + 94, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_8, this.leftPos + 90, this.topPos + 87, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_9, this.leftPos + 18, this.topPos + 126, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_10, this.leftPos + 12, this.topPos + 134, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_11, this.leftPos + 90, this.topPos + 126, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_12, this.leftPos + 151, this.topPos + 60, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_13, this.leftPos + 152, this.topPos + 102, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_14, this.leftPos + 152, this.topPos + 141, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_knights_or_soldiers"), 33, -3, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_hiring_gui"), 57, 13, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_knight"), 32, 58, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_3"), 87, 48, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_hire"), 105, 64, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_soldier"), 31, 96, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_1"), 86, 90, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_hire1"), 105, 105, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_archer"), 31, 136, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_11"), 86, 128, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knights_and_soldiers.label_hire2"), 105, 144, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_basebuttons = new ImageButton(this.leftPos + 86, this.topPos + 62, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KnightsAndSoldiersScreen.this.x;
					int y = KnightsAndSoldiersScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KnightsAndSoldiersButtonMessage(0, x, y, z));
						KnightsAndSoldiersButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons);
		imagebutton_basebuttons1 = new ImageButton(this.leftPos + 86, this.topPos + 103, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KnightsAndSoldiersScreen.this.x;
					int y = KnightsAndSoldiersScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KnightsAndSoldiersButtonMessage(1, x, y, z));
						KnightsAndSoldiersButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons1);
		imagebutton_basebuttons2 = new ImageButton(this.leftPos + 86, this.topPos + 142, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KnightsAndSoldiersScreen.this.x;
					int y = KnightsAndSoldiersScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KnightsAndSoldiersButtonMessage(2, x, y, z));
						KnightsAndSoldiersButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons2);
	}
}