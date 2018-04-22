package io.github.zeldanerd123.pikminsmostuff.lib;


import io.github.zeldanerd123.pikminsmostuff.util.handlers.PMSRecipes;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ProxyCommon {

	public void preInit(FMLPreInitializationEvent preEvent) {	
//		registerBlock();
//		PMSItems.initItems();
		PMSRecipes.initRecipes();

		
		
	}
	

	
	public void init(FMLInitializationEvent event) {
//			GameRegistry.registerFuelHandler(new PMSFuelHandler());
	}

	public void postInit(FMLPostInitializationEvent postEvent) {
	
	}
	public void registerMetaStuff() {
		
	}
	public void registerItemRenderer(Item item, int meta, String id) {}

}