package com.zeldanerd123.pikminsmostuff.blocks.treestuff;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class PlankBlocks extends ItemBlock{
	
	public static final String[] Planks = new String[] { "AutumnOak", "Loftwood"};
	
	public PlankBlocks(Block block) {
		super(block);
		
		this.setHasSubtypes(true);
		
		
	}
	
	public String getUnlocalizedName(ItemStack stack){
		int i = stack.getItemDamage();
		if (i < 0 ||i >= Planks.length){
			i = 0;
			
		}
		
		return super.getUnlocalizedName() + "." + Planks[i];
		
	}
	
	
	public int getMetaData (int meta){
		
		
		
		return  meta;
	}
	
	

}
