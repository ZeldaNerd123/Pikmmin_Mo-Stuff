package io.github.zeldanerd123.pikminsmostuff.util.handlers;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SubItemPropertyGetter implements IItemPropertyGetter{

    @SideOnly(Side.CLIENT)
	public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
    	return stack.getItemDamage();
	}
}
