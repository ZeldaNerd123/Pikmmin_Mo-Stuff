package com.zeldanerd123.pikminsmostuff.items.Tools;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class RubyPickaxe extends ItemPickaxe {

	public RubyPickaxe(int i, ToolMaterial rubyToolMaterial) {
		super(rubyToolMaterial);
		
		this.setTextureName(PikminsMoStuff.MODID + ":ruby_pickaxe");
		this.setCreativeTab(PikminsMoStuff.PikminsTools);
		this.setUnlocalizedName("RubyPickaxe");
	}

}
