package com.lightning_flash.aot.core.objects.enchantments;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class ExcavatorEnchantment extends Enchantment
{
    public ExcavatorEnchantment() { super(Enchantment.Rarity.RARE, EnchantmentCategory.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND}); }

    @Override
    public int getMinCost(int p_44679_) { return 15; }
    @Override
    public int getMaxCost(int p_44691_) { return super.getMaxCost(p_44691_) + 50; }

    @Override
    public int getMaxLevel() { return 5; }
}
