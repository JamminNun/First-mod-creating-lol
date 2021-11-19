
package net.mcreator.testmod.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.testmod.item.UraniumIngotItem;

@Mod.EventBusSubscriber
public class UraniumIngotFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == UraniumIngotItem.block)
			event.setBurnTime(60000);
	}
}
