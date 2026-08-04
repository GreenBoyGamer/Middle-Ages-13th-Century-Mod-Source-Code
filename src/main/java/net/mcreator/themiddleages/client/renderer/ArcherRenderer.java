package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.procedures.ArcherNotDoingAndIdleProcedure;
import net.mcreator.themiddleages.entity.ArcherEntity;
import net.mcreator.themiddleages.client.model.animations.archermodelAnimation;
import net.mcreator.themiddleages.client.model.Modelarchermodel;

public class ArcherRenderer extends MobRenderer<ArcherEntity, Modelarchermodel<ArcherEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/archer.png");

	public ArcherRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelarchermodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ArcherEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelarchermodel<ArcherEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ArcherEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ArcherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				if (ArcherNotDoingAndIdleProcedure.execute(entity))
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
		public void setupAnim(ArcherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}