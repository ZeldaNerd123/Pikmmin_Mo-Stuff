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
import net.minecraft.world.World;

public class NecromiteArmor extends ItemArmor implements IHasModel{




//	public NecromiteArmor(int k, ArmorMaterial necromiteArmour, int i, EntityEquipmentSlot j,
//			String string) {
	public NecromiteArmor(String name, ArmorMaterial necromiteArmour, int renderIndex, EntityEquipmentSlot slot) {
		super(necromiteArmour, renderIndex, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(PMSCreativeTab.pmsC);
		PMSItems.ITEMS.add(this);

	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() ==PMSItems.necromiteLeggings){
			return References.ModId + ":textures/models/armor/necromite_layer_2.png";
			
		}
		else{
			return References.ModId + ":textures/models/armor/necromite_layer_1.png";
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
						if (helmet.getItem() == PMSItems.necromiteHelm
								&& chestplate.getItem() == PMSItems.necromiteChest
								&& leggings.getItem() == PMSItems.necromiteLeggings
								&& boots.getItem() == PMSItems.necromiteBoots ){
							
							if (p.isPotionActive(Potion.getPotionById(20))) {
								p.removePotionEffect(Potion.getPotionById(20));
								p.getFoodStats().setFoodLevel(p.getFoodStats().getFoodLevel() - 1);
							}  
							//p.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 1));
							
						}
		}
	

	}
	@Override
	public void registerModels() 
	{
		PikminsMoStuff.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
