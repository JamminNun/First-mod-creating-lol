
package net.mcreator.variatyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.variatyadditions.VariatyAdditionsModElements;

import java.util.List;

@VariatyAdditionsModElements.ModElement.Tag
public class BritishFishSticksItem extends VariatyAdditionsModElements.ModElement {
	@ObjectHolder("variaty_additions:british_fish_sticks")
	public static final Item block = null;
	public BritishFishSticksItem(VariatyAdditionsModElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(5).saturation(2.5f).build()));
			setRegistryName("british_fish_sticks");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Bread but better"));
		}
	}
}
