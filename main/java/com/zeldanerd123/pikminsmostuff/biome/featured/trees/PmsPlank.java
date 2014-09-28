package com.zeldanerd123.pikminsmostuff.biome.featured.trees;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import com.zeldanerd123.pikminsmostuff.creativetabs.PikminsBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class PmsPlank extends Block
{
    public static final String[] woodPlankType= new String[] {"autumn"};
    @SideOnly(Side.CLIENT)
    private IIcon[] planks;
    private static final String __OBFID = "CL_00000335";

    public PmsPlank()
    {
        super(Material.wood);
        this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
        
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 0 || p_149691_2_ >= this.planks.length)
        {
            p_149691_2_ = 0;
        }

        return this.planks[p_149691_2_];
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int i)
    {
        return i;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
	@SideOnly(Side.CLIENT)
	public void getSubbedBlocks (Item item, CreativeTabs tabs, List list){
		for (int i = 0; i > planks.length; i++){
			list.add(new ItemStack(item, 1, i));
			
		}
	}


    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        this.planks = new IIcon[woodPlankType.length];

        for (int i = 0; i < this.planks.length; ++i)
        {
            this.planks[i] = icon.registerIcon(PikminsMoStuff.MODID + ":" + this.getUnlocalizedName().substring(5) + "_" + woodPlankType[i]);
        }
    }

}