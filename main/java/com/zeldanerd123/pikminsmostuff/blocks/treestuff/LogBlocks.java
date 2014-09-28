package com.zeldanerd123.pikminsmostuff.blocks.treestuff;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class LogBlocks extends ItemBlock{
	
	public static final String[] logs = new String[] { "AutumnOak", "LoftWood"};
	
	public LogBlocks(Block block) {
		super(block);
		
		this.setHasSubtypes(true);
		
		
	}
	
	public String getUnlocalizedName(ItemStack stack){
		int i = stack.getItemDamage();
		if (i < 0 ||i >= logs.length){
			i = 0;
			
		}
		
		return super.getUnlocalizedName() + "." + logs[i];
		
	}
	
	
	public int getMetaData (int meta){
		
		
		
		return  meta;
	}
	
	

}
