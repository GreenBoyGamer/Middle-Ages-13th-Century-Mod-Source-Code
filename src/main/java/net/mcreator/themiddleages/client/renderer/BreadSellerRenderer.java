package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.entity.BreadSellerEntity;
import net.mcreator.themiddleages.client.model.animations.seller1Animation;
import net.mcreator.themiddleages.client.model.Modelseller1;

public class BreadSellerRenderer extends MobRenderer<BreadSellerEntity, Modelseller1<BreadSellerEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/bdseler.png");

	public BreadSellerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelseller1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BreadSellerEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelseller1<BreadSellerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BreadSellerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BreadSellerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, seller1Animation.idle, ageInTicks, 1f);
				this.animateWalk(seller1Animation.walking, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, seller1Animation.thanks, ageInTicks, 1f);
				this.animate(entity.animationState3, seller1Animation.die, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BreadSellerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}