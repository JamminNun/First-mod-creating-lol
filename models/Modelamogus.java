// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelamogus extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public Modelamogus() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -11.0F, -2.0F, 6.0F, 8.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(18, 0).addBox(-2.0F, -10.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 11).addBox(-2.0F, -10.0F, 1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftleg.setTextureOffset(12, 11).addBox(1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightleg.setTextureOffset(9, 17).addBox(-3.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
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