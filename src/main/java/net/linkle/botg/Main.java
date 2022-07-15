package net.linkle.botg;

import net.fabricmc.api.ModInitializer;
import net.linkle.botg.init.LoA_Blocks;
import net.linkle.botg.init.LoA_Items;
import net.minecraft.util.Identifier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
    public static final String MOD_ID = "botg";
	public static final Logger LOGGER = LogManager.getLogger("LoA:BoTG");

	@Override
	public void onInitialize() {
		LoA_Items.initialize();
		LoA_Blocks.initialize();
		LOGGER.info("If you see this, everything is running at least as okay as a 3-legged hamster on amphetamines.");
	}
	
	public static Identifier makeId(String id) {
	    return new Identifier(MOD_ID, id);
	}
}
