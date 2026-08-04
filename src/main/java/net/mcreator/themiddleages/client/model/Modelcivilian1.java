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

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcivilian1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("the_middle_ages", "modelcivilian_1"), "main");
	public final ModelPart whole;
	public final ModelPart LeftLeg;
	public final ModelPart LeftLeg2;
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
	public final ModelPart carrot;
	public final ModelPart leave;
	public final ModelPart leave2;
	public final ModelPart leave3;
	public final ModelPart carrot2;
	public final ModelPart leave4;
	public final ModelPart leave5;
	public final ModelPart leave6;
	public final ModelPart carrot3;
	public final ModelPart leave7;
	public final ModelPart leave8;
	public final ModelPart leave9;
	public final ModelPart LeftArm3;
	public final ModelPart RightArm;
	public final ModelPart RightArm2;
	public final ModelPart RightLeg;
	public final ModelPart RightLeg2;

	public Modelcivilian1(ModelPart root) {
		this.whole = root.getChild("whole");
		this.LeftLeg = this.whole.getChild("LeftLeg");
		this.LeftLeg2 = this.LeftLeg.getChild("LeftLeg2");
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
		this.carrot = this.LeftArm2.getChild("carrot");
		this.leave = this.carrot.getChild("leave");
		this.leave2 = this.carrot.getChild("leave2");
		this.leave3 = this.carrot.getChild("leave3");
		this.carrot2 = this.LeftArm2.getChild("carrot2");
		this.leave4 = this.carrot2.getChild("leave4");
		this.leave5 = this.carrot2.getChild("leave5");
		this.leave6 = this.carrot2.getChild("leave6");
		this.carrot3 = this.LeftArm2.getChild("carrot3");
		this.leave7 = this.carrot3.getChild("leave7");
		this.leave8 = this.carrot3.getChild("leave8");
		this.leave9 = this.carrot3.getChild("leave9");
		this.LeftArm3 = this.LeftArm2.getChild("LeftArm3");
		this.RightArm = this.Waist.getChild("RightArm");
		this.RightArm2 = this.RightArm.getChild("RightArm2");
		this.RightLeg = this.whole.getChild("RightLeg");
		this.RightLeg2 = this.RightLeg.getChild("RightLeg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition whole = partdefinition.addOrReplaceChild("whole", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = whole.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(66, 62).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(22, 55).addBox(-2.0117F, -0.1667F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
				.addBox(-2.0117F, 4.8333F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(-1.9766F, 3.8333F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0117F, 5.1667F, -0.6289F));
		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(), PartPose.offset(-2.4F, 1.0F, 0.0F));
		PartDefinition Head = Waist.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 11).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.9F, -1.4F, -4.1F, 2.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 43)
						.addBox(-4.25F, -7.0F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(74, 37).addBox(-4.25F, -7.0F, 3.1F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 45)
						.addBox(0.2719F, -7.0F, 3.1F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 30).addBox(-4.25F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 70)
						.addBox(3.2833F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 43).addBox(3.2833F, -7.0F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -8.0F, -4.5F, 10.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(32, 11).addBox(-3.5F, -10.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(50, 55)
						.addBox(-2.5F, -11.9F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(58, 24).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0833F, -2.4F, -3.6469F, -0.1309F, 0.0F, 0.0F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8687F, -2.2119F, -3.6F, 0.0F, 0.0F, -0.3491F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.729F, -1.8698F, -3.6F, 0.0F, 0.0F, 0.3491F));
		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow", CubeListBuilder.create(), PartPose.offset(3.8333F, 24.6F, -0.0258F));
		PartDefinition Head_r4 = eyebrow.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(52, 39).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 22).addBox(2.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, -29.45F, -3.5F, -0.3054F, 0.0F, 0.0F));
		PartDefinition EyeR = Head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(52, 41).addBox(-1.15F, -0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.65F, -3.9F, -3.5316F));
		PartDefinition Head2 = EyeR.addOrReplaceChild("Head2", CubeListBuilder.create().texOffs(60, 18).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.15F, 0.0F, -0.0059F));
		PartDefinition eyeL = Head.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(16, 57).addBox(-0.875F, -0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.7083F, -3.9F, -3.5316F));
		PartDefinition Head3 = eyeL.addOrReplaceChild("Head3", CubeListBuilder.create().texOffs(16, 59).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, 0.0F, -0.0059F));
		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(52, 37).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0833F, -1.3833F, -3.5258F));
		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(28, 27).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-4.5F, 2.0F, -2.5F, 9.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(38, 9)
						.addBox(-4.5156F, 13.0F, -2.2F, 9.0F, -1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 20).addBox(-4.5156F, 13.0F, -0.7F, 9.0F, -1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 55)
						.addBox(-0.5F, 2.0117F, -2.557F, 1.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 20).addBox(-4.6F, 9.0F, -2.4F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 55)
						.addBox(2.7F, 9.0F, -2.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 71).addBox(2.7F, 9.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-3.3F, 9.0F, -2.6F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 72).addBox(-4.6F, 9.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(68, 22)
						.addBox(-4.5F, -0.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 67).addBox(1.5F, -0.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(76, 14).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0117F, -0.157F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(76, 8).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.3117F, -0.157F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(12, 75).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.6117F, -0.157F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.9117F, -0.157F, 0.0F, 0.0F, 0.7854F));
		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(50, 62).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.5F, -11.0F, 0.0F));
		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(58, 37).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));
		PartDefinition carrot = LeftArm2.addOrReplaceChild("carrot", CubeListBuilder.create().texOffs(30, 103).addBox(-0.4852F, 2.146F, -0.2778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5396F, 0.6939F, -0.0556F));
		PartDefinition LeftArm_r1 = carrot.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3061F, 0.3061F, 0.2222F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftArm_r2 = carrot.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2938F, 0.3061F, 0.2222F, 0.0F, 0.0F, -0.1309F));
		PartDefinition leave = carrot.addOrReplaceChild("leave", CubeListBuilder.create(), PartPose.offset(-0.2313F, -1.4165F, -1.1111F));
		PartDefinition LeftArm_r3 = leave.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(60, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition leave2 = carrot.addOrReplaceChild("leave2", CubeListBuilder.create(), PartPose.offset(-0.2313F, -1.4165F, 0.2222F));
		PartDefinition LeftArm_r4 = leave2.addOrReplaceChild("LeftArm_r4", CubeListBuilder.create().texOffs(60, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition leave3 = carrot.addOrReplaceChild("leave3", CubeListBuilder.create(), PartPose.offset(0.4354F, -1.4165F, 0.2222F));
		PartDefinition LeftArm_r5 = leave3.addOrReplaceChild("LeftArm_r5", CubeListBuilder.create().texOffs(60, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition carrot2 = LeftArm2.addOrReplaceChild("carrot2", CubeListBuilder.create().texOffs(30, 103).addBox(-0.4852F, 2.146F, -0.2778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5396F, 0.6939F, -0.0556F));
		PartDefinition LeftArm_r6 = carrot2.addOrReplaceChild("LeftArm_r6", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3061F, 0.3061F, 0.2222F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftArm_r7 = carrot2.addOrReplaceChild("LeftArm_r7", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2938F, 0.3061F, 0.2222F, 0.0F, 0.0F, -0.1309F));
		PartDefinition leave4 = carrot2.addOrReplaceChild("leave4", CubeListBuilder.create(), PartPose.offset(-0.2313F, -1.4165F, -1.1111F));
		PartDefinition LeftArm_r8 = leave4.addOrReplaceChild("LeftArm_r8", CubeListBuilder.create().texOffs(60, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition leave5 = carrot2.addOrReplaceChild("leave5", CubeListBuilder.create(), PartPose.offset(-0.2313F, -1.4165F, 0.2222F));
		PartDefinition LeftArm_r9 = leave5.addOrReplaceChild("LeftArm_r9", CubeListBuilder.create().texOffs(60, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition leave6 = carrot2.addOrReplaceChild("leave6", CubeListBuilder.create(), PartPose.offset(0.4354F, -1.4165F, 0.2222F));
		PartDefinition LeftArm_r10 = leave6.addOrReplaceChild("LeftArm_r10", CubeListBuilder.create().texOffs(60, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition carrot3 = LeftArm2.addOrReplaceChild("carrot3", CubeListBuilder.create().texOffs(30, 103).addBox(-0.4852F, 2.146F, -0.2778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5396F, 0.6939F, -0.0556F));
		PartDefinition LeftArm_r11 = carrot3.addOrReplaceChild("LeftArm_r11", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3061F, 0.3061F, 0.2222F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftArm_r12 = carrot3.addOrReplaceChild("LeftArm_r12", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2938F, 0.3061F, 0.2222F, 0.0F, 0.0F, -0.1309F));
		PartDefinition leave7 = carrot3.addOrReplaceChild("leave7", CubeListBuilder.create(), PartPose.offset(-0.2313F, -1.4165F, -1.1111F));
		PartDefinition LeftArm_r13 = leave7.addOrReplaceChild("LeftArm_r13", CubeListBuilder.create().texOffs(60, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition leave8 = carrot3.addOrReplaceChild("leave8", CubeListBuilder.create(), PartPose.offset(-0.2313F, -1.4165F, 0.2222F));
		PartDefinition LeftArm_r14 = leave8.addOrReplaceChild("LeftArm_r14", CubeListBuilder.create().texOffs(60, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition leave9 = carrot3.addOrReplaceChild("leave9", CubeListBuilder.create(), PartPose.offset(0.4354F, -1.4165F, 0.2222F));
		PartDefinition LeftArm_r15 = leave9.addOrReplaceChild("LeftArm_r15", CubeListBuilder.create().texOffs(60, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition LeftArm3 = LeftArm2.addOrReplaceChild("LeftArm3", CubeListBuilder.create().texOffs(110, 108).addBox(-1.0333F, -0.5F, 1.5F, 2.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(109, 107)
				.addBox(-1.2333F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(109, 107).addBox(0.2667F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0333F, 4.5F, 0.1667F));
		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(50, 62).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, -11.0F, 0.0F));
		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(58, 37).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));
		PartDefinition RightLeg = whole.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(16, 66).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2", CubeListBuilder.create().texOffs(52, 26).addBox(-2.0117F, 0.0F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
				.addBox(-2.0117F, 5.0F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 47).addBox(-1.9766F, 4.0F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0117F, 5.0F, -0.6289F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		whole.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}