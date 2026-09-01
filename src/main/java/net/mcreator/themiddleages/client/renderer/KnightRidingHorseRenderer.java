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

import net.mcreator.themiddleages.procedures.KnightRidingHorseIdlePlaybackConditionProcedure;
import net.mcreator.themiddleages.entity.KnightRidingHorseEntity;
import net.mcreator.themiddleages.client.model.animations.horseknightAnimation;
import net.mcreator.themiddleages.client.model.Modelhorseknight;

import java.util.Map;

public class KnightRidingHorseRenderer extends MobRenderer<KnightRidingHorseEntity, LivingEntityRenderState, Modelhorseknight> {
	private final Identifier entityTexture = Identifier.parse("the_middle_ages:textures/entities/knightonhorse.png");

	public KnightRidingHorseRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelhorseknight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(KnightRidingHorseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelhorseknight {
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;
		private final KeyframeAnimation keyframeAnimation2;
		private final KeyframeAnimation keyframeAnimation3;
		private final KeyframeAnimation keyframeAnimation4;
		private final KeyframeAnimation keyframeAnimation5;
		private final KeyframeAnimation keyframeAnimation6;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = safeBake(horseknightAnimation.spawn);
			this.keyframeAnimation1 = safeBake(horseknightAnimation.idle);
			this.keyframeAnimation2 = safeBake(horseknightAnimation.moving);
			this.keyframeAnimation3 = safeBake(horseknightAnimation.sprint);
			this.keyframeAnimation4 = safeBake(horseknightAnimation.attack);
			this.keyframeAnimation5 = safeBake(horseknightAnimation.attack2);
			this.keyframeAnimation6 = safeBake(horseknightAnimation.die);
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
			KnightRidingHorseEntity entity = state.getRenderData(ENTITY_KEY);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			this.keyframeAnimation1.apply(entity.animationState1, state.ageInTicks, 1f);
			if (KnightRidingHorseIdlePlaybackConditionProcedure.execute(entity))
				this.keyframeAnimation2.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.keyframeAnimation3.apply(entity.animationState3, state.ageInTicks, 2f);
			this.keyframeAnimation4.apply(entity.animationState4, state.ageInTicks, 1f);
			this.keyframeAnimation5.apply(entity.animationState5, state.ageInTicks, 1f);
			this.keyframeAnimation6.apply(entity.animationState6, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}

	public static final ContextKey<KnightRidingHorseEntity> ENTITY_KEY = new ContextKey<>(Identifier.parse("the_middle_ages:knight_riding_horse_entity"));

	@EventBusSubscriber(Dist.CLIENT)
	public static class EntityStateAdder {
		@SubscribeEvent
		private static void registerRenderStateModifiersEvent(RegisterRenderStateModifiersEvent event) {
			event.registerEntityModifier(KnightRidingHorseRenderer.class, (entity, state) -> state.setRenderData(ENTITY_KEY, entity));
		}
	}
}