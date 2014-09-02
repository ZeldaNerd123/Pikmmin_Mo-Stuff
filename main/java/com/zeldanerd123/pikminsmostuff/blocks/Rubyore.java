package com.zeldanerd123.pikminsmostuff.blocks;

import java.util.Random;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import scala.tools.nsc.doc.model.Public;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Rubyore extends Block {

	public Rubyore(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockTextureName("pikminsmostuff:ruby_ore");
		this.setBlockName("RubyOre");
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(9f);
		this.setCreativeTab(PikminsMoStuff.PikminsBlocks);
	}
	@Override
	public Item getItemDropped(int i, Random random, int i2){
		
		return PikminsMoStuff.Ruby;
		
	}
    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == PikminsMoStuff.RubyOre)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 2);
            }


            return j1;
        }
        return 0;
    }


}
