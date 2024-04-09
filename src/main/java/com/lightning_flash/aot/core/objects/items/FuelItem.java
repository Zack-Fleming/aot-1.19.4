package com.lightning_flash.aot.core.objects.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class FuelItem extends Item
{
    private final int burnTime;
    private final int maxTemp;

    public FuelItem(Properties prop, int burnTime, int maxTemp)
    {
        super(prop);
        this.burnTime = burnTime;
        this.maxTemp = maxTemp;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) { return this.burnTime; }

    public int getMaxTemp(ItemStack itemStack, @Nullable RecipeType<?> recipeType) { return this.maxTemp; }
}