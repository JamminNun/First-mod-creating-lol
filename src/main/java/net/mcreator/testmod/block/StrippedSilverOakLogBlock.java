
package net.mcreator.testmod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@TestmodModElements.ModElement.Tag
public class StrippedSilverOakLogBlock extends TestmodModElements.ModElement {

	@ObjectHolder("testmod:stripped_silver_oak_log")
	public static final Block block = null;

	public StrippedSilverOakLogBlock(TestmodModElements instance) {
		super(instance, 68);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MoreMinecraftCreativeTabItemGroup.tab))
				.setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 2f).setLightLevel(s -> 0).harvestLevel(2)
					.harvestTool(ToolType.AXE).setRequiresTool());

			setRegistryName("stripped_silver_oak_log");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 5;
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
