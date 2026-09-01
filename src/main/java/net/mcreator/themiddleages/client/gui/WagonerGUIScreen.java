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
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphicsExtractor;

import net.mcreator.themiddleages.world.inventory.WagonerGUIMenu;
import net.mcreator.themiddleages.procedures.RenderCartProcedure;
import net.mcreator.themiddleages.network.WagonerGUIButtonMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class WagonerGUIScreen extends AbstractContainerScreen<WagonerGUIMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private EditBox TextField1;
	private EditBox TextField2;
	private ImageButton imagebutton_basebuttons;
	private ImageButton imagebutton_basebuttons1;
	private static final Identifier IMAGE_0 = Identifier.parse("the_middle_ages:textures/screens/background.png");
	private static final Identifier IMAGE_1 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_2 = Identifier.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final Identifier IMAGE_3 = Identifier.parse("the_middle_ages:textures/screens/world.png");

	public WagonerGUIScreen(WagonerGUIMenu container, Inventory inventory, Component text) {
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
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("TextField1"))
				TextField1.setValue(stringState);
			else if (name.equals("TextField2"))
				TextField2.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	@Override
	public void extractRenderState(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractRenderState(guiGraphics, mouseX, mouseY, partialTicks);
		TextField1.extractWidgetRenderState(guiGraphics, mouseX, mouseY, partialTicks);
		TextField2.extractWidgetRenderState(guiGraphics, mouseX, mouseY, partialTicks);
		if (RenderCartProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -860, this.topPos + -932, this.leftPos + 1140, this.topPos + 1068, 25, -livingEntity.getBbHeight() / (2.0f * livingEntity.getScale()), 2.25f, 0,
					livingEntity);
		}
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, this.leftPos + -27, this.topPos + 8, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_2, this.leftPos + 46, this.topPos + 95, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_3, this.leftPos + 108, this.topPos + 92, 0, 0, 32, 32, 32, 32);
	}

	@Override
	public boolean keyPressed(KeyEvent event) {
		int key = InputConstants.getKey(event).getValue();
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (TextField1.isFocused())
			return TextField1.keyPressed(event);
		if (TextField2.isFocused())
			return TextField2.keyPressed(event);
		return super.keyPressed(event);
	}

	@Override
	public void resize(int width, int height) {
		String TextField1Value = TextField1.getValue();
		String TextField2Value = TextField2.getValue();
		super.resize(width, height);
		TextField1.setValue(TextField1Value);
		TextField2.setValue(TextField2Value);
	}

	@Override
	protected void extractLabels(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY) {
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wagoner_gui.label_wagoner"), 17, 14, -16724992, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wagoner_gui.label_where_do_you_want_to_go"), -20, 37, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wagoner_gui.label_go"), -20, 48, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wagoner_gui.label_hey_mr_king"), -21, 25, -16777165, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wagoner_gui.label_enter_coordinates"), 14, 73, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wagoner_gui.label_x"), 54, 97, -10092442, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wagoner_gui.label_z_coords"), 54, 112, -10092442, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wagoner_gui.label_done"), 36, 138, -16777216, false);
		guiGraphics.text(this.font, Component.translatable("gui.the_middle_ages.wagoner_gui.label_town"), 111, 138, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		TextField1 = new EditBox(this.font, this.leftPos + 15, this.topPos + 89, 29, 20, Component.translatable("gui.the_middle_ages.wagoner_gui.TextField1"));
		TextField1.setMaxLength(8192);
		TextField1.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "TextField1", content, false);
		});
		TextField1.setHint(Component.translatable("gui.the_middle_ages.wagoner_gui.TextField1"));
		this.addWidget(this.TextField1);
		TextField2 = new EditBox(this.font, this.leftPos + 15, this.topPos + 112, 29, 20, Component.translatable("gui.the_middle_ages.wagoner_gui.TextField2"));
		TextField2.setMaxLength(8192);
		TextField2.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "TextField2", content, false);
		});
		TextField2.setHint(Component.translatable("gui.the_middle_ages.wagoner_gui.TextField2"));
		this.addWidget(this.TextField2);
		imagebutton_basebuttons = new ImageButton(this.leftPos + 16, this.topPos + 137, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = WagonerGUIScreen.this.x;
					int y = WagonerGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new WagonerGUIButtonMessage(0, x, y, z));
						WagonerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void extractContents(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons);
		imagebutton_basebuttons1 = new ImageButton(this.leftPos + 91, this.topPos + 137, 64, 16,
				new WidgetSprites(Identifier.parse("the_middle_ages:textures/screens/basebuttons.png"), Identifier.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = WagonerGUIScreen.this.x;
					int y = WagonerGUIScreen.this.y;
					if (true) {
						ClientPacketDistributor.sendToServer(new WagonerGUIButtonMessage(1, x, y, z));
						WagonerGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
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