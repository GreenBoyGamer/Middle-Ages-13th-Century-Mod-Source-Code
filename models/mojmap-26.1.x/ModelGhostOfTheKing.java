// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGhostOfTheKing<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ghostoftheking"), "main");
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
	private final ModelPart sword2;
	private final ModelPart right_leg;
	private final ModelPart right_leg2;
	private final ModelPart right_leg3;
	private final ModelPart Left_leg;
	private final ModelPart leftleg;
	private final ModelPart LeftLeg2;

	public ModelGhostOfTheKing(ModelPart root) {
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
		this.sword2 = this.down_side_L.getChild("sword2");
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

		PartDefinition body = soldier.addOrReplaceChild("body", CubeListBuilder.create().texOffs(33, 0)
				.addBox(-2.0589F, -12.8575F, -1.9F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 26)
				.addBox(-2.0589F, -10.8575F, -2.15F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(94, 16)
				.addBox(-1.1589F, -3.8575F, -2.25F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(105, 45)
				.addBox(-1.1589F, -3.6575F, -2.35F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 105)
				.addBox(-1.1589F, -4.0574F, -2.35F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(100, 69)
				.addBox(-3.9589F, -3.8575F, -2.25F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(98, 100)
				.addBox(-1.1589F, -3.8575F, -0.55F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 102)
				.addBox(-3.9589F, -3.8575F, -0.55F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0393F, -12.095F, -0.0667F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(85, 63)
						.addBox(0.9905F, -4.2179F, -2.125F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 53)
						.addBox(0.9905F, -6.2179F, -1.875F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -6.8575F, 0.175F, -3.1416F, 0.0F, 3.0543F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2",
				CubeListBuilder.create().texOffs(68, 104).addBox(-2.0F, -4.0F, -2.125F, 3.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -0.0574F, 0.2297F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3",
				CubeListBuilder.create().texOffs(60, 9).addBox(-2.0F, -4.0F, -2.125F, 4.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -6.8575F, 0.175F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(85, 50).addBox(-3.9905F, -4.2179F, -2.125F, 3.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -6.8575F, 0.175F, 3.1416F, 0.0F, -3.0543F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(51, 81).addBox(-3.9905F, -4.2179F, -2.0F, 3.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -6.8575F, -0.15F, 0.0F, 0.0F, -0.0873F));

		PartDefinition body_r6 = body.addOrReplaceChild("body_r6",
				CubeListBuilder.create().texOffs(23, 53).addBox(-1.5F, -6.0F, -1.875F, 3.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5589F, -6.8575F, -0.025F, 0.0F, 0.0F, -0.0873F));

		PartDefinition body_r7 = body.addOrReplaceChild("body_r7",
				CubeListBuilder.create().texOffs(59, 9)
						.addBox(0.3101F, -1.0203F, 0.75F, 1.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(85, 100)
						.addBox(-2.6269F, -4.9783F, -2.25F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 26)
						.addBox(0.1269F, 0.9783F, 0.75F, 1.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(100, 59)
						.addBox(-2.6269F, -4.9783F, 0.25F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.362F, 1.5123F, 0.1F, -3.1416F, 0.0F, -2.9671F));

		PartDefinition body_r8 = body.addOrReplaceChild("body_r8",
				CubeListBuilder.create().texOffs(100, 49)
						.addBox(-2.0F, -5.0F, -2.0F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 100)
						.addBox(-2.0F, -5.0F, -4.5F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6911F, 1.6425F, 2.35F, 0.0F, 0.0F, -0.1745F));

		PartDefinition body_r9 = body.addOrReplaceChild("body_r9",
				CubeListBuilder.create().texOffs(52, 28).addBox(1.0F, 1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2744F, -0.3575F, -0.15F, 0.0F, 0.0F, -0.1745F));

		PartDefinition body_r10 = body.addOrReplaceChild("body_r10",
				CubeListBuilder.create().texOffs(52, 27).addBox(1.0F, 1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4411F, 1.6425F, -0.15F, 0.0F, 0.0F, -0.1745F));

		PartDefinition body_r11 = body.addOrReplaceChild("body_r11",
				CubeListBuilder.create().texOffs(0, 85).addBox(0.9905F, -4.2179F, -2.0F, 3.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0589F, -6.8575F, -0.15F, 0.0F, 0.0F, 0.0873F));

		PartDefinition body_r12 = body.addOrReplaceChild("body_r12",
				CubeListBuilder.create().texOffs(38, 53).addBox(-1.5F, -6.0F, -1.875F, 3.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4411F, -6.8575F, -0.125F, 0.0F, 0.0F, 0.0873F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
				.addBox(-4.5F, -7.25F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(105, 40)
				.addBox(-4.5F, -3.75F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 105)
				.addBox(2.5F, -3.75F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(1.1213F, -9.4258F, -0.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(1.1213F, -9.4258F, -2.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(1.1213F, -9.4258F, 1.7525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.1213F, -9.4258F, 1.7525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.1213F, -9.4258F, -0.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.1213F, -9.4258F, -2.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.1213F, -9.4258F, -4.2476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.2213F, -6.4258F, -3.7476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.1213F, -6.4258F, -1.7475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.3213F, -6.4258F, 0.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.1213F, -6.4258F, 2.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.2213F, -4.4258F, 2.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.1213F, -4.4258F, 0.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.2213F, -4.4258F, -1.7476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.1213F, -6.4258F, 2.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.2213F, -6.4258F, -3.7476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.1213F, -6.4258F, -1.7475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.3213F, -6.4258F, 0.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.2213F, -4.4258F, -1.7476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.1213F, -4.4258F, 0.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.2213F, -4.4258F, 2.5025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-1.7787F, -4.4258F, 2.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-1.8787F, -4.4258F, 0.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-1.7787F, -4.4258F, -1.7476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-1.6787F, -6.4258F, 0.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-1.8787F, -6.4258F, -1.7475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-1.7787F, -6.4258F, -3.7476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-1.8787F, -6.4258F, 2.3525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-2.3787F, -8.1758F, 2.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.6213F, -8.1758F, 2.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.8787F, -6.4258F, 2.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.7787F, -6.4258F, -3.7476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.8787F, -6.4258F, -1.7475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.6787F, -6.4258F, 0.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.7787F, -4.4258F, -1.7476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.8787F, -4.4258F, 0.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.7787F, -4.4258F, 2.5025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-4.2787F, -4.4258F, 2.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-4.3787F, -4.4258F, 0.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-4.2787F, -4.4258F, -1.7476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-4.1787F, -6.4258F, 0.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-4.3787F, -6.4258F, -1.7475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-4.2787F, -6.4258F, -3.7476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-4.3787F, -6.4258F, 2.2525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.1213F, -9.4258F, -2.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(2.1213F, -9.4258F, -0.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.1213F, -9.4258F, -0.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.1213F, -9.4258F, -2.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(0.1213F, -9.4258F, -4.2476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-1.8787F, -9.4258F, -4.2476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-1.8787F, -9.4258F, -2.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-1.8787F, -9.4258F, -0.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-0.8787F, -9.4258F, 1.7525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-2.8787F, -9.4258F, 1.7525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.8787F, -9.4258F, 1.7525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-2.8787F, -9.4258F, -0.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.8787F, -9.4258F, -0.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.8787F, -9.4258F, -2.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-2.8787F, -9.4258F, -2.2475F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-2.8787F, -9.4258F, -4.2476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 9)
				.addBox(-3.8787F, -9.4258F, -4.2476F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 74)
				.addBox(-1.5F, -9.9353F, -2.2097F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0589F, -12.8575F, 0.1F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(56, 105).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.6141F, 6.5273F, -0.9362F, 0.678F, 0.4326F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(104, 79).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.9254F, 5.1502F, -0.4233F, 0.3897F, 0.7006F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(105, 35).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0335F, 3.1159F, -0.2849F, 0.274F, 0.7459F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(105, 30).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.3847F, 1.532F, -0.0309F, 0.0308F, 0.7849F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(50, 9).addBox(1.1213F, -1.3787F, -3.1213F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0471F, 2.8737F, -0.5299F, 0.7119F, -0.3655F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(76, 50).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8333F, -4.3833F, -3.5766F, -0.3897F, -0.05F, -0.121F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(69, 50).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0667F, -4.3833F, -3.5766F, -0.3897F, 0.05F, 0.121F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8",
				CubeListBuilder.create().texOffs(104, 97).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, -2.15F, -3.6375F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9",
				CubeListBuilder.create().texOffs(12, 25)
						.addBox(-0.75F, 2.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 25)
						.addBox(-0.75F, 2.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 25)
						.addBox(-0.75F, -4.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 25)
						.addBox(-0.75F, -4.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 25)
						.addBox(-0.75F, -1.0F, 3.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 25)
						.addBox(-0.75F, -1.0F, -4.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.05F, -7.95F, 0.0F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10",
				CubeListBuilder.create().texOffs(12, 25)
						.addBox(-0.75F, 2.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 25)
						.addBox(-0.75F, 2.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 25)
						.addBox(-0.75F, -4.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 25)
						.addBox(-0.75F, -4.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 25)
						.addBox(-0.75F, -1.0F, 3.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 25)
						.addBox(-0.75F, -1.0F, -4.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.05F, -7.95F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition EyeL = head.addOrReplaceChild("EyeL", CubeListBuilder.create().texOffs(37, 26).addBox(-0.75F,
				-0.5F, -3.9922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5833F, -3.5F, -0.0844F));

		PartDefinition Eyeball2 = EyeL.addOrReplaceChild("Eyeball2", CubeListBuilder.create().texOffs(95, 30)
				.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.25F, 0.0F, -3.5078F));

		PartDefinition EyeR = head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(44, 26).addBox(-0.75F,
				-0.5F, -3.9922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.3167F, -3.5F, -0.0844F));

		PartDefinition Eyeball = EyeR.addOrReplaceChild("Eyeball", CubeListBuilder.create().texOffs(100, 30)
				.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.75F, 0.0F, -3.5078F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(88, 30).addBox(-1.0F,
				-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.15F, -1.1F, -3.6F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(85, 84)
				.addBox(-3.3824F, 0.9381F, -2.2484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 33)
				.addBox(-3.3824F, 0.9381F, -2.1484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.9551F, -13.1353F, 0.2688F));

		PartDefinition body_r13 = right_arm.addOrReplaceChild("body_r13",
				CubeListBuilder.create().texOffs(66, 87)
						.addBox(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 41)
						.addBox(-2.5F, -1.5F, -2.1F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6832F, 4.2545F, -0.1484F, 0.0F, 0.0F, -0.0436F));

		PartDefinition body_r14 = right_arm.addOrReplaceChild("body_r14",
				CubeListBuilder.create().texOffs(54, 39)
						.addBox(-2.5F, -1.5F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 76)
						.addBox(-2.5F, -1.5F, -2.3005F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8824F, 1.2935F, -0.1188F, 0.0F, 0.0F, 0.1309F));

		PartDefinition down_side = right_arm.addOrReplaceChild("down_side", CubeListBuilder.create().texOffs(0, 62)
				.addBox(-2.0F, -0.75F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.1038F, 6.0279F, -0.1688F));

		PartDefinition sword = down_side.addOrReplaceChild("sword",
				CubeListBuilder.create().texOffs(34, 92)
						.addBox(-0.5F, -0.9527F, 13.8733F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(17, 62)
						.addBox(-0.5F, -1.9527F, 12.8733F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-0.5F, -0.9527F, 0.8733F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.8333F, 4.4527F, -16.6233F));

		PartDefinition sword_r1 = sword
				.addOrReplaceChild("sword_r1",
						CubeListBuilder.create().texOffs(51, 26).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r2 = sword.addOrReplaceChild("sword_r2",
				CubeListBuilder.create().texOffs(52, 26).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.6436F, 0.8403F, 0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r3 = sword.addOrReplaceChild("sword_r3",
				CubeListBuilder.create().texOffs(59, 10).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2813F, 0.2305F, -0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r4 = sword.addOrReplaceChild("sword_r4",
				CubeListBuilder.create().texOffs(51, 28).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.4561F, 0.9965F, 0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r5 = sword.addOrReplaceChild("sword_r5",
				CubeListBuilder.create().texOffs(50, 16).addBox(-0.5F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.1396F, 13.1722F, -0.6545F, 0.0F, 0.0F));

		PartDefinition sword_r6 = sword.addOrReplaceChild("sword_r6",
				CubeListBuilder.create().texOffs(17, 68).addBox(-0.5F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.045F, 13.1722F, 0.6545F, 0.0F, 0.0F));

		PartDefinition left_arm_main_Group = body.addOrReplaceChild("left_arm_main_Group", CubeListBuilder.create(),
				PartPose.offset(5.6944F, -13.2901F, -0.0688F));

		PartDefinition left_arm = left_arm_main_Group.addOrReplaceChild("left_arm", CubeListBuilder.create()
				.texOffs(88, 22).addBox(-2.5253F, 1.0928F, -2.1484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(85, 92).addBox(-2.5253F, 1.0928F, -2.2484F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition body_r15 = left_arm.addOrReplaceChild("body_r15",
				CubeListBuilder.create().texOffs(94, 8)
						.addBox(-2.5F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(94, 0)
						.addBox(-2.5F, -1.5F, -2.1F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1739F, 4.4092F, -0.1484F, 0.0F, 0.0F, -0.0436F));

		PartDefinition body_r16 = left_arm.addOrReplaceChild("body_r16",
				CubeListBuilder.create().texOffs(71, 33)
						.addBox(-2.5F, -1.5F, 0.9996F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 92)
						.addBox(-2.5F, -1.5F, -2.3F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0253F, 1.4483F, -0.1187F, 0.0F, 0.0F, 0.1309F));

		PartDefinition down_side_L = left_arm.addOrReplaceChild("down_side_L",
				CubeListBuilder.create().texOffs(68, 53).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2466F, 6.4327F, -0.1688F, 0.0F, 3.1416F, 0.0F));

		PartDefinition sword2 = down_side_L.addOrReplaceChild("sword2",
				CubeListBuilder.create().texOffs(51, 95)
						.addBox(-0.5F, -0.9527F, 13.8733F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(77, 104)
						.addBox(-0.5F, -1.9527F, 12.8733F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-0.5F, -0.9527F, 0.8733F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.6734F, 4.2027F, -16.2858F));

		PartDefinition sword_r7 = sword2
				.addOrReplaceChild("sword_r7",
						CubeListBuilder.create().texOffs(51, 27).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r8 = sword2.addOrReplaceChild("sword_r8",
				CubeListBuilder.create().texOffs(53, 28).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.6436F, 0.8403F, 0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r9 = sword2.addOrReplaceChild("sword_r9",
				CubeListBuilder.create().texOffs(59, 11).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2813F, 0.2305F, -0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r10 = sword2.addOrReplaceChild("sword_r10",
				CubeListBuilder.create().texOffs(53, 27).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, -1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.4561F, 0.9965F, 0.8727F, 0.0F, 0.0F));

		PartDefinition sword_r11 = sword2.addOrReplaceChild("sword_r11",
				CubeListBuilder.create().texOffs(55, 16).addBox(-0.5F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.1396F, 13.1722F, -0.6545F, 0.0F, 0.0F));

		PartDefinition sword_r12 = sword2.addOrReplaceChild("sword_r12",
				CubeListBuilder.create().texOffs(17, 69).addBox(-0.5F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.045F, 13.1722F, 0.6545F, 0.0F, 0.0F));

		PartDefinition right_leg = soldier.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(69, 39)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 70)
						.addBox(-2.0F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 70)
						.addBox(-1.8F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(51, 70)
						.addBox(-1.8F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(71, 22)
						.addBox(-2.2F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0196F, -12.9525F, 0.0333F, 0.0F, 0.0F, 0.0436F));

		PartDefinition right_leg2 = right_leg.addOrReplaceChild("right_leg2",
				CubeListBuilder.create().texOffs(68, 65)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 17)
						.addBox(-2.0F, 5.0F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(46, 44)
						.addBox(-1.9001F, 4.9956F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 100)
						.addBox(-2.0999F, 5.0044F, -4.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition right_leg_r1 = right_leg2.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(0, 53).addBox(-4.4493F, -0.3931F, -3.5F, 4.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4408F, 4.9273F, -1.3534F, 0.1308F, -0.0057F, -0.0004F));

		PartDefinition right_leg3 = right_leg.addOrReplaceChild("right_leg3", CubeListBuilder.create(),
				PartPose.offset(-0.1F, 6.0F, -0.1F));

		PartDefinition right_leg_r2 = right_leg3.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(104, 85).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, -0.1F, -1.7695F, 0.2182F, 0.0F, 0.0F));

		PartDefinition right_leg_r3 = right_leg3.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(60, 22).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, 1.0F, -1.6211F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Left_leg = soldier.addOrReplaceChild("Left_leg",
				CubeListBuilder.create().texOffs(68, 76)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(77, 0)
						.addBox(-2.0F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(77, 11)
						.addBox(-1.8F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 81)
						.addBox(-1.8F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 81)
						.addBox(-2.2F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9804F, -12.9525F, 0.0333F, 0.0F, 0.0F, -0.0436F));

		PartDefinition leftleg = Left_leg.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(0, 74)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(-2.0F, 5.0F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(23, 44)
						.addBox(-1.9001F, 5.0044F, -4.9F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(68, 95)
						.addBox(-2.0999F, 4.9956F, -4.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition leg_r1 = leftleg.addOrReplaceChild("leg_r1",
				CubeListBuilder.create().texOffs(50, 0).addBox(0.4493F, -0.3931F, -3.5F, 4.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4291F, 4.9316F, -1.3534F, 0.1308F, 0.0057F, 0.0004F));

		PartDefinition LeftLeg2 = Left_leg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create(),
				PartPose.offset(-0.1F, 6.0F, -0.1F));

		PartDefinition leg_r2 = LeftLeg2.addOrReplaceChild("leg_r2",
				CubeListBuilder.create().texOffs(104, 93).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0703F, -0.1F, -1.7695F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leg_r3 = LeftLeg2.addOrReplaceChild("leg_r3",
				CubeListBuilder.create().texOffs(104, 89).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
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