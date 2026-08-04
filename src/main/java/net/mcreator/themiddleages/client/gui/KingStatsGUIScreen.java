package net.mcreator.themiddleages.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.themiddleages.world.inventory.KingStatsGUIMenu;
import net.mcreator.themiddleages.procedures.*;
import net.mcreator.themiddleages.network.KingStatsGUIButtonMessage;
import net.mcreator.themiddleages.init.TheMiddleAgesModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class KingStatsGUIScreen extends AbstractContainerScreen<KingStatsGUIMenu> implements TheMiddleAgesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private ImageButton imagebutton_basebuttons;
	private static final ResourceLocation IMAGE_0 = ResourceLocation.parse("the_middle_ages:textures/screens/background.png");
	private static final ResourceLocation IMAGE_1 = ResourceLocation.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final ResourceLocation IMAGE_2 = ResourceLocation.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final ResourceLocation IMAGE_3 = ResourceLocation.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final ResourceLocation IMAGE_4 = ResourceLocation.parse("the_middle_ages:textures/screens/backgroundbasetwo.png");
	private static final ResourceLocation IMAGE_5 = ResourceLocation.parse("the_middle_ages:textures/screens/civilians.png");
	private static final ResourceLocation IMAGE_6 = ResourceLocation.parse("the_middle_ages:textures/screens/danger.png");
	private static final ResourceLocation IMAGE_7 = ResourceLocation.parse("the_middle_ages:textures/screens/wealth.png");
	private static final ResourceLocation IMAGE_8 = ResourceLocation.parse("the_middle_ages:textures/screens/dignity.png");
	private static final ResourceLocation IMAGE_9 = ResourceLocation.parse("the_middle_ages:textures/screens/danger.png");

	public KingStatsGUIScreen(KingStatsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ModelRendererForKingProcedure.execute(world, x, y, z, entity) instanceof LivingEntity livingEntity) {
			TheMiddleAgesModScreens.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 137, this.topPos + 153, 50, 2.25f, 0, livingEntity);
		}
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 15 && mouseX < leftPos + 39 && mouseY > topPos + 146 && mouseY < topPos + 170) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.the_middle_ages.king_stats_gui.tooltip_your_local_civilians_that_are_in"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (!customTooltipShown)
			this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(IMAGE_0, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		guiGraphics.blit(IMAGE_1, this.leftPos + 13, this.topPos + 55, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(IMAGE_2, this.leftPos + 13, this.topPos + 87, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(IMAGE_3, this.leftPos + 13, this.topPos + 129, 0, 0, 64, 32, 64, 32);
		guiGraphics.blit(IMAGE_4, this.leftPos + 22, this.topPos + -25, 0, 0, 128, 64, 128, 64);
		guiGraphics.blit(IMAGE_5, this.leftPos + 75, this.topPos + 128, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_6, this.leftPos + 74, this.topPos + 145, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_7, this.leftPos + 76, this.topPos + 56, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_8, this.leftPos + 79, this.topPos + 70, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(IMAGE_9, this.leftPos + 62, this.topPos + -6, 0, 0, 16, 16, 16, 16);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_statics"), 27, 43, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_locals"), 29, 118, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_locals1"), 16, 132, -16711707, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_danger"), 16, 144, -16711724, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_wealth"), 16, 59, -16711900, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_dignity"), 15, 70, -15794432, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_soldiers"), 17, 90, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_knight"), 18, 101, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_enemies_preparing"), 38, -17, -12829636, false);
		guiGraphics.drawString(this.font, WealthRednerProcedure.execute(entity), 55, 59, -16777216, false);
		guiGraphics.drawString(this.font, MercyRenderProcedure.execute(entity), 58, 71, -16777216, false);
		guiGraphics.drawString(this.font, SoldierRendersProcedure.execute(entity), 60, 90, -16777216, false);
		guiGraphics.drawString(this.font, KnightsRenderProcedure.execute(entity), 56, 101, -16777216, false);
		guiGraphics.drawString(this.font, CivlianRendersProcedure.execute(entity), 54, 132, -16777216, false);
		guiGraphics.drawString(this.font, DangerCivliansRenderProcedure.execute(entity), 54, 145, -16777216, false);
		if (AttackingTrueHaiProcedure.execute(world))
			guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_yes"), 81, -3, -65536, false);
		if (AttackingIsFalseProcedure.execute(world))
			guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_nope"), 80, -3, -14745856, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_middle_ages.king_stats_gui.label_attack"), 70, 19, -65536, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_basebuttons = new ImageButton(this.leftPos + 54, this.topPos + 17, 64, 16,
				new WidgetSprites(ResourceLocation.parse("the_middle_ages:textures/screens/basebuttons.png"), ResourceLocation.parse("the_middle_ages:textures/screens/basebuttonhover.png")), e -> {
					int x = KingStatsGUIScreen.this.x;
					int y = KingStatsGUIScreen.this.y;
					if (true) {
						PacketDistributor.sendToServer(new KingStatsGUIButtonMessage(0, x, y, z));
						KingStatsGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_basebuttons);
	}
}