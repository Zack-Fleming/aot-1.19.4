package com.lightning_flash.aot.core.objects.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

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

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tip, TooltipFlag flag)
    {
        super.appendHoverText(stack, level, tip, flag);
        tip.add(Component.literal(ChatFormatting.YELLOW + "Smelts " + (burnTime / 200) + " items/fuel [" + ((burnTime / 200) * stack.getCount()) + " for this stack]" ));
    }
}