package com.zeldanerd123.pikminsmostuff.blocks;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverOre extends Block {

	public SilverOre(int i, Material rock) {
		super(rock);
		this.setBlockTextureName("pikminsmostuff:silver_ore");
		this.setHardness(10f);
		this.setBlockName("SilverOre");
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);

	}

}
