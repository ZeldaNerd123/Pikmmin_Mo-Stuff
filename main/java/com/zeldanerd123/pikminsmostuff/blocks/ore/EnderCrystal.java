package com.zeldanerd123.pikminsmostuff.blocks.ore;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class EnderCrystal extends Block {

	public EnderCrystal(int i, Material rock) {
		super(rock);
		this.setBlockName("EnderCrystal");
		this.setBlockTextureName("pikminsmostuff:ender_crystal");
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
		this.setHardness(10f);
		
	}

}
		