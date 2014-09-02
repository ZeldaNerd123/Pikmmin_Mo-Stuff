package com.zeldanerd123.pikminsmostuff.blocks.treestuff;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import com.zeldanerd123.pikminsmostuff.creativetabs.PikminsBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class AutumnWoodLog extends BlockRotatedPillar
{
	 @SideOnly(Side.CLIENT)
     private IIcon top;
     @SideOnly(Side.CLIENT)
     private IIcon front;
    
     public AutumnWoodLog(Material wood)
     {
      super(wood);
      this.setHardness(2f);
      this.setBlockName("AutumnOakLog");
      this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
      
     }
    
 @SideOnly(Side.CLIENT)
 public IIcon getIcon(int side, int p_149691_2_)
 {
   return side == 1 || side == 0 ? this.top : (side == 2 ? this.front : this.blockIcon);
 }

 @SideOnly(Side.CLIENT)
 public void registerBlockIcons(IIconRegister p_149651_1_)
 {
	 this.blockIcon = p_149651_1_.registerIcon(PikminsMoStuff.MODID + ":autumn_oak_log");
     this.top = p_149651_1_.registerIcon(PikminsMoStuff.MODID + ":autumn_oak_log_top");
     this.front = p_149651_1_.registerIcon(PikminsMoStuff.MODID + ":autumn_oak_log");
 }

@Override
protected IIcon getSideIcon(int var1) {

	return null;
}
}