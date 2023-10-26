package com.lightning_flash.aot.core.util;

import com.lightning_flash.aot.core.init.BlockInit;
import net.minecraftforge.registries.RegistryObject;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlockLists
{
    public static List<RegistryObject<?>> POOR_ORES_STONE = new ArrayList<>(Arrays.asList(
            BlockInit.POOR_ORE_ALUMINUM,    BlockInit.POOR_ORE_BERYLLIUM,   BlockInit.POOR_ORE_BORON,
            BlockInit.POOR_ORE_COBALT,      BlockInit.POOR_ORE_COPPER,      BlockInit.POOR_ORE_GOLD,
            BlockInit.POOR_ORE_IRON,        BlockInit.POOR_ORE_LEAD,        BlockInit.POOR_ORE_LITHIUM,
            BlockInit.POOR_ORE_NICKEL,      BlockInit.POOR_ORE_PHOSPHORUS,  BlockInit.POOR_ORE_SILVER,
            BlockInit.POOR_ORE_SULFUR,      BlockInit.POOR_ORE_THORIUM,     BlockInit.POOR_ORE_TIN,
            BlockInit.POOR_ORE_TUNGSTEN,    BlockInit.POOR_ORE_URANIUM,     BlockInit.POOR_ORE_ZINC,
            BlockInit.POOR_ORE_ZIRCONIUM
    ));
    public static List<RegistryObject<?>> POOR_ORES_DEEPSLATE = new ArrayList<>(Arrays.asList(
            BlockInit.DEEPSLATE_POOR_ORE_ALUMINUM,      BlockInit.DEEPSLATE_POOR_ORE_BERYLLIUM,
            BlockInit.DEEPSLATE_POOR_ORE_BORON,         BlockInit.DEEPSLATE_POOR_ORE_COBALT,
            BlockInit.DEEPSLATE_POOR_ORE_COPPER,        BlockInit.DEEPSLATE_POOR_ORE_GOLD,
            BlockInit.DEEPSLATE_POOR_ORE_IRON,          BlockInit.DEEPSLATE_POOR_ORE_LEAD,
            BlockInit.DEEPSLATE_POOR_ORE_LITHIUM,       BlockInit.DEEPSLATE_POOR_ORE_NICKEL,
            BlockInit.DEEPSLATE_POOR_ORE_PHOSPHORUS,    BlockInit.DEEPSLATE_POOR_ORE_SILVER,
            BlockInit.DEEPSLATE_POOR_ORE_SULFUR,        BlockInit.DEEPSLATE_POOR_ORE_THORIUM,
            BlockInit.DEEPSLATE_POOR_ORE_TUNGSTEN,      BlockInit.DEEPSLATE_POOR_ORE_TIN,
            BlockInit.DEEPSLATE_POOR_ORE_URANIUM,       BlockInit.DEEPSLATE_POOR_ORE_ZINC,
            BlockInit.DEEPSLATE_POOR_ORE_ZIRCONIUM
    ));
    public static List<RegistryObject<?>> ORES_STONE = new ArrayList<>(Arrays.asList(
            BlockInit.ORE_ALUMINUM, BlockInit.ORE_BERYLLIUM,    BlockInit.ORE_BORON,
            BlockInit.ORE_COBALT,   BlockInit.ORE_COPPER,       BlockInit.ORE_LEAD,
            BlockInit.ORE_LITHIUM,  BlockInit.ORE_NICKEL,       BlockInit.ORE_PHOSPHORUS,
            BlockInit.ORE_SILVER,   BlockInit.ORE_SULFUR,       BlockInit.ORE_THORIUM,
            BlockInit.ORE_TIN,      BlockInit.ORE_TUNGSTEN,     BlockInit.ORE_URANIUM,
            BlockInit.ORE_ZINC,     BlockInit.ORE_ZIRCONIUM
    ));
    public static List<RegistryObject<?>> ORES_DEEPSLATE = new ArrayList<>(Arrays.asList(
            BlockInit.DEEPSLATE_ORE_ALUMINUM,   BlockInit.DEEPSLATE_ORE_BERYLLIUM,
            BlockInit.DEEPSLATE_ORE_BORON,      BlockInit.DEEPSLATE_ORE_COBALT,
            BlockInit.DEEPSLATE_ORE_LEAD,       BlockInit.DEEPSLATE_ORE_LITHIUM,
            BlockInit.DEEPSLATE_ORE_NICKEL,     BlockInit.DEEPSLATE_ORE_PHOSPHORUS,
            BlockInit.DEEPSLATE_ORE_SILVER,     BlockInit.DEEPSLATE_ORE_SULFUR,
            BlockInit.DEEPSLATE_ORE_THORIUM,    BlockInit.DEEPSLATE_ORE_TIN,
            BlockInit.DEEPSLATE_ORE_TUNGSTEN,   BlockInit.DEEPSLATE_ORE_URANIUM,
            BlockInit.DEEPSLATE_ORE_ZINC,       BlockInit.DEEPSLATE_ORE_ZIRCONIUM
    ));
    public static List<RegistryObject<?>> RESOURCE_BLOCKS = new ArrayList<>(Arrays.asList(
            BlockInit.BlOCK_ALUMINUM,           BlockInit.BlOCK_AMERICIUM,  BlockInit.BlOCK_BERYLLIUM,
            BlockInit.BlOCK_BORON,              BlockInit.BlOCK_BRASS,      BlockInit.BlOCK_BRONZE,
            BlockInit.BlOCK_CAST_IRON,          BlockInit.BlOCK_COAL_COKE,  BlockInit.BlOCK_COBALT,
            BlockInit.BlOCK_COPPER,             BlockInit.BlOCK_GRAPHITE,   BlockInit.BlOCK_LEAD,
            BlockInit.BlOCK_LITHIUM,            BlockInit.BlOCK_MAGNESIUM,  BlockInit.BlOCK_MAGNESIUM_DIBORIDE,
            BlockInit.BlOCK_NEPTUNIUM,          BlockInit.BlOCK_NICKEL,     BlockInit.BlOCK_PHOSPHORUS,
            BlockInit.BlOCK_PIG_IRON,           BlockInit.BlOCK_PLUTONIUM,  BlockInit.BlOCK_POTASSIUM,
            BlockInit.BlOCK_RUBBER,             BlockInit.BlOCK_SILICON,    BlockInit.BlOCK_SILVER,
            BlockInit.BlOCK_SODIUM,             BlockInit.BlOCK_STEEL,      BlockInit.BlOCK_SULFUR,
            BlockInit.BlOCK_THORIUM,            BlockInit.BlOCK_TIN,        BlockInit.BlOCK_TUNGSTEN,
            BlockInit.BlOCK_TUNGSTEN_CARBIDE,   BlockInit.BlOCK_URANIUM,    BlockInit.BlOCK_ZINC,
            BlockInit.BlOCK_ZIRCONIUM
    ));
    public static final List<RegistryObject<?>> RAW_BLOCKS = new ArrayList<>(Arrays.asList(
            BlockInit.RAW_ALUMINUM_BLOCK,
            BlockInit.RAW_BERYLLIUM_BLOCK,
            BlockInit.RAW_BORON_BLOCK,
            BlockInit.RAW_COBALT_BLOCK,
            BlockInit.RAW_LEAD_BLOCK,
            BlockInit.RAW_LITHIUM_BLOCK,
            BlockInit.RAW_NICKEL_BLOCK,
            BlockInit.RAW_PHOSPHORUS_BLOCK,
            BlockInit.RAW_SILVER_BLOCK,
            BlockInit.RAW_SULFUR_BLOCK,
            BlockInit.RAW_THORIUM_BLOCK,
            BlockInit.RAW_TIN_BLOCK,
            BlockInit.RAW_TUNGSTEN_BLOCK,
            BlockInit.RAW_URANIUM_BLOCK,
            BlockInit.RAW_ZINC_BLOCK,
            BlockInit.RAW_COBALT_BLOCK,
            BlockInit.RAW_ZIRCONIUM_BLOCK
    ));
    public static List<RegistryObject<?>> BUILDING_BLOCKS = new ArrayList<>(Arrays.asList(
            BlockInit.LIMESTONE,                        BlockInit.LIMESTONE_SLAB,
            BlockInit.LIMESTONE_STAIRS,                 BlockInit.LIMESTONE_WALL,

            BlockInit.LIMESTONE_BRICKS,                 BlockInit.LIMESTONE_BRICK_SLAB,
            BlockInit.LIMESTONE_BRICK_STAIRS,           BlockInit.LIMESTONE_BRICK_WALL,

            BlockInit.MARBLE,                           BlockInit.MARBLE_SLAB,
            BlockInit.MARBLE_STAIRS,                    BlockInit.MARBLE_WALL,

            BlockInit.POLISHED_MARBLE,                  BlockInit.POLISHED_MARBLE_SLAB,
            BlockInit.POLISHED_MARBLE_STAIRS,           BlockInit.POLISHED_MARBLE_WALL,

            BlockInit.MARBLE_BRICKS,                    BlockInit.MARBLE_BRICK_SLAB,
            BlockInit.MARBLE_BRICK_STAIRS,              BlockInit.MARBLE_BRICK_WALL,

            BlockInit.LARGE_MARBLE_BRICKS,              BlockInit.LARGE_MARBLE_BRICK_SLAB,
            BlockInit.LARGE_MARBLE_BRICK_STAIRS,        BlockInit.LARGE_MARBLE_BRICK_WALL,

            BlockInit.CHISELED_MARBLE,                  BlockInit.CHISELED_MARBLE_SLAB,
            BlockInit.CHISELED_MARBLE_STAIRS,           BlockInit.CHISELED_MARBLE_WALL,

            BlockInit.MARBLE_PILLAR,                    BlockInit.GILDED_MARBLE_PILLAR,

            BlockInit.REFRACTORY_BRICKS,                BlockInit.REFRACTORY_BRICK_SLAB,
            BlockInit.REFRACTORY_BRICK_STAIRS,          BlockInit.REFRACTORY_BRICK_WALL,

            BlockInit.LARGE_REFRACTORY_BRICKS,          BlockInit.LARGE_REFRACTORY_BRICK_SLAB,
            BlockInit.LARGE_REFRACTORY_BRICK_STAIRS,    BlockInit.LARGE_REFRACTORY_BRICK_WALL
    ));

    public static List<RegistryObject<?>> MISC_RESOURCE_BLOCKS = new ArrayList<>(Arrays.asList(
            BlockInit.BLOCK_SLAG,
            BlockInit.REFRACTORY_BRICKS,
            BlockInit.LARGE_REFRACTORY_BRICKS,
            BlockInit.LIMESTONE,
            BlockInit.MARBLE
    ));
}