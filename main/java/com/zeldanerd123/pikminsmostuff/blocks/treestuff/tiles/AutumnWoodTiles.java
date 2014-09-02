package com.zeldanerd123.pikminsmostuff.blocks.treestuff.tiles;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.material.Material;

public class AutumnWoodTiles extends Block {

	public AutumnWoodTiles(Material wood) {
		super(wood);
		
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
		this.stepSound = soundTypeWood;
		this.setBlockName("AutumnOakPlankTiles");
		this.setHardness(2f);
		this.setBlockTextureName(PikminsMoStuff.MODID + ":autumn_oak_planks");
		this.setCreativeTab(PikminsMoStuff.PikminsDecration);
        this.setTickRandomly(true);
		this.setLightOpacity(0);
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

