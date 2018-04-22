package io.github.zeldanerd123.pikminsmostuff.blocks;

import java.util.Random;

import io.github.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import io.github.zeldanerd123.pikminsmostuff.items.PMSItems;
import io.github.zeldanerd123.pikminsmostuff.util.Interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PMSBlock extends Block implements IHasModel {
	public PMSBlock(String unLocalizedName, Material material, float hardness, float resistance, String tool, int harvestLVL, CreativeTabs creativetab) {
		super(material);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(unLocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setHarvestLevel(tool, harvestLVL);
		this.setCreativeTab(creativetab);
		PMSBlocks.BLOCKS.add(this);
		PMSItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
//		
		return this == PMSBlocks.RubyOre ? PMSItems.ruby
				: (this == PMSBlocks.NecromiteOre ? PMSItems.necromite
				: (this == PMSBlocks.IgneousRock ? PMSItems.igneous  
				: (this == PMSBlocks.StarstoneOre ? PMSItems.starDust
				: (this == PMSBlocks.EndOre ? PMSItems.endorite : Item.getItemFromBlock((this))))));
	}
//	
	public int quantityDropped(Random random) {
		return this == PMSBlocks.RubyOre ? 1 + random.nextInt(1)
			: (this == PMSBlocks.NecromiteOre ? 1 + random.nextInt(2)
			: (this == PMSBlocks.IgneousRock ? 1 + random.nextInt(2)
			: (this == PMSBlocks.EndOre ? 1 + random.nextInt(2) :  1)));
	}
//    @Override
    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune) {
        IBlockState state = world.getBlockState(pos);
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
            int i = 0;

            if (this == PMSBlocks.RubyOre)
            {
                i = MathHelper.getInt(rand, 3, 7);
            }
            else if (this == PMSBlocks.NecromiteOre)
            {
                i = MathHelper.getInt(rand, 3, 7);
            }
            else if (this == PMSBlocks.IgneousRock)
            {
                i = MathHelper.getInt(rand, 0, 2);
            }
            else if (this == PMSBlocks.StarstoneOre)
            {
                i = MathHelper.getInt(rand, 3, 7);
            }


            return i;
        }
        return 0;
    }
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
           return this == PMSBlocks.NecromiteBlock || this == PMSBlocks.RubyBlock;
      }

	@Override
	public void registerModels() {
		PikminsMoStuff.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

	@Override
	public void addPropertyOverride(ResourceLocation key, IItemPropertyGetter getter) {
		// TODO Auto-generated method stub
		
	} 
    
}
