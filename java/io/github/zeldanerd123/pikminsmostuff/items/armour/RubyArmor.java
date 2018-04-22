package io.github.zeldanerd123.pikminsmostuff.items.armour;

import io.github.zeldanerd123.pikminsmostuff.PikminsMoStuff;
import io.github.zeldanerd123.pikminsmostuff.creativeTabs.PMSCreativeTab;
import io.github.zeldanerd123.pikminsmostuff.items.PMSItems;
import io.github.zeldanerd123.pikminsmostuff.util.References;
import io.github.zeldanerd123.pikminsmostuff.util.Interfaces.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class RubyArmor extends ItemArmor implements IHasModel{





	public RubyArmor(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(PMSCreativeTab.pmsC);
		PMSItems.ITEMS.add(this);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == PMSItems.rubyLeggings){
			return References.ModId + ":textures/models/armor/ruby_layer_2.png";
		}
		else{
			return References.ModId + ":textures/models/armor/ruby_layer_1.png";
		}
	
	
	};


	public void onArmorTick(World world, EntityPlayer p, ItemStack armor){
		if(p.inventory.armorItemInSlot(3) != null 
				&& p.inventory.armorItemInSlot(2) != null 
				&& p.inventory.armorItemInSlot(1) != null 
				&& p.inventory.armorItemInSlot(0) != null){
					ItemStack helmet = p.inventory.armorItemInSlot(3);
					ItemStack chestplate = p.inventory.armorItemInSlot(2);
					ItemStack leggings = p.inventory.armorItemInSlot(1);
					ItemStack boots = p.inventory.armorItemInSlot(0);
						if (helmet.getItem() == PMSItems.rubyHelm
								&& chestplate.getItem() == PMSItems.rubyChest
								&& leggings.getItem() == PMSItems.rubyLeggings
								&& boots.getItem() == PMSItems.rubyBoots ){
							
							p.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 8, 2));							
						}
		}
	

	}
	@Override
	public void registerModels() 
	{
		PikminsMoStuff.proxy.registerItemRenderer(this, 0, "inventory");
	}
}