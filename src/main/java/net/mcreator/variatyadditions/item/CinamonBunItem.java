
package net.mcreator.variatyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.variatyadditions.itemgroup.MoreMinecraftCreativeTabItemGroup;
import net.mcreator.variatyadditions.VariatyAdditionsModElements;

import java.util.List;

@VariatyAdditionsModElements.ModElement.Tag
public class CinamonBunItem extends VariatyAdditionsModElements.ModElement {
	@ObjectHolder("variaty_additions:cinamon_bun")
	public static final Item block = null;
	public CinamonBunItem(VariatyAdditionsModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MoreMinecraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(3.9999999999999996f).setAlwaysEdible().build()));
			setRegistryName("cinamon_bun");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 28;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Very tasty nad still warm"));
		}
	}
}
