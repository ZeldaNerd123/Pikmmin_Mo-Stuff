package io.github.zeldanerd123.pikminsmostuff.items.tools;

import io.github.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import io.github.zeldanerd123.pikminsmostuff.creativeTabs.PMSCreativeTab;
import io.github.zeldanerd123.pikminsmostuff.items.PMSItems;
import io.github.zeldanerd123.pikminsmostuff.util.Interfaces.IHasModel;
import net.minecraft.item.ItemSword;

public class PMSSword extends ItemSword implements IHasModel{

	public PMSSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setCreativeTab(PMSCreativeTab.pmsC);
		PMSItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() 
	{
		PikminsMoStuff.proxy.registerItemRenderer(this, 0, "inventory");
	}
}