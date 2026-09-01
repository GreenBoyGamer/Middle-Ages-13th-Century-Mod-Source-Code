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
public class Modeltaskprovider extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("the_middle_ages", "modeltaskprovider"), "main");
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
	public final ModelPart smile_frown;
	public final ModelPart frown_L;
	public final ModelPart frown_R;
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart LeftArm2;
	public final ModelPart LeftArm3;
	public final ModelPart RightArm;
	public final ModelPart RightArm2;
	public final ModelPart RightLeg;
	public final ModelPart RightLeg2;

	public Modeltaskprovider(ModelPart root) {
		super(root);
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
		this.smile_frown = this.mouth.getChild("smile_frown");
		this.frown_L = this.smile_frown.getChild("frown_L");
		this.frown_R = this.smile_frown.getChild("frown_R");
		this.Body = this.Waist.getChild("Body");
		this.LeftArm = this.Waist.getChild("LeftArm");
		this.LeftArm2 = this.LeftArm.getChild("LeftArm2");
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
		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(22, 55).addBox(-2.0117F, -0.1667F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 0).addBox(-2.0117F, 4.8333F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(-1.9766F, 3.8333F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(-2.0766F, 3.8333F, -2.2578F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(-2.022F, 2.5845F, -2.2578F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(-1.922F, 2.5845F, -2.2578F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-2.1117F, 4.8333F, -4.3711F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));
		PartDefinition LeftLeg_r1 = LeftLeg2.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(67, 7).addBox(1.1213F, -0.6075F, 1.6855F, 4.0F, 2.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(67, 7).addBox(1.0213F, -0.6075F, 1.6855F, 1.0F, 2.0F, -2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1309F, 5.1972F, -3.2578F, 0.5668F, 0.0234F, 0.0068F));
		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(), PartPose.offset(-2.4F, 1.0F, 0.0F));
		PartDefinition Head = Waist.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 11).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(6, 18).addBox(-4.5F, -3.75F, -1.25F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 47)
						.addBox(-4.25F, -8.3333F, 0.0156F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(27, 47).addBox(0.25F, -8.3333F, 0.0156F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 46)
						.addBox(-4.25F, -8.3333F, -4.0234F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 46).addBox(0.25F, -8.3333F, -4.0234F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 43)
						.addBox(-4.25F, -7.0F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(75, 37).addBox(-3.0F, -7.0F, 3.1F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 45)
						.addBox(0.2719F, -7.0F, 3.1F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 30).addBox(-4.25F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 70)
						.addBox(3.2833F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 43).addBox(3.2833F, -7.0F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 43)
						.addBox(-4.25F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 43).addBox(3.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));
		PartDefinition Head_r1 = Head
				.addOrReplaceChild(
						"Head_r1", CubeListBuilder.create().texOffs(35, 50).addBox(0.8579F, -3.3341F, 2.5702F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50)
								.addBox(0.5188F, -1.1635F, 2.8552F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.9806F, -3.2862F, 3.0751F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.8346F, -1.355F, -1.7868F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.9277F, -3.7188F, -1.1324F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.9424F, -3.6018F, -0.6242F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.0102F, -1.3324F, -0.8031F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(35, 50).addBox(0.5845F, -1.2198F, 2.0702F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.6601F, -1.355F, -1.9177F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(35, 50).addBox(0.7477F, -1.6524F, 2.2782F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.9655F, -1.355F, -1.9177F));
		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8055F, -0.488F, 3.5836F, -0.1219F, -0.0459F, -0.211F));
		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(35, 50).addBox(0.1272F, 1.1855F, 3.2923F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -1.4257F, 4.0252F, 1.6601F, -1.355F, -1.7868F));
		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(35, 50).addBox(0.2383F, 1.3091F, 1.3246F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -1.4257F, 4.0252F, 1.9072F, -1.3135F, -1.6865F));
		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(35, 50).addBox(0.231F, 1.033F, 0.1132F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -1.4257F, 4.0252F, 1.9664F, -1.3999F, -1.7444F));
		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(35, 50).addBox(0.639F, -1.0725F, 0.676F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6151F, 0.9519F, 3.9404F, 1.4489F, -1.3534F, -1.4043F));
		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(35, 50).addBox(0.337F, -0.7668F, -1.6515F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6151F, 0.9519F, 3.9404F, 1.44F, -1.3968F, -1.4395F));
		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(35, 50).addBox(0.337F, -0.7668F, -1.6515F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3691F, 0.2878F, 3.9404F, 1.3963F, -1.4399F, -1.3963F));
		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(35, 50).addBox(0.3487F, -1.0808F, -0.3844F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3691F, 0.2878F, 3.9404F, 1.3963F, -1.4399F, -1.2654F));
		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(35, 50).addBox(0.639F, -1.0725F, 0.676F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3691F, 0.2878F, 3.9404F, 1.4072F, -1.3963F, -1.3635F));
		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(35, 50).addBox(0.2034F, 0.7476F, -1.0626F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -1.6757F, 4.1252F, 1.1411F, -1.3324F, -0.8031F));
		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(35, 50).addBox(0.231F, 1.033F, 0.1132F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -1.6757F, 4.1252F, 1.9664F, -1.3999F, -1.7444F));
		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(35, 50).addBox(0.2383F, 1.3091F, 1.3246F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -1.6757F, 4.1252F, 1.9072F, -1.3135F, -1.6865F));
		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(35, 50).addBox(0.1272F, 1.1855F, 3.2923F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -1.6757F, 4.1252F, 1.6601F, -1.355F, -1.7868F));
		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(35, 50).addBox(0.1272F, 1.1855F, 3.2923F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -2.6757F, 4.1252F, 1.6601F, -1.355F, -1.7868F));
		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(35, 50).addBox(0.2383F, 1.3091F, 1.3246F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -2.6757F, 4.1252F, 1.9072F, -1.3135F, -1.6865F));
		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(35, 50).addBox(0.231F, 1.033F, 0.1132F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -2.6757F, 4.1252F, 1.9664F, -1.3999F, -1.7444F));
		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(35, 50).addBox(0.2034F, 0.7476F, -1.0626F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -2.6757F, 4.1252F, 1.1411F, -1.3324F, -0.8031F));
		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(35, 50).addBox(0.639F, -1.0725F, 0.676F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3691F, -0.7122F, 3.9404F, 1.4072F, -1.3963F, -1.3635F));
		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(35, 50).addBox(0.3487F, -1.0808F, -0.3844F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3691F, -0.7122F, 3.9404F, 1.3963F, -1.4399F, -1.2654F));
		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(35, 50).addBox(0.337F, -0.7668F, -1.6515F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3691F, -0.7122F, 3.9404F, 1.3963F, -1.4399F, -1.3963F));
		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(35, 50).addBox(0.337F, -0.7668F, -1.6515F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6151F, -0.0481F, 3.9404F, 1.44F, -1.3968F, -1.4395F));
		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(35, 50).addBox(0.639F, -1.0725F, 0.676F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6151F, -0.0481F, 3.9404F, 1.4489F, -1.3534F, -1.4043F));
		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(35, 50).addBox(0.231F, 1.033F, 0.1132F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -2.4257F, 4.0252F, 1.9664F, -1.3999F, -1.7444F));
		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(35, 50).addBox(0.2383F, 1.3091F, 1.3246F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -2.4257F, 4.0252F, 1.9072F, -1.3135F, -1.6865F));
		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(35, 50).addBox(0.1272F, 1.1855F, 3.2923F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -2.4257F, 4.0252F, 1.6601F, -1.355F, -1.7868F));
		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8055F, -1.488F, 3.5836F, -0.1219F, -0.0459F, -0.211F));
		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.1272F, 1.1855F, 3.2923F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.589F, -0.9431F, 3.1402F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.6601F, -1.355F, -1.7868F));
		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.2903F, 1.0091F, 2.7205F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.7522F, -1.0668F, 3.2156F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.9655F, -1.355F, -1.7868F));
		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.2383F, 1.3091F, 1.3246F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.9179F, -1.3287F, 1.6059F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.9072F, -1.3135F, -1.6865F));
		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(35, 50).addBox(0.7547F, -0.7088F, 1.5263F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.6018F, -1.3135F, -1.6865F));
		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.231F, 1.033F, 0.1132F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.6784F, -1.6519F, 0.4122F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.9664F, -1.3999F, -1.7444F));
		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(35, 50).addBox(0.5153F, -0.6582F, 0.2906F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.6609F, -1.3999F, -1.7444F));
		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.2034F, 0.7476F, -1.0627F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.714F, -1.8626F, -0.4108F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.1411F, -1.3324F, -0.8031F));
		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(35, 50).addBox(0.5509F, -0.6116F, -0.5576F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 0.8357F, -1.3324F, -0.8031F));
		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(35, 50).addBox(0.337F, -0.7668F, -1.6515F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3691F, -2.7122F, 3.9404F, 1.3963F, -1.4399F, -1.3963F));
		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(35, 50).addBox(0.3487F, -1.0808F, -0.3844F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3691F, -2.7122F, 3.9404F, 1.3963F, -1.4399F, -1.2654F));
		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(35, 50).addBox(0.639F, -1.0725F, 0.676F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3691F, -2.7122F, 3.9404F, 1.4072F, -1.3963F, -1.3635F));
		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(35, 50).addBox(0.639F, -1.0725F, 0.676F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6151F, -2.0481F, 3.9404F, 1.4489F, -1.3534F, -1.4043F));
		PartDefinition Head_r43 = Head.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(35, 50).addBox(0.3487F, -1.0808F, -0.3844F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6151F, -2.0481F, 3.9404F, 1.4725F, -1.3978F, -1.3408F));
		PartDefinition Head_r44 = Head.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(35, 50).addBox(0.337F, -0.7668F, -1.6515F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6151F, -2.0481F, 3.9404F, 1.44F, -1.3968F, -1.4395F));
		PartDefinition Head_r45 = Head.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(35, 50).addBox(0.5095F, -0.425F, -1.7349F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.4072F, -1.3963F, -1.538F));
		PartDefinition Head_r46 = Head.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(35, 50).addBox(0.6726F, -2.0387F, -1.5898F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.7127F, -1.3963F, -1.538F));
		PartDefinition Head_r47 = Head.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(35, 50).addBox(0.262F, -0.638F, -2.843F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.3963F, -1.4399F, -1.4399F));
		PartDefinition Head_r48 = Head.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(35, 50).addBox(0.4251F, -2.5749F, -2.5825F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.7017F, -1.4399F, -1.4399F));
		PartDefinition Head_r49 = Head.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(35, 50).addBox(0.2077F, -0.01F, -4.0304F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.3963F, -1.4399F, -1.5708F));
		PartDefinition Head_r50 = Head.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(35, 50).addBox(0.3709F, -2.333F, -3.9038F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.7017F, -1.4399F, -1.5708F));
		PartDefinition Head_r51 = Head.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(35, 50).addBox(0.5993F, -3.6124F, -4.1487F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.5708F, -1.4399F, -1.5708F));
		PartDefinition Head_r52 = Head.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(35, 50).addBox(0.6536F, -4.0247F, -2.8703F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.5708F, -1.4399F, -1.4399F));
		PartDefinition Head_r53 = Head.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(35, 50).addBox(0.9011F, -3.6226F, -1.816F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.5818F, -1.3963F, -1.538F));
		PartDefinition Head_r54 = Head.addOrReplaceChild("Head_r54",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.7917F, -3.5649F, -0.2855F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.9068F, -3.5005F, 0.2193F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.8355F, -1.3999F, -1.7444F));
		PartDefinition Head_r55 = Head.addOrReplaceChild("Head_r55",
				CubeListBuilder.create().texOffs(35, 50).addBox(1.0331F, -3.4089F, 0.9409F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(1.1463F, -3.3358F, 1.4449F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.7763F, -1.3135F, -1.6865F));
		PartDefinition Head_r56 = Head.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(35, 50).addBox(0.9761F, -3.7445F, 2.0693F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1051F, -4.4257F, 4.0252F, 1.8346F, -1.355F, -1.9177F));
		PartDefinition Head_r57 = Head
				.addOrReplaceChild(
						"Head_r57", CubeListBuilder.create().texOffs(35, 50).addBox(0.9806F, -3.2862F, 3.0751F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50)
								.addBox(0.5188F, -1.1635F, 2.8552F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.8579F, -3.3341F, 2.5703F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.8346F, -1.355F, -1.7868F));
		PartDefinition Head_r58 = Head.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(35, 50).addBox(0.9761F, -3.7445F, 2.0693F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.8346F, -1.355F, -1.9177F));
		PartDefinition Head_r59 = Head.addOrReplaceChild("Head_r59",
				CubeListBuilder.create().texOffs(35, 50).addBox(1.1463F, -3.3357F, 1.4449F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(1.0331F, -3.4089F, 0.9409F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.7763F, -1.3135F, -1.6865F));
		PartDefinition Head_r60 = Head.addOrReplaceChild("Head_r60",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.9068F, -3.5005F, 0.2193F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.7917F, -3.5649F, -0.2855F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.8355F, -1.3999F, -1.7444F));
		PartDefinition Head_r61 = Head.addOrReplaceChild("Head_r61",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.9424F, -3.6018F, -0.6242F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.9277F, -3.7188F, -1.1324F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.0102F, -1.3324F, -0.8031F));
		PartDefinition Head_r62 = Head.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(35, 50).addBox(0.9011F, -3.6226F, -1.816F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.5818F, -1.3963F, -1.538F));
		PartDefinition Head_r63 = Head.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(35, 50).addBox(0.6536F, -4.0247F, -2.8703F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.5708F, -1.4399F, -1.4399F));
		PartDefinition Head_r64 = Head.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(35, 50).addBox(0.5993F, -3.6124F, -4.1487F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.5708F, -1.4399F, -1.5708F));
		PartDefinition Head_r65 = Head.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(35, 50).addBox(0.3709F, -2.333F, -3.9038F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.7017F, -1.4399F, -1.5708F));
		PartDefinition Head_r66 = Head.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(35, 50).addBox(0.2077F, -0.01F, -4.0304F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.3963F, -1.4399F, -1.5708F));
		PartDefinition Head_r67 = Head.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(35, 50).addBox(0.4251F, -2.5749F, -2.5825F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.7017F, -1.4399F, -1.4399F));
		PartDefinition Head_r68 = Head.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(35, 50).addBox(0.262F, -0.638F, -2.843F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.3963F, -1.4399F, -1.4399F));
		PartDefinition Head_r69 = Head.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(35, 50).addBox(0.6726F, -2.0387F, -1.5898F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.7127F, -1.3963F, -1.538F));
		PartDefinition Head_r70 = Head.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(35, 50).addBox(0.5095F, -0.425F, -1.7349F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.4072F, -1.3963F, -1.538F));
		PartDefinition Head_r71 = Head.addOrReplaceChild("Head_r71",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.714F, -1.8626F, -0.4108F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.2034F, 0.7476F, -1.0626F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.1411F, -1.3324F, -0.8031F));
		PartDefinition Head_r72 = Head.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(35, 50).addBox(0.5509F, -0.6116F, -0.5576F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 0.8357F, -1.3324F, -0.8031F));
		PartDefinition Head_r73 = Head.addOrReplaceChild("Head_r73",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.6784F, -1.6519F, 0.4122F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.231F, 1.033F, 0.1132F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.9664F, -1.3999F, -1.7444F));
		PartDefinition Head_r74 = Head.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(35, 50).addBox(0.5153F, -0.6582F, 0.2906F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.6609F, -1.3999F, -1.7444F));
		PartDefinition Head_r75 = Head.addOrReplaceChild("Head_r75",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.9179F, -1.3287F, 1.6059F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.2383F, 1.3091F, 1.3246F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.9072F, -1.3135F, -1.6865F));
		PartDefinition Head_r76 = Head.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(35, 50).addBox(0.7547F, -0.7088F, 1.5263F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.6018F, -1.3135F, -1.6865F));
		PartDefinition Head_r77 = Head.addOrReplaceChild("Head_r77",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.7522F, -1.0668F, 3.2156F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.2903F, 1.0091F, 2.7205F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.9655F, -1.355F, -1.7868F));
		PartDefinition Head_r78 = Head.addOrReplaceChild("Head_r78",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.589F, -0.9431F, 3.1402F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.1272F, 1.1855F, 3.2923F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.6601F, -1.355F, -1.7868F));
		PartDefinition Head_r79 = Head.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(35, 50).addBox(0.7477F, -1.6524F, 2.2782F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.9655F, -1.355F, -1.9177F));
		PartDefinition Head_r80 = Head.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(35, 50).addBox(0.5845F, -1.2198F, 2.0702F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3551F, -4.6757F, 4.1252F, 1.6601F, -1.355F, -1.9177F));
		PartDefinition Head_r81 = Head.addOrReplaceChild("Head_r81",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.9277F, -3.7188F, -1.1324F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.9424F, -3.6018F, -0.6242F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2949F, -4.6757F, -3.8748F, -2.1314F, 1.3324F, -2.3385F));
		PartDefinition Head_r82 = Head
				.addOrReplaceChild(
						"Head_r82", CubeListBuilder.create().texOffs(35, 50).addBox(0.8579F, -3.3341F, 2.5703F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50)
								.addBox(0.5188F, -1.1635F, 2.8552F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.9806F, -3.2862F, 3.0751F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.2949F, -4.6757F, -3.8748F, -1.307F, 1.355F, -1.3548F));
		PartDefinition Head_r83 = Head.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(35, 50).addBox(0.9761F, -3.7445F, 2.0693F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -3.5507F, -3.8748F, -1.307F, 1.355F, -1.2239F));
		PartDefinition Head_r84 = Head.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(35, 50).addBox(1.1463F, -3.3358F, 1.4449F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -2.5507F, -3.8748F, -1.3653F, 1.3135F, -1.4551F));
		PartDefinition Head_r85 = Head.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(35, 50).addBox(1.1463F, -3.3358F, 1.4449F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -3.5507F, -3.8748F, -1.3653F, 1.3135F, -1.4551F));
		PartDefinition Head_r86 = Head.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(35, 50).addBox(0.9068F, -3.5005F, 0.2193F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -2.5507F, -3.8748F, -1.3061F, 1.3999F, -1.3972F));
		PartDefinition Head_r87 = Head.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(35, 50).addBox(0.9068F, -3.5005F, 0.2193F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -3.5507F, -3.8748F, -1.3061F, 1.3999F, -1.3972F));
		PartDefinition Head_r88 = Head.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(35, 50).addBox(0.9424F, -3.6018F, -0.6242F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -2.5507F, -3.8748F, -2.1314F, 1.3324F, -2.3385F));
		PartDefinition Head_r89 = Head.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(35, 50).addBox(0.9424F, -3.6018F, -0.6242F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -3.5507F, -3.8748F, -2.1314F, 1.3324F, -2.3385F));
		PartDefinition Head_r90 = Head.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(35, 50).addBox(0.901F, -3.6226F, -1.816F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -2.5507F, -3.8748F, -1.5598F, 1.3963F, -1.6036F));
		PartDefinition Head_r91 = Head.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(35, 50).addBox(0.901F, -3.6226F, -1.816F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -3.5507F, -3.8748F, -1.5598F, 1.3963F, -1.6036F));
		PartDefinition Head_r92 = Head.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(35, 50).addBox(0.6536F, -4.0247F, -2.8703F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -3.5507F, -3.8748F, -1.5708F, 1.4399F, -1.7017F));
		PartDefinition Head_r93 = Head.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(35, 50).addBox(0.5993F, -3.6124F, -4.1487F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7051F, -3.5507F, -3.8748F, -1.5708F, 1.4399F, -1.5708F));
		PartDefinition Head_r94 = Head.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(35, 50).addBox(0.5993F, -3.6124F, -4.1487F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2949F, -4.6757F, -3.8748F, -1.5708F, 1.4399F, -1.5708F));
		PartDefinition Head_r95 = Head.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(35, 50).addBox(0.6536F, -4.0247F, -2.8703F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2949F, -4.6757F, -3.8748F, -1.5708F, 1.4399F, -1.7017F));
		PartDefinition Head_r96 = Head.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(35, 50).addBox(0.9011F, -3.6226F, -1.816F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2949F, -4.6757F, -3.8748F, -1.5598F, 1.3963F, -1.6036F));
		PartDefinition Head_r97 = Head.addOrReplaceChild("Head_r97",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.7917F, -3.5649F, -0.2855F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.9068F, -3.5005F, 0.2193F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2949F, -4.6757F, -3.8748F, -1.3061F, 1.3999F, -1.3972F));
		PartDefinition Head_r98 = Head.addOrReplaceChild("Head_r98",
				CubeListBuilder.create().texOffs(35, 50).addBox(1.0331F, -3.4089F, 0.941F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(1.1463F, -3.3357F, 1.4449F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2949F, -4.6757F, -3.8748F, -1.3653F, 1.3135F, -1.4551F));
		PartDefinition Head_r99 = Head.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(35, 50).addBox(0.9761F, -3.7445F, 2.0693F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2949F, -4.6757F, -3.8748F, -1.307F, 1.355F, -1.2239F));
		PartDefinition Head_r100 = Head.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(35, 50).addBox(0.589F, -0.9431F, 3.1402F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, 3.0197F, 0.0459F, -2.9306F));
		PartDefinition Head_r101 = Head.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(35, 50).addBox(0.7522F, -1.0668F, 3.2156F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -2.958F, 0.0459F, -2.9306F));
		PartDefinition Head_r102 = Head.addOrReplaceChild("Head_r102",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.9806F, -3.2862F, 3.0751F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.5187F, -1.1635F, 2.8552F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -3.0889F, 0.0459F, -2.9306F));
		PartDefinition Head_r103 = Head.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(35, 50).addBox(0.9761F, -3.7445F, 2.0693F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, 3.0659F, 0.0729F, -2.9383F));
		PartDefinition Head_r104 = Head.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(35, 50).addBox(0.7477F, -1.6524F, 2.2782F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -3.0863F, 0.0729F, -2.9383F));
		PartDefinition Head_r105 = Head.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(35, 50).addBox(0.5845F, -1.2198F, 2.0702F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, 2.8914F, 0.0729F, -2.9383F));
		PartDefinition Head_r106 = Head.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(35, 50).addBox(0.262F, -0.638F, -2.843F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -1.4257F, 1.3752F, 3.0969F, -0.017F, -3.0118F));
		PartDefinition Head_r107 = Head.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(35, 50).addBox(0.5095F, -0.425F, -1.7349F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -1.4257F, 1.3752F, 3.0103F, -0.0057F, -2.9672F));
		PartDefinition Head_r108 = Head.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9867F, -0.3175F, 1.5546F, -3.1019F, -0.1609F, -3.1011F));
		PartDefinition Head_r109 = Head.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(35, 50).addBox(0.5509F, -0.6116F, -0.5576F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -1.4257F, 1.3752F, -3.1234F, -0.1647F, -2.9685F));
		PartDefinition Head_r110 = Head.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(35, 50).addBox(0.5153F, -0.6582F, 0.2906F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -1.4257F, 1.3752F, 3.0607F, 0.0294F, -2.9732F));
		PartDefinition Head_r111 = Head.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(35, 50).addBox(0.7547F, -0.7088F, 1.5263F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -1.4257F, 1.3752F, 3.0607F, 0.0294F, -2.886F));
		PartDefinition Head_r112 = Head.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9867F, 0.1825F, -0.9454F, -3.1019F, -0.1609F, -3.1011F));
		PartDefinition Head_r113 = Head.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9867F, -0.8175F, -2.1954F, -3.1019F, -0.1609F, -3.1011F));
		PartDefinition Head_r114 = Head.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(35, 50).addBox(0.7547F, -0.7088F, 1.5263F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -2.4257F, 0.1252F, 3.0607F, 0.0294F, -2.886F));
		PartDefinition Head_r115 = Head.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(35, 50).addBox(0.5153F, -0.6582F, 0.2906F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -2.4257F, 0.1252F, 3.0607F, 0.0294F, -2.9732F));
		PartDefinition Head_r116 = Head.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(35, 50).addBox(0.5509F, -0.6116F, -0.5576F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -2.4257F, 0.1252F, -3.1234F, -0.1647F, -2.9685F));
		PartDefinition Head_r117 = Head.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9867F, -1.3175F, 0.3046F, -3.1019F, -0.1609F, -3.1011F));
		PartDefinition Head_r118 = Head.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(35, 50).addBox(0.5095F, -0.425F, -1.7349F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -2.4257F, 0.1252F, 3.0103F, -0.0057F, -2.9672F));
		PartDefinition Head_r119 = Head.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(35, 50).addBox(0.262F, -0.638F, -2.843F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -2.4257F, 0.1252F, 3.0969F, -0.017F, -3.0118F));
		PartDefinition Head_r120 = Head.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(35, 50).addBox(0.262F, -0.638F, -2.843F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -3.6757F, 0.6252F, 3.0969F, -0.017F, -3.0118F));
		PartDefinition Head_r121 = Head.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(35, 50).addBox(0.5095F, -0.425F, -1.7349F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -3.6757F, 0.6252F, 3.0103F, -0.0057F, -2.9672F));
		PartDefinition Head_r122 = Head.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9867F, -2.5675F, 0.8046F, -3.1019F, -0.1609F, -3.1011F));
		PartDefinition Head_r123 = Head.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(35, 50).addBox(0.5509F, -0.6116F, -0.5576F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -3.6757F, 0.6252F, -3.1234F, -0.1647F, -2.9685F));
		PartDefinition Head_r124 = Head.addOrReplaceChild("Head_r124", CubeListBuilder.create().texOffs(35, 50).addBox(0.5153F, -0.6582F, 0.2906F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -3.6757F, 0.6252F, 3.0607F, 0.0294F, -2.9732F));
		PartDefinition Head_r125 = Head.addOrReplaceChild("Head_r125", CubeListBuilder.create().texOffs(35, 50).addBox(0.7547F, -0.7088F, 1.5263F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -3.6757F, 0.6252F, 3.0607F, 0.0294F, -2.886F));
		PartDefinition Head_r126 = Head.addOrReplaceChild("Head_r126", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9867F, -2.0675F, -1.6954F, -3.1019F, -0.1609F, -3.1011F));
		PartDefinition Head_r127 = Head.addOrReplaceChild("Head_r127", CubeListBuilder.create().texOffs(35, 50).addBox(0.7547F, -0.7088F, 1.5263F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, 3.0607F, 0.0294F, -2.886F));
		PartDefinition Head_r128 = Head.addOrReplaceChild("Head_r128", CubeListBuilder.create().texOffs(35, 50).addBox(0.9179F, -1.3287F, 1.6058F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -2.9171F, 0.0294F, -2.886F));
		PartDefinition Head_r129 = Head.addOrReplaceChild("Head_r129",
				CubeListBuilder.create().texOffs(35, 50).addBox(1.1463F, -3.3357F, 1.4449F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(1.033F, -3.4089F, 0.9409F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -3.048F, 0.0294F, -2.886F));
		PartDefinition Head_r130 = Head.addOrReplaceChild("Head_r130",
				CubeListBuilder.create().texOffs(35, 50).addBox(0.9068F, -3.5005F, 0.2193F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 50).addBox(0.7917F, -3.5649F, -0.2855F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -3.048F, 0.0294F, -2.9732F));
		PartDefinition Head_r131 = Head.addOrReplaceChild("Head_r131", CubeListBuilder.create().texOffs(35, 50).addBox(0.9424F, -3.6018F, -0.6242F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -2.9489F, -0.1647F, -2.9685F));
		PartDefinition Head_r132 = Head.addOrReplaceChild("Head_r132", CubeListBuilder.create().texOffs(35, 50).addBox(0.714F, -1.8626F, -0.4108F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -2.818F, -0.1647F, -2.9685F));
		PartDefinition Head_r133 = Head.addOrReplaceChild("Head_r133", CubeListBuilder.create().texOffs(35, 50).addBox(0.6784F, -1.6519F, 0.4122F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -2.9171F, 0.0294F, -2.9732F));
		PartDefinition Head_r134 = Head.addOrReplaceChild("Head_r134", CubeListBuilder.create().texOffs(35, 50).addBox(0.5153F, -0.6582F, 0.2906F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, 3.0607F, 0.0294F, -2.9732F));
		PartDefinition Head_r135 = Head.addOrReplaceChild("Head_r135", CubeListBuilder.create().texOffs(35, 50).addBox(0.5509F, -0.6116F, -0.5576F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -3.1234F, -0.1647F, -2.9685F));
		PartDefinition Head_r136 = Head.addOrReplaceChild("Head_r136", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9867F, -3.0675F, -2.1954F, -3.1019F, -0.1609F, -3.1011F));
		PartDefinition Head_r137 = Head.addOrReplaceChild("Head_r137", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9867F, -3.5675F, 0.3046F, -3.1019F, -0.1609F, -3.1011F));
		PartDefinition Head_r138 = Head.addOrReplaceChild("Head_r138", CubeListBuilder.create().texOffs(35, 50).addBox(0.5095F, -0.425F, -1.7349F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, 3.0103F, -0.0057F, -2.9672F));
		PartDefinition Head_r139 = Head.addOrReplaceChild("Head_r139", CubeListBuilder.create().texOffs(35, 50).addBox(0.6726F, -2.0387F, -1.5898F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -2.9674F, -0.0057F, -2.9672F));
		PartDefinition Head_r140 = Head.addOrReplaceChild("Head_r140", CubeListBuilder.create().texOffs(35, 50).addBox(0.901F, -3.6226F, -1.816F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -3.0983F, -0.0057F, -2.9672F));
		PartDefinition Head_r141 = Head.addOrReplaceChild("Head_r141", CubeListBuilder.create().texOffs(35, 50).addBox(0.6536F, -4.0247F, -2.8703F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -3.0118F, -0.017F, -3.0118F));
		PartDefinition Head_r142 = Head.addOrReplaceChild("Head_r142", CubeListBuilder.create().texOffs(35, 50).addBox(0.4251F, -2.5749F, -2.5825F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -2.8809F, -0.017F, -3.0118F));
		PartDefinition Head_r143 = Head.addOrReplaceChild("Head_r143", CubeListBuilder.create().texOffs(35, 50).addBox(0.262F, -0.638F, -2.843F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, 3.0969F, -0.017F, -3.0118F));
		PartDefinition Head_r144 = Head.addOrReplaceChild("Head_r144", CubeListBuilder.create().texOffs(35, 50).addBox(0.3709F, -2.333F, -3.9038F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, -3.0107F, 0.0F, -3.0107F));
		PartDefinition Head_r145 = Head.addOrReplaceChild("Head_r145", CubeListBuilder.create().texOffs(35, 50).addBox(0.2077F, -0.01F, -4.0304F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, 2.9671F, 0.0F, -3.0107F));
		PartDefinition Head_r146 = Head.addOrReplaceChild("Head_r146", CubeListBuilder.create().texOffs(35, 50).addBox(0.5993F, -3.6124F, -4.1487F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9551F, -4.6757F, 0.1252F, 3.1416F, 0.0F, -3.0107F));
		PartDefinition Head_r147 = Head.addOrReplaceChild("Head_r147", CubeListBuilder.create().texOffs(35, 50).addBox(0.8579F, -3.3341F, 2.5703F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2051F, -4.6757F, 0.1252F, -3.0889F, 0.0459F, -2.9306F));
		PartDefinition Head_r148 = Head.addOrReplaceChild("Head_r148", CubeListBuilder.create().texOffs(35, 50).addBox(0.9277F, -3.7188F, -1.1324F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2051F, -4.6757F, 0.1252F, -2.9489F, -0.1647F, -2.9685F));
		PartDefinition Head_r149 = Head.addOrReplaceChild("Head_r149", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0555F, -3.488F, 3.5836F, 0.0527F, -0.0459F, -0.211F));
		PartDefinition Head_r150 = Head.addOrReplaceChild("Head_r150", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8055F, -3.488F, 3.5836F, 0.1836F, -0.0459F, -0.211F));
		PartDefinition Head_r151 = Head.addOrReplaceChild("Head_r151", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8055F, -3.488F, 3.5836F, -0.1219F, -0.0459F, -0.211F));
		PartDefinition Head_r152 = Head.addOrReplaceChild("Head_r152", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8055F, -5.6677F, 3.7125F, -0.1219F, -0.0459F, -0.211F));
		PartDefinition Head_r153 = Head.addOrReplaceChild("Head_r153", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8055F, -5.6677F, 3.7125F, 0.1836F, -0.0459F, -0.211F));
		PartDefinition Head_r154 = Head.addOrReplaceChild("Head_r154", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9539F, -5.6677F, 3.2008F, 0.0527F, -0.0459F, -0.211F));
		PartDefinition Head_r155 = Head.addOrReplaceChild("Head_r155", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9141F, -5.7732F, 1.5328F, 0.0936F, -0.0294F, -0.2556F));
		PartDefinition Head_r156 = Head.addOrReplaceChild("Head_r156", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8008F, -5.7732F, 0.2906F, 0.0936F, -0.0294F, -0.1684F));
		PartDefinition Head_r157 = Head.addOrReplaceChild("Head_r157", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0508F, -5.7732F, -0.7094F, 0.1927F, 0.1647F, -0.1731F));
		PartDefinition Head_r158 = Head.addOrReplaceChild("Head_r158", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8055F, -5.6677F, 3.7125F, 0.0527F, -0.0459F, -0.211F));
		PartDefinition Head_r159 = Head.addOrReplaceChild("Head_r159", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7625F, -5.7263F, 2.8453F, -0.0757F, -0.0729F, -0.2033F));
		PartDefinition Head_r160 = Head.addOrReplaceChild("Head_r160", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0125F, -5.7263F, 2.8453F, 0.0552F, -0.0729F, -0.2033F));
		PartDefinition Head_r161 = Head.addOrReplaceChild("Head_r161", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -3.0232F, -1.1898F, -0.1313F, 0.0057F, -0.1744F));
		PartDefinition Head_r162 = Head.addOrReplaceChild("Head_r162", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4732F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0125F, -2.9763F, 2.8453F, -0.2502F, -0.0729F, -0.2033F));
		PartDefinition Head_r163 = Head.addOrReplaceChild("Head_r163", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0156F, -3.0232F, 2.0445F, -0.0809F, -0.0294F, -0.2556F));
		PartDefinition Head_r164 = Head.addOrReplaceChild("Head_r164", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -3.0232F, 0.8023F, -0.0809F, -0.0294F, -0.1684F));
		PartDefinition Head_r165 = Head.addOrReplaceChild("Head_r165", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -3.0232F, -0.1977F, 0.0182F, 0.1647F, -0.1731F));
		PartDefinition Head_r166 = Head.addOrReplaceChild("Head_r166", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -0.3005F, 0.0953F, 0.3236F, 0.1647F, -0.1731F));
		PartDefinition Head_r167 = Head.addOrReplaceChild("Head_r167", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -0.3005F, 1.0953F, 0.2245F, -0.0294F, -0.1684F));
		PartDefinition Head_r168 = Head.addOrReplaceChild("Head_r168", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0156F, -0.3005F, 2.3375F, 0.2245F, -0.0294F, -0.2556F));
		PartDefinition Head_r169 = Head.addOrReplaceChild("Head_r169", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0156F, -2.0505F, 3.0875F, 0.2245F, -0.0294F, -0.2556F));
		PartDefinition Head_r170 = Head.addOrReplaceChild("Head_r170", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -2.0505F, 1.8453F, 0.2245F, -0.0294F, -0.1684F));
		PartDefinition Head_r171 = Head.addOrReplaceChild("Head_r171", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -2.0505F, 0.8453F, 0.3236F, 0.1647F, -0.1731F));
		PartDefinition Head_r172 = Head.addOrReplaceChild("Head_r172", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -4.7732F, 0.5523F, 0.0182F, 0.1647F, -0.1731F));
		PartDefinition Head_r173 = Head.addOrReplaceChild("Head_r173", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -4.7732F, 1.5523F, -0.0809F, -0.0294F, -0.1684F));
		PartDefinition Head_r174 = Head.addOrReplaceChild("Head_r174", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0156F, -4.7732F, 2.7945F, -0.0809F, -0.0294F, -0.2556F));
		PartDefinition Head_r175 = Head.addOrReplaceChild("Head_r175", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4732F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0125F, -4.7263F, 3.5953F, -0.2502F, -0.0729F, -0.2033F));
		PartDefinition Head_r176 = Head.addOrReplaceChild("Head_r176", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -4.7732F, -0.4398F, -0.1313F, 0.0057F, -0.1744F));
		PartDefinition Head_r177 = Head.addOrReplaceChild("Head_r177", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4732F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0125F, -5.7263F, 2.8453F, -0.2502F, -0.0729F, -0.2033F));
		PartDefinition Head_r178 = Head.addOrReplaceChild("Head_r178", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0156F, -5.7732F, 2.0445F, -0.0809F, -0.0294F, -0.2556F));
		PartDefinition Head_r179 = Head.addOrReplaceChild("Head_r179", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -3.0505F, 1.0953F, 0.2245F, -0.0294F, -0.1684F));
		PartDefinition Head_r180 = Head.addOrReplaceChild("Head_r180", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -3.0505F, 0.0953F, 0.3236F, 0.1647F, -0.1731F));
		PartDefinition Head_r181 = Head.addOrReplaceChild("Head_r181", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0156F, -3.0505F, 2.3375F, 0.2245F, -0.0294F, -0.2556F));
		PartDefinition Head_r182 = Head.addOrReplaceChild("Head_r182", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0156F, -5.7732F, 2.0445F, 0.2245F, -0.0294F, -0.2556F));
		PartDefinition Head_r183 = Head.addOrReplaceChild("Head_r183", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0156F, -5.7732F, 2.0445F, 0.0936F, -0.0294F, -0.2556F));
		PartDefinition Head_r184 = Head.addOrReplaceChild("Head_r184", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -5.7732F, 0.8023F, 0.0936F, -0.0294F, -0.1684F));
		PartDefinition Head_r185 = Head.addOrReplaceChild("Head_r185", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -5.7732F, 0.8023F, 0.2245F, -0.0294F, -0.1684F));
		PartDefinition Head_r186 = Head.addOrReplaceChild("Head_r186", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -5.7732F, 0.8023F, -0.0809F, -0.0294F, -0.1684F));
		PartDefinition Head_r187 = Head.addOrReplaceChild("Head_r187", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -5.7732F, -0.1977F, 0.0182F, 0.1647F, -0.1731F));
		PartDefinition Head_r188 = Head.addOrReplaceChild("Head_r188", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -5.7732F, -0.1977F, 0.3236F, 0.1647F, -0.1731F));
		PartDefinition Head_r189 = Head.addOrReplaceChild("Head_r189", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -5.7732F, -0.1977F, 0.1927F, 0.1647F, -0.1731F));
		PartDefinition Head_r190 = Head.addOrReplaceChild("Head_r190", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -5.7732F, -1.1898F, 0.0433F, 0.0057F, -0.1744F));
		PartDefinition Head_r191 = Head.addOrReplaceChild("Head_r191", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -5.7732F, -1.1898F, 0.1742F, 0.0057F, -0.1744F));
		PartDefinition Head_r192 = Head.addOrReplaceChild("Head_r192", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9023F, -5.7732F, -1.1898F, -0.1313F, 0.0057F, -0.1744F));
		PartDefinition Head_r193 = Head.addOrReplaceChild("Head_r193", CubeListBuilder.create().texOffs(35, 50).addBox(0.3042F, 0.4733F, -0.291F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6523F, -5.8787F, -2.3734F, -0.0447F, 0.017F, -0.1298F));
		PartDefinition Head_r194 = Head.addOrReplaceChild("Head_r194", CubeListBuilder.create().texOffs(35, 50).addBox(0.4674F, -0.7477F, -0.4828F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6523F, -5.8787F, -2.3734F, 0.2607F, 0.017F, -0.1298F));
		PartDefinition Head_r195 = Head.addOrReplaceChild("Head_r195", CubeListBuilder.create().texOffs(35, 50).addBox(0.6958F, -2.4872F, -0.55F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6523F, -5.8787F, -2.3734F, 0.1298F, 0.017F, -0.1298F));
		PartDefinition Head_r196 = Head.addOrReplaceChild("Head_r196", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6523F, -4.2786F, -3.5234F, -0.1745F, 0.0F, -0.1309F));
		PartDefinition Head_r197 = Head.addOrReplaceChild("Head_r197", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6523F, -5.5286F, -3.4234F, 0.1309F, 0.0F, -0.1309F));
		PartDefinition Head_r198 = Head.addOrReplaceChild("Head_r198", CubeListBuilder.create().texOffs(35, 50).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6523F, -7.2786F, -3.5234F, 0.0F, 0.0F, -0.1309F));
		PartDefinition Head_r199 = Head.addOrReplaceChild("Head_r199", CubeListBuilder.create().texOffs(58, 24).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0833F, -2.65F, -3.6469F, -0.1309F, 0.0F, 0.0F));
		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow",
				CubeListBuilder.create().texOffs(105, 63).addBox(-8.0568F, -27.5F, -4.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-2.3068F, -27.5F, -4.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-8.0568F, -26.5F, -4.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-2.3068F, -26.5F, -4.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-2.3068F, -25.5F, -4.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-8.0568F, -25.5F, -4.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-2.3068F, -25.5F, -3.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-2.3068F, -26.5F, -3.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-2.3068F, -27.5F, -3.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-8.0568F, -25.5F, -3.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-8.0568F, -26.5F, -3.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-8.0568F, -27.5F, -3.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-8.0568F, -29.25F, -2.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-8.0568F, -28.25F, -2.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-8.0568F, -27.25F, -2.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-2.3068F, -29.25F, -2.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-2.3068F, -28.25F, -2.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-2.3068F, -27.25F, -2.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-2.3068F, -26.25F, -1.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-2.3068F, -27.25F, -1.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-2.3068F, -25.5F, -2.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-2.3068F, -24.5F, -2.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-5.3068F, -25.0F, -4.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-5.3068F, -24.0F, -4.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-6.3068F, -25.0F, -4.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63).addBox(-3.3068F, -25.0F, -4.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 63)
						.addBox(-5.3068F, -25.75F, -4.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.8333F, 24.6F, -0.0258F));
		PartDefinition Head_r200 = eyebrow.addOrReplaceChild("Head_r200", CubeListBuilder.create().texOffs(105, 63).addBox(-2.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2234F, -26.75F, -3.6F, -0.3054F, 0.0F, 0.0F));
		PartDefinition Head_r201 = eyebrow.addOrReplaceChild("Head_r201",
				CubeListBuilder.create().texOffs(52, 39).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 22).addBox(2.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, -29.5F, -3.5F, -0.3054F, 0.0F, 0.0F));
		PartDefinition EyeR = Head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(52, 41).addBox(-1.15F, -0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.65F, -3.9F, -3.5316F));
		PartDefinition Head2 = EyeR.addOrReplaceChild("Head2", CubeListBuilder.create().texOffs(60, 18).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.15F, 0.0F, -0.0059F));
		PartDefinition eyeL = Head.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(16, 57).addBox(-0.875F, -0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.7083F, -3.9F, -3.5316F));
		PartDefinition Head3 = eyeL.addOrReplaceChild("Head3", CubeListBuilder.create().texOffs(16, 59).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, 0.0F, -0.0059F));
		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(52, 37).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0833F, -1.3833F, -3.5258F));
		PartDefinition smile_frown = mouth.addOrReplaceChild("smile_frown", CubeListBuilder.create(), PartPose.offset(2.0F, 28.5F, 3.5F));
		PartDefinition frown_L = smile_frown.addOrReplaceChild("frown_L", CubeListBuilder.create().texOffs(52, 37).addBox(-0.0273F, -1.2016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9727F, -27.7984F, -3.5F, 0.0F, 0.0F, -0.2182F));
		PartDefinition frown_R = smile_frown.addOrReplaceChild("frown_R", CubeListBuilder.create().texOffs(52, 37).addBox(-1.0017F, -1.193F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0401F, -27.8112F, -3.5F, 0.0F, 0.0F, 0.2182F));
		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(28, 27).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(3, 27).addBox(-1.5F, 5.0F, -2.5F, 3.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(98, 37)
						.addBox(-0.5F, 5.0117F, -2.557F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(98, 37).addBox(-0.5F, 6.9117F, -2.557F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 20)
						.addBox(-4.6F, 9.0F, -2.4F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 55).addBox(2.7F, 9.0F, -2.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 71)
						.addBox(2.7F, 9.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 51).addBox(-3.3F, 9.0F, -2.6F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 72)
						.addBox(-4.6F, 9.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 67).addBox(1.5F, -0.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(68, 22)
						.addBox(-4.5F, -0.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 1).addBox(-4.05F, 8.5F, -3.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 1)
						.addBox(-4.15F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 1).addBox(-2.95F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 1)
						.addBox(-3.55F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 7).addBox(-1.0F, 9.1617F, -2.6599F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(92, 7)
						.addBox(-1.0F, 8.7617F, -2.657F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(92, 7).addBox(0.0F, 8.7617F, -2.657F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(92, 7)
						.addBox(0.0F, 9.1617F, -2.6599F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(66, 1).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.15F, 9.0273F, -3.1F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(76, 14).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0117F, -0.157F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(76, 8).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.3117F, -0.157F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(3, 27).addBox(-1.5F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8078F, 14.25F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(2, 27).addBox(-2.5F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7313F, 14.25F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -5.0F, -2.5005F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2617F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -5.0F, -2.5005F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.293F, 7.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(50, 62).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.5F, -11.0F, 0.0F));
		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(58, 37).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));
		PartDefinition LeftArm3 = LeftArm2.addOrReplaceChild("LeftArm3", CubeListBuilder.create().texOffs(110, 108).addBox(-1.0333F, -0.5F, 1.5F, 2.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(109, 107)
				.addBox(-1.2333F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(109, 107).addBox(0.2667F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0333F, 4.5F, 0.1667F));
		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(50, 62).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, -11.0F, 0.0F));
		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(58, 37).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));
		PartDefinition RightLeg = whole.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(16, 66).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(52, 26).addBox(-2.0117F, 0.0F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(-2.0117F, 5.0F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 47)
						.addBox(-1.9766F, 4.0F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 47).addBox(-2.0766F, 4.0F, -2.2578F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 47)
						.addBox(-2.1311F, 2.7512F, -2.2578F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 47).addBox(-2.0311F, 2.7512F, -2.2578F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-2.1117F, 5.0F, -4.3711F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.0F, -0.6289F));
		PartDefinition RightLeg_r1 = RightLeg2.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(65, 54).addBox(-3.5242F, -0.6741F, 1.6855F, 4.0F, 2.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(65, 54).addBox(-3.6242F, -0.6741F, 1.6855F, 1.0F, 2.0F, -2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5806F, 5.4305F, -3.2578F, 0.5668F, -0.0234F, -0.0068F));
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