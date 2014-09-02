package com.zeldanerd123.pikminsmostuff.items.weapons;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class NecromiteSword extends ItemSword {

	public NecromiteSword(int i, ToolMaterial necromiteToolMaterial) {
		super(necromiteToolMaterial);
			this.setTextureName(PikminsMoStuff.MODID + ":necromite_sword");
			this.setCreativeTab(PikminsMoStuff.PikminsCombat);
			this.setUnlocalizedName("NecromiteSword");
	}

}
