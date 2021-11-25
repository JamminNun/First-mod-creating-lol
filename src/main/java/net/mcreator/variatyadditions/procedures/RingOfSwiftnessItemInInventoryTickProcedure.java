package net.mcreator.variatyadditions.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.variatyadditions.item.RingOfSwiftnessItem;
import net.mcreator.variatyadditions.VariatyAdditionsMod;

import java.util.Map;

public class RingOfSwiftnessItemInInventoryTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure RingOfSwiftnessItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == RingOfSwiftnessItem.block)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 10, (int) 0, (true), (true)));
		}
	}
}
