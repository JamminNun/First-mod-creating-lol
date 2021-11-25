package net.mcreator.variatyadditions.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.variatyadditions.block.SilverOakSaplingBlock;
import net.mcreator.variatyadditions.VariatyAdditionsMod;

import java.util.Map;

public class SilverOakLeavesBlockDestroyedByPlayerProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure SilverOakLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure SilverOakLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure SilverOakLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure SilverOakLeavesBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() < 0.067)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(SilverOakSaplingBlock.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
