// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcivilian4<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "civilian4"), "main");
	private final ModelPart whole;
	private final ModelPart LeftLeg;
	private final ModelPart LeftLeg2;
	private final ModelPart RightLeg;
	private final ModelPart RightLeg2;
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
	private final ModelPart LeftArm4;
	private final ModelPart LeftArm3;
	private final ModelPart RightArm;
	private final ModelPart RightArm2;
	private final ModelPart LeftArm5;

	public Modelcivilian4(ModelPart root) {
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
		this.smile_frown = this.mouth.getChild("smile_frown");
		this.frown_L = this.smile_frown.getChild("frown_L");
		this.frown_R = this.smile_frown.getChild("frown_R");
		this.Body = this.Waist.getChild("Body");
		this.LeftArm = this.Waist.getChild("LeftArm");
		this.LeftArm2 = this.LeftArm.getChild("LeftArm2");
		this.LeftArm4 = this.LeftArm2.getChild("LeftArm4");
		this.LeftArm3 = this.LeftArm2.getChild("LeftArm3");
		this.RightArm = this.Waist.getChild("RightArm");
		this.RightArm2 = this.RightArm.getChild("RightArm2");
		this.LeftArm5 = this.RightArm2.getChild("LeftArm5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition whole = partdefinition.addOrReplaceChild("whole", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = whole
				.addOrReplaceChild("LeftLeg",
						CubeListBuilder.create().texOffs(48, 30).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(78, 33)
				.addBox(-2.0117F, -0.1667F, -1.3711F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
				.addBox(-2.0117F, 4.8333F, -2.3711F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
				.addBox(-2.0117F, 5.8333F, -4.2711F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));

		PartDefinition LeftLeg_r1 = LeftLeg2.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(93, 33).addBox(0.5401F, -0.9695F, -2.7084F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5522F, 5.8269F, -2.1836F, 0.436F, 0.0184F, 0.0041F));

		PartDefinition RightLeg = whole.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(79, 0)
				.addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.3333F, 0.0F, 0.0F));

		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2", CubeListBuilder.create().texOffs(79, 45)
				.addBox(-2.0117F, -0.1667F, -1.3711F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 86)
				.addBox(-2.0117F, 4.8333F, -2.3711F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(92, 79)
				.addBox(-2.0117F, 5.8333F, -4.2711F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));

		PartDefinition right_r1 = RightLeg2.addOrReplaceChild("right_r1",
				CubeListBuilder.create().texOffs(91, 92).addBox(-3.5177F, -0.5054F, -1.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.506F, 5.9253F, -3.517F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(),
				PartPose.offset(-2.4F, 1.0F, 0.0F));

		PartDefinition Head = Waist.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(33, 12)
						.addBox(-4.5F, -3.0F, -1.75F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 17)
						.addBox(0.4336F, -8.1055F, -4.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.4484F, -8.1055F, -4.5F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(21, 29)
						.addBox(-4.4484F, -6.1055F, -3.5F, 5.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(-4.4488F, -6.1055F, 0.5F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 0)
						.addBox(-0.5484F, -6.1055F, -3.5F, 5.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(71, 11)
						.addBox(-0.5484F, -6.1055F, 0.5F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(94, 53).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0833F, -2.4F, -3.6469F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(92, 75).addBox(-3.0F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.427F, -7.6308F, -3.5F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(17, 82)
						.addBox(-0.5F, -4.5F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-0.5F, -4.5F, 6.25F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 92)
						.addBox(-0.5F, -4.5F, -1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -3.7F, -3.5F, 0.0F, 0.0F, 0.0436F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(68, 31)
				.addBox(-0.4286F, -5.4627F, 0.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.4159F, -3.4773F, -0.1738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5313F, -1.9937F, -0.3692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5186F, -0.0084F, -0.6305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5841F, 1.4773F, -0.8261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5714F, 3.4627F, -1.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6777F, -2.6146F, 4.5891F, 0.1314F, 0.0865F, 0.0114F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5714F, 3.4627F, -1.0875F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6777F, -1.2813F, 4.5891F, 0.1314F, 0.0865F, 0.0114F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5527F, -7.1146F, 4.3891F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4527F, -5.1146F, 4.3891F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5027F, -3.6146F, 4.3891F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4027F, -1.6146F, 4.3891F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4027F, -0.1146F, 4.3891F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3027F, 1.8854F, 4.3891F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3027F, 1.8854F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3027F, 3.2187F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4027F, -0.1146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4027F, -1.6146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5027F, -3.6146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4527F, -5.1146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5527F, -7.1146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(68, 31)
				.addBox(-0.5714F, 3.4627F, -1.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5841F, 1.4773F, -0.8261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5186F, -0.0084F, -0.6305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5313F, -1.9937F, -0.3692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.4159F, -3.4773F, -0.1738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.4286F, -5.4627F, 0.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6777F, -2.6146F, 4.5891F, 0.1314F, 0.0865F, -0.0322F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(68, 31)
				.addBox(-0.4286F, -5.4627F, 0.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.4159F, -3.4773F, -0.1738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5313F, -1.9937F, -0.3692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5186F, -0.0084F, -0.6305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5841F, 1.4773F, -0.8261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5714F, 3.4627F, -1.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5723F, -2.6146F, 4.5891F, 0.1314F, 0.0865F, -0.0322F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6973F, -7.1146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7973F, -5.1146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7473F, -3.6146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8473F, -1.6146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8473F, -0.1146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9473F, 1.8854F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5714F, 3.4627F, -1.0875F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8223F, -1.2813F, 4.5891F, 0.1314F, 0.0865F, -0.0322F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(68, 31)
				.addBox(-0.5714F, 3.4627F, -1.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5841F, 1.4773F, -0.8261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5186F, -0.0084F, -0.6305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.5313F, -1.9937F, -0.3692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.4159F, -3.4773F, -0.1738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
				.addBox(-0.4286F, -5.4627F, 0.0875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8223F, -2.6146F, 4.5891F, 0.1314F, 0.0865F, -0.0322F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0973F, -0.1146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1973F, 1.8854F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0973F, -1.6146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9973F, -3.6146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0473F, -5.1146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34",
				CubeListBuilder.create().texOffs(68, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9473F, -7.1146F, 4.3891F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35",
				CubeListBuilder.create().texOffs(63, 30)
						.addBox(-4.5F, -4.5F, -1.0F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 90)
						.addBox(-0.5F, -4.5F, -8.25F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1F, -3.7F, 3.75F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(94, 49)
				.addBox(-1.22F, -5.6298F, -4.5494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.3924F, -0.3601F, -4.5494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5254F, -1.6906F, -4.5494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.757F, -3.0037F, -4.5494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9885F, -4.3167F, -4.5494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1824F, -2.4221F, -0.0506F, 3.1416F, 0.0019F, 2.967F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(94, 49)
				.addBox(-1.2183F, -5.4926F, -3.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9868F, -4.1796F, -3.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7552F, -2.8665F, -3.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5237F, -1.5534F, -3.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.3907F, -0.223F, -3.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1824F, -2.4221F, -0.0506F, 3.098F, 0.0019F, 3.0107F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(94, 49)
				.addBox(-1.2123F, -5.7106F, -2.3476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-1.2123F, -5.5623F, 1.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.2493F, 1.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -2.9362F, 1.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5177F, -1.6231F, 1.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -3.0845F, -2.3476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.3976F, -2.3476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1824F, -2.4221F, -0.0506F, -3.098F, 0.0F, 2.9671F));

		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(94, 49)
				.addBox(-1.2123F, -5.5755F, -1.7482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-1.2123F, -5.75F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.2516F, 0.8501F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.3847F, -0.4803F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5177F, -1.8107F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -3.1238F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.4369F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -2.9493F, -1.7482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.2624F, -1.7482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5177F, -1.6363F, -1.7482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.0259F, 2.3049F, -1.7482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1824F, -2.4221F, -0.0506F, 3.098F, 0.0F, 2.9671F));

		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(94, 49)
				.addBox(-1.2123F, -5.63F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-1.2123F, -5.63F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.3169F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -3.0038F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5177F, -1.6908F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.3847F, -0.3603F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.2516F, 0.9701F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.3169F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -3.0038F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.3847F, -0.3603F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5177F, -1.6908F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(0.2172F, 3.6291F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1824F, -2.4221F, -0.0506F, -3.1416F, 0.0F, 2.9671F));

		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41",
				CubeListBuilder.create().texOffs(94, 49)
						.addBox(-0.0259F, 2.2504F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
						.addBox(0.2172F, 3.6291F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1824F, -3.7221F, 6.8994F, -3.1416F, 0.0F, 2.9671F));

		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42",
				CubeListBuilder.create().texOffs(94, 49)
						.addBox(0.2172F, 3.5091F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
						.addBox(-0.0259F, 2.1304F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1824F, -3.7221F, 6.8994F, 3.098F, 0.0F, 2.9671F));

		PartDefinition Head_r43 = Head.addOrReplaceChild("Head_r43",
				CubeListBuilder.create().texOffs(94, 49).addBox(-0.5177F, -1.6363F, -1.7483F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1824F, -1.8888F, 0.7494F, 3.098F, 0.0F, 2.9671F));

		PartDefinition Head_r44 = Head.addOrReplaceChild("Head_r44",
				CubeListBuilder.create().texOffs(94, 49).addBox(-0.5177F, -1.6363F, -1.7482F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1824F, -1.0888F, -0.0506F, 3.098F, 0.0F, 2.9671F));

		PartDefinition Head_r45 = Head.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(93, 48)
				.addBox(-1.2123F, -5.7106F, -3.3476F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.3976F, -2.3476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -3.0845F, -2.3476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.2516F, 1.0378F, 1.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.3847F, -0.2927F, 1.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5177F, -1.6231F, 1.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -2.9362F, 1.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.2493F, 1.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-1.2123F, -5.5623F, 1.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3176F, -2.4221F, -0.0506F, 0.0436F, 0.0F, 0.1745F));

		PartDefinition Head_r46 = Head.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(94, 49)
				.addBox(-0.0259F, 2.3049F, -1.7482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5177F, -1.6363F, -1.7482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -2.9493F, -1.7482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.2624F, -1.7482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-1.2123F, -5.5755F, -1.7482F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(0.2172F, 3.5091F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-1.2123F, -5.75F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.4369F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -3.1238F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5177F, -1.8107F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.3847F, -0.4803F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.2516F, 0.8501F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.0259F, 2.1304F, 2.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3176F, -2.4221F, -0.0506F, -0.0436F, 0.0F, 0.1745F));

		PartDefinition Head_r47 = Head.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(94, 49)
				.addBox(0.2172F, 3.6291F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-1.2123F, -5.63F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.3169F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -3.0038F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5177F, -1.6908F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.3847F, -0.3603F, -0.4494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(0.2172F, 3.6291F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.0259F, 2.2504F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.2516F, 0.9701F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.3847F, -0.3603F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5177F, -1.6908F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7493F, -3.0038F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9808F, -4.3169F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-1.2123F, -5.63F, 3.5506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3176F, -2.4221F, -0.0506F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Head_r48 = Head.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(94, 49)
				.addBox(-0.3924F, -0.3601F, -4.5494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5254F, -1.6906F, -4.5494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.757F, -3.0037F, -4.5494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9885F, -4.3167F, -4.5494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-1.22F, -5.6298F, -4.5494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3176F, -2.4221F, -0.0506F, 0.0F, -0.0019F, 0.1746F));

		PartDefinition Head_r49 = Head.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(94, 49)
				.addBox(-1.2183F, -5.4926F, -3.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.9868F, -4.1796F, -3.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.7552F, -2.8665F, -3.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.5237F, -1.5534F, -3.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
				.addBox(-0.3907F, -0.223F, -3.6464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3176F, -2.4221F, -0.0506F, -0.0436F, -0.0019F, 0.1309F));

		PartDefinition Head_r50 = Head.addOrReplaceChild("Head_r50",
				CubeListBuilder.create().texOffs(94, 49).addBox(-0.0283F, 2.2508F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3151F, -2.4221F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Head_r51 = Head.addOrReplaceChild("Head_r51",
				CubeListBuilder.create().texOffs(94, 49)
						.addBox(-0.0283F, 2.2508F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
						.addBox(0.2148F, 3.6295F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3151F, -2.4221F, 1.5F, 0.0436F, 0.0F, 0.1745F));

		PartDefinition Head_r52 = Head.addOrReplaceChild("Head_r52",
				CubeListBuilder.create().texOffs(69, 90)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 90)
						.addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 90)
						.addBox(7.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 90)
						.addBox(1.3F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 90)
						.addBox(4.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9664F, -7.0055F, -4.2667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r53 = Head.addOrReplaceChild("Head_r53",
				CubeListBuilder.create().texOffs(69, 90)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 90)
						.addBox(7.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0664F, -1.0055F, -4.2667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r54 = Head.addOrReplaceChild("Head_r54",
				CubeListBuilder.create().texOffs(69, 90)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 90)
						.addBox(7.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0664F, -3.0055F, -4.2667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r55 = Head.addOrReplaceChild("Head_r55",
				CubeListBuilder.create().texOffs(69, 90)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 90)
						.addBox(7.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0664F, -5.0055F, -4.2667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r56 = Head.addOrReplaceChild("Head_r56",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7664F, -7.0055F, -4.1667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r57 = Head.addOrReplaceChild("Head_r57",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3331F, -5.0055F, -4.1667F, -0.1304F, 0.0114F, 0.0865F));

		PartDefinition Head_r58 = Head.addOrReplaceChild("Head_r58",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6664F, -5.6721F, -4.1667F, -0.1304F, 0.0114F, 0.0865F));

		PartDefinition Head_r59 = Head.addOrReplaceChild("Head_r59",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6664F, -7.0055F, -4.1667F, -0.1304F, 0.0114F, 0.0865F));

		PartDefinition Head_r60 = Head.addOrReplaceChild("Head_r60",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6664F, -6.9055F, -4.1667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r61 = Head.addOrReplaceChild("Head_r61",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5997F, -7.5721F, -2.9667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r62 = Head.addOrReplaceChild("Head_r62",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6997F, -7.5721F, -2.8667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r63 = Head.addOrReplaceChild("Head_r63",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7997F, -7.5721F, -2.8667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r64 = Head.addOrReplaceChild("Head_r64",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6997F, -7.5721F, -2.9667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r65 = Head.addOrReplaceChild("Head_r65",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2003F, -7.5721F, -2.8667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r66 = Head.addOrReplaceChild("Head_r66",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3003F, -7.5721F, -2.9667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r67 = Head.addOrReplaceChild("Head_r67",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4003F, -7.5721F, -2.9667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r68 = Head.addOrReplaceChild("Head_r68",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3003F, -7.5721F, -2.8667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r69 = Head.addOrReplaceChild("Head_r69",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4003F, -7.5721F, -2.9667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r70 = Head.addOrReplaceChild("Head_r70",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3003F, -7.5721F, -2.8667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r71 = Head.addOrReplaceChild("Head_r71",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5997F, -7.5721F, -2.8667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r72 = Head.addOrReplaceChild("Head_r72",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4997F, -7.5721F, -2.9667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r73 = Head.addOrReplaceChild("Head_r73",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4997F, -7.5721F, 2.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r74 = Head.addOrReplaceChild("Head_r74",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5997F, -7.5721F, 2.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r75 = Head.addOrReplaceChild("Head_r75",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3003F, -7.5721F, 2.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r76 = Head.addOrReplaceChild("Head_r76",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4003F, -7.5721F, 2.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r77 = Head.addOrReplaceChild("Head_r77",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3003F, -7.5721F, 2.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r78 = Head.addOrReplaceChild("Head_r78",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4003F, -7.5721F, 2.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r79 = Head.addOrReplaceChild("Head_r79",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3003F, -7.5721F, 2.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r80 = Head.addOrReplaceChild("Head_r80",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2003F, -7.5721F, 2.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r81 = Head.addOrReplaceChild("Head_r81",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6997F, -7.5721F, 2.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r82 = Head.addOrReplaceChild("Head_r82",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7997F, -7.5721F, 2.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r83 = Head.addOrReplaceChild("Head_r83",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6997F, -7.5721F, 2.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r84 = Head.addOrReplaceChild("Head_r84",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5997F, -7.5721F, 2.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r85 = Head.addOrReplaceChild("Head_r85",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5997F, -7.5721F, 0.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r86 = Head.addOrReplaceChild("Head_r86",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6997F, -7.5721F, 0.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r87 = Head.addOrReplaceChild("Head_r87",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7997F, -7.5721F, 0.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r88 = Head.addOrReplaceChild("Head_r88",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6997F, -7.5721F, 0.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r89 = Head.addOrReplaceChild("Head_r89",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2003F, -7.5721F, 0.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r90 = Head.addOrReplaceChild("Head_r90",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3003F, -7.5721F, 0.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r91 = Head.addOrReplaceChild("Head_r91",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8003F, -7.5721F, 0.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r92 = Head.addOrReplaceChild("Head_r92",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7003F, -7.5721F, 0.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r93 = Head.addOrReplaceChild("Head_r93",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1997F, -7.5721F, 0.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r94 = Head.addOrReplaceChild("Head_r94",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7003F, -7.5721F, 0.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r95 = Head.addOrReplaceChild("Head_r95",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, 0.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r96 = Head.addOrReplaceChild("Head_r96",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0997F, -7.5721F, 0.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r97 = Head.addOrReplaceChild("Head_r97",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0997F, -7.5721F, -1.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r98 = Head.addOrReplaceChild("Head_r98",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, -1.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r99 = Head.addOrReplaceChild("Head_r99",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7003F, -7.5721F, -1.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r100 = Head.addOrReplaceChild("Head_r100",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1997F, -7.5721F, -1.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r101 = Head.addOrReplaceChild("Head_r101",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7003F, -7.5721F, -1.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r102 = Head.addOrReplaceChild("Head_r102",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8003F, -7.5721F, -1.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r103 = Head.addOrReplaceChild("Head_r103",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1003F, -7.5721F, -1.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r104 = Head.addOrReplaceChild("Head_r104",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0003F, -7.5721F, -1.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r105 = Head.addOrReplaceChild("Head_r105",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8997F, -7.5721F, -1.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r106 = Head.addOrReplaceChild("Head_r106",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9997F, -7.5721F, -1.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r107 = Head.addOrReplaceChild("Head_r107",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8997F, -7.5721F, -1.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r108 = Head.addOrReplaceChild("Head_r108",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7997F, -7.5721F, -1.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r109 = Head.addOrReplaceChild("Head_r109",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9997F, -7.5721F, -2.3667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r110 = Head.addOrReplaceChild("Head_r110",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0997F, -7.5721F, -2.2667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r111 = Head.addOrReplaceChild("Head_r111",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, -2.2667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r112 = Head.addOrReplaceChild("Head_r112",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0997F, -7.5721F, -2.3667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r113 = Head.addOrReplaceChild("Head_r113",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8003F, -7.5721F, -2.2667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r114 = Head.addOrReplaceChild("Head_r114",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0997F, -7.5721F, -2.3667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r115 = Head.addOrReplaceChild("Head_r115",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0997F, -7.5721F, -0.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r116 = Head.addOrReplaceChild("Head_r116",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8003F, -7.5721F, -0.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r117 = Head.addOrReplaceChild("Head_r117",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0997F, -7.5721F, -0.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r118 = Head.addOrReplaceChild("Head_r118",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, -0.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r119 = Head.addOrReplaceChild("Head_r119",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0997F, -7.5721F, -0.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r120 = Head.addOrReplaceChild("Head_r120",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9997F, -7.5721F, -0.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r121 = Head.addOrReplaceChild("Head_r121",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9997F, -7.5721F, 1.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r122 = Head.addOrReplaceChild("Head_r122",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0997F, -7.5721F, 1.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r123 = Head.addOrReplaceChild("Head_r123",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, 1.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r124 = Head.addOrReplaceChild("Head_r124",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0997F, -7.5721F, 1.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r125 = Head.addOrReplaceChild("Head_r125",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8003F, -7.5721F, 1.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r126 = Head.addOrReplaceChild("Head_r126",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0997F, -7.5721F, 1.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r127 = Head.addOrReplaceChild("Head_r127",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0997F, -7.5721F, 3.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r128 = Head.addOrReplaceChild("Head_r128",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8003F, -7.5721F, 3.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r129 = Head.addOrReplaceChild("Head_r129",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0997F, -7.5721F, 3.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r130 = Head.addOrReplaceChild("Head_r130",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, 3.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r131 = Head.addOrReplaceChild("Head_r131",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0997F, -7.5721F, 3.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r132 = Head.addOrReplaceChild("Head_r132",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9997F, -7.5721F, 3.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r133 = Head.addOrReplaceChild("Head_r133",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, 3.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r134 = Head.addOrReplaceChild("Head_r134",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2997F, -7.5721F, 3.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r135 = Head.addOrReplaceChild("Head_r135",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6003F, -7.5721F, 3.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r136 = Head.addOrReplaceChild("Head_r136",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7003F, -7.5721F, 3.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r137 = Head.addOrReplaceChild("Head_r137",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6003F, -7.5721F, 3.4333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r138 = Head.addOrReplaceChild("Head_r138",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7003F, -7.5721F, 3.3333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r139 = Head.addOrReplaceChild("Head_r139",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7003F, -7.5721F, 1.4333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r140 = Head.addOrReplaceChild("Head_r140",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6003F, -7.5721F, 1.5333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r141 = Head.addOrReplaceChild("Head_r141",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7003F, -7.5721F, 1.4333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r142 = Head.addOrReplaceChild("Head_r142",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6003F, -7.5721F, 1.5333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r143 = Head.addOrReplaceChild("Head_r143",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2997F, -7.5721F, 1.5333F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r144 = Head.addOrReplaceChild("Head_r144",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, 1.4333F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r145 = Head.addOrReplaceChild("Head_r145",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, -0.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r146 = Head.addOrReplaceChild("Head_r146",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2997F, -7.5721F, -0.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r147 = Head.addOrReplaceChild("Head_r147",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6003F, -7.5721F, -0.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r148 = Head.addOrReplaceChild("Head_r148",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7003F, -7.5721F, -0.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r149 = Head.addOrReplaceChild("Head_r149",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6003F, -7.5721F, -0.3667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r150 = Head.addOrReplaceChild("Head_r150",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7003F, -7.5721F, -0.4667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r151 = Head.addOrReplaceChild("Head_r151",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7003F, -7.5721F, -2.3667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r152 = Head.addOrReplaceChild("Head_r152",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6003F, -7.5721F, -2.2667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r153 = Head.addOrReplaceChild("Head_r153",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7003F, -7.5721F, -2.3667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r154 = Head.addOrReplaceChild("Head_r154",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6003F, -7.5721F, -2.2667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r155 = Head.addOrReplaceChild("Head_r155",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2997F, -7.5721F, -2.2667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r156 = Head.addOrReplaceChild("Head_r156",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, -2.3667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r157 = Head.addOrReplaceChild("Head_r157",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6003F, -7.5721F, -3.9667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r158 = Head.addOrReplaceChild("Head_r158",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7003F, -7.5721F, -4.0667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r159 = Head.addOrReplaceChild("Head_r159",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7003F, -7.5721F, -4.0667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r160 = Head.addOrReplaceChild("Head_r160",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6003F, -7.5721F, -3.9667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r161 = Head.addOrReplaceChild("Head_r161",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2997F, -7.5721F, -3.9667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r162 = Head.addOrReplaceChild("Head_r162",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1997F, -7.5721F, -4.0667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r163 = Head.addOrReplaceChild("Head_r163",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4997F, -7.5721F, -4.1667F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition Head_r164 = Head.addOrReplaceChild("Head_r164",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3997F, -7.5721F, -4.2667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r165 = Head.addOrReplaceChild("Head_r165",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0664F, -6.9055F, -4.2667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r166 = Head.addOrReplaceChild("Head_r166",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0664F, -7.0055F, -4.2667F, -0.1304F, 0.0114F, 0.0865F));

		PartDefinition Head_r167 = Head.addOrReplaceChild("Head_r167",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0336F, -6.9055F, -4.2667F, -0.1308F, -0.0057F, -0.0433F));

		PartDefinition Head_r168 = Head.addOrReplaceChild("Head_r168",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0336F, -7.0055F, -4.2667F, -0.1304F, 0.0114F, 0.0865F));

		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow", CubeListBuilder.create(),
				PartPose.offset(3.8333F, 24.6F, -0.0258F));

		PartDefinition Head_r169 = eyebrow.addOrReplaceChild("Head_r169",
				CubeListBuilder.create().texOffs(94, 43)
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(79, 72)
						.addBox(2.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, -29.55F, -3.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition EyeR = Head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(71, 22).addBox(-1.15F,
				-0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.65F, -3.9F, -3.5316F));

		PartDefinition Head2 = EyeR.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(95, 25)
						.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(95, 25)
						.addBox(-0.3F, -0.6F, -0.4727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(95, 25)
						.addBox(-1.3F, -0.6F, -0.4727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.15F, 0.0F, -0.0059F));

		PartDefinition eyeL = Head.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(71, 25).addBox(-0.875F,
				-0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.7083F, -3.9F, -3.5316F));

		PartDefinition Head3 = eyeL.addOrReplaceChild("Head3",
				CubeListBuilder.create().texOffs(95, 22)
						.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(95, 22)
						.addBox(-0.7648F, -0.6F, -0.4727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(95, 22)
						.addBox(0.2352F, -0.6F, -0.4727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.125F, 0.0F, -0.0059F));

		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(94, 46).addBox(-1.0F,
				-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0833F, -1.3833F, -3.5258F));

		PartDefinition smile_frown = mouth.addOrReplaceChild("smile_frown", CubeListBuilder.create(),
				PartPose.offset(2.0F, 28.5F, 3.5F));

		PartDefinition frown_L = smile_frown.addOrReplaceChild("frown_L",
				CubeListBuilder.create().texOffs(69, 94).addBox(-0.0273F, -1.2016F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9727F, -27.7984F, -3.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition frown_R = smile_frown.addOrReplaceChild("frown_R",
				CubeListBuilder.create().texOffs(69, 94).addBox(-1.0017F, -1.193F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0401F, -27.8112F, -3.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 59)
						.addBox(-2.2F, -0.1547F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 45)
						.addBox(-2.2F, -0.1547F, -1.2F, 4.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(93, 38)
						.addBox(-1.5652F, 1.5002F, -2.1492F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(32, 59).addBox(-2.2F, -0.1547F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(75, 86).addBox(-0.5344F, 1.3062F, -0.5F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(34, 86).addBox(-2.2F, -0.1547F, 1.2F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Body_r1 = Body
				.addOrReplaceChild("Body_r1",
						CubeListBuilder.create().texOffs(79, 57).addBox(-4.0F, -6.0F, 1.0F, 4.0F, 13.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.5F, 0.2F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(0, 47).addBox(-2.5F, -7.0F, -2.5F, 5.0F, 14.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7F, 16.0F, 0.0667F, 0.0F, 1.5708F, 0.2182F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(21, 41).addBox(-2.5F, -7.0F, -7.5F, 5.0F, 4.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8867F, 15.5F, 0.0667F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(46, 41).addBox(-2.5F, -7.0F, -2.5F, 5.0F, 14.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 15.5F, 0.0667F, 0.0F, 1.5708F, -0.2182F));

		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(0, 29).addBox(-3.5F, -0.2065F, -2.7966F, 7.0F, 14.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 8.7F, 2.1167F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(32, 58)
						.addBox(-0.4181F, -1.5555F, -2.1F, 2.0F, -3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-2.5819F, -2.4445F, -2.1F, 4.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 12)
						.addBox(-2.5755F, -4.3706F, -3.6F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 16)
						.addBox(-0.4181F, -1.5555F, -3.8F, 2.0F, -3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 16)
						.addBox(-0.4181F, -1.5555F, -3.8F, 2.0F, -3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(49, 74)
						.addBox(-1.5819F, -2.4445F, -3.8F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 12)
						.addBox(-2.5755F, -4.3706F, -3.6F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4229F, 4.1526F, 1.6F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7",
				CubeListBuilder.create().texOffs(64, 60)
						.addBox(-1.5084F, -2.3521F, -2.1F, 4.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 40)
						.addBox(-1.4916F, -1.6479F, -2.1F, 2.0F, -3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 53)
						.addBox(-0.5084F, -4.3521F, -3.6F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 16)
						.addBox(-1.4916F, -1.6479F, -3.8F, 2.0F, -3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(33, 16)
						.addBox(-1.4916F, -1.6479F, -3.8F, 2.0F, -3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 75)
						.addBox(-1.5084F, -2.3521F, -3.8F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 53)
						.addBox(-0.5084F, -4.3521F, -3.6F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6257F, 4.0755F, 1.6F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8",
				CubeListBuilder.create().texOffs(17, 94).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0975F, 6.8958F, -0.6492F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9",
				CubeListBuilder.create().texOffs(94, 5).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0975F, 5.1966F, -0.6492F, 0.0F, 0.0F, 0.0873F));

		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10",
				CubeListBuilder.create().texOffs(94, 0).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0975F, 3.8177F, -0.6492F, 0.0F, 0.0F, -0.2182F));

		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 75)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.5F, -11.0F, 0.0F));

		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2",
				CubeListBuilder.create().texOffs(15, 71)
						.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 89)
						.addBox(-2.0F, 2.5F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 90)
						.addBox(-2.2F, 2.5F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 57)
						.addBox(-1.8F, 2.5F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 63)
						.addBox(-2.0F, 2.5F, -1.8F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 4.5F, 0.0F));

		PartDefinition LeftArm4 = LeftArm2.addOrReplaceChild("LeftArm4",
				CubeListBuilder.create().texOffs(25, 57).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8333F, 4.3333F, -4.6667F, 1.5708F, 0.0F, 0.0F));

		PartDefinition LeftArm3 = LeftArm2.addOrReplaceChild("LeftArm3",
				CubeListBuilder.create().texOffs(115, 112)
						.addBox(-1.0333F, -0.5F, 1.5F, 2.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(115, 112)
						.addBox(-1.2333F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(115, 112)
						.addBox(0.2667F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0333F, 4.5F, 0.1667F));

		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(78, 22).addBox(
				-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, -11.0F, 0.0F));

		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(75, 75)
						.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 86)
						.addBox(-2.0F, 2.5F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 10)
						.addBox(-2.2F, 2.5F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 16)
						.addBox(-1.8F, 2.5F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 69)
						.addBox(-2.0F, 2.5F, -1.8F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 4.5F, 0.0F));

		PartDefinition LeftArm5 = RightArm2.addOrReplaceChild("LeftArm5",
				CubeListBuilder.create().texOffs(25, 57).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1667F, 4.3333F, -4.6667F, 1.5708F, 0.0F, 0.0F));

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