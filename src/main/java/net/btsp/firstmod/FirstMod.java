package net.btsp.firstmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.btsp.firstmod.item.ModItems.registerModItems;

public class FirstMod implements ModInitializer {
	public static String MOD_ID = "first-mod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("first-mod");

	@Override
	public void onInitialize() {
		registerModItems();
	}
}