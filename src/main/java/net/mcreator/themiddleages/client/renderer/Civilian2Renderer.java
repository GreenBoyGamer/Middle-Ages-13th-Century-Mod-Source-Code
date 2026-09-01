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

import net.mcreator.themiddleages.entity.Civilian2Entity;
import net.mcreator.themiddleages.client.model.animations.madieval_civilian_boyAnimation;
import net.mcreator.themiddleages.client.model.Modelmadieval_civilian_boy;

import java.util.Map;

public class Civilian2Renderer extends MobRenderer<Civilian2Entity, LivingEntityRenderState, Modelmadieval_civilian_boy> {
	private final Identifier entityTexture = Identifier.parse("the_middle_ages:textures/entities/civilina2.png");

	public Civilian2Renderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelmadieval_civilian_boy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(Civilian2Entity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelmadieval_civilian_boy {
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
			this.keyframeAnimation0 = safeBake(madieval_civilian_boyAnimation.idle);
			this.keyframeAnimation1 = safeBake(madieval_civilian_boyAnimation.walking);
			this.keyframeAnimation2 = safeBake(madieval_civilian_boyAnimation.panic);
			this.keyframeAnimation3 = safeBake(madieval_civilian_boyAnimation.sleep);
			this.keyframeAnimation4 = safeBake(madieval_civilian_boyAnimation.wake);
			this.keyframeAnimation5 = safeBake(madieval_civilian_boyAnimation.buy);
			this.keyframeAnimation6 = safeBake(madieval_civilian_boyAnimation.eat);
			this.keyframeAnimation7 = safeBake(madieval_civilian_boyAnimation.die);
			this.keyframeAnimation8 = safeBake(madieval_civilian_boyAnimation.meet);
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
			Civilian2Entity entity = state.getRenderData(ENTITY_KEY);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			this.keyframeAnimation1.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.keyframeAnimation2.apply(entity.animationState2, state.ageInTicks, 2.1f);
			this.keyframeAnimation3.apply(entity.animationState3, state.ageInTicks, 1f);
			this.keyframeAnimation4.apply(entity.animationState4, state.ageInTicks, 1f);
			this.keyframeAnimation5.apply(entity.animationState5, state.ageInTicks, 1f);
			this.keyframeAnimation6.apply(entity.animationState6, state.ageInTicks, 1f);
			this.keyframeAnimation7.apply(entity.animationState7, state.ageInTicks, 1f);
			this.keyframeAnimation8.apply(entity.animationState8, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}

	public static final ContextKey<Civilian2Entity> ENTITY_KEY = new ContextKey<>(Identifier.parse("the_middle_ages:civilian_2_entity"));

	@EventBusSubscriber(Dist.CLIENT)
	public static class EntityStateAdder {
		@SubscribeEvent
		private static void registerRenderStateModifiersEvent(RegisterRenderStateModifiersEvent event) {
			event.registerEntityModifier(Civilian2Renderer.class, (entity, state) -> state.setRenderData(ENTITY_KEY, entity));
		}
	}
}