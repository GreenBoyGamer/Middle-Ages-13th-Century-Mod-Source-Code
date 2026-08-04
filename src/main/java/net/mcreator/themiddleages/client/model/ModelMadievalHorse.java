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
public class ModelMadievalHorse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("the_middle_ages", "model_madieval_horse"), "main");
	public final ModelPart root;
	public final ModelPart horse;
	public final ModelPart back_right_leg;
	public final ModelPart back_right_leg2;
	public final ModelPart head2;
	public final ModelPart Eyes;
	public final ModelPart EyeR;
	public final ModelPart EyeL;
	public final ModelPart mouth;
	public final ModelPart mouth2;
	public final ModelPart leads;
	public final ModelPart LeadL;
	public final ModelPart LeadR;
	public final ModelPart left_ear;
	public final ModelPart left_ear2;
	public final ModelPart neck;
	public final ModelPart mane;
	public final ModelPart mane3;
	public final ModelPart mane5;
	public final ModelPart mane2;
	public final ModelPart mane4;
	public final ModelPart mane6;
	public final ModelPart body2;
	public final ModelPart tail;
	public final ModelPart front_left_leg;
	public final ModelPart front_left_leg2;
	public final ModelPart front_right_leg;
	public final ModelPart front_right_leg2;
	public final ModelPart back_left_leg;
	public final ModelPart back_left_leg2;

	public ModelMadievalHorse(ModelPart root) {
		this.root = root.getChild("root");
		this.horse = this.root.getChild("horse");
		this.back_right_leg = this.horse.getChild("back_right_leg");
		this.back_right_leg2 = this.back_right_leg.getChild("back_right_leg2");
		this.head2 = this.horse.getChild("head2");
		this.Eyes = this.head2.getChild("Eyes");
		this.EyeR = this.Eyes.getChild("EyeR");
		this.EyeL = this.Eyes.getChild("EyeL");
		this.mouth = this.head2.getChild("mouth");
		this.mouth2 = this.mouth.getChild("mouth2");
		this.leads = this.mouth.getChild("leads");
		this.LeadL = this.leads.getChild("LeadL");
		this.LeadR = this.leads.getChild("LeadR");
		this.left_ear = this.head2.getChild("left_ear");
		this.left_ear2 = this.head2.getChild("left_ear2");
		this.neck = this.head2.getChild("neck");
		this.mane = this.head2.getChild("mane");
		this.mane3 = this.head2.getChild("mane3");
		this.mane5 = this.head2.getChild("mane5");
		this.mane2 = this.head2.getChild("mane2");
		this.mane4 = this.head2.getChild("mane4");
		this.mane6 = this.head2.getChild("mane6");
		this.body2 = this.horse.getChild("body2");
		this.tail = this.horse.getChild("tail");
		this.front_left_leg = this.horse.getChild("front_left_leg");
		this.front_left_leg2 = this.front_left_leg.getChild("front_left_leg2");
		this.front_right_leg = this.horse.getChild("front_right_leg");
		this.front_right_leg2 = this.front_right_leg.getChild("front_right_leg2");
		this.back_left_leg = this.horse.getChild("back_left_leg");
		this.back_left_leg2 = this.back_left_leg.getChild("back_left_leg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-2.0F, 23.3333F, 8.6667F));
		PartDefinition horse = root.addOrReplaceChild("horse", CubeListBuilder.create(), PartPose.offset(-2.0F, -9.3333F, -0.6667F));
		PartDefinition back_right_leg = horse.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(222, 230).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition back_right_leg2 = back_right_leg.addOrReplaceChild("back_right_leg2", CubeListBuilder.create().texOffs(226, 135).addBox(-2.0F, -0.2F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 5.2F, 1.0F));
		PartDefinition head2 = horse.addOrReplaceChild("head2",
				CubeListBuilder.create().texOffs(163, 123).addBox(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(183, 246).addBox(-3.1F, -11.1F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(241, 220)
						.addBox(-0.9F, -11.1F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(242, 169).addBox(-3.1F, -10.9F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(243, 130)
						.addBox(-0.9F, -10.9F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -12.0F, -18.0F, 0.3869F, 0.0179F, 0.0237F));
		PartDefinition Eyes = head2.addOrReplaceChild("Eyes", CubeListBuilder.create(), PartPose.offset(-0.007F, -9.5F, 0.5F));
		PartDefinition EyeR = Eyes.addOrReplaceChild("EyeR",
				CubeListBuilder.create().texOffs(167, 53).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(177, 45).addBox(-3.0F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0383F, 0.0F, 0.0F));
		PartDefinition EyeL = Eyes.addOrReplaceChild("EyeL",
				CubeListBuilder.create().texOffs(167, 53).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(177, 45).addBox(-3.0F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0383F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition mouth = head2.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition mouth_r1 = mouth.addOrReplaceChild("mouth_r1",
				CubeListBuilder.create().texOffs(241, 103).addBox(-3.0F, 0.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(177, 207).addBox(-2.8F, 0.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -8.6639F, -3.8771F, 0.3054F, 0.0F, 0.0F));
		PartDefinition mouth_r2 = mouth.addOrReplaceChild("mouth_r2",
				CubeListBuilder.create().texOffs(242, 176).addBox(-3.0F, -2.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(241, 227).addBox(-3.2F, -2.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, -7.9639F, -3.6817F, 0.3054F, 0.0F, 0.0F));
		PartDefinition mouth_r3 = mouth.addOrReplaceChild("mouth_r3", CubeListBuilder.create().texOffs(239, 230).addBox(-3.0F, -2.5F, -0.5F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(239, 159)
				.addBox(-3.2F, -2.5F, -0.5F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 189).addBox(-3.1F, -2.5F, -2.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, -7.8639F, -3.6325F, 0.3054F, 0.0F, 0.0F));
		PartDefinition mouth_r4 = mouth.addOrReplaceChild("mouth_r4",
				CubeListBuilder.create().texOffs(115, 201).addBox(-0.6F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 202).addBox(-0.4F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 200)
						.addBox(-5.6F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(191, 155).addBox(-5.8F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, -6.7192F, -3.2523F, 1.0036F, 0.0F, 0.0F));
		PartDefinition mouth_r5 = mouth.addOrReplaceChild("mouth_r5",
				CubeListBuilder.create().texOffs(173, 176).addBox(-2.9F, 0.5F, -4.0F, 6.0F, -1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(172, 168).addBox(-3.1F, 0.5F, -4.0F, 6.0F, -1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.4768F, 0.0062F, 0.2182F, 0.0F, 0.0F));
		PartDefinition mouth2 = mouth.addOrReplaceChild("mouth2", CubeListBuilder.create(), PartPose.offset(0.0F, -6.4334F, -0.4705F));
		PartDefinition mouth_r6 = mouth2.addOrReplaceChild("mouth_r6", CubeListBuilder.create().texOffs(108, 231).addBox(-3.0F, 0.5F, -2.5F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4306F, -3.162F, 0.3054F, 0.0F, 0.0F));
		PartDefinition leads = mouth.addOrReplaceChild("leads", CubeListBuilder.create(), PartPose.offset(0.0F, -5.9611F, -3.8141F));
		PartDefinition LeadL = leads.addOrReplaceChild("LeadL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3333F, 0.0F, 0.0F, -0.22F, -0.1278F, 0.0285F));
		PartDefinition mouth_r7 = LeadL.addOrReplaceChild("mouth_r7", CubeListBuilder.create().texOffs(106, 169).addBox(-3.1F, -0.1528F, 0.0578F, 1.0F, -1.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7F, 0.0668F, -0.0562F));
		PartDefinition LeadR = leads.addOrReplaceChild("LeadR", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.3054F, 0.0F));
		PartDefinition mouth_r8 = LeadR.addOrReplaceChild("mouth_r8", CubeListBuilder.create().texOffs(141, 136).addBox(-3.1F, -0.1528F, 0.0578F, 1.0F, -1.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7057F, -0.1334F, 0.1129F));
		PartDefinition left_ear = head2.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(140, 189).addBox(-1.0F, -3.25F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, -10.05F, 4.49F, 0.0F, 0.0F, 0.3054F));
		PartDefinition left_ear2 = head2.addOrReplaceChild("left_ear2", CubeListBuilder.create().texOffs(140, 194).addBox(-1.0F, -3.25F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, -10.05F, 4.49F, 0.0F, 0.0F, -0.3054F));
		PartDefinition neck = head2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(215, 50).addBox(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition mane = head2.addOrReplaceChild("mane", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, -3.0F, 5.5273F, 0.1309F, 0.0F, 0.0F));
		PartDefinition mane3 = head2.addOrReplaceChild("mane3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, -3.0F, 5.5273F, 0.1309F, 0.0F, 0.0F));
		PartDefinition mane5 = head2.addOrReplaceChild("mane5",
				CubeListBuilder.create().texOffs(155, 199).addBox(-2.2F, -8.9478F, -1.5034F, 3.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(194, 213).addBox(-0.8F, -8.9478F, -3.5034F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(166, 207).addBox(-0.7F, -8.9478F, -1.5034F, 3.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(192, 196).addBox(-0.7F, -3.9478F, -2.9034F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(140, 199)
						.addBox(-2.2F, -3.9478F, -2.9034F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(98, 200).addBox(-2.2F, -0.9478F, -3.5034F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(197, 148)
						.addBox(-0.7F, -0.9478F, -3.5034F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -3.1F, 5.7273F, 0.1309F, 0.0F, 0.0F));
		PartDefinition mane2 = head2.addOrReplaceChild("mane2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, -7.9572F, 4.8747F, 1.6581F, 0.0F, 0.0F));
		PartDefinition mane4 = head2.addOrReplaceChild("mane4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, -7.9572F, 4.8747F, 1.6581F, 0.0F, 0.0F));
		PartDefinition mane6 = head2.addOrReplaceChild("mane6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -8.0572F, 5.0747F, 1.6581F, 0.0F, 0.0F));
		PartDefinition body2 = horse
				.addOrReplaceChild("body2",
						CubeListBuilder.create().texOffs(6, 198).addBox(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.05F)).texOffs(128, 248).addBox(-1.0F, -4.0F, -17.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.05F))
								.texOffs(241, 108).addBox(0.1F, -4.0F, -17.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(241, 113).addBox(-5.1F, -4.0F, -17.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)),
						PartPose.offset(4.0F, -3.0F, -2.0F));
		PartDefinition body_r1 = body2.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(90, 177).addBox(-0.5F, -1.0F, -2.5F, -1.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(202, 182)
				.addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(184, 155).addBox(-5.7F, -1.0F, -2.5F, 5.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.6F, -10.6466F, -7.3659F, 1.5708F, 0.0F, 0.0F));
		PartDefinition body_r2 = body2.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(45, 168).addBox(-1.5F, -1.0F, -2.5F, 1.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(240, 230)
				.addBox(-0.7266F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)).texOffs(192, 221).addBox(-5.9599F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.8599F, -10.6466F, -4.6992F, 1.5708F, 0.0F, 0.0F));
		PartDefinition body_r3 = body2.addOrReplaceChild("body_r3",
				CubeListBuilder.create().texOffs(183, 21).addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)).texOffs(127, 198).addBox(-5.7333F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.6333F, -10.6466F, -1.3659F, 1.5708F, 0.0F, 0.0F));
		PartDefinition body_r4 = body2.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(65, 163).addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)).texOffs(211, 76).addBox(4.7333F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-4.6F, -3.2466F, -1.3659F, 1.5708F, 0.0F, 0.0F));
		PartDefinition body_r5 = body2.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(181, 119).addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)).texOffs(150, 169).addBox(-5.7333F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.6333F, -3.2466F, -4.6992F, 1.5708F, 0.0F, 0.0F));
		PartDefinition body_r6 = body2.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(109, 173).addBox(-2.5F, -2.0F, -2.5F, 9.0F, 7.0F, -8.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-1.9333F, -10.8466F, -4.6992F, 1.5708F, 0.0F, 0.0F));
		PartDefinition body_r7 = body2.addOrReplaceChild("body_r7",
				CubeListBuilder.create().texOffs(85, 209).addBox(-0.5F, -1.0F, 7.5F, 1.0F, 2.0F, -10.0F, new CubeDeformation(0.05F)).texOffs(21, 175).addBox(-9.7F, -1.0F, 7.5F, 1.0F, 2.0F, -10.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(4.6F, -3.937F, -13.6733F, 0.4363F, 0.0F, 0.0F));
		PartDefinition tail = horse.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(214, 145).addBox(-1.5F, -0.6667F, 0.0F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -10.3333F, 3.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(226, 250).addBox(-1.5F, 1.3706F, -1.7299F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.9983F, 1.5855F, 0.4363F, 0.0F, 0.0F));
		PartDefinition tail_r2 = tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(245, 206).addBox(-1.5F, -1.2875F, -1.3923F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.9983F, 1.5855F, 0.2182F, 0.0F, 0.0F));
		PartDefinition tail_r3 = tail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(162, 248).addBox(-1.5F, -4.8833F, -1.678F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.9983F, 1.5855F, -0.0436F, 0.0F, 0.0F));
		PartDefinition tail_r4 = tail.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(137, 248).addBox(-1.5F, -4.8833F, -1.678F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.7483F, 4.273F, 0.3054F, 0.0F, 0.0F));
		PartDefinition tail_r5 = tail.addOrReplaceChild("tail_r5", CubeListBuilder.create().texOffs(245, 200).addBox(-1.5F, -1.2875F, -1.3923F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.7483F, 4.273F, 0.5672F, 0.0F, 0.0F));
		PartDefinition tail_r6 = tail.addOrReplaceChild("tail_r6", CubeListBuilder.create().texOffs(215, 250).addBox(-1.5F, 1.3706F, -1.7299F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.7483F, 4.273F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tail_r7 = tail.addOrReplaceChild("tail_r7", CubeListBuilder.create().texOffs(245, 212).addBox(-1.5F, 1.3706F, -1.7299F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3147F, 4.7809F, 0.9599F, 0.0F, 0.0F));
		PartDefinition tail_r8 = tail.addOrReplaceChild("tail_r8", CubeListBuilder.create().texOffs(245, 194).addBox(-1.5F, -1.2875F, -1.3923F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3147F, 4.7809F, 0.7418F, 0.0F, 0.0F));
		PartDefinition tail_r9 = tail.addOrReplaceChild("tail_r9", CubeListBuilder.create().texOffs(243, 137).addBox(-1.5F, -4.8833F, -1.6781F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3147F, 4.7809F, 0.48F, 0.0F, 0.0F));
		PartDefinition front_left_leg = horse.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(115, 231).addBox(-3.0F, -1.0F, -1.9F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, -17.0F));
		PartDefinition front_left_leg2 = front_left_leg.addOrReplaceChild("front_left_leg2", CubeListBuilder.create().texOffs(185, 233).addBox(-2.0F, -0.1F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 5.1F, 0.1F));
		PartDefinition front_right_leg = horse.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(149, 231).addBox(-1.0F, -1.0F, -1.9F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -17.0F));
		PartDefinition front_right_leg2 = front_right_leg.addOrReplaceChild("front_right_leg2", CubeListBuilder.create().texOffs(228, 194).addBox(-2.0F, -0.2F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 5.2F, 0.1F));
		PartDefinition back_left_leg = horse.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(203, 231).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));
		PartDefinition back_left_leg2 = back_left_leg.addOrReplaceChild("back_left_leg2", CubeListBuilder.create().texOffs(228, 204).addBox(-2.0F, -0.1F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 5.1F, 1.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}