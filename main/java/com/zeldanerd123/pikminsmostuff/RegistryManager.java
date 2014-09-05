package com.zeldanerd123.pikminsmostuff;

import com.zeldanerd123.pikminsmostuff.blocks.treestuff.LeafBlocks;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.LogBlocks;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.PlankBlocks;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.SapplingBlocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegistryManager {
	public static void MainClass() {
		addItemRegistery();
		addBlockRegistery();
		addWorldGenRegistery();
	}

	public static void addWorldGenRegistery() {
		GameRegistry.registerWorldGenerator(PikminsMoStuff.worldGen, 1);
		
	}

	public static void addItemRegistery() {
		GameRegistry.registerItem(PikminsMoStuff.Necromite, "necromite");
		GameRegistry.registerItem(PikminsMoStuff.Pearl, "pearl");
		GameRegistry.registerItem(PikminsMoStuff.Ruby, "ruby");
			//Weapons, tools, Armour
		GameRegistry.registerItem(PikminsMoStuff.NecromiteSword, "necromite_sword");
		GameRegistry.registerItem(PikminsMoStuff.NecromiteAxe, "necromite_axe");
		GameRegistry.registerItem(PikminsMoStuff.NecromitePickaxe, "necromite_pickaxe");
		GameRegistry.registerItem(PikminsMoStuff.NecromiteShovel, "necromite_shovel");
		GameRegistry.registerItem(PikminsMoStuff.NecromiteHoe, "necromite_hoe");
		GameRegistry.registerItem(PikminsMoStuff.NecromiteHelm, "necromite_helmet");
		GameRegistry.registerItem(PikminsMoStuff.NecromiteChest, "necromite_chestplate");
		GameRegistry.registerItem(PikminsMoStuff.NecromiteLeggings, "necromite_leggings");
		GameRegistry.registerItem(PikminsMoStuff.NecromiteBoots, "necromite_boots");
		
		GameRegistry.registerItem(PikminsMoStuff.RubySword, "ruby_sword");
		GameRegistry.registerItem(PikminsMoStuff.RubyAxe, "ruby_axe");
		GameRegistry.registerItem(PikminsMoStuff.RubyPickaxe, "ruby_pickaxe");
		GameRegistry.registerItem(PikminsMoStuff.RubyShovel, "ruby_shovel");
		GameRegistry.registerItem(PikminsMoStuff.RubyHoe, "ruby_hoe");
		GameRegistry.registerItem(PikminsMoStuff.RubyHelm, "ruby_helmet");
		GameRegistry.registerItem(PikminsMoStuff.RubyChest, "ruby_chestplate");
		GameRegistry.registerItem(PikminsMoStuff.RubyLeggings, "ruby_leggings");
		GameRegistry.registerItem(PikminsMoStuff.RubyBoots, "ruby_boots");
	}

	public static void addBlockRegistery() {
		GameRegistry.registerBlock(PikminsMoStuff.ChromeOre, "chrome_ore");
		GameRegistry.registerBlock(PikminsMoStuff.SilverOre, "silver_ore");
		GameRegistry.registerBlock(PikminsMoStuff.Endore, "endore");
		
		GameRegistry.registerBlock(PikminsMoStuff.EnderCrystal, "ender_crystal");
	   	GameRegistry.registerBlock(PikminsMoStuff.Starstone, "starstone");
		GameRegistry.registerBlock(PikminsMoStuff.IgneousRock, "igneous_rock");
		GameRegistry.registerBlock(PikminsMoStuff.NecromiteOre, "necromite_ore");
		GameRegistry.registerBlock(PikminsMoStuff.RubyOre, "ruby_ore");
		
		
		GameRegistry.registerBlock(PikminsMoStuff.autumnLogTiles, "autumn_logtiles");
		GameRegistry.registerBlock(PikminsMoStuff.AutumnWoodTiles, "autumn_woodtiles");
		
		GameRegistry.registerBlock(PikminsMoStuff.autumnLogStairs, "autumn_logStairs");
		
		GameRegistry.registerBlock(PikminsMoStuff.autumnwoodPlanksStairs, "autumn_planksstairs");
		GameRegistry.registerBlock(PikminsMoStuff.autumnwoodPlanksSlabs, "autumn_plankslabs");
		GameRegistry.registerBlock(PikminsMoStuff.autumnwoodLogSlabs, "autumn_logslabs");
		GameRegistry.registerBlock(PikminsMoStuff.blockLogs, LogBlocks.class, PikminsMoStuff.blockLogs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(PikminsMoStuff.blockleaves, LeafBlocks.class, PikminsMoStuff.blockleaves.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(PikminsMoStuff.blockSaplings, SapplingBlocks.class, PikminsMoStuff.blockSaplings.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(PikminsMoStuff.blockPlanks, PlankBlocks.class, PikminsMoStuff.blockPlanks.getUnlocalizedName().substring(5));

		
		
	}
}
