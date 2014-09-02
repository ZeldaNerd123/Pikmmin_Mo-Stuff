package com.zeldanerd123.pikminsmostuff.blocks.treestuff;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class SapplingBlocks extends ItemBlock{
	
	public static final String[] sapling = new String[] {"AutumnOak"};
	
	public SapplingBlocks(Block block) {
		super(block);
		
		this.setHasSubtypes(true);
		
		
	}
	
	public String getUnlocalizedName(ItemStack stack){
		int i = stack.getItemDamage();
		if (i < 0 ||i >= sapling.length){
			i = 0;
			
		}
		
		return super.getUnlocalizedName() + "." + sapling[i];
		
	}
	
	
	public int getMetaData (int meta){
		
		
		
		return  meta;
	}
	
	

}
