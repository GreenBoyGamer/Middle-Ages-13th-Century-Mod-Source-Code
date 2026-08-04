package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.procedures.DarkSoldierNotAnythuingDoingMeansIdleProcedure;
import net.mcreator.themiddleages.entity.DarkSoldierEntity;
import net.mcreator.themiddleages.client.model.animations.EnemySoldierAnimation;
import net.mcreator.themiddleages.client.model.ModelEnemySoldier;

public class DarkSoldierRenderer extends MobRenderer<DarkSoldierEntity, ModelEnemySoldier<DarkSoldierEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/soldierenemy.png");

	public DarkSoldierRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelEnemySoldier.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DarkSoldierEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelEnemySoldier<DarkSoldierEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<DarkSoldierEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(DarkSoldierEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, EnemySoldierAnimation.block, ageInTicks, 1f);
				if (DarkSoldierNotAnythuingDoingMeansIdleProcedure.execute(entity))
					this.animateWalk(EnemySoldierAnimation.walking, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, EnemySoldierAnimation.sprint, ageInTicks, 2f);
				this.animate(entity.animationState3, EnemySoldierAnimation.attack, ageInTicks, 1f);
				this.animate(entity.animationState4, EnemySoldierAnimation.attack2, ageInTicks, 1f);
				this.animate(entity.animationState5, EnemySoldierAnimation.die, ageInTicks, 1f);
				this.animate(entity.animationState6, EnemySoldierAnimation.idle, ageInTicks, 1f);
				this.animate(entity.animationState7, EnemySoldierAnimation.threaten, ageInTicks, 1f);
				this.animate(entity.animationState8, EnemySoldierAnimation.scared, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(DarkSoldierEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}