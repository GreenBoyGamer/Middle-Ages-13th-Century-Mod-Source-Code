package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.entity.PassengerCartEntity;
import net.mcreator.themiddleages.client.model.animations.archermodelAnimation;
import net.mcreator.themiddleages.client.model.Modelhorse_cart;

public class PassengerCartRenderer extends MobRenderer<PassengerCartEntity, Modelhorse_cart<PassengerCartEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/horse_cart_texture.png");

	public PassengerCartRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelhorse_cart.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PassengerCartEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelhorse_cart<PassengerCartEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<PassengerCartEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(PassengerCartEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, archermodelAnimation.idle, ageInTicks, 1f);
				this.animateWalk(archermodelAnimation.walking, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(PassengerCartEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}