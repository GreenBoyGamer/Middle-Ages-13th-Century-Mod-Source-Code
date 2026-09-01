// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellog_cutter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "log_cutter"), "main");
	private final ModelPart wheel4;
	private final ModelPart wheel;
	private final ModelPart wheel7;
	private final ModelPart wheel2;
	private final ModelPart wheel6;
	private final ModelPart wheel3;
	private final ModelPart wheel9;
	private final ModelPart wheel5;
	private final ModelPart wheel8;
	private final ModelPart bone;
	private final ModelPart blade;

	public Modellog_cutter(ModelPart root) {
		this.wheel4 = root.getChild("wheel4");
		this.wheel = this.wheel4.getChild("wheel");
		this.wheel7 = this.wheel4.getChild("wheel7");
		this.wheel2 = this.wheel4.getChild("wheel2");
		this.wheel6 = this.wheel4.getChild("wheel6");
		this.wheel3 = this.wheel4.getChild("wheel3");
		this.wheel9 = this.wheel4.getChild("wheel9");
		this.wheel5 = this.wheel4.getChild("wheel5");
		this.wheel8 = this.wheel4.getChild("wheel8");
		this.bone = this.wheel4.getChild("bone");
		this.blade = this.wheel4.getChild("blade");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wheel4 = partdefinition.addOrReplaceChild("wheel4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-6.843F, 14.9218F, 0.276F, 0.0F, 1.5708F, 0.0F));

		PartDefinition wheel = wheel4.addOrReplaceChild("wheel", CubeListBuilder.create(),
				PartPose.offset(-7.6293F, -0.2978F, -1.7051F));

		PartDefinition hexadecagon_r1 = wheel.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(92, 60).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2872F, 0.2723F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r2 = wheel.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(0, 93).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0978F, 0.5223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r3 = wheel.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(60, 92).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2128F, 0.2723F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r4 = wheel.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(32, 69)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(94, 78)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 69)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 44)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 25)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 21)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r5 = wheel.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(52, 7).addBox(0.8625F, -0.9875F, -0.9822F, -1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0072F, -0.0002F, 0.2555F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r6 = wheel.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(48, 50).addBox(0.375F, -3.8668F, -3.0241F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r7 = wheel.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(0, 50).addBox(0.375F, -3.8856F, -2.6715F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r8 = wheel.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(24, 50).addBox(0.075F, -2.3819F, -4.509F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r9 = wheel.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(80, 33).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r10 = wheel.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(48, 69).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r11 = wheel.addOrReplaceChild("hexadecagon_r11",
				CubeListBuilder.create().texOffs(78, 25).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r12 = wheel.addOrReplaceChild("hexadecagon_r12",
				CubeListBuilder.create().texOffs(44, 69).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r13 = wheel.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(78, 17).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r14 = wheel.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(40, 69).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r15 = wheel.addOrReplaceChild("hexadecagon_r15",
				CubeListBuilder.create().texOffs(36, 50).addBox(0.075F, -2.4006F, -1.1865F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r16 = wheel.addOrReplaceChild("hexadecagon_r16",
				CubeListBuilder.create().texOffs(78, 9).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r17 = wheel.addOrReplaceChild("hexadecagon_r17",
				CubeListBuilder.create().texOffs(56, 64).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r18 = wheel.addOrReplaceChild("hexadecagon_r18",
				CubeListBuilder.create().texOffs(68, 77)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 77)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 40)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 17)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r19 = wheel.addOrReplaceChild("hexadecagon_r19",
				CubeListBuilder.create().texOffs(24, 69)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 95)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 65)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 36)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 82)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 13)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r20 = wheel.addOrReplaceChild("hexadecagon_r20",
				CubeListBuilder.create().texOffs(12, 95)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 28)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r21 = wheel.addOrReplaceChild("hexadecagon_r21",
				CubeListBuilder.create().texOffs(82, 19).addBox(-1.235F, 1.8735F, 0.7304F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r22 = wheel.addOrReplaceChild("hexadecagon_r22",
				CubeListBuilder.create().texOffs(82, 16).addBox(-1.235F, -0.5739F, 0.2858F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r23 = wheel.addOrReplaceChild("hexadecagon_r23",
				CubeListBuilder.create().texOffs(82, 13).addBox(-1.235F, -3.0051F, 0.8116F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r24 = wheel.addOrReplaceChild("hexadecagon_r24",
				CubeListBuilder.create().texOffs(82, 10).addBox(-1.235F, -5.0501F, 2.2277F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r25 = wheel.addOrReplaceChild("hexadecagon_r25",
				CubeListBuilder.create().texOffs(8, 82).addBox(-1.235F, 3.9644F, 2.0777F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r26 = wheel.addOrReplaceChild("hexadecagon_r26",
				CubeListBuilder.create().texOffs(96, 48)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 25)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r27 = wheel.addOrReplaceChild("hexadecagon_r27",
				CubeListBuilder.create().texOffs(96, 32)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 9)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r28 = wheel.addOrReplaceChild("hexadecagon_r28",
				CubeListBuilder.create().texOffs(84, 0).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r29 = wheel.addOrReplaceChild("hexadecagon_r29",
				CubeListBuilder.create().texOffs(82, 22).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition wheel7 = wheel4.addOrReplaceChild("wheel7", CubeListBuilder.create(),
				PartPose.offset(-7.6293F, -0.2978F, 17.2949F));

		PartDefinition hexadecagon_r30 = wheel7.addOrReplaceChild("hexadecagon_r30",
				CubeListBuilder.create().texOffs(32, 85).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2872F, 0.2723F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r31 = wheel7.addOrReplaceChild("hexadecagon_r31",
				CubeListBuilder.create().texOffs(6, 85).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0978F, 0.5223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r32 = wheel7.addOrReplaceChild("hexadecagon_r32",
				CubeListBuilder.create().texOffs(0, 85).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2128F, 0.2723F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r33 = wheel7.addOrReplaceChild("hexadecagon_r33",
				CubeListBuilder.create().texOffs(68, 61)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 5)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 49)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(88, 93)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 76)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 93)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r34 = wheel7.addOrReplaceChild("hexadecagon_r34",
				CubeListBuilder.create().texOffs(46, 93).addBox(0.8625F, -0.9875F, -0.9822F, -1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0072F, -0.0002F, 0.2555F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r35 = wheel7.addOrReplaceChild("hexadecagon_r35",
				CubeListBuilder.create().texOffs(48, 57).addBox(0.375F, -3.8668F, -3.0241F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r36 = wheel7.addOrReplaceChild("hexadecagon_r36",
				CubeListBuilder.create().texOffs(36, 57).addBox(0.375F, -3.8856F, -2.6715F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r37 = wheel7.addOrReplaceChild("hexadecagon_r37",
				CubeListBuilder.create().texOffs(24, 57).addBox(0.075F, -2.3819F, -4.509F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r38 = wheel7.addOrReplaceChild("hexadecagon_r38",
				CubeListBuilder.create().texOffs(48, 77).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r39 = wheel7.addOrReplaceChild("hexadecagon_r39",
				CubeListBuilder.create().texOffs(44, 77).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r40 = wheel7.addOrReplaceChild("hexadecagon_r40",
				CubeListBuilder.create().texOffs(40, 77).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r41 = wheel7.addOrReplaceChild("hexadecagon_r41",
				CubeListBuilder.create().texOffs(36, 77).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r42 = wheel7.addOrReplaceChild("hexadecagon_r42",
				CubeListBuilder.create().texOffs(32, 77).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r43 = wheel7.addOrReplaceChild("hexadecagon_r43",
				CubeListBuilder.create().texOffs(76, 73).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r44 = wheel7.addOrReplaceChild("hexadecagon_r44",
				CubeListBuilder.create().texOffs(12, 57).addBox(0.075F, -2.4006F, -1.1865F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r45 = wheel7.addOrReplaceChild("hexadecagon_r45",
				CubeListBuilder.create().texOffs(76, 65).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r46 = wheel7.addOrReplaceChild("hexadecagon_r46",
				CubeListBuilder.create().texOffs(76, 57).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r47 = wheel7.addOrReplaceChild("hexadecagon_r47",
				CubeListBuilder.create().texOffs(68, 57)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 45)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(84, 93)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 93)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r48 = wheel7.addOrReplaceChild("hexadecagon_r48",
				CubeListBuilder.create().texOffs(68, 53)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(94, 5)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 40)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 93)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 81)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 93)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r49 = wheel7.addOrReplaceChild("hexadecagon_r49",
				CubeListBuilder.create().texOffs(94, 3)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 79)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r50 = wheel7.addOrReplaceChild("hexadecagon_r50",
				CubeListBuilder.create().texOffs(82, 7).addBox(-1.235F, 1.8735F, 0.7304F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r51 = wheel7.addOrReplaceChild("hexadecagon_r51",
				CubeListBuilder.create().texOffs(82, 4).addBox(-1.235F, -0.5739F, 0.2858F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r52 = wheel7.addOrReplaceChild("hexadecagon_r52",
				CubeListBuilder.create().texOffs(0, 82).addBox(-1.235F, -3.0051F, 0.8116F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r53 = wheel7.addOrReplaceChild("hexadecagon_r53",
				CubeListBuilder.create().texOffs(68, 81).addBox(-1.235F, -5.0501F, 2.2277F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r54 = wheel7.addOrReplaceChild("hexadecagon_r54",
				CubeListBuilder.create().texOffs(60, 81).addBox(-1.235F, 3.9644F, 2.0777F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r55 = wheel7.addOrReplaceChild("hexadecagon_r55",
				CubeListBuilder.create().texOffs(92, 93)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 93)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r56 = wheel7.addOrReplaceChild("hexadecagon_r56",
				CubeListBuilder.create().texOffs(76, 93)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 93)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r57 = wheel7.addOrReplaceChild("hexadecagon_r57",
				CubeListBuilder.create().texOffs(24, 81).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r58 = wheel7.addOrReplaceChild("hexadecagon_r58",
				CubeListBuilder.create().texOffs(80, 73).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition wheel2 = wheel4.addOrReplaceChild("wheel2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(7.7043F, -0.2899F, -1.7051F, 0.0F, 0.0F, 0.1745F));

		PartDefinition hexadecagon_r59 = wheel2.addOrReplaceChild("hexadecagon_r59",
				CubeListBuilder.create().texOffs(92, 66).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2872F, 0.2723F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r60 = wheel2.addOrReplaceChild("hexadecagon_r60",
				CubeListBuilder.create().texOffs(66, 92).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0978F, 0.5223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r61 = wheel2.addOrReplaceChild("hexadecagon_r61",
				CubeListBuilder.create().texOffs(92, 63).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2128F, 0.2723F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r62 = wheel2.addOrReplaceChild("hexadecagon_r62",
				CubeListBuilder.create().texOffs(32, 73)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 95)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 69)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 97)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 84)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 97)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r63 = wheel2.addOrReplaceChild("hexadecagon_r63",
				CubeListBuilder.create().texOffs(74, 33).addBox(0.8625F, -0.9875F, -0.9822F, -1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0071F, -0.0002F, 0.2555F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r64 = wheel2.addOrReplaceChild("hexadecagon_r64",
				CubeListBuilder.create().texOffs(54, 21).addBox(0.375F, -3.8668F, -3.0241F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r65 = wheel2.addOrReplaceChild("hexadecagon_r65",
				CubeListBuilder.create().texOffs(12, 50).addBox(0.375F, -3.8856F, -2.6715F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r66 = wheel2.addOrReplaceChild("hexadecagon_r66",
				CubeListBuilder.create().texOffs(54, 14).addBox(0.075F, -2.3819F, -4.509F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r67 = wheel2.addOrReplaceChild("hexadecagon_r67",
				CubeListBuilder.create().texOffs(80, 65).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r68 = wheel2.addOrReplaceChild("hexadecagon_r68",
				CubeListBuilder.create().texOffs(28, 73).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r69 = wheel2.addOrReplaceChild("hexadecagon_r69",
				CubeListBuilder.create().texOffs(80, 57).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r70 = wheel2.addOrReplaceChild("hexadecagon_r70",
				CubeListBuilder.create().texOffs(24, 73).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r71 = wheel2.addOrReplaceChild("hexadecagon_r71",
				CubeListBuilder.create().texOffs(80, 49).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r72 = wheel2.addOrReplaceChild("hexadecagon_r72",
				CubeListBuilder.create().texOffs(20, 73).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r73 = wheel2.addOrReplaceChild("hexadecagon_r73",
				CubeListBuilder.create().texOffs(54, 7).addBox(0.075F, -2.4006F, -1.1865F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r74 = wheel2.addOrReplaceChild("hexadecagon_r74",
				CubeListBuilder.create().texOffs(80, 41).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r75 = wheel2.addOrReplaceChild("hexadecagon_r75",
				CubeListBuilder.create().texOffs(16, 73).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r76 = wheel2.addOrReplaceChild("hexadecagon_r76",
				CubeListBuilder.create().texOffs(8, 78)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 78)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 97)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 97)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r77 = wheel2.addOrReplaceChild("hexadecagon_r77",
				CubeListBuilder.create().texOffs(52, 72)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(66, 95)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 69)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 97)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 34)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 93)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r78 = wheel2.addOrReplaceChild("hexadecagon_r78",
				CubeListBuilder.create().texOffs(60, 95)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 31)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r79 = wheel2.addOrReplaceChild("hexadecagon_r79",
				CubeListBuilder.create().texOffs(52, 84).addBox(-1.235F, 1.8735F, 0.7304F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r80 = wheel2.addOrReplaceChild("hexadecagon_r80",
				CubeListBuilder.create().texOffs(84, 49).addBox(-1.235F, -0.5739F, 0.2858F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r81 = wheel2.addOrReplaceChild("hexadecagon_r81",
				CubeListBuilder.create().texOffs(84, 46).addBox(-1.235F, -3.0051F, 0.8116F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r82 = wheel2.addOrReplaceChild("hexadecagon_r82",
				CubeListBuilder.create().texOffs(84, 43).addBox(-1.235F, -5.0501F, 2.2277F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r83 = wheel2.addOrReplaceChild("hexadecagon_r83",
				CubeListBuilder.create().texOffs(84, 40).addBox(-1.235F, 3.9644F, 2.0777F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r84 = wheel2.addOrReplaceChild("hexadecagon_r84",
				CubeListBuilder.create().texOffs(40, 97)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 97)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r85 = wheel2.addOrReplaceChild("hexadecagon_r85",
				CubeListBuilder.create().texOffs(24, 97)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 52)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r86 = wheel2.addOrReplaceChild("hexadecagon_r86",
				CubeListBuilder.create().texOffs(84, 37).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r87 = wheel2.addOrReplaceChild("hexadecagon_r87",
				CubeListBuilder.create().texOffs(16, 84).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition wheel6 = wheel4.addOrReplaceChild("wheel6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(7.7043F, -0.2899F, 17.2949F, 0.0F, 0.0F, 0.1745F));

		PartDefinition hexadecagon_r88 = wheel6.addOrReplaceChild("hexadecagon_r88",
				CubeListBuilder.create().texOffs(90, 23).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2872F, 0.2723F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r89 = wheel6.addOrReplaceChild("hexadecagon_r89",
				CubeListBuilder.create().texOffs(6, 93).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0978F, 0.5223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r90 = wheel6.addOrReplaceChild("hexadecagon_r90",
				CubeListBuilder.create().texOffs(92, 90).addBox(5.065F, -8.675F, -0.5322F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2128F, 0.2723F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r91 = wheel6.addOrReplaceChild("hexadecagon_r91",
				CubeListBuilder.create().texOffs(76, 0)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 74)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(76, 97)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 55)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 97)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r92 = wheel6.addOrReplaceChild("hexadecagon_r92",
				CubeListBuilder.create().texOffs(48, 103).addBox(0.8625F, -0.9875F, -0.9822F, -1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0071F, -0.0002F, 0.2555F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r93 = wheel6.addOrReplaceChild("hexadecagon_r93",
				CubeListBuilder.create().texOffs(0, 57).addBox(0.375F, -3.8668F, -3.0241F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r94 = wheel6.addOrReplaceChild("hexadecagon_r94",
				CubeListBuilder.create().texOffs(56, 42).addBox(0.375F, -3.8856F, -2.6715F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -0.2433F, -0.0445F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r95 = wheel6.addOrReplaceChild("hexadecagon_r95",
				CubeListBuilder.create().texOffs(54, 35).addBox(0.075F, -2.3819F, -4.509F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r96 = wheel6.addOrReplaceChild("hexadecagon_r96",
				CubeListBuilder.create().texOffs(56, 76).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r97 = wheel6.addOrReplaceChild("hexadecagon_r97",
				CubeListBuilder.create().texOffs(52, 76).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r98 = wheel6.addOrReplaceChild("hexadecagon_r98",
				CubeListBuilder.create().texOffs(76, 49).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r99 = wheel6.addOrReplaceChild("hexadecagon_r99",
				CubeListBuilder.create().texOffs(76, 41).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r100 = wheel6.addOrReplaceChild("hexadecagon_r100",
				CubeListBuilder.create().texOffs(76, 33).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r101 = wheel6.addOrReplaceChild("hexadecagon_r101",
				CubeListBuilder.create().texOffs(74, 25).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r102 = wheel6.addOrReplaceChild("hexadecagon_r102",
				CubeListBuilder.create().texOffs(54, 28).addBox(0.075F, -2.4006F, -1.1865F, 0.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0504F, -2.3433F, -0.0445F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r103 = wheel6.addOrReplaceChild("hexadecagon_r103",
				CubeListBuilder.create().texOffs(74, 17).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.0856F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r104 = wheel6.addOrReplaceChild("hexadecagon_r104",
				CubeListBuilder.create().texOffs(74, 9).addBox(-0.625F, -7.0375F, -0.5322F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, -0.0152F, 0.068F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r105 = wheel6.addOrReplaceChild("hexadecagon_r105",
				CubeListBuilder.create().texOffs(8, 74)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 73)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 97)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 97)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r106 = wheel6.addOrReplaceChild("hexadecagon_r106",
				CubeListBuilder.create().texOffs(74, 5)
						.addBox(5.975F, -7.075F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 7)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 73)
						.addBox(5.975F, 6.2F, -1.4322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 97)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 84)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 97)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r107 = wheel6.addOrReplaceChild("hexadecagon_r107",
				CubeListBuilder.create().texOffs(6, 96)
						.addBox(5.065F, 7.1F, -0.4197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 58)
						.addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r108 = wheel6.addOrReplaceChild("hexadecagon_r108",
				CubeListBuilder.create().texOffs(84, 82).addBox(-1.235F, 1.8735F, 0.7304F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r109 = wheel6.addOrReplaceChild("hexadecagon_r109",
				CubeListBuilder.create().texOffs(84, 70).addBox(-1.235F, -0.5739F, 0.2858F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r110 = wheel6.addOrReplaceChild("hexadecagon_r110",
				CubeListBuilder.create().texOffs(68, 84).addBox(-1.235F, -3.0051F, 0.8116F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r111 = wheel6.addOrReplaceChild("hexadecagon_r111",
				CubeListBuilder.create().texOffs(84, 67).addBox(-1.235F, -5.0501F, 2.2277F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r112 = wheel6.addOrReplaceChild("hexadecagon_r112",
				CubeListBuilder.create().texOffs(84, 64).addBox(-1.235F, 3.9644F, 2.0777F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3371F, 0.1284F, -0.082F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r113 = wheel6.addOrReplaceChild("hexadecagon_r113",
				CubeListBuilder.create().texOffs(80, 97)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 97)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r114 = wheel6.addOrReplaceChild("hexadecagon_r114",
				CubeListBuilder.create().texOffs(64, 97)
						.addBox(5.975F, -1.5678F, 6.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 97)
						.addBox(5.975F, -1.5678F, -7.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.1846F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r115 = wheel6.addOrReplaceChild("hexadecagon_r115",
				CubeListBuilder.create().texOffs(84, 61).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r116 = wheel6.addOrReplaceChild("hexadecagon_r116",
				CubeListBuilder.create().texOffs(84, 52).addBox(5.065F, -0.5803F, -8.4F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0372F, 0.0223F, 6.218F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition wheel3 = wheel4.addOrReplaceChild("wheel3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2235F, 3.6206F, -3.4249F, 0.0F, 0.0F, 0.1745F));

		PartDefinition hexadecagon_r117 = wheel3.addOrReplaceChild("hexadecagon_r117",
				CubeListBuilder.create().texOffs(102, 0).addBox(3.1684F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2433F, 0.2637F, 3.407F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r118 = wheel3.addOrReplaceChild("hexadecagon_r118",
				CubeListBuilder.create().texOffs(80, 101).addBox(3.1684F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0162F, 0.4112F, 3.407F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r119 = wheel3.addOrReplaceChild("hexadecagon_r119",
				CubeListBuilder.create().texOffs(76, 101).addBox(3.1684F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0517F, 0.2637F, 3.407F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r120 = wheel3.addOrReplaceChild("hexadecagon_r120", CubeListBuilder.create()
				.texOffs(92, 87).addBox(3.1153F, -4.5842F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 101).addBox(3.1684F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 75).addBox(3.1153F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 100).addBox(3.1153F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 101).addBox(3.1684F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 47).addBox(3.1153F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r121 = wheel3.addOrReplaceChild("hexadecagon_r121",
				CubeListBuilder.create().texOffs(16, 64).addBox(0.2212F, -2.6914F, -1.7842F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -0.0405F, -0.2879F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r122 = wheel3.addOrReplaceChild("hexadecagon_r122",
				CubeListBuilder.create().texOffs(60, 0).addBox(0.2212F, -2.7025F, -1.5762F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -0.0405F, -0.2879F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r123 = wheel3.addOrReplaceChild("hexadecagon_r123",
				CubeListBuilder.create().texOffs(44, 7).addBox(0.0442F, -1.8153F, -2.6603F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -1.2795F, -0.2879F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r124 = wheel3.addOrReplaceChild("hexadecagon_r124",
				CubeListBuilder.create().texOffs(90, 3).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2111F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r125 = wheel3.addOrReplaceChild("hexadecagon_r125",
				CubeListBuilder.create().texOffs(88, 85).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r126 = wheel3.addOrReplaceChild("hexadecagon_r126",
				CubeListBuilder.create().texOffs(88, 73).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2111F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r127 = wheel3.addOrReplaceChild("hexadecagon_r127",
				CubeListBuilder.create().texOffs(32, 88).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r128 = wheel3.addOrReplaceChild("hexadecagon_r128",
				CubeListBuilder.create().texOffs(8, 88).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2111F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r129 = wheel3.addOrReplaceChild("hexadecagon_r129",
				CubeListBuilder.create().texOffs(4, 88).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r130 = wheel3.addOrReplaceChild("hexadecagon_r130",
				CubeListBuilder.create().texOffs(68, 0).addBox(0.0442F, -1.8264F, -0.7001F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -1.2795F, -0.2879F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r131 = wheel3.addOrReplaceChild("hexadecagon_r131",
				CubeListBuilder.create().texOffs(0, 88).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2111F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r132 = wheel3.addOrReplaceChild("hexadecagon_r132",
				CubeListBuilder.create().texOffs(70, 87).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r133 = wheel3.addOrReplaceChild("hexadecagon_r133",
				CubeListBuilder.create().texOffs(92, 84)
						.addBox(3.1153F, -4.5842F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(92, 72)
						.addBox(3.1153F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(100, 77)
						.addBox(3.1153F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 44)
						.addBox(3.1153F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.3873F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r134 = wheel3.addOrReplaceChild("hexadecagon_r134", CubeListBuilder.create()
				.texOffs(92, 81).addBox(3.1153F, -4.5842F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 101).addBox(3.1684F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 69).addBox(3.1153F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(88, 100).addBox(3.1153F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 101).addBox(3.1684F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 41).addBox(3.1153F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r135 = wheel3.addOrReplaceChild("hexadecagon_r135",
				CubeListBuilder.create().texOffs(68, 101)
						.addBox(3.1684F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 101)
						.addBox(3.1684F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r136 = wheel3.addOrReplaceChild("hexadecagon_r136",
				CubeListBuilder.create().texOffs(60, 101).addBox(-0.5486F, 0.6954F, 0.4309F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r137 = wheel3.addOrReplaceChild("hexadecagon_r137",
				CubeListBuilder.create().texOffs(36, 101).addBox(-0.5486F, -0.7486F, 0.1686F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r138 = wheel3.addOrReplaceChild("hexadecagon_r138",
				CubeListBuilder.create().texOffs(32, 101).addBox(-0.5486F, -2.183F, 0.4788F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r139 = wheel3.addOrReplaceChild("hexadecagon_r139",
				CubeListBuilder.create().texOffs(28, 101).addBox(-0.5486F, -3.3895F, 1.3144F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r140 = wheel3.addOrReplaceChild("hexadecagon_r140",
				CubeListBuilder.create().texOffs(24, 101).addBox(-0.5486F, 1.929F, 1.2259F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r141 = wheel3.addOrReplaceChild("hexadecagon_r141",
				CubeListBuilder.create().texOffs(84, 100)
						.addBox(3.1153F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 50)
						.addBox(3.1153F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.3873F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r142 = wheel3.addOrReplaceChild("hexadecagon_r142",
				CubeListBuilder.create().texOffs(100, 53)
						.addBox(3.1153F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 38)
						.addBox(3.1153F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.3873F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r143 = wheel3.addOrReplaceChild("hexadecagon_r143",
				CubeListBuilder.create().texOffs(56, 101).addBox(3.1684F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r144 = wheel3.addOrReplaceChild("hexadecagon_r144",
				CubeListBuilder.create().texOffs(40, 101).addBox(3.1684F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition wheel9 = wheel4.addOrReplaceChild("wheel9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2235F, -7.3794F, -0.4249F, 0.0F, 0.0F, 0.1745F));

		PartDefinition hexadecagon_r145 = wheel9.addOrReplaceChild("hexadecagon_r145",
				CubeListBuilder.create().texOffs(40, 103).addBox(3.1684F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2433F, 0.2637F, 3.407F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r146 = wheel9.addOrReplaceChild("hexadecagon_r146",
				CubeListBuilder.create().texOffs(36, 103).addBox(3.1684F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0162F, 0.4112F, 3.407F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r147 = wheel9.addOrReplaceChild("hexadecagon_r147",
				CubeListBuilder.create().texOffs(32, 103).addBox(3.1684F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0517F, 0.2637F, 3.407F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r148 = wheel9.addOrReplaceChild("hexadecagon_r148", CubeListBuilder.create()
				.texOffs(92, 57).addBox(3.1153F, -4.5843F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 103).addBox(3.1684F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 92).addBox(3.1153F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(100, 32).addBox(3.1153F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 103).addBox(3.1684F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 12).addBox(3.1153F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r149 = wheel9.addOrReplaceChild("hexadecagon_r149",
				CubeListBuilder.create().texOffs(66, 35).addBox(0.2212F, -2.6914F, -1.7842F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -0.0405F, -0.2879F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r150 = wheel9.addOrReplaceChild("hexadecagon_r150",
				CubeListBuilder.create().texOffs(66, 30).addBox(0.2212F, -2.7025F, -1.5762F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -0.0405F, -0.2879F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r151 = wheel9.addOrReplaceChild("hexadecagon_r151",
				CubeListBuilder.create().texOffs(66, 25).addBox(0.0442F, -1.8153F, -2.6603F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -1.2795F, -0.2879F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r152 = wheel9.addOrReplaceChild("hexadecagon_r152",
				CubeListBuilder.create().texOffs(56, 92).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2112F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r153 = wheel9.addOrReplaceChild("hexadecagon_r153",
				CubeListBuilder.create().texOffs(92, 52).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r154 = wheel9.addOrReplaceChild("hexadecagon_r154",
				CubeListBuilder.create().texOffs(52, 92).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2112F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r155 = wheel9.addOrReplaceChild("hexadecagon_r155",
				CubeListBuilder.create().texOffs(48, 92).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r156 = wheel9.addOrReplaceChild("hexadecagon_r156",
				CubeListBuilder.create().texOffs(92, 47).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2112F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r157 = wheel9.addOrReplaceChild("hexadecagon_r157",
				CubeListBuilder.create().texOffs(92, 42).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r158 = wheel9.addOrReplaceChild("hexadecagon_r158",
				CubeListBuilder.create().texOffs(68, 40).addBox(0.0442F, -1.8264F, -0.7001F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -1.2795F, -0.2879F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r159 = wheel9.addOrReplaceChild("hexadecagon_r159",
				CubeListBuilder.create().texOffs(92, 37).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2112F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r160 = wheel9.addOrReplaceChild("hexadecagon_r160",
				CubeListBuilder.create().texOffs(92, 32).addBox(-0.7787F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.0941F, -0.2215F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r161 = wheel9.addOrReplaceChild("hexadecagon_r161",
				CubeListBuilder.create().texOffs(92, 29)
						.addBox(3.1153F, -4.5843F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 92)
						.addBox(3.1153F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(100, 24)
						.addBox(3.1153F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 9)
						.addBox(3.1153F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.3873F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r162 = wheel9.addOrReplaceChild("hexadecagon_r162", CubeListBuilder.create()
				.texOffs(24, 92).addBox(3.1153F, -4.5843F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 103).addBox(3.1684F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 0).addBox(3.1153F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(100, 21).addBox(3.1153F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 103).addBox(3.1684F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 3).addBox(3.1153F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r163 = wheel9.addOrReplaceChild("hexadecagon_r163",
				CubeListBuilder.create().texOffs(24, 103)
						.addBox(3.1684F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 103)
						.addBox(3.1684F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r164 = wheel9.addOrReplaceChild("hexadecagon_r164",
				CubeListBuilder.create().texOffs(54, 103).addBox(-0.5486F, 0.6954F, 0.4309F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r165 = wheel9.addOrReplaceChild("hexadecagon_r165",
				CubeListBuilder.create().texOffs(20, 101).addBox(-0.5486F, -0.7486F, 0.1686F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r166 = wheel9.addOrReplaceChild("hexadecagon_r166",
				CubeListBuilder.create().texOffs(16, 101).addBox(-0.5486F, -2.183F, 0.4788F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r167 = wheel9.addOrReplaceChild("hexadecagon_r167",
				CubeListBuilder.create().texOffs(12, 101).addBox(-0.5486F, -3.3896F, 1.3144F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r168 = wheel9.addOrReplaceChild("hexadecagon_r168",
				CubeListBuilder.create().texOffs(8, 101).addBox(-0.5486F, 1.929F, 1.2259F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.1788F, -0.31F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r169 = wheel9.addOrReplaceChild("hexadecagon_r169",
				CubeListBuilder.create().texOffs(100, 35)
						.addBox(3.1153F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 15)
						.addBox(3.1153F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.3873F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r170 = wheel9.addOrReplaceChild("hexadecagon_r170",
				CubeListBuilder.create().texOffs(100, 18)
						.addBox(3.1153F, -1.155F, 3.5842F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 89)
						.addBox(3.1153F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.3873F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r171 = wheel9.addOrReplaceChild("hexadecagon_r171",
				CubeListBuilder.create().texOffs(16, 103).addBox(3.1684F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r172 = wheel9.addOrReplaceChild("hexadecagon_r172",
				CubeListBuilder.create().texOffs(0, 103).addBox(3.1684F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1162F, 3.407F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition wheel5 = wheel4.addOrReplaceChild("wheel5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2197F, 3.5987F, 15.1774F, 0.0F, 0.0F, 0.1745F));

		PartDefinition hexadecagon_r173 = wheel5.addOrReplaceChild("hexadecagon_r173",
				CubeListBuilder.create().texOffs(44, 103).addBox(3.1683F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2433F, 0.2859F, 3.8048F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r174 = wheel5.addOrReplaceChild("hexadecagon_r174",
				CubeListBuilder.create().texOffs(102, 70).addBox(3.1683F, -4.9382F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0162F, 0.4334F, 3.8048F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r175 = wheel5.addOrReplaceChild("hexadecagon_r175",
				CubeListBuilder.create().texOffs(102, 68).addBox(3.1683F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0517F, 0.2859F, 3.8048F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r176 = wheel5.addOrReplaceChild("hexadecagon_r176", CubeListBuilder.create()
				.texOffs(90, 20).addBox(3.1152F, -4.5842F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(102, 62).addBox(3.1683F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 11).addBox(3.1152F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(8, 98).addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 29).addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 97).addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.8048F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r177 = wheel5.addOrReplaceChild("hexadecagon_r177",
				CubeListBuilder.create().texOffs(0, 0).addBox(-38.0811F, -2.4026F, -2.5795F, 19.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0781F, 0.1252F, -38.1131F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r178 = wheel5.addOrReplaceChild("hexadecagon_r178",
				CubeListBuilder.create().texOffs(48, 64).addBox(0.2213F, -2.6914F, -1.7842F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -0.0183F, 0.1099F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r179 = wheel5.addOrReplaceChild("hexadecagon_r179",
				CubeListBuilder.create().texOffs(40, 64).addBox(0.2213F, -2.7025F, -1.5762F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -0.0183F, 0.1099F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r180 = wheel5.addOrReplaceChild("hexadecagon_r180",
				CubeListBuilder.create().texOffs(32, 64).addBox(0.0442F, -1.8153F, -2.6603F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -1.2573F, 0.1099F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r181 = wheel5.addOrReplaceChild("hexadecagon_r181",
				CubeListBuilder.create().texOffs(16, 87).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1866F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r182 = wheel5.addOrReplaceChild("hexadecagon_r182",
				CubeListBuilder.create().texOffs(84, 85).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1763F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r183 = wheel5.addOrReplaceChild("hexadecagon_r183",
				CubeListBuilder.create().texOffs(80, 85).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1866F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r184 = wheel5.addOrReplaceChild("hexadecagon_r184",
				CubeListBuilder.create().texOffs(76, 85).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1763F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r185 = wheel5.addOrReplaceChild("hexadecagon_r185",
				CubeListBuilder.create().texOffs(46, 85).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1866F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r186 = wheel5.addOrReplaceChild("hexadecagon_r186",
				CubeListBuilder.create().texOffs(42, 85).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1763F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r187 = wheel5.addOrReplaceChild("hexadecagon_r187",
				CubeListBuilder.create().texOffs(24, 64).addBox(0.0442F, -1.8264F, -0.7001F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -1.2573F, 0.1099F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r188 = wheel5.addOrReplaceChild("hexadecagon_r188",
				CubeListBuilder.create().texOffs(38, 85).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1866F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r189 = wheel5.addOrReplaceChild("hexadecagon_r189",
				CubeListBuilder.create().texOffs(12, 85).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1763F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r190 = wheel5.addOrReplaceChild("hexadecagon_r190",
				CubeListBuilder.create().texOffs(90, 17)
						.addBox(3.1152F, -4.5842F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 8)
						.addBox(3.1152F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 98)
						.addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 97)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.785F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r191 = wheel5.addOrReplaceChild("hexadecagon_r191", CubeListBuilder.create()
				.texOffs(90, 14).addBox(3.1152F, -4.5842F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(102, 66).addBox(3.1683F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 78).addBox(3.1152F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(98, 0).addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 58).addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 97).addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.8048F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r192 = wheel5.addOrReplaceChild("hexadecagon_r192",
				CubeListBuilder.create().texOffs(102, 64)
						.addBox(3.1683F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 56)
						.addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.8048F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r193 = wheel5.addOrReplaceChild("hexadecagon_r193",
				CubeListBuilder.create().texOffs(96, 100).addBox(-0.5486F, 0.6954F, 0.4309F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.201F, 0.0878F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r194 = wheel5.addOrReplaceChild("hexadecagon_r194",
				CubeListBuilder.create().texOffs(100, 94).addBox(-0.5486F, -0.7486F, 0.1686F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.201F, 0.0878F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r195 = wheel5.addOrReplaceChild("hexadecagon_r195",
				CubeListBuilder.create().texOffs(100, 92).addBox(-0.5486F, -2.183F, 0.4788F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.201F, 0.0878F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r196 = wheel5.addOrReplaceChild("hexadecagon_r196",
				CubeListBuilder.create().texOffs(100, 27).addBox(-0.5486F, -3.3896F, 1.3144F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.201F, 0.0878F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r197 = wheel5.addOrReplaceChild("hexadecagon_r197",
				CubeListBuilder.create().texOffs(12, 90).addBox(-0.5486F, 1.929F, 1.2259F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.201F, 0.0878F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r198 = wheel5.addOrReplaceChild("hexadecagon_r198",
				CubeListBuilder.create().texOffs(98, 29)
						.addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 97)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.785F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r199 = wheel5.addOrReplaceChild("hexadecagon_r199",
				CubeListBuilder.create().texOffs(0, 98)
						.addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 69)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.785F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r200 = wheel5.addOrReplaceChild("hexadecagon_r200",
				CubeListBuilder.create().texOffs(102, 60).addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.8048F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r201 = wheel5.addOrReplaceChild("hexadecagon_r201",
				CubeListBuilder.create().texOffs(102, 6).addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.8048F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition wheel8 = wheel4.addOrReplaceChild("wheel8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2197F, -7.4013F, 18.1774F, 0.0F, 0.0F, 0.1745F));

		PartDefinition hexadecagon_r202 = wheel8.addOrReplaceChild("hexadecagon_r202",
				CubeListBuilder.create().texOffs(50, 103).addBox(3.1683F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2433F, 0.2859F, 3.8048F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r203 = wheel8.addOrReplaceChild("hexadecagon_r203",
				CubeListBuilder.create().texOffs(100, 102).addBox(3.1683F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0162F, 0.4334F, 3.8048F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r204 = wheel8.addOrReplaceChild("hexadecagon_r204",
				CubeListBuilder.create().texOffs(96, 102).addBox(3.1683F, -4.9383F, -0.314F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0517F, 0.2859F, 3.8048F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r205 = wheel8.addOrReplaceChild("hexadecagon_r205", CubeListBuilder.create()
				.texOffs(86, 90).addBox(3.1152F, -4.5842F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(102, 86).addBox(3.1683F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 90).addBox(3.1152F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(98, 83).addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 74).addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 65).addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.8048F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r206 = wheel8.addOrReplaceChild("hexadecagon_r206",
				CubeListBuilder.create().texOffs(0, 6).addBox(-38.0811F, -2.4026F, -2.5795F, 19.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0781F, 0.1252F, -38.1131F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r207 = wheel8.addOrReplaceChild("hexadecagon_r207",
				CubeListBuilder.create().texOffs(66, 20).addBox(0.2213F, -2.6914F, -1.7842F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -0.0183F, 0.1099F, 0.0F, -1.5708F, -2.3562F));

		PartDefinition hexadecagon_r208 = wheel8.addOrReplaceChild("hexadecagon_r208",
				CubeListBuilder.create().texOffs(66, 15).addBox(0.2213F, -2.7025F, -1.5762F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -0.0183F, 0.1099F, 0.0F, -1.5708F, 2.3562F));

		PartDefinition hexadecagon_r209 = wheel8.addOrReplaceChild("hexadecagon_r209",
				CubeListBuilder.create().texOffs(66, 10).addBox(0.0442F, -1.8153F, -2.6603F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -1.2573F, 0.1099F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r210 = wheel8.addOrReplaceChild("hexadecagon_r210",
				CubeListBuilder.create().texOffs(66, 87).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1866F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r211 = wheel8.addOrReplaceChild("hexadecagon_r211",
				CubeListBuilder.create().texOffs(62, 87).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1763F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition hexadecagon_r212 = wheel8.addOrReplaceChild("hexadecagon_r212",
				CubeListBuilder.create().texOffs(58, 87).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1866F, 0.0F, 1.5708F, -2.3562F));

		PartDefinition hexadecagon_r213 = wheel8.addOrReplaceChild("hexadecagon_r213",
				CubeListBuilder.create().texOffs(54, 87).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1763F, 0.0F, 1.5708F, 3.1416F));

		PartDefinition hexadecagon_r214 = wheel8.addOrReplaceChild("hexadecagon_r214",
				CubeListBuilder.create().texOffs(50, 87).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1866F, 0.0F, 1.5708F, 2.3562F));

		PartDefinition hexadecagon_r215 = wheel8.addOrReplaceChild("hexadecagon_r215",
				CubeListBuilder.create().texOffs(28, 87).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1763F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition hexadecagon_r216 = wheel8.addOrReplaceChild("hexadecagon_r216",
				CubeListBuilder.create().texOffs(66, 5).addBox(0.0442F, -1.8264F, -0.7001F, 0.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1037F, -1.2573F, 0.1099F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r217 = wheel8.addOrReplaceChild("hexadecagon_r217",
				CubeListBuilder.create().texOffs(24, 87).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1866F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r218 = wheel8.addOrReplaceChild("hexadecagon_r218",
				CubeListBuilder.create().texOffs(20, 87).addBox(-0.7788F, -4.0221F, -0.314F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1163F, 0.1763F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r219 = wheel8.addOrReplaceChild("hexadecagon_r219",
				CubeListBuilder.create().texOffs(80, 90)
						.addBox(3.1152F, -4.5842F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 90)
						.addBox(3.1152F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 80)
						.addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 62)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.785F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r220 = wheel8.addOrReplaceChild("hexadecagon_r220", CubeListBuilder.create()
				.texOffs(74, 90).addBox(3.1152F, -4.5842F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(102, 90).addBox(3.1683F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 26).addBox(3.1152F, 3.248F, -0.845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(98, 74).addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 82).addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 59).addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.8048F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r221 = wheel8.addOrReplaceChild("hexadecagon_r221",
				CubeListBuilder.create().texOffs(102, 88)
						.addBox(3.1683F, 3.779F, -0.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 80)
						.addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.8048F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r222 = wheel8.addOrReplaceChild("hexadecagon_r222",
				CubeListBuilder.create().texOffs(4, 101).addBox(-0.5486F, 0.6954F, 0.4309F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.201F, 0.0878F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition hexadecagon_r223 = wheel8.addOrReplaceChild("hexadecagon_r223",
				CubeListBuilder.create().texOffs(0, 101).addBox(-0.5486F, -0.7486F, 0.1686F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.201F, 0.0878F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon_r224 = wheel8.addOrReplaceChild("hexadecagon_r224",
				CubeListBuilder.create().texOffs(100, 100).addBox(-0.5486F, -2.183F, 0.4788F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.201F, 0.0878F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition hexadecagon_r225 = wheel8.addOrReplaceChild("hexadecagon_r225",
				CubeListBuilder.create().texOffs(100, 98).addBox(-0.5486F, -3.3895F, 1.3144F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.201F, 0.0878F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r226 = wheel8.addOrReplaceChild("hexadecagon_r226",
				CubeListBuilder.create().texOffs(100, 96).addBox(-0.5486F, 1.929F, 1.2259F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.665F, 0.201F, 0.0878F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r227 = wheel8.addOrReplaceChild("hexadecagon_r227",
				CubeListBuilder.create().texOffs(98, 86)
						.addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 68)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.785F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition hexadecagon_r228 = wheel8.addOrReplaceChild("hexadecagon_r228",
				CubeListBuilder.create().texOffs(98, 71)
						.addBox(3.1152F, -1.155F, 3.5843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 56)
						.addBox(3.1152F, -1.155F, -4.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.785F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r229 = wheel8.addOrReplaceChild("hexadecagon_r229",
				CubeListBuilder.create().texOffs(102, 84).addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.8048F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition hexadecagon_r230 = wheel8.addOrReplaceChild("hexadecagon_r230",
				CubeListBuilder.create().texOffs(102, 72).addBox(3.1683F, -0.7524F, -4.956F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0958F, 0.1384F, 3.8048F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition bone = wheel4.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 12)
				.addBox(-8.0556F, 0.1111F, -8.1111F, 3.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 12)
				.addBox(-8.0556F, 0.1111F, 1.8889F, 3.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
				.addBox(-7.3889F, 1.1111F, -2.1111F, 2.0F, 5.0F, 4.6667F, new CubeDeformation(0.0F)).texOffs(0, 26)
				.addBox(4.9444F, 0.1111F, 1.8889F, 3.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 40)
				.addBox(5.6111F, 1.1111F, -2.1111F, 2.0F, 5.0F, 4.6667F, new CubeDeformation(0.0F)).texOffs(18, 26)
				.addBox(4.9444F, 0.1111F, -8.1111F, 3.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 12)
				.addBox(4.9444F, -9.8889F, -8.1111F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 44)
				.addBox(5.6111F, -9.3889F, -2.1111F, 2.0F, 1.0F, 4.6667F, new CubeDeformation(0.0F)).texOffs(36, 20)
				.addBox(4.9444F, -9.8889F, 1.8889F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 28)
				.addBox(-8.0556F, -9.8889F, 1.8889F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 44)
				.addBox(-7.3889F, -9.3889F, -2.1111F, 2.0F, 1.0F, 4.6667F, new CubeDeformation(0.0F)).texOffs(36, 36)
				.addBox(-8.0556F, -9.8889F, -8.1111F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 49)
				.addBox(5.4444F, -7.8889F, 3.8889F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 59)
				.addBox(5.4444F, -7.8889F, -6.1111F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
				.addBox(-7.5556F, -7.8889F, -6.1111F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 64)
				.addBox(-7.5556F, -7.8889F, 3.8889F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.1485F, 0.967F, 6.8351F));

		PartDefinition blade = wheel4.addOrReplaceChild("blade", CubeListBuilder.create(),
				PartPose.offset(0.0519F, -2.6936F, 7.1454F));

		PartDefinition hexadecagon_r231 = blade.addOrReplaceChild("hexadecagon_r231",
				CubeListBuilder.create().texOffs(111, 120).mirror()
						.addBox(19.5F, -1.5F, -0.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -26.0F, -0.5F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition hexadecagon_r232 = blade.addOrReplaceChild("hexadecagon_r232",
				CubeListBuilder.create().texOffs(111, 120).mirror()
						.addBox(19.5F, -2.5F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -22.0F, -0.5F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition hexadecagon_r233 = blade.addOrReplaceChild("hexadecagon_r233",
				CubeListBuilder.create().texOffs(114, 120).mirror()
						.addBox(22.5F, -1.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -21.0F, -0.5F, 1.5708F, 0.0F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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