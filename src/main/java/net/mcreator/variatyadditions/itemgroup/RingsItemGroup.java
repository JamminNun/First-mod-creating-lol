
package net.mcreator.variatyadditions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.variatyadditions.item.BaseSilverRingItem;
import net.mcreator.variatyadditions.VariatyAdditionsModElements;

@VariatyAdditionsModElements.ModElement.Tag
public class RingsItemGroup extends VariatyAdditionsModElements.ModElement {
	public RingsItemGroup(VariatyAdditionsModElements instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrings") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BaseSilverRingItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
