package com.zeldanerd123.pikminsmostuff.blocks.ore;

import java.util.Random;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class NecromiteOre extends Block {

	public NecromiteOre(int i, Material rock) {
		super(rock);
		this.setBlockName("NecromiteOre");
		this.setBlockTextureName("pikminsmostuff:necromite_ore");
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
		this.setHardness(10f);
	}
	@Override
	public Item getItemDropped(int i, Random random, int i2){
		return PikminsMoStuff.Necromite;
	}
}
