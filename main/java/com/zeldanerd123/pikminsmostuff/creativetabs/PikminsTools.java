package com.zeldanerd123.pikminsmostuff.creativetabs;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PikminsTools extends CreativeTabs {

	public PikminsTools(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
	
		return PikminsMoStuff.RubyAxe;
	}

}
