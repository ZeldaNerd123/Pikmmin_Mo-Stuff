package com.zeldanerd123.pikminsmostuff.items.Tools;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class NecromiteHoe extends ItemHoe{

	public NecromiteHoe(int i, ToolMaterial necromiteToolMaterial) {
		super(necromiteToolMaterial);
		
		this.setTextureName(PikminsMoStuff.MODID + ":necromite_hoe");
		this.setCreativeTab(PikminsMoStuff.PikminsTools);
		this.setUnlocalizedName("NecromiteHoe");
	}

}
