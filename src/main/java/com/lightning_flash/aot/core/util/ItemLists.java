package com.lightning_flash.aot.core.util;

import com.lightning_flash.aot.core.init.BlockInit;
import com.lightning_flash.aot.core.init.EnchantmentInit;
import com.lightning_flash.aot.core.init.ItemInit;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemLists
{
    public static List<RegistryObject<?>> DEBUG = new ArrayList<>(Arrays.asList(
            ItemInit.DEBUG_STICK, ItemInit.ITEM_WAND, ItemInit.BLOCK_WAND, ItemInit.PARTICLE_WAND
    ));
    public static List<RegistryObject<?>> TOOLS = new ArrayList<>(Arrays.asList(
            ItemInit.CRUDE_SIRE_STARTER,    ItemInit.AXE_BONE,          ItemInit.HOE_BONE,
            ItemInit.PICKAXE_BONE,          ItemInit.SHOVEL_BONE,       ItemInit.SWORD_BONE,
            ItemInit.AXE_FLINT,             ItemInit.HOE_FLINT,         ItemInit.PICKAXE_FLINT,
            ItemInit.SHOVEL_FLINT,          ItemInit.SWORD_FLINT,       ItemInit.SCYTHE_WOODEN,
            ItemInit.SCYTHE_BONE,           ItemInit.SCYTHE_FLINT,      ItemInit.SCYTHE_STONE,
            ItemInit.CRUDE_PLANT_SIFTER,    ItemInit.CRUDE_STRING_SIFTER,   ItemInit.HAMMER_WOODEN,
            ItemInit.HAMMER_BONE,           ItemInit.HAMMER_FLINT,      ItemInit.HAMMER_STONE,
            ItemInit.WOODEN_TREETAP
    ));
    public static List<RegistryObject<?>> SMALL_RAW_ORES = new ArrayList<>(Arrays.asList(
            ItemInit.SMALL_RAW_ALUMINUM,    ItemInit.SMALL_RAW_BERYLLIUM,   ItemInit.SMALL_RAW_BORON,
            ItemInit.SMALL_RAW_COBALT,      ItemInit.SMALL_RAW_COPPER,      ItemInit.SMALL_RAW_IRON,
            ItemInit.SMALL_RAW_GOLD,        ItemInit.SMALL_RAW_LEAD,        ItemInit.SMALL_RAW_LITHIUM,
            ItemInit.SMALL_RAW_NICKEL,      ItemInit.SMALL_RAW_PHOSPHORUS,  ItemInit.SMALL_RAW_SILVER,
            ItemInit.SMALL_RAW_SULFUR,      ItemInit.SMALL_RAW_THORIUM,     ItemInit.SMALL_RAW_TIN,
            ItemInit.SMALL_RAW_TUNGSTEN,    ItemInit.SMALL_RAW_URANIUM,     ItemInit.SMALL_RAW_ZINC,
            ItemInit.SMALL_RAW_ZIRCONIUM
    ));
    public static List<RegistryObject<?>> RAW_ORES = new ArrayList<>(Arrays.asList(
            ItemInit.RAW_ALUMINUM,    ItemInit.RAW_BERYLLIUM,   ItemInit.RAW_BORON,
            ItemInit.RAW_COBALT,      ItemInit.RAW_LEAD,        ItemInit.RAW_LITHIUM,
            ItemInit.RAW_NICKEL,      ItemInit.RAW_PHOSPHORUS,  ItemInit.RAW_SILVER,
            ItemInit.RAW_SULFUR,      ItemInit.RAW_THORIUM,     ItemInit.RAW_TIN,
            ItemInit.RAW_TUNGSTEN,    ItemInit.RAW_URANIUM,     ItemInit.RAW_ZINC,
            ItemInit.RAW_ZIRCONIUM,   ItemInit.RAW_RUBBER
    ));
    public static List<RegistryObject<?>> INGOTS = new ArrayList<>(Arrays.asList(
            ItemInit.INGOT_ALUMINUM,    ItemInit.INGOT_AMERICIUM,           ItemInit.INGOT_BERYLLIUM,
            ItemInit.INGOT_BORON,       ItemInit.INGOT_BRASS,               ItemInit.INGOT_BRONZE,
            ItemInit.INGOT_CAST_IRON,   ItemInit.COAL_COKE,                 ItemInit.INGOT_COBALT,
            ItemInit.INGOT_COPPER,      ItemInit.INGOT_GRAPHITE,            ItemInit.INGOT_LEAD,
            ItemInit.INGOT_LITHIUM,     ItemInit.INGOT_MAGNESIUM,           ItemInit.INGOT_MAGNESIUM_DIBORIDE,
            ItemInit.INGOT_NEPTUNIUM,   ItemInit.INGOT_NICKEL,              ItemInit.INGOT_PIG_IRON,
            ItemInit.INGOT_PLUTONIUM,   ItemInit.INGOT_POTASSIUM,           ItemInit.INGOT_RUBBER,
            ItemInit.INGOT_SILICON,     ItemInit.INGOT_SILVER,              ItemInit.INGOT_SODIUM,
            ItemInit.INGOT_STEEL,       ItemInit.INGOT_THORIUM,             ItemInit.INGOT_TIN,
            ItemInit.INGOT_TUNGSTEN,    ItemInit.INGOT_TUNGSTEN_CARBIDE,    ItemInit.INGOT_URANIUM,
            ItemInit.INGOT_ZINC,        ItemInit.INGOT_ZIRCONIUM
    ));
    public static List<RegistryObject<?>> DUSTS = new ArrayList<>(Arrays.asList(
            ItemInit.DUST_ALUMINUM,     ItemInit.DUST_AMERICIUM,    ItemInit.DUST_BERYLLIUM,
            ItemInit.DUST_BORON,        ItemInit.DUST_BRASS,        ItemInit.DUST_BRONZE,
            ItemInit.DUST_CAST_IRON,    ItemInit.DUST_COAL_COKE,    ItemInit.DUST_COBALT,
            ItemInit.DUST_COPPER,       ItemInit.DUST_GOLD,         ItemInit.DUST_GRAPHITE,
            ItemInit.DUST_IRON,         ItemInit.DUST_LEAD,         ItemInit.DUST_LIMESTONE,
            ItemInit.DUST_LITHIUM,      ItemInit.DUST_MAGNESIUM,    ItemInit.DUST_MAGNESIUM_DIBORIDE,
            ItemInit.DUST_NEPTUNIUM,    ItemInit.DUST_NICKEL,       ItemInit.DUST_PHOSPHORUS,
            ItemInit.DUST_PIG_IRON,     ItemInit.DUST_PLUTONIUM,    ItemInit.DUST_POTASSIUM,
            ItemInit.DUST_SILICON,      ItemInit.DUST_SILVER,       ItemInit.DUST_SODIUM,
            ItemInit.DUST_STEEL,        ItemInit.DUST_SULFUR,       ItemInit.DUST_THORIUM,
            ItemInit.DUST_TIN,          ItemInit.DUST_TUNGSTEN,     ItemInit.DUST_TUNGSTEN_CARBIDE,
            ItemInit.DUST_URANIUM,      ItemInit.DUST_ZINC,         ItemInit.DUST_ZIRCONIUM
    ));
    public static List<RegistryObject<?>> NUGGETS = new ArrayList<>(Arrays.asList(
            ItemInit.NUGGET_ALUMINUM,   ItemInit.NUGGET_AMERICIUM,          ItemInit.NUGGET_BERYLLIUM,
            ItemInit.NUGGET_BORON,      ItemInit.NUGGET_BRASS,              ItemInit.NUGGET_BRONZE,
            ItemInit.NUGGET_CAST_IRON,  ItemInit.NUGGET_COBALT,             ItemInit.NUGGET_COPPER,
            ItemInit.NUGGET_GRAPHITE,   ItemInit.NUGGET_LEAD,               ItemInit.NUGGET_LITHIUM,
            ItemInit.NUGGET_MAGNESIUM,  ItemInit.NUGGET_MAGNESIUM_DIBORIDE, ItemInit.NUGGET_NEPTUNIUM,
            ItemInit.NUGGET_NICKEL,     ItemInit.NUGGET_PIG_IRON,           ItemInit.NUGGET_PLUTONIUM,
            ItemInit.NUGGET_POTASSIUM,  ItemInit.NUGGET_SILICON,            ItemInit.NUGGET_SILVER,
            ItemInit.NUGGET_SODIUM,     ItemInit.NUGGET_STEEL,              ItemInit.NUGGET_THORIUM,
            ItemInit.NUGGET_TIN,        ItemInit.NUGGET_TUNGSTEN,           ItemInit.NUGGET_TUNGSTEN_CARBIDE,
            ItemInit.NUGGET_URANIUM,    ItemInit.NUGGET_ZINC,               ItemInit.NUGGET_ZIRCONIUM
    ));
    public static List<RegistryObject<?>> SMALL_DUSTS = new ArrayList<>(Arrays.asList(
            ItemInit.SMALL_DUST_ALUMINUM,           ItemInit.SMALL_DUST_AMERICIUM,      ItemInit.SMALL_DUST_BERYLLIUM,
            ItemInit.SMALL_DUST_BORON,              ItemInit.SMALL_DUST_BRASS,          ItemInit.SMALL_DUST_BRONZE,
            ItemInit.SMALL_DUST_CAST_IRON,          ItemInit.SMALL_DUST_COBALT,         ItemInit.SMALL_DUST_COPPER,
            ItemInit.SMALL_DUST_GOLD,               ItemInit.SMALL_DUST_GRAPHITE,       ItemInit.SMALL_DUST_IRON,
            ItemInit.SMALL_DUST_LEAD,               ItemInit.SMALL_DUST_LITHIUM,        ItemInit.SMALL_DUST_MAGNESIUM,
            ItemInit.SMALL_DUST_MAGNESIUM_DIBORIDE, ItemInit.SMALL_DUST_NEPTUNIUM,      ItemInit.SMALL_DUST_NICKEL,
            ItemInit.SMALL_DUST_PHOSPHORUS,         ItemInit.SMALL_DUST_PIG_IRON,       ItemInit.SMALL_DUST_PLUTONIUM,
            ItemInit.SMALL_DUST_POTASSIUM,          ItemInit.SMALL_DUST_SILICON,        ItemInit.SMALL_DUST_SILVER,
            ItemInit.SMALL_DUST_SODIUM,             ItemInit.SMALL_DUST_STEEL,          ItemInit.SMALL_DUST_SULFUR,
            ItemInit.SMALL_DUST_THORIUM,            ItemInit.SMALL_DUST_TIN,            ItemInit.SMALL_DUST_TUNGSTEN,
            ItemInit.SMALL_DUST_TUNGSTEN_CARBIDE,   ItemInit.SMALL_DUST_URANIUM,        ItemInit.SMALL_DUST_ZINC,
            ItemInit.SMALL_DUST_ZIRCONIUM
    ));
    public static List<RegistryObject<?>> STONE_AGE_RESOURCES = new ArrayList<>(Arrays.asList(
            ItemInit.SHARD_STONE,       ItemInit.SHARD_BONE,            ItemInit.LEATHER_TANNED,
            ItemInit.PLANT_FIBER,       ItemInit.DRIED_PLANT_FIBER,     ItemInit.MESH_PLANT_FIBER,
            ItemInit.MESH_STRING,       ItemInit.REFRACTORY_CEMENT,     ItemInit.REFRACTORY_BRICK,
            ItemInit.SLAG,              ItemInit.FLAKED_FLINT,          ItemInit.RAW_TREE_SAP,
            ItemInit.TREE_SAP_GLUE,     ItemInit.CRUDE_TOOL_BINDING
    ));
}