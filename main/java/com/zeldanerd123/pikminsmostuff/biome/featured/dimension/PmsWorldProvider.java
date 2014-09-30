package com.zeldanerd123.pikminsmostuff.biome.featured.dimension;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class PmsWorldProvider extends WorldProvider
{
	@Override
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.mesaPlateau, 0.1F);
		this.dimensionId = PikminsMoStuff.dimensionId;
	}
	@Override
	public IChunkProvider createChunkGenerator()
	{
		return new PmsChunkProvider(worldObj, worldObj.getSeed(), false);
	}
	
	@Override
	public String getDimensionName()
	{
		return "TesterDimension";
	}
}