// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwings5 extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;

	public Modelwings5() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.0522F, 3.6651F, -0.5428F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-4.6F, 0.0F, 4.0F);
		body.addChild(bone);
		setRotationAngle(bone, 2.7752F, 0.5553F, 2.5125F);
		bone.setTextureOffset(0, 7).addBox(-12.8737F, 0.6799F, 5.0213F, 13.0F, 6.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-11.058F, 1.2866F, 8.7719F);
		body.addChild(bone2);
		setRotationAngle(bone2, 0.5457F, 0.3193F, 1.0936F);
		bone2.setTextureOffset(18, 14).addBox(-3.9967F, -7.0052F, -0.4508F, 8.0F, 14.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(10.969F, 1.2866F, 8.7801F);
		body.addChild(bone3);
		setRotationAngle(bone3, 2.5754F, 0.3293F, 2.0414F);
		bone3.setTextureOffset(0, 14).addBox(-3.9919F, -7.0128F, -0.6313F, 8.0F, 14.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-4.6F, 0.0F, 4.25F);
		body.addChild(bone4);
		setRotationAngle(bone4, 0.3663F, 0.5553F, 0.6291F);
		bone4.setTextureOffset(0, 0).addBox(-6.4777F, -3.0129F, -0.6796F, 13.0F, 6.0F, 1.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 24.0F, 0.0F);
		leftarm.setTextureOffset(2, 32).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-3.0F, 24.0F, 0.0F);
		rightarm.setTextureOffset(12, 32).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}