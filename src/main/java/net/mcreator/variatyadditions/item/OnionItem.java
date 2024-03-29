
package net.mcreator.variatyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.variatyadditions.itemgroup.MoreMinecraftCreativeTabItemGroup;
import net.mcreator.variatyadditions.VariatyAdditionsModElements;

@VariatyAdditionsModElements.ModElement.Tag
public class OnionItem extends VariatyAdditionsModElements.ModElement {
	@ObjectHolder("variaty_additions:onion")
	public static final Item block = null;
	public OnionItem(VariatyAdditionsModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MoreMinecraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.6f).build()));
			setRegistryName("onion");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
