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
public class Modelmadieval_civilian_boy extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("the_middle_ages", "modelmadieval_civilian_boy"), "main");
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

	public Modelmadieval_civilian_boy(ModelPart root) {
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
						.addBox(-1.9102F, 3.8333F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(38, 0).addBox(-1.9117F, 4.8333F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-2.1117F, 4.8333F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(38, 0).addBox(-2.0117F, 4.8333F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(-2.1055F, 3.8333F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(-1.9488F, 2.8437F, -2.2578F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(-2.0488F, 2.8437F, -2.2578F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));
		PartDefinition LeftLeg_r1 = LeftLeg2.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(63, 3).addBox(0.3089F, -2.5357F, -3.1946F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 3).addBox(0.5042F, -2.5357F, -3.1946F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3647F, 5.2304F, 0.2422F, 0.6104F, 0.025F, 0.0079F));
		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(), PartPose.offset(-2.4F, 1.0F, 0.0F));
		PartDefinition Head = Waist.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 11).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(7, 18).addBox(-4.5F, -3.75F, -1.75F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 18)
						.addBox(-3.5F, -3.75F, -1.75F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 43).addBox(-4.25F, -8.0F, -4.1F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 43)
						.addBox(-4.45F, -8.0F, -4.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 43).addBox(-4.45F, -8.3F, -4.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 43)
						.addBox(3.45F, -8.0F, -4.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 43).addBox(3.45F, -8.3F, -4.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(74, 37)
						.addBox(-4.25F, -8.0F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 37).addBox(-4.25F, -8.2969F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 37)
						.addBox(-0.65F, -8.2969F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 45).addBox(0.2719F, -8.0F, 3.1F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70)
						.addBox(3.2833F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 70).addBox(-4.25F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 43)
						.addBox(3.2833F, -8.0F, -4.1F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(33, 43).addBox(-3.7167F, -8.3F, -4.1F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(33, 43)
						.addBox(-3.7167F, -7.7F, -4.1F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(33, 43).addBox(-3.7167F, -8.3F, -4.3F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(33, 43)
						.addBox(-4.2362F, -8.3F, -4.1F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -7.2F, -4.5F, 10.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(20, 7).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1953F, -5.0333F, 5.0833F, -0.6407F, -1.0216F, -0.3685F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(21, 6).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.25F, -5.0333F, 5.0833F, -1.027F, -0.6015F, -0.7666F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(13, 8).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7F, 4.25F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(44, 47).addBox(-2.2422F, -1.1759F, -1.0245F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-1.0753F, -3.715F, -0.4375F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, -1.4281F, 1.2226F, -1.5609F));
		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.9431F, -0.7054F, -1.0923F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(0.2238F, -3.2446F, -0.5053F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, -1.4748F, 1.3529F, -1.6058F));
		PartDefinition Head_r6 = Head
				.addOrReplaceChild(
						"Head_r6", CubeListBuilder.create().texOffs(44, 47).addBox(0.3594F, -0.4242F, -1.1466F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47)
								.addBox(1.5263F, -2.9634F, -0.5596F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(3.4142F, -2.5473F, -0.5996F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, -1.4748F, 1.3529F, -1.5621F));
		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(44, 47).addBox(3.0064F, -2.2143F, -0.9553F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(1.0749F, -2.2962F, -0.9153F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, -1.1158F, 1.5236F, -1.2014F));
		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(44, 47).addBox(2.0979F, -1.9485F, -0.9897F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, -1.3241F, 1.3941F, -1.4088F));
		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(44, 47).addBox(-0.2566F, -2.3469F, -0.861F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, -1.1158F, 1.5236F, -1.245F));
		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(44, 47).addBox(-1.6177F, -2.5847F, -0.7931F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, -1.2918F, 1.3937F, -1.4202F));
		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11",
				CubeListBuilder.create().texOffs(44, 47).addBox(-2.9725F, -2.3451F, -0.8304F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-4.0789F, -2.2931F, -0.8293F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, 0.0213F, 1.5594F, -0.1081F));
		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(32, 70).addBox(-0.6549F, 0.5446F, -2.2734F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, -3.1416F, 0.0F, -3.0543F));
		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(44, 47).addBox(-0.9649F, 0.3563F, -1.448F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.3259F, 1.7711F, 1.4759F, 1.3504F, 1.3494F));
		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(44, 47).addBox(-0.9649F, 0.3563F, -1.448F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.7165F, 0.8141F, 1.4759F, 1.3504F, 1.3494F));
		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(44, 47).addBox(-0.9649F, 0.3563F, -1.448F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.2985F, 0.1734F, -1.1158F, 1.5236F, -1.245F));
		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(44, 47).addBox(0.3666F, 0.4071F, -1.5023F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.8337F, 0.1734F, -1.1158F, 1.5236F, -1.2014F));
		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17",
				CubeListBuilder.create().texOffs(44, 47).addBox(-2.4511F, -3.7144F, -0.4747F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-3.7149F, -3.8991F, -0.4684F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, -1.5054F, 1.3961F, -1.6358F));
		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(44, 47).addBox(2.4733F, -2.4434F, -0.634F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4244F, -4.5446F, 0.1734F, -1.4448F, 1.2223F, -1.5333F));
		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19",
				CubeListBuilder.create().texOffs(44, 47).addBox(1.3887F, 0.7352F, -1.6746F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(2.097F, -1.968F, -1.0876F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.5423F, 0.1734F, 1.8175F, -1.3941F, -1.6456F));
		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20",
				CubeListBuilder.create().texOffs(44, 47).addBox(1.3089F, 0.0765F, -1.3189F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(2.4758F, -2.4627F, -0.7319F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.5423F, 0.1734F, 1.6968F, -1.2223F, -1.5211F));
		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(44, 47).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.621F, -3.6705F, 3.3955F, -2.0035F, -1.5214F, 2.1754F));
		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22",
				CubeListBuilder.create().texOffs(44, 47).addBox(2.2969F, 0.4694F, -1.6402F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(0.3655F, 0.3875F, -1.6001F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47)
						.addBox(3.0052F, -2.2338F, -1.0532F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(1.0737F, -2.3157F, -1.0131F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.5423F, 0.1734F, 2.0257F, -1.5236F, -1.8529F));
		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.94F, -0.729F, -1.1893F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(0.227F, -3.2682F, -0.6022F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.5423F, 0.1734F, 1.6668F, -1.3529F, -1.4485F));
		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(44, 47).addBox(-2.2388F, -1.1994F, -1.1214F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -3.8548F, -0.6469F, 3.0089F, -1.5221F, -3.0156F));
		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(44, 47).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5515F, -5.348F, -3.507F, -1.8241F, -1.5255F, 2.0405F));
		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26",
				CubeListBuilder.create().texOffs(44, 47).addBox(-3.7118F, -3.9227F, -0.5654F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-2.4481F, -3.738F, -0.5717F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.5423F, 0.1734F, 1.6362F, -1.3961F, -1.4185F));
		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(44, 47).addBox(-1.6184F, -2.6084F, -0.8901F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.3079F, -0.1273F, -3.0561F, -1.5221F, -3.0156F));
		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(44, 47).addBox(-0.2576F, -2.3707F, -0.9579F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.5423F, 0.1734F, 2.0257F, -1.5236F, -1.8093F));
		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29",
				CubeListBuilder.create().texOffs(44, 47).addBox(0.3616F, -0.4436F, -1.2445F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(1.5285F, -2.9828F, -0.6574F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.5423F, 0.1734F, 1.6668F, -1.3529F, -1.4922F));
		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(44, 47).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.743F, -6.5261F, 3.4958F, -3.0812F, -1.55F, -3.0297F));
		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(44, 44).addBox(-0.0723F, -3.3874F, -0.2453F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.5423F, 0.1734F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(44, 47).addBox(-1.0719F, -3.7385F, -0.5344F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.5423F, 0.1734F, 1.7135F, -1.2226F, -1.4935F));
		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(44, 47).addBox(-2.9736F, -2.3689F, -0.9273F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5949F, -4.5423F, 0.1734F, -3.1203F, -1.5594F, -2.9462F));
		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34",
				CubeListBuilder.create().texOffs(44, 47).addBox(0.252F, -3.246F, -0.5287F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5834F, -4.6126F, 3.242F, 0.1728F, 0.017F, -0.2172F));
		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-0.9374F, 0.35F, -1.4714F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5834F, -4.6126F, 3.242F, 0.1731F, -0.0131F, -0.0453F));
		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(0.252F, -3.246F, -0.5287F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7084F, -4.6126F, 3.242F, 0.1728F, 0.017F, -0.3481F));
		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.9374F, 0.35F, -1.4714F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7084F, -4.6126F, 3.242F, 0.1731F, -0.0131F, -0.1762F));
		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38",
				CubeListBuilder.create().texOffs(44, 47).addBox(0.252F, -3.246F, -0.5287F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6498F, -4.6126F, 3.242F, 0.1728F, 0.017F, -0.2172F));
		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-0.9374F, 0.35F, -1.4714F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6498F, -4.6126F, 3.242F, 0.1731F, -0.0131F, -0.0453F));
		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(0.252F, -3.246F, -0.5286F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3165F, -4.6126F, 3.2694F, 0.2154F, 0.0264F, -0.2163F));
		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.9374F, 0.35F, -1.4713F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3165F, -4.6126F, 3.2694F, 0.2167F, -0.0111F, -0.0458F));
		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42",
				CubeListBuilder.create().texOffs(44, 47).addBox(0.252F, -3.246F, -0.5286F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0663F, -4.6126F, 3.2694F, 0.2154F, 0.0264F, -0.3472F));
		PartDefinition Head_r43 = Head.addOrReplaceChild("Head_r43",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-0.9374F, 0.35F, -1.4713F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0663F, -4.6126F, 3.2694F, 0.2167F, -0.0111F, -0.1767F));
		PartDefinition Head_r44 = Head.addOrReplaceChild("Head_r44",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(0.252F, -3.246F, -0.5286F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3996F, -4.6126F, 3.2694F, 0.2154F, 0.0264F, -0.1727F));
		PartDefinition Head_r45 = Head.addOrReplaceChild("Head_r45",
				CubeListBuilder.create().texOffs(44, 47).addBox(-0.9374F, 0.35F, -1.4713F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3996F, -4.6126F, 3.2694F, 0.2167F, -0.0111F, -0.0022F));
		PartDefinition Head_r46 = Head.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(44, 47).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9471F, -2.5695F, 3.1963F, 0.2167F, -0.0111F, -0.0022F));
		PartDefinition Head_r47 = Head.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(44, 47).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9471F, -3.55F, 3.35F, 0.2154F, 0.0264F, -0.1727F));
		PartDefinition Head_r48 = Head.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(44, 47).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7362F, -5.4172F, 3.1963F, 0.2167F, -0.0111F, -0.0022F));
		PartDefinition Head_r49 = Head.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(44, 47).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7362F, -6.3977F, 3.35F, 0.2154F, 0.0264F, -0.1727F));
		PartDefinition Head_r50 = Head.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(44, 47).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5971F, -6.6438F, 3.35F, 0.1306F, -0.0076F, 0.0869F));
		PartDefinition Head_r51 = Head.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6212F, -6.7426F, -3.9234F, -0.0883F, -0.004F, -0.0423F));
		PartDefinition Head_r52 = Head.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6486F, -6.7426F, -3.9234F, -0.0881F, 0.0076F, 0.0881F));
		PartDefinition Head_r53 = Head.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5666F, -6.7426F, -3.9234F, -0.0883F, -0.004F, -0.0423F));
		PartDefinition Head_r54 = Head.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5666F, -6.7426F, -3.9234F, -0.0871F, -0.0155F, -0.1727F));
		PartDefinition Head_r55 = Head.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1001F, -6.7426F, -3.9234F, -0.0881F, 0.0076F, 0.0881F));
		PartDefinition Head_r56 = Head.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.104F, -6.7426F, -3.9234F, -0.0884F, -0.0001F, 0.0012F));
		PartDefinition Head_r57 = Head.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1587F, -6.7426F, -4.0406F, -0.0881F, -0.0078F, -0.0858F));
		PartDefinition Head_r58 = Head.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9634F, -6.7426F, -3.9352F, -0.0881F, 0.0076F, 0.0881F));
		PartDefinition Head_r59 = Head.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9634F, -6.7426F, -3.9352F, -0.0883F, -0.004F, -0.0423F));
		PartDefinition Head_r60 = Head.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(58, 24).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0833F, -2.4F, -3.6469F, -0.1309F, 0.0F, 0.0F));
		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow", CubeListBuilder.create(), PartPose.offset(3.8333F, 24.6F, -0.0258F));
		PartDefinition Head_r61 = eyebrow.addOrReplaceChild("Head_r61",
				CubeListBuilder.create().texOffs(52, 39).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 22).addBox(2.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, -29.45F, -3.5F, -0.3054F, 0.0F, 0.0F));
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
				CubeListBuilder.create().texOffs(28, 27).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(3, 27).addBox(-1.5F, 2.0F, -2.5F, 3.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(38, 9)
						.addBox(-4.5156F, 13.0F, -2.2F, 9.0F, -1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 20).addBox(-4.5156F, 13.0F, -0.7F, 9.0F, -1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 55)
						.addBox(-0.5F, 2.0117F, -2.557F, 1.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(76, 14).addBox(-1.0F, 8.7617F, -2.657F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(76, 14)
						.addBox(0.0F, 8.7617F, -2.657F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(76, 14).addBox(-1.0F, 9.1617F, -2.6599F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(76, 14)
						.addBox(0.0F, 9.1617F, -2.6599F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 20).addBox(-4.6F, 9.0F, -2.4F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 55)
						.addBox(2.7F, 9.0F, -2.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 71).addBox(2.7F, 9.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-3.3F, 9.0F, -2.6F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 50).addBox(-4.05F, 8.5F, -3.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 50)
						.addBox(-4.15F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 50).addBox(-2.95F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 50)
						.addBox(-3.55F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 72).addBox(-4.6F, 9.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 67).addBox(-4.0F, -1.5F, -2.5009F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(68, 22).addBox(0.3333F, -1.5F, -2.5006F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8333F, 1.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(46, 50).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.15F, 9.0273F, -3.1F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(76, 14).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0117F, -0.157F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(76, 8).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.3117F, -0.157F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(12, 75).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.6117F, -0.157F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.9117F, -0.157F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8162F, 13.2532F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7893F, 13.2298F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(0, 27).addBox(-4.5F, -5.0F, -2.5006F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8672F, 7.2539F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(0, 27).addBox(-4.5F, -5.0F, -2.5006F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(50, 62).addBox(-1.1F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(2.5F, -2.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.5F, -11.0F, 0.0F));
		PartDefinition Body_r12 = LeftArm.addOrReplaceChild("Body_r12",
				CubeListBuilder.create().texOffs(2, 67).addBox(-0.3333F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 67).addBox(-3.3333F, -1.5F, -2.5006F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1667F, -1.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition Body_r13 = LeftArm.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(0, 67).addBox(-3.3333F, -1.5F, -2.5009F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8667F, -1.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(58, 37).addBox(-2.1F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));
		PartDefinition LeftArm3 = LeftArm2.addOrReplaceChild("LeftArm3", CubeListBuilder.create().texOffs(110, 108).addBox(-1.0333F, -0.5F, 1.5F, 2.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(109, 107)
				.addBox(-1.2333F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(109, 107).addBox(0.2667F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0333F, 4.5F, 0.1667F));
		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(50, 62).addBox(-0.6F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, -11.0F, 0.0F));
		PartDefinition Body_r14 = RightArm.addOrReplaceChild("Body_r14", CubeListBuilder.create().texOffs(2, 67).addBox(2.0F, -1.5F, -2.5006F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, -1.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition Body_r15 = RightArm.addOrReplaceChild("Body_r15", CubeListBuilder.create().texOffs(2, 67).addBox(2.0F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
				.addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 67).addBox(-1.0F, -1.5F, -2.5006F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(58, 37).addBox(-1.6F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));
		PartDefinition RightLeg = whole.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(16, 66).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(52, 26).addBox(-2.0117F, 0.0F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(-2.0077F, 5.0F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 47)
						.addBox(-2.0077F, 4.0F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 47).addBox(-2.1077F, 4.0F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 47)
						.addBox(-1.9367F, 2.9916F, -2.2578F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 47).addBox(-2.1047F, 2.9916F, -2.2578F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-2.1077F, 5.0F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.0F, -0.6289F));
		PartDefinition RightLeg_r1 = RightLeg2.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(61, 50).addBox(-4.4042F, -2.5354F, -3.1946F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 50).addBox(-4.5042F, -2.5354F, -3.1946F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3468F, 5.3968F, 0.2422F, 0.6104F, -0.025F, -0.0079F));
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