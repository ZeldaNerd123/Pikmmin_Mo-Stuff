package com.zeldanerd123.pikminsmostuff.creativetabs;




import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PikminsBlocks extends CreativeTabs {


	

	public PikminsBlocks(int nextID, String string) {
		super(nextID, string);
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(PikminsMoStuff.NecromiteOre);
	}

}
