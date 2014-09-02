package com.zeldanerd123.pikminsmostuff.blocks.treestuff.slabs;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;


	

public class AutumnLogSlabs extends Block {
		
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	
	public AutumnLogSlabs(Material wood) {
			super(wood);
	this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);

	this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
	this.setHardness(2f);
	this.setLightOpacity(0);
	this.setBlockName("AutumnLogSlabs");
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

		protected IIcon getSideIcon(int var1) {

			return null;
		}

public boolean isOpaqueCube()
{
    return false;
}

public boolean renderAsNormalBlock()
{
    return false;
}

}





