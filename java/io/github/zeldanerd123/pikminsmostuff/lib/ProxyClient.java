package io.github.zeldanerd123.pikminsmostuff.lib;



import io.github.zeldanerd123.pikminsmostuff.items.PMSItems;
import io.github.zeldanerd123.pikminsmostuff.util.References;
import io.github.zeldanerd123.pikminsmostuff.util.handlers.EnumHandler.PearlTypes;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ProxyClient extends ProxyCommon {
	@SubscribeEvent
	public void preInit(FMLPreInitializationEvent preEvent) {
		
		super.preInit(preEvent);
		
	}
	
	public void init(FMLInitializationEvent event) {
		
		super.init(event);
		registerMetaStuff();
		
	}
	public void postInit(FMLPostInitializationEvent postEvent) {
		
		super.postInit(postEvent);
	
	}
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
	public void registerMetaStuff() {
		ModelBakery.registerItemVariants(PMSItems.pearl,
				new ResourceLocation(References.ModId, PearlTypes.WHITE.getName() + "_pearl"),
				new ResourceLocation(References.ModId, PearlTypes.ROSELINE.getName() + "_pearl"),
				new ResourceLocation(References.ModId, PearlTypes.PURPLE.getName() + "_pearl"),
				new ResourceLocation(References.ModId, PearlTypes.DARK_GREEN.getName() + "_pearl"),
				new ResourceLocation(References.ModId, PearlTypes.MIDNIGHT_BLUE.getName() + "_pearl"),
				new ResourceLocation(References.ModId, PearlTypes.GOLD.getName() + "_pearl"),
				new ResourceLocation(References.ModId, PearlTypes.GREY.getName() + "_pearl"),
				new ResourceLocation(References.ModId, PearlTypes.BLACK.getName() + "_pearl"));
	}
}