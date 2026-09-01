package net.mcreator.themiddleages.client.renderer;

import net.neoforged.neoforge.client.renderstate.RegisterRenderStateModifiersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.util.context.ContextKey;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.animation.AnimationDefinition;

import net.mcreator.themiddleages.procedures.Civilian4idlePlaybackConditionProcedure;
import net.mcreator.themiddleages.entity.Civilian4Entity;
import net.mcreator.themiddleages.client.model.animations.civilian4Animation;
import net.mcreator.themiddleages.client.model.Modelcivilian4;

import java.util.Map;

public class Civilian4Renderer extends MobRenderer<Civilian4Entity, LivingEntityRenderState, Modelcivilian4> {
	private final Identifier entityTexture = Identifier.parse("the_middle_ages:textures/entities/cv4.png");

	public Civilian4Renderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelcivilian4.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(Civilian4Entity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelcivilian4 {
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;
		private final KeyframeAnimation keyframeAnimation2;
		private final KeyframeAnimation keyframeAnimation3;
		private final KeyframeAnimation keyframeAnimation4;
		private final KeyframeAnimation keyframeAnimation5;
		private final KeyframeAnimation keyframeAnimation6;
		private final KeyframeAnimation keyframeAnimation7;
		private final KeyframeAnimation keyframeAnimation8;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = safeBake(civilian4Animation.idle);
			this.keyframeAnimation1 = safeBake(civilian4Animation.walking);
			this.keyframeAnimation2 = safeBake(civilian4Animation.sleep);
			this.keyframeAnimation3 = safeBake(civilian4Animation.wake);
			this.keyframeAnimation4 = safeBake(civilian4Animation.buy);
			this.keyframeAnimation5 = safeBake(civilian4Animation.eat);
			this.keyframeAnimation6 = safeBake(civilian4Animation.die);
			this.keyframeAnimation7 = safeBake(civilian4Animation.meet);
			this.keyframeAnimation8 = safeBake(civilian4Animation.working);
		}

		private KeyframeAnimation safeBake(AnimationDefinition source) {
			try {
				return source.bake(root);
			} catch (IllegalArgumentException e) {
				return new AnimationDefinition(0, false, Map.of()).bake(root);
			}
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			Civilian4Entity entity = state.getRenderData(ENTITY_KEY);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			if (Civilian4idlePlaybackConditionProcedure.execute(entity))
				this.keyframeAnimation1.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.keyframeAnimation2.apply(entity.animationState2, state.ageInTicks, 1f);
			this.keyframeAnimation3.apply(entity.animationState3, state.ageInTicks, 1f);
			this.keyframeAnimation4.apply(entity.animationState4, state.ageInTicks, 1f);
			this.keyframeAnimation5.apply(entity.animationState5, state.ageInTicks, 1f);
			this.keyframeAnimation6.apply(entity.animationState6, state.ageInTicks, 1f);
			this.keyframeAnimation7.apply(entity.animationState7, state.ageInTicks, 1f);
			this.keyframeAnimation8.apply(entity.animationState8, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}

	public static final ContextKey<Civilian4Entity> ENTITY_KEY = new ContextKey<>(Identifier.parse("the_middle_ages:civilian_4_entity"));

	@EventBusSubscriber(Dist.CLIENT)
	public static class EntityStateAdder {
		@SubscribeEvent
		private static void registerRenderStateModifiersEvent(RegisterRenderStateModifiersEvent event) {
			event.registerEntityModifier(Civilian4Renderer.class, (entity, state) -> state.setRenderData(ENTITY_KEY, entity));
		}
	}
}