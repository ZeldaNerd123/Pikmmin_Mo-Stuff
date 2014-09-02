package com.zeldanerd123.pikminsmostuff.items.Tools;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class RubyAxe extends ItemAxe {

	public RubyAxe(int i, ToolMaterial rubyToolMaterial) {
		super(rubyToolMaterial);
		
		
		this.setTextureName(PikminsMoStuff.MODID + ":ruby_axe");
		this.setCreativeTab(PikminsMoStuff.PikminsTools);
		this.setUnlocalizedName("RubyAxe");
	}

}
