package com.zeldanerd123.pikminsmostuff.items.Tools;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import com.zeldanerd123.pikminsmostuff.creativetabs.PikminsBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class NecromiteAxe extends ItemAxe {

	public NecromiteAxe(int i, ToolMaterial necromiteToolMaterial) {
		super(necromiteToolMaterial);
		this.setTextureName(PikminsMoStuff.MODID + ":necromite_axe");
		this.setCreativeTab(PikminsMoStuff.PikminsTools);
		this.setUnlocalizedName("NecromiteAxe");
	}

}
