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

import net.mcreator.themiddleages.world.inventory.Civilian3GUIMenu;
import net.mcreator.themiddleages.procedures.ModelRendererForCV3Procedure;
import net.mcreator.themiddleages.network.Civilian3GUIButtonMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class Civilian3GUIScreen extends AbstractContainerScreen<Civilian3GUIMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private ImageButton imagebutton_basebuttons;
	private ImageButton imagebutton_basebuttons1;
	private static final Identifier IMAGE_0 = Identifier.parse("the_middle_ages:textures/screens/background.png");
	private static final Identifier IMAGE_1 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_2 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_3 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_4 = Identifier.parse("the_middle_ages:textures/screens/peace.png");
	private static final Identifier IMAGE_5 = Identifier.parse("the_middle_ages:textures/screens/swordclashiamge.png");

	public Civilian3GUIScreen(Civilian3GUIMenu container, Inventory inventory, Component text) {
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
		if (ModelRendererForCV3Procedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -866, this.topPos + -895, this.leftPos + 1134, this.topPos + 1105, 45, -livingEntity.getBbHeight() / (2.0f * livingEntity.getScale()), 2f, 0, livingEntity);
		}
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + -3, this.topPos + -1, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + -6, this.topPos + -9, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + 1, this.topPos + 27, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_3, this.leftPos + -6, this.topPos + 93, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_4, this.leftPos + 59, this.topPos + 0, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_5, this.leftPos + 60, this.topPos + 101, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.civilian_3_gui.label_statics"), 6, 1, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.civilian_3_gui.label_name"), 12, 39, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.civilian_3_gui.label_mr_robert"), 46, 39, -39322, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.civilian_3_gui.label_age"), 12, 54, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.civilian_3_gui.label_68_years"), 46, 54, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.civilian_3_gui.label_job"), 12, 70, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.civilian_3_gui.label_farmer"), 46, 69, -16777063, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.civilian_3_gui.label_actions"), 7, 103, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.civilian_3_gui.label_execute"), 22, 136, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.civilian_3_gui.label_exile"), 102, 136, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_basebuttons = new ImageButton(this.leftPos + 9, this.topPos + 134, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = Civilian3GUIScreen.this.x;
					int y = Civilian3GUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new Civilian3GUIButtonMessage(0, x, y, z));
						Civilian3GUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons);
		imagebutton_basebuttons1 = new ImageButton(this.leftPos + 84, this.topPos + 134, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = Civilian3GUIScreen.this.x;
					int y = Civilian3GUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new Civilian3GUIButtonMessage(1, x, y, z));
						Civilian3GUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons1);
	}
}