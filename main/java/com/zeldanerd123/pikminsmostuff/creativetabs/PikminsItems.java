package com.zeldanerd123.pikminsmostuff.creativetabs;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PikminsItems extends CreativeTabs {

	public PikminsItems(int par1, String par2Str) {
		super(par1, par2Str);
	
	}

	@Override
	public Item getTabIconItem() {
		
		return PikminsMoStuff.Necromite;
	}

}
