
package net.mcreator.testmod.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.testmod.block.UraniumBlockBlock;

@Mod.EventBusSubscriber
public class UraniumBlockFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == UraniumBlockBlock.block.asItem())
			event.setBurnTime(600000);
	}
}
