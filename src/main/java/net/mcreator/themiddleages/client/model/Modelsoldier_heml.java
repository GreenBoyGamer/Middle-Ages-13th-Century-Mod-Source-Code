package net.mcreator.themiddleages.client.model;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsoldier_heml extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("the_middle_ages", "modelsoldier_heml"), "main");
	public final ModelPart helmet;
	public final ModelPart upper;

	public Modelsoldier_heml(ModelPart root) {
		super(root);
		this.helmet = root.getChild("helmet");
		this.upper = this.helmet.getChild("upper");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition helmet = partdefinition.addOrReplaceChild("helmet",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0167F, 1.1667F, -2.75F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-5.0167F, 4.1667F, -2.75F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(22, 13)
						.addBox(3.9833F, 4.1667F, -2.75F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(-4.0167F, 4.1667F, 6.25F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-0.5167F, 4.1667F, -2.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 38).addBox(-1.0167F, 4.1276F, -2.7422F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 33)
						.addBox(-5.5167F, 0.6667F, -3.25F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 33).addBox(4.4833F, 0.6667F, -3.25F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 35)
						.addBox(-5.5167F, 0.6667F, 6.75F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 35).addBox(4.4833F, 0.6667F, 6.75F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 36)
						.addBox(-0.5F, -1.8898F, 3.8762F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0167F, -10.1667F, -2.25F));
		PartDefinition Head_r1 = helmet.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(36, 33).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2603F, 7.4901F, -0.829F, 0.0F, 0.0F));
		PartDefinition Head_r2 = helmet.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(18, 29).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4063F, 2.2031F, 0.2618F, 0.0F, 0.0F));
		PartDefinition upper = helmet.addOrReplaceChild("upper", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition Head_r3 = upper.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(28, 29).addBox(-1.0F, 1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Head_r4 = upper.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}