package io.github.zeldanerd123.pikminsmostuff.items.tools;


import java.util.Set;

import com.google.common.collect.Sets;

import io.github.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import io.github.zeldanerd123.pikminsmostuff.creativeTabs.PMSCreativeTab;
import io.github.zeldanerd123.pikminsmostuff.items.PMSItems;
import io.github.zeldanerd123.pikminsmostuff.util.Interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class PMSAxe extends ItemTool implements IHasModel{
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

    
	public PMSAxe(String unlocalizedName, ToolMaterial material) {
		super(material,EFFECTIVE_ON);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setCreativeTab(PMSCreativeTab.pmsT);
		PMSItems.ITEMS.add(this);
		this.attackDamage = material.getAttackDamage() + 2f;
		this.attackSpeed = 0.5f;
	}


    
	@Override
	public void registerModels() 
	{
		PikminsMoStuff.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
