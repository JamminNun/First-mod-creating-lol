
package net.mcreator.variatyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.variatyadditions.itemgroup.MoreMinecraftCreativeTabItemGroup;
import net.mcreator.variatyadditions.VariatyAdditionsModElements;

@VariatyAdditionsModElements.ModElement.Tag
public class SilverIngotItem extends VariatyAdditionsModElements.ModElement {
	@ObjectHolder("variaty_additions:silver_ingot")
	public static final Item block = null;
	public SilverIngotItem(VariatyAdditionsModElements instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreMinecraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("silver_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
