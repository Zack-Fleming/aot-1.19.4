package com.lightning_flash.aot.core.objects.enchantments;

import com.lightning_flash.aot.core.objects.items.tools.ScytheItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class AutoPlantEnchantment extends Enchantment
{
    public AutoPlantEnchantment() { super(Enchantment.Rarity.RARE, EnchantmentCategory.create("SCYTHE", (item) -> item instanceof ScytheItem), new EquipmentSlot[]{EquipmentSlot.MAINHAND}); }



    @Override
    public int getMinCost(int p_45092_) {
        return 15 + (p_45092_ - 1) * 9;
    }
    @Override
    public int getMaxCost(int p_45096_) {
        return super.getMinCost(p_45096_) + 50;
    }

    @Override
    public boolean canEnchant(@NotNull ItemStack stack) { return stack.getItem() instanceof ScytheItem || super.canEnchant(stack); }


}