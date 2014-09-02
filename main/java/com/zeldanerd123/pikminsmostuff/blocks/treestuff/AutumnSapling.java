package com.zeldanerd123.pikminsmostuff.blocks.treestuff;

import java.util.Random;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import com.zeldanerd123.pikminsmostuff.creativetabs.PikminsBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class AutumnSapling extends BlockBush implements IGrowable{

	public AutumnSapling(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("AutumnSapling");
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(PikminsMoStuff.PikminsDecration);
        this.setBlockTextureName(PikminsMoStuff.MODID + ":sapling_autumn_oak");
	}

	@Override
	public boolean func_149851_a(World var1, int var2, int var3, int var4,
			boolean var5) {
		// TODO Auto-generated method stub
		return false;
	}
	


	@Override
	public boolean func_149852_a(World var1, Random var2, int var3, int var4,
			int var5) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void func_149853_b(World var1, Random var2, int var3, int var4,
			int var5) {
		// TODO Auto-generated method stub
		
	}


	
}
