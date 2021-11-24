// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelamogus extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public Modelamogus() {
		texWidth = 32;
		texHeight = 32;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		body.texOffs(0, 0).addBox(-3.0F, -11.0F, -2.0F, 6.0F, 8.0F, 3.0F, 0.0F, false);
		body.texOffs(18, 0).addBox(-2.0F, -10.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		body.texOffs(0, 11).addBox(-2.0F, -10.0F, 1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setPos(0.0F, 24.0F, 0.0F);
		leftleg.texOffs(12, 11).addBox(1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setPos(0.0F, 24.0F, 0.0F);
		rightleg.texOffs(9, 17).addBox(-3.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}