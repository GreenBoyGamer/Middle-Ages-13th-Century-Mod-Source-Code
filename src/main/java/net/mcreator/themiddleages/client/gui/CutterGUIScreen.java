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

import net.mcreator.themiddleages.world.inventory.CutterGUIMenu;
import net.mcreator.themiddleages.network.CutterGUIButtonMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class CutterGUIScreen extends AbstractContainerScreen<CutterGUIMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private ImageButton imagebutton_basebuttons;
	private ImageButton imagebutton_basebuttons1;
	private ImageButton imagebutton_basebuttons2;
	private ImageButton imagebutton_basebuttons3;
	private ImageButton imagebutton_basebuttons4;
	private ImageButton imagebutton_basebuttons5;
	private static final Identifier BACKGROUND = Identifier.parse("the_middle_ages:textures/screens/cutter_gui.png");
	private static final Identifier IMAGE_0 = Identifier.parse("the_middle_ages:textures/screens/gui_cutter.png");
	private static final Identifier IMAGE_1 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_2 = Identifier.parse("the_middle_ages:textures/screens/peace.png");
	private static final Identifier IMAGE_3 = Identifier.parse("the_middle_ages:textures/screens/log.png");
	private static final Identifier IMAGE_4 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_5 = Identifier.parse("the_middle_ages:textures/screens/check_mark.png");
	private static final Identifier IMAGE_6 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");

	public CutterGUIScreen(CutterGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text, 0, 0);
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
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + -135, this.topPos + -87, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + -17, this.topPos + -66, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + 76, this.topPos + -58, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_3, this.leftPos + -129, this.topPos + -71, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_4, this.leftPos + -86, this.topPos + -75, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_5, this.leftPos + 70, this.topPos + -38, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_6, this.leftPos + -149, this.topPos + -38, 0, 0, 128, 64, 128, 64);
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
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.cutter_gui.label_log_cutter"), 19, -56, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.cutter_gui.label_state_working"), -8, -38, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.cutter_gui.label_log"), -111, -80, -11382190, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.cutter_gui.label_input_log_slot"), -81, -66, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.cutter_gui.label_planks"), -134, -32, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.cutter_gui.label_stairs"), -133, -15, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.cutter_gui.label_slabs"), -131, 3, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.cutter_gui.label_fence"), -67, -32, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.cutter_gui.label_sticks"), -69, -15, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.cutter_gui.label_doors"), -65, 2, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_basebuttons = new ImageButton(this.leftPos + -150, this.topPos + -34, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = CutterGUIScreen.this.x;
					int y = CutterGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new CutterGUIButtonMessage(0, x, y, z));
						CutterGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons);
		imagebutton_basebuttons1 = new ImageButton(this.leftPos + -150, this.topPos + -17, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = CutterGUIScreen.this.x;
					int y = CutterGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new CutterGUIButtonMessage(1, x, y, z));
						CutterGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons1);
		imagebutton_basebuttons2 = new ImageButton(this.leftPos + -150, this.topPos + 1, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = CutterGUIScreen.this.x;
					int y = CutterGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new CutterGUIButtonMessage(2, x, y, z));
						CutterGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons2);
		imagebutton_basebuttons3 = new ImageButton(this.leftPos + -84, this.topPos + -34, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = CutterGUIScreen.this.x;
					int y = CutterGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new CutterGUIButtonMessage(3, x, y, z));
						CutterGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons3);
		imagebutton_basebuttons4 = new ImageButton(this.leftPos + -84, this.topPos + -17, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = CutterGUIScreen.this.x;
					int y = CutterGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new CutterGUIButtonMessage(4, x, y, z));
						CutterGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons4);
		imagebutton_basebuttons5 = new ImageButton(this.leftPos + -84, this.topPos + 0, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = CutterGUIScreen.this.x;
					int y = CutterGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new CutterGUIButtonMessage(5, x, y, z));
						CutterGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons5);
	}
}