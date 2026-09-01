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
public class Modelknightdark extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("the_middle_ages", "modelknightdark"), "main");
	public final ModelPart whole;
	public final ModelPart Waist;
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart Right_Arm2;
	public final ModelPart RightArm2;
	public final ModelPart Left_Arm;
	public final ModelPart Right_Arm4;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart Right_Leg2;
	public final ModelPart LeftLeg;
	public final ModelPart Left_Leg4;

	public Modelknightdark(ModelPart root) {
		super(root);
		this.whole = root.getChild("whole");
		this.Waist = this.whole.getChild("Waist");
		this.Head = this.Waist.getChild("Head");
		this.Body = this.Waist.getChild("Body");
		this.RightArm = this.Waist.getChild("RightArm");
		this.Right_Arm2 = this.RightArm.getChild("Right_Arm2");
		this.RightArm2 = this.Right_Arm2.getChild("RightArm2");
		this.Left_Arm = this.Waist.getChild("Left_Arm");
		this.Right_Arm4 = this.Left_Arm.getChild("Right_Arm4");
		this.LeftArm = this.Right_Arm4.getChild("LeftArm");
		this.RightLeg = this.whole.getChild("RightLeg");
		this.Right_Leg2 = this.RightLeg.getChild("Right_Leg2");
		this.LeftLeg = this.whole.getChild("LeftLeg");
		this.Left_Leg4 = this.LeftLeg.getChild("Left_Leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition whole = partdefinition.addOrReplaceChild("whole", CubeListBuilder.create(), PartPose.offset(0.0F, 24.6667F, 0.0F));
		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(), PartPose.offset(0.0F, -12.6667F, 0.0F));
		PartDefinition Head = Waist.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 38).addBox(-0.3976F, -8.0938F, -4.4593F, 1.0F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(98, 100).addBox(-3.2976F, -7.9937F, 3.8907F, 6.4F, 8.0F, 0.05F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(70, 0).addBox(1.0F, -29.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(78, 59).addBox(1.0F, -29.0F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 38)
						.addBox(1.0F, -32.0F, -4.0F, 4.0F, 3.25F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(1.0F, -28.25F, -4.0F, 3.8F, 4.25F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6476F, 24.0F, 0.0719F, 0.0F, 0.0873F, 0.0F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(88, 0).addBox(2.0F, -29.0F, -4.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6476F, 24.0F, 0.1446F, 0.0F, 0.0873F, 0.0F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(76, 72).addBox(1.0F, -29.0F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 114).addBox(1.0F, -32.0F, -4.0F, 4.0F, 3.25F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(1.2F, -28.25F, -4.0F, 3.8F, 4.25F, 8.0F, new CubeDeformation(0.0F)).texOffs(33, 74).addBox(4.0F, -29.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3296F, 24.0F, -0.451F, 0.0F, -0.0873F, 0.0F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(59, 96).addBox(1.0F, -31.0F, -4.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3296F, 24.0F, -0.3963F, 0.0F, -0.0873F, 0.0F));
		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(48, 24).addBox(1.0F, -31.0F, -4.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 49).addBox(1.0F, -34.3333F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1476F, 27.0333F, 0.0173F, 0.0F, 0.0873F, 0.0F));
		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(50, 0).addBox(2.0F, -31.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 59).addBox(2.0F, -34.3333F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3296F, 27.0333F, -0.5057F, 0.0F, -0.0873F, 0.0F));
		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 102).addBox(-4.3151F, -4.2687F, -1.9025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 43).addBox(-4.3151F, -4.2687F, -2.0025F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(102, 8).addBox(2.0849F, -4.2687F, -2.0025F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 29).addBox(-4.3151F, -4.2687F, -1.8025F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(102, 13)
						.addBox(2.0849F, -4.2687F, -1.8025F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 8).addBox(-1.0029F, -6.8573F, -1.94F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0796F, -1.3154F, -0.0975F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(44, 96).addBox(-3.9176F, -4.9061F, -1.8625F, 4.0F, 5.0F, 3.8F, new CubeDeformation(0.0F)).texOffs(68, 95).addBox(-3.9176F, -4.9061F, -1.6625F, 4.0F, 5.0F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2389F, -4.196F, -0.04F, 0.0F, 0.0F, -0.0436F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(50, 86).addBox(-0.6357F, -2.3256F, -1.9F, 5.0F, 5.5667F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0706F, -0.8597F, 0.1975F, 0.0F, 0.0F, -3.098F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(68, 86).addBox(-0.964F, -4.9113F, -1.8625F, 5.0F, 5.0F, 3.8F, new CubeDeformation(0.0F)).texOffs(86, 72).addBox(-0.964F, -4.9113F, -2.0625F, 5.0F, 5.0F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0389F, -4.196F, 0.16F, 0.0F, 0.0F, 0.0436F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(94, 48).addBox(-3.8653F, -2.3039F, -1.9F, 4.0F, 5.5667F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2706F, -0.8597F, 0.1975F, 0.0F, 0.0F, 3.098F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(90, 8).addBox(-1.0F, -1.25F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0029F, -5.6073F, 0.16F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(90, 8).addBox(-1.8839F, -1.8839F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0029F, -5.6073F, 0.16F, -3.1416F, 0.0F, 2.3562F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(90, 8).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0029F, -6.8573F, 0.06F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(42, 49).addBox(-1.1292F, -5.0708F, -1.9F, 5.0F, 10.0F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, 0.8054F, 0.5975F, -0.0872F, 0.0038F, -3.0981F));
		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(60, 61).addBox(-3.3718F, -5.049F, -1.9F, 4.0F, 10.0F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, 0.8054F, 0.5975F, -0.0872F, -0.0038F, 3.0981F));
		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(32, 93).addBox(-3.3718F, -5.049F, -1.9F, 2.0F, 10.0F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1961F, 0.7054F, -0.5025F, 0.0872F, -0.0038F, -3.0981F));
		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(86, 92).addBox(-3.3718F, -5.049F, -1.9F, 2.0F, 10.0F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, 0.8054F, -0.5025F, 0.0872F, 0.0038F, 3.0981F));
		PartDefinition Body_r12 = Body.addOrReplaceChild("Body_r12", CubeListBuilder.create().texOffs(20, 69).addBox(-3.3718F, -3.049F, -1.9F, 4.0F, 8.0F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, 0.8054F, -0.4025F, 0.0872F, 0.0038F, 3.0981F));
		PartDefinition Body_r13 = Body.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(44, 24).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1849F, -3.7687F, -1.6025F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r14 = Body.addOrReplaceChild("Body_r14", CubeListBuilder.create().texOffs(60, 49).addBox(-1.1292F, -3.0708F, -1.9F, 5.0F, 8.0F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, 0.8054F, -0.4025F, 0.0872F, -0.0038F, -3.0981F));
		PartDefinition Body_r15 = Body.addOrReplaceChild("Body_r15", CubeListBuilder.create().texOffs(32, 83).addBox(-0.6357F, -2.3256F, -1.9F, 5.0F, 5.5667F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, -0.8597F, 0.0975F, 0.0F, 0.0F, -3.098F));
		PartDefinition Body_r16 = Body.addOrReplaceChild("Body_r16", CubeListBuilder.create().texOffs(92, 59).addBox(-3.8653F, -2.3039F, -1.9F, 4.0F, 5.5667F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, -0.8597F, 0.0975F, 0.0F, 0.0F, 3.098F));
		PartDefinition Body_r17 = Body.addOrReplaceChild("Body_r17", CubeListBuilder.create().texOffs(42, 63).addBox(-0.964F, -6.578F, -1.8625F, 5.0F, 6.6667F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1389F, -4.196F, 0.06F, 0.0F, 0.0F, 0.0436F));
		PartDefinition Body_r18 = Body.addOrReplaceChild("Body_r18", CubeListBuilder.create().texOffs(86, 81).addBox(-3.9176F, -6.5728F, -1.8625F, 4.0F, 6.6667F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1389F, -4.196F, 0.06F, 0.0F, 0.0F, -0.0436F));
		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(54, 75).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(50, 20).addBox(-3.05F, 1.0F, -1.9F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(75, 119)
				.addBox(-3.05F, 1.0F, -2.1F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 24).addBox(-2.95F, 1.0F, -2.1003F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2398F, -1.2602F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(72, 18).addBox(-2.95F, 1.0F, -2.1F, 4.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0738F, -2.418F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition Right_Arm2 = RightArm.addOrReplaceChild("Right_Arm2", CubeListBuilder.create().texOffs(0, 87).addBox(-2.035F, 0.0031F, -2.043F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 4.0F, 0.0F));
		PartDefinition RightArm2 = Right_Arm2.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(91, 102).addBox(-0.4942F, -1.0847F, -14.8391F, 1.0F, 2.1F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 97).addBox(-0.5029F, -0.4859F, 2.9161F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.8587F, 4.6406F, -5.9161F));
		PartDefinition RightArm_r3 = RightArm2.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(-3, 0).mirror().addBox(0.0F, -1.0F, 1.0F, 1.0F, 2.0F, -2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5029F, 0.0141F, 9.6161F, -0.7854F, 0.0F, 0.0F));
		PartDefinition RightArm_r4 = RightArm2.addOrReplaceChild("RightArm_r4", CubeListBuilder.create().texOffs(-1, 0).mirror().addBox(0.0F, -1.5F, 0.5F, 1.0F, 4.0F, -1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5029F, 0.5297F, 2.6161F, -0.0873F, 0.0F, 0.0F));
		PartDefinition RightArm_r5 = RightArm2.addOrReplaceChild("RightArm_r5", CubeListBuilder.create().texOffs(-1, 0).mirror().addBox(0.0F, -2.5F, 0.5F, 1.0F, 4.0F, -1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5029F, -0.4859F, 2.6161F, 0.0873F, 0.0F, 0.0F));
		PartDefinition RightArm_r6 = RightArm2.addOrReplaceChild("RightArm_r6", CubeListBuilder.create().texOffs(37, 19).addBox(-0.5F, -1.05F, -0.793F, 1.0F, 1.4164F, 1.543F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0058F, 0.1776F, -14.5717F, 0.829F, 0.0F, 0.0F));
		PartDefinition Left_Arm = Waist.addOrReplaceChild("Left_Arm", CubeListBuilder.create().texOffs(16, 81).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition LeftArm_r1 = Left_Arm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(0, 57).addBox(-2.414F, 1.4174F, -1.9F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
				.addBox(-2.414F, 1.4174F, -2.1F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 22).addBox(-2.314F, 1.4174F, -2.0996F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3004F, -1.705F, 0.0133F, -3.1416F, 0.0F, 3.0543F));
		PartDefinition LeftArm_r2 = Left_Arm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(72, 18).addBox(-2.0122F, 0.5432F, -2.3002F, 4.0F, -2.0F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3004F, -1.705F, -0.1867F, -3.1416F, 0.0F, -2.8362F));
		PartDefinition Right_Arm4 = Left_Arm.addOrReplaceChild("Right_Arm4", CubeListBuilder.create().texOffs(16, 92).addBox(-2.035F, -0.0031F, -2.043F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 4.0F, 0.0F));
		PartDefinition LeftArm = Right_Arm4.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(98, 92).addBox(-0.5087F, -0.6635F, 17.4878F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(88, 105).mirror()
				.addBox(-0.5174F, -1.2623F, -0.2675F, 1.0F, 2.1F, 17.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.4079F, 4.4135F, -20.4878F));
		PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(42, 17).addBox(-0.5F, -1.05F, -0.793F, 1.0F, 1.4164F, 1.543F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));
		PartDefinition LeftArm_r4 = LeftArm.addOrReplaceChild("LeftArm_r4", CubeListBuilder.create().texOffs(-3, 0).mirror().addBox(0.0F, -1.0F, 1.0F, 1.0F, 2.0F, -2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5087F, -0.1635F, 24.1878F, -0.7854F, 0.0F, 0.0F));
		PartDefinition LeftArm_r5 = LeftArm.addOrReplaceChild("LeftArm_r5", CubeListBuilder.create().texOffs(-1, 0).mirror().addBox(0.0F, -1.5F, 0.5F, 1.0F, 4.0F, -1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5087F, 0.3521F, 17.1878F, -0.0873F, 0.0F, 0.0F));
		PartDefinition LeftArm_r6 = LeftArm.addOrReplaceChild("LeftArm_r6", CubeListBuilder.create().texOffs(-1, 0).mirror().addBox(0.0F, -2.5F, 0.5F, 1.0F, 4.0F, -1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5087F, -0.6635F, 17.1878F, 0.0873F, 0.0F, 0.0F));
		PartDefinition RightLeg = whole.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 76).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -12.6667F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition Right_Leg2 = RightLeg.addOrReplaceChild("Right_Leg2", CubeListBuilder.create().texOffs(78, 48).addBox(-2.0273F, -0.1147F, -2.0273F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
				.addBox(-2.0273F, 4.8345F, -5.0273F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-2.0404F, 4.5348F, -4.0273F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.1667F, 0.0F));
		PartDefinition LeftLeg = whole.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(70, 75).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -12.6667F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition Left_Leg4 = LeftLeg.addOrReplaceChild("Left_Leg4", CubeListBuilder.create().texOffs(76, 61).addBox(-2.0273F, -0.1679F, -2.0273F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 11)
				.addBox(-2.0273F, 4.8321F, -5.0273F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(68, 35).addBox(-2.0142F, 4.5324F, -4.0273F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.1667F, 0.0F));
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