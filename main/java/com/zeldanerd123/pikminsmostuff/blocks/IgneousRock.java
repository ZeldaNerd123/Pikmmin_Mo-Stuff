package com.zeldanerd123.pikminsmostuff.blocks;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class IgneousRock extends Block {

	public IgneousRock(int i, Material rock) {
		super(rock);this.setBlockName("IngeousRock");
		this.setBlockTextureName("pikminsmostuff:igneous");
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
		this.setHardness(10f);
	}
	


}
