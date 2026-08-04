package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.entity.Civilian1Entity;
import net.mcreator.themiddleages.client.model.animations.civilian1Animation;
import net.mcreator.themiddleages.client.model.Modelcivilian1;

public class Civilian1Renderer extends MobRenderer<Civilian1Entity, Modelcivilian1<Civilian1Entity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/civi1.png");

	public Civilian1Renderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelcivilian1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Civilian1Entity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelcivilian1<Civilian1Entity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<Civilian1Entity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Civilian1Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, civilian1Animation.idle, ageInTicks, 1f);
				this.animateWalk(civilian1Animation.walking, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, civilian1Animation.panic, ageInTicks, 2.1f);
				this.animate(entity.animationState3, civilian1Animation.farming, ageInTicks, 1f);
				this.animate(entity.animationState4, civilian1Animation.sleep, ageInTicks, 1f);
				this.animate(entity.animationState5, civilian1Animation.wake, ageInTicks, 1f);
				this.animate(entity.animationState6, civilian1Animation.buy, ageInTicks, 1f);
				this.animate(entity.animationState7, civilian1Animation.eat, ageInTicks, 1f);
				this.animate(entity.animationState8, civilian1Animation.die, ageInTicks, 1f);
				this.animate(entity.animationState9, civilian1Animation.carrying, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(Civilian1Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}