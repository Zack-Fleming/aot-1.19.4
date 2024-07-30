package com.lightning_flash.aot.core.objects.items.tools;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Sifter extends ShovelItem
{


    public Sifter(Tier tier, float atkBase, float atkSpd, int uses) {
        super(tier, atkBase, atkSpd,
                new Item.Properties()
                        .stacksTo(1)
                        .durability(uses));
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> component, @NotNull TooltipFlag flag)
    {
        component.add(Component.literal( ChatFormatting.DARK_AQUA + "Used to sift materials from blocks. Effective on (Green blocks are implemented): " +
                ChatFormatting.RED + "[Dirt, Grass, Gravel, Sand, Red Sand, Soul Sand, and Clay]. "));
    }
}