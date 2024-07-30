package com.lightning_flash.aot.core.objects.enchantments;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import org.jetbrains.annotations.NotNull;

public class AutoSmeltEnchantment extends Enchantment
{
    public AutoSmeltEnchantment() { super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND}); }

    @Override
    public int getMinCost(int p_44679_) { return 15; }
    @Override
    public int getMaxCost(int p_44691_) { return super.getMaxCost(p_44691_) + 50; }

    @Override
    protected boolean checkCompatibility(@NotNull Enchantment enchantment)
    {
        return super.checkCompatibility(enchantment) && (enchantment != Enchantments.SILK_TOUCH || enchantment != Enchantments.BLOCK_FORTUNE);
    }
}
