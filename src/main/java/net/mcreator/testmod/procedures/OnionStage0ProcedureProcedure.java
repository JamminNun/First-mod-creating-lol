package net.mcreator.testmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.testmod.block.OnionStage2Block;
import net.mcreator.testmod.block.OnionStage1Block;
import net.mcreator.testmod.TestmodMod;

import java.util.Map;

public class OnionStage0ProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TestmodMod.LOGGER.warn("Failed to load dependency x for procedure OnionStage0Procedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TestmodMod.LOGGER.warn("Failed to load dependency y for procedure OnionStage0Procedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TestmodMod.LOGGER.warn("Failed to load dependency z for procedure OnionStage0Procedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TestmodMod.LOGGER.warn("Failed to load dependency world for procedure OnionStage0Procedure!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!(world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z))))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getLightValue()) > 8)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OnionStage1Block.block.getDefaultState(), 3);
			}
		}
		if ((world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z)))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getLightValue()) > 5)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OnionStage2Block.block.getDefaultState(), 3);
			}
		}
	}
}
