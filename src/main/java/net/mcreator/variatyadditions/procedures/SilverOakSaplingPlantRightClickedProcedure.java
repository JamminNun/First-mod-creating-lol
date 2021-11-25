package net.mcreator.variatyadditions.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.variatyadditions.VariatyAdditionsMod;

import java.util.Map;

public class SilverOakSaplingPlantRightClickedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure SilverOakSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure SilverOakSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure SilverOakSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure SilverOakSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure SilverOakSaplingPlantRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL)) {
			(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
			if ((Math.random() < 0.1)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("variaty_additions", "silver_oak_tree_1"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			}
		}
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL)) {
			(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)).shrink((int) 1);
			if ((Math.random() < 0.1)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("variaty_additions", "silver_oak_tree_1"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x - 2), (int) y, (int) (z - 2)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			}
		}
	}
}
