package io.github.zeldanerd123.pikminsmostuff.creativeTabs;

import io.github.zeldanerd123.pikminsmostuff.items.PMSItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PMSTools extends CreativeTabs{

	public PMSTools(String unlocalizedName) {
		super(unlocalizedName);
		this.getTabLabel();
	}

	@Override
	public ItemStack getTabIconItem() {
		ItemStack iconItem = new ItemStack(PMSItems.necromiteHoe);
		return iconItem;
	}


}
