package com.zeldanerd123.pikminsmostuff.items.Tools;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class RubyHoe extends ItemHoe {

	public RubyHoe(int i, ToolMaterial rubyToolMaterial) {
		super(rubyToolMaterial);
		
		this.setTextureName(PikminsMoStuff.MODID + ":ruby_hoe");
		this.setCreativeTab(PikminsMoStuff.PikminsTools);
		this.setUnlocalizedName("RubyHoe");
	}

}
