package com.zeldanerd123.pikminsmostuff.blocks.treestuff.stairs;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class AutumnWoodLogStairs extends BlockStairs {

	 public AutumnWoodLogStairs(Block autumnWoodLog, int i) {
		super(autumnWoodLog, i);
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
		this.setHardness(2f);
		this.setLightOpacity(0);
		this.setBlockName("AutumnLogSteps");
		
	}

	
	
}