package com.zeldanerd123.pikminsmostuff;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftManager {
	public static void MainClass()
	  {
	    addCraftingRecipes();
	    addSmeltingRecipes();
	  }
	  
	  public static void addCraftingRecipes()
	  {
	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.NecromiteSword, 1), 
	    		new Object[] { "N", "N", "S", 'N', 
	    			PikminsMoStuff.Necromite, 'S', Items.stick });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.NecromiteAxe, 1), 
	    		new Object[] { " $$", " #$", " # ",
	    			'$', PikminsMoStuff.Necromite, '#', Items.stick });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.NecromiteHoe, 1), 
	    		new Object[] { " $$", " # ", " # ", '$',
	    			PikminsMoStuff.Necromite, '#', Items.stick });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.NecromiteShovel, 1), 
	    		new Object[] { "$", "#", "#", '$',
	    			PikminsMoStuff.Necromite, '#', Items.stick });
	    




	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.NecromitePickaxe, 1),
	    		new Object[] { "$$$", " # ", " # ", '$',
	    			PikminsMoStuff.Necromite, '#', Items.stick });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.NecromiteHelm, 1), 
	    		new Object[] { "$$$", "$ $", '$',
	    			PikminsMoStuff.Necromite });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.NecromiteChest, 1), 
	    		new Object[] { "$ $", "$$$", "$$$", '$',
	    			PikminsMoStuff.Necromite });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.NecromiteLeggings, 1),
	    		new Object[] { "$$$", "$ $", "$ $",	
	    			'$', PikminsMoStuff.Necromite });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.NecromiteBoots, 1), 
	    		new Object[] { "$ $", "$ $", '$', 
	    			PikminsMoStuff.Necromite });
	    




	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.RubySword, 1), 
	    		new Object[] { "R", "R", "S", 'R', 
	    			PikminsMoStuff.Ruby, 'S', Items.stick });
	    

	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.RubyAxe, 1), 
	    		new Object[] { " $$", " #$", " # ", '$', 
	    			PikminsMoStuff.Ruby, '#', Items.stick });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.RubyHoe, 1), 
	    		new Object[] { " $$", " # ", " # ",
	    			'$', PikminsMoStuff.Ruby, '#', Items.stick });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.RubyShovel, 1), 
	    		new Object[] { "$", "#", "#", 
	    			'$', PikminsMoStuff.Ruby, '#', Items.stick });
	    




	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.RubyPickaxe, 1), 
	    		new Object[] { "$$$", " # ", " # ", 
	    			'$', PikminsMoStuff.Ruby, '#', Items.stick });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.RubyHelm, 1), 
	    		new Object[] { "$$$", "$ $",
	    			'$', PikminsMoStuff.Ruby });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.RubyChest, 1),
	    		new Object[] { "$ $", "$$$", "$$$", 
	    			'$', PikminsMoStuff.Ruby });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.RubyLeggings, 1), 
	    		new Object[] { "$$$", "$ $", "$ $", '$',
	    			PikminsMoStuff.Ruby });    

	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.RubyBoots, 1),
	    		new Object[] { "$ $", "$ $", 
	    			'$', PikminsMoStuff.Ruby });
	    
	    
// 		-------------------------------Blocks--------------------------------------------
	   GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.blockPlanks, 4, 1), 
			   new Object[] {"w", 'w', new ItemStack(PikminsMoStuff.blockLogs, 1, 1)});
	    
	   

	    GameRegistry.addShapedRecipe(new ItemStack(PikminsMoStuff.autumnLogStairs, 4),
	    		new Object[] { "W  ", "WW ", "WWW",
	    			'W', PikminsMoStuff.blockLogs });
	    


	    GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table, 1), 
	    		new Object[] { "WW", "WW", 'W', new ItemStack(Blocks.wool, 1, 5)});
	    	


	    GameRegistry.addRecipe(new ItemStack(Items.stick, 4), 
	    		new Object[] { "W", "W",
	    			'W', PikminsMoStuff.blockPlanks });
	    

	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.autumnwoodPlanksStairs, 4), 
	    		new Object[] { "W  ", "WW ", "WWW", 
	    			'W', PikminsMoStuff.blockPlanks });
	    


	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.autumnwoodLogSlabs, 4),
	    		new Object[] { "WWW", 'W', 
	    			new ItemStack(PikminsMoStuff.blockLogs, 1, 0) });
	    

	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.autumnwoodPlanksSlabs, 4), 
	    		new Object[] { "WWW", 'W', 
	    			PikminsMoStuff.blockPlanks });
	    

	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.AutumnWoodTiles, 4),
	    		new Object[] { "WW", 
	    			'W', PikminsMoStuff.autumnwoodPlanksSlabs });
	    

	    GameRegistry.addRecipe(new ItemStack(PikminsMoStuff.autumnLogTiles, 4), 
	    		new Object[] { "WW",
	    			'W', PikminsMoStuff.autumnwoodLogSlabs });

	  }
	  
	 
	 
	  
	  public static void addSmeltingRecipes() {
		  
	  }
	}
