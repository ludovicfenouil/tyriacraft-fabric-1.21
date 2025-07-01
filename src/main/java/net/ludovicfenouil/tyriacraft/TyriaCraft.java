package net.ludovicfenouil.tyriacraft;

import net.fabricmc.api.ModInitializer;

import net.ludovicfenouil.tyriacraft.block.TC_Blocks;
import net.ludovicfenouil.tyriacraft.item.TC_ItemGroups;
import net.ludovicfenouil.tyriacraft.item.TC_Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TyriaCraft implements ModInitializer {
	public static final String MOD_ID = "tyriacraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TC_ItemGroups.registerItemGroups();
		TC_Items.registerTC_Items();
		TC_Blocks.registerTC_Blocks();
	}
}