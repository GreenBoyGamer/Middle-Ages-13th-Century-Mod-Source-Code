package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.procedures.KnightPlaybackConditionProcedure;
import net.mcreator.themiddleages.procedures.DarkKnightPlaybackConditionNeverProcedure;
import net.mcreator.themiddleages.entity.DarkKnightEntity;
import net.mcreator.themiddleages.client.model.animations.knightdarkAnimation;
import net.mcreator.themiddleages.client.model.Modelknightdark;

public class DarkKnightRenderer extends MobRenderer<DarkKnightEntity, Modelknightdark<DarkKnightEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/darkknight.png");

	public DarkKnightRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelknightdark.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DarkKnightEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelknightdark<DarkKnightEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<DarkKnightEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(DarkKnightEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, knightdarkAnimation.idle, ageInTicks, 1f);
				if (DarkKnightPlaybackConditionNeverProcedure.execute(entity))
					this.animateWalk(knightdarkAnimation.walking, limbSwing, limbSwingAmount, 1f, 1f);
				if (KnightPlaybackConditionProcedure.execute(entity))
					this.animateWalk(knightdarkAnimation.sprint, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState3, knightdarkAnimation.attack, ageInTicks, 1f);
				this.animate(entity.animationState4, knightdarkAnimation.attack2, ageInTicks, 1f);
				this.animate(entity.animationState5, knightdarkAnimation.attack3, ageInTicks, 1f);
				this.animate(entity.animationState6, knightdarkAnimation.die, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(DarkKnightEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}