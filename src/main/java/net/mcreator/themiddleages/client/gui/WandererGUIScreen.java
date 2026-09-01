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

import net.mcreator.themiddleages.world.inventory.WandererGUIMenu;
import net.mcreator.themiddleages.procedures.GUiModelDisplayForAuthorProcedure;
import net.mcreator.themiddleages.network.WandererGUIButtonMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class WandererGUIScreen extends AbstractContainerScreen<WandererGUIMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private ImageButton imagebutton_basebuttons;
	private static final Identifier IMAGE_0 = Identifier.parse("the_middle_ages:textures/screens/background.png");
	private static final Identifier IMAGE_1 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_2 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_3 = Identifier.parse("the_middle_ages:textures/screens/peace.png");
	private static final Identifier IMAGE_4 = Identifier.parse("the_middle_ages:textures/screens/civilians.png");

	public WandererGUIScreen(WandererGUIMenu container, Inventory inventory, Component text) {
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
		if (GUiModelDisplayForAuthorProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -855, this.topPos + -883, this.leftPos + 1145, this.topPos + 1117, 50, -livingEntity.getBbHeight() / (2.0f * livingEntity.getScale()), 2.25f, 0,
					livingEntity);
		}
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + -20, this.topPos + -15, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + -20, this.topPos + 56, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_3, this.leftPos + 79, this.topPos + 130, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_4, this.leftPos + 71, this.topPos + 2, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wanderer_gui.label_wanderer_statics"), -1, -9, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wanderer_gui.label_name_john_hand"), -14, 4, -16777114, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wanderer_gui.label_job_author"), -14, 17, -16777114, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wanderer_gui.label_one_broken_arm"), -13, 29, -16777114, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wanderer_gui.label_more"), -2, 58, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wanderer_gui.label_john_write_books_on_great"), -14, 70, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wanderer_gui.label_the_great_leaders"), -15, 80, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wanderer_gui.label_he_is_a_rich_person"), -14, 92, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wanderer_gui.label_help_him"), 26, 131, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_basebuttons = new ImageButton(this.leftPos + 14, this.topPos + 130, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = WandererGUIScreen.this.x;
					int y = WandererGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new WandererGUIButtonMessage(0, x, y, z));
						WandererGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons);
	}
}