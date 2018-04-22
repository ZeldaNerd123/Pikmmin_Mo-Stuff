//package io.github.zeldanerd123.pikminsmostuff.blocks;
//
//import io.github.zeldanerd123.pikminsmostuff.creativeTabs.PMSCreativeTab;
//import io.github.zeldanerd123.pikminsmostuff.items.PMSItems;
//import io.github.zeldanerd123.pikminsmostuff.util.Interfaces.IHasModel;
//import io.github.zeldanerd123.pikminsmostuff.util.Interfaces.IMetaName;
//import io.github.zeldanerd123.pikminsmostuff.util.handlers.EnumHandler;
//import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.properties.PropertyEnum;
//import net.minecraft.item.ItemStack;
//
//public class PMSOre extends Block implements IHasModel, IMetaName{
//	
//	public static final PropertyEnum<EnumHandler.EnumType> VARIANT = PropertyEnum.<EnumHandler.EnumType>create("varient", EnumHandler.EnumType.class);
//	
//	private String name, dimesion;
//	public PMSOre(String name, String dimesion) {
//		super(Material.ROCK);
//		
//		setUnlocalizedName(name);
//		setRegistryName(name);
//		setCreativeTab(PMSCreativeTab.pmsB);
//		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandler.EnumType.RUBY));
//		
//		this.name = name;
//		this.dimesion = dimesion;
//		PMSBlocks.BLOCKS.add(this);
//		PMSItems.ITEMS.add(new PMSBlock(this).setRegistryName(this.getRegistryName()));
//	}
//
//	@Override
//	public String getSpecialName(ItemStack stack) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void registerModels() {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
