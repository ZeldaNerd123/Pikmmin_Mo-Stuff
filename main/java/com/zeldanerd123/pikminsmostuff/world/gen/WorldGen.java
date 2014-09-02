package com.zeldanerd123.pikminsmostuff.world.gen;

import java.util.Random;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import com.zeldanerd123.pikminsmostuff.world.gen.featured.EndGenMinable;
import com.zeldanerd123.pikminsmostuff.world.gen.featured.NetherGenMinable;
import com.zeldanerd123.pikminsmostuff.world.gen.featured.NetherLavaMinable;

import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1: genNether(world, random, chunkX*16, chunkZ*16);
		case 0: genSurface(world, random, chunkX*16, chunkZ*16);
		case 1: genEnd(world, random, chunkX*16, chunkZ*16);
		}
	}
//End
	private void genEnd(World world, Random random, int x, int z) {
		for(int end = 0; end < 10; end++){
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(256);
			int Zcoords = z + random.nextInt(16);
			new EndGenMinable(PikminsMoStuff.Endore, 10).generate(world, random, Xcoords, Ycoords, Zcoords);
				}
		for(int end = 0; end < 13; end++){
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(256);
			int Zcoords = z + random.nextInt(16);
			new EndGenMinable(PikminsMoStuff.Starstone, 10).generate(world, random, Xcoords, Ycoords, Zcoords);
				}
		for(int end = 0; end < 11; end++){
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(256);
			int Zcoords = z + random.nextInt(16);
			new EndGenMinable(PikminsMoStuff.EnderCrystal, 10).generate(world, random, Xcoords, Ycoords, Zcoords);
				}
	}
//Surface
	private void genSurface(World world, Random random, int x, int z) {
		for(int surface = 0; surface < 11; surface++){
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(256);
			int Zcoords = z + random.nextInt(16);
			new WorldGenMinable(PikminsMoStuff.RubyOre, 10).generate(world, random, Xcoords, Ycoords, Zcoords);
				}
	}
//Nether
	private void genNether(World world, Random random, int x, int z) {
		for(int nether = 0; nether < 15; nether++){
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(128);
			int Zcoords = z + random.nextInt(16);
			new NetherLavaMinable(PikminsMoStuff.IgneousRock, 15).generate(world, random, Xcoords, Ycoords, Zcoords);
			
				}
		

			for(int nether = 0; nether < 13; nether++){
				int Xcoords = x + random.nextInt(16);
				int Ycoords = random.nextInt(128);
				int Zcoords = z + random.nextInt(16);
				new NetherGenMinable(PikminsMoStuff.IgneousRock, 13).generate(world, random, Xcoords, Ycoords, Zcoords);
				
					}
		
		for(int nether = 0; nether < 13; nether++){
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(128);
			int Zcoords = z + random.nextInt(16);
			new NetherGenMinable(PikminsMoStuff.NecromiteOre, 15).generate(world, random, Xcoords, Ycoords, Zcoords);
		}
		
	}

	//New Dimension Ore gen

}
