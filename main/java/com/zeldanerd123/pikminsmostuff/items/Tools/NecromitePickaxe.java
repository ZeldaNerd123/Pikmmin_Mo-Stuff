package com.zeldanerd123.pikminsmostuff.items.Tools;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class NecromitePickaxe extends ItemPickaxe {

	public NecromitePickaxe(int i, ToolMaterial necromiteToolMaterial) {
		super(necromiteToolMaterial);
	
		this.setTextureName(PikminsMoStuff.MODID + ":necromite_pickaxe");
		this.setCreativeTab(PikminsMoStuff.PikminsTools);
		this.setUnlocalizedName("NecromitePickaxe");
	}

}
