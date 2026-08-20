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

import net.mcreator.themiddleages.procedures.KnightPlaybackConditionProcedure;
import net.mcreator.themiddleages.procedures.DarkKnightPlaybackConditionNeverProcedure;
import net.mcreator.themiddleages.entity.DarkKnightEntity;
import net.mcreator.themiddleages.client.model.animations.knightdarkAnimation;
import net.mcreator.themiddleages.client.model.Modelknightdark;

import java.util.Map;

public class DarkKnightRenderer extends MobRenderer<DarkKnightEntity, LivingEntityRenderState, Modelknightdark> {
	private final Identifier entityTexture = Identifier.parse("the_middle_ages:textures/entities/darkknight.png");

	public DarkKnightRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelknightdark.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DarkKnightEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelknightdark {
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;
		private final KeyframeAnimation keyframeAnimation2;
		private final KeyframeAnimation keyframeAnimation3;
		private final KeyframeAnimation keyframeAnimation4;
		private final KeyframeAnimation keyframeAnimation5;
		private final KeyframeAnimation keyframeAnimation6;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = safeBake(knightdarkAnimation.idle);
			this.keyframeAnimation1 = safeBake(knightdarkAnimation.walking);
			this.keyframeAnimation2 = safeBake(knightdarkAnimation.sprint);
			this.keyframeAnimation3 = safeBake(knightdarkAnimation.attack);
			this.keyframeAnimation4 = safeBake(knightdarkAnimation.attack2);
			this.keyframeAnimation5 = safeBake(knightdarkAnimation.attack3);
			this.keyframeAnimation6 = safeBake(knightdarkAnimation.die);
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
			DarkKnightEntity entity = state.getRenderData(ENTITY_KEY);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			if (DarkKnightPlaybackConditionNeverProcedure.execute(entity))
				this.keyframeAnimation1.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			if (KnightPlaybackConditionProcedure.execute(entity))
				this.keyframeAnimation2.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.keyframeAnimation3.apply(entity.animationState3, state.ageInTicks, 1f);
			this.keyframeAnimation4.apply(entity.animationState4, state.ageInTicks, 1f);
			this.keyframeAnimation5.apply(entity.animationState5, state.ageInTicks, 1f);
			this.keyframeAnimation6.apply(entity.animationState6, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}

	public static final ContextKey<DarkKnightEntity> ENTITY_KEY = new ContextKey<>(Identifier.parse("the_middle_ages:dark_knight_entity"));

	@EventBusSubscriber(Dist.CLIENT)
	public static class EntityStateAdder {
		@SubscribeEvent
		private static void registerRenderStateModifiersEvent(RegisterRenderStateModifiersEvent event) {
			event.registerEntityModifier(DarkKnightRenderer.class, (entity, state) -> state.setRenderData(ENTITY_KEY, entity));
		}
	}
}