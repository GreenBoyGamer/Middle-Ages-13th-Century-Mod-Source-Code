package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.procedures.SoldierNotPlaybackConditionProcedure;
import net.mcreator.themiddleages.entity.SoldierEntity;
import net.mcreator.themiddleages.client.model.animations.civilian1Animation;
import net.mcreator.themiddleages.client.model.animations.SoldierAnimation;
import net.mcreator.themiddleages.client.model.ModelSoldier;

public class SoldierRenderer extends MobRenderer<SoldierEntity, ModelSoldier<SoldierEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/soldier.png");

	public SoldierRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelSoldier.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SoldierEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelSoldier<SoldierEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<SoldierEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(SoldierEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, SoldierAnimation.block, ageInTicks, 1f);
				if (SoldierNotPlaybackConditionProcedure.execute(entity))
					this.animateWalk(SoldierAnimation.walking, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, SoldierAnimation.sprint, ageInTicks, 2f);
				this.animate(entity.animationState3, SoldierAnimation.attack, ageInTicks, 1f);
				this.animate(entity.animationState4, SoldierAnimation.attack2, ageInTicks, 1f);
				this.animate(entity.animationState5, SoldierAnimation.die, ageInTicks, 1f);
				this.animate(entity.animationState6, civilian1Animation.idle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(SoldierEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}