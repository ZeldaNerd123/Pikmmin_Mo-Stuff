package com.zeldanerd123.pikminsmostuff.blocks.ore;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class Endore extends Block {

	public Endore(int i, Material rock) {
		super(rock);
		this.setBlockName("Endore");
		this.setBlockTextureName("pikminsmostuff:endore");
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
		this.setHardness(10f);
		this.isEqualTo(Blocks.end_stone, null);
		
	}

}
