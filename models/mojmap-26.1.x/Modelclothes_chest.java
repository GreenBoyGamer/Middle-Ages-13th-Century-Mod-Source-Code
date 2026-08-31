// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelclothes_chest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "clothes_chest"), "main");
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Body;

	public Modelclothes_chest(ModelPart root) {
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(30, 64)
						.addBox(-1.0F, -2.25F, -2.75F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 54)
						.addBox(-0.75F, -2.25F, -2.75F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 63)
						.addBox(-0.75F, -2.25F, -2.75F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(64, 36)
						.addBox(-3.0F, -2.25F, -2.75F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 45)
						.addBox(-3.25F, -2.25F, -2.75F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 64)
						.addBox(-2.75F, -2.25F, -2.75F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.25F, 0.0F, -2.75F, 3.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-2.25F, 3.0F, -2.5005F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 51)
						.addBox(-2.25F, 3.0F, -0.7505F, 4.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(1.25F, 0.0F, -2.75F, 3.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(0, 69).addBox(-1.5F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.55F, 10.3F, -1.6891F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(14, 71).addBox(-1.5F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.55F, 9.3F, -1.6891F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(14, 68).addBox(-1.5F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.55F, 5.3F, -1.6891F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(0, 66).addBox(-1.5F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.55F, 6.3F, -1.6891F, 0.0F, 0.0F, -0.7854F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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