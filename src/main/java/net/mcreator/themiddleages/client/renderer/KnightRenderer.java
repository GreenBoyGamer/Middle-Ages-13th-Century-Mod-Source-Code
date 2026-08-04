package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.procedures.KnightnotPlaybackConditionProcedure;
import net.mcreator.themiddleages.procedures.KnightPlaybackConditionProcedure;
import net.mcreator.themiddleages.entity.KnightEntity;
import net.mcreator.themiddleages.client.model.animations.knightAnimation;
import net.mcreator.themiddleages.client.model.Modelknight;

public class KnightRenderer extends MobRenderer<KnightEntity, Modelknight<KnightEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/knight.png");

	public KnightRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelknight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KnightEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelknight<KnightEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<KnightEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(KnightEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, knightAnimation.idle, ageInTicks, 1f);
				if (KnightnotPlaybackConditionProcedure.execute(entity))
					this.animateWalk(knightAnimation.walking, limbSwing, limbSwingAmount, 1f, 1f);
				if (KnightPlaybackConditionProcedure.execute(entity))
					this.animateWalk(knightAnimation.sprint, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState3, knightAnimation.attack, ageInTicks, 1f);
				this.animate(entity.animationState4, knightAnimation.attack2, ageInTicks, 1f);
				this.animate(entity.animationState5, knightAnimation.attack3, ageInTicks, 1f);
				this.animate(entity.animationState6, knightAnimation.die, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(KnightEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}