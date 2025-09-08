package net.feuermagie.pyromagie;

import net.fabricmc.api.ModInitializer;

import net.feuermagie.pyromagie.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FeuerMagie implements ModInitializer {
	public static final String MOD_ID = "feuer-magie";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}