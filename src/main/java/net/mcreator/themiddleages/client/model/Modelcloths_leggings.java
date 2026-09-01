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

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcloths_leggings extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("the_middle_ages", "modelcloths_leggings"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelcloths_leggings(ModelPart root) {
		super(root);
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-2.0F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.8F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48).addBox(-1.8F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-2.2F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48).addBox(-2.2F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 19).addBox(-2.0F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48).addBox(-2.0F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 35)
						.addBox(-1.8F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(-1.8F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 32)
						.addBox(-2.2F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 16).addBox(-2.2F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}