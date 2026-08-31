// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsoldier_leggings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "soldier_leggings"), "main");
	private final ModelPart Left_leg;
	private final ModelPart right_leg;

	public Modelsoldier_leggings(ModelPart root) {
		this.Left_leg = root.getChild("Left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Left_leg = partdefinition.addOrReplaceChild("Left_leg",
				CubeListBuilder.create().texOffs(86, 48)
						.addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 59)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(89, 82)
						.addBox(-2.0F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 92)
						.addBox(-1.8F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 93)
						.addBox(-1.8F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 93)
						.addBox(-2.2F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 93)
						.addBox(-2.4F, 0.0F, -1.9648F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 93)
						.addBox(-2.0F, 0.0F, -1.9648F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 92)
						.addBox(-2.0F, 0.0F, -2.1648F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(89, 82)
						.addBox(-2.2F, 0.0F, -2.1648F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 59)
						.addBox(-2.2F, 0.0F, -1.9648F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 48)
						.addBox(-2.2F, 6.0F, -1.9648F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition leg_r1 = Left_leg.addOrReplaceChild("leg_r1",
				CubeListBuilder.create().texOffs(58, 111).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2297F, 7.0F, -1.6859F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leg_r2 = Left_leg.addOrReplaceChild("leg_r2",
				CubeListBuilder.create().texOffs(28, 114).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2297F, 5.9F, -1.8344F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leg_r3 = Left_leg.addOrReplaceChild("leg_r3",
				CubeListBuilder.create().texOffs(58, 111).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0297F, 7.0F, -1.7211F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leg_r4 = Left_leg.addOrReplaceChild("leg_r4",
				CubeListBuilder.create().texOffs(28, 114).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0297F, 5.9F, -1.8695F, 0.2182F, 0.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(72, 82)
						.addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 0)
						.addBox(-2.0F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 11)
						.addBox(-1.8F, 0.0F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 84)
						.addBox(-1.8F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 37)
						.addBox(-2.2F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 82)
						.addBox(-1.8F, 6.0F, -1.9023F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 37)
						.addBox(-2.0F, 0.0F, -1.9023F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 84)
						.addBox(-1.6F, 0.0F, -1.9023F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 11)
						.addBox(-1.6F, 0.0F, -2.1023F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 0)
						.addBox(-1.8F, 0.0F, -2.1023F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(-1.8F, 0.0F, -1.9023F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition right_leg_r1 = right_leg.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(75, 37).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1703F, 5.9F, -1.7719F, 0.2182F, 0.0F, 0.0F));

		PartDefinition right_leg_r2 = right_leg.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(50, 43).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1703F, 7.0F, -1.6234F, 0.2182F, 0.0F, 0.0F));

		PartDefinition right_leg_r3 = right_leg.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(50, 43).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0297F, 7.0F, -1.7211F, 0.2182F, 0.0F, 0.0F));

		PartDefinition right_leg_r4 = right_leg.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(75, 37).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0297F, 5.9F, -1.8695F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}