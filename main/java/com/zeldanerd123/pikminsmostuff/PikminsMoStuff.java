package com.zeldanerd123.pikminsmostuff;


import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.EnumHelper;

import com.zeldanerd123.pikminsmostuff.biome.featured.trees.PmsLeaves;
import com.zeldanerd123.pikminsmostuff.biome.featured.trees.PmsLog;
import com.zeldanerd123.pikminsmostuff.biome.featured.trees.PmsPlank;
import com.zeldanerd123.pikminsmostuff.biome.featured.trees.PmsSapling;
//import com.zeldanerd123.pikminsmostuff.biome.featured.dimension.PmsChuckGen;
//import com.zeldanerd123.pikminsmostuff.biome.featured.dimension.PmsPortal;
//import com.zeldanerd123.pikminsmostuff.biome.featured.dimension.PmsProvider;
import com.zeldanerd123.pikminsmostuff.blocks.ore.AmethystOre;
import com.zeldanerd123.pikminsmostuff.blocks.ore.ChromeOre;
import com.zeldanerd123.pikminsmostuff.blocks.ore.EnderCrystal;
import com.zeldanerd123.pikminsmostuff.blocks.ore.Endore;
import com.zeldanerd123.pikminsmostuff.blocks.ore.IgneousRock;
import com.zeldanerd123.pikminsmostuff.blocks.ore.NecromiteOre;
import com.zeldanerd123.pikminsmostuff.blocks.ore.RubyOre;
import com.zeldanerd123.pikminsmostuff.blocks.ore.SilverOre;
import com.zeldanerd123.pikminsmostuff.blocks.ore.Starstone;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.LeafBlocks;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.LogBlocks;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.slabs.AutumnLogSlabs;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.slabs.AutumnPlanksSlabs;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.stairs.AutumnWoodLogStairs;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.stairs.AutumnWoodPlanksStairs;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.tiles.AutumnLogTiles;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.tiles.AutumnWoodTiles;
import com.zeldanerd123.pikminsmostuff.creativetabs.PikminsBlocks;
import com.zeldanerd123.pikminsmostuff.creativetabs.PikminsCombat;
import com.zeldanerd123.pikminsmostuff.creativetabs.PikminsDecoration;
import com.zeldanerd123.pikminsmostuff.creativetabs.PikminsItems;
import com.zeldanerd123.pikminsmostuff.creativetabs.PikminsTools;
import com.zeldanerd123.pikminsmostuff.items.Tools.NecromiteAxe;
import com.zeldanerd123.pikminsmostuff.items.Tools.NecromiteHoe;
import com.zeldanerd123.pikminsmostuff.items.Tools.NecromitePickaxe;
import com.zeldanerd123.pikminsmostuff.items.Tools.NecromiteShovel;
import com.zeldanerd123.pikminsmostuff.items.Tools.RubyAxe;
import com.zeldanerd123.pikminsmostuff.items.Tools.RubyHoe;
import com.zeldanerd123.pikminsmostuff.items.Tools.RubyPickaxe;
import com.zeldanerd123.pikminsmostuff.items.Tools.RubyShovel;
import com.zeldanerd123.pikminsmostuff.items.armors.RubyArmor;
import com.zeldanerd123.pikminsmostuff.items.armors.necromiteArmor;
import com.zeldanerd123.pikminsmostuff.items.materials.Endorite;
import com.zeldanerd123.pikminsmostuff.items.materials.Necromite;
import com.zeldanerd123.pikminsmostuff.items.materials.ObsidianShard;
import com.zeldanerd123.pikminsmostuff.items.materials.Pearl;
import com.zeldanerd123.pikminsmostuff.items.materials.Ruby;
import com.zeldanerd123.pikminsmostuff.items.materials.StartDust;
import com.zeldanerd123.pikminsmostuff.items.weapons.NecromiteSword;
import com.zeldanerd123.pikminsmostuff.items.weapons.RubySword;
import com.zeldanerd123.pikminsmostuff.lib.ProxyCommon;
import com.zeldanerd123.pikminsmostuff.lib.References;
import com.zeldanerd123.pikminsmostuff.world.gen.WorldGen;
import com.zeldanerd123.pikminsmostuff.RegistryManager;
import com.zeldanerd123.pikminsmostuff.CraftManager;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = References.ModId,
	version = References.version, name = References.modname,
		canBeDeactivated = true)
public class PikminsMoStuff
{
	public static final String MODID = References.ModId;

		//crativetabs
		public static CreativeTabs PikminsBlocks = 
				new PikminsBlocks(CreativeTabs.getNextID(), 
						"PikminsBlocks");
		
		public static CreativeTabs PikminsItems= 
			new PikminsItems(CreativeTabs.getNextID(),
					"PikminsItems");	

		public static CreativeTabs PikminsDecration =
			new PikminsDecoration(CreativeTabs.getNextID(), 
				"PikminsDecoration");
		
		public static CreativeTabs PikminsCombat =
				new PikminsCombat(CreativeTabs.getNextID(), 
					"PikminsCombat");
		
		public static CreativeTabs PikminsTools =
				new PikminsTools(CreativeTabs.getNextID(), 
					"PikminsTools");
	//world gen
		public static WorldGen worldGen = new WorldGen();
		
@SidedProxy (clientSide = References.client,
				serverSide = References.common)
public static ProxyCommon proxy;

/*public static Item Bronze;*/ 

	 //blocks
	 	public static Block ChromeOre;
	 	
		
	 	public static Block SilverOre;
	 			
		
	 	public static Block EndOre;
	 	
		
	 	public static Block NecromiteOre;
	 		
		
	 	public static Block StarstoneOre;
	 		
		
	 	public static Block IgneousRock;
	 	
		
		public static Block EnderCrystal;
			
		
		public static Block RubyOre;
			
		
		public static Block Amethyst; 
			
		//tree blocks stuff
			//Autumn Oak	 

		public static Block blockLogs;
		
		
		public static Block blockleaves;
			
		
		public static Block blockSaplings;
			
		
		public static Block blockPlanks;
			
			
		public static BlockStairs autumnLogStairs;
		
	
		public static Block AutumnWoodTiles;
		
	
		public static BlockStairs autumnwoodPlanksStairs;
		
	
		public static Block autumnwoodPlanksSlabs;
		
	
		public static Block autumnwoodLogSlabs;
	
	
		public static Block autumnLogTiles;
			


	
		//items 
		public static Item Necromite = new Necromite(600);
		
		public static Item Pearl = new Pearl(601);
		
		public static Item Ruby = new Ruby(602);
		
		public static Item StarDust = new StartDust(603);
		
		public static Item Endorite = new Endorite(604);
		
		public static Item obsidianShard = new ObsidianShard(Material.rock); 
		//weapons
		
		//public static ToolMaterial material = EnumHelper.addToolMaterial("name", int harvestLevel, int maxUses, float efficiency, float damage, int enchantability)
		
		//harvest and damage 0 == wooden tools
		//harvest and damage 1 == stone tools
		//harvest and damage 2 == iron tools
		//harvest and damage 3 == diamond tools
			//Necromite
		
		public static ToolMaterial necromiteToolMaterial = EnumHelper.addToolMaterial("Necromite", 2, 500, 2f, 3f, 20);
			
		
		public static Item NecromiteSword = new NecromiteSword(5, necromiteToolMaterial);
		public static Item NecromiteAxe = new NecromiteAxe(1, necromiteToolMaterial);
		public static Item NecromitePickaxe = new NecromitePickaxe(2, necromiteToolMaterial);
		public static Item NecromiteShovel = new NecromiteShovel(3, necromiteToolMaterial);
		public static Item NecromiteHoe = new NecromiteHoe(4, necromiteToolMaterial);
		
			//Ruby
		public static ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("Ruby", 4, 450, 4f, 4f, 20);
		
		public static Item RubySword = new RubySword(9, rubyToolMaterial);
		public static Item RubyAxe = new RubyAxe(5, rubyToolMaterial);
		public static Item RubyPickaxe = new RubyPickaxe(6, rubyToolMaterial);
		public static Item RubyShovel = new RubyShovel(7, rubyToolMaterial);
		public static Item RubyHoe = new RubyHoe(8, rubyToolMaterial);
		
		
		
		//Armour
			//Necromite
		public static ArmorMaterial necromiteArmour = EnumHelper.addArmorMaterial("Necromite", 340, new int[]{1, 5, 5, 1}, 30);
		
		public static Item NecromiteHelm = new necromiteArmor(1 ,necromiteArmour, 0,0, "Necromite").setUnlocalizedName("NecromiteHelm").setCreativeTab(PikminsCombat).setTextureName(MODID +":necromite_helmet");
		
		public static Item NecromiteChest = new necromiteArmor(2, necromiteArmour, 0,1, "Necromite").setUnlocalizedName("NecromiteChest").setCreativeTab(PikminsCombat).setTextureName(MODID +":necromite_chestplate");
		
		public static Item NecromiteLeggings = new necromiteArmor(3, necromiteArmour, 0,2, "Necromite").setUnlocalizedName("NecromiteLeggings").setCreativeTab(PikminsCombat).setTextureName(MODID +":necromite_leggings");
		
		public static Item NecromiteBoots = new necromiteArmor(4, necromiteArmour, 0,3, "Necromite").setUnlocalizedName("NecromiteBoots").setCreativeTab(PikminsCombat).setTextureName(MODID +":necromite_boots");
		
				//Ruby
		
		public static ArmorMaterial RubyArmour = EnumHelper.addArmorMaterial("Ruby", 340, new int[]{2, 6, 5, 2}, 30);
		
		
		public static Item RubyHelm = new RubyArmor(5, RubyArmour, 0,0, "Necromite").setUnlocalizedName("RubyHelm").setCreativeTab(PikminsCombat).setTextureName(MODID +":ruby_helmet");
		
		public static Item RubyChest = new RubyArmor(6, RubyArmour, 0,1, "Ruby").setUnlocalizedName("RubyChest").setCreativeTab(PikminsCombat).setTextureName(MODID +":ruby_chestplate");
		
		public static Item RubyLeggings = new RubyArmor(7, RubyArmour, 0,2, "Ruby").setUnlocalizedName("RubyLeggings").setCreativeTab(PikminsCombat).setTextureName(MODID +":ruby_leggings");
		
		public static Item RubyBoots = new RubyArmor(8, RubyArmour, 0,3, "Ruby").setUnlocalizedName("RubyBoots").setCreativeTab(PikminsCombat).setUnlocalizedName("RubyBoots").setTextureName(MODID +":ruby_boots");

		/*
		 ---------------------------------Dimension Stuff---------------------------------------
		 */
			
	    //public static final PmsPortal pmsPortal = (PmsPortal)Block.blockRegistry.getObject("portal");			
			
		/*
		 -----------------------------End Dimension Stuff---------------------------------------
		*/
		


@EventHandler
public void init(FMLInitializationEvent event){
	ChromeOre = new ChromeOre(500, Material.rock);
	SilverOre = new SilverOre(501, Material.rock);	
	EndOre = new Endore(502, Material.rock);
	NecromiteOre = new NecromiteOre(503, Material.rock);
	StarstoneOre = new Starstone(504, Material.rock);
	IgneousRock = new IgneousRock(505, Material.rock);
	EnderCrystal = new EnderCrystal(506, Material.rock);
	RubyOre = new RubyOre(507, Material.rock);
	Amethyst = new AmethystOre(Material.rock);
	
	blockLogs = new PmsLog().setBlockName("Log").setCreativeTab(PikminsBlocks);
	blockleaves = new PmsLeaves(Material.leaves).setBlockName("Leaves").setCreativeTab(PikminsBlocks);
	blockSaplings = new PmsSapling().setBlockName("Sapling").setCreativeTab(PikminsBlocks);
	blockPlanks = new PmsPlank().setBlockName("Planks");
	autumnLogStairs = new AutumnWoodLogStairs(PikminsMoStuff.blockLogs, 0);
	AutumnWoodTiles = new AutumnWoodTiles(Material.wood);
	autumnwoodPlanksStairs = new AutumnWoodPlanksStairs(PikminsMoStuff.blockPlanks, 1);
	autumnwoodPlanksSlabs = new AutumnPlanksSlabs(Material.wood);
	autumnwoodLogSlabs = new AutumnLogSlabs(Material.wood);
	autumnLogTiles = new AutumnLogTiles(Material.wood);
	
	
	CraftManager.MainClass();
	RegistryManager.MainClass();
}
public void load(FMLInitializationEvent event)
{
	proxy.registerRenderInformation();
}
public void preLoad(FMLPreInitializationEvent event) {

}

//GameRegistry

}