package io.github.zeldanerd123.pikminsmostuff.items;


import java.util.ArrayList;
import java.util.List;

import io.github.zeldanerd123.pikminsmostuff.creativeTabs.PMSCreativeTab;
import io.github.zeldanerd123.pikminsmostuff.items.armour.NecromiteArmor;
import io.github.zeldanerd123.pikminsmostuff.items.armour.RubyArmor;
import io.github.zeldanerd123.pikminsmostuff.items.metaItems.PMSPearl;
import io.github.zeldanerd123.pikminsmostuff.items.tools.PMSAxe;
import io.github.zeldanerd123.pikminsmostuff.items.tools.PMSHoe;
import io.github.zeldanerd123.pikminsmostuff.items.tools.PMSPickaxe;
import io.github.zeldanerd123.pikminsmostuff.items.tools.PMSShovel;
import io.github.zeldanerd123.pikminsmostuff.items.tools.PMSSword;
import io.github.zeldanerd123.pikminsmostuff.util.References;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class PMSItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//weapons
	
	//public static ToolMaterial material = EnumHelper.addToolMaterial("name", int harvestLevel, int maxUses, float efficiency, float damage, int enchantability)

	//harvest and damage 0 == wooden tools
	//harvest and damage 1 == stone tools
	//harvest and damage 2 == iron tools
	//harvest and damage 3 == diamond tools
		
	//Necromite

	public static ToolMaterial necromiteToolMaterial = EnumHelper.addToolMaterial("Necromite", 2, 500, 2f, 3f, 20);


	public static Item necromiteSword = new PMSSword("necromite_sword", necromiteToolMaterial);
	public static Item necromiteAxe = new PMSAxe("necromite_axe", necromiteToolMaterial);
	public static Item necromitePickaxe = new PMSPickaxe("necromite_pickaxe", necromiteToolMaterial);
	public static Item necromiteShovel = new PMSShovel("necromite_shovel", necromiteToolMaterial);
	public static Item necromiteHoe = new PMSHoe("necromite_hoe", necromiteToolMaterial);
	
	//Ruby
	public static ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("Ruby", 4, 450, 4f, 4f, 20);

	public static Item rubySword = new PMSSword("ruby_sword", rubyToolMaterial);
	public static Item rubyAxe = new PMSAxe("ruby_axe", rubyToolMaterial);
	public static Item rubyPickaxe = new PMSPickaxe("ruby_pickaxe", rubyToolMaterial);
	public static Item rubyShovel = new PMSShovel("ruby_shovel", rubyToolMaterial);
	public static Item rubyHoe = new PMSHoe("ruby_hoe", rubyToolMaterial);
//
//	
	//Armour
	//Necromite
	public static ArmorMaterial necromiteArmor = EnumHelper.addArmorMaterial("Necromite", References.ModId + ":" + "necromite", 340, new int[]{1, 5, 5, 1}, 30, null, 0);

	public static Item necromiteHelm = new NecromiteArmor("necromite_helm", necromiteArmor, 1, EntityEquipmentSlot.HEAD);
	public static Item necromiteChest = new NecromiteArmor("necromite_chest", necromiteArmor, 1, EntityEquipmentSlot.CHEST);
	public static Item necromiteLeggings = new NecromiteArmor("necromite_leggings", necromiteArmor, 2, EntityEquipmentSlot.LEGS);
	public static Item necromiteBoots = new NecromiteArmor("necromite_boots", necromiteArmor, 1, EntityEquipmentSlot.FEET);
	
	
		//Ruby

	public static ArmorMaterial rubyArmor = EnumHelper.addArmorMaterial("Ruby", References.ModId + ":" + "ruby", 340, new int[]{2, 6, 5, 2}, 30, null, 0);

	public static Item rubyHelm = new RubyArmor("ruby_helm", rubyArmor, 1, EntityEquipmentSlot.HEAD);
	public static Item rubyChest = new RubyArmor("ruby_chest", rubyArmor, 1, EntityEquipmentSlot.CHEST);
	public static Item rubyLeggings = new RubyArmor("ruby_leggings", rubyArmor, 2, EntityEquipmentSlot.LEGS);
	public static Item rubyBoots = new RubyArmor("ruby_boots", rubyArmor, 1, EntityEquipmentSlot.FEET);

	public static Item ruby = new PMSItem("ruby", PMSCreativeTab.pmsM);
	public static Item rubyIngot = new PMSItem("ruby_ingot", PMSCreativeTab.pmsM);
	public static Item necromite = new PMSItem("necromite", PMSCreativeTab.pmsM);
	public static Item necromiteIngot = new PMSItem("necromite_ingot", PMSCreativeTab.pmsM);
	public static Item igneous = new PMSItem("igneous", PMSCreativeTab.pmsM);
	public static Item endorite = new PMSItem("endermite", PMSCreativeTab.pmsM);
	public static Item starDust = new PMSItem("star_dust", PMSCreativeTab.pmsM);
	public static Item pearl = new PMSPearl("pearl");

}