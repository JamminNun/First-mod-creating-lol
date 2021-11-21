package net.mcreator.testmod.procedures;

public class ShreksLogsRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TestmodMod.LOGGER.warn("Failed to load dependency world for procedure ShreksLogsRightClickedInAir!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");

		double Shrekone = 0;
		double ShrekTwo = 0;
		double ShrekThree = 0;
		double ShrekFour = 0;
		double ShrekFive = 0;
		Shrekone = (double) 1;
		ShrekTwo = (double) 0.5;
		ShrekThree = (double) 0.6;
		Shrekone = (double) 0.7;
		Shrekone = (double) 0.8;
		if ((Math.random() == Shrekone)) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("\u201COgres are like onions.\u201D \u2013 Shrek"), ChatType.SYSTEM,
							Util.DUMMY_UUID);
			}
		} else {
			if ((Math.random() == ShrekTwo)) {
				if (!world.isRemote()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().func_232641_a_(
								new StringTextComponent(
										"\u201CSomeday, I will repay you. Unless, of course, I can\u2019t find you or if I forget.\u201D"),
								ChatType.SYSTEM, Util.DUMMY_UUID);
				}
			} else {
				if ((Math.random() == ShrekThree)) {
					if (!world.isRemote()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().func_232641_a_(new StringTextComponent("\u201CWhat are you doing in my swamp!?\u201D - Shrek"),
									ChatType.SYSTEM, Util.DUMMY_UUID);
					}
				} else {
					if ((Math.random() == ShrekFour)) {
						if (!world.isRemote()) {
							MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
							if (mcserv != null)
								mcserv.getPlayerList().func_232641_a_(new StringTextComponent(
										"\u201CThere\u2019s a stack of freshly made waffles in the middle of the forest! Don\u2019t you find that a wee bit suspicious?\u201D \u2013 Shrek"),
										ChatType.SYSTEM, Util.DUMMY_UUID);
						}
					} else {
						if ((Math.random() == ShrekFive)) {
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
