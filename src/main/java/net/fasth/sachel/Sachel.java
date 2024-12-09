package net.fasth.sachel;

import net.fabricmc.api.ModInitializer;

import net.fasth.sachel.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sachel implements ModInitializer {
	public static final String MOD_ID = "sachel";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}