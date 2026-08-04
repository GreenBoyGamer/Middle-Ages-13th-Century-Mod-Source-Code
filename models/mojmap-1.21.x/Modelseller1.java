// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelseller1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "seller1"), "main");
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
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart LeftArm2;
	private final ModelPart RightArm;
	private final ModelPart RightArm2;
	private final ModelPart RightLeg;
	private final ModelPart RightLeg2;

	public Modelseller1(ModelPart root) {
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
						CubeListBuilder.create().texOffs(80, 54).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(19, 74)
				.addBox(-2.0117F, -0.1667F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 41)
				.addBox(-2.0117F, 4.8333F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(75, 35)
				.addBox(-1.9766F, 3.8333F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0117F, 5.1667F, -0.6289F));

		PartDefinition Waist = whole.addOrReplaceChild("Waist", CubeListBuilder.create(),
				PartPose.offset(-2.4F, 1.0F, 0.0F));

		PartDefinition Head = Waist.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(23, 51)
						.addBox(-4.25F, -7.0F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(85, 90)
						.addBox(-4.25F, -8.2773F, 3.1F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(91, 79)
						.addBox(0.2719F, -8.2773F, 3.1F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 85)
						.addBox(-4.25F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(17, 86)
						.addBox(3.2833F, -4.0F, -2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 51)
						.addBox(3.2833F, -7.0F, -4.1F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(3.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(2.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(61, 48)
						.addBox(1.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 11)
						.addBox(0.2833F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 66)
						.addBox(-4.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(61, 59)
						.addBox(-3.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(62, 24)
						.addBox(-2.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 63)
						.addBox(-1.244F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 63)
						.addBox(-0.544F, -8.3F, -4.1F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(29, 29).addBox(-3.5F, -2.0F, -3.5F, 8.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.494F, -9.813F, 0.1148F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(0, 17).addBox(-4.5F, -1.0F, -4.5F, 9.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.006F, -8.6333F, 0.15F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(23, 45).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0833F, -2.4F, -3.6469F, -0.1309F, 0.0F, 0.0F));

		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow", CubeListBuilder.create(),
				PartPose.offset(3.8333F, 24.6F, -0.0258F));

		PartDefinition Head_r4 = eyebrow.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(62, 35)
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 67)
						.addBox(2.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6F, -29.45F, -3.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition EyeR = Head.addOrReplaceChild("EyeR", CubeListBuilder.create().texOffs(62, 38).addBox(-1.15F,
				-0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.65F, -3.9F, -3.5316F));

		PartDefinition Head2 = EyeR.addOrReplaceChild("Head2", CubeListBuilder.create().texOffs(58, 11).addBox(-0.5F,
				-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.15F, 0.0F, -0.0059F));

		PartDefinition eyeL = Head.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(80, 64).addBox(-0.875F,
				-0.5F, -0.4941F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.7083F, -3.9F, -3.5316F));

		PartDefinition Head3 = eyeL.addOrReplaceChild("Head3", CubeListBuilder.create().texOffs(23, 48).addBox(-0.5F,
				-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, 0.0F, -0.0059F));

		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(52, 48).addBox(-1.0F,
				-0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0833F, -1.3833F, -3.5258F));

		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(33, 0)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-4.5F, 2.0F, -2.5F, 9.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 27)
						.addBox(-4.5156F, 13.0F, -2.2F, 9.0F, -1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 24)
						.addBox(-4.5156F, 13.0F, -0.7F, 9.0F, -1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(37, 17)
						.addBox(-4.6F, 7.0F, -2.4F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 88)
						.addBox(2.7F, 7.0F, -2.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 90)
						.addBox(2.7F, 7.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 41)
						.addBox(-3.3F, 7.0F, -2.6F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(51, 91)
						.addBox(-4.6F, 7.0F, -2.6F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 82)
						.addBox(-4.5F, -0.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(81, 22)
						.addBox(1.5F, -0.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -13.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(83, 11).addBox(-3.0F, -3.0F, -0.5F, 6.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3F, 11.0F, -2.2172F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(93, 64).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.668F, 1.9128F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(32, 93).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6641F, 1.9128F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 77)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.5F, -11.0F, 0.0F));

		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(36, 74).addBox(
				-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.5F, 0.0F));

		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(74, 79).addBox(
				-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, -11.0F, 0.0F));

		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(77, 0)
				.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 4.5F, 0.0F));

		PartDefinition RightLeg = whole
				.addOrReplaceChild("RightLeg",
						CubeListBuilder.create().texOffs(80, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(57, 70)
						.addBox(-2.0117F, 0.0F, -1.3711F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-2.0117F, 5.0F, -4.3711F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(74, 70)
						.addBox(-1.9766F, 4.0F, -2.2578F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
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