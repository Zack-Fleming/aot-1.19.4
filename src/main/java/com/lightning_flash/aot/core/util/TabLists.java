package com.lightning_flash.aot.core.util;

import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class TabLists
{
    // creative tab item lists
    public static List<RegistryObject<?>> DEBUG_TAB_ITEMS = new ArrayList<>(){
        {
            addAll(ItemLists.DEBUG);
        }
    };
    public static List<RegistryObject<?>> TOOL_TAB_ITEMS = new ArrayList<>(){
        {
            addAll(ItemLists.TOOLS);
        }
    };
    public static List<RegistryObject<?>> RESOURCE_TAB_ITEMS = new ArrayList<>(){
        {
            addAll(ItemLists.SMALL_RAW_ORES);
            addAll(ItemLists.RAW_ORES);
            addAll(ItemLists.INGOTS);
            addAll(ItemLists.DUSTS);
            addAll(ItemLists.NUGGETS);
            addAll(ItemLists.SMALL_DUSTS);

            addAll(BlockLists.POOR_ORES_STONE);
            addAll(BlockLists.POOR_ORES_DEEPSLATE);
            addAll(BlockLists.ORES_STONE);
            addAll(BlockLists.ORES_DEEPSLATE);
            addAll(BlockLists.RESOURCE_BLOCKS);
            addAll(BlockLists.RAW_BLOCKS);
            addAll(BlockLists.MISC_RESOURCE_BLOCKS);

            addAll(ItemLists.STONE_AGE_RESOURCES);
        }
    };
    public static List<RegistryObject<?>> BUILDING_TAB_ITEMS = new ArrayList<>(){
        {
            addAll(BlockLists.BUILDING_BLOCKS);
        }
    };
}