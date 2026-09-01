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
public class ModelSoldier extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("the_middle_ages", "model_soldier"), "main");
	public final ModelPart soldier;
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart EyeL;
	public final ModelPart Eyeball2;
	public final ModelPart EyeR;
	public final ModelPart Eyeball;
	public final ModelPart mouth;
	public final ModelPart right_arm;
	public final ModelPart down_side;
	public final ModelPart sword;
	public final ModelPart left_arm_main_Group;
	public final ModelPart left_arm;
	public final ModelPart down_side_L;
	public final ModelPart shield;
	public final ModelPart right_leg;
	public final ModelPart right_leg2;
	public final ModelPart right_leg3;
	public final ModelPart Left_leg;
	public final ModelPart leftleg;
	public final ModelPart LeftLeg2;

	public ModelSoldier(ModelPart root) {
		super(root);
		this.soldier = root.getChild("soldier");
		this.body = this.soldier.getChild("body");
		this.head = this.body.getChild("head");
		this.EyeL = this.head.getChild("EyeL");
		this.Eyeball2 = this.EyeL.getChild("Eyeball2");
		this.EyeR = this.head.getChild("EyeR");
		this.Eyeball = this.EyeR.getChild("Eyeball");
		this.mouth = this.head.getChild("mouth");
		this.right_arm = this.body.getChild("right_arm");
		this.down_side = this.right_arm.getChild("down_side");
		this.sword = this.down_side.getChild("sword");
		this.left_arm_main_Group = this.body.getChild("left_arm_main_Group");
		this.left_arm = this.left_arm_main_Group.getChild("left_arm");
		this.down_side_L = this.left_arm.getChild("down_side_L");
		this.shield = this.left_arm.getChild("shield");
		this.right_leg = this.soldier.getChild("right_leg");
		this.right_leg2 = this.right_leg.getChild("right_leg2");
		this.right_leg3 = this.right_leg.getChild("right_leg3");
		this.Left_leg = this.soldier.getChild("Left_leg");
		this.leftleg = this.Left_leg.getChild("leftleg");
		this.LeftLeg2 = this.Left_leg.getChild("LeftLeg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition soldier = partdefinition.addOrReplaceChild("soldier", CubeListBuilder.create(), PartPose.offset(0.0196F, 24.9525F, -0.0333F));
		PartDefinition body = soldier.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(52, 15).addBox(-2.0589F, -12.8575F, -1.9F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 71).addBox(-2.0589F, -10.8575F, -2.15F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(101, 16)
						.addBox(-1.1589F, -3.8575F, -2.25F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(84, 22).addBox(-1.1589F, -3.6575F, -2.35F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 22)
						.addBox(-1.1589F, -4.0574F, -2.35F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(106, 78).addBox(-3.9589F, -3.8575F, -2.25F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(83, 106)
						.addBox(-1.1589F, -3.8575F, -0.55F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(106, 83).addBox(-3.9589F, -3.8575F, -0.55F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0393F, -12.095F, -0.0667F));
		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(94, 22).addBox(0.9905F, -4.2179F, -2.125F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 9).addBox(0.9905F, -6.2179F, -1.875F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -6.8575F, 0.175F, -3.1416F, 0.0F, 3.0543F));
		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(49, 111).addBox(-2.0F, -4.0F, -2.125F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -0.0574F, 0.2297F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(0, 71).addBox(-2.0F, -4.0F, -2.125F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -6.8575F, 0.175F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(87, 93).addBox(-3.9905F, -4.2179F, -2.125F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -6.8575F, 0.175F, 3.1416F, 0.0F, -3.0543F));
		PartDefinition body_r5 = body.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(87, 93).addBox(-3.9905F, -4.2179F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -6.8575F, -0.15F, 0.0F, 0.0F, -0.0873F));
		PartDefinition body_r6 = body.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(46, 64).addBox(-1.5F, -6.0F, -1.875F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5589F, -6.8575F, -0.025F, 0.0F, 0.0F, -0.0873F));
		PartDefinition body_r7 = body.addOrReplaceChild("body_r7",
				CubeListBuilder.create().texOffs(33, 16).addBox(0.3101F, -1.0203F, 0.75F, 1.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(36, 104).addBox(-2.6269F, -4.9783F, -2.25F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 16)
						.addBox(0.1269F, 0.9783F, 0.75F, 1.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(70, 104).addBox(-2.6269F, -4.9783F, 0.25F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.362F, 1.5123F, 0.1F, -3.1416F, 0.0F, -2.9671F));
		PartDefinition body_r8 = body.addOrReplaceChild("body_r8",
				CubeListBuilder.create().texOffs(70, 104).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 104).addBox(-2.0F, -5.0F, -4.5F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6911F, 1.6425F, 2.35F, 0.0F, 0.0F, -0.1745F));
		PartDefinition body_r9 = body.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(33, 16).addBox(1.0F, 1.0F, 1.0F, 1.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2744F, -0.3575F, -0.15F, 0.0F, 0.0F, -0.1745F));
		PartDefinition body_r10 = body.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(33, 16).addBox(1.0F, 1.0F, 1.0F, 1.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4411F, 1.6425F, -0.15F, 0.0F, 0.0F, -0.1745F));
		PartDefinition body_r11 = body.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(94, 22).addBox(0.9905F, -4.2179F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -6.8575F, -0.15F, 0.0F, 0.0F, 0.0873F));
		PartDefinition body_r12 = body.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(69, 9).addBox(-1.5F, -6.0F, -1.875F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4411F, -6.8575F, -0.025F, 0.0F, 0.0F, 0.0873F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(15, 113).addBox(-1.5F, -8.9353F, -3.2097F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 47)
						.addBox(-4.25F, -7.9F, -4.25F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 114).addBox(-4.5F, -7.9F, -4.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 114)
						.addBox(-4.5F, -7.9F, 3.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 114).addBox(3.25F, -7.9F, -4.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 114)
						.addBox(3.25F, -7.9F, 3.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 73).addBox(-3.25F, -1.9F, -4.25F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(75, 26)
						.addBox(2.0833F, -1.9F, -4.25F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(53, 82).addBox(-1.4F, -6.5667F, -4.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(53, 82)
						.addBox(0.1F, -6.5667F, -4.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(61, 70).addBox(-0.9F, -6.5667F, -4.25F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(61, 70)
						.addBox(-0.3167F, -6.5667F, -4.25F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(3.0833F, -7.9F, -4.25F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0589F, -12.8575F, 0.1F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(50, 32).addBox(-3.5F, -1.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2805F, -6.9885F, -0.25F, 0.0F, 0.0F, 0.0873F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(50, 32).addBox(-3.5F, -1.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.53F, -7.25F, -0.25F, 0.0F, 0.0F, -0.0873F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(58, 115).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.6141F, 5.5273F, -0.9362F, 0.678F, 0.4326F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(58, 9).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.9254F, 4.1502F, -0.4233F, 0.3897F, 0.7006F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(115, 109).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0335F, 2.1159F, -0.2849F, 0.274F, 0.7459F));
		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(69, 114).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.3847F, 0.532F, -0.0309F, 0.0308F, 0.7849F));
		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(36, 73).addBox(1.1213F, -1.3787F, -3.1213F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0471F, 1.8738F, -0.5299F, 0.7119F, -0.3655F));
		PartDefinition head_r8 = head.addOrReplaceChild("head_r8",
				CubeListBuilder.create().texOffs(7, 117).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 117).addBox(-4.9F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8333F, -4.4833F, -3.5766F, -0.3927F, 0.0F, 0.0F));
		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(5, 120).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, -3.1381F, -3.4293F, -0.2182F, 0.0F, 0.0F));
		PartDefinition EyeL = head.addOrReplaceChild("EyeL", CubeListBuilder.create().texOffs(19, 101).addBox(-0.75F, -0.5F, -3.9922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5833F, -3.5F, -0.0844F));
		PartDefinition Eyeball2 = EyeL.addOrReplaceChild("Eyeball2", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.25F, 0.0F, -3.5078F));
		PartDefinition EyeR = head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(26, 101).addBox(-0.75F, -0.5F, -3.9922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3167F, -3.5F, -0.0844F));
		PartDefinition Eyeball = EyeR.addOrReplaceChild("Eyeball", CubeListBuilder.create().texOffs(120, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.75F, 0.0F, -3.5078F));
		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(14, 118).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.15F, -1.35F, -3.6F));
		PartDefinition right_arm = body.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(97, 70).addBox(-3.3824F, 0.9381F, -2.2484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(101, 0).addBox(-3.3824F, 0.9381F, -2.1484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.9551F, -13.1353F, 0.2688F));
		PartDefinition body_r13 = right_arm.addOrReplaceChild("body_r13",
				CubeListBuilder.create().texOffs(102, 93).addBox(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(101, 8).addBox(-2.5F, -1.5F, -2.1F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6832F, 4.2545F, -0.1484F, 0.0F, 0.0F, -0.0436F));
		PartDefinition body_r14 = right_arm.addOrReplaceChild("body_r14",
				CubeListBuilder.create().texOffs(106, 88).addBox(-2.5F, -1.5F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 95).addBox(-2.5F, -1.5F, -2.3005F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8824F, 1.2935F, -0.1188F, 0.0F, 0.0F, 0.1309F));
		PartDefinition down_side = right_arm.addOrReplaceChild("down_side", CubeListBuilder.create().texOffs(80, 70).addBox(-2.0F, -0.75F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.1038F, 6.0279F, -0.1688F));
		PartDefinition sword = down_side.addOrReplaceChild("sword", CubeListBuilder.create().texOffs(103, 51).addBox(-0.5F, -0.9527F, 13.8733F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(69, 26)
				.addBox(-0.5F, -1.9527F, 12.8733F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-0.5F, -0.9527F, 0.8733F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.8333F, 4.4527F, -16.6233F));
		PartDefinition sword_r1 = sword.addOrReplaceChild("sword_r1", CubeListBuilder.create().texOffs(33, 16).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition sword_r2 = sword.addOrReplaceChild("sword_r2", CubeListBuilder.create().texOffs(33, 16).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.6436F, 0.8403F, 0.8727F, 0.0F, 0.0F));
		PartDefinition sword_r3 = sword.addOrReplaceChild("sword_r3", CubeListBuilder.create().texOffs(33, 16).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2813F, 0.2305F, -0.8727F, 0.0F, 0.0F));
		PartDefinition sword_r4 = sword.addOrReplaceChild("sword_r4", CubeListBuilder.create().texOffs(33, 16).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.4561F, 0.9965F, 0.8727F, 0.0F, 0.0F));
		PartDefinition sword_r5 = sword.addOrReplaceChild("sword_r5", CubeListBuilder.create().texOffs(33, 15).addBox(-0.5F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.1396F, 13.1722F, -0.6545F, 0.0F, 0.0F));
		PartDefinition sword_r6 = sword.addOrReplaceChild("sword_r6", CubeListBuilder.create().texOffs(33, 15).addBox(-0.5F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.045F, 13.1722F, 0.6545F, 0.0F, 0.0F));
		PartDefinition left_arm_main_Group = body.addOrReplaceChild("left_arm_main_Group", CubeListBuilder.create(), PartPose.offset(5.6944F, -13.2901F, -0.0688F));
		PartDefinition left_arm = left_arm_main_Group.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(102, 101).addBox(-2.5253F, 1.0928F, -2.1484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(103, 35).addBox(-2.5253F, 1.0928F, -2.2484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition body_r15 = left_arm.addOrReplaceChild("body_r15",
				CubeListBuilder.create().texOffs(51, 103).addBox(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(103, 43).addBox(-2.5F, -1.5F, -2.1F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1739F, 4.4092F, -0.1484F, 0.0F, 0.0F, -0.0436F));
		PartDefinition body_r16 = left_arm.addOrReplaceChild("body_r16",
				CubeListBuilder.create().texOffs(83, 111).addBox(-2.5F, -1.5F, 0.9996F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 103).addBox(-2.5F, -1.5F, -2.3F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0253F, 1.4483F, -0.1187F, 0.0F, 0.0F, 0.1309F));
		PartDefinition down_side_L = left_arm.addOrReplaceChild("down_side_L",
				CubeListBuilder.create().texOffs(36, 81).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 95).addBox(-2.1F, 3.0F, -2.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(109, 21)
						.addBox(-0.9F, 3.0F, -2.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(109, 27).addBox(-2.0F, 3.0F, -1.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 111)
						.addBox(-0.9F, 3.0F, -1.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2466F, 6.4327F, -0.1688F, 0.0F, 3.1416F, 0.0F));
		PartDefinition shield = left_arm.addOrReplaceChild("shield",
				CubeListBuilder.create().texOffs(25, 32).addBox(0.0F, -1.1935F, -6.0F, 0.0F, 2.3869F, 12.0F, new CubeDeformation(0.0F)).texOffs(67, 119).addBox(-0.5F, -1.1935F, -6.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 118)
						.addBox(-0.5F, -1.1935F, 5.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 109).addBox(0.0F, -6.0F, -1.1935F, 0.0F, 12.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(116, 74)
						.addBox(-0.5F, 5.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(97, 78).addBox(-0.5F, -6.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.67F, 10.4327F, -0.0812F));
		PartDefinition shield_r1 = shield.addOrReplaceChild("shield_r1",
				CubeListBuilder.create().texOffs(115, 114).addBox(7.0F, -6.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(78, 116).addBox(7.0F, 5.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(110, 109)
						.addBox(7.5F, -6.0F, -1.1935F, 0.0F, 12.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(26, 118).addBox(7.0F, -1.1935F, 5.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 119)
						.addBox(7.0F, -1.1935F, -6.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 0).addBox(7.5F, -1.1935F, -6.0F, 0.0F, 2.3869F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition shield_r2 = shield.addOrReplaceChild("shield_r2", CubeListBuilder.create().texOffs(92, 116).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.0565F, 0.7854F, 0.0F, 0.0F));
		PartDefinition shield_r3 = shield.addOrReplaceChild("shield_r3",
				CubeListBuilder.create().texOffs(116, 70).addBox(7.0F, 5.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(85, 116).addBox(7.0F, -6.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(100, 109)
						.addBox(7.5F, -6.0F, -1.1935F, 0.0F, 12.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(118, 16).addBox(7.0F, -1.1935F, 5.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 118)
						.addBox(7.0F, -1.1935F, -6.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(7.5F, -1.1935F, -6.0F, 0.0F, 2.3869F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition shield_r4 = shield.addOrReplaceChild("shield_r4", CubeListBuilder.create().texOffs(31, 118).addBox(7.0F, -1.1935F, 5.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(119, 88)
				.addBox(7.0F, -1.1935F, -6.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(7.5F, -1.1935F, -6.0F, 0.0F, 2.3869F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition shield_r5 = shield.addOrReplaceChild("shield_r5", CubeListBuilder.create().texOffs(44, 114).addBox(7.0F, -1.1935F, 5.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 118)
				.addBox(7.0F, -1.1935F, -6.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 17).addBox(7.5F, -1.1935F, -6.0F, 0.0F, 2.3869F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition right_leg = soldier.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 0).addBox(-2.0F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 11)
						.addBox(-1.8F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 84).addBox(-1.8F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 37)
						.addBox(-2.2F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0196F, -12.9525F, 0.0333F, 0.0F, 0.0F, 0.0436F));
		PartDefinition right_leg2 = right_leg
				.addOrReplaceChild(
						"right_leg2", CubeListBuilder.create().texOffs(72, 82).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 0).addBox(-2.0F, 5.0F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
								.texOffs(63, 52).addBox(-1.9001F, 4.9956F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(19, 104).addBox(-2.0999F, 5.0044F, -4.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition right_leg_r1 = right_leg2.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(23, 64).addBox(-4.4493F, -0.3931F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4408F, 4.9273F, -1.3534F, 0.1308F, -0.0057F, -0.0004F));
		PartDefinition right_leg3 = right_leg.addOrReplaceChild("right_leg3", CubeListBuilder.create(), PartPose.offset(-0.1F, 6.0F, -0.1F));
		PartDefinition right_leg_r2 = right_leg3.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(75, 37).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, -0.1F, -1.7695F, 0.2182F, 0.0F, 0.0F));
		PartDefinition right_leg_r3 = right_leg3.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(50, 43).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, 1.0F, -1.6211F, 0.2182F, 0.0F, 0.0F));
		PartDefinition Left_leg = soldier.addOrReplaceChild("Left_leg",
				CubeListBuilder.create().texOffs(86, 59).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(89, 82).addBox(-2.0F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 92)
						.addBox(-1.8F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 93).addBox(-1.8F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 93)
						.addBox(-2.2F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9804F, -12.9525F, 0.0333F, 0.0F, 0.0F, -0.0436F));
		PartDefinition leftleg = Left_leg.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(86, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(-2.0F, 5.0F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(63, 43)
						.addBox(-1.9001F, 5.0044F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(103, 61).addBox(-2.0999F, 4.9956F, -4.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition leg_r1 = leftleg.addOrReplaceChild("leg_r1", CubeListBuilder.create().texOffs(63, 61).addBox(0.4493F, -0.3931F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4291F, 4.9316F, -1.3534F, 0.1308F, 0.0057F, 0.0004F));
		PartDefinition LeftLeg2 = Left_leg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create(), PartPose.offset(-0.1F, 6.0F, -0.1F));
		PartDefinition leg_r2 = LeftLeg2.addOrReplaceChild("leg_r2", CubeListBuilder.create().texOffs(28, 114).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, -0.1F, -1.7695F, 0.2182F, 0.0F, 0.0F));
		PartDefinition leg_r3 = LeftLeg2.addOrReplaceChild("leg_r3", CubeListBuilder.create().texOffs(58, 111).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, 1.0F, -1.6211F, 0.2182F, 0.0F, 0.0F));
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