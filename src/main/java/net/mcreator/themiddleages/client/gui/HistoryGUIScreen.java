package net.mcreator.themiddleages.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphicsExtractor;

import net.mcreator.themiddleages.world.inventory.HistoryGUIMenu;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class HistoryGUIScreen extends AbstractContainerScreen<HistoryGUIMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private static final Identifier IMAGE_0 = Identifier.parse("the_middle_ages:textures/screens/background.png");
	private static final Identifier IMAGE_1 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_2 = Identifier.parse("the_middle_ages:textures/screens/swordclashiamge.png");

	public HistoryGUIScreen(HistoryGUIMenu container, Inventory inventory, Component text) {
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
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + -1, this.topPos + -1, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + 25, this.topPos + -24, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + 92, this.topPos + 117, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.history_gui.label_the_history"), 55, -14, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.history_gui.label_written_by_john_one_hand"), 42, -2, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.history_gui.label_about_the_king"), 45, 19, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.history_gui.label_the_king"), 80, 18, -6750208, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.history_gui.label_what_happens_at_the_end"), 11, 46, -16777114, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.history_gui.label_the_king_was_very_brave"), 10, 66, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.history_gui.label_his_knees_our_king_was_a_really"), 10, 79, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.history_gui.label_really_great_leader"), 11, 92, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.history_gui.label_he_takes_his_rightful_place"), 12, 105, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.history_gui.label_in_the_history"), 12, 117, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
	}
}