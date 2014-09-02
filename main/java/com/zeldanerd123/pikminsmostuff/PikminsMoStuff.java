package com.zeldanerd123.pikminsmostuff;


import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
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
import net.minecraftforge.common.util.EnumHelper;

import com.zeldanerd123.pikminsmostuff.biome.featured.PmsPlank;
import com.zeldanerd123.pikminsmostuff.biome.featured.PmsLeaves;
import com.zeldanerd123.pikminsmostuff.biome.featured.PmsLog;
import com.zeldanerd123.pikminsmostuff.biome.featured.PmsSapling;
import com.zeldanerd123.pikminsmostuff.blocks.Amethyst;
import com.zeldanerd123.pikminsmostuff.blocks.ChromeOre;
import com.zeldanerd123.pikminsmostuff.blocks.EnderCrystal;
import com.zeldanerd123.pikminsmostuff.blocks.Endore;
import com.zeldanerd123.pikminsmostuff.blocks.IgneousRock;
import com.zeldanerd123.pikminsmostuff.blocks.NecromiteOre;
import com.zeldanerd123.pikminsmostuff.blocks.Rubyore;
import com.zeldanerd123.pikminsmostuff.blocks.SilverOre;
import com.zeldanerd123.pikminsmostuff.blocks.Starstone;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.AutumnLeaves;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.AutumnSapling;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.AutumnWoodLog;
import com.zeldanerd123.pikminsmostuff.blocks.treestuff.AutumnWoodPlanks;
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
import com.zeldanerd123.pikminsmostuff.items.Endorite;
import com.zeldanerd123.pikminsmostuff.items.Necromite;
import com.zeldanerd123.pikminsmostuff.items.Pearl;
import com.zeldanerd123.pikminsmostuff.items.Ruby;
import com.zeldanerd123.pikminsmostuff.items.StartDust;
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
	 	public static Block ChromeOre =
	 		new ChromeOre(500, Material.rock);
		
	 	public static Block SilverOre =
	 		new SilverOre(501, Material.rock);		
		
	 	public static Block Endore =
	 		new Endore(502, Material.rock);
		
	 	public static Block NecromiteOre =
	 		new NecromiteOre(503, Material.rock);
		
	 	public static Block Starstone =
	 		new Starstone(504, Material.rock);
		
	 	public static Block IgneousRock =
	 		new IgneousRock(505, Material.rock);
		
		public static Block EnderCrystal =
			new EnderCrystal(506, Material.rock);
		
		public static Block RubyOre =
			new Rubyore(507, Material.rock);
		
		public static Block Amethyst = 
			new Amethyst(Material.rock);
		//tree blocks stuff
			//Autumn Oak	 
		/*
		 blockleaves = 
			new PmsLeaves().setBlockName("Leaves")
				.setCreativeTab(PikminsBlocks);
		 */
		public static Block blockLogs = new PmsLog().setBlockName("Log")
			.setCreativeTab(PikminsBlocks);
		
		public static Block blockleaves = 
			new PmsLeaves().setBlockName("Leaves")
				.setCreativeTab(PikminsBlocks);
		
		public static Block blockSaplings = new PmsSapling().setBlockName("Sapling")
				.setCreativeTab(PikminsBlocks);
		
		public static Block blockPlanks = new PmsPlank().setBlockName("Planks");
		
		public static Block AutumnWoodLog =
		new AutumnWoodLog(Material.wood);
	
		
		
	public static Block AutumnLeaves =
		new AutumnLeaves(Material.leaves);
	
	public static BlockBush AutumnSapling =
		new AutumnSapling(Material.plants);
	
	public static Block AutumnWoodPlanks =
		new AutumnWoodPlanks(Material.wood);
	
	public static BlockStairs autumnLogStairs =
		new AutumnWoodLogStairs(PikminsMoStuff.AutumnWoodLog, 0);
	
	public static Block AutumnWoodTiles = 
		new AutumnWoodTiles(Material.wood);
	
	public static BlockStairs autumnwoodPlanksStairs = 
		new AutumnWoodPlanksStairs(PikminsMoStuff.AutumnWoodPlanks,
					1);
	
	public static Block autumnwoodPlanksSlabs = 
		new AutumnPlanksSlabs(Material.wood);
	
	public static Block autumnwoodLogSlabs =
		new AutumnLogSlabs(Material.wood);
	
	public static Block autumnLogTiles= 
			new AutumnLogTiles(Material.wood);
	
		//items 
		public static Item Necromite = 
			new Necromite(600);
		
		public static Item Pearl =
			new Pearl(601);
		
		public static Item Ruby = 
			new Ruby(602);
		
		public static Item StarDust = 
			new StartDust(603);
		
		public static Item Endorite = 
			new Endorite(604);

		//weapons
		
		//public static ToolMaterial material = EnumHelper.addToolMaterial("name", int harvestLevel, int maxUses, float efficiency, float damage, int enchantability)
		
		//harvest and damage 0 == wooden tools
		//harvest and damage 1 == stone tools
		//harvest and damage 2 == iron tools
		//harvest and damage 3 == diamond tools
			//Necromite
		public static ToolMaterial necromiteToolMaterial = EnumHelper.addToolMaterial("Necromite",
			2, 500, 2f, 3f, 20);
			
		public static Item NecromiteSword = 
			new NecromiteSword(5, necromiteToolMaterial);
		public static Item NecromiteAxe= 
				new NecromiteAxe(1, necromiteToolMaterial);
		public static Item NecromitePickaxe= 
				new NecromitePickaxe(2, necromiteToolMaterial);
		public static Item NecromiteShovel= 
				new NecromiteShovel(3, necromiteToolMaterial);
		public static Item NecromiteHoe= 
				new NecromiteHoe(4, necromiteToolMaterial);
			//Ruby
		public static ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("Ruby",
				4, 450, 4f, 4f, 20);
		
		public static Item RubySword = 
				new RubySword(9, rubyToolMaterial);
			public static Item RubyAxe= 
					new RubyAxe(5, rubyToolMaterial);
			public static Item RubyPickaxe= 
					new RubyPickaxe(6, rubyToolMaterial);
			public static Item RubyShovel= 
					new RubyShovel(7, rubyToolMaterial);
			public static Item RubyHoe= 
					new RubyHoe(8, rubyToolMaterial);
		
		
		
		//Armour
			//Necromite
		public static ArmorMaterial necromiteArmour=
			EnumHelper.addArmorMaterial("Necromite",
					340, new int[]{1, 5, 5, 1}, 30);
		
		public static Item NecromiteHelm = 
				new necromiteArmor(1 ,necromiteArmour, 0,0, "Necromite")
					.setUnlocalizedName("NecromiteHelm").setCreativeTab(PikminsCombat)
						.setTextureName(MODID +":necromite_helmet");
		
		public static Item NecromiteChest = 
				new necromiteArmor(2, necromiteArmour, 0,1, "Necromite")
					.setUnlocalizedName("NecromiteChest").setCreativeTab(PikminsCombat)
						.setTextureName(MODID +":necromite_chestplate");
		
		public static Item NecromiteLeggings = 
				new necromiteArmor(3, necromiteArmour, 0,2, "Necromite")
					.setUnlocalizedName("NecromiteLeggings").setCreativeTab(PikminsCombat)
						.setTextureName(MODID +":necromite_leggings");
		
		public static Item NecromiteBoots = 
				new necromiteArmor(4, necromiteArmour, 0,3, "Necromite")
					.setUnlocalizedName("NecromiteBoots").setCreativeTab(PikminsCombat)
						.setTextureName(MODID +":necromite_boots");
		
				//Ruby
		public static ArmorMaterial RubyArmour=
				EnumHelper.addArmorMaterial("Ruby",
						340, new int[]{2, 6, 5, 2}, 30);
		
		public static Item RubyHelm = 
				new RubyArmor(5, RubyArmour, 0,0, "Necromite")
					.setUnlocalizedName("RubyHelm").setCreativeTab(PikminsCombat)
						.setTextureName(MODID +":ruby_helmet");
		
		public static Item RubyChest = 
				new RubyArmor(6, RubyArmour, 0,1, "Ruby")
					.setUnlocalizedName("RubyChest").setCreativeTab(PikminsCombat)
						.setTextureName(MODID +":ruby_chestplate");
		
		public static Item RubyLeggings = 
				new RubyArmor(7, RubyArmour, 0,2, "Ruby")
					.setUnlocalizedName("RubyLeggings").setCreativeTab(PikminsCombat)
						.setTextureName(MODID +":ruby_leggings");
		
		public static Item RubyBoots = 
				new RubyArmor(8, RubyArmour, 0,3, "Ruby")
					.setUnlocalizedName("RubyBoots").setCreativeTab(PikminsCombat)
						.setUnlocalizedName("RubyBoots").setTextureName(MODID +":ruby_boots");

	
@EventHandler
public void init(FMLInitializationEvent event)
{
/* Bronze = new Item().setTextureName(MODID + ":Bronze").setCreativeTab(PikminsItems);
 GameRegistry.registerItem(Bronze, "Bronze");*/

		
	//CraftManager.MainClass();
	
}
public void load(FMLInitializationEvent event)
{
	proxy.registerRenderInformation();
}
public void preLoad(FMLPreInitializationEvent event) {

}

//GameRegistry
public PikminsMoStuff(){
	CraftManager.MainClass();
	RegistryManager.MainClass();
	
	
	
	

}
}


