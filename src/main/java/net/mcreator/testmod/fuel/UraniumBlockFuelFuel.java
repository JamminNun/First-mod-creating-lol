
package net.mcreator.testmod.fuel;

@Mod.EventBusSubscriber
public class UraniumBlockFuelFuel {

	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == UraniumBlockItem.block)
			event.setBurnTime(600000);
	}

}
