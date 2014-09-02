package com.zeldanerd123.pikminsmostuff.blocks.treestuff;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AutumnWoodPlanks extends Block {

	public AutumnWoodPlanks(Material wood) {
		super(wood);
	
		this.setHardness(2f);
		this.setBlockTextureName(PikminsMoStuff.MODID + ":autumn_oak_planks");
		this.setBlockName(" AutumnOakPlanks");
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
		this.setHardness(2f);
		this.setLightOpacity(0);
		this.setBlockName("AutumnLogPlank");
	
	}

}
