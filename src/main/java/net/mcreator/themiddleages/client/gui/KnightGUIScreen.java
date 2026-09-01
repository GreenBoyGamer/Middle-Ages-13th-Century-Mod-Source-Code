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

import net.mcreator.themiddleages.world.inventory.KnightGUIMenu;
import net.mcreator.themiddleages.procedures.ModelProviderProcedure;
import net.mcreator.themiddleages.network.KnightGUIButtonMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class KnightGUIScreen extends AbstractContainerScreen<KnightGUIMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private ImageButton imagebutton_basebuttons;
	private ImageButton imagebutton_basebuttons1;
	private ImageButton imagebutton_basebuttons2;
	private static final Identifier IMAGE_0 = Identifier.parse("the_middle_ages:textures/screens/background.png");
	private static final Identifier IMAGE_1 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_2 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_3 = Identifier.parse("the_middle_ages:textures/screens/swordclashiamge.png");
	private static final Identifier IMAGE_4 = Identifier.parse("the_middle_ages:textures/screens/peace.png");

	public KnightGUIScreen(KnightGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text, 179, 166);
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
		if (ModelProviderProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -852, this.topPos + -930, this.leftPos + 1148, this.topPos + 1070, 30, -livingEntity.getBbHeight() / (2.0f * livingEntity.getScale()), 2.25f, 0,
					livingEntity);
		}
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + 2, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + 12, this.topPos + 8, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + 12, this.topPos + 75, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_3, this.leftPos + 109, this.topPos + 106, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_4, this.leftPos + 37, this.topPos + 107, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knight_gui.label_what_he_did"), 38, 13, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knight_gui.label_stolen_food_from_your_towns_civ"), 21, 26, -10092544, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knight_gui.label_towns_civilian"), 22, 37, -10092544, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knight_gui.label_choose"), 24, 86, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knight_gui.label_spare_him"), 21, 128, -13408768, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knight_gui.label_finish_him"), 91, 127, -3407872, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knight_gui.label_mercy"), 25, 140, -15572224, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knight_gui.label_justice"), 92, 140, -10289152, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knight_gui.label_fine_him"), 96, 89, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.knight_gui.label_worth_it"), 101, 73, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_basebuttons = new ImageButton(this.leftPos + 12, this.topPos + 123, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KnightGUIScreen.this.x;
					int y = KnightGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KnightGUIButtonMessage(0, x, y, z));
						KnightGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons);
		imagebutton_basebuttons1 = new ImageButton(this.leftPos + 85, this.topPos + 123, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KnightGUIScreen.this.x;
					int y = KnightGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KnightGUIButtonMessage(1, x, y, z));
						KnightGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons1);
		imagebutton_basebuttons2 = new ImageButton(this.leftPos + 85, this.topPos + 84, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KnightGUIScreen.this.x;
					int y = KnightGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new KnightGUIButtonMessage(2, x, y, z));
						KnightGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
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