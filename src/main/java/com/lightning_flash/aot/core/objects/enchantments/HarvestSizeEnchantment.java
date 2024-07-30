package com.lightning_flash.aot.core.objects.enchantments;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class HarvestSizeEnchantment extends Enchantment
{
    public HarvestSizeEnchantment() { super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND}); }

    @Override
    public int getMinCost(int p_45092_) {
        return 15 + (p_45092_ - 1) * 9;
    }
    @Override
    public int getMaxCost(int p_45096_) {
        return super.getMinCost(p_45096_) + 50;
    }

    @Override
    public int getMaxLevel() { return 3; }
}