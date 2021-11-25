
package net.mcreator.variatyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.variatyadditions.procedures.RingOfSwiftnessItemInInventoryTickProcedure;
import net.mcreator.variatyadditions.itemgroup.RingsItemGroup;
import net.mcreator.variatyadditions.VariatyAdditionsModElements;

import java.util.Map;
import java.util.HashMap;

@VariatyAdditionsModElements.ModElement.Tag
public class RingOfSwiftnessItem extends VariatyAdditionsModElements.ModElement {
	@ObjectHolder("variaty_additions:ring_of_swiftness")
	public static final Item block = null;
	public RingOfSwiftnessItem(VariatyAdditionsModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RingsItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("ring_of_swiftness");
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

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				RingOfSwiftnessItemInInventoryTickProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
