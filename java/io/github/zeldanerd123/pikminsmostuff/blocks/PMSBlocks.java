package io.github.zeldanerd123.pikminsmostuff.blocks;

import java.util.ArrayList;
import java.util.List;

import io.github.zeldanerd123.pikminsmostuff.creativeTabs.PMSCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PMSBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static Block RubyOre = new PMSBlock("ruby_ore", 
			Material.ROCK, 9f, 8f, "pickaxe", 2,PMSCreativeTab.pmsB);
	public static Block ChromeOre = new PMSBlock("chrome_ore", 
			Material.ROCK, 9f, 8f, "pickaxe", 1, PMSCreativeTab.pmsB);
	public static Block SilverOre =  new PMSBlock("silver_ore",
			Material.ROCK, 9f, 8f, "pickaxe", 1, PMSCreativeTab.pmsB);
	public static Block NecromiteOre =  new PMSBlock("necromite_ore",
			Material.IRON, 9f, 8f, "pickaxe", 1, PMSCreativeTab.pmsB);
	public static Block StarstoneOre = new PMSBlock("starstone_ore",
			Material.GROUND, 9f, 8f, "pickaxe", 1, PMSCreativeTab.pmsB).setLightLevel(6);
	public static Block IgneousRock =  new PMSBlock("igneous_rock",
			Material.ROCK, 5f, 2f, "pickaxe",0, PMSCreativeTab.pmsB);
	public static Block EnderCrystal = new PMSBlock("ender_crystal",
			Material.ROCK, 9f, 8f, "pickaxe", 1, PMSCreativeTab.pmsB);
	public static Block EndOre =  new PMSBlock("end_ore", Material.GROUND, 9f, 8f, "pickaxe", 1, PMSCreativeTab.pmsB);
	public static Block Marble =  new PMSBlock("marble",
			Material.ROCK, 3f, 5f, "pickaxe", 1, PMSCreativeTab.pmsB);
	public static Block MarblePolished =  new PMSBlock("marble_polished",
			Material.ROCK, 3f, 5f, "pickaxe", 1, PMSCreativeTab.pmsB);
	
	
	//for beacon
	public static Block RubyBlock = new PMSBlock("ruby_block",
			Material.ROCK, 9f, 8f, null, 0, PMSCreativeTab.pmsB).setLightLevel(0.9375F).setLightOpacity(1);
	public static Block NecromiteBlock  = new PMSBlock("necromite_block",
			Material.IRON, 9f, 8f, null, 0, PMSCreativeTab.pmsB).setLightOpacity(4);
	
	//building blocks
//	public static Block StarLamp;
	
	public static Block Amethyst = new PMSBlock("amethyst", Material.IRON, 9f, 8f, null, 0, PMSCreativeTab.pmsB);
	
}

