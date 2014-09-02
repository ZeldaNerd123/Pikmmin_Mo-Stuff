package com.zeldanerd123.pikminsmostuff.blocks.treestuff.stairs;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class AutumnWoodPlanksStairs extends BlockStairs {

	public AutumnWoodPlanksStairs(Block autumnWoodPlanks, int i) {
		super(autumnWoodPlanks, i);
	
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
		this.setHardness(2f);
		this.setLightOpacity(0);
		this.setBlockName("AutumnPlanksSteps");
		
	}


	}

