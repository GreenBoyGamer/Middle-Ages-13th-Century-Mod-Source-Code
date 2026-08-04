package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.entity.PassengerCartRidingEntity;
import net.mcreator.themiddleages.client.model.animations.MadievalHorseCartssAnimation;
import net.mcreator.themiddleages.client.model.ModelMadievalHorseCartss;

public class PassengerCartRidingRenderer extends MobRenderer<PassengerCartRidingEntity, ModelMadievalHorseCartss<PassengerCartRidingEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/madieval_horse_cart.png");

	public PassengerCartRidingRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelMadievalHorseCartss.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PassengerCartRidingEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelMadievalHorseCartss<PassengerCartRidingEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<PassengerCartRidingEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(PassengerCartRidingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, MadievalHorseCartssAnimation.idle, ageInTicks, 1f);
				this.animateWalk(MadievalHorseCartssAnimation.moving, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, MadievalHorseCartssAnimation.die, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(PassengerCartRidingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}