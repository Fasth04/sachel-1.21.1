package net.fasth.satchel;

import net.fabricmc.api.ModInitializer;

import net.fasth.satchel.item.ModItemGroups;
import net.fasth.satchel.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Satchel implements ModInitializer {
	public static final String MOD_ID = "satchel";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}