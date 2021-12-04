
package net.mcreator.variatyadditions.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.variatyadditions.VariatyAdditionsModElements;

import java.util.List;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@VariatyAdditionsModElements.ModElement.Tag
public class Wings1Item extends VariatyAdditionsModElements.ModElement {
	@ObjectHolder("variaty_additions:wings_1_helmet")
	public static final Item helmet = null;
	@ObjectHolder("variaty_additions:wings_1_chestplate")
	public static final Item body = null;
	@ObjectHolder("variaty_additions:wings_1_leggings")
	public static final Item legs = null;
	@ObjectHolder("variaty_additions:wings_1_boots")
	public static final Item boots = null;
	public Wings1Item(VariatyAdditionsModElements instance) {
		super(instance, 121);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "wings_1";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modelwings5().body;
				armorModel.bipedLeftArm = new Modelwings5().leftarm;
				armorModel.bipedRightArm = new Modelwings5().rightarm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("noriu isnykt nx"));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "variaty_additions:textures/wings1.png";
			}
		}.setRegistryName("wings_1_chestplate"));
	}
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
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
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
