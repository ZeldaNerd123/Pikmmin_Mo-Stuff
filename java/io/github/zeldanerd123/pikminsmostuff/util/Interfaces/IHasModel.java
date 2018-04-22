package io.github.zeldanerd123.pikminsmostuff.util.Interfaces;

import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.util.ResourceLocation;

public interface IHasModel {
	public void registerModels();

	void addPropertyOverride(ResourceLocation key, IItemPropertyGetter getter);
}
