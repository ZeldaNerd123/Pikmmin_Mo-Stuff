package com.zeldanerd123.pikminsmostuff.items;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Necromite extends Item {

	public Necromite(int i) {
		this.canItemEditBlocks();
	this.setTextureName("pikminsmostuff:necromite3");
	this.setUnlocalizedName("Necromite");
	this.setCreativeTab(PikminsMoStuff.PikminsItems);
	}
	
}
