
package net.mcreator.variatyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.variatyadditions.procedures.OnionRingsFoodEatenProcedure;
import net.mcreator.variatyadditions.VariatyAdditionsModElements;

import java.util.Map;
import java.util.HashMap;

@VariatyAdditionsModElements.ModElement.Tag
public class OnionRingsItem extends VariatyAdditionsModElements.ModElement {
	@ObjectHolder("variaty_additions:onion_rings")
	public static final Item block = null;
	public OnionRingsItem(VariatyAdditionsModElements instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.RARE)
					.food((new Food.Builder()).hunger(2).saturation(0.3f).build()));
			setRegistryName("onion_rings");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				OnionRingsFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
