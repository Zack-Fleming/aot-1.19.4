package com.lightning_flash.aot.core.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit
{
    public static final Tier BONE =
            new ForgeTier(
                    0,
                    88,
                    2.0f,
                    1.0f,
                    8,
                    BlockTags.NEEDS_STONE_TOOL,
                    () -> Ingredient.of(ItemInit.SHARD_BONE.get()));
    public static final Tier FLINT =
            new ForgeTier(
                    1,
                    131,
                    5.0f,
                    1.0f,
                    5,
                    BlockTags.NEEDS_STONE_TOOL,
                    () -> Ingredient.of(ItemInit.FLAKED_FLINT.get()));

    public static final Tier COPPER =
            new ForgeTier(
                    1,
                    250,
                    6.0f,
                    2.0f,
                    14,
                    BlockTags.NEEDS_STONE_TOOL,
                    () -> Ingredient.of(Items.COPPER_INGOT));
    public static final Tier BRONZE =
            new ForgeTier(
                    2,
                    500,
                    7.5f,
                    3.0f,
                    14,
                    BlockTags.NEEDS_IRON_TOOL,
                    () -> Ingredient.of(ItemInit.INGOT_BRONZE.get()));
    public static final Tier STEEL =
            new ForgeTier(
                    3,
                    700,
                    9.0f,
                    4.0f,
                    14,
                    BlockTags.NEEDS_IRON_TOOL,
                    () -> Ingredient.of(ItemInit.INGOT_STEEL.get()));
    public static final Tier TUNGSTEN =
            new ForgeTier(
                    3,
                    1750,
                    10.0f,
                    5.0f,
                    10,
                    BlockTags.NEEDS_DIAMOND_TOOL,
                    () -> Ingredient.of(ItemInit.INGOT_TUNGSTEN.get()));
    public static final Tier TUNGSTEN_CARBIDE =
            new ForgeTier(
                    4,
                    2210,
                    10.0f,
                    6.0f,
                    10,
                    BlockTags.NEEDS_DIAMOND_TOOL,
                    () -> Ingredient.of(ItemInit.INGOT_TUNGSTEN_CARBIDE.get()));
    public static final Tier DEPLETED_URANIUM =
            new ForgeTier(
                    4,
                    2750,
                    11.0f,
                    11.0f,
                    10,
                    BlockTags.NEEDS_DIAMOND_TOOL,
                    () -> Ingredient.of(ItemInit.INGOT_URANIUM.get()));
}