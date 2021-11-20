
package net.mcreator.testmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.testmod.itemgroup.MoreMinecraftCreativeTabItemGroup;
import net.mcreator.testmod.TestmodModElements;

@TestmodModElements.ModElement.Tag
public class UraniumNuggetRecipe1Item extends TestmodModElements.ModElement {
	@ObjectHolder("testmod:uranium_nugget_recipe_1")
	public static final Item block = null;
	public UraniumNuggetRecipe1Item(TestmodModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreMinecraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("uranium_nugget_recipe_1");
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
