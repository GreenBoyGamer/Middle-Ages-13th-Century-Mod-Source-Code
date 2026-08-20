// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfemale_civilian_1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "female_civilian_1"), "main");
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
	private final ModelPart LeftArm3;
	private final ModelPart RightArm;
	private final ModelPart RightArm2;

	public Modelfemale_civilian_1(ModelPart root) {
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
		this.LeftArm3 = this.LeftArm2.getChild("LeftArm3");
		this.RightArm = this.Waist.getChild("RightArm");
		this.RightArm2 = this.RightArm.getChild("RightArm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition whole = partdefinition.addOrReplaceChild("whole", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = whole
				.addOrReplaceChild("LeftLeg",
						CubeListBuilder.create().texOffs(72, 21).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(69, 11)
				.addBox(-2.0117F, -0.1667F, -1.3711F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(87, 26)
				.addBox(-2.0117F, 5.8333F, -4.3711F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 31)
				.addBox(-2.0117F, 4.8333F, -2.3711F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));

		PartDefinition LeftLeg_r1 = LeftLeg2.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(87, 26).addBox(0.5283F, -0.6991F, -0.4174F, 3.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5273F, 6.2399F, -3.3711F, 0.5668F, 0.0234F, 0.0068F));

		PartDefinition RightLeg = whole.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(66, 72)
				.addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.3333F, 0.0F, 0.0F));

		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2", CubeListBuilder.create().texOffs(0, 74)
				.addBox(-2.0117F, -0.1667F, -1.3711F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(89, 30)
				.addBox(-2.0117F, 5.8333F, -4.3711F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 76)
				.addBox(-2.0117F, 4.8333F, -2.3711F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));

		PartDefinition right_r1 = RightLeg2.addOrReplaceChild("right_r1",
				CubeListBuilder.create().texOffs(89, 30).addBox(-3.5177F, -0.5054F, -1.0F, 3.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.506F, 5.8114F, -2.9563F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(),
				PartPose.offset(-2.4F, 1.0F, 0.0F));

		PartDefinition Head = Waist.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
				.addBox(-4.2F, -8.0F, -4.3F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-2.815F, -8.3542F, -4.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-2.815F, -8.3542F, -3.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-1.765F, -8.3542F, -2.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-1.765F, -8.3542F, -1.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(0.2351F, -8.3542F, -2.3317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-0.8149F, -8.3542F, -4.3317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-0.8149F, -8.3542F, -3.3317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(0.2351F, -8.3542F, -1.3317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(2.2351F, -8.3542F, -1.3317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(1.185F, -8.3542F, -3.3317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(1.185F, -8.3542F, -4.3317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(3.185F, -8.3542F, -3.3317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(3.185F, -8.3542F, -4.3317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-3.815F, -8.3542F, -2.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-3.815F, -8.3542F, -1.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(2.2351F, -8.3542F, -2.3317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(3.185F, -8.3542F, -0.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(3.185F, -8.3542F, 0.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(1.185F, -8.3542F, 0.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(1.185F, -8.3542F, -0.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(2.2351F, -8.3542F, 2.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(2.2351F, -8.3542F, 1.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(0.2351F, -8.3542F, 2.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(0.2351F, -8.3542F, 1.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-0.8149F, -8.3542F, -0.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-0.8149F, -8.3542F, 0.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-1.765F, -8.3542F, 1.8683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-1.765F, -8.3542F, 2.8683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-2.815F, -8.3542F, -0.1317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-2.815F, -8.3542F, 0.8683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-2.815F, -8.3542F, 3.8683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-2.815F, -8.8542F, 2.3683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-0.5649F, -8.8542F, 1.3683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-1.565F, -8.8542F, -2.1317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(0.435F, -8.8542F, -1.3817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-0.8149F, -8.3542F, 3.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(1.185F, -8.3542F, 3.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(3.185F, -8.3542F, 3.7683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-3.815F, -8.3542F, 2.8683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
				.addBox(-3.815F, -8.3542F, 1.8683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 41)
				.addBox(-3.2F, -8.0F, -4.3F, -1.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
				.addBox(-3.2F, -4.0F, -3.3F, -1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
				.addBox(4.2F, -8.0F, -4.3F, -1.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(24, 89)
				.addBox(4.45F, -8.0F, -4.3F, -1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 89)
				.addBox(-3.55F, -8.0F, -4.3F, -1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 62)
				.addBox(4.2F, -4.0F, -3.3F, -1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(27, 17)
				.addBox(0.1667F, -8.0F, -4.3F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(57, 84)
				.addBox(-0.5849F, -8.0F, 3.7F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 29)
				.addBox(-0.5333F, -8.0F, -4.3F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(38, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0833F, -2.4F, -3.6469F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(37, 77).addBox(-1.5F, -5.5F, -0.5F, 3.0F, 11.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9573F, -2.5F, 4.2F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(15, 75).addBox(-2.0F, -6.0F, -0.5F, 4.0F, 12.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7513F, -2.0F, 4.2F, 0.0F, 0.0F, 0.0873F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.9581F, 1.7134F, -3.6F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5167F, -0.2805F, 4.4833F, 1.76F, 1.44F, 1.6725F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0115F, -0.4641F, 4.4833F, 1.6291F, 1.44F, 1.6725F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5935F, -1.6477F, 4.4833F, 1.6291F, 1.44F, 1.6725F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.9581F, 1.7134F, -3.6F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9346F, -1.4641F, 4.4833F, 1.76F, 1.44F, 1.6725F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.9581F, 1.7134F, -3.6F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4346F, -1.2258F, 4.4833F, 1.76F, 1.44F, 1.6725F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0935F, -1.4094F, 4.4833F, 1.6291F, 1.44F, 1.6725F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0935F, -2.4797F, 4.4833F, 1.6291F, 1.44F, 1.6725F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.9581F, 1.7134F, -3.6F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4346F, -2.2961F, 4.4833F, 1.76F, 1.44F, 1.6725F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7859F, 1.9378F, -0.4F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7362F, 0.028F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5379F, 0.0541F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7362F, 0.028F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.564F, 0.2524F, -0.4F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7362F, 0.028F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5379F, 0.0541F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7362F, 0.028F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4751F, -1.9549F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2769F, -1.9288F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4751F, -1.9549F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.303F, -1.7305F, -0.4F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4751F, -1.9549F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4751F, -1.9549F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2769F, -1.9288F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2141F, -3.9378F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2141F, -3.9378F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.0158F, -3.9117F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.0419F, -3.7134F, -0.4F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2141F, -3.9378F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.0158F, -3.9117F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2141F, -3.9378F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7979F, -3.8F, 4.4833F, 1.76F, 1.44F, 1.6725F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2802F, -2.2688F, 4.4833F, 1.76F, 1.44F, 1.6725F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2802F, -1.3859F, 4.4833F, 1.76F, 1.44F, 1.6725F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7979F, -1.3859F, 4.4833F, 1.76F, 1.44F, 1.6725F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7979F, -2.1594F, 4.4833F, 1.76F, 1.44F, 1.6725F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.2141F, -3.9378F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.0158F, -3.9117F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2141F, -3.9378F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.0419F, -3.7134F, -0.4F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.0158F, -3.9117F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2141F, -3.9378F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2141F, -3.9378F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2769F, -1.9288F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4752F, -1.9549F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4752F, -1.9549F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.303F, -1.7305F, -0.4F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4752F, -1.9549F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2769F, -1.9288F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4752F, -1.9549F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7362F, 0.028F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5379F, 0.0541F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7362F, 0.028F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.564F, 0.2523F, -0.4F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7362F, 0.028F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5379F, 0.0541F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7362F, 0.028F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7859F, 1.9378F, -0.4F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7598F, 1.7395F, -2.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9581F, 1.7134F, -3.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7302F, -3.9836F, 4.4833F, 1.6291F, 1.44F, 1.6725F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.9646F, -4.013F, 3.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7794F, -4.1382F, 2.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9777F, -4.1121F, 1.0F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7794F, -4.1382F, 0.0F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9516F, -3.9139F, -1.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7794F, -4.1382F, -2.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.9777F, -4.1121F, -3.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7166F, -2.1292F, -3.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5183F, -2.1554F, -2.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.6905F, -1.931F, -1.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5183F, -2.1554F, 0.0F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7166F, -2.1292F, 1.0F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5183F, -2.1554F, 2.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7036F, -2.0301F, 3.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4425F, -0.0472F, 3.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2573F, -0.1725F, 2.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4556F, -0.1464F, 1.0F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2573F, -0.1725F, 0.0F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4295F, 0.0519F, -1.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2573F, -0.1725F, -2.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4556F, -0.1464F, -3.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2337F, 1.5391F, -3.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.0354F, 1.513F, -2.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2076F, 1.7374F, -1.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.0354F, 1.513F, 0.0F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2337F, 1.5391F, 1.0F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.0354F, 1.513F, 2.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 47)
						.addBox(0.2206F, 1.6382F, 3.1F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.7794F, -4.1382F, -4.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5183F, -2.1554F, -4.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.2573F, -0.1725F, -4.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.0354F, 1.513F, -4.1F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2853F, -3.7857F, 0.45F, -3.1416F, 0.0F, 3.098F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.3943F, -1.2865F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5926F, -1.3126F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4204F, -1.0882F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5926F, -1.3126F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.3943F, -1.2865F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5926F, -1.3126F, -2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 47)
						.addBox(0.4074F, -1.1874F, -3.6F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2984F, -1.6831F, -0.05F, 0.0F, 0.0F, -0.48F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.4101F, -1.2562F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.6084F, -1.2823F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4362F, -1.0579F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4101F, -1.2562F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.6084F, -1.2823F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.6084F, -1.2823F, -2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 47)
						.addBox(0.4232F, -1.157F, -3.6F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9663F, -0.8423F, -0.05F, 0.0F, 0.0F, -1.0472F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21",
				CubeListBuilder.create().texOffs(32, 47)
						.addBox(0.4232F, -1.157F, -3.6F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.6084F, -1.2823F, -2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.6084F, -1.2823F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4101F, -1.2562F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4362F, -1.0579F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.6084F, -1.2823F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4101F, -1.2562F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3735F, -0.8423F, -0.05F, 0.0F, 0.0F, 1.0472F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22",
				CubeListBuilder.create().texOffs(32, 47)
						.addBox(0.4074F, -1.1874F, -3.6F, -1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5926F, -1.3126F, -2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.3943F, -1.2865F, -1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5926F, -1.3126F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.4204F, -1.0882F, 0.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5926F, -1.3126F, 1.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.3943F, -1.2865F, 2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5259F, -1.6831F, -0.05F, 0.0F, 0.0F, 0.48F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, 1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -4.7F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9635F, -1.2336F, 2.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, 1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -4.7F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9635F, -2.9336F, 2.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, 1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -4.7F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9635F, -4.9336F, 2.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, 1.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -2.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -4.7F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9635F, -6.9336F, 2.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -6.7336F, 1.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -4.7336F, 1.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -2.7336F, 1.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -1.0336F, 1.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -4.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -1.2336F, 3.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -4.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -2.9336F, 3.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -4.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -4.9336F, 3.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34",
				CubeListBuilder.create().texOffs(33, 47)
						.addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47)
						.addBox(0.5F, -1.0F, -4.6F, -1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -6.9336F, 3.05F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35",
				CubeListBuilder.create().texOffs(32, 47).addBox(0.5F, -1.0F, -0.5F, -1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -1.1336F, -3.15F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -2.8336F, -3.15F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -4.8336F, -3.15F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38",
				CubeListBuilder.create().texOffs(33, 47).addBox(0.5F, -1.0F, -0.5F, -1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1635F, -6.8336F, -3.15F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39",
				CubeListBuilder.create().texOffs(33, 90)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
						.addBox(-8.5234F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.968F, -0.9805F, -3.83F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40",
				CubeListBuilder.create().texOffs(33, 90)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
						.addBox(-8.5234F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.968F, -1.793F, -3.83F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41",
				CubeListBuilder.create().texOffs(33, 90)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
						.addBox(-8.5234F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.968F, -3.1211F, -3.83F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0555F, -6.9336F, -3.8807F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r43 = Head.addOrReplaceChild("Head_r43",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0555F, -5.6055F, -3.8807F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r44 = Head.addOrReplaceChild("Head_r44",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0555F, -4.793F, -3.8807F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r45 = Head.addOrReplaceChild("Head_r45",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.315F, -6.8542F, -3.9817F, -0.1739F, 0.0133F, 0.0862F));

		PartDefinition Head_r46 = Head.addOrReplaceChild("Head_r46",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.354F, -6.8542F, -3.927F, -0.1303F, 0.0133F, 0.0862F));

		PartDefinition Head_r47 = Head.addOrReplaceChild("Head_r47",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4087F, -5.3542F, -3.9817F, -0.1739F, 0.0133F, 0.0862F));

		PartDefinition Head_r48 = Head.addOrReplaceChild("Head_r48",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4087F, -6.8542F, -3.9817F, -0.1739F, 0.0133F, 0.0862F));

		PartDefinition Head_r49 = Head.addOrReplaceChild("Head_r49",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3522F, -5.8542F, -3.927F, -0.1303F, 0.0133F, 0.0862F));

		PartDefinition Head_r50 = Head.addOrReplaceChild("Head_r50",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5522F, -6.8542F, -3.927F, -0.1303F, 0.0133F, 0.0862F));

		PartDefinition Head_r51 = Head.addOrReplaceChild("Head_r51",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.061F, -6.9323F, -3.927F, -0.1309F, -0.0038F, -0.0435F));

		PartDefinition Head_r52 = Head.addOrReplaceChild("Head_r52",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6616F, -6.9323F, -3.927F, -0.1309F, -0.0038F, -0.0435F));

		PartDefinition Head_r53 = Head.addOrReplaceChild("Head_r53",
				CubeListBuilder.create().texOffs(33, 90)
						.addBox(-0.5F, -1.654F, -0.6153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
						.addBox(-0.5F, -0.346F, -0.3847F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7333F, -6.2695F, -3.8979F, -0.1307F, 0.0076F, 0.043F));

		PartDefinition Head_r54 = Head.addOrReplaceChild("Head_r54",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0333F, -4.793F, -3.8979F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r55 = Head.addOrReplaceChild("Head_r55",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0333F, -5.6055F, -3.8979F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r56 = Head.addOrReplaceChild("Head_r56",
				CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0333F, -6.9336F, -3.8979F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r57 = Head.addOrReplaceChild("Head_r57",
				CubeListBuilder.create().texOffs(33, 90)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
						.addBox(-7.8333F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6333F, -6.9336F, -3.9979F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r58 = Head.addOrReplaceChild("Head_r58",
				CubeListBuilder.create().texOffs(33, 90)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
						.addBox(-7.8333F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6333F, -5.6055F, -3.9979F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r59 = Head.addOrReplaceChild("Head_r59",
				CubeListBuilder.create().texOffs(33, 90)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 90)
						.addBox(-7.8333F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6333F, -4.793F, -3.9979F, -0.1745F, 0.0F, 0.0F));

		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow", CubeListBuilder.create(),
				PartPose.offset(3.8333F, 24.6F, -0.0258F));

		PartDefinition Head_r60 = eyebrow.addOrReplaceChild("Head_r60",
				CubeListBuilder.create().texOffs(89, 61)
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 58)
						.addBox(2.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, -29.45F, -3.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition EyeR = Head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(81, 51).addBox(-1.15F,
				-0.4F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.65F, -3.9F, -3.5316F));

		PartDefinition Head2 = EyeR.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(90, 75)
						.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 75)
						.addBox(-0.5F, -0.6F, -0.4805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 75)
						.addBox(-0.3047F, -0.6F, -0.4805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 75)
						.addBox(-1.2852F, -0.6F, -0.4805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.15F, 0.0F, -0.0059F));

		PartDefinition eyeL = Head.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(89, 55).addBox(-0.875F,
				-0.4F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.7083F, -3.9F, -3.5316F));

		PartDefinition Head3 = eyeL.addOrReplaceChild("Head3",
				CubeListBuilder.create().texOffs(90, 72)
						.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 72)
						.addBox(-0.5F, -0.6F, -0.4805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 72)
						.addBox(-0.7539F, -0.6F, -0.4805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 72)
						.addBox(0.2461F, -0.6F, -0.4805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.125F, 0.0F, -0.0059F));

		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(26, 90).addBox(-1.0F,
				-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0833F, -1.3833F, -3.5258F));

		PartDefinition smile_frown = mouth.addOrReplaceChild("smile_frown", CubeListBuilder.create(),
				PartPose.offset(2.0F, 28.5F, 3.5F));

		PartDefinition frown_L = smile_frown.addOrReplaceChild("frown_L",
				CubeListBuilder.create().texOffs(64, 90).addBox(-0.0273F, -1.2016F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9727F, -27.7984F, -3.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition frown_R = smile_frown.addOrReplaceChild("frown_R",
				CubeListBuilder.create().texOffs(64, 90).addBox(-1.0017F, -1.193F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0401F, -27.8112F, -3.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(33, 0)
						.addBox(-2.2F, -0.1547F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-2.2F, -0.1547F, -1.2F, 4.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(66, 65)
						.addBox(-3.7605F, 10.0691F, -2.2F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(1.3395F, 10.0691F, -2.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(89, 34)
						.addBox(-3.9F, 8.5F, -2.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 0)
						.addBox(-2.3F, 8.5F, -2.4F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 54)
						.addBox(-3.9F, 8.5F, -0.6F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 59)
						.addBox(-3.3F, 8.5F, -0.6F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 77)
						.addBox(-2.2F, -0.1547F, 1.2F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 51)
						.addBox(-4.05F, 8.5F, -3.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 90)
						.addBox(-2.95F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 90)
						.addBox(-4.15F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 90)
						.addBox(-3.55F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(69, 90).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.15F, 9.0273F, -3.1F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(68, 40).addBox(-2.0F, -5.5F, -1.0F, 4.0F, 11.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5527F, 14.0781F, -0.0833F, 0.0F, 1.5708F, 0.1745F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(68, 40).addBox(-2.0F, -5.5F, -1.0F, 4.0F, 11.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.114F, 14.0781F, -0.0833F, 0.0F, 1.5708F, -0.1745F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(51, 41).addBox(-3.5F, -5.5F, -0.5F, 7.0F, 11.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 14.0014F, 2.3821F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(81, 72).addBox(-1.5F, -5.5F, -0.5F, 3.0F, 11.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3F, 14.0014F, -2.0846F, -0.0859F, -0.0151F, -0.1739F));

		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(81, 72).addBox(-1.5F, -5.5F, -0.5F, 3.0F, 11.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2F, 14.0014F, -2.0846F, -0.0852F, 0.0189F, 0.2174F));

		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7",
				CubeListBuilder.create().texOffs(17, 29)
						.addBox(-4.0F, -6.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 29)
						.addBox(-4.0F, -6.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 47)
						.addBox(-3.0F, -6.0F, -2.4F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7F, 5.9F, 0.2F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8",
				CubeListBuilder.create().texOffs(0, 29)
						.addBox(-4.0F, -6.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-4.0F, -6.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 15)
						.addBox(-4.0F, -6.0F, -2.4F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.5F, 0.2F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9",
				CubeListBuilder.create().texOffs(13, 89).addBox(-1.5F, -4.5F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4533F, 11.4803F, -0.2F, 0.0F, 0.0F, -0.7418F));

		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10",
				CubeListBuilder.create().texOffs(13, 89).addBox(-1.5F, -4.5F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3436F, 12.9257F, -0.2F, 0.0F, 0.0F, 0.7418F));

		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11",
				CubeListBuilder.create().texOffs(82, 4).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1975F, 7.1899F, -0.1F, 0.0F, 0.0F, 0.48F));

		PartDefinition Body_r12 = Body.addOrReplaceChild("Body_r12",
				CubeListBuilder.create().texOffs(82, 4).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0025F, 7.1899F, -0.1F, 0.0F, 0.0F, -0.48F));

		PartDefinition Body_r13 = Body.addOrReplaceChild("Body_r13",
				CubeListBuilder.create().texOffs(81, 4).addBox(-2.5F, -0.5F, -2.0F, 5.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1975F, 1.9899F, -0.1F, 0.0F, 0.0F, 0.48F));

		PartDefinition Body_r14 = Body.addOrReplaceChild("Body_r14",
				CubeListBuilder.create().texOffs(81, 4).addBox(-2.5F, -0.5F, -2.0F, 5.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0025F, 1.9899F, -0.1F, 0.0F, 0.0F, -0.48F));

		PartDefinition Body_r15 = Body.addOrReplaceChild("Body_r15",
				CubeListBuilder.create().texOffs(82, 4).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0025F, 4.9899F, -0.1F, 0.0F, 0.0F, -0.48F));

		PartDefinition Body_r16 = Body.addOrReplaceChild("Body_r16",
				CubeListBuilder.create().texOffs(82, 4).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1975F, 4.9899F, -0.1F, 0.0F, 0.0F, 0.48F));

		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(55, 29)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-1.2F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 10)
						.addBox(-0.9F, -2.125F, -2.2F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(81, 39)
						.addBox(-1.0F, -2.125F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 84)
						.addBox(-1.0F, -2.125F, 1.2F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.5F, -11.0F, 0.0F));

		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(51, 54).addBox(
				-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));

		PartDefinition LeftArm3 = LeftArm2.addOrReplaceChild("LeftArm3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0333F, -0.5F, 1.5F, 2.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.2333F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.2667F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0333F, 4.5F, 0.1667F));

		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(49, 65)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 66)
						.addBox(-1.2F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(77, 85)
						.addBox(-1.1F, -2.125F, -2.2F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(81, 45)
						.addBox(-1.0F, -2.125F, -2.2F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(87, 18)
						.addBox(-1.0F, -2.125F, 1.2F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.5F, -11.0F, 0.0F));

		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(65, 0)
				.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 4.5F, 0.0F));

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