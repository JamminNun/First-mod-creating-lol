// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsilverchicken extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer leftwing;
	private final ModelRenderer rightwing;

	public Modelsilverchicken() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 14.0F, -1.5F);
		head.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(8, 14).addBox(-2.0F, -3.0F, -4.5F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 24).addBox(-2.0F, -5.0F, -2.5F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, 2.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-1.5F, 19.0F, 3.0F);
		rightleg.setTextureOffset(14, 24).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(1.5F, 19.0F, 3.0F);
		leftleg.setTextureOffset(20, 0).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		leftwing = new ModelRenderer(this);
		leftwing.setRotationPoint(3.0F, 13.0F, 2.0F);
		leftwing.setTextureOffset(14, 14).addBox(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

		rightwing = new ModelRenderer(this);
		rightwing.setRotationPoint(-3.0F, 13.0F, 2.0F);
		rightwing.setTextureOffset(0, 14).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftwing.render(matrixStack, buffer, packedLight, packedOverlay);
		rightwing.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}