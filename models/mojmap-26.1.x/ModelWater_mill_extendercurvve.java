// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelWater_mill_extendercurvve<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "water_mill_extendercurvve"), "main");
	private final ModelPart hexadecagon;

	public ModelWater_mill_extendercurvve(ModelPart root) {
		this.hexadecagon = root.getChild("hexadecagon");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hexadecagon = partdefinition.addOrReplaceChild("hexadecagon", CubeListBuilder.create(),
				PartPose.offset(0.0008F, 16.3659F, -9.3482F));

		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -2.25F, -2.1826F, 10.0F, 4.5F, 4.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3992F, -0.4159F, 16.0982F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-18.0833F, -2.25F, -2.1826F, 10.0F, 4.5F, 4.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0659F, -0.4159F, -1.9018F, 0.0F, 1.5708F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		hexadecagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}