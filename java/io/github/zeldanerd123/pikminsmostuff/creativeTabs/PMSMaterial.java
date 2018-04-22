package io.github.zeldanerd123.pikminsmostuff.creativeTabs;

import io.github.zeldanerd123.pikminsmostuff.items.PMSItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PMSMaterial extends CreativeTabs{

	public PMSMaterial(String unlocalizedName) {
		super(unlocalizedName);
		getTabLabel();
		
	}

	@Override
	public ItemStack getTabIconItem() {
		ItemStack iconItem = new ItemStack(PMSItems.starDust);
		return iconItem;
	}

}
