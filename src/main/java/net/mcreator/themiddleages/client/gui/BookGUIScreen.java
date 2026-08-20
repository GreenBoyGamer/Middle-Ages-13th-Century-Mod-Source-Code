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

import net.mcreator.themiddleages.world.inventory.BookGUIMenu;
import net.mcreator.themiddleages.procedures.SavedProcedure;
import net.mcreator.themiddleages.procedures.NotGreedyProcedure;
import net.mcreator.themiddleages.procedures.GreedyIsHeProcedure;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class BookGUIScreen extends AbstractContainerScreen<BookGUIMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private static final Identifier IMAGE_0 = Identifier.parse("the_middle_ages:textures/screens/background.png");
	private static final Identifier IMAGE_1 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");

	public BookGUIScreen(BookGUIMenu container, Inventory inventory, Component text) {
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
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + 1, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + 25, this.topPos + -24, 0, 0, 128, 64, 128, 64);
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
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_the_history"), 55, -14, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_written_by_john_one_hand"), 42, -2, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_about_the_king"), 45, 19, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_the_king_of_this_town_is_a_great"), 20, 48, -16777114, false);
		if (NotGreedyProcedure.execute(world))
			guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_very_great"), 21, 60, -16777114, false);
		if (SavedProcedure.execute(world))
			guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_he_saved_my_life"), 40, 101, -16777114, false);
		if (SavedProcedure.execute(world))
			guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_when_i_was_thirsty"), 35, 113, -16777114, false);
		if (NotGreedyProcedure.execute(world))
			guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_at_all_and_is_great"), 13, 72, -16777114, false);
		if (SavedProcedure.execute(world))
			guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_he_gave_me_water"), 40, 125, -16777114, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_the_king"), 80, 18, -6750208, false);
		if (GreedyIsHeProcedure.execute(world))
			guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_very_bad_guy"), 21, 60, -16777114, false);
		if (GreedyIsHeProcedure.execute(world))
			guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.book_gui.label_greedy_and_nobody_likes_him"), 16, 73, -16777114, false);
	}

	@Override
	public void init() {
		super.init();
	}
}