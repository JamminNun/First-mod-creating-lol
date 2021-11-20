package net.mcreator.testmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.testmod.item.OnionSeedItem;
import net.mcreator.testmod.block.OnionStage0Block;
import net.mcreator.testmod.TestmodMod;

import java.util.Map;

public class OnionSeedRightClickedOnBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TestmodMod.LOGGER.warn("Failed to load dependency entity for procedure OnionSeedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TestmodMod.LOGGER.warn("Failed to load dependency x for procedure OnionSeedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TestmodMod.LOGGER.warn("Failed to load dependency y for procedure OnionSeedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TestmodMod.LOGGER.warn("Failed to load dependency z for procedure OnionSeedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TestmodMod.LOGGER.warn("Failed to load dependency world for procedure OnionSeedRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((Blocks.FARMLAND == (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), OnionStage0Block.block.getDefaultState(), 3);
			if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(OnionSeedItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
	}
}
