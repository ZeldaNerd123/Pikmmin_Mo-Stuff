package io.github.zeldanerd123.pikminsmostuff.creativeTabs;


import io.github.zeldanerd123.pikminsmostuff.blocks.PMSBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PMSDecorations extends CreativeTabs{

	public PMSDecorations(String unlocalizedName) {
		super(unlocalizedName);
		this.getTabLabel();
	}

	@Override
	public ItemStack getTabIconItem() {
		ItemStack iconItem = new ItemStack(PMSBlocks.RubyOre);
		return iconItem;
	}

}
