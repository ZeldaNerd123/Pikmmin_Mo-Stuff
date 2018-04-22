package io.github.zeldanerd123.pikminsmostuff;

import io.github.zeldanerd123.pikminsmostuff.lib.ProxyCommon;
import io.github.zeldanerd123.pikminsmostuff.util.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.ModId, name = References.modname, version = References.version)
public class PikminsMoStuff {
	
	@Instance(References.ModId)
	public static PikminsMoStuff instance;
	
	@SidedProxy(clientSide = References.client, serverSide = References.common)
	public static ProxyCommon proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
		
		PikminsMoStuff.proxy.preInit(preEvent);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		PikminsMoStuff.proxy.init(event);
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent) {
		
		PikminsMoStuff.proxy.postInit(postEvent);
	
	}
}