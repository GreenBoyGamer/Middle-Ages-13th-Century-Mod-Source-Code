package net.mcreator.themiddleages.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.themiddleages.procedures.KnightRidingHorseIdlePlaybackConditionProcedure;
import net.mcreator.themiddleages.entity.KnightRidingHorseEntity;
import net.mcreator.themiddleages.client.model.animations.horseknightAnimation;
import net.mcreator.themiddleages.client.model.Modelhorseknight;

public class KnightRidingHorseRenderer extends MobRenderer<KnightRidingHorseEntity, Modelhorseknight<KnightRidingHorseEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("the_middle_ages:textures/entities/knightonhorse.png");

	public KnightRidingHorseRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelhorseknight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KnightRidingHorseEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelhorseknight<KnightRidingHorseEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<KnightRidingHorseEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(KnightRidingHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, horseknightAnimation.spawn, ageInTicks, 1f);
				this.animate(entity.animationState1, horseknightAnimation.idle, ageInTicks, 1f);
				if (KnightRidingHorseIdlePlaybackConditionProcedure.execute(entity))
					this.animateWalk(horseknightAnimation.moving, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState3, horseknightAnimation.sprint, ageInTicks, 2f);
				this.animate(entity.animationState4, horseknightAnimation.attack, ageInTicks, 1f);
				this.animate(entity.animationState5, horseknightAnimation.attack2, ageInTicks, 1f);
				this.animate(entity.animationState6, horseknightAnimation.die, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(KnightRidingHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}