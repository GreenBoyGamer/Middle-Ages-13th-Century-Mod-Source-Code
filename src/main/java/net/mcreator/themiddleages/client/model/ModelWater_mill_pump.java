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
public class ModelWater_mill_pump extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("the_middle_ages", "model_water_mill_pump"), "main");
	public final ModelPart hexadecagon;
	public final ModelPart bone;

	public ModelWater_mill_pump(ModelPart root) {
		super(root);
		this.hexadecagon = root.getChild("hexadecagon");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hexadecagon = partdefinition.addOrReplaceChild("hexadecagon", CubeListBuilder.create(), PartPose.offset(0.0008F, 16.3659F, -0.3482F));
		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(-8, 7).addBox(-9.0833F, -2.25F, -2.1826F, 11.0F, 1.0F, 4.3652F, new CubeDeformation(0.0F)).texOffs(-8, 7).addBox(-9.0833F, 1.25F, -2.1826F, 11.0F, 1.0F, 4.3652F, new CubeDeformation(0.0F))
						.texOffs(-4, 10).addBox(-9.0833F, -1.25F, -2.1826F, 11.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-4, 10).addBox(-9.0833F, -1.75F, 1.1826F, 11.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0659F, -0.4159F, -0.5685F, 0.0F, 1.5708F, 0.7854F));
		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.054F, 0.0F, 1.5708F, -0.7854F));
		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0149F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.054F, 0.0F, 1.5708F, -2.3562F));
		PartDefinition hexadecagon_r5 = hexadecagon.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0149F, 0.0F, 1.5708F, 3.1416F));
		PartDefinition hexadecagon_r6 = hexadecagon.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.054F, 0.0F, 1.5708F, 2.3562F));
		PartDefinition hexadecagon_r7 = hexadecagon.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0149F, 0.0F, 1.5708F, 1.5708F));
		PartDefinition hexadecagon_r8 = hexadecagon.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.054F, 0.0F, 1.5708F, 0.7854F));
		PartDefinition hexadecagon_r9 = hexadecagon.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0149F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-12.0F, -16.0F, 0.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(-12.0F, -16.0F, 10.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(-1, -1).mirror().addBox(-11.3333F, -14.6667F, 6.0F, 6.6667F, 2.0F, 4.6667F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
						.addBox(-12.0F, -6.0F, 0.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-1, -1).mirror().addBox(-11.3333F, -5.0F, 6.0F, 6.6667F, 3.0F, 4.6667F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
						.mirror().addBox(-12.0F, -6.0F, 10.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(8.0F, 24.0F, -8.0F));
		PartDefinition hexadecagon_r10 = bone.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(-17, 7).addBox(-18.0833F, -2.25F, -2.1826F, 8.0F, 1.0F, 4.3652F, new CubeDeformation(0.0F)).texOffs(-13, 10).addBox(-18.0833F, -1.25F, -2.1826F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(-17, 7).addBox(-18.0833F, 1.25F, -2.1826F, 8.0F, 1.0F, 4.3652F, new CubeDeformation(0.0F)).texOffs(-13, 10).addBox(-18.0833F, -1.75F, 1.1826F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.9333F, -8.05F, -12.9167F, 0.0F, 1.5708F, 0.7854F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(4, 2).mirror().addBox(-2.0F, -30.0F, -2.0F, 4.0F, 60.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, 29.0F, 12.0F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}