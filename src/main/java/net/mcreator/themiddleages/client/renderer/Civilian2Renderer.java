package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.entity.Civilian2Entity;
import net.mcreator.themiddleages.client.model.animations.civilian2Animation;
import net.mcreator.themiddleages.client.model.Modelcivilian2;

public class Civilian2Renderer extends MobRenderer<Civilian2Entity, Modelcivilian2<Civilian2Entity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/civilina2.png");

	public Civilian2Renderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelcivilian2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Civilian2Entity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelcivilian2<Civilian2Entity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<Civilian2Entity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Civilian2Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, civilian2Animation.idle, ageInTicks, 1f);
				this.animateWalk(civilian2Animation.walking, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, civilian2Animation.panic, ageInTicks, 2.1f);
				this.animate(entity.animationState3, civilian2Animation.sleep, ageInTicks, 1f);
				this.animate(entity.animationState4, civilian2Animation.wake, ageInTicks, 1f);
				this.animate(entity.animationState5, civilian2Animation.buy, ageInTicks, 1f);
				this.animate(entity.animationState6, civilian2Animation.eat, ageInTicks, 1f);
				this.animate(entity.animationState7, civilian2Animation.die, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(Civilian2Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}