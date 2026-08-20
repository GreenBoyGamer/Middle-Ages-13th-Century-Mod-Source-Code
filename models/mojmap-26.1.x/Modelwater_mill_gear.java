// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwater_mill_gear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "water_mill_gear"), "main");
	private final ModelPart wheel4;
	private final ModelPart wheel;
	private final ModelPart wheel2;
	private final ModelPart wheel3;
	private final ModelPart bone;

	public Modelwater_mill_gear(ModelPart root) {
		this.wheel4 = root.getChild("wheel4");
		this.wheel = this.wheel4.getChild("wheel");
		this.wheel2 = this.wheel4.getChild("wheel2");
		this.wheel3 = this.wheel4.getChild("wheel3");
		this.bone = this.wheel4.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wheel4 = partdefinition.addOrReplaceChild("wheel4", CubeListBuilder.create(),
				PartPose.offset(-0.093F, 14.9218F, -6.724F));

		PartDefinition wheel = wheel4.addOrReplaceChild("wheel", CubeListBuilder.create(),
				PartPose.offset(-7.6293F, -0.2978F, -1.7051F));

		PartDefinition hexadecagon_r1 = wheel.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(0, 1).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2871F, 0.2723F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r2 = wheel.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(0, 1).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0979F, 0.5223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r3 = wheel.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(0, 1).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2129F, 0.2723F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r4 = wheel.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r5 = wheel.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(-8, 7).addBox(0.8625F, -0.9875F, -0.9822F, -1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0071F, -0.0002F, 0.2555F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r6 = wheel.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(0, 1).addBox(0.375F, -3.8668F, -3.0241F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r7 = wheel.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(0, 1).addBox(0.375F, -3.8855F, -2.6715F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r8 = wheel.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(0, 1).addBox(0.075F, -2.3819F, -4.509F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r9 = wheel.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r10 = wheel.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.068F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r11 = wheel.addOrReplaceChild("hexadecagon_r11",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r12 = wheel.addOrReplaceChild("hexadecagon_r12",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.068F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r13 = wheel.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r14 = wheel.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.068F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r15 = wheel.addOrReplaceChild("hexadecagon_r15",
				CubeListBuilder.create().texOffs(0, 2).addBox(0.075F, -2.4006F, -1.1865F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r16 = wheel.addOrReplaceChild("hexadecagon_r16",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r17 = wheel.addOrReplaceChild("hexadecagon_r17",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.068F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r18 = wheel.addOrReplaceChild("hexadecagon_r18",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r19 = wheel.addOrReplaceChild("hexadecagon_r19",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r20 = wheel.addOrReplaceChild("hexadecagon_r20",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r21 = wheel.addOrReplaceChild("hexadecagon_r21",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.235F, 1.8735F, 0.7304F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r22 = wheel.addOrReplaceChild("hexadecagon_r22",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.235F, -0.5739F, 0.2858F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r23 = wheel.addOrReplaceChild("hexadecagon_r23",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.235F, -3.0051F, 0.8116F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r24 = wheel.addOrReplaceChild("hexadecagon_r24",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.235F, -5.0501F, 2.2277F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r25 = wheel.addOrReplaceChild("hexadecagon_r25",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.235F, 3.9644F, 2.0777F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r26 = wheel.addOrReplaceChild("hexadecagon_r26",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r27 = wheel.addOrReplaceChild("hexadecagon_r27",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.1846F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r28 = wheel.addOrReplaceChild("hexadecagon_r28",
				CubeListBuilder.create().texOffs(0, 1).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r29 = wheel.addOrReplaceChild("hexadecagon_r29",
				CubeListBuilder.create().texOffs(0, 1).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition wheel2 = wheel4.addOrReplaceChild("wheel2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(7.7043F, -0.2899F, -1.7051F, 0.0F, 0.0F, 0.1745F));

		PartDefinition hexadecagon_r30 = wheel2.addOrReplaceChild("hexadecagon_r30",
				CubeListBuilder.create().texOffs(0, 1).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2871F, 0.2723F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r31 = wheel2.addOrReplaceChild("hexadecagon_r31",
				CubeListBuilder.create().texOffs(0, 1).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0979F, 0.5223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r32 = wheel2.addOrReplaceChild("hexadecagon_r32",
				CubeListBuilder.create().texOffs(0, 1).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2129F, 0.2723F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r33 = wheel2.addOrReplaceChild("hexadecagon_r33",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r34 = wheel2.addOrReplaceChild("hexadecagon_r34",
				CubeListBuilder.create().texOffs(-8, 7).addBox(0.8625F, -0.9875F, -0.9822F, -1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0071F, -0.0002F, 0.2555F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r35 = wheel2.addOrReplaceChild("hexadecagon_r35",
				CubeListBuilder.create().texOffs(0, 1).addBox(0.375F, -3.8668F, -3.0241F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r36 = wheel2.addOrReplaceChild("hexadecagon_r36",
				CubeListBuilder.create().texOffs(0, 1).addBox(0.375F, -3.8855F, -2.6715F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r37 = wheel2.addOrReplaceChild("hexadecagon_r37",
				CubeListBuilder.create().texOffs(0, 1).addBox(0.075F, -2.3819F, -4.509F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r38 = wheel2.addOrReplaceChild("hexadecagon_r38",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r39 = wheel2.addOrReplaceChild("hexadecagon_r39",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.068F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r40 = wheel2.addOrReplaceChild("hexadecagon_r40",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r41 = wheel2.addOrReplaceChild("hexadecagon_r41",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.068F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r42 = wheel2.addOrReplaceChild("hexadecagon_r42",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r43 = wheel2.addOrReplaceChild("hexadecagon_r43",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.068F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r44 = wheel2.addOrReplaceChild("hexadecagon_r44",
				CubeListBuilder.create().texOffs(0, 2).addBox(0.075F, -2.4006F, -1.1865F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r45 = wheel2.addOrReplaceChild("hexadecagon_r45",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r46 = wheel2.addOrReplaceChild("hexadecagon_r46",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, -0.0152F, 0.068F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r47 = wheel2.addOrReplaceChild("hexadecagon_r47",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r48 = wheel2.addOrReplaceChild("hexadecagon_r48",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r49 = wheel2.addOrReplaceChild("hexadecagon_r49",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r50 = wheel2.addOrReplaceChild("hexadecagon_r50",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.235F, 1.8735F, 0.7304F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r51 = wheel2.addOrReplaceChild("hexadecagon_r51",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.235F, -0.5739F, 0.2858F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r52 = wheel2.addOrReplaceChild("hexadecagon_r52",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.235F, -3.0051F, 0.8116F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r53 = wheel2.addOrReplaceChild("hexadecagon_r53",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.235F, -5.0501F, 2.2277F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r54 = wheel2.addOrReplaceChild("hexadecagon_r54",
				CubeListBuilder.create().texOffs(0, 1).addBox(-1.235F, 3.9644F, 2.0777F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r55 = wheel2.addOrReplaceChild("hexadecagon_r55",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r56 = wheel2.addOrReplaceChild("hexadecagon_r56",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.1846F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r57 = wheel2.addOrReplaceChild("hexadecagon_r57",
				CubeListBuilder.create().texOffs(0, 1).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r58 = wheel2.addOrReplaceChild("hexadecagon_r58",
				CubeListBuilder.create().texOffs(0, 1).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0371F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition wheel3 = wheel4.addOrReplaceChild("wheel3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2235F, -0.3794F, -3.4249F, 0.0F, 0.0F, 0.1745F));

		PartDefinition hexadecagon_r59 = wheel3.addOrReplaceChild("hexadecagon_r59",
				CubeListBuilder.create().texOffs(0, 1).addBox(3.1683F, -4.9382F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2433F, 0.2637F, 3.407F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r60 = wheel3.addOrReplaceChild("hexadecagon_r60",
				CubeListBuilder.create().texOffs(0, 1).addBox(3.1683F, -4.9382F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0162F, 0.4112F, 3.407F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r61 = wheel3.addOrReplaceChild("hexadecagon_r61",
				CubeListBuilder.create().texOffs(0, 1).addBox(3.1684F, -4.9382F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0517F, 0.2637F, 3.407F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r62 = wheel3.addOrReplaceChild("hexadecagon_r62",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(3.1152F, -4.5843F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1683F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r63 = wheel3.addOrReplaceChild("hexadecagon_r63",
				CubeListBuilder.create().texOffs(-8, 5).addBox(2.9189F, -2.4026F, -2.5795F, -22.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0781F, 1.1029F, -0.1109F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r64 = wheel3.addOrReplaceChild("hexadecagon_r64",
				CubeListBuilder.create().texOffs(0, 1).addBox(0.2212F, -2.6914F, -1.7842F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -0.0405F, -0.2879F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r65 = wheel3.addOrReplaceChild("hexadecagon_r65",
				CubeListBuilder.create().texOffs(0, 1).addBox(0.2212F, -2.7025F, -1.5762F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -0.0405F, -0.2879F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r66 = wheel3.addOrReplaceChild("hexadecagon_r66",
				CubeListBuilder.create().texOffs(0, 1).addBox(0.0442F, -1.8153F, -2.6603F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -1.2795F, -0.2879F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r67 = wheel3.addOrReplaceChild("hexadecagon_r67",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2112F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r68 = wheel3.addOrReplaceChild("hexadecagon_r68",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r69 = wheel3.addOrReplaceChild("hexadecagon_r69",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2112F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r70 = wheel3.addOrReplaceChild("hexadecagon_r70",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r71 = wheel3.addOrReplaceChild("hexadecagon_r71",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2112F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r72 = wheel3.addOrReplaceChild("hexadecagon_r72",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r73 = wheel3.addOrReplaceChild("hexadecagon_r73",
				CubeListBuilder.create().texOffs(0, 2).addBox(0.0442F, -1.8264F, -0.7001F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -1.2795F, -0.2879F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r74 = wheel3.addOrReplaceChild("hexadecagon_r74",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2112F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r75 = wheel3.addOrReplaceChild("hexadecagon_r75",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r76 = wheel3.addOrReplaceChild("hexadecagon_r76",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(3.1152F, -4.5843F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.3873F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r77 = wheel3.addOrReplaceChild("hexadecagon_r77",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(3.1152F, -4.5843F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1683F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r78 = wheel3.addOrReplaceChild("hexadecagon_r78",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(3.1683F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r79 = wheel3.addOrReplaceChild("hexadecagon_r79",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.5486F, 0.6954F, 0.4309F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r80 = wheel3.addOrReplaceChild("hexadecagon_r80",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.5486F, -0.7486F, 0.1686F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r81 = wheel3.addOrReplaceChild("hexadecagon_r81",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.5486F, -2.183F, 0.4788F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r82 = wheel3.addOrReplaceChild("hexadecagon_r82",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.5486F, -3.3896F, 1.3144F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r83 = wheel3.addOrReplaceChild("hexadecagon_r83",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.5486F, 1.929F, 1.2259F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r84 = wheel3.addOrReplaceChild("hexadecagon_r84",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(3.1152F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.3873F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r85 = wheel3.addOrReplaceChild("hexadecagon_r85",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(3.1152F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.3873F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r86 = wheel3.addOrReplaceChild("hexadecagon_r86",
				CubeListBuilder.create().texOffs(0, 1).addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r87 = wheel3.addOrReplaceChild("hexadecagon_r87",
				CubeListBuilder.create().texOffs(0, 1).addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition bone = wheel4.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(-4, 0).mirror()
						.addBox(-8.0556F, -7.8889F, -8.1111F, 16.0F, 16.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(-4, 0).mirror()
						.addBox(-8.0556F, -7.8889F, 1.8889F, 16.0F, 16.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(-5, -1).mirror()
						.addBox(-7.3889F, -6.5556F, -2.1111F, 15.0F, 12.6667F, 4.6667F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.1485F, 0.967F, 6.8351F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		wheel4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}