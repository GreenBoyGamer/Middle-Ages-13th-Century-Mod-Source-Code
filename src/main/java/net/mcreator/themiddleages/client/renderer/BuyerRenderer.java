package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.entity.BuyerEntity;
import net.mcreator.themiddleages.client.model.animations.fruitselletAnimation;
import net.mcreator.themiddleages.client.model.Modelfruitsellet;

public class BuyerRenderer extends MobRenderer<BuyerEntity, Modelfruitsellet<BuyerEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/fseller.png");

	public BuyerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelfruitsellet.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BuyerEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelfruitsellet<BuyerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BuyerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BuyerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, fruitselletAnimation.idle, ageInTicks, 1f);
				this.animateWalk(fruitselletAnimation.walking, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, fruitselletAnimation.panic, ageInTicks, 2.1f);
				this.animate(entity.animationState3, fruitselletAnimation.sleep, ageInTicks, 1f);
				this.animate(entity.animationState4, fruitselletAnimation.wake, ageInTicks, 1f);
				this.animate(entity.animationState5, fruitselletAnimation.eat, ageInTicks, 1f);
				this.animate(entity.animationState6, fruitselletAnimation.die, ageInTicks, 1f);
				this.animate(entity.animationState7, fruitselletAnimation.thanks, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BuyerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}