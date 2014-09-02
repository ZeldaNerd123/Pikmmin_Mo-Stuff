package com.zeldanerd123.pikminsmostuff.blocks;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ChromeOre extends Block {

	public ChromeOre(int i, Material rock) {
		super(rock);
		this.setBlockTextureName("pikminsmostuff:chrome_ore");
		this.getUnlocalizedName();
		this.setHardness(10f);
		this.setBlockName("ChromeOre");
		//this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
	}


}
