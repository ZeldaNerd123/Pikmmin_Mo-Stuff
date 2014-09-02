package com.zeldanerd123.pikminsmostuff.blocks.treestuff.slabs;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class AutumnPlanksSlabs extends Block {

	public AutumnPlanksSlabs(Material wood) {
		super(wood);
		this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
		this.setBlockTextureName(PikminsMoStuff.MODID + ":autumn_oak_planks");
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
		this.setHardness(2f);
		this.setLightOpacity(0);
		this.setBlockName("AutumnPlanksSlabs");
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
	



