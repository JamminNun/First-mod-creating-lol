
package net.mcreator.testmod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@TestmodModElements.ModElement.Tag
public class UraniumBlockBlock extends TestmodModElements.ModElement {

	@ObjectHolder("testmod:uranium_block")
	public static final Block block = null;

	public UraniumBlockBlock(TestmodModElements instance) {
		super(instance, 64);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MoreMinecraftCreativeTabItemGroup.tab))
				.setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(5f, 3f).setLightLevel(s -> 0).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());

			setRegistryName("uranium_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
