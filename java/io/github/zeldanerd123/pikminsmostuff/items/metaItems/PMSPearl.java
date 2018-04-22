package io.github.zeldanerd123.pikminsmostuff.items.metaItems;

import javax.annotation.Nullable;

import io.github.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import io.github.zeldanerd123.pikminsmostuff.creativeTabs.PMSCreativeTab;
import io.github.zeldanerd123.pikminsmostuff.items.PMSItems;
import io.github.zeldanerd123.pikminsmostuff.util.Interfaces.IHasModel;
import io.github.zeldanerd123.pikminsmostuff.util.handlers.EnumHandler;
import io.github.zeldanerd123.pikminsmostuff.util.handlers.EnumHandler.PearlTypes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.IRegistry;
import net.minecraft.util.registry.RegistrySimple;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PMSPearl extends Item implements IHasModel{
	private final IRegistry<ResourceLocation, IItemPropertyGetter> properties = new RegistrySimple<ResourceLocation, IItemPropertyGetter>();
	
	public PMSPearl(String name) {
		this.setHasSubtypes(true);
		this.setUnlocalizedName(name);
		this.setMaxDamage(0);
		this.setCreativeTab(PMSCreativeTab.pmsD);
		this.setMaxStackSize(32);
		this.setRegistryName(name);
		
//		this.addPropertyOverride(new ResourceLocation("type"), new SubItemPropertyGetter());
		PMSItems.ITEMS.add(this);
		
		
	}
	
	protected static boolean metaData(ItemStack stack) {
		return stack.getItemDamage() < stack.getMaxDamage() - 1;
	}

	@Override
	public int getMetadata(int damage) 
	{
		return damage;
	}


    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems (CreativeTabs creativeTabs,
    		NonNullList<ItemStack> list) {
    	
        if (isInCreativeTab(creativeTabs)) {
            for (EnumHandler.PearlTypes enumhandler$pearltype: EnumHandler.PearlTypes.values())
                list.add(new ItemStack(this, 1, enumhandler$pearltype.getMetadata()));
        }
    }


	@Override
	public String getUnlocalizedName(ItemStack stack) {
		EnumHandler.PearlTypes enumhandler$pearltype = EnumHandler.PearlTypes.byItemStack(stack);
	        return this.getUnlocalizedName() + "." + enumhandler$pearltype.getName();
	}
	
	
//    public final void addPropertyOverride(ResourceLocation key, IItemPropertyGetter getter) {
//        this.properties.putObject(key, getter);
//    }

    @Nullable
    @SideOnly(Side.CLIENT)
    public IItemPropertyGetter getPropertyGetter(ResourceLocation key) {
        return this.properties.getObject(key);
    }

//	
	@Override
	public void registerModels() {
		
//		NonNullList<ItemStack> list = NonNullList.create();
//		this.getSubItems(this.getCreativeTab(), list);
//		for(ItemStack stack : list) {
//			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
//			.register(this, stack.getItemDamage(), new ModelResourceLocation(this.getRegistryName()
//					+ PearlTypes.values().toString(), "inventory"));
//		}
		 
//		for(ItemStack stack : list) {
//			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
//			.register(this, stack.getItemDamage(), new ModelResourceLocation(this.getRegistryName() + "_" 
//					+ PearlTypes.values().toString(), "inventory"));
//		}
		
		PMSItems.pearl.addPropertyOverride(new ResourceLocation("type"), new IItemPropertyGetter() {
			  @SideOnly(Side.CLIENT)
			  @Override
			  public float apply(ItemStack stack, @Nullable World world, @Nullable EntityLivingBase entity) {
			    return stack.getItemDamage();
			  }
			});
		
		for (int i = 0; i < PearlTypes.values().length; i++) {
			PikminsMoStuff.proxy.registerItemRenderer(this, i, PearlTypes.values()[i].getName());
		}
		
//		PikminsMoStuff.proxy.registerMetaStuff();
		
	}
	
}
