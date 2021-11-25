package net.mcreator.variatyadditions.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.variatyadditions.item.RingOfHealingItem;
import net.mcreator.variatyadditions.VariatyAdditionsMod;

import java.util.Map;

public class RingOfHealingItemInInventoryTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure RingOfHealingItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getPersistentData().getDouble("VAringofhealing")) == 0)
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == RingOfHealingItem.block))) {
			entity.getPersistentData().putDouble("VAringofhealing", 60);
		} else {
			entity.getPersistentData().putDouble("VAringofhealing", ((entity.getPersistentData().getDouble("VAringofhealing")) - 1));
		}
		if (((entity.getPersistentData().getDouble("VAringofhealing")) == 1)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) + 2));
		}
	}
}
