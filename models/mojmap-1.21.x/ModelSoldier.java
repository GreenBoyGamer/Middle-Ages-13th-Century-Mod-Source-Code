// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSoldier<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "soldier"), "main");
	private final ModelPart soldier;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart EyeL;
	private final ModelPart Eyeball2;
	private final ModelPart EyeR;
	private final ModelPart Eyeball;
	private final ModelPart mouth;
	private final ModelPart right_arm;
	private final ModelPart down_side;
	private final ModelPart sword;
	private final ModelPart left_arm_main_Group;
	private final ModelPart left_arm;
	private final ModelPart down_side_L;
	private final ModelPart shield;
	private final ModelPart right_leg;
	private final ModelPart right_leg2;
	private final ModelPart right_leg3;
	private final ModelPart Left_leg;
	private final ModelPart leftleg;
	private final ModelPart LeftLeg2;

	public ModelSoldier(ModelPart root) {
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

		PartDefinition soldier = partdefinition.addOrReplaceChild("soldier", CubeListBuilder.create(),
				PartPose.offset(0.0196F, 24.9525F, -0.0333F));

		PartDefinition body = soldier.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 17)
				.addBox(-4.0589F, -12.8575F, -1.9F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 28)
				.addBox(-4.0589F, -10.8575F, -2.15F, 8.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(75, 43)
				.addBox(-4.0589F, -3.8575F, -2.15F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(100, 16)
				.addBox(-0.9589F, -3.8575F, -2.25F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(103, 51)
				.addBox(-4.1589F, -3.8575F, -2.25F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(103, 56)
				.addBox(-0.9589F, -3.8575F, -0.55F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(103, 61)
				.addBox(-4.1589F, -3.8575F, -0.55F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
				.addBox(-4.0589F, -10.8575F, -1.65F, 8.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0393F, -12.095F, -0.0667F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(108, 106).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2089F, -3.3575F, -0.85F, 0.0F, 0.0F, 0.7854F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(103, 111)
						.addBox(-0.5F, -11.2426F, -0.2039F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 58)
						.addBox(-4.25F, -7.9F, -4.25F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 76)
						.addBox(-3.25F, -1.9F, -4.25F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(65, 76)
						.addBox(2.0833F, -1.9F, -4.25F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 58)
						.addBox(3.0833F, -7.9F, -4.25F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(25, 17)
						.addBox(-3.9167F, -8.0F, -4.25F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0589F, -12.8575F, 0.1F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(110, 111).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.3129F, 4.8737F, -0.6981F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(75, 49).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0842F, 2.6072F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(110, 100).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.8502F, -0.9294F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(22, 112).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -1.8333F, 0.0F, 0.7854F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(39, 112)
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 84)
						.addBox(-4.9F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8333F, -4.5833F, -3.5766F, -0.3927F, 0.0F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(93, 114).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, -2.5F, -3.6F, -0.2182F, 0.0F, 0.0F));

		PartDefinition EyeL = head.addOrReplaceChild("EyeL", CubeListBuilder.create().texOffs(32, 112).addBox(-0.75F,
				-0.5F, -3.9922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5833F, -3.5F, -0.0844F));

		PartDefinition Eyeball2 = EyeL.addOrReplaceChild("Eyeball2", CubeListBuilder.create().texOffs(41, 84)
				.addBox(-3.0F, -28.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.25F, 27.5F, -0.0078F));

		PartDefinition EyeR = head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(75, 55).addBox(-0.75F,
				-0.5F, -3.9922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.3167F, -3.5F, -0.0844F));

		PartDefinition Eyeball = EyeR.addOrReplaceChild("Eyeball", CubeListBuilder.create().texOffs(88, 114)
				.addBox(-3.0F, -28.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.25F, 27.5F, -0.0078F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(46, 112).addBox(-1.0F,
				-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.15F, -1.1F, -3.6F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(96, 34)
				.addBox(-3.3824F, 0.9381F, -2.2484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 98)
				.addBox(-3.3824F, 0.9381F, -2.1484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.9551F, -13.1354F, 0.2688F));

		PartDefinition body_r2 = right_arm.addOrReplaceChild("body_r2",
				CubeListBuilder.create().texOffs(72, 98)
						.addBox(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 98)
						.addBox(-2.5F, -1.5F, -2.1F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6832F, 4.2545F, -0.1484F, 0.0F, 0.0F, -0.0436F));

		PartDefinition body_r3 = right_arm.addOrReplaceChild("body_r3",
				CubeListBuilder.create().texOffs(86, 71)
						.addBox(-2.5F, -1.5F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 35)
						.addBox(-2.5F, -1.5F, -2.3F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8824F, 1.2935F, -0.1188F, 0.0F, 0.0F, 0.1309F));

		PartDefinition down_side = right_arm.addOrReplaceChild("down_side", CubeListBuilder.create().texOffs(0, 82)
				.addBox(-2.0F, -0.75F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.1038F, 6.0279F, -0.1688F));

		PartDefinition sword = down_side.addOrReplaceChild("sword",
				CubeListBuilder.create().texOffs(78, 25)
						.addBox(-0.5F, -0.9527F, 13.8733F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(27, 112)
						.addBox(-0.5F, -1.9527F, 12.8733F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 28)
						.addBox(-0.5F, -0.9527F, 0.8733F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.8333F, 4.4527F, -16.6233F));

		PartDefinition sword_r1 = sword
				.addOrReplaceChild("sword_r1",
						CubeListBuilder.create().texOffs(39, 16).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r2 = sword.addOrReplaceChild("sword_r2",
				CubeListBuilder.create().texOffs(39, 15).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.6436F, 0.8403F, 0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r3 = sword.addOrReplaceChild("sword_r3",
				CubeListBuilder.create().texOffs(38, 16).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2813F, 0.2305F, -0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r4 = sword.addOrReplaceChild("sword_r4",
				CubeListBuilder.create().texOffs(38, 15).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.4561F, 0.9965F, 0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r5 = sword.addOrReplaceChild("sword_r5",
				CubeListBuilder.create().texOffs(33, 16).addBox(-0.5F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.1396F, 13.1722F, -0.6545F, 0.0F, 0.0F));

		PartDefinition sword_r6 = sword.addOrReplaceChild("sword_r6",
				CubeListBuilder.create().texOffs(33, 15).addBox(-0.5F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.045F, 13.1722F, 0.6545F, 0.0F, 0.0F));

		PartDefinition left_arm_main_Group = body.addOrReplaceChild("left_arm_main_Group", CubeListBuilder.create(),
				PartPose.offset(5.6944F, -13.2901F, -0.0687F));

		PartDefinition left_arm = left_arm_main_Group.addOrReplaceChild("left_arm", CubeListBuilder.create()
				.texOffs(91, 98).addBox(-2.5253F, 1.0928F, -2.1484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(100, 8).addBox(-2.5253F, 1.0928F, -2.2484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition body_r4 = left_arm.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(101, 79)
						.addBox(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(101, 71)
						.addBox(-2.5F, -1.5F, -2.1F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1739F, 4.4092F, -0.1484F, 0.0F, 0.0F, -0.0436F));

		PartDefinition body_r5 = left_arm.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(103, 66)
						.addBox(-2.5F, -1.5F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 0)
						.addBox(-2.5F, -1.5F, -2.3F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0253F, 1.4483F, -0.1188F, 0.0F, 0.0F, 0.1309F));

		PartDefinition down_side_L = left_arm.addOrReplaceChild("down_side_L",
				CubeListBuilder.create().texOffs(83, 0)
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 106)
						.addBox(-2.0F, 3.0F, -2.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 106)
						.addBox(-0.9F, 3.0F, -2.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 106)
						.addBox(-2.0F, 3.0F, -1.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 106)
						.addBox(-0.9F, 3.0F, -1.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2467F, 6.4327F, -0.1688F, 0.0F, 3.1416F, 0.0F));

		PartDefinition shield = left_arm.addOrReplaceChild("shield",
				CubeListBuilder.create().texOffs(25, 43)
						.addBox(0.0F, -1.1935F, -6.0F, 0.0F, 2.3869F, 12.0F, new CubeDeformation(0.0F)).texOffs(73, 114)
						.addBox(-0.5F, -1.1935F, -6.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 112)
						.addBox(-0.5F, -1.1935F, 5.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 105)
						.addBox(0.0F, -6.0F, -1.1935F, 0.0F, 12.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(89, 110)
						.addBox(-0.5F, 5.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(67, 24)
						.addBox(-0.5F, -6.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.67F, 10.4327F, -0.0813F));

		PartDefinition shield_r1 = shield.addOrReplaceChild("shield_r1",
				CubeListBuilder.create().texOffs(75, 110)
						.addBox(7.0F, -6.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(96, 110)
						.addBox(7.0F, 5.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(10, 105)
						.addBox(7.5F, -6.0F, -1.1935F, 0.0F, 12.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(68, 112)
						.addBox(7.0F, -1.1935F, 5.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 114)
						.addBox(7.0F, -1.1935F, -6.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(7.5F, -1.1935F, -6.0F, 0.0F, 2.3869F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition shield_r2 = shield.addOrReplaceChild("shield_r2",
				CubeListBuilder.create().texOffs(15, 112).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.0565F, 0.7854F, 0.0F, 0.0F));

		PartDefinition shield_r3 = shield.addOrReplaceChild("shield_r3",
				CubeListBuilder.create().texOffs(82, 110)
						.addBox(7.0F, 5.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(110, 96)
						.addBox(7.0F, -6.0F, -1.1935F, 1.0F, 1.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(0, 105)
						.addBox(7.5F, -6.0F, -1.1935F, 0.0F, 12.0F, 2.3869F, new CubeDeformation(0.0F)).texOffs(58, 112)
						.addBox(7.0F, -1.1935F, 5.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 29)
						.addBox(7.0F, -1.1935F, -6.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(7.5F, -1.1935F, -6.0F, 0.0F, 2.3869F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition shield_r4 = shield.addOrReplaceChild("shield_r4",
				CubeListBuilder.create().texOffs(113, 21)
						.addBox(7.0F, -1.1935F, 5.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 114)
						.addBox(7.0F, -1.1935F, -6.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 43)
						.addBox(7.5F, -1.1935F, -6.0F, 0.0F, 2.3869F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition shield_r5 = shield.addOrReplaceChild("shield_r5",
				CubeListBuilder.create().texOffs(53, 112)
						.addBox(7.0F, -1.1935F, 5.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 25)
						.addBox(7.0F, -1.1935F, -6.0F, 1.0F, 2.3869F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 0)
						.addBox(7.5F, -1.1935F, -6.0F, 0.0F, 2.3869F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition right_leg = soldier.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(17, 84)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 76)
						.addBox(-2.0F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 49)
						.addBox(-1.8F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 60)
						.addBox(-1.8F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 87)
						.addBox(-2.2F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0196F, -12.9525F, 0.0333F, 0.0F, 0.0F, 0.0436F));

		PartDefinition right_leg2 = right_leg.addOrReplaceChild("right_leg2",
				CubeListBuilder.create().texOffs(83, 12)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 15)
						.addBox(-2.0F, 5.0F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(63, 67)
						.addBox(-1.9001F, 4.9956F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(103, 42)
						.addBox(-2.0999F, 5.0044F, -4.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition right_leg_r1 = right_leg2.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(23, 75).addBox(-4.4493F, -0.3931F, -3.5F, 4.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4408F, 4.9273F, -1.3534F, 0.1308F, -0.0057F, -0.0004F));

		PartDefinition right_leg3 = right_leg.addOrReplaceChild("right_leg3", CubeListBuilder.create(),
				PartPose.offset(-0.1F, 6.0F, -0.1F));

		PartDefinition right_leg_r2 = right_leg3.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(75, 106).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, -0.1F, -1.7695F, 0.2182F, 0.0F, 0.0F));

		PartDefinition right_leg_r3 = right_leg3.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(56, 24).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, 1.0F, -1.6211F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Left_leg = soldier.addOrReplaceChild("Left_leg",
				CubeListBuilder.create().texOffs(68, 87)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(85, 87)
						.addBox(-2.0F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 94)
						.addBox(-1.8F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 95)
						.addBox(-1.8F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(96, 23)
						.addBox(-2.2F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9804F, -12.9525F, 0.0333F, 0.0F, 0.0F, -0.0436F));

		PartDefinition leftleg = Left_leg.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(51, 87)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 58)
						.addBox(-2.0F, 5.0F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-1.9001F, 5.0044F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(102, 87)
						.addBox(-2.0999F, 4.9956F, -4.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition leg_r1 = leftleg.addOrReplaceChild("leg_r1",
				CubeListBuilder.create().texOffs(0, 73).addBox(0.4493F, -0.3931F, -3.5F, 4.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4291F, 4.9316F, -1.3534F, 0.1308F, 0.0057F, 0.0004F));

		PartDefinition LeftLeg2 = Left_leg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create(),
				PartPose.offset(-0.1F, 6.0F, -0.1F));

		PartDefinition leg_r2 = LeftLeg2.addOrReplaceChild("leg_r2",
				CubeListBuilder.create().texOffs(97, 106).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, -0.1F, -1.7695F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leg_r3 = LeftLeg2.addOrReplaceChild("leg_r3",
				CubeListBuilder.create().texOffs(86, 106).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, 1.0F, -1.6211F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		soldier.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}