
package net.mcreator.testmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.testmod.item.UraniumIngotItem;
import net.mcreator.testmod.VariatyAdditionsModElements;

@VariatyAdditionsModElements.ModElement.Tag
public class MoreMinecraftCreativeTabItemGroup extends VariatyAdditionsModElements.ModElement {
	public MoreMinecraftCreativeTabItemGroup(VariatyAdditionsModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_minecraft_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(UraniumIngotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
