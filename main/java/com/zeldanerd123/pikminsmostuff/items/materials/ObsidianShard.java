package com.zeldanerd123.pikminsmostuff.items.materials;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ObsidianShard extends Item {

	public ObsidianShard(Material rock) {
		this.setCreativeTab(PikminsMoStuff.PikminsItems);
		this.setTextureName("pikminsmostuff:Obsidian_Shard");		
		this.setUnlocalizedName("ObsidianShard");
	}

}
