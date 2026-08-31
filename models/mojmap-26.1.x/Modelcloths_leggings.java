// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcloths_leggings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cloths_leggings"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelcloths_leggings(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-2.0F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-2.0F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.8F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-1.8F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-2.2F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-2.2F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 19)
						.addBox(-2.0F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-2.0F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 35)
						.addBox(-1.8F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-1.8F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 32)
						.addBox(-2.2F, 0.0F, -1.8F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 16)
						.addBox(-2.2F, 0.0F, -2.2F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}