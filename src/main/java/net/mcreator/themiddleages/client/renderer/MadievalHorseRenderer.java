package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.procedures.MadievalHorseSprintPlaybackConditionProcedure;
import net.mcreator.themiddleages.entity.MadievalHorseEntity;
import net.mcreator.themiddleages.client.model.animations.MadievalHorseAnimation;
import net.mcreator.themiddleages.client.model.ModelMadievalHorse;

import com.mojang.blaze3d.vertex.PoseStack;

public class MadievalHorseRenderer extends MobRenderer<MadievalHorseEntity, ModelMadievalHorse<MadievalHorseEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/madieval_horse.png");

	public MadievalHorseRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelMadievalHorse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(MadievalHorseEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	@Override
	public ResourceLocation getTextureLocation(MadievalHorseEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelMadievalHorse<MadievalHorseEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<MadievalHorseEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(MadievalHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, MadievalHorseAnimation.idle, ageInTicks, 1f);
				this.animateWalk(MadievalHorseAnimation.moving, limbSwing, limbSwingAmount, 1f, 1f);
				if (MadievalHorseSprintPlaybackConditionProcedure.execute(entity))
					this.animateWalk(MadievalHorseAnimation.sprint, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState3, MadievalHorseAnimation.die, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(MadievalHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}