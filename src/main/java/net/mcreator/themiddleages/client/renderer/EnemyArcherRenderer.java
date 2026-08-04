package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.procedures.EnemyArcherIdlePlaybackProcedure;
import net.mcreator.themiddleages.entity.EnemyArcherEntity;
import net.mcreator.themiddleages.client.model.animations.archermodelAnimation;
import net.mcreator.themiddleages.client.model.Modelarchermodel;

public class EnemyArcherRenderer extends MobRenderer<EnemyArcherEntity, Modelarchermodel<EnemyArcherEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/enemy_archer.png");

	public EnemyArcherRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelarchermodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnemyArcherEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelarchermodel<EnemyArcherEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<EnemyArcherEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(EnemyArcherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				if (EnemyArcherIdlePlaybackProcedure.execute(entity))
					this.animateWalk(archermodelAnimation.walking, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState1, archermodelAnimation.attack, ageInTicks, 1f);
				this.animate(entity.animationState2, archermodelAnimation.die, ageInTicks, 1f);
				this.animate(entity.animationState3, archermodelAnimation.idle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(EnemyArcherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}