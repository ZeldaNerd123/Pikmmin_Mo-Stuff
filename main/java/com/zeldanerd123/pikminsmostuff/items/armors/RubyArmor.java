package com.zeldanerd123.pikminsmostuff.items.armors;

import com.zeldanerd123.pikminsmostuff.PikminsMoStuff;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class RubyArmor extends ItemArmor{





	public RubyArmor(int k, ArmorMaterial rubyArmour, int i, int j, String string) {
		super(rubyArmour, j, j);


	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() ==PikminsMoStuff.RubyLeggings){
			return PikminsMoStuff.MODID + ":textures/models/armor/ruby_layer_2.png";
			
		}
		else{
			return PikminsMoStuff.MODID + ":textures/models/armor/ruby_layer_1.png";
		}
	
	
	};


/*	@Override
	public ArmorProperties getProperties(EntityLivingBase player,
			ItemStack armor, DamageSource source, double damage, int slot) {
		armor.setRepairCost(slot);
		return null;
	}
	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		
		return 1;
	}
	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack,
			DamageSource source, int damage, int slot) {
		
		
	}
	*/
	public void onArmorTick(World world, EntityPlayer p, ItemStack armor){
		if(p.getCurrentArmor(3) != null 
				&& p.getCurrentArmor(2) != null 
				&& p.getCurrentArmor(1) != null 
				&& p.getCurrentArmor(0) != null){
					ItemStack helmet = p.getCurrentArmor(3);
					ItemStack chestplate = p.getCurrentArmor(2);
					ItemStack leggings = p.getCurrentArmor(1);
					ItemStack boots = p.getCurrentArmor(0);
						if (helmet.getItem() == PikminsMoStuff.RubyHelm
								&& chestplate.getItem() == PikminsMoStuff.RubyChest
								&& leggings.getItem() == PikminsMoStuff.RubyLeggings 
								&& boots.getItem() == PikminsMoStuff.RubyBoots ){
							p.removePotionEffect(20);
							p.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 1));
							
						}
		}
	

	}
}
