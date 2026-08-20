// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmadievalrideruh<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "madievalrideruh"), "main");
	private final ModelPart main_cart;
	private final ModelPart cart;
	private final ModelPart bone;
	private final ModelPart wheel;
	private final ModelPart wheel2;
	private final ModelPart root;
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
	private final ModelPart whole;
	private final ModelPart LeftLeg;
	private final ModelPart LeftLeg2;
	private final ModelPart Waist;
	private final ModelPart Head;
	private final ModelPart eyebrow;
	private final ModelPart EyeR2;
	private final ModelPart Head3;
	private final ModelPart eyeL2;
	private final ModelPart Head4;
	private final ModelPart mouth3;
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

	public Modelmadievalrideruh(ModelPart root) {
		this.main_cart = root.getChild("main_cart");
		this.cart = this.main_cart.getChild("cart");
		this.bone = this.cart.getChild("bone");
		this.wheel = this.cart.getChild("wheel");
		this.wheel2 = this.cart.getChild("wheel2");
		this.root = this.main_cart.getChild("root");
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
		this.whole = this.root.getChild("whole");
		this.LeftLeg = this.whole.getChild("LeftLeg");
		this.LeftLeg2 = this.LeftLeg.getChild("LeftLeg2");
		this.Waist = this.whole.getChild("Waist");
		this.Head = this.Waist.getChild("Head");
		this.eyebrow = this.Head.getChild("eyebrow");
		this.EyeR2 = this.Head.getChild("EyeR2");
		this.Head3 = this.EyeR2.getChild("Head3");
		this.eyeL2 = this.Head.getChild("eyeL2");
		this.Head4 = this.eyeL2.getChild("Head4");
		this.mouth3 = this.Head.getChild("mouth3");
		this.smile_frown = this.mouth3.getChild("smile_frown");
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

		PartDefinition main_cart = partdefinition.addOrReplaceChild("main_cart", CubeListBuilder.create(),
				PartPose.offset(-0.0772F, 0.3099F, -19.8179F));

		PartDefinition cart = main_cart.addOrReplaceChild("cart", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_r1 = cart.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(38, 295)
						.addBox(5.5F, -1.0F, -8.5F, -2.0F, 18.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(17.5F, -1.0F, -8.5F, -2.0F, 18.0F, -2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -0.6231F, -2.6561F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r2 = cart.addOrReplaceChild("body_r2",
				CubeListBuilder.create().texOffs(71, 372).addBox(16.5F, 24.0F, -3.5F, -12.0F, -2.0F, -15.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -3.9565F, 0.6773F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r3 = cart.addOrReplaceChild("body_r3",
				CubeListBuilder.create().texOffs(67, 361).addBox(16.5F, 26.0F, -9.5F, -12.0F, -8.0F, -9.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -2.6231F, -2.6561F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r4 = cart.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(37, 295).addBox(4.5F, 39.0F, -8.4995F, -1.0F, -22.0F, -12.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -2.6231F, -2.7303F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r5 = cart.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(38, 295)
						.addBox(4.5F, 17.0F, -16.5F, -12.0F, -4.0F, -3.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(4.5F, 17.0F, -15.5F, -12.0F, -3.0F, -4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.4606F, -2.6231F, -1.206F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r6 = cart.addOrReplaceChild("body_r6",
				CubeListBuilder.create().texOffs(38, 295).addBox(5.5002F, 17.0F, -11.5F, -14.0F, -1.0F, -9.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.4606F, -2.6231F, -2.5227F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r7 = cart.addOrReplaceChild("body_r7",
				CubeListBuilder.create().texOffs(30, 287)
						.addBox(4.5F, 18.0F, -0.5F, -1.0F, -13.0F, -4.0F, new CubeDeformation(0.05F)).texOffs(30, 287)
						.addBox(-8.1667F, 18.0F, -0.5F, -1.0F, -13.0F, -4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(2.3772F, -9.9898F, 17.4273F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r8 = cart.addOrReplaceChild("body_r8",
				CubeListBuilder.create().texOffs(30, 287)
						.addBox(5.5F, 19.0F, -0.5F, -2.0F, -2.0F, -4.0F, new CubeDeformation(0.05F)).texOffs(30, 287)
						.addBox(-6.5F, 19.0F, -0.5F, -2.0F, -2.0F, -4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.4606F, -10.2398F, 3.844F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r9 = cart.addOrReplaceChild("body_r9",
				CubeListBuilder.create().texOffs(30, 287)
						.addBox(5.5F, 19.0F, -0.5F, -2.0F, -2.0F, -4.0F, new CubeDeformation(0.05F)).texOffs(30, 287)
						.addBox(17.5F, 19.0F, -0.5F, -2.0F, -2.0F, -4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -10.2398F, 17.1773F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r10 = cart.addOrReplaceChild("body_r10",
				CubeListBuilder.create().texOffs(38, 295)
						.addBox(5.5F, 19.0F, 2.5F, -2.0F, -2.0F, -12.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(17.5F, 19.0F, 2.5F, -2.0F, -2.0F, -12.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -3.3731F, 17.1773F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r11 = cart.addOrReplaceChild("body_r11",
				CubeListBuilder.create().texOffs(38, 295)
						.addBox(4.5F, 18.0F, 2.5F, -1.0F, -13.0F, -12.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(17.1667F, 18.0F, 2.5F, -1.0F, -13.0F, -12.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.2894F, -3.1231F, 17.4273F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r12 = cart.addOrReplaceChild("body_r12",
				CubeListBuilder.create().texOffs(38, 295)
						.addBox(-4.5F, 0.5F, -3.0F, -2.0F, -6.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(8.5F, 0.5F, -3.0F, -2.0F, -6.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.9488F, -12.7565F, 21.6273F, 1.7453F, 0.0F, 0.0F));

		PartDefinition body_r13 = cart.addOrReplaceChild("body_r13",
				CubeListBuilder.create().texOffs(38, 295)
						.addBox(-4.5005F, 0.5F, -2.0F, -2.0F, -7.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(8.501F, 0.5F, -2.0F, -2.0F, -7.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.9488F, -11.7775F, 22.0667F, -1.7017F, 0.0F, 0.0F));

		PartDefinition body_r14 = cart.addOrReplaceChild("body_r14",
				CubeListBuilder.create().texOffs(38, 295)
						.addBox(-4.5F, 0.5F, -3.0F, -2.0F, -6.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(8.5F, 0.5F, -3.0F, -2.0F, -6.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.9488F, -12.5953F, 32.507F, 1.7017F, 0.0F, 0.0F));

		PartDefinition body_r15 = cart.addOrReplaceChild("body_r15",
				CubeListBuilder.create().texOffs(38, 295)
						.addBox(-4.5005F, -0.5F, -1.0F, -2.0F, -5.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(8.5006F, -0.5F, -1.0F, -2.0F, -5.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.9488F, -12.7565F, 32.0921F, -1.7453F, 0.0F, 0.0F));

		PartDefinition body_r16 = cart.addOrReplaceChild("body_r16",
				CubeListBuilder.create().texOffs(38, 295).addBox(6.5F, -4.6457F, 2.3672F, -13.0F, -6.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0512F, -11.3183F, 27.1059F, 1.7453F, 0.0F, 0.0F));

		PartDefinition body_r17 = cart.addOrReplaceChild("body_r17",
				CubeListBuilder.create().texOffs(38, 295).addBox(6.5F, 5.556F, -1.7975F, -13.0F, -7.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0512F, -11.3183F, 27.1059F, -1.7017F, 0.0F, 0.0F));

		PartDefinition body_r18 = cart.addOrReplaceChild("body_r18",
				CubeListBuilder.create().texOffs(38, 295).addBox(6.5F, 6.0216F, 0.561F, -13.0F, -6.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0512F, -11.3183F, 27.1059F, 1.7017F, 0.0F, 0.0F));

		PartDefinition body_r19 = cart.addOrReplaceChild("body_r19",
				CubeListBuilder.create().texOffs(38, 295).addBox(6.5F, -5.1607F, -3.2828F, -13.0F, -5.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0512F, -11.3183F, 27.1059F, -1.7453F, 0.0F, 0.0F));

		PartDefinition body_r20 = cart.addOrReplaceChild("body_r20",
				CubeListBuilder.create().texOffs(38, 295)
						.addBox(5.5F, 19.0F, 2.5F, -2.0F, -2.0F, -12.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(17.5F, 19.0F, 2.5F, -2.0F, -2.0F, -12.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-10.5394F, -3.3731F, 3.844F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r21 = cart.addOrReplaceChild("body_r21",
				CubeListBuilder.create().texOffs(37, 295)
						.addBox(5.5F, 39.0F, -8.5F, -2.0F, -22.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(18.9F, 39.0F, -8.5F, -2.0F, -22.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(38, 295)
						.addBox(17.5667F, 39.0F, -8.5F, -12.0F, -12.0F, -2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.1894F, -2.8731F, -2.6561F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r22 = cart.addOrReplaceChild("body_r22",
				CubeListBuilder.create().texOffs(101, 292).addBox(0.5F, 38.0F, -4.5F, -1.0F, -1.0F, -2.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.1228F, -4.6231F, -2.9061F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r23 = cart.addOrReplaceChild("body_r23",
				CubeListBuilder.create().texOffs(116, 329).addBox(3.5F, 37.0F, -3.5F, -7.0F, -7.0F, -7.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.1228F, -4.6231F, -2.6561F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r24 = cart.addOrReplaceChild("body_r24",
				CubeListBuilder.create().texOffs(38, 295).addBox(4.5F, 39.0F, -8.5094F, -12.0F, -13.0F, -11.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.4606F, -2.6231F, -2.7459F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r25 = cart.addOrReplaceChild("body_r25",
				CubeListBuilder.create().texOffs(38, 295).addBox(5.5F, 39.0F, -8.5F, -1.0F, -22.0F, -12.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.4606F, -2.6231F, -2.7146F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r26 = cart.addOrReplaceChild("body_r26",
				CubeListBuilder.create().texOffs(38, 295).addBox(1.0F, -6.0F, 1.0F, -2.0F, 15.0F, -2.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-1.3728F, 8.8769F, -1.3227F, 0.0F, 0.7854F, -1.5708F));

		PartDefinition bone = cart.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-0.5394F, 6.7102F, 19.3439F));

		PartDefinition wheel = cart.addOrReplaceChild("wheel", CubeListBuilder.create().texOffs(37, 308)
				.addBox(-1.0119F, -1.3833F, -6.9883F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 284)
				.addBox(-1.0119F, -1.3833F, 5.0117F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 315)
				.addBox(-1.0119F, 5.0091F, -1.3807F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(1, 300)
				.addBox(-1.0119F, -6.9909F, -1.3807F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)),
				PartPose.offset(7.7558F, 16.3477F, 24.0314F));

		PartDefinition wheel_r1 = wheel.addOrReplaceChild("wheel_r1",
				CubeListBuilder.create().texOffs(23, 300)
						.addBox(6.0F, -7.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(12, 300)
						.addBox(6.0F, 5.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(46, 277)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 309)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, -0.3927F, 0.0F, 0.0F));

		PartDefinition wheel_r2 = wheel.addOrReplaceChild("wheel_r2",
				CubeListBuilder.create().texOffs(51, 290)
						.addBox(6.0F, 5.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(51, 284)
						.addBox(6.0F, -7.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(62, 278)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 306)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, 0.3927F, 0.0F, 0.0F));

		PartDefinition wheel_r3 = wheel.addOrReplaceChild("wheel_r3",
				CubeListBuilder.create().texOffs(59, 316)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 316)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, -0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r4 = wheel.addOrReplaceChild("wheel_r4",
				CubeListBuilder.create().texOffs(26, 274).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 3.1416F, 0.0F, 0.0F));

		PartDefinition wheel_r5 = wheel.addOrReplaceChild("wheel_r5",
				CubeListBuilder.create().texOffs(1, 274).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 2.3562F, 0.0F, 0.0F));

		PartDefinition wheel_r6 = wheel.addOrReplaceChild("wheel_r6",
				CubeListBuilder.create().texOffs(26, 261).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 1.5708F, 0.0F, 0.0F));

		PartDefinition wheel_r7 = wheel.addOrReplaceChild("wheel_r7",
				CubeListBuilder.create().texOffs(26, 287).addBox(7.0F, -1.3924F, -8.0F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5119F, -1.1576F, 2.3451F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r8 = wheel.addOrReplaceChild("wheel_r8",
				CubeListBuilder.create().texOffs(1, 312).addBox(7.0F, -1.3924F, -2.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2619F, -0.4909F, 1.0117F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r9 = wheel.addOrReplaceChild("wheel_r9",
				CubeListBuilder.create().texOffs(62, 272)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 306)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wheel2 = cart.addOrReplaceChild("wheel2", CubeListBuilder.create().texOffs(55, 315)
				.addBox(-1.0119F, -1.3833F, -6.9883F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(65, 267)
				.addBox(-1.0119F, -1.3833F, 5.0117F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 273)
				.addBox(-1.0119F, 5.0091F, -1.3807F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(54, 279)
				.addBox(-1.0119F, -6.9909F, -1.3807F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5775F, 16.3477F, 24.0314F, 0.0F, 3.1416F, 0.0F));

		PartDefinition wheel_r10 = wheel2.addOrReplaceChild("wheel_r10",
				CubeListBuilder.create().texOffs(53, 279)
						.addBox(6.0F, -7.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(54, 285)
						.addBox(6.0F, 5.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(54, 271)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 310)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, -0.3927F, 0.0F, 0.0F));

		PartDefinition wheel_r11 = wheel2.addOrReplaceChild("wheel_r11",
				CubeListBuilder.create().texOffs(54, 267)
						.addBox(6.0F, 5.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(54, 261)
						.addBox(6.0F, -7.0F, -1.3924F, 2.0F, 2.0F, 2.7848F, new CubeDeformation(0.0F)).texOffs(44, 271)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 315)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, 0.3927F, 0.0F, 0.0F));

		PartDefinition wheel_r12 = wheel2.addOrReplaceChild("wheel_r12",
				CubeListBuilder.create().texOffs(65, 279)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 314)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, -0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r13 = wheel2.addOrReplaceChild("wheel_r13",
				CubeListBuilder.create().texOffs(29, 261).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 3.1416F, 0.0F, 0.0F));

		PartDefinition wheel_r14 = wheel2.addOrReplaceChild("wheel_r14",
				CubeListBuilder.create().texOffs(4, 274).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 2.3562F, 0.0F, 0.0F));

		PartDefinition wheel_r15 = wheel2.addOrReplaceChild("wheel_r15",
				CubeListBuilder.create().texOffs(4, 261).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0119F, -0.0209F, -0.0537F, 1.5708F, 0.0F, 0.0F));

		PartDefinition wheel_r16 = wheel2.addOrReplaceChild("wheel_r16",
				CubeListBuilder.create().texOffs(4, 300).addBox(7.0F, -1.3924F, -8.0F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5119F, -1.1576F, 2.3451F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r17 = wheel2.addOrReplaceChild("wheel_r17",
				CubeListBuilder.create().texOffs(67, 321).addBox(7.0F, -1.3924F, -2.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2619F, -0.4909F, 1.0117F, 0.7854F, 0.0F, 0.0F));

		PartDefinition wheel_r18 = wheel2.addOrReplaceChild("wheel_r18",
				CubeListBuilder.create().texOffs(64, 315)
						.addBox(6.0F, -1.3924F, 5.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 313)
						.addBox(6.0F, -1.3924F, -7.0F, 2.0F, 2.7848F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0119F, 0.0091F, 0.0117F, 0.7854F, 0.0F, 0.0F));

		PartDefinition root = main_cart.addOrReplaceChild("root", CubeListBuilder.create(),
				PartPose.offset(-1.9228F, 23.0235F, 2.4846F));

		PartDefinition horse = root.addOrReplaceChild("horse", CubeListBuilder.create(),
				PartPose.offset(-2.0F, -9.3333F, -0.6667F));

		PartDefinition back_right_leg = horse.addOrReplaceChild("back_right_leg", CubeListBuilder.create()
				.texOffs(224, 232).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition back_right_leg2 = back_right_leg.addOrReplaceChild("back_right_leg2", CubeListBuilder.create()
				.texOffs(228, 137).addBox(-2.0F, -0.2F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 5.2F, 1.0F));

		PartDefinition head2 = horse.addOrReplaceChild("head2",
				CubeListBuilder.create().texOffs(165, 125)
						.addBox(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(185, 248)
						.addBox(-3.1F, -11.1F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(243, 222)
						.addBox(-0.9F, -11.1F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(244, 171)
						.addBox(-3.1F, -10.9F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(245, 132)
						.addBox(-0.9F, -10.9F, 3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -12.0F, -18.0F, 0.3869F, 0.0179F, 0.0237F));

		PartDefinition Eyes = head2.addOrReplaceChild("Eyes", CubeListBuilder.create(),
				PartPose.offset(-0.007F, -9.5F, 0.5F));

		PartDefinition EyeR = Eyes.addOrReplaceChild("EyeR",
				CubeListBuilder.create().texOffs(169, 55)
						.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(179, 47)
						.addBox(-3.0F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0383F, 0.0F, 0.0F));

		PartDefinition EyeL = Eyes.addOrReplaceChild("EyeL",
				CubeListBuilder.create().texOffs(169, 55)
						.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(179, 47)
						.addBox(-3.0F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0383F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition mouth = head2.addOrReplaceChild("mouth", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mouth_r1 = mouth.addOrReplaceChild("mouth_r1",
				CubeListBuilder.create().texOffs(243, 105)
						.addBox(-3.0F, 0.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(179, 209)
						.addBox(-2.8F, 0.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -8.6639F, -3.8771F, 0.3054F, 0.0F, 0.0F));

		PartDefinition mouth_r2 = mouth.addOrReplaceChild("mouth_r2",
				CubeListBuilder.create().texOffs(244, 178)
						.addBox(-3.0F, -2.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(243, 229)
						.addBox(-3.2F, -2.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, -7.9639F, -3.6818F, 0.3054F, 0.0F, 0.0F));

		PartDefinition mouth_r3 = mouth.addOrReplaceChild("mouth_r3",
				CubeListBuilder.create().texOffs(241, 232)
						.addBox(-3.0F, -2.5F, -0.5F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(241, 161)
						.addBox(-3.2F, -2.5F, -0.5F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 191)
						.addBox(-3.1F, -2.5F, -2.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, -7.8639F, -3.6325F, 0.3054F, 0.0F, 0.0F));

		PartDefinition mouth_r4 = mouth.addOrReplaceChild("mouth_r4",
				CubeListBuilder.create().texOffs(117, 203)
						.addBox(-0.6F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(117, 204)
						.addBox(-0.4F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(117, 202)
						.addBox(-5.6F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(193, 157)
						.addBox(-5.8F, 0.5F, -0.5F, 1.0F, -1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, -6.7192F, -3.2523F, 1.0036F, 0.0F, 0.0F));

		PartDefinition mouth_r5 = mouth.addOrReplaceChild("mouth_r5",
				CubeListBuilder.create().texOffs(175, 178)
						.addBox(-2.9F, 0.5F, -4.0F, 6.0F, -1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(174, 170)
						.addBox(-3.1F, 0.5F, -4.0F, 6.0F, -1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.4768F, 0.0062F, 0.2182F, 0.0F, 0.0F));

		PartDefinition mouth2 = mouth.addOrReplaceChild("mouth2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -6.4334F, -0.4705F));

		PartDefinition mouth_r6 = mouth2.addOrReplaceChild("mouth_r6",
				CubeListBuilder.create().texOffs(110, 233).addBox(-3.0F, 0.5F, -2.5F, 6.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4306F, -3.162F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leads = mouth.addOrReplaceChild("leads", CubeListBuilder.create(),
				PartPose.offset(0.0F, -5.9611F, -3.8141F));

		PartDefinition LeadL = leads.addOrReplaceChild("LeadL", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.3333F, 0.0F, 0.0F, 0.2153F, 0.047F, 0.0377F));

		PartDefinition mouth_r7 = LeadL.addOrReplaceChild("mouth_r7",
				CubeListBuilder.create().texOffs(108, 171).addBox(-3.1F, -0.1528F, 0.0578F, 1.0F, -1.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7F, 0.0668F, -0.0562F));

		PartDefinition LeadR = leads.addOrReplaceChild("LeadR", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F, 0.0F));

		PartDefinition mouth_r8 = LeadR.addOrReplaceChild("mouth_r8",
				CubeListBuilder.create().texOffs(143, 138).addBox(-3.1F, -0.1528F, 0.0578F, 1.0F, -1.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7057F, -0.1334F, 0.1129F));

		PartDefinition left_ear = head2.addOrReplaceChild("left_ear",
				CubeListBuilder.create().texOffs(142, 191).addBox(-1.0F, -3.25F, -0.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, -10.05F, 4.49F, 0.0F, 0.0F, 0.3054F));

		PartDefinition left_ear2 = head2.addOrReplaceChild("left_ear2",
				CubeListBuilder.create().texOffs(142, 196).addBox(-1.0F, -3.25F, -0.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, -10.05F, 4.49F, 0.0F, 0.0F, -0.3054F));

		PartDefinition neck = head2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(217, 52).addBox(-2.05F,
				-6.0F, -2.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mane = head2.addOrReplaceChild("mane", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1F, -3.0F, 5.5273F, 0.1309F, 0.0F, 0.0F));

		PartDefinition mane3 = head2.addOrReplaceChild("mane3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.2F, -3.0F, 5.5273F, 0.1309F, 0.0F, 0.0F));

		PartDefinition mane5 = head2.addOrReplaceChild("mane5", CubeListBuilder.create().texOffs(157, 201)
				.addBox(-2.2F, -8.9478F, -1.5034F, 3.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(196, 215)
				.addBox(-0.8F, -8.9478F, -3.5034F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(168, 209)
				.addBox(-0.7F, -8.9478F, -1.5034F, 3.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(194, 198)
				.addBox(-0.7F, -3.9478F, -2.9034F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(142, 201)
				.addBox(-2.2F, -3.9478F, -2.9034F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(100, 202)
				.addBox(-2.2F, -0.9478F, -3.5034F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(199, 150)
				.addBox(-0.7F, -0.9478F, -3.5034F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -3.1F, 5.7273F, 0.1309F, 0.0F, 0.0F));

		PartDefinition mane2 = head2.addOrReplaceChild("mane2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1F, -7.9572F, 4.8747F, 1.6581F, 0.0F, 0.0F));

		PartDefinition mane4 = head2.addOrReplaceChild("mane4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.2F, -7.9572F, 4.8747F, 1.6581F, 0.0F, 0.0F));

		PartDefinition mane6 = head2.addOrReplaceChild("mane6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1F, -8.0572F, 5.0747F, 1.6581F, 0.0F, 0.0F));

		PartDefinition body2 = horse.addOrReplaceChild("body2",
				CubeListBuilder.create().texOffs(8, 200)
						.addBox(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.05F)).texOffs(130, 250)
						.addBox(-1.0F, -4.0F, -17.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(243, 110)
						.addBox(0.1F, -4.0F, -17.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(243, 115)
						.addBox(-5.1F, -4.0F, -17.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offset(4.0F, -3.0F, -2.0F));

		PartDefinition body_r27 = body2.addOrReplaceChild("body_r27",
				CubeListBuilder.create().texOffs(92, 179)
						.addBox(-0.5F, -1.0F, -2.5F, -1.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(204, 184)
						.addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(186, 157)
						.addBox(-5.7F, -1.0F, -2.5F, 5.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.6F, -10.6466F, -7.3659F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r28 = body2.addOrReplaceChild("body_r28",
				CubeListBuilder.create().texOffs(47, 170)
						.addBox(-1.5F, -1.0F, -2.5F, 1.0F, 2.0F, -2.0F, new CubeDeformation(0.05F)).texOffs(242, 232)
						.addBox(-0.7266F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)).texOffs(194, 223)
						.addBox(-5.9599F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.8599F, -10.6466F, -4.6992F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r29 = body2.addOrReplaceChild("body_r29",
				CubeListBuilder.create().texOffs(185, 23)
						.addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)).texOffs(129, 200)
						.addBox(-5.7333F, -1.0F, -2.5F, 5.0F, 2.0F, -8.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.6333F, -10.6466F, -1.3659F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r30 = body2.addOrReplaceChild("body_r30",
				CubeListBuilder.create().texOffs(67, 165)
						.addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)).texOffs(213, 78)
						.addBox(4.7333F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-4.6F, -3.2466F, -1.3659F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r31 = body2.addOrReplaceChild("body_r31",
				CubeListBuilder.create().texOffs(183, 121)
						.addBox(-0.5F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)).texOffs(152, 171)
						.addBox(-5.7333F, -1.0F, -2.5F, 5.0F, 2.0F, -3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.6333F, -3.2466F, -4.6992F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r32 = body2.addOrReplaceChild("body_r32",
				CubeListBuilder.create().texOffs(111, 175).addBox(-2.5F, -2.0F, -2.5F, 9.0F, 7.0F, -8.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-1.9333F, -10.8466F, -4.6992F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_r33 = body2.addOrReplaceChild("body_r33",
				CubeListBuilder.create().texOffs(87, 211)
						.addBox(-0.5F, -1.0F, 7.5F, 1.0F, 2.0F, -10.0F, new CubeDeformation(0.05F)).texOffs(23, 177)
						.addBox(-9.7F, -1.0F, 7.5F, 1.0F, 2.0F, -10.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(4.6F, -3.937F, -13.6733F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail = horse.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(216, 147).addBox(-1.5F, -0.6667F, 0.0F, 3.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -10.3333F, 3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1",
				CubeListBuilder.create().texOffs(228, 252).addBox(-1.5F, 1.3706F, -1.7299F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.9983F, 1.5855F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail_r2 = tail.addOrReplaceChild("tail_r2",
				CubeListBuilder.create().texOffs(247, 208).addBox(-1.5F, -1.2875F, -1.3923F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.9983F, 1.5855F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail_r3 = tail.addOrReplaceChild("tail_r3",
				CubeListBuilder.create().texOffs(164, 250).addBox(-1.5F, -4.8833F, -1.678F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.9983F, 1.5855F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail_r4 = tail.addOrReplaceChild("tail_r4",
				CubeListBuilder.create().texOffs(139, 250).addBox(-1.5F, -4.8833F, -1.678F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.7483F, 4.273F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r5 = tail.addOrReplaceChild("tail_r5",
				CubeListBuilder.create().texOffs(247, 202).addBox(-1.5F, -1.2875F, -1.3923F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.7483F, 4.273F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail_r6 = tail.addOrReplaceChild("tail_r6",
				CubeListBuilder.create().texOffs(217, 252).addBox(-1.5F, 1.3706F, -1.7299F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.7483F, 4.273F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail_r7 = tail.addOrReplaceChild("tail_r7",
				CubeListBuilder.create().texOffs(247, 214).addBox(-1.5F, 1.3706F, -1.7299F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3147F, 4.7809F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail_r8 = tail.addOrReplaceChild("tail_r8",
				CubeListBuilder.create().texOffs(247, 196).addBox(-1.5F, -1.2875F, -1.3923F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3147F, 4.7809F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail_r9 = tail.addOrReplaceChild("tail_r9",
				CubeListBuilder.create().texOffs(245, 139).addBox(-1.5F, -4.8833F, -1.6781F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3147F, 4.7809F, 0.48F, 0.0F, 0.0F));

		PartDefinition front_left_leg = horse.addOrReplaceChild("front_left_leg", CubeListBuilder.create()
				.texOffs(117, 233).addBox(-3.0F, -1.0F, -1.9F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, -17.0F));

		PartDefinition front_left_leg2 = front_left_leg.addOrReplaceChild("front_left_leg2", CubeListBuilder.create()
				.texOffs(187, 235).addBox(-2.0F, -0.1F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 5.1F, 0.1F));

		PartDefinition front_right_leg = horse.addOrReplaceChild("front_right_leg", CubeListBuilder.create()
				.texOffs(151, 233).addBox(-1.0F, -1.0F, -1.9F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -17.0F));

		PartDefinition front_right_leg2 = front_right_leg.addOrReplaceChild("front_right_leg2", CubeListBuilder.create()
				.texOffs(230, 196).addBox(-2.0F, -0.2F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 5.2F, 0.1F));

		PartDefinition back_left_leg = horse.addOrReplaceChild("back_left_leg", CubeListBuilder.create()
				.texOffs(205, 233).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition back_left_leg2 = back_left_leg.addOrReplaceChild("back_left_leg2", CubeListBuilder.create()
				.texOffs(230, 206).addBox(-2.0F, -0.1F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 5.1F, 1.0F));

		PartDefinition whole = root.addOrReplaceChild("whole", CubeListBuilder.create(),
				PartPose.offset(4.0F, -20.6667F, -5.3333F));

		PartDefinition LeftLeg = whole
				.addOrReplaceChild("LeftLeg",
						CubeListBuilder.create().texOffs(203, 333).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9163F));

		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(159, 326)
				.addBox(-2.0117F, -0.1667F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(175, 271)
				.addBox(-2.0117F, 4.8333F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(197, 271)
				.addBox(-1.9766F, 3.8333F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0117F, 5.1667F, -0.6289F, 0.0F, 0.0F, 0.8727F));

		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(),
				PartPose.offset(-2.4F, 1.0F, 0.0F));

		PartDefinition Head = Waist.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(137, 282)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(159, 314)
						.addBox(-4.25F, -8.0F, -4.1F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(211, 308)
						.addBox(-4.25F, -8.0F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(211, 308)
						.addBox(-4.25F, -8.2969F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(211, 308)
						.addBox(-0.65F, -8.2969F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(178, 460)
						.addBox(-3.8167F, -7.7F, -4.1F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(177, 487)
						.addBox(-4.35F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(186, 458)
						.addBox(-0.75F, -8.2969F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(186, 458)
						.addBox(-4.35F, -8.2969F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(188, 466)
						.addBox(0.1719F, -8.0F, 3.1F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(186, 458)
						.addBox(-4.35F, -8.0F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(185, 460)
						.addBox(3.1833F, -8.0F, -4.1F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(167, 460)
						.addBox(-4.35F, -8.0F, -4.1F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(213, 316)
						.addBox(0.2719F, -8.0F, 3.1F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(169, 341)
						.addBox(3.2833F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 341)
						.addBox(-4.25F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(177, 314)
						.addBox(3.2833F, -8.0F, -4.1F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(170, 314)
						.addBox(-3.7167F, -8.3F, -4.1F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(170, 314)
						.addBox(-4.2362F, -8.3F, -4.1F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(137, 271)
						.addBox(-5.0F, -7.2F, -4.5F, 10.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(150, 279)
						.addBox(-1.0F, -7.7F, 3.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(157, 278).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1953F, -5.0333F, 5.0833F, -1.13F, -0.1964F, 0.3922F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(158, 277).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.25F, -5.0333F, 5.0833F, -1.1225F, 0.1776F, -0.3521F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(158, 425).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -6.7F, 4.25F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(166, 423).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.15F, -5.0333F, 5.0833F, -1.027F, -0.6015F, -0.7666F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(165, 424).addBox(-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2953F, -5.0333F, 5.0833F, -0.6407F, -1.0216F, -0.3685F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(189, 464).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4971F, -6.6438F, 3.35F, 0.1306F, -0.0076F, 0.0869F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(189, 464).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8362F, -6.3977F, 3.35F, 0.2154F, 0.0264F, -0.1727F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8",
				CubeListBuilder.create().texOffs(189, 464).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8362F, -5.4172F, 3.1964F, 0.2167F, -0.0111F, -0.0022F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9",
				CubeListBuilder.create().texOffs(189, 464).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0471F, -3.55F, 3.35F, 0.2154F, 0.0264F, -0.1727F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10",
				CubeListBuilder.create().texOffs(189, 464).addBox(0.0F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0471F, -2.5695F, 3.1964F, 0.2167F, -0.0111F, -0.0022F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(189, 464)
				.addBox(0.252F, -3.246F, -0.5287F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4996F, -4.6126F, 3.2694F, 0.2154F, 0.0264F, -0.1727F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.9374F, 0.35F, -1.4713F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4996F, -4.6126F, 3.2694F, 0.2167F, -0.0111F, -0.0022F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(0.252F, -3.246F, -0.5287F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1663F, -4.6126F, 3.2694F, 0.2154F, 0.0264F, -0.3472F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-0.9374F, 0.35F, -1.4713F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1663F, -4.6126F, 3.2694F, 0.2167F, -0.0111F, -0.1767F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(189, 464)
				.addBox(0.252F, -3.246F, -0.5287F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2165F, -4.6126F, 3.2694F, 0.2154F, 0.0264F, -0.2163F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.9374F, 0.35F, -1.4713F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2165F, -4.6126F, 3.2694F, 0.2167F, -0.0111F, -0.0458F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(0.252F, -3.246F, -0.5286F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5498F, -4.6126F, 3.242F, 0.1728F, 0.017F, -0.2172F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-0.9374F, 0.35F, -1.4713F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5498F, -4.6126F, 3.242F, 0.1731F, -0.0131F, -0.0453F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(189, 464)
				.addBox(0.252F, -3.246F, -0.5286F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6084F, -4.6126F, 3.242F, 0.1728F, 0.017F, -0.3481F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.9374F, 0.35F, -1.4713F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6084F, -4.6126F, 3.242F, 0.1731F, -0.0131F, -0.1762F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-0.9149F, -0.7068F, -1.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(0.252F, -3.246F, -0.5286F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4834F, -4.6126F, 3.242F, 0.1728F, 0.017F, -0.2172F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-0.9374F, 0.35F, -1.4713F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.2291F, -2.3532F, -0.8843F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4834F, -4.6126F, 3.242F, 0.1731F, -0.0131F, -0.0453F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(189, 464)
				.addBox(1.0737F, -2.3157F, -1.0131F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(3.0052F, -2.2338F, -1.0532F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(2.2969F, 0.4695F, -1.6402F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(0.3655F, 0.3876F, -1.6001F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -4.5423F, 0.1734F, 2.0257F, -1.5236F, -1.8529F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(189, 464)
				.addBox(1.5285F, -2.9828F, -0.6574F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(0.3616F, -0.4436F, -1.2445F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -4.5423F, 0.1734F, 1.6668F, -1.3529F, -1.4922F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(189, 464)
				.addBox(2.097F, -1.968F, -1.0876F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(1.3887F, 0.7352F, -1.6746F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -4.5423F, 0.1734F, 1.8175F, -1.3941F, -1.6456F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(189, 464)
				.addBox(2.4758F, -2.4627F, -0.7319F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(1.3089F, 0.0765F, -1.3189F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -4.5423F, 0.1734F, 1.6968F, -1.2223F, -1.5211F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27",
				CubeListBuilder.create().texOffs(189, 464).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.843F, -6.5261F, 3.4958F, -3.0812F, -1.55F, -3.0297F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28",
				CubeListBuilder.create().texOffs(189, 464).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.721F, -3.6705F, 3.3955F, -2.0035F, -1.5214F, 2.1754F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-4.0789F, -2.2931F, -0.8292F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-2.9725F, -2.3451F, -0.8304F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.5446F, 0.1734F, 0.0213F, 1.5594F, -0.1081F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-3.7149F, -3.8991F, -0.4684F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-2.4511F, -3.7144F, -0.4747F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.5446F, 0.1734F, -1.5054F, 1.3961F, -1.6358F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31",
				CubeListBuilder.create().texOffs(189, 464).addBox(-0.9649F, 0.3563F, -1.448F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.3259F, 1.7711F, 1.4759F, 1.3504F, 1.3494F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(189, 464)
				.addBox(0.227F, -3.2681F, -0.6022F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.94F, -0.729F, -1.1893F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -4.5423F, 0.1734F, 1.6668F, -1.3529F, -1.4485F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33",
				CubeListBuilder.create().texOffs(189, 464).addBox(-0.2576F, -2.3707F, -0.9579F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -4.5423F, 0.1734F, 2.0257F, -1.5236F, -1.8093F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34",
				CubeListBuilder.create().texOffs(189, 464).addBox(-1.0719F, -3.7385F, -0.5344F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -4.5423F, 0.1734F, 1.7135F, -1.2226F, -1.4935F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-2.4481F, -3.738F, -0.5717F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-3.7118F, -3.9227F, -0.5653F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -4.5423F, 0.1734F, 1.6362F, -1.3961F, -1.4185F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36",
				CubeListBuilder.create().texOffs(189, 464).addBox(-2.9736F, -2.3688F, -0.9273F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6949F, -4.5423F, 0.1734F, -3.1203F, -1.5594F, -2.9462F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37",
				CubeListBuilder.create().texOffs(189, 464).addBox(-2.2388F, -1.1994F, -1.1214F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -3.8548F, -0.6469F, 3.0089F, -1.5221F, -3.0156F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38",
				CubeListBuilder.create().texOffs(189, 464).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6515F, -5.348F, -3.507F, -1.8241F, -1.5255F, 2.0405F));

		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39",
				CubeListBuilder.create().texOffs(189, 461).addBox(-0.0723F, -3.3874F, -0.2453F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -4.5423F, 0.1734F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40",
				CubeListBuilder.create().texOffs(189, 464).addBox(-1.6184F, -2.6084F, -0.8901F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7949F, -4.3079F, -0.1273F, -3.0561F, -1.5221F, -3.0156F));

		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(189, 464)
				.addBox(-1.0753F, -3.7151F, -0.4374F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-2.2422F, -1.1759F, -1.0245F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.5446F, 0.1734F, -1.4281F, 1.2226F, -1.5609F));

		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(189, 464)
				.addBox(0.2238F, -3.2446F, -0.5053F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(-0.9431F, -0.7054F, -1.0923F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.5446F, 0.1734F, -1.4748F, 1.3529F, -1.6058F));

		PartDefinition Head_r43 = Head.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(189, 464)
				.addBox(1.5263F, -2.9634F, -0.5596F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(3.4142F, -2.5473F, -0.5996F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(0.3594F, -0.4242F, -1.1466F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.5446F, 0.1734F, -1.4748F, 1.3529F, -1.5621F));

		PartDefinition Head_r44 = Head.addOrReplaceChild("Head_r44",
				CubeListBuilder.create().texOffs(189, 464).addBox(2.4733F, -2.4434F, -0.634F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.5446F, 0.1734F, -1.4448F, 1.2223F, -1.5333F));

		PartDefinition Head_r45 = Head.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(189, 464)
				.addBox(3.0064F, -2.2143F, -0.9553F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 464)
				.addBox(1.0749F, -2.2962F, -0.9153F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.5446F, 0.1734F, -1.1158F, 1.5236F, -1.2014F));

		PartDefinition Head_r46 = Head.addOrReplaceChild("Head_r46",
				CubeListBuilder.create().texOffs(189, 464).addBox(2.0979F, -1.9485F, -0.9897F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.5446F, 0.1734F, -1.3241F, 1.3941F, -1.4088F));

		PartDefinition Head_r47 = Head.addOrReplaceChild("Head_r47",
				CubeListBuilder.create().texOffs(189, 464).addBox(-0.2566F, -2.3469F, -0.861F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.5446F, 0.1734F, -1.1158F, 1.5236F, -1.245F));

		PartDefinition Head_r48 = Head.addOrReplaceChild("Head_r48",
				CubeListBuilder.create().texOffs(189, 464).addBox(-1.6177F, -2.5847F, -0.7931F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.5446F, 0.1734F, -1.2918F, 1.3937F, -1.4202F));

		PartDefinition Head_r49 = Head.addOrReplaceChild("Head_r49",
				CubeListBuilder.create().texOffs(189, 464).addBox(-0.9649F, 0.3563F, -1.448F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.7165F, 0.8141F, 1.4759F, 1.3504F, 1.3494F));

		PartDefinition Head_r50 = Head.addOrReplaceChild("Head_r50",
				CubeListBuilder.create().texOffs(189, 464).addBox(-0.9649F, 0.3563F, -1.448F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.2986F, 0.1734F, -1.1158F, 1.5236F, -1.245F));

		PartDefinition Head_r51 = Head.addOrReplaceChild("Head_r51",
				CubeListBuilder.create().texOffs(189, 464).addBox(0.3666F, 0.4071F, -1.5023F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3244F, -4.8337F, 0.1734F, -1.1158F, 1.5236F, -1.2014F));

		PartDefinition Head_r52 = Head.addOrReplaceChild("Head_r52",
				CubeListBuilder.create().texOffs(189, 465).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8634F, -6.7426F, -3.9352F, -0.0883F, -0.004F, -0.0423F));

		PartDefinition Head_r53 = Head.addOrReplaceChild("Head_r53",
				CubeListBuilder.create().texOffs(189, 465).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8634F, -6.7426F, -3.9352F, -0.0881F, 0.0076F, 0.0881F));

		PartDefinition Head_r54 = Head.addOrReplaceChild("Head_r54",
				CubeListBuilder.create().texOffs(189, 465).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0587F, -6.7426F, -4.0406F, -0.0881F, -0.0078F, -0.0858F));

		PartDefinition Head_r55 = Head.addOrReplaceChild("Head_r55",
				CubeListBuilder.create().texOffs(189, 465).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.004F, -6.7426F, -3.9234F, -0.0884F, -0.0001F, 0.0012F));

		PartDefinition Head_r56 = Head.addOrReplaceChild("Head_r56",
				CubeListBuilder.create().texOffs(189, 465).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0001F, -6.7426F, -3.9234F, -0.0881F, 0.0076F, 0.0881F));

		PartDefinition Head_r57 = Head.addOrReplaceChild("Head_r57",
				CubeListBuilder.create().texOffs(189, 465).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6666F, -6.7426F, -3.9234F, -0.0871F, -0.0155F, -0.1727F));

		PartDefinition Head_r58 = Head.addOrReplaceChild("Head_r58",
				CubeListBuilder.create().texOffs(189, 465).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6666F, -6.7426F, -3.9234F, -0.0883F, -0.004F, -0.0423F));

		PartDefinition Head_r59 = Head.addOrReplaceChild("Head_r59",
				CubeListBuilder.create().texOffs(189, 465).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7486F, -6.7426F, -3.9234F, -0.0881F, 0.0076F, 0.0881F));

		PartDefinition Head_r60 = Head.addOrReplaceChild("Head_r60",
				CubeListBuilder.create().texOffs(189, 465).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7212F, -6.7426F, -3.9234F, -0.0883F, -0.004F, -0.0423F));

		PartDefinition Head_r61 = Head.addOrReplaceChild("Head_r61",
				CubeListBuilder.create().texOffs(195, 295).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0833F, -2.4F, -3.6469F, -0.1309F, 0.0F, 0.0F));

		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow", CubeListBuilder.create(),
				PartPose.offset(3.8333F, 24.6F, -0.0258F));

		PartDefinition Head_r62 = eyebrow.addOrReplaceChild("Head_r62",
				CubeListBuilder.create().texOffs(189, 310)
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(195, 293)
						.addBox(2.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, -29.45F, -3.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition EyeR2 = Head.addOrReplaceChild("EyeR2", CubeListBuilder.create().texOffs(189, 312).addBox(-1.15F,
				-0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.65F, -3.9F, -3.5316F));

		PartDefinition Head3 = EyeR2.addOrReplaceChild("Head3", CubeListBuilder.create().texOffs(197, 289).addBox(-0.5F,
				-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.15F, 0.0F, -0.0059F));

		PartDefinition eyeL2 = Head.addOrReplaceChild("eyeL2", CubeListBuilder.create().texOffs(153, 328)
				.addBox(-0.875F, -0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.7083F, -3.9F, -3.5316F));

		PartDefinition Head4 = eyeL2.addOrReplaceChild("Head4", CubeListBuilder.create().texOffs(153, 330).addBox(-0.5F,
				-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, 0.0F, -0.0059F));

		PartDefinition mouth3 = Head.addOrReplaceChild("mouth3", CubeListBuilder.create().texOffs(221, 432)
				.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0167F, -1.3833F, -3.5258F));

		PartDefinition smile_frown = mouth3.addOrReplaceChild("smile_frown", CubeListBuilder.create(),
				PartPose.offset(2.0F, 28.5F, 3.5F));

		PartDefinition frown_L = smile_frown.addOrReplaceChild("frown_L",
				CubeListBuilder.create().texOffs(221, 432).addBox(-0.0273F, -1.2016F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9727F, -27.7984F, -3.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition frown_R = smile_frown.addOrReplaceChild("frown_R",
				CubeListBuilder.create().texOffs(221, 432).addBox(-1.0017F, -1.193F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0401F, -27.8112F, -3.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(165, 298)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(137, 298)
						.addBox(-4.5F, 2.0F, -2.5F, 9.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(175, 280)
						.addBox(-4.5156F, 13.0F, -2.2F, 9.0F, -1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(195, 291)
						.addBox(-4.5156F, 13.0F, -0.7F, 9.0F, -1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(175, 326)
						.addBox(-0.5F, 2.0117F, -2.557F, 1.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(169, 291)
						.addBox(-4.6F, 9.0F, -2.4F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(207, 326)
						.addBox(2.7F, 9.0F, -2.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(203, 342)
						.addBox(2.7F, 9.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(137, 322)
						.addBox(-3.3F, 9.0F, -2.6F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(183, 343)
						.addBox(-4.6F, 9.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(205, 293)
						.addBox(-4.5F, -0.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(137, 338)
						.addBox(1.5F, -0.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(35, 266)
						.addBox(-1.1F, 9.1617F, -2.6599F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(35, 266)
						.addBox(-1.1F, 8.7617F, -2.657F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(35, 266)
						.addBox(-0.1F, 8.7617F, -2.657F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(35, 266)
						.addBox(-0.1F, 9.1617F, -2.6599F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(218, 370)
						.addBox(-4.15F, 8.5F, -3.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(218, 370)
						.addBox(-4.25F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(218, 370)
						.addBox(-3.05F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(218, 370)
						.addBox(-3.65F, 8.7F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Body_r34 = Body.addOrReplaceChild("Body_r34",
				CubeListBuilder.create().texOffs(218, 370).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 9.0273F, -3.1F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Body_r35 = Body.addOrReplaceChild("Body_r35",
				CubeListBuilder.create().texOffs(213, 285).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0117F, -0.157F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Body_r36 = Body.addOrReplaceChild("Body_r36",
				CubeListBuilder.create().texOffs(213, 279).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.3117F, -0.157F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Body_r37 = Body.addOrReplaceChild("Body_r37",
				CubeListBuilder.create().texOffs(149, 346).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.6117F, -0.157F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Body_r38 = Body.addOrReplaceChild("Body_r38",
				CubeListBuilder.create().texOffs(137, 346).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.9117F, -0.157F, 0.0F, 0.0F, 0.7854F));

		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(187, 333)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(137, 338)
						.addBox(-1.1667F, -2.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(139, 338)
						.addBox(1.8333F, -2.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -11.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition LeftArm2 = LeftArm
				.addOrReplaceChild("LeftArm2",
						CubeListBuilder.create().texOffs(195, 308).addBox(-2.0005F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 4.5F, 0.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition LeftArm3 = LeftArm2.addOrReplaceChild("LeftArm3",
				CubeListBuilder.create().texOffs(247, 379)
						.addBox(-1.0333F, -0.5F, 1.5F, 2.0F, 1.0F, -3.0F, new CubeDeformation(0.0F)).texOffs(246, 378)
						.addBox(-1.2333F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)).texOffs(246, 378)
						.addBox(0.2667F, -0.5F, 1.0F, 1.0F, 1.0F, -2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0333F, 4.5F, 0.1667F));

		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(187, 333)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(137, 338)
						.addBox(-0.5F, -2.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(139, 338)
						.addBox(2.5F, -2.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, -11.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition RightArm2 = RightArm
				.addOrReplaceChild("RightArm2",
						CubeListBuilder.create().texOffs(195, 308).addBox(-1.9995F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 4.5F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition RightLeg = whole
				.addOrReplaceChild("RightLeg",
						CubeListBuilder.create().texOffs(153, 337).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(189, 297)
						.addBox(-2.0117F, 0.0F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(137, 313)
						.addBox(-2.0117F, 5.0F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(195, 318)
						.addBox(-1.9766F, 4.0F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0117F, 5.0F, -0.6289F, 0.0F, 0.0F, -0.7854F));

		return LayerDefinition.create(meshdefinition, 260, 518);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main_cart.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}