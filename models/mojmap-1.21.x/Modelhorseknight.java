// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhorseknight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "horseknight"), "main");
	private final ModelPart root;
	private final ModelPart whole;
	private final ModelPart Waist;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart Right_Arm2;
	private final ModelPart RightArm2;
	private final ModelPart Left_Arm;
	private final ModelPart Right_Arm4;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart Right_Leg2;
	private final ModelPart LeftLeg;
	private final ModelPart Left_Leg4;
	private final ModelPart horse;
	private final ModelPart back_right_leg;
	private final ModelPart back_right_leg2;
	private final ModelPart head2;
	private final ModelPart Eyes;
	private final ModelPart EyeR;
	private final ModelPart EyeL;
	private final ModelPart mouth;
	private final ModelPart mouth2;
	private final ModelPart leads;
	private final ModelPart LeadL;
	private final ModelPart LeadR;
	private final ModelPart left_ear;
	private final ModelPart left_ear2;
	private final ModelPart neck;
	private final ModelPart mane;
	private final ModelPart mane3;
	private final ModelPart mane5;
	private final ModelPart mane2;
	private final ModelPart mane4;
	private final ModelPart mane6;
	private final ModelPart body2;
	private final ModelPart tail;
	private final ModelPart front_left_leg;
	private final ModelPart front_left_leg2;
	private final ModelPart front_right_leg;
	private final ModelPart front_right_leg2;
	private final ModelPart back_left_leg;
	private final ModelPart back_left_leg2;

	public Modelhorseknight(ModelPart root) {
		this.root = root.getChild("root");
		this.whole = this.root.getChild("whole");
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

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 23.3333F, 8.6667F));

		PartDefinition whole = root.addOrReplaceChild("whole", CubeListBuilder.create(),
				PartPose.offset(2.0F, -8.0F, -8.6667F));

		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(),
				PartPose.offset(0.0F, -12.6667F, 0.0F));

		PartDefinition Head = Waist.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(92, 20)
				.addBox(-0.3976F, -8.0937F, -4.4593F, 1.0F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(104, 139)
				.addBox(-3.2976F, -7.9937F, 3.8907F, 6.4F, 8.0F, 0.05F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(111, 0)
						.addBox(1.0F, -29.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(148, 44)
						.addBox(1.0F, -29.0F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 73)
						.addBox(1.0F, -32.0F, -4.0F, 4.0F, 3.25F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(1.0F, -28.25F, -4.0F, 3.8F, 4.25F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6476F, 24.0F, 0.0719F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(107, 33).addBox(2.0F, -29.0F, -4.0F, 3.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6476F, 24.0F, 0.1446F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(148, 41)
						.addBox(1.0F, -29.0F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 53)
						.addBox(1.0F, -32.0F, -4.0F, 4.0F, 3.25F, 8.0F, new CubeDeformation(0.0F)).texOffs(25, 73)
						.addBox(1.2F, -28.25F, -4.0F, 3.8F, 4.25F, 8.0F, new CubeDeformation(0.0F)).texOffs(111, 10)
						.addBox(4.0F, -29.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3296F, 24.0F, -0.451F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(75, 145).addBox(1.0F, -31.0F, -4.0F, 3.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3296F, 24.0F, -0.3963F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(75, 81)
						.addBox(1.0F, -31.0F, -4.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(50, 85)
						.addBox(1.0F, -34.3333F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1476F, 27.0333F, 0.0173F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(86, 33)
						.addBox(2.0F, -31.0F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(73, 93)
						.addBox(2.0F, -34.3333F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3296F, 27.0333F, -0.5057F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Body = Waist.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 146)
				.addBox(-4.3151F, -4.2687F, -1.9025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 73)
				.addBox(-4.3151F, -4.2687F, -2.0025F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(143, 15)
				.addBox(2.0849F, -4.2687F, -2.0025F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(105, 111)
				.addBox(-4.3151F, -4.2687F, -1.8025F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(143, 21)
				.addBox(2.0849F, -4.2687F, -1.8025F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 139)
				.addBox(-1.0029F, -6.8573F, -1.94F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0796F, -1.3154F, -0.0975F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 136)
				.addBox(-3.9176F, -4.9061F, -1.8625F, 4.0F, 5.0F, 3.8F, new CubeDeformation(0.0F)).texOffs(134, 78)
				.addBox(-3.9176F, -4.9061F, -1.6625F, 4.0F, 5.0F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2389F, -4.196F, -0.04F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(122, 56).addBox(-0.6357F, -2.3257F, -1.9F, 5.0F, 5.5667F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0706F, -0.8597F, 0.1975F, 0.0F, 0.0F, -3.098F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(68, 124)
				.addBox(-0.964F, -4.9113F, -1.863F, 5.0F, 5.0F, 3.8F, new CubeDeformation(0.0F)).texOffs(124, 117)
				.addBox(-0.964F, -4.9113F, -2.0625F, 5.0F, 5.0F, 3.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0389F, -4.196F, 0.16F, 0.0F, 0.0F, 0.0436F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(68, 134).addBox(-3.8653F, -2.3039F, -1.9F, 4.0F, 5.5667F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2706F, -0.8597F, 0.1975F, 0.0F, 0.0F, 3.098F));

		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(51, 139).addBox(-1.0F, -1.25F, -2.0F, 2.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0029F, -5.6073F, 0.16F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(139, 141).addBox(-1.8839F, -1.8839F, -2.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0029F, -5.6073F, 0.16F, -3.1416F, 0.0F, 2.3562F));

		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7",
				CubeListBuilder.create().texOffs(86, 45).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0029F, -6.8573F, 0.06F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8",
				CubeListBuilder.create().texOffs(23, 86).addBox(-1.1292F, -5.0708F, -1.9F, 5.0F, 10.0F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, 0.8054F, 0.5975F, -0.0872F, 0.0038F, -3.0981F));

		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9",
				CubeListBuilder.create().texOffs(17, 101).addBox(-3.3718F, -5.049F, -1.9005F, 4.0F, 10.0F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, 0.8054F, 0.5975F, -0.0872F, -0.0038F, 3.0981F));

		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10",
				CubeListBuilder.create().texOffs(130, 15).addBox(-3.3718F, -5.049F, -1.9F, 2.0F, 10.0F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1961F, 0.7054F, -0.5025F, 0.0872F, -0.0038F, -3.0981F));

		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11",
				CubeListBuilder.create().texOffs(130, 0).addBox(-3.3718F, -5.049F, -1.9F, 2.0F, 10.0F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, 0.8054F, -0.5025F, 0.0872F, 0.0038F, 3.0981F));

		PartDefinition Body_r12 = Body.addOrReplaceChild("Body_r12",
				CubeListBuilder.create().texOffs(79, 110).addBox(-3.3718F, -3.049F, -1.9F, 4.0F, 8.0F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, 0.8054F, -0.4025F, 0.0872F, 0.0038F, 3.0981F));

		PartDefinition Body_r13 = Body.addOrReplaceChild("Body_r13",
				CubeListBuilder.create().texOffs(68, 96).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1849F, -3.7687F, -1.6025F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Body_r14 = Body.addOrReplaceChild("Body_r14",
				CubeListBuilder.create().texOffs(103, 60).addBox(-1.1292F, -3.0708F, -1.9F, 5.0F, 8.0F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, 0.8054F, -0.4025F, 0.0872F, -0.0038F, -3.0981F));

		PartDefinition Body_r15 = Body.addOrReplaceChild("Body_r15",
				CubeListBuilder.create().texOffs(105, 117).addBox(-0.6357F, -2.3257F, -1.9F, 5.0F, 5.5667F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, -0.8597F, 0.0975F, 0.0F, 0.0F, -3.098F));

		PartDefinition Body_r16 = Body.addOrReplaceChild("Body_r16",
				CubeListBuilder.create().texOffs(131, 42).addBox(-3.8653F, -2.3039F, -1.9F, 4.0F, 5.5667F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1706F, -0.8597F, 0.0975F, 0.0F, 0.0F, 3.098F));

		PartDefinition Body_r17 = Body.addOrReplaceChild("Body_r17",
				CubeListBuilder.create().texOffs(98, 81).addBox(-0.964F, -6.578F, -1.853F, 5.0F, 6.6667F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1389F, -4.196F, 0.06F, 0.0F, 0.0F, 0.0436F));

		PartDefinition Body_r18 = Body.addOrReplaceChild("Body_r18",
				CubeListBuilder.create().texOffs(0, 124).addBox(-3.9176F, -6.5728F, -1.8625F, 4.0F, 6.6667F, 3.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1389F, -4.196F, 0.06F, 0.0F, 0.0F, -0.0436F));

		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(51, 116).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1",
				CubeListBuilder.create().texOffs(131, 53)
						.addBox(-3.05F, 1.0F, -1.9F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(128, 114)
						.addBox(-3.05F, 1.0F, -2.1F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(128, 111)
						.addBox(-2.95F, 1.0F, -2.1003F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2398F, -1.2602F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2",
				CubeListBuilder.create().texOffs(141, 134).addBox(-2.95F, 1.0F, -2.1F, 4.0F, -2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0738F, -2.418F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Right_Arm2 = RightArm.addOrReplaceChild("Right_Arm2", CubeListBuilder.create().texOffs(127, 67)
				.addBox(-2.035F, 0.0031F, -2.043F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 4.0F, 0.0F));

		PartDefinition RightArm2 = Right_Arm2.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(0, 53)
				.addBox(-0.4942F, -1.0847F, -14.8391F, 1.0F, 2.1F, 17.0F, new CubeDeformation(0.0F)).texOffs(34, 136)
				.addBox(-0.5029F, -0.4859F, 2.9161F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.8587F, 4.6406F, -5.9161F));

		PartDefinition RightArm_r3 = RightArm2.addOrReplaceChild("RightArm_r3",
				CubeListBuilder.create().texOffs(38, 22).addBox(-0.0007F, -1.0F, 1.0F, 1.0F, 2.0F, -2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5029F, 0.0141F, 9.6161F, -0.7854F, 0.0F, 0.0F));

		PartDefinition RightArm_r4 = RightArm2.addOrReplaceChild("RightArm_r4",
				CubeListBuilder.create().texOffs(73, 85).addBox(0.0F, -1.5F, 0.5F, 1.0F, 4.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5029F, 0.5297F, 2.6161F, -0.0873F, 0.0F, 0.0F));

		PartDefinition RightArm_r5 = RightArm2.addOrReplaceChild("RightArm_r5",
				CubeListBuilder.create().texOffs(74, 85).addBox(0.0F, -2.5F, 0.5F, 1.0F, 4.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5029F, -0.4859F, 2.6161F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RightArm_r6 = RightArm2.addOrReplaceChild("RightArm_r6",
				CubeListBuilder.create().texOffs(34, 101).addBox(-0.5F, -1.05F, -0.793F, 1.0F, 1.4164F, 1.543F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0058F, 0.1776F, -14.5717F, 0.829F, 0.0F, 0.0F));

		PartDefinition Left_Arm = Waist.addOrReplaceChild("Left_Arm",
				CubeListBuilder.create().texOffs(117, 79).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition LeftArm_r1 = Left_Arm.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(85, 140)
						.addBox(-2.414F, 1.4174F, -1.9F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(73, 178)
						.addBox(-2.414F, 1.4174F, -2.1F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(134, 88)
						.addBox(-2.314F, 1.4174F, -2.0996F, 5.0F, -2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3004F, -1.705F, 0.0133F, -3.1416F, 0.0F, 3.0543F));

		PartDefinition LeftArm_r2 = Left_Arm.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(141, 63).addBox(-2.0122F, 0.5432F, -2.3002F, 4.0F, -2.0F, 4.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3004F, -1.705F, -0.1867F, -3.1416F, 0.0F, -2.8362F));

		PartDefinition Right_Arm4 = Left_Arm.addOrReplaceChild("Right_Arm4", CubeListBuilder.create().texOffs(34, 125)
				.addBox(-2.035F, -0.0031F, -2.043F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 4.0F, 0.0F));

		PartDefinition LeftArm = Right_Arm4.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(122, 138)
				.addBox(-0.5087F, -0.6635F, 17.4878F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(37, 53)
				.addBox(-0.5174F, -1.2623F, -0.2675F, 1.0F, 2.1F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.4079F, 4.4135F, -20.4878F));

		PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild(
				"LeftArm_r3", CubeListBuilder.create().texOffs(34, 105).addBox(-0.5F, -1.05F, -0.793F, 1.0F, 1.4164F,
						1.543F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition LeftArm_r4 = LeftArm.addOrReplaceChild("LeftArm_r4",
				CubeListBuilder.create().texOffs(37, 19).addBox(0.0006F, -1.0F, 1.0F, 1.0F, 2.0F, -2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5087F, -0.1635F, 24.1878F, -0.7854F, 0.0F, 0.0F));

		PartDefinition LeftArm_r5 = LeftArm.addOrReplaceChild("LeftArm_r5",
				CubeListBuilder.create().texOffs(73, 89).addBox(0.0F, -1.5F, 0.5F, 1.0F, 4.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5087F, 0.3521F, 17.1878F, -0.0873F, 0.0F, 0.0F));

		PartDefinition LeftArm_r6 = LeftArm.addOrReplaceChild("LeftArm_r6",
				CubeListBuilder.create().texOffs(49, 86).addBox(0.0F, -2.5F, 0.5F, 1.0F, 4.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5087F, -0.6635F, 17.1878F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RightLeg = whole.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(113, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -12.6667F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition Right_Leg2 = RightLeg.addOrReplaceChild("Right_Leg2", CubeListBuilder.create().texOffs(17, 116)
				.addBox(-2.0273F, -0.1147F, -2.0273F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(88, 10)
				.addBox(-2.0273F, 4.8345F, -5.0273F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(109, 93)
				.addBox(-2.0404F, 4.5348F, -4.0273F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.1667F, 0.0F, 0.6545F, 0.0F, -0.7854F));

		PartDefinition LeftLeg = whole.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -12.6667F, 0.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition Left_Leg4 = LeftLeg.addOrReplaceChild("Left_Leg4", CubeListBuilder.create().texOffs(34, 113)
				.addBox(-2.0273F, -0.1679F, -2.0273F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(88, 0)
				.addBox(-2.0273F, 4.8321F, -5.0273F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(109, 102)
				.addBox(-2.0142F, 4.5324F, -4.0273F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.1667F, 0.0F, 0.6545F, 0.0F, 0.7854F));

		PartDefinition horse = root.addOrReplaceChild("horse", CubeListBuilder.create(),
				PartPose.offset(-2.0F, -9.3333F, -0.6667F));

		PartDefinition back_right_leg = horse.addOrReplaceChild("back_right_leg", CubeListBuilder.create()
				.texOffs(222, 230).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition back_right_leg2 = back_right_leg.addOrReplaceChild("back_right_leg2", CubeListBuilder.create()
				.texOffs(226, 135).addBox(-2.0F, -0.2F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 5.2F, 1.0F));

		PartDefinition head2 = horse.addOrReplaceChild("head2",
				CubeListBuilder.create().texOffs(163, 123)
						.addBox(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(183, 246)
						.addBox(-3.1F, -11.1F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(241, 220)
						.addBox(-0.9F, -11.1F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(242, 169)
						.addBox(-3.1F, -10.9F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(243, 130)
						.addBox(-0.9F, -10.9F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -12.0F, -18.0F, 0.3869F, 0.0179F, 0.0237F));

		PartDefinition Eyes = head2.addOrReplaceChild("Eyes", CubeListBuilder.create(),
				PartPose.offset(-0.007F, -9.5F, 0.5F));

		PartDefinition EyeR = Eyes.addOrReplaceChild("EyeR",
				CubeListBuilder.create().texOffs(167, 53)
						.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(177, 45)
						.addBox(-3.0F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0383F, 0.0F, 0.0F));

		PartDefinition EyeL = Eyes.addOrReplaceChild("EyeL",
				CubeListBuilder.create().texOffs(167, 53)
						.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(177, 45)
						.addBox(-3.0F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0383F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition mouth = head2.addOrReplaceChild("mouth", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mouth_r1 = mouth.addOrReplaceChild("mouth_r1",
				CubeListBuilder.create().texOffs(241, 103)
						.addBox(-3.0F, 0.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(177, 207)
						.addBox(-2.8F, 0.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -8.6639F, -3.8771F, 0.3054F, 0.0F, 0.0F));

		PartDefinition mouth_r2 = mouth.addOrReplaceChild("mouth_r2",
				CubeListBuilder.create().texOffs(242, 176)
						.addBox(-3.0F, -2.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(241, 227)
						.addBox(-3.2F, -2.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, -7.9639F, -3.6817F, 0.3054F, 0.0F, 0.0F));

		PartDefinition mouth_r3 = mouth.addOrReplaceChild("mouth_r3",
				CubeListBuilder.create().texOffs(239, 230)
						.addBox(-3.0F, -2.5F, -0.5F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(239, 159)
						.addBox(-3.2F, -2.5F, -0.5F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 189)
						.addBox(-3.1F, -2.5F, -2.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, -7.8639F, -3.6325F, 0.3054F, 0.0F, 0.0F));

		PartDefinition mouth_r4 = mouth.addOrReplaceChild("mouth_r4",
				CubeListBuilder.create().texOffs(115, 201)
						.addBox(-0.6F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 202)
						.addBox(-0.4F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 200)
						.addBox(-5.6F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(191, 155)
						.addBox(-5.8F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, -6.7192F, -3.2523F, 1.0036F, 0.0F, 0.0F));

		PartDefinition mouth_r5 = mouth.addOrReplaceChild("mouth_r5",
				CubeListBuilder.create().texOffs(173, 176)
						.addBox(-2.9F, 0.5F, -4.0F, 6.0F, -1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(172, 168)
						.addBox(-3.1F, 0.5F, -4.0F, 6.0F, -1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.4768F, 0.0062F, 0.2182F, 0.0F, 0.0F));

		PartDefinition mouth2 = mouth.addOrReplaceChild("mouth2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -6.4334F, -0.4705F));

		PartDefinition mouth_r6 = mouth2.addOrReplaceChild("mouth_r6",
				CubeListBuilder.create().texOffs(108, 231).addBox(-3.0F, 0.5F, -2.5F, 6.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4306F, -3.162F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leads = mouth.addOrReplaceChild("leads", CubeListBuilder.create(),
				PartPose.offset(0.0F, -5.9611F, -3.8141F));

		PartDefinition LeadL = leads.addOrReplaceChild("LeadL", CubeListBuilder.create(),
				PartPose.offset(5.3333F, 0.0F, 0.0F));

		PartDefinition mouth_r7 = LeadL.addOrReplaceChild("mouth_r7",
				CubeListBuilder.create().texOffs(106, 169).addBox(-3.1F, -0.1528F, 0.0578F, 1.0F, -1.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7F, 0.0668F, -0.0562F));

		PartDefinition LeadR = leads.addOrReplaceChild("LeadR", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mouth_r8 = LeadR.addOrReplaceChild("mouth_r8",
				CubeListBuilder.create().texOffs(141, 136).addBox(-3.1F, -0.1528F, 0.0578F, 1.0F, -1.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7057F, -0.1334F, 0.1129F));

		PartDefinition left_ear = head2.addOrReplaceChild("left_ear",
				CubeListBuilder.create().texOffs(140, 189).addBox(-1.0F, -3.25F, -0.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, -10.05F, 4.49F, 0.0F, 0.0F, 0.3054F));

		PartDefinition left_ear2 = head2.addOrReplaceChild("left_ear2",
				CubeListBuilder.create().texOffs(140, 194).addBox(-1.0F, -3.25F, -0.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, -10.05F, 4.49F, 0.0F, 0.0F, -0.3054F));

		PartDefinition neck = head2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(215, 50).addBox(-2.05F,
				-6.0F, -2.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane = head2.addOrReplaceChild("mane", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1F, -3.0F, 5.5273F, 0.1309F, 0.0F, 0.0F));

		PartDefinition mane3 = head2.addOrReplaceChild("mane3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.2F, -3.0F, 5.5273F, 0.1309F, 0.0F, 0.0F));

		PartDefinition mane5 = head2.addOrReplaceChild("mane5", CubeListBuilder.create().texOffs(155, 199)
				.addBox(-2.2F, -8.9478F, -1.5034F, 3.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(194, 213)
				.addBox(-0.8F, -8.9478F, -3.5034F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(166, 207)
				.addBox(-0.7F, -8.9478F, -1.5034F, 3.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(192, 196)
				.addBox(-0.7F, -3.9478F, -2.9034F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(140, 199)
				.addBox(-2.2F, -3.9478F, -2.9034F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(98, 200)
				.addBox(-2.2F, -0.9478F, -3.5034F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(197, 148)
				.addBox(-0.7F, -0.9478F, -3.5034F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -3.1F, 5.7273F, 0.1309F, 0.0F, 0.0F));

		PartDefinition mane2 = head2.addOrReplaceChild("mane2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1F, -7.9572F, 4.8747F, 1.6581F, 0.0F, 0.0F));

		PartDefinition mane4 = head2.addOrReplaceChild("mane4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.2F, -7.9572F, 4.8747F, 1.6581F, 0.0F, 0.0F));

		PartDefinition mane6 = head2.addOrReplaceChild("mane6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1F, -8.0572F, 5.0747F, 1.6581F, 0.0F, 0.0F));

		PartDefinition body2 = horse.addOrReplaceChild("body2",
				CubeListBuilder.create().texOffs(6, 198)
						.addBox(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.05F)).texOffs(128, 248)
						.addBox(-1.0F, -4.0F, -17.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(241, 108)
						.addBox(0.1F, -4.0F, -17.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(241, 113)
						.addBox(-5.1F, -4.0F, -17.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offset(4.0F, -3.0F, -2.0F));

		PartDefinition body_r19 = body2.addOrReplaceChild("body_r19",
				CubeListBuilder.create().texOffs(90, 177)
						.addBox(-0.5F, -1.0F, -2.5F, -1.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(202, 182)
						.addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(184, 155)
						.addBox(-5.7F, -1.0F, -2.5F, 5.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.6F, -10.6466F, -7.3659F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r20 = body2.addOrReplaceChild("body_r20",
				CubeListBuilder.create().texOffs(45, 168)
						.addBox(-1.5F, -1.0F, -2.5F, 1.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(240, 230)
						.addBox(-0.7266F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)).texOffs(192, 221)
						.addBox(-5.9599F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.8599F, -10.6466F, -4.6992F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r21 = body2.addOrReplaceChild("body_r21",
				CubeListBuilder.create().texOffs(183, 21)
						.addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)).texOffs(127, 198)
						.addBox(-5.7333F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.6333F, -10.6466F, -1.3659F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r22 = body2.addOrReplaceChild("body_r22",
				CubeListBuilder.create().texOffs(65, 163)
						.addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)).texOffs(211, 76)
						.addBox(4.7333F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-4.6F, -3.2466F, -1.3659F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r23 = body2.addOrReplaceChild("body_r23",
				CubeListBuilder.create().texOffs(181, 119)
						.addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)).texOffs(150, 169)
						.addBox(-5.7333F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.6333F, -3.2466F, -4.6992F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r24 = body2.addOrReplaceChild("body_r24",
				CubeListBuilder.create().texOffs(109, 173).addBox(-2.5F, -2.0F, -2.5F, 9.0F, 7.0F, -8.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-1.9333F, -10.8466F, -4.6992F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r25 = body2.addOrReplaceChild("body_r25",
				CubeListBuilder.create().texOffs(85, 209)
						.addBox(-0.5F, -1.0F, 7.5F, 1.0F, 2.0F, -10.0F, new CubeDeformation(0.05F)).texOffs(21, 175)
						.addBox(-9.7F, -1.0F, 7.5F, 1.0F, 2.0F, -10.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(4.6F, -3.937F, -13.6733F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail = horse.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(214, 145).addBox(-1.5F, -0.6667F, 0.0F, 3.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -10.3333F, 3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1",
				CubeListBuilder.create().texOffs(226, 250).addBox(-1.5F, 1.3706F, -1.7299F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.9983F, 1.5856F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail_r2 = tail.addOrReplaceChild("tail_r2",
				CubeListBuilder.create().texOffs(245, 206).addBox(-1.5F, -1.2875F, -1.3923F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.9983F, 1.5856F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail_r3 = tail.addOrReplaceChild("tail_r3",
				CubeListBuilder.create().texOffs(162, 248).addBox(-1.5F, -4.8833F, -1.678F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.9983F, 1.5856F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail_r4 = tail.addOrReplaceChild("tail_r4",
				CubeListBuilder.create().texOffs(137, 248).addBox(-1.5F, -4.8833F, -1.678F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.7483F, 4.2731F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r5 = tail.addOrReplaceChild("tail_r5",
				CubeListBuilder.create().texOffs(245, 200).addBox(-1.5F, -1.2875F, -1.3923F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.7483F, 4.2731F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail_r6 = tail.addOrReplaceChild("tail_r6",
				CubeListBuilder.create().texOffs(215, 250).addBox(-1.5F, 1.3706F, -1.7299F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.7483F, 4.2731F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail_r7 = tail.addOrReplaceChild("tail_r7",
				CubeListBuilder.create().texOffs(245, 212).addBox(-1.5F, 1.3706F, -1.7299F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3147F, 4.7809F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail_r8 = tail.addOrReplaceChild("tail_r8",
				CubeListBuilder.create().texOffs(245, 194).addBox(-1.5F, -1.2875F, -1.3923F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3147F, 4.7809F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail_r9 = tail.addOrReplaceChild("tail_r9",
				CubeListBuilder.create().texOffs(243, 137).addBox(-1.5F, -4.8833F, -1.678F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3147F, 4.7809F, 0.48F, 0.0F, 0.0F));

		PartDefinition front_left_leg = horse.addOrReplaceChild("front_left_leg", CubeListBuilder.create()
				.texOffs(115, 231).addBox(-3.0F, -1.0F, -1.9F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -17.0F));

		PartDefinition front_left_leg2 = front_left_leg.addOrReplaceChild("front_left_leg2", CubeListBuilder.create()
				.texOffs(185, 233).addBox(-2.0F, -0.1F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 5.1F, 0.1F));

		PartDefinition front_right_leg = horse.addOrReplaceChild("front_right_leg", CubeListBuilder.create()
				.texOffs(149, 231).addBox(-1.0F, -1.0F, -1.9F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -17.0F));

		PartDefinition front_right_leg2 = front_right_leg.addOrReplaceChild("front_right_leg2", CubeListBuilder.create()
				.texOffs(228, 194).addBox(-2.0F, -0.2F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 5.2F, 0.1F));

		PartDefinition back_left_leg = horse.addOrReplaceChild("back_left_leg", CubeListBuilder.create()
				.texOffs(203, 231).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition back_left_leg2 = back_left_leg.addOrReplaceChild("back_left_leg2", CubeListBuilder.create()
				.texOffs(228, 204).addBox(-2.0F, -0.1F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 5.1F, 1.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}