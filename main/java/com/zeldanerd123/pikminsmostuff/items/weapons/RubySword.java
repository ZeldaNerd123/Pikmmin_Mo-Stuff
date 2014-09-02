package com.zeldanerd123.pikminsmostuff.items.weapons;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword {

	public RubySword(int i, ToolMaterial rubyToolMaterial) {
		super(rubyToolMaterial);
		this.setTextureName(PikminsMoStuff.MODID + ":ruby_sword");
		this.setCreativeTab(PikminsMoStuff.PikminsCombat);
		this.setUnlocalizedName("RubySword");
	}

}
