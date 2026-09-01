// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmadeival_buyer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "madeival_buyer"), "main");
	private final ModelPart whole;
	private final ModelPart LeftLeg;
	private final ModelPart LeftLeg2;
	private final ModelPart Waist;
	private final ModelPart Head;
	private final ModelPart eyebrow;
	private final ModelPart EyeR;
	private final ModelPart Head2;
	private final ModelPart eyeL;
	private final ModelPart Head3;
	private final ModelPart mouth;
	private final ModelPart smile_frown;
	private final ModelPart frown_L;
	private final ModelPart frown_R;
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart LeftArm2;
	private final ModelPart LeftArm3;
	private final ModelPart RightArm;
	private final ModelPart RightArm2;
	private final ModelPart RightLeg;
	private final ModelPart RightLeg2;

	public Modelmadeival_buyer(ModelPart root) {
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

		PartDefinition whole = partdefinition.addOrReplaceChild("whole", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = whole
				.addOrReplaceChild("LeftLeg",
						CubeListBuilder.create().texOffs(75, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(0, 64)
				.addBox(-2.0117F, -0.1667F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 0)
				.addBox(-2.0117F, 4.8333F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(73, 11)
				.addBox(-1.9766F, 3.8333F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(73, 11)
				.addBox(-2.0766F, 3.8333F, -2.2578F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(33, 0)
				.addBox(-2.1117F, 4.8333F, -4.3711F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));

		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(),
				PartPose.offset(-2.4F, 1.0F, 0.0F));

		PartDefinition Head = Waist.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(6, 7)
						.addBox(-4.5F, -3.5F, 0.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-4.25F, -7.0F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(51, 84)
						.addBox(-4.25F, -8.2773F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 85)
						.addBox(0.2719F, -8.2773F, 3.1F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 78)
						.addBox(-4.25F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(19, 40)
						.addBox(-4.25F, -3.0F, 1.5667F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 39)
						.addBox(3.3333F, -3.0F, 1.5667F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 46)
						.addBox(3.2833F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(19, 44)
						.addBox(3.2833F, -7.0F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(54, 17)
						.addBox(3.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(54, 28)
						.addBox(2.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 44)
						.addBox(1.2833F, -8.3F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(0.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 56)
						.addBox(-4.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 56)
						.addBox(-3.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-2.244F, -8.3F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(57, 39)
						.addBox(-1.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(57, 50)
						.addBox(-0.544F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, -5.4547F, -3.7859F, -0.1732F, -0.032F, 0.0473F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, -6.4039F, -3.7859F, -0.1732F, -0.032F, 0.0473F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7612F, -5.4547F, -3.7859F, -0.1732F, -0.032F, 0.0473F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7612F, -6.4039F, -3.7859F, -0.1732F, -0.032F, 0.0473F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7037F, -2.2803F, -1.7744F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9061F, -3.4742F, -4.0948F, -3.0542F, 0.0057F, 3.0108F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5294F, -1.0922F, -1.7912F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9061F, -3.4742F, -4.0948F, -3.1415F, 0.0057F, 3.0108F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3225F, -0.2183F, -1.8107F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9061F, -3.4742F, -4.0948F, -3.0106F, 0.0057F, 3.0108F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.5369F, -1.3843F, -3.1888F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.4431F, -1.2532F, 0.1212F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, -3.098F, 0.0F, 3.0107F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.6924F, -2.0762F, -3.3103F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.65F, -2.3704F, -0.0109F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, 3.0543F, 0.0F, 3.0107F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.8234F, -3.3995F, -3.202F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.8243F, -3.3984F, 0.1105F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, -3.1416F, 0.0F, 3.0107F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11",
				CubeListBuilder.create().texOffs(26, 40).addBox(-1.0397F, -3.478F, -2.0558F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, -3.0986F, 0.0076F, 2.9672F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.8654F, -2.2609F, -2.1759F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, 3.0973F, 0.0076F, 2.9672F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6585F, -1.4272F, -2.0396F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, -3.055F, 0.0076F, 2.9672F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.616F, -1.1434F, -1.0571F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, 3.0993F, -0.0151F, 2.9677F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.8229F, -2.1077F, -1.1647F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, 2.9684F, -0.0151F, 2.9677F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.9973F, -3.2373F, -1.0618F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, 3.0556F, -0.0151F, 2.9677F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.7452F, -2.38F, 0.4839F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.9099F, -3.5101F, 3.2728F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.6319F, -1.4088F, 2.9936F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.7586F, -2.43F, 1.6624F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, 3.0992F, -0.0113F, 3.0112F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.5709F, -1.3885F, 0.4498F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.7356F, -2.7573F, 3.1296F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.5843F, -1.541F, 1.6196F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, 3.0119F, -0.0113F, 3.0112F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5084F, -1.5404F, -0.7213F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9061F, -2.8742F, 2.3052F, -3.1404F, -0.0113F, 3.0112F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.5218F, -1.539F, 0.4583F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.3951F, -0.4607F, 1.7437F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9061F, -3.4742F, 2.9052F, -3.1404F, -0.0113F, 3.0112F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6367F, -1.0878F, 1.4301F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, -3.0114F, 0.0114F, 2.9676F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6656F, -1.2026F, 2.186F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, -3.1404F, -0.0113F, 2.9675F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.8725F, -2.5898F, 2.0429F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, 3.0119F, -0.0113F, 2.9675F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.8436F, -2.3773F, 1.3084F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, 3.1408F, 0.0114F, 2.9676F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25",
				CubeListBuilder.create().texOffs(26, 40).addBox(-1.0179F, -3.2902F, 1.4253F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, -3.0551F, 0.0114F, 2.9676F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26",
				CubeListBuilder.create().texOffs(26, 40).addBox(-1.0468F, -3.4379F, 2.1756F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, 3.0992F, -0.0113F, 2.9675F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.8576F, -3.0714F, 4.2082F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, -3.0542F, 0.0057F, 3.0108F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6833F, -2.4018F, 4.0997F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, -3.1415F, 0.0057F, 3.0108F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6775F, -1.8817F, 2.7745F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9061F, -3.4742F, 2.9052F, -3.0542F, 0.0057F, 3.0108F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.4764F, -0.7478F, 4.2007F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -4.803F, 0.0762F, -3.0106F, 0.0057F, 3.0108F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.602F, -1.7965F, 1.7012F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9061F, -3.4742F, 2.9052F, 3.0119F, -0.0113F, 3.0112F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32",
				CubeListBuilder.create().texOffs(19, 40).addBox(-0.3908F, 1.803F, 1.4904F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8908F, -5.803F, 0.0762F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.8991F, -3.5115F, 3.2728F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.6211F, -1.4102F, 2.9937F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.8468F, -3.0728F, 4.2082F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.5018F, -0.4666F, 3.825F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.528F, -0.8652F, -0.7239F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.6145F, 1.4399F, 1.5267F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.6724F, -2.4032F, 4.0996F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.3274F, 0.2264F, 3.945F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.3537F, 0.2259F, -0.6213F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.5272F, 1.4399F, 1.5267F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.1206F, 1.8378F, 3.7043F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.4655F, -0.7492F, 4.2008F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.1468F, 1.2412F, -0.8229F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.6581F, 1.4399F, 1.5267F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37",
				CubeListBuilder.create().texOffs(26, 40).addBox(-1.036F, -3.4398F, 2.1756F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.5927F, 1.3964F, 1.6361F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38",
				CubeListBuilder.create().texOffs(26, 40).addBox(-1.0071F, -3.2921F, 1.4254F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.5927F, 1.3964F, 1.5052F));

		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.8134F, -3.3998F, 0.1105F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.8126F, -3.401F, -3.202F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.9865F, -3.2392F, -1.0618F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.5708F, 1.3963F, 1.6581F));

		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41",
				CubeListBuilder.create().texOffs(26, 40).addBox(-1.0289F, -3.4799F, -2.0559F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.5708F, 1.3963F, 1.5272F));

		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.6815F, -2.0776F, -3.3104F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.6391F, -2.3718F, -0.011F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.4835F, 1.4399F, 1.5708F));

		PartDefinition Head_r43 = Head.addOrReplaceChild("Head_r43",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.8546F, -2.2628F, -2.1761F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.4835F, 1.3963F, 1.5272F));

		PartDefinition Head_r44 = Head.addOrReplaceChild("Head_r44",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.8122F, -2.1096F, -1.1649F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.4835F, 1.3963F, 1.6581F));

		PartDefinition Head_r45 = Head.addOrReplaceChild("Head_r45",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.833F, -1.4905F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r46 = Head.addOrReplaceChild("Head_r46",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4575F, -4.3531F, 3.6828F, 0.131F, -0.0057F, 0.1308F));

		PartDefinition Head_r47 = Head.addOrReplaceChild("Head_r47",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.833F, -1.4905F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r48 = Head.addOrReplaceChild("Head_r48",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3532F, -0.2209F, 0.4499F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.833F, -1.4905F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r49 = Head.addOrReplaceChild("Head_r49",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3532F, -0.221F, 0.4499F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8916F, -1.9827F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r50 = Head.addOrReplaceChild("Head_r50",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8916F, -1.9827F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r51 = Head.addOrReplaceChild("Head_r51",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5161F, -4.8453F, 3.6828F, 0.131F, -0.0057F, 0.1308F));

		PartDefinition Head_r52 = Head.addOrReplaceChild("Head_r52",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8916F, -1.9827F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r53 = Head.addOrReplaceChild("Head_r53",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8095F, -1.5999F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r54 = Head.addOrReplaceChild("Head_r54",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4341F, -4.4625F, 3.6828F, 0.131F, -0.0057F, 0.1308F));

		PartDefinition Head_r55 = Head.addOrReplaceChild("Head_r55",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8095F, -1.5999F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r56 = Head.addOrReplaceChild("Head_r56",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3532F, -0.221F, 0.4499F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8095F, -1.5999F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r57 = Head.addOrReplaceChild("Head_r57",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3532F, -0.2209F, 0.4499F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6259F, -2.553F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r58 = Head.addOrReplaceChild("Head_r58",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6259F, -2.553F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r59 = Head.addOrReplaceChild("Head_r59",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2505F, -5.4156F, 3.6828F, 0.131F, -0.0057F, 0.1308F));

		PartDefinition Head_r60 = Head.addOrReplaceChild("Head_r60",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6259F, -2.553F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r61 = Head.addOrReplaceChild("Head_r61",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6436F, -1.9124F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r62 = Head.addOrReplaceChild("Head_r62",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.019F, -4.775F, 3.6828F, 0.131F, -0.0057F, 0.1308F));

		PartDefinition Head_r63 = Head.addOrReplaceChild("Head_r63",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6436F, -1.9124F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r64 = Head.addOrReplaceChild("Head_r64",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3532F, -0.221F, 0.4499F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6436F, -1.9124F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r65 = Head.addOrReplaceChild("Head_r65",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3532F, -0.221F, 0.4499F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2374F, -1.9124F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r66 = Head.addOrReplaceChild("Head_r66",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2374F, -1.9124F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r67 = Head.addOrReplaceChild("Head_r67",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6128F, -4.775F, 3.6828F, 0.131F, -0.0057F, 0.1308F));

		PartDefinition Head_r68 = Head.addOrReplaceChild("Head_r68",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2374F, -1.9124F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r69 = Head.addOrReplaceChild("Head_r69",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4991F, -2.2678F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r70 = Head.addOrReplaceChild("Head_r70",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4991F, -2.2678F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r71 = Head.addOrReplaceChild("Head_r71",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.4322F, -1.2546F, 0.1212F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4991F, -3.2639F, 3.709F, 1.6144F, 1.4399F, 1.5708F));

		PartDefinition Head_r72 = Head.addOrReplaceChild("Head_r72",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3532F, -0.2209F, 0.4499F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4991F, -2.2678F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r73 = Head.addOrReplaceChild("Head_r73",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3532F, -0.221F, 0.4499F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1709F, -3.2639F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r74 = Head.addOrReplaceChild("Head_r74",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.4322F, -1.2546F, 0.1212F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1709F, -3.2639F, 3.709F, 1.6144F, 1.4399F, 1.5708F));

		PartDefinition Head_r75 = Head.addOrReplaceChild("Head_r75",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1709F, -3.2639F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r76 = Head.addOrReplaceChild("Head_r76",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1709F, -3.2639F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r77 = Head.addOrReplaceChild("Head_r77",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.79F, -3.2639F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r78 = Head.addOrReplaceChild("Head_r78",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.79F, -3.2639F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r79 = Head.addOrReplaceChild("Head_r79",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.4322F, -1.2546F, 0.1212F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.79F, -3.2639F, 3.709F, 1.6144F, 1.4399F, 1.5708F));

		PartDefinition Head_r80 = Head.addOrReplaceChild("Head_r80",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3532F, -0.221F, 0.4499F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.79F, -3.2639F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r81 = Head.addOrReplaceChild("Head_r81",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3532F, -0.221F, 0.4499F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.415F, -3.2639F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r82 = Head.addOrReplaceChild("Head_r82",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.4322F, -1.2546F, 0.1212F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.415F, -3.2639F, 3.709F, 1.6144F, 1.4399F, 1.5708F));

		PartDefinition Head_r83 = Head.addOrReplaceChild("Head_r83",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.415F, -3.2639F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r84 = Head.addOrReplaceChild("Head_r84",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.7344F, -2.3815F, 0.4839F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.415F, -3.2639F, 3.709F, 1.6145F, 1.4399F, 1.6576F));

		PartDefinition Head_r85 = Head.addOrReplaceChild("Head_r85",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.8328F, -2.3792F, 1.3083F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.5054F, 1.3964F, 1.5052F));

		PartDefinition Head_r86 = Head.addOrReplaceChild("Head_r86",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.8617F, -2.5917F, 2.0427F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.5054F, 1.3964F, 1.6361F));

		PartDefinition Head_r87 = Head.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.7248F, -2.7588F, 3.1295F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.5601F, -1.3899F, 0.4498F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.4468F, -0.6411F, 3.0346F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.5272F, 1.4399F, 1.6576F));

		PartDefinition Head_r88 = Head.addOrReplaceChild("Head_r88",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6259F, -1.0897F, 1.4302F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.6363F, 1.3964F, 1.5052F));

		PartDefinition Head_r89 = Head.addOrReplaceChild("Head_r89",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6548F, -1.2045F, 2.1861F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.6363F, 1.3964F, 1.6361F));

		PartDefinition Head_r90 = Head.addOrReplaceChild("Head_r90",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6053F, -1.1453F, -1.057F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.6144F, 1.3963F, 1.6581F));

		PartDefinition Head_r91 = Head.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.3532F, -0.2209F, 0.4499F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.3665F, -0.2195F, 1.6295F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.2399F, 0.8588F, 2.9149F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.5179F, -1.2283F, 3.2854F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.6581F, 1.4399F, 1.6576F));

		PartDefinition Head_r92 = Head.addOrReplaceChild("Head_r92",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6477F, -1.4291F, -2.0396F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.6144F, 1.3963F, 1.5272F));

		PartDefinition Head_r93 = Head.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(26, 40)
				.addBox(-0.526F, -1.3857F, -3.1887F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
				.addBox(-0.4322F, -1.2546F, 0.1212F, 1.0F, 2.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0947F, -4.803F, 3.709F, 1.6144F, 1.4399F, 1.5708F));

		PartDefinition Head_r94 = Head.addOrReplaceChild("Head_r94",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4529F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -5.107F, 0.0734F, 0.0012F, 0.0113F, 0.1304F));

		PartDefinition Head_r95 = Head.addOrReplaceChild("Head_r95",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -5.107F, 0.0734F, -0.0424F, 0.0113F, 0.1304F));

		PartDefinition Head_r96 = Head.addOrReplaceChild("Head_r96",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.4919F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -5.107F, 0.0734F, -0.1297F, 0.0113F, 0.1304F));

		PartDefinition Head_r97 = Head.addOrReplaceChild("Head_r97",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.4919F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -5.107F, 1.2531F, -0.1297F, 0.0113F, 0.1304F));

		PartDefinition Head_r98 = Head.addOrReplaceChild("Head_r98",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -5.107F, 1.2531F, -0.0424F, 0.0113F, 0.1304F));

		PartDefinition Head_r99 = Head.addOrReplaceChild("Head_r99",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -5.107F, 1.2531F, 0.0012F, 0.0113F, 0.1304F));

		PartDefinition Head_r100 = Head.addOrReplaceChild("Head_r100",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4529F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -4.0211F, 2.5383F, 0.0012F, 0.0113F, 0.1304F));

		PartDefinition Head_r101 = Head.addOrReplaceChild("Head_r101",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -4.0211F, 2.5383F, -0.0424F, 0.0113F, 0.1304F));

		PartDefinition Head_r102 = Head.addOrReplaceChild("Head_r102",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.492F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -4.0211F, 2.5383F, -0.1297F, 0.0113F, 0.1304F));

		PartDefinition Head_r103 = Head.addOrReplaceChild("Head_r103",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4529F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -3.4742F, -1.0359F, 0.131F, -0.0057F, 0.1308F));

		PartDefinition Head_r104 = Head.addOrReplaceChild("Head_r104",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.492F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -3.4742F, -1.0359F, 0.0001F, -0.0057F, 0.1308F));

		PartDefinition Head_r105 = Head.addOrReplaceChild("Head_r105",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -3.4742F, -1.0359F, 0.0874F, -0.0057F, 0.1308F));

		PartDefinition Head_r106 = Head.addOrReplaceChild("Head_r106",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.492F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -3.4742F, 3.5305F, 0.0001F, -0.0057F, 0.1308F));

		PartDefinition Head_r107 = Head.addOrReplaceChild("Head_r107",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -3.4742F, 3.5305F, 0.0874F, -0.0057F, 0.1308F));

		PartDefinition Head_r108 = Head.addOrReplaceChild("Head_r108",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -3.4742F, 3.5305F, 0.131F, -0.0057F, 0.1308F));

		PartDefinition Head_r109 = Head.addOrReplaceChild("Head_r109",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -5.1305F, 3.6828F, 0.131F, -0.0057F, 0.1308F));

		PartDefinition Head_r110 = Head.addOrReplaceChild("Head_r110",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -6.1266F, 3.6828F, 0.0874F, -0.0057F, 0.1308F));

		PartDefinition Head_r111 = Head.addOrReplaceChild("Head_r111",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.492F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -6.1266F, 3.6828F, 0.0001F, -0.0057F, 0.1308F));

		PartDefinition Head_r112 = Head.addOrReplaceChild("Head_r112",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.492F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -6.1266F, 2.9094F, -0.1297F, 0.0113F, 0.1304F));

		PartDefinition Head_r113 = Head.addOrReplaceChild("Head_r113",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -6.1266F, 2.9094F, -0.0424F, 0.0113F, 0.1304F));

		PartDefinition Head_r114 = Head.addOrReplaceChild("Head_r114",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8745F, -6.1266F, 2.9094F, 0.0012F, 0.0113F, 0.1304F));

		PartDefinition Head_r115 = Head.addOrReplaceChild("Head_r115",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9682F, -6.1266F, 1.8117F, 0.0012F, 0.0113F, 0.174F));

		PartDefinition Head_r116 = Head.addOrReplaceChild("Head_r116",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9682F, -6.1266F, 1.8117F, -0.0424F, 0.0113F, 0.174F));

		PartDefinition Head_r117 = Head.addOrReplaceChild("Head_r117",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.4919F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9682F, -6.1266F, 1.8117F, -0.1297F, 0.0113F, 0.174F));

		PartDefinition Head_r118 = Head.addOrReplaceChild("Head_r118",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.492F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9682F, -6.1266F, 0.8898F, -0.0007F, -0.0114F, 0.174F));

		PartDefinition Head_r119 = Head.addOrReplaceChild("Head_r119",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9682F, -6.1266F, 0.8898F, 0.0865F, -0.0114F, 0.174F));

		PartDefinition Head_r120 = Head.addOrReplaceChild("Head_r120",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9682F, -6.1266F, 0.8898F, 0.1302F, -0.0114F, 0.174F));

		PartDefinition Head_r121 = Head.addOrReplaceChild("Head_r121",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8198F, -6.1266F, -0.3133F, 0.0436F, 0.0F, 0.1309F));

		PartDefinition Head_r122 = Head.addOrReplaceChild("Head_r122",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8198F, -6.1266F, -0.3133F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r123 = Head.addOrReplaceChild("Head_r123",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.4919F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8198F, -6.1266F, -0.3133F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition Head_r124 = Head.addOrReplaceChild("Head_r124",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.4919F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9604F, -6.1266F, -1.3758F, -0.1732F, 0.0151F, 0.1739F));

		PartDefinition Head_r125 = Head.addOrReplaceChild("Head_r125",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9604F, -6.1266F, -1.3758F, -0.0859F, 0.0151F, 0.1739F));

		PartDefinition Head_r126 = Head.addOrReplaceChild("Head_r126",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9604F, -6.1266F, -1.3758F, -0.0423F, 0.0151F, 0.1739F));

		PartDefinition Head_r127 = Head.addOrReplaceChild("Head_r127",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.3094F, 0.08F, 0.4528F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9604F, -6.1266F, -2.5398F, 0.0866F, -0.0076F, 0.1744F));

		PartDefinition Head_r128 = Head.addOrReplaceChild("Head_r128",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.6906F, -2.081F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9604F, -6.1266F, -2.5398F, 0.043F, -0.0076F, 0.1744F));

		PartDefinition Head_r129 = Head.addOrReplaceChild("Head_r129",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5163F, -1.092F, 0.4919F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9604F, -6.1266F, -2.5398F, -0.0443F, -0.0076F, 0.1744F));

		PartDefinition Head_r130 = Head.addOrReplaceChild("Head_r130",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8667F, -5.0289F, -3.6258F, 0.0436F, 0.0F, 0.1309F));

		PartDefinition Head_r131 = Head.addOrReplaceChild("Head_r131",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8667F, -6.2203F, -3.6258F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition Head_r132 = Head.addOrReplaceChild("Head_r132",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8667F, -7.2242F, -3.6258F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r133 = Head.addOrReplaceChild("Head_r133",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7612F, -7.2242F, -3.7859F, -0.1732F, -0.032F, 0.0473F));

		PartDefinition Head_r134 = Head.addOrReplaceChild("Head_r134",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9448F, -7.2242F, -3.7156F, -0.086F, -0.032F, 0.0473F));

		PartDefinition Head_r135 = Head.addOrReplaceChild("Head_r135",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9331F, -7.2242F, -3.7156F, -0.0829F, -0.0394F, -0.0397F));

		PartDefinition Head_r136 = Head.addOrReplaceChild("Head_r136",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0425F, -7.2242F, -3.7977F, -0.1745F, 0.0058F, 0.2182F));

		PartDefinition Head_r137 = Head.addOrReplaceChild("Head_r137",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1424F, -7.2242F, -3.6977F, -0.0436F, 0.0058F, 0.2182F));

		PartDefinition Head_r138 = Head.addOrReplaceChild("Head_r138",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.549F, -7.2242F, -3.6977F, -0.0433F, -0.0076F, -0.0869F));

		PartDefinition Head_r139 = Head.addOrReplaceChild("Head_r139",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.549F, -7.2242F, -3.6977F, -0.0872F, 0.0038F, 0.0435F));

		PartDefinition Head_r140 = Head.addOrReplaceChild("Head_r140",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7833F, -6.8492F, -3.6977F, -0.0872F, -0.0038F, -0.0435F));

		PartDefinition Head_r141 = Head.addOrReplaceChild("Head_r141",
				CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7833F, -7.2492F, -3.6977F, -0.0872F, 0.0038F, 0.0435F));

		PartDefinition Head_r142 = Head.addOrReplaceChild("Head_r142",
				CubeListBuilder.create().texOffs(45, 85).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0833F, -2.9F, -3.6469F, -0.1309F, 0.0F, 0.0F));

		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow", CubeListBuilder.create(),
				PartPose.offset(3.8333F, 24.6F, -0.0258F));

		PartDefinition Head_r143 = eyebrow.addOrReplaceChild("Head_r143",
				CubeListBuilder.create().texOffs(24, 86)
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 14)
						.addBox(2.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, -29.45F, -3.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition EyeR = Head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(56, 11).addBox(-1.15F,
				-0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.65F, -3.9F, -3.5316F));

		PartDefinition Head2 = EyeR.addOrReplaceChild("Head2", CubeListBuilder.create().texOffs(87, 74).addBox(-0.5F,
				-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.15F, 0.0F, -0.0059F));

		PartDefinition eyeL = Head.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(56, 14).addBox(-0.875F,
				-0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.7083F, -3.9F, -3.5316F));

		PartDefinition Head3 = eyeL.addOrReplaceChild("Head3", CubeListBuilder.create().texOffs(87, 71).addBox(-0.5F,
				-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, 0.0F, -0.0059F));

		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(103, 12).addBox(-1.0F,
				-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0833F, -1.3833F, -3.5258F));

		PartDefinition smile_frown = mouth.addOrReplaceChild("smile_frown", CubeListBuilder.create(),
				PartPose.offset(2.0F, 28.5F, 3.5F));

		PartDefinition frown_L = smile_frown.addOrReplaceChild("frown_L",
				CubeListBuilder.create().texOffs(103, 12).addBox(-0.0273F, -1.2016F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9727F, -27.7984F, -3.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition frown_R = smile_frown.addOrReplaceChild("frown_R",
				CubeListBuilder.create().texOffs(103, 12).addBox(-1.0017F, -1.193F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0401F, -27.8112F, -3.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(29, 17)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.5F, 2.0F, -2.5F, 9.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(73, 34)
						.addBox(-4.5156F, 13.0F, -2.2F, 9.0F, -1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 31)
						.addBox(-4.5156F, 13.0F, -0.7F, 9.0F, -1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-4.6F, 7.0F, -2.4F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(76, 54)
						.addBox(2.7F, 7.0F, -2.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 84)
						.addBox(2.7F, 7.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(33, 10)
						.addBox(-3.3F, 7.0F, -2.6F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(79, 84)
						.addBox(-4.6F, 7.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-4.5F, -0.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 76)
						.addBox(1.5F, -0.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(76, 36).addBox(-3.0F, -3.0F, -0.5F, 6.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3F, 11.0F, -2.2172F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(117, 27).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3961F, 8.7422F, 2.65F, -1.3919F, -0.2489F, 0.1521F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(117, 27).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7211F, 8.7422F, 2.7984F, -1.2925F, -0.1274F, -0.3669F));

		PartDefinition Body_r4 = Body
				.addOrReplaceChild("Body_r4",
						CubeListBuilder.create().texOffs(118, 28).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.1F, 7.5F, 1.9F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(11, 86).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.668F, 1.9128F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(32, 85).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6641F, 1.9128F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(73, 20)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 20)
						.addBox(2.1F, -2.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 23)
						.addBox(-1.0F, -2.0F, -2.1F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 23)
						.addBox(-1.0F, -2.0F, 1.1F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 20)
						.addBox(-1.1F, -2.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.5F, -11.0F, 0.0F));

		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(17, 67).addBox(
				-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));

		PartDefinition LeftArm3 = LeftArm2.addOrReplaceChild("LeftArm3",
				CubeListBuilder.create().texOffs(121, 61)
						.addBox(-1.0333F, -0.5F, 1.5F, 2.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(120, 60)
						.addBox(-1.2333F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(120, 60)
						.addBox(0.2667F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0333F, 4.5F, 0.1667F));

		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(73, 76)
						.addBox(-1.0F, -2.0F, -2.1F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 76)
						.addBox(-1.0F, -2.0F, 1.1F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 73)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(73, 73)
						.addBox(2.1F, -2.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(73, 73)
						.addBox(-0.6F, -2.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.5F, -11.0F, 0.0F));

		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(53, 73)
				.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 4.5F, 0.0F));

		PartDefinition RightLeg = whole
				.addOrReplaceChild("RightLeg",
						CubeListBuilder.create().texOffs(74, 61).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(57, 61)
						.addBox(-2.0117F, 0.0F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(27, 34)
						.addBox(-2.0117F, 5.0F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(34, 67)
						.addBox(-1.9766F, 4.0F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 67)
						.addBox(-2.0766F, 4.0F, -2.2578F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(27, 34)
						.addBox(-2.1117F, 5.0F, -4.3711F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.0F, -0.6289F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		whole.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}