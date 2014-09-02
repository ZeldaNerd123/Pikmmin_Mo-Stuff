package com.zeldanerd123.pikminsmostuff.items.Tools;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class NecromiteShovel extends ItemSpade {

	public NecromiteShovel(int i, ToolMaterial necromiteToolMaterial) {
		super(necromiteToolMaterial);
		this.setTextureName(PikminsMoStuff.MODID + ":necromite_shovel");
		this.setCreativeTab(PikminsMoStuff.PikminsTools);
		this.setUnlocalizedName("NecromiteShovel");
	}

}
