// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsoldier_chest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "soldier_chest"), "main");
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Body;

	public Modelsoldier_chest(ModelPart root) {
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(20, 16)
						.addBox(-1.1F, -2.0F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
						.addBox(-1.5F, 3.0F, -2.4688F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-1.35F, -2.5F, -2.8F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-1.35F, -2.5F, -0.25F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.75F, 2.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(18, 34)
						.addBox(-2.5F, -1.5F, -2.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
						.addBox(-2.5F, -1.5F, -4.35F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9326F, 1.6892F, 1.65F, 0.0F, 0.0F, 0.0873F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-3.9F, -2.0F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(3, 16)
						.addBox(0.6F, 2.0F, -2.4648F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 34)
						.addBox(-4.65F, -2.55F, -2.8F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-4.65F, -2.55F, -0.1333F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.75F, 2.0F, 0.0F));

		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1",
				CubeListBuilder.create().texOffs(18, 40)
						.addBox(-3.0F, -1.5F, -0.1667F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 12)
						.addBox(-3.0F, -1.5F, -2.6333F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4307F, 1.6828F, -0.0667F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 18)
						.addBox(0.25F, 8.5F, -1.75F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-4.4167F, 8.5F, -1.75F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-0.4167F, 8.5F, -1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 28)
						.addBox(0.25F, 8.5F, -2.25F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 40)
						.addBox(-4.4167F, 8.5F, -2.25F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 5)
						.addBox(-0.4167F, 8.5F, -2.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}