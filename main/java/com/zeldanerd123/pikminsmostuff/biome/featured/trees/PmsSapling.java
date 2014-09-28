package com.zeldanerd123.pikminsmostuff.biome.featured.trees;

import java.util.List;
import java.util.Random;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import com.zeldanerd123.pikminsmostuff.biome.featured.trees.WorldGenAutumnOakTree;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class PmsSapling extends BlockSapling{
	public static final String[] sapling = new String[] {"_autumn_oak"};
    private static final IIcon[] saplingIcon= new IIcon[sapling.length];
    

    public  PmsSapling() {
   float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(PikminsMoStuff.PikminsDecration);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if (!world.isRemote)
        {
            super.updateTick(world, x, y, z, random);

            if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(7) == 0)
            {
                this.func_149879_c(world, x, y, z, random);
            }
        }
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        meta &= 7;
        return saplingIcon[MathHelper.clamp_int(meta, 0, 5)];
    }

    
    //MarkOrGrowMark
    public void func_149879_c(World world, int x, int y, int z, Random random)
    {
        int l = world.getBlockMetadata(x, y, z);

        if ((l & 8) == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, l | 8, 4);
        }
        else
        {
            this.func_149878_d(world, x, y, z, random);
        }
    }
//GrowTree
    public void func_149878_d(World world, int x, int y, int z, Random random)
    {
        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, random, x, y, z)) return;
        int l = world.getBlockMetadata(x, y, z) & 7;
        Object object = random.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTrees(true);
        int i1 = 0;
        int j1 = 0;
        boolean flag = false;

        switch (l)
        {
            case 0:
                object = new WorldGenAutumnOakTree(PikminsMoStuff.blockLogs, PikminsMoStuff.blockleaves, 0, 0, true, 5, 30, false);
              	
            	break;
           
            case 1:

            	break;
            case 2:
            	
            	break;
            
            case 3:
                
            	break;
            
            case 5:
            	
            	break;
            
            default:
                
            	break;
        
        
        }

        Block block = Blocks.air;

        if (flag)
        {
            world.setBlock(x + i1, y, z + j1, block, 0, 4);
            world.setBlock(x + i1 + 1, y, z + j1, block, 0, 4);
            world.setBlock(x + i1, y, z + j1 + 1, block, 0, 4);
            world.setBlock(x + i1 + 1, y, z + j1 + 1, block, 0, 4);
        }
        else
        {
            world.setBlock(x, y, z, block, 0, 4);
        }

        if (!((WorldGenerator)object).generate(world, random, x + i1, y, z + j1))
        {
            if (flag)
            {
                world.setBlock(x + i1, y, z + j1, this, l, 4);
                world.setBlock(x + i1 + 1, y, z + j1, this, l, 4);
                world.setBlock(x + i1, y, z + j1 + 1, this, l, 4);
                world.setBlock(x + i1 + 1, y, z + j1 + 1, this, l, 4);
            }
            else
            {
                world.setBlock(x, y, z, this, l, 4);
            }
        }
    }
// isSameSapling
    public boolean func_149880_a(World world, int x, int y, int z, int par1)
    {
        return world.getBlock(x, y, z) == this && (world.getBlockMetadata(x, y, z) & 7) == par1;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int rate)
    {
        return MathHelper.clamp_int(rate & 7, 0, 5);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
    	for (int i = 0; i > sapling.length; i++){
			list.add(new ItemStack(item, 1, i));
		}
    }


    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        for (int i = 0; i < saplingIcon.length; ++i)
        {
            saplingIcon[i] = iconRegister.registerIcon(PikminsMoStuff.MODID + ":" + this.getUnlocalizedName().substring(5) + sapling[i]);
        }
    }
//
    public boolean func_149851_a(World world, int x, int y, int z, boolean b)
    {
        return true;
    }
//bone meal event
    public boolean func_149852_a(World world, Random random, int x, int y, int z)
    {
        return (double)world.rand.nextFloat() < 0.45D;
    }

    public void func_149853_b(World world, Random x, int y, int z, int meta)
    {
        this.func_149879_c(world, y, z, meta, x);
    }

	
}
