package net.mcreator.themiddleages.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcivilian3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("the_middle_ages", "modelcivilian_3"), "main");
	public final ModelPart whole;
	public final ModelPart LeftLeg;
	public final ModelPart LeftLeg2;
	public final ModelPart RightLeg;
	public final ModelPart RightLeg2;
	public final ModelPart Waist;
	public final ModelPart Head;
	public final ModelPart eyebrow;
	public final ModelPart EyeR;
	public final ModelPart Head2;
	public final ModelPart eyeL;
	public final ModelPart Head3;
	public final ModelPart mouth;
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart LeftArm2;
	public final ModelPart LeftArm3;
	public final ModelPart RightArm;
	public final ModelPart RightArm2;

	public Modelcivilian3(ModelPart root) {
		this.whole = root.getChild("whole");
		this.LeftLeg = this.whole.getChild("LeftLeg");
		this.LeftLeg2 = this.LeftLeg.getChild("LeftLeg2");
		this.RightLeg = this.whole.getChild("RightLeg");
		this.RightLeg2 = this.RightLeg.getChild("RightLeg2");
		this.Waist = this.whole.getChild("Waist");
		this.Head = this.Waist.getChild("Head");
		this.eyebrow = this.Head.getChild("eyebrow");
		this.EyeR = this.Head.getChild("EyeR");
		this.Head2 = this.EyeR.getChild("Head2");
		this.eyeL = this.Head.getChild("eyeL");
		this.Head3 = this.eyeL.getChild("Head3");
		this.mouth = this.Head.getChild("mouth");
		this.Body = this.Waist.getChild("Body");
		this.LeftArm = this.Waist.getChild("LeftArm");
		this.LeftArm2 = this.LeftArm.getChild("LeftArm2");
		this.LeftArm3 = this.LeftArm2.getChild("LeftArm3");
		this.RightArm = this.Waist.getChild("RightArm");
		this.RightArm2 = this.RightArm.getChild("RightArm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition whole = partdefinition.addOrReplaceChild("whole", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = whole.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(28, 83).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(70, 70).addBox(-2.0117F, -0.1667F, -1.3711F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 68).addBox(-2.0117F, 4.8333F, -3.3711F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));
		PartDefinition RightLeg = whole.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(83, 38).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.3333F, 0.0F, 0.0F));
		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(71, 11).addBox(-2.0117F, -0.1667F, -1.3711F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 9).addBox(-2.0117F, 4.8333F, -3.3711F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));
		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(), PartPose.offset(-2.4F, 1.0F, 0.0F));
		PartDefinition Head = Waist.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-4.2F, -8.0F, -4.3F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(51, 29)
						.addBox(-3.2F, -8.0F, -4.3F, -1.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(34, 70).addBox(-3.2F, -4.0F, -3.3F, -1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(55, 43)
						.addBox(4.2F, -8.0F, -4.3F, -1.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(70, 57).addBox(4.2F, -4.0F, -3.3F, -1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(27, 17)
						.addBox(0.1667F, -8.0F, -4.3F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(85, 23).addBox(-4.1849F, -8.0F, 3.7F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 48)
						.addBox(0.2151F, -8.0F, 3.7F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 76).addBox(-0.5849F, -8.0F, 3.7F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 47)
						.addBox(-0.5333F, -8.0F, -4.3F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(28, 74).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0833F, -2.4F, -3.6469F, -0.1309F, 0.0F, 0.0F));
		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow", CubeListBuilder.create(), PartPose.offset(3.8333F, 24.6F, -0.0258F));
		PartDefinition Head_r2 = eyebrow.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(86, 18).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 78).addBox(2.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, -29.45F, -3.5F, -0.3054F, 0.0F, 0.0F));
		PartDefinition EyeR = Head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(72, 54).addBox(-1.15F, -0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.65F, -3.9F, -3.5316F));
		PartDefinition Head2 = EyeR.addOrReplaceChild("Head2", CubeListBuilder.create().texOffs(79, 54).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.15F, 0.0F, -0.0059F));
		PartDefinition eyeL = Head.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(60, 72).addBox(-0.875F, -0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.7083F, -3.9F, -3.5316F));
		PartDefinition Head3 = eyeL.addOrReplaceChild("Head3", CubeListBuilder.create().texOffs(28, 77).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, 0.0F, -0.0059F));
		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(60, 75).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0833F, -1.3833F, -3.5258F));
		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(50, 0).addBox(-2.2F, -0.1547F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 57).addBox(-2.2F, -0.1547F, -1.2F, 4.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(71, 23)
						.addBox(-3.9F, 8.5F, -2.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 6).addBox(-2.3F, 8.5F, -2.4F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 82)
						.addBox(-3.9F, 8.5F, -0.6F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(81, 82).addBox(-3.3F, 8.5F, -0.6F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(85, 61)
						.addBox(-2.2F, -0.1547F, 1.2F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 76).addBox(-4.0F, -6.0F, 1.0F, 4.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 29)
				.addBox(-4.0F, -6.0F, -2.4F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 29).addBox(-4.0F, -6.0F, -2.2F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 5.9F, 0.2F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(17, 74).addBox(-4.0F, -6.0F, 1.0F, 4.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
				.addBox(-4.0F, -6.0F, -2.4F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(-4.0F, -6.0F, -2.2F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.2F, 0.0F, 0.0F, -0.0873F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(49, 72).addBox(-2.5F, -7.0F, -0.5F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6F, 15.5F, -0.5833F, 0.0F, 1.5708F, 0.0436F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(72, 38).addBox(-2.5F, -7.0F, -0.5F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 15.5F, -0.5833F, 0.0F, 1.5708F, -0.0436F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(17, 47).addBox(-3.5F, -7.0F, -0.5F, 7.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 15.5F, 2.1167F, 0.0436F, 0.0F, 0.0F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(33, 0).addBox(-3.5F, -7.0F, -0.5F, 7.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 15.5F, -2.15F, -0.0436F, 0.0F, 0.0F));
		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(34, 59).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 63).addBox(-1.2F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 10)
						.addBox(-1.0F, -2.125F, -2.2F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 0).addBox(-1.0F, -2.125F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 87)
						.addBox(-1.0F, -2.125F, 1.2F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.5F, -11.0F, 0.0F));
		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(54, 16).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));
		PartDefinition LeftArm3 = LeftArm2.addOrReplaceChild("LeftArm3", CubeListBuilder.create().texOffs(110, 108).addBox(-1.0333F, -0.5F, 1.5F, 2.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(109, 107)
				.addBox(-1.2333F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(109, 107).addBox(0.2667F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0333F, 4.5F, 0.1667F));
		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(67, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 27).addBox(-1.2F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(71, 87)
						.addBox(-1.0F, -2.125F, -2.2F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 74).addBox(-1.0F, -2.125F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 87)
						.addBox(-1.0F, -2.125F, 1.2F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.5F, -11.0F, 0.0F));
		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(0, 65).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		whole.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}