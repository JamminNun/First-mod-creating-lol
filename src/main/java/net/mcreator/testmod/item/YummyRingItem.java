
package net.mcreator.testmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.testmod.procedures.YummyRingItemInInventoryTickProcedure;
import net.mcreator.testmod.itemgroup.MoreMinecraftCreativeTabItemGroup;
import net.mcreator.testmod.VariatyAdditionsModElements;

import java.util.Map;
import java.util.HashMap;

@VariatyAdditionsModElements.ModElement.Tag
public class YummyRingItem extends VariatyAdditionsModElements.ModElement {
	@ObjectHolder("variaty_additions:yummy_ring")
	public static final Item block = null;
	public YummyRingItem(VariatyAdditionsModElements instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreMinecraftCreativeTabItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("yummy_ring");
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
				$_dependencies.put("world", world);
				YummyRingItemInInventoryTickProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
