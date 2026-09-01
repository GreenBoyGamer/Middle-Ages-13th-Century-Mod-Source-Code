// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbread_seller<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bread_seller"), "main");
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
	private final ModelPart RightArm;
	private final ModelPart RightArm2;
	private final ModelPart RightLeg;
	private final ModelPart RightLeg2;

	public Modelbread_seller(ModelPart root) {
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
						CubeListBuilder.create().texOffs(72, 82).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(55, 71)
				.addBox(-2.0117F, -0.1667F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
				.addBox(-2.0117F, 4.8333F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(77, 0)
				.addBox(-1.9766F, 3.8333F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(95, 55)
				.addBox(-2.0766F, 3.8333F, -2.2578F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 83)
				.addBox(-2.1117F, 4.8333F, -4.3711F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));

		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(),
				PartPose.offset(-2.4F, 1.0F, 0.0F));

		PartDefinition Head = Waist.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(-4.5F, -3.0F, -1.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 48)
						.addBox(-4.25F, -7.0F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(89, 86)
						.addBox(-4.25F, -8.2773F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(81, 95)
						.addBox(0.2719F, -8.2773F, 3.1F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 70)
						.addBox(-4.25F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(89, 78)
						.addBox(3.2833F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(3.2833F, -7.0F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(3.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 58)
						.addBox(2.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 60)
						.addBox(1.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(57, 60)
						.addBox(0.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(62, 28)
						.addBox(-4.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(3.6518F, -5.3128F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(3.456F, -6.8F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(3.6518F, -3.4128F, 3.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(3.6518F, -5.3128F, 3.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(3.456F, -6.8F, 3.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(3.2602F, -8.2872F, 3.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(3.2602F, -8.2872F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 11)
						.addBox(-3.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(65, 48)
						.addBox(-2.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(-1.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 69)
						.addBox(-0.544F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(37, 17).addBox(-2.5F, -2.0F, -3.5F, 6.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.494F, -11.813F, 1.2148F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(29, 29).addBox(-3.5F, -2.0F, -3.5F, 8.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.494F, -9.813F, 0.1148F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(0, 17).addBox(-4.5F, -1.0F, -4.5F, 9.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.006F, -8.6333F, 0.15F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-8.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.756F, -4.55F, -3.8F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-8.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.756F, -6.05F, -3.8F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.344F, -7.5F, -3.8F, -0.1289F, -0.0227F, -0.1731F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.344F, -7.2F, -3.8F, -0.1304F, 0.0114F, 0.0865F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.844F, -7.2F, -3.8F, -0.1304F, 0.0114F, 0.0865F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.844F, -7.5F, -3.8F, -0.1289F, -0.0227F, -0.1731F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.044F, -7.5F, -3.8F, -0.1289F, -0.0227F, -0.1731F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.956F, -7.2F, -3.8F, -0.1304F, 0.0114F, 0.0865F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.756F, -7.5F, -3.8F, -0.1289F, -0.0227F, -0.1731F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.756F, -7.2F, -3.8F, -0.1304F, 0.0114F, 0.0865F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-8.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.756F, -7.3F, -3.8F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(58, 11)
				.addBox(-0.222F, -0.4528F, 2.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.3876F, 1.4399F, 2.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.4178F, -1.94F, 2.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.6136F, -3.4272F, 2.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.222F, -0.4528F, -1.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.4178F, -1.94F, -1.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.6136F, -3.4272F, -1.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.3866F, -3.443F, -4.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.5174F, -1.9487F, -4.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.6481F, -0.4544F, -4.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.156F, -4.8564F, 3.975F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(58, 11)
				.addBox(-0.3216F, -0.617F, 1.2354F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.4872F, 1.2686F, 1.4003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.5174F, -2.1042F, 1.2354F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.5174F, -1.7991F, -2.2513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.3216F, -0.3119F, -2.2513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.4378F, 1.033F, -2.3846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.156F, -4.8564F, 3.975F, 1.4835F, -1.4835F, -1.5708F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(58, 11)
				.addBox(-0.3216F, -0.3773F, 0.5042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.4872F, 1.5083F, 0.3392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.5174F, -1.8645F, 0.5042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.5174F, -2.1695F, -2.9825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
				.addBox(-0.3216F, -0.6823F, -2.9825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.156F, -4.8564F, 3.975F, 1.6581F, -1.4835F, -1.5708F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.7F, -1.9436F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5042F, 1.5436F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5042F, -0.4564F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(58, 11).addBox(-0.5042F, 1.4436F, 3.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(58, 11).addBox(-0.5042F, -0.4564F, 3.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(58, 11).addBox(-0.7F, -1.9436F, 3.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.156F, -4.8564F, 3.975F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5042F, -0.4564F, -0.425F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.156F, -2.8564F, 3.975F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5042F, -0.4564F, -0.425F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4893F, -2.8564F, 3.975F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5042F, -0.4564F, -0.425F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4893F, -2.8564F, 3.975F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.056F, -4.4667F, -1.95F, -0.0873F, 0.0F, -0.0873F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.056F, -4.3F, -3.6F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.056F, -5.8F, -3.6F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.056F, -7.3F, -3.6F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.056F, -5.8F, -2.6F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.056F, -5.8F, -1.7F, -0.0873F, 0.0F, -0.0873F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.156F, -5.8F, -0.95F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.056F, -5.8F, 0.9F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.056F, -5.8F, 1.8F, -0.0873F, 0.0F, -0.0873F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.156F, -3.9F, 2.55F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.056F, -3.9F, 1.8F, -0.0873F, 0.0F, -0.0873F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.056F, -3.9F, 0.9F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.944F, -3.9F, 0.9F, 0.0873F, 0.0F, 0.1309F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.944F, -3.9F, 1.8F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.844F, -3.9F, 2.55F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.044F, -3.9F, 3.55F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.044F, -5.8F, 3.55F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.944F, -5.8F, 0.9F, 0.0873F, 0.0F, 0.1309F));

		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.944F, -5.8F, 1.8F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.844F, -5.8F, 2.55F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.944F, -5.8F, -1.7F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition Head_r43 = Head.addOrReplaceChild("Head_r43",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.944F, -4.4667F, -1.95F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition Head_r44 = Head.addOrReplaceChild("Head_r44",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(-0.3042F, 0.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-0.6958F, -2.4872F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.944F, -5.8F, -2.6F, 0.0873F, 0.0F, 0.1309F));

		PartDefinition Head_r45 = Head.addOrReplaceChild("Head_r45",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.944F, -4.3F, -3.6F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r46 = Head.addOrReplaceChild("Head_r46",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.944F, -5.8F, -3.6F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r47 = Head.addOrReplaceChild("Head_r47",
				CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.944F, -7.3F, -3.6F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Head_r48 = Head.addOrReplaceChild("Head_r48",
				CubeListBuilder.create().texOffs(23, 45).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0833F, -2.4F, -3.6469F, -0.1309F, 0.0F, 0.0F));

		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow", CubeListBuilder.create(),
				PartPose.offset(3.8333F, 24.6F, -0.0258F));

		PartDefinition Head_r49 = eyebrow.addOrReplaceChild("Head_r49",
				CubeListBuilder.create().texOffs(89, 22)
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 55)
						.addBox(2.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, -29.45F, -3.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition EyeR = Head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(64, 25).addBox(-1.15F,
				-0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.65F, -3.9F, -3.5316F));

		PartDefinition Head2 = EyeR.addOrReplaceChild("Head2", CubeListBuilder.create().texOffs(81, 92).addBox(-0.5F,
				-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.15F, 0.0F, -0.0059F));

		PartDefinition eyeL = Head.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(71, 25).addBox(-0.875F,
				-0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.7083F, -3.9F, -3.5316F));

		PartDefinition Head3 = eyeL.addOrReplaceChild("Head3", CubeListBuilder.create().texOffs(90, 19).addBox(-0.5F,
				-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, 0.0F, -0.0059F));

		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(118, 69).addBox(-1.0F,
				-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0833F, -1.3833F, -3.5258F));

		PartDefinition smile_frown = mouth.addOrReplaceChild("smile_frown", CubeListBuilder.create(),
				PartPose.offset(2.0F, 28.5F, 3.5F));

		PartDefinition frown_L = smile_frown.addOrReplaceChild("frown_L",
				CubeListBuilder.create().texOffs(93, 117).addBox(-0.0273F, -1.2016F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9727F, -27.7984F, -3.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition frown_R = smile_frown.addOrReplaceChild("frown_R",
				CubeListBuilder.create().texOffs(93, 117).addBox(-1.0017F, -1.193F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0401F, -27.8112F, -3.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(33, 0)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-4.5F, 2.0F, -2.5F, 9.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(76, 68)
						.addBox(-4.5156F, 13.0F, -2.2F, 9.0F, -1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 22)
						.addBox(-4.5156F, 13.0F, -0.7F, 9.0F, -1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 41)
						.addBox(-4.6F, 7.0F, -2.4F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(15, 91)
						.addBox(2.7F, 7.0F, -2.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(51, 92)
						.addBox(2.7F, 7.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 41)
						.addBox(-3.3F, 7.0F, -2.6F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 92)
						.addBox(-4.6F, 7.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(51, 83)
						.addBox(-4.5F, -0.5F, -2.5005F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 46)
						.addBox(1.5F, -0.5F, -2.5005F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(0, 89).addBox(-3.0F, -3.0F, -0.5F, 6.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3F, 11.0F, -2.2172F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(96, 0).addBox(-0.5F, -0.5F, -2.5005F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.668F, 1.9128F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(92, 95).addBox(-0.5F, -0.5F, -2.5005F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6641F, 1.9128F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 78)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.5F, -11.0F, 0.0F));

		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(72, 71).addBox(
				-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));

		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(81, 25).addBox(
				-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, -11.0F, 0.0F));

		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(17, 80)
				.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 4.5F, 0.0F));

		PartDefinition RightLeg = whole
				.addOrReplaceChild("RightLeg",
						CubeListBuilder.create().texOffs(81, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(38, 71)
						.addBox(-2.0117F, 0.0F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 48)
						.addBox(-2.0117F, 5.0F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(76, 59)
						.addBox(-1.9766F, 4.0F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(30, 93)
						.addBox(-2.0766F, 4.0F, -2.2578F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(83, 9)
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