package net.mcreator.variatyadditions.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.variatyadditions.VariatyAdditionsMod;

import java.util.Map;
import java.util.Collection;

public class OnionRingsFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure OnionRingsFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.GLOWING)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check(entity)) >= 0)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.GLOWING, (int) 300, (int) 2));
		}
	}
}
