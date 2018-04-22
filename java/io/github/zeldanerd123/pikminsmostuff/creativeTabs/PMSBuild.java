package io.github.zeldanerd123.pikminsmostuff.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class PMSBuild extends CreativeTabs{

	public PMSBuild(String unlocalizedName) {
		super(unlocalizedName);
		this.getTabLabel();
	}

	@Override
	public ItemStack getTabIconItem(){
		ItemStack iconItem = new ItemStack(Blocks.BRICK_BLOCK);
		return iconItem;
	}
}
