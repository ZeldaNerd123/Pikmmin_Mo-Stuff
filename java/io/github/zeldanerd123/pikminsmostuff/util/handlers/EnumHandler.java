package io.github.zeldanerd123.pikminsmostuff.util.handlers;

import java.util.Map;

import com.google.common.collect.Maps;

import io.github.zeldanerd123.pikminsmostuff.items.metaItems.PMSPearl;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class EnumHandler {

	public enum PearlTypes implements IStringSerializable {
		WHITE("white", 0),
		ROSELINE("roseline", 1),
		PURPLE("purple", 2),
		DARK_GREEN("dark_green", 3),
		MIDNIGHT_BLUE("midnight_blue", 4),
		GOLD("gold", 5),
		GREY("grey", 6),
		BLACK("black", 7);
		private static final Map<Integer, EnumHandler.PearlTypes> META_LOOKUP = Maps.<Integer, EnumHandler.PearlTypes>newHashMap();
		private int meta;
		private String name;
		
		private PearlTypes(String name, int meta) {
			this.meta = meta;
			this.name = name;
		}
		@Override
		public String getName() {			
			return this.name;
		}
		public int getMetadata() {			
			return this.meta;
		}
		
		@Override
		public String toString()  {
			return getName();
		}
		public static EnumHandler.PearlTypes byItemStack(ItemStack stack){
			return stack.getItem() instanceof PMSPearl ? byMetadata(stack.getMetadata()) : WHITE;
			
		}
		  public static EnumHandler.PearlTypes byMetadata(int meta) {
		        EnumHandler.PearlTypes enumhandler$pearltypes = META_LOOKUP.get(Integer.valueOf(meta));
		        return enumhandler$pearltypes  == null ? PearlTypes.WHITE: enumhandler$pearltypes;
		    }
		static {
			for(EnumHandler.PearlTypes enumhandler$pearltypes : values()) {
				META_LOOKUP.put(Integer.valueOf(enumhandler$pearltypes.getMetadata()), enumhandler$pearltypes);
				
			}
		}
	}

  

}