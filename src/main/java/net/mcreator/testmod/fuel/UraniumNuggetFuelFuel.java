
package net.mcreator.testmod.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.testmod.item.UraniumNuggetRecipe1Item;

@Mod.EventBusSubscriber
public class UraniumNuggetFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == UraniumNuggetRecipe1Item.block)
			event.setBurnTime(6000);
	}
}
