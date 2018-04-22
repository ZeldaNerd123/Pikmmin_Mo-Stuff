package io.github.zeldanerd123.pikminsmostuff.creativeTabs;


import io.github.zeldanerd123.pikminsmostuff.items.PMSItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PMSCombat extends CreativeTabs{

	public PMSCombat(String unlocalizedName) {
		super(unlocalizedName);
		this.getTabLabel();
	}

	@Override
	public ItemStack getTabIconItem() {
		ItemStack iconItem = new ItemStack(PMSItems.rubyBoots);
		return iconItem;
	}

}
