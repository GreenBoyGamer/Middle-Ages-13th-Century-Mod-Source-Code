// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelWater_mill_main<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "water_mill_main"), "main");
	private final ModelPart hexadecagon;
	private final ModelPart bone;

	public ModelWater_mill_main(ModelPart root) {
		this.hexadecagon = root.getChild("hexadecagon");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hexadecagon = partdefinition.addOrReplaceChild("hexadecagon", CubeListBuilder.create(),
				PartPose.offset(0.0008F, 16.3659F, -9.3482F));

		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create()
				.texOffs(0, 1).addBox(12.3F, -18.0F, -1.1826F, 3.4F, 3.1667F, 1.6985F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.5F, -16.0F, -3.1826F, 3.0F, 2.5F, 6.3652F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.3F, 14.8333F, -0.9326F, 3.4F, 3.1667F, 1.8652F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.5F, 13.5F, -3.1826F, 3.0F, 2.5F, 6.3652F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.5F, -3.1826F, 13.5F, 3.0F, 6.3652F, 2.5F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.3F, -0.9326F, -18.6667F, 3.4F, 1.8652F, 3.8333F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.5F, -3.1826F, -16.0F, 3.0F, 6.3652F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.3659F, 14.6815F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(0, 1).addBox(12.3F, -18.0F, -1.1826F, 3.4F, 3.1667F, 1.6985F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2992F, -0.3659F, 14.6815F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create()
				.texOffs(0, 1).addBox(12.3F, -18.0F, -1.1826F, 3.4F, 3.1667F, 1.6985F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.5F, -16.0F, -3.1826F, 3.0F, 2.5F, 6.3652F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.3F, 14.8333F, -0.9326F, 3.4F, 3.1667F, 1.8652F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.5F, 13.5F, -3.1826F, 3.0F, 2.5F, 6.3652F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.5F, -3.1826F, 13.5F, 3.0F, 6.3652F, 2.5F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.3F, -0.9326F, -18.6667F, 3.4F, 1.8652F, 3.8333F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.5F, -3.1826F, -16.0F, 3.0F, 6.3652F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.3659F, 14.6815F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(-17, 7).addBox(-18.0833F, -2.25F, -2.1826F, 20.0F, 4.5F, 4.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0659F, -0.4159F, 1.4315F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r5 = hexadecagon.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.1667F, -7.5373F, -6.7203F, 1.0F, 1.1667F, 12.6485F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0303F, -0.9563F, 0.7649F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r6 = hexadecagon.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.1667F, -7.579F, -5.9366F, 1.0F, 1.1667F, 12.5819F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0303F, -0.9563F, 0.7649F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r7 = hexadecagon.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -4.2375F, -10.0201F, 1.0F, 1.1667F, 12.6485F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0303F, -5.6229F, 0.7649F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r8 = hexadecagon.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0539F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r9 = hexadecagon.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0149F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r10 = hexadecagon.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0539F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r11 = hexadecagon.addOrReplaceChild("hexadecagon_r11",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0149F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r12 = hexadecagon.addOrReplaceChild("hexadecagon_r12",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0539F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r13 = hexadecagon.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0149F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r14 = hexadecagon.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.8333F, -4.2792F, -2.6368F, 1.0F, 1.1667F, 12.5819F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0303F, -5.6229F, 0.7649F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r15 = hexadecagon.addOrReplaceChild("hexadecagon_r15",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0539F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r16 = hexadecagon.addOrReplaceChild("hexadecagon_r16",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.8333F, -15.9167F, -1.1826F, 1.6667F, 15.8333F, 2.3652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.4493F, 1.0149F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r17 = hexadecagon.addOrReplaceChild("hexadecagon_r17", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, 10.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, 10.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.3325F, 2.2174F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r18 = hexadecagon.addOrReplaceChild("hexadecagon_r18", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, 4.6667F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, 5.1667F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.9992F, 4.8841F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r19 = hexadecagon.addOrReplaceChild("hexadecagon_r19", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.6659F, 9.5507F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r20 = hexadecagon.addOrReplaceChild("hexadecagon_r20", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4159F, 14.2174F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r21 = hexadecagon.addOrReplaceChild("hexadecagon_r21", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.9992F, 20.2174F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r22 = hexadecagon.addOrReplaceChild("hexadecagon_r22", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -44.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -43.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, 28.8841F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r23 = hexadecagon.addOrReplaceChild("hexadecagon_r23", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0008F, 28.2174F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r24 = hexadecagon.addOrReplaceChild("hexadecagon_r24", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.6675F, 25.5507F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r25 = hexadecagon.addOrReplaceChild("hexadecagon_r25", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0008F, 20.2174F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r26 = hexadecagon.addOrReplaceChild("hexadecagon_r26", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.3341F, 13.5507F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r27 = hexadecagon.addOrReplaceChild("hexadecagon_r27", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.6675F, 8.8841F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r28 = hexadecagon.addOrReplaceChild("hexadecagon_r28", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.3341F, 4.4674F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r29 = hexadecagon.addOrReplaceChild("hexadecagon_r29", CubeListBuilder.create()
				.texOffs(0, 1).addBox(14.0F, -16.0F, -0.5159F, 1.0F, 3.1667F, 1.0319F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(14.0F, -15.5F, -1.1826F, 1.75F, 2.6667F, 2.3652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3341F, 2.2174F, 13.5982F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r30 = hexadecagon.addOrReplaceChild("hexadecagon_r30",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(12.5F, -16.0F, -3.1826F, 3.0F, 2.5F, 6.3652F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(12.5F, 13.5F, -3.1826F, 3.0F, 2.5F, 6.3652F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(12.5F, -3.1826F, 13.5F, 3.0F, 6.3652F, 2.5F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(12.5F, -3.1826F, -16.0F, 3.0F, 6.3652F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.3659F, 14.6073F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r31 = hexadecagon.addOrReplaceChild("hexadecagon_r31", CubeListBuilder.create()
				.texOffs(0, 1).addBox(12.3F, 14.8333F, -0.9326F, 3.4F, 3.1667F, 1.8652F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(12.3F, -0.9326F, -18.6667F, 3.4F, 1.8652F, 3.8333F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.3659F, 14.6815F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r32 = hexadecagon.addOrReplaceChild("hexadecagon_r32",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.7F, 4.687F, 1.6231F, 3.4F, 1.6985F, 3.8667F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.1641F, -0.1302F, 0.6815F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r33 = hexadecagon.addOrReplaceChild("hexadecagon_r33",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.7F, -0.7516F, 0.6351F, 3.4F, 1.6985F, 3.8667F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.1641F, -0.1302F, 0.6815F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r34 = hexadecagon.addOrReplaceChild("hexadecagon_r34",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.7F, -6.1544F, 1.8035F, 3.4F, 1.6985F, 3.8667F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.1641F, -0.1302F, 0.6815F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r35 = hexadecagon.addOrReplaceChild("hexadecagon_r35",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.7F, -10.6987F, 4.9505F, 3.4F, 1.6985F, 3.8667F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.1641F, -0.1302F, 0.6815F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r36 = hexadecagon.addOrReplaceChild("hexadecagon_r36",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.7F, 9.3335F, 4.6172F, 3.4F, 1.6985F, 3.8667F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.1641F, -0.1302F, 0.6815F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r37 = hexadecagon.addOrReplaceChild("hexadecagon_r37",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(12.5F, -3.1826F, 13.5F, 3.0F, 6.3652F, 2.5F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(12.5F, -3.1826F, -16.0F, 3.0F, 6.3652F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.3659F, 14.6073F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r38 = hexadecagon.addOrReplaceChild("hexadecagon_r38",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(12.5F, -3.1826F, 13.5F, 3.0F, 6.3652F, 2.5F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(12.5F, -3.1826F, -16.0F, 3.0F, 6.3652F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.3659F, 14.6073F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r39 = hexadecagon.addOrReplaceChild("hexadecagon_r39",
				CubeListBuilder.create().texOffs(0, 1).addBox(12.3F, -0.9326F, -18.6667F, 3.4F, 1.8652F, 3.8333F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.3659F, 14.6815F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r40 = hexadecagon.addOrReplaceChild("hexadecagon_r40",
				CubeListBuilder.create().texOffs(0, 1).addBox(12.3F, -0.9326F, -18.6667F, 3.4F, 1.8652F, 3.8333F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0008F, -0.3659F, 14.6815F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition bone = partdefinition
				.addOrReplaceChild("bone",
						CubeListBuilder.create().texOffs(0, 0).mirror()
								.addBox(-12.0F, -16.0F, 0.0F, 8.0F, 16.0F, 6.0F, new CubeDeformation(0.0F))
								.mirror(false).texOffs(0, 0).mirror()
								.addBox(-12.0F, -16.0F, 10.0F, 8.0F, 16.0F, 6.0F, new CubeDeformation(0.0F))
								.mirror(false).texOffs(-1, -1).mirror().addBox(-11.3333F, -14.6667F, 6.0F, 6.6667F,
										12.6667F, 4.6667F, new CubeDeformation(0.0F))
								.mirror(false),
						PartPose.offset(8.0F, 24.0F, -8.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		hexadecagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}