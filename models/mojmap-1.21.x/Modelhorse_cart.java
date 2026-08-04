// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhorse_cart<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "horse_cart"), "main");
	private final ModelPart cart;
	private final ModelPart bone;
	private final ModelPart wheel;
	private final ModelPart wheel2;

	public Modelhorse_cart(ModelPart root) {
		this.cart = root.getChild("cart");
		this.bone = this.cart.getChild("bone");
		this.wheel = this.cart.getChild("wheel");
		this.wheel2 = this.cart.getChild("wheel2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cart = partdefinition.addOrReplaceChild("cart", CubeListBuilder.create(),
				PartPose.offset(-0.0772F, 0.3099F, -23.3765F));

		PartDefinition body_r1 = cart.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(37, 34)
						.addBox(5.5F, -1.0F, -8.5F, -2.0F, 18.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(17.5F, -1.0F, -8.5F, -2.0F, 18.0F, -2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -0.6231F, -2.6561F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r2 = cart.addOrReplaceChild("body_r2",
				CubeListBuilder.create().texOffs(70, 111).addBox(16.5F, 24.0F, -3.5F, -12.0F, -2.0F, -15.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -3.9565F, 0.6773F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r3 = cart.addOrReplaceChild("body_r3",
				CubeListBuilder.create().texOffs(66, 100).addBox(16.5F, 26.0F, -9.5F, -12.0F, -8.0F, -9.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -2.6231F, -2.6561F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r4 = cart.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(36, 34).addBox(4.5F, 39.0F, -8.4995F, -1.0F, -22.0F, -12.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -2.6231F, -2.7303F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r5 = cart.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(37, 34)
						.addBox(4.5F, 17.0F, -16.5F, -12.0F, -4.0F, -3.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(4.5F, 17.0F, -15.5F, -12.0F, -3.0F, -4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.4606F, -2.6231F, -1.2061F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r6 = cart.addOrReplaceChild("body_r6",
				CubeListBuilder.create().texOffs(37, 34).addBox(5.5002F, 17.0F, -11.5F, -14.0F, -1.0F, -9.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.4606F, -2.6231F, -2.5227F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r7 = cart.addOrReplaceChild("body_r7",
				CubeListBuilder.create().texOffs(29, 26)
						.addBox(4.5F, 18.0F, -0.5F, -1.0F, -13.0F, -4.0F, new CubeDeformation(0.05F)).texOffs(29, 26)
						.addBox(-8.1667F, 18.0F, -0.5F, -1.0F, -13.0F, -4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(2.3772F, -9.9898F, 17.4273F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r8 = cart.addOrReplaceChild("body_r8",
				CubeListBuilder.create().texOffs(29, 26)
						.addBox(5.5F, 19.0F, -0.5F, -2.0F, -2.0F, -4.0F, new CubeDeformation(0.05F)).texOffs(29, 26)
						.addBox(-6.5F, 19.0F, -0.5F, -2.0F, -2.0F, -4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.4606F, -10.2398F, 3.8439F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r9 = cart.addOrReplaceChild("body_r9",
				CubeListBuilder.create().texOffs(29, 26)
						.addBox(5.5F, 19.0F, -0.5F, -2.0F, -2.0F, -4.0F, new CubeDeformation(0.05F)).texOffs(29, 26)
						.addBox(17.5F, 19.0F, -0.5F, -2.0F, -2.0F, -4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -10.2398F, 17.1773F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r10 = cart.addOrReplaceChild("body_r10",
				CubeListBuilder.create().texOffs(37, 34)
						.addBox(5.5F, 19.0F, 2.5F, -2.0F, -2.0F, -12.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(17.5F, 19.0F, 2.5F, -2.0F, -2.0F, -12.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -3.3731F, 17.1773F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r11 = cart.addOrReplaceChild("body_r11",
				CubeListBuilder.create().texOffs(37, 34)
						.addBox(4.5F, 18.0F, 2.5F, -1.0F, -13.0F, -12.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(17.1667F, 18.0F, 2.5F, -1.0F, -13.0F, -12.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.2894F, -3.1231F, 17.4273F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r12 = cart.addOrReplaceChild("body_r12",
				CubeListBuilder.create().texOffs(37, 34)
						.addBox(-4.5F, 0.5F, -3.0F, -2.0F, -6.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(8.5F, 0.5F, -3.0F, -2.0F, -6.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.9488F, -12.7565F, 21.6273F, 1.7453F, 0.0F, 0.0F));

		PartDefinition body_r13 = cart.addOrReplaceChild("body_r13",
				CubeListBuilder.create().texOffs(37, 34)
						.addBox(-4.5005F, 0.5F, -2.0F, -2.0F, -7.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(8.501F, 0.5F, -2.0F, -2.0F, -7.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.9488F, -11.7774F, 22.0667F, -1.7017F, 0.0F, 0.0F));

		PartDefinition body_r14 = cart.addOrReplaceChild("body_r14",
				CubeListBuilder.create().texOffs(37, 34)
						.addBox(-4.5F, 0.5F, -3.0F, -2.0F, -6.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(8.5F, 0.5F, -3.0F, -2.0F, -6.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.9488F, -12.5952F, 32.507F, 1.7017F, 0.0F, 0.0F));

		PartDefinition body_r15 = cart.addOrReplaceChild("body_r15",
				CubeListBuilder.create().texOffs(37, 34)
						.addBox(-4.5005F, -0.5F, -1.0F, -2.0F, -5.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(8.5006F, -0.5F, -1.0F, -2.0F, -5.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.9488F, -12.7565F, 32.0921F, -1.7453F, 0.0F, 0.0F));

		PartDefinition body_r16 = cart.addOrReplaceChild("body_r16",
				CubeListBuilder.create().texOffs(37, 34).addBox(6.5F, -4.6457F, 2.3672F, -13.0F, -6.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0512F, -11.3183F, 27.1059F, 1.7453F, 0.0F, 0.0F));

		PartDefinition body_r17 = cart.addOrReplaceChild("body_r17",
				CubeListBuilder.create().texOffs(37, 34).addBox(6.5F, 5.556F, -1.7975F, -13.0F, -7.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0512F, -11.3183F, 27.1059F, -1.7017F, 0.0F, 0.0F));

		PartDefinition body_r18 = cart.addOrReplaceChild("body_r18",
				CubeListBuilder.create().texOffs(37, 34).addBox(6.5F, 6.0216F, 0.561F, -13.0F, -6.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0512F, -11.3183F, 27.1059F, 1.7017F, 0.0F, 0.0F));

		PartDefinition body_r19 = cart.addOrReplaceChild("body_r19",
				CubeListBuilder.create().texOffs(37, 34).addBox(6.5F, -5.1607F, -3.2828F, -13.0F, -5.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0512F, -11.3183F, 27.1059F, -1.7453F, 0.0F, 0.0F));

		PartDefinition body_r20 = cart.addOrReplaceChild("body_r20",
				CubeListBuilder.create().texOffs(37, 34)
						.addBox(5.5F, 19.0F, 2.5F, -2.0F, -2.0F, -12.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(17.5F, 19.0F, 2.5F, -2.0F, -2.0F, -12.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -3.3731F, 3.8439F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r21 = cart.addOrReplaceChild("body_r21",
				CubeListBuilder.create().texOffs(36, 34)
						.addBox(5.5F, 39.0F, -8.5F, -2.0F, -22.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(18.9F, 39.0F, -8.5F, -2.0F, -22.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(37, 34)
						.addBox(17.5667F, 39.0F, -8.5F, -12.0F, -12.0F, -2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.1894F, -2.8731F, -2.6561F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r22 = cart.addOrReplaceChild("body_r22",
				CubeListBuilder.create().texOffs(100, 31).addBox(0.5F, 38.0F, -4.5F, -1.0F, -1.0F, -2.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.1228F, -4.6231F, -2.9061F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r23 = cart.addOrReplaceChild("body_r23",
				CubeListBuilder.create().texOffs(114, 70).addBox(3.5F, 37.0F, -3.5F, -7.0F, -7.0F, -7.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.1228F, -4.6231F, -2.6561F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r24 = cart.addOrReplaceChild("body_r24",
				CubeListBuilder.create().texOffs(37, 34).addBox(4.5F, 39.0F, -8.5094F, -12.0F, -13.0F, -11.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.4606F, -2.6231F, -2.7459F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r25 = cart.addOrReplaceChild("body_r25",
				CubeListBuilder.create().texOffs(37, 34).addBox(5.5F, 39.0F, -8.5F, -1.0F, -22.0F, -12.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.4606F, -2.6231F, -2.7146F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r26 = cart.addOrReplaceChild("body_r26",
				CubeListBuilder.create().texOffs(37, 34).addBox(1.0F, -6.0F, 1.0F, -2.0F, 15.0F, -2.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-1.3728F, 8.8769F, -1.3227F, 0.0F, 0.7854F, -1.5708F));

		PartDefinition bone = cart.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-0.5394F, 6.7102F, 19.3439F));

		PartDefinition wheel = cart.addOrReplaceChild("wheel", CubeListBuilder.create().texOffs(36, 47)
				.addBox(-1.0119F, -1.3833F, -6.9883F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 23)
				.addBox(-1.0119F, -1.3833F, 5.0117F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 54)
				.addBox(-1.0119F, 5.0091F, -1.3807F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(0, 39)
				.addBox(-1.0119F, -6.9909F, -1.3807F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)),
				PartPose.offset(7.7558F, 16.3477F, 24.0314F));

		PartDefinition wheel_r1 = wheel.addOrReplaceChild("wheel_r1",
				CubeListBuilder.create().texOffs(22, 39)
						.addBox(6.0F, -7.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(11, 39)
						.addBox(6.0F, 5.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(61, 29)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 48)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, -0.3927F, 0.0F, 0.0F));

		PartDefinition wheel_r2 = wheel.addOrReplaceChild("wheel_r2",
				CubeListBuilder.create().texOffs(50, 29)
						.addBox(6.0F, 5.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(50, 23)
						.addBox(6.0F, -7.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(61, 17)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 45)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, 0.3927F, 0.0F, 0.0F));

		PartDefinition wheel_r3 = wheel.addOrReplaceChild("wheel_r3",
				CubeListBuilder.create().texOffs(58, 55)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 55)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, -0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r4 = wheel.addOrReplaceChild("wheel_r4",
				CubeListBuilder.create().texOffs(25, 13).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 3.1416F, 0.0F, 0.0F));

		PartDefinition wheel_r5 = wheel.addOrReplaceChild("wheel_r5",
				CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 2.3562F, 0.0F, 0.0F));

		PartDefinition wheel_r6 = wheel.addOrReplaceChild("wheel_r6",
				CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 1.5708F, 0.0F, 0.0F));

		PartDefinition wheel_r7 = wheel.addOrReplaceChild("wheel_r7",
				CubeListBuilder.create().texOffs(25, 26).addBox(7.0F, -1.3924F, -8.0F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5119F, -1.1576F, 2.3451F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r8 = wheel.addOrReplaceChild("wheel_r8",
				CubeListBuilder.create().texOffs(0, 51).addBox(7.0F, -1.3924F, -2.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2619F, -0.4909F, 1.0117F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r9 = wheel.addOrReplaceChild("wheel_r9",
				CubeListBuilder.create().texOffs(61, 11)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 45)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wheel2 = cart.addOrReplaceChild("wheel2", CubeListBuilder.create().texOffs(51, 54)
				.addBox(-1.0119F, -1.3833F, -6.9883F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 6)
				.addBox(-1.0119F, -1.3833F, 5.0117F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 12)
				.addBox(-1.0119F, 5.0091F, -1.3807F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(50, 18)
				.addBox(-1.0119F, -6.9909F, -1.3807F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5775F, 16.3477F, 24.0314F, 0.0F, 3.1416F, 0.0F));

		PartDefinition wheel_r10 = wheel2.addOrReplaceChild("wheel_r10",
				CubeListBuilder.create().texOffs(50, 30)
						.addBox(6.0F, -7.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(50, 24)
						.addBox(6.0F, 5.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(61, 12)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, -0.3927F, 0.0F, 0.0F));

		PartDefinition wheel_r11 = wheel2.addOrReplaceChild("wheel_r11",
				CubeListBuilder.create().texOffs(50, 6)
						.addBox(6.0F, 5.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(6.0F, -7.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(61, 0)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 54)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, 0.3927F, 0.0F, 0.0F));

		PartDefinition wheel_r12 = wheel2.addOrReplaceChild("wheel_r12",
				CubeListBuilder.create().texOffs(61, 18)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 58)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, -0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r13 = wheel2.addOrReplaceChild("wheel_r13",
				CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 3.1416F, 0.0F, 0.0F));

		PartDefinition wheel_r14 = wheel2.addOrReplaceChild("wheel_r14",
				CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 2.3562F, 0.0F, 0.0F));

		PartDefinition wheel_r15 = wheel2.addOrReplaceChild("wheel_r15",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 1.5708F, 0.0F, 0.0F));

		PartDefinition wheel_r16 = wheel2.addOrReplaceChild("wheel_r16",
				CubeListBuilder.create().texOffs(0, 39).addBox(7.0F, -1.3924F, -8.0F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5119F, -1.1576F, 2.3451F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r17 = wheel2.addOrReplaceChild("wheel_r17",
				CubeListBuilder.create().texOffs(63, 60).addBox(7.0F, -1.3924F, -2.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2619F, -0.4909F, 1.0117F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r18 = wheel2.addOrReplaceChild("wheel_r18",
				CubeListBuilder.create().texOffs(60, 54)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 52)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, 0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cart.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}