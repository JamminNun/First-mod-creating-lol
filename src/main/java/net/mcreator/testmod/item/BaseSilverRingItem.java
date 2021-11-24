
package net.mcreator.testmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.testmod.itemgroup.MoreMinecraftCreativeTabItemGroup;
import net.mcreator.testmod.VariatyAdditionsModElements;

@VariatyAdditionsModElements.ModElement.Tag
public class BaseSilverRingItem extends VariatyAdditionsModElements.ModElement {
	@ObjectHolder("variaty_additions:base_silver_ring")
	public static final Item block = null;
	public BaseSilverRingItem(VariatyAdditionsModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreMinecraftCreativeTabItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("base_silver_ring");
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
