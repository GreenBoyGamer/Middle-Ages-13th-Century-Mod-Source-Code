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

import net.mcreator.themiddleages.world.inventory.JohnSmithGUIMenu;
import net.mcreator.themiddleages.network.JohnSmithGUIButtonMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class JohnSmithGUIScreen extends AbstractContainerScreen<JohnSmithGUIMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private ImageButton imagebutton_basebuttons;
	private ImageButton imagebutton_basebuttons1;
	private ImageButton imagebutton_basebuttons2;
	private ImageButton imagebutton_basebuttons3;
	private static final Identifier IMAGE_0 = Identifier.parse("the_middle_ages:textures/screens/background.png");
	private static final Identifier IMAGE_1 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_2 = Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png");
	private static final Identifier IMAGE_3 = Identifier.parse("the_middle_ages:textures/screens/peace.png");
	private static final Identifier IMAGE_4 = Identifier.parse("the_middle_ages:textures/screens/wealth.png");
	private static final Identifier IMAGE_5 = Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png");
	private static final Identifier IMAGE_6 = Identifier.parse("the_middle_ages:textures/screens/wealth.png");
	private static final Identifier IMAGE_7 = Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png");
	private static final Identifier IMAGE_8 = Identifier.parse("the_middle_ages:textures/screens/wealth.png");
	private static final Identifier IMAGE_9 = Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png");
	private static final Identifier IMAGE_10 = Identifier.parse("the_middle_ages:textures/screens/wealth.png");
	private static final Identifier IMAGE_11 = Identifier.parse("the_middle_ages:textures/screens/world.png");
	private static final Identifier IMAGE_12 = Identifier.parse("the_middle_ages:textures/screens/world.png");

	public JohnSmithGUIScreen(JohnSmithGUIMenu container, Inventory inventory, Component text) {
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
	public boolean isPauseScreen() {
		return true;
	}

	@Override
	public void extractRenderState(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractRenderState(guiGraphics, mouseX, mouseY, partialTicks);
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + 28, this.topPos + -5, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + 76, this.topPos + 67, 0, 0, 64, 16, 64, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_3, this.leftPos + 77, this.topPos + 35, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_4, this.leftPos + 141, this.topPos + 67, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_5, this.leftPos + 76, this.topPos + 88, 0, 0, 64, 16, 64, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_6, this.leftPos + 141, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_7, this.leftPos + 76, this.topPos + 109, 0, 0, 64, 16, 64, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_8, this.leftPos + 141, this.topPos + 110, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_9, this.leftPos + 76, this.topPos + 130, 0, 0, 64, 16, 64, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_10, this.leftPos + 141, this.topPos + 131, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_11, this.leftPos + 113, this.topPos + 19, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_12, this.leftPos + 50, this.topPos + 19, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_john_smiths_inventory"), 33, 9, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_armory"), 71, 21, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_buy"), 34, 69, -16751104, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_soldier_sword"), 95, 69, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_x3"), 155, 69, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_buy1"), 34, 90, -16751104, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_armor"), 95, 90, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_x31"), 155, 90, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_buy2"), 34, 111, -16751104, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_tables"), 93, 111, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_x2"), 156, 111, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_buy3"), 34, 132, -16751104, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_wooden_items"), 97, 132, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.john_smith_gui.label_x4"), 156, 133, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_basebuttons = new ImageButton(this.leftPos + 10, this.topPos + 67, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = JohnSmithGUIScreen.this.x;
					int y = JohnSmithGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new JohnSmithGUIButtonMessage(0, x, y, z));
						JohnSmithGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons);
		imagebutton_basebuttons1 = new ImageButton(this.leftPos + 10, this.topPos + 88, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = JohnSmithGUIScreen.this.x;
					int y = JohnSmithGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new JohnSmithGUIButtonMessage(1, x, y, z));
						JohnSmithGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons1);
		imagebutton_basebuttons2 = new ImageButton(this.leftPos + 10, this.topPos + 109, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = JohnSmithGUIScreen.this.x;
					int y = JohnSmithGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new JohnSmithGUIButtonMessage(2, x, y, z));
						JohnSmithGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons2);
		imagebutton_basebuttons3 = new ImageButton(this.leftPos + 10, this.topPos + 130, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = JohnSmithGUIScreen.this.x;
					int y = JohnSmithGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new JohnSmithGUIButtonMessage(3, x, y, z));
						JohnSmithGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons3);
	}
}