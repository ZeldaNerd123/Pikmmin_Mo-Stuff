package com.zeldanerd123.pikminsmostuff.blocks.ore;

import java.util.Random;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Starstone extends Block {

	public Starstone(int i, Material rock) {
		super(rock);
		this.setBlockName("StarStone");
		this.setBlockTextureName(PikminsMoStuff.MODID + ":star_stone");
		this.setHardness(10f);
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
		this.setLightLevel(10f);
	}
	

}
