package com.zeldanerd123.pikminsmostuff.blocks.treestuff;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;

public class AutumnLeaves extends Block implements IShearable {

	public AutumnLeaves(Material leaves) {
		super(leaves);
		this.setHarvestLevel("shears", 1);
		this.setHardness(2f);
		this.isOpaqueCube();
		this.setBlockName("autumnleaves");
	}

	@Override
	public IIcon getIcon(int var1, int var2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] func_150125_e() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, int x,
			int y, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world,
			int x, int y, int z, int fortune) {
		// TODO Auto-generated method stub
		return null;
	}

}
