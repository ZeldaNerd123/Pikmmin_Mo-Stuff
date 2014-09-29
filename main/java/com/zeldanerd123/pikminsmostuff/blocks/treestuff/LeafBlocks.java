package com.zeldanerd123.pikminsmostuff.blocks.treestuff;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class LeafBlocks extends ItemBlock{
public static final String[] leaves = new String[] { "AutumnOak", "LoftWood"};
	
	public LeafBlocks(Block block) {
		super(block);
		
		this.setHasSubtypes(true);
		setCreativeTab(PikminsMoStuff.PikminsDecration);
		
	}
	
	public String getUnlocalizedName(ItemStack stack){
		int i = stack.getItemDamage();
		if (i < 0 ||i >= leaves.length){
			i = 0;
			
		}
		
		return super.getUnlocalizedName() + "." + leaves[i];
		
	}
	
	
	public int getMetaData (int meta){
		
		
		
		return  meta;
	}
	
	
	
	
	
	
}