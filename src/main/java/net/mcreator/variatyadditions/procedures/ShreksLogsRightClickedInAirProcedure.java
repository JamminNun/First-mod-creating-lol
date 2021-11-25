package net.mcreator.variatyadditions.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;

import net.mcreator.variatyadditions.VariatyAdditionsMod;

import java.util.Map;

public class ShreksLogsRightClickedInAirProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VariatyAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure ShreksLogsRightClickedInAir!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (((Math.random() < 1) && (Math.random() > 0.9))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("\u201COgres are like onions.\u201D \u2013 Shrek"), ChatType.SYSTEM,
							Util.DUMMY_UUID);
			}
		} else {
			if (((Math.random() < 0.9) && (Math.random() > 0.8))) {
				if (!world.isRemote()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().func_232641_a_(
								new StringTextComponent(
										"\u201CSomeday, I will repay you. Unless, of course, I can\u2019t find you or if I forget.\u201D"),
								ChatType.SYSTEM, Util.DUMMY_UUID);
				}
			} else {
				if (((Math.random() < 0.8) && (Math.random() > 0.7))) {
					if (!world.isRemote()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().func_232641_a_(new StringTextComponent("\u201CWhat are you doing in my swamp!?\u201D - Shrek"),
									ChatType.SYSTEM, Util.DUMMY_UUID);
					}
				} else {
					if (((Math.random() < 0.7) && (Math.random() > 0.6))) {
						if (!world.isRemote()) {
							MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
							if (mcserv != null)
								mcserv.getPlayerList().func_232641_a_(new StringTextComponent(
										"\u201CThere\u2019s a stack of freshly made waffles in the middle of the forest! Don\u2019t you find that a wee bit suspicious?\u201D \u2013 Shrek"),
										ChatType.SYSTEM, Util.DUMMY_UUID);
						}
					} else {
						if (((Math.random() < 0.6) && (Math.random() > 0.5))) {
							if (!world.isRemote()) {
								MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
								if (mcserv != null)
									mcserv.getPlayerList().func_232641_a_(new StringTextComponent(
											"\u201CWell my stomach aches and my palms just got sweaty, must be a high school.\u201D \u2013 Shrek"),
											ChatType.SYSTEM, Util.DUMMY_UUID);
							}
						}
					}
				}
			}
		}
	}
}
