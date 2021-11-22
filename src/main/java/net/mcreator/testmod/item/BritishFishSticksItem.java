
package net.mcreator.testmod.item;

@TestmodModElements.ModElement.Tag
public class BritishFishSticksItem extends TestmodModElements.ModElement {

	@ObjectHolder("testmod:british_fish_sticks")
	public static final Item block = null;

	public BritishFishSticksItem(TestmodModElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.5f)

							.build()));
			setRegistryName("british_fish_sticks");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Bread but better"));
		}

	}

}
