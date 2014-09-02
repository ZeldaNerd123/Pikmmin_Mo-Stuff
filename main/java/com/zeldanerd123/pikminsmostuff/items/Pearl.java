package com.zeldanerd123.pikminsmostuff.items;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Pearl extends Item
{

	public Pearl(int i) {
	
		this.setUnlocalizedName("Pearl");
		this.setTextureName("pikminsmostuff:pearl");
		this.setCreativeTab(PikminsMoStuff.PikminsItems);
		
	}

}
