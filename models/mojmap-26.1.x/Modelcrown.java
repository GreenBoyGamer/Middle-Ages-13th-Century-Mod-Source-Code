// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcrown<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "crown"), "main");
	private final ModelPart Head;

	public Modelcrown(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-2.5F, -7.5F, -4.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.5F, -7.5F, 2.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(2.5F, -7.5F, -4.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -7.5F, -4.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(22, 20)
						.addBox(-4.0F, -8.5F, -4.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 24)
						.addBox(2.0F, -8.5F, -4.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 4)
						.addBox(-0.9167F, -9.5F, -4.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 24)
						.addBox(-4.0F, -8.5F, 3.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 7)
						.addBox(-0.9167F, -9.5F, 3.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(2.0F, -8.5F, 3.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(22, 16)
						.addBox(-4.0F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 13)
						.addBox(-0.9167F, -1.25F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 22)
						.addBox(2.0F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -8.25F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(22, 18)
						.addBox(2.0F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 10)
						.addBox(-0.9167F, -1.25F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 22)
						.addBox(-4.0F, -0.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -8.25F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}