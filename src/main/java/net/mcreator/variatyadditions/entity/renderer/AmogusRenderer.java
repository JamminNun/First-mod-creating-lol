package net.mcreator.variatyadditions.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.variatyadditions.entity.AmogusEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AmogusRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AmogusEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelamogus(), 0.3f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("variaty_additions:textures/amogus.png");
					}
				};
			});
		}
	}

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
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
