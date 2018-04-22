package io.github.zeldanerd123.pikminsmostuff.items;
import io.github.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import io.github.zeldanerd123.pikminsmostuff.util.Interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PMSItem extends Item implements IHasModel {
	
	public PMSItem(String name, CreativeTabs creativetab) {
		super();
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativetab);
		PMSItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		PikminsMoStuff.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}