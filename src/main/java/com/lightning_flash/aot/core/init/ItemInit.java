package com.lightning_flash.aot.core.init;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.objects.items.FuelItem;
import com.lightning_flash.aot.core.objects.items.ShardItem;
import com.lightning_flash.aot.core.objects.items.tools.*;
import com.lightning_flash.aot.core.objects.items.tools.debug.BlockWand;
import com.lightning_flash.aot.core.objects.items.tools.debug.DebugStick;
import com.lightning_flash.aot.core.objects.items.tools.debug.ItemWand;
import com.lightning_flash.aot.core.objects.items.tools.debug.ParticleWand;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit
{
    // item tab properties
    public static final Item.Properties PROPERTIES = new Item.Properties();
    public static final Item.Properties PROPERTIES_TOOL = new Item.Properties().stacksTo(1);


    // registry of modded items
    public static final DeferredRegister<Item> MOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AOTMain.MODID);


    // debugging tools
    public static final RegistryObject<Item> DEBUG_STICK = MOD_ITEMS.register("debug_stick", DebugStick::new);
    public static final RegistryObject<Item> ITEM_WAND = MOD_ITEMS.register("item_wand", ItemWand::new);
    public static final RegistryObject<Item> BLOCK_WAND = MOD_ITEMS.register("block_wand", BlockWand::new);
    public static final RegistryObject<Item> PARTICLE_WAND = MOD_ITEMS.register("particle_wand", ParticleWand::new);

    public static final RegistryObject<Item> SMALL_RAW_ALUMINUM = MOD_ITEMS.register("small_raw_aluminum", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_BERYLLIUM = MOD_ITEMS.register("small_raw_beryllium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_BORON = MOD_ITEMS.register("small_raw_boron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_COBALT = MOD_ITEMS.register("small_raw_cobalt", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_COPPER = MOD_ITEMS.register("small_raw_copper", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_IRON = MOD_ITEMS.register("small_raw_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_GOLD = MOD_ITEMS.register("small_raw_gold", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_LEAD = MOD_ITEMS.register("small_raw_lead", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_LITHIUM = MOD_ITEMS.register("small_raw_lithium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_NICKEL = MOD_ITEMS.register("small_raw_nickel", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_PHOSPHORUS = MOD_ITEMS.register("small_raw_phosphorus", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_SILVER = MOD_ITEMS.register("small_raw_silver", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_SULFUR = MOD_ITEMS.register("small_raw_sulfur", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_THORIUM = MOD_ITEMS.register("small_raw_thorium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_TIN = MOD_ITEMS.register("small_raw_tin", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_TUNGSTEN = MOD_ITEMS.register("small_raw_tungsten", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_URANIUM = MOD_ITEMS.register("small_raw_uranium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_ZINC = MOD_ITEMS.register("small_raw_zinc", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_RAW_ZIRCONIUM = MOD_ITEMS.register("small_raw_zirconium", () -> new Item(PROPERTIES));

    public static final RegistryObject<Item> RAW_ALUMINUM = MOD_ITEMS.register("raw_aluminum", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_BERYLLIUM = MOD_ITEMS.register("raw_beryllium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_BORON = MOD_ITEMS.register("raw_boron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_COBALT = MOD_ITEMS.register("raw_cobalt", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_LEAD = MOD_ITEMS.register("raw_lead", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_LITHIUM = MOD_ITEMS.register("raw_lithium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_NICKEL = MOD_ITEMS.register("raw_nickel", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_PHOSPHORUS = MOD_ITEMS.register("raw_phosphorus", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_RUBBER = MOD_ITEMS.register("raw_rubber", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_SILVER = MOD_ITEMS.register("raw_silver", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_SULFUR = MOD_ITEMS.register("raw_sulfur", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_THORIUM = MOD_ITEMS.register("raw_thorium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_TIN = MOD_ITEMS.register("raw_tin", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_TUNGSTEN = MOD_ITEMS.register("raw_tungsten", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_URANIUM = MOD_ITEMS.register("raw_uranium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_ZINC = MOD_ITEMS.register("raw_zinc", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_ZIRCONIUM = MOD_ITEMS.register("raw_zirconium", () -> new Item(PROPERTIES));

    public static final RegistryObject<Item> INGOT_ALUMINUM = MOD_ITEMS.register("ingot_aluminum", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_AMERICIUM = MOD_ITEMS.register("ingot_americium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_BERYLLIUM = MOD_ITEMS.register("ingot_beryllium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_BORON = MOD_ITEMS.register("ingot_boron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_BRASS = MOD_ITEMS.register("ingot_brass", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_BRONZE = MOD_ITEMS.register("ingot_bronze", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_CAST_IRON = MOD_ITEMS.register("ingot_cast_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> COAL_COKE = MOD_ITEMS.register("coal_coke", () -> new FuelItem(PROPERTIES, 3200, 2500));
    public static final RegistryObject<Item> INGOT_COBALT = MOD_ITEMS.register("ingot_cobalt", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_COPPER = MOD_ITEMS.register("ingot_copper", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_GRAPHITE = MOD_ITEMS.register("ingot_graphite", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_LEAD = MOD_ITEMS.register("ingot_lead", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_LITHIUM = MOD_ITEMS.register("ingot_lithium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_MAGNESIUM = MOD_ITEMS.register("ingot_magnesium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_MAGNESIUM_DIBORIDE = MOD_ITEMS.register("ingot_magnesium_diboride", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_NEPTUNIUM = MOD_ITEMS.register("ingot_neptunium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_NICKEL = MOD_ITEMS.register("ingot_nickel", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_PIG_IRON = MOD_ITEMS.register("ingot_pig_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_PLUTONIUM = MOD_ITEMS.register("ingot_plutonium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_POTASSIUM = MOD_ITEMS.register("ingot_potassium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_RUBBER = MOD_ITEMS.register("ingot_rubber", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_SILICON = MOD_ITEMS.register("ingot_silicon", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_SILVER = MOD_ITEMS.register("ingot_silver", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_SODIUM = MOD_ITEMS.register("ingot_sodium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_STEEL = MOD_ITEMS.register("ingot_steel", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_THORIUM = MOD_ITEMS.register("ingot_thorium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_TIN = MOD_ITEMS.register("ingot_tin", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_TUNGSTEN = MOD_ITEMS.register("ingot_tungsten", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_TUNGSTEN_CARBIDE = MOD_ITEMS.register("ingot_tungsten_carbide", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_URANIUM = MOD_ITEMS.register("ingot_uranium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_ZINC = MOD_ITEMS.register("ingot_zinc", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> INGOT_ZIRCONIUM = MOD_ITEMS.register("ingot_zirconium", () -> new Item(PROPERTIES));


    public static final RegistryObject<Item> DUST_ALUMINUM = MOD_ITEMS.register("dust_aluminum", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_AMERICIUM = MOD_ITEMS.register("dust_americium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_BERYLLIUM = MOD_ITEMS.register("dust_beryllium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_BORON = MOD_ITEMS.register("dust_boron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_BRASS = MOD_ITEMS.register("dust_brass", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_BRONZE = MOD_ITEMS.register("dust_bronze", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_CAST_IRON = MOD_ITEMS.register("dust_cast_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_COAL_COKE = MOD_ITEMS.register("dust_coal_coke", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_COBALT = MOD_ITEMS.register("dust_cobalt", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_COPPER = MOD_ITEMS.register("dust_copper", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_GOLD = MOD_ITEMS.register("dust_gold", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_GRAPHITE = MOD_ITEMS.register("dust_graphite", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_IRON = MOD_ITEMS.register("dust_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_LEAD = MOD_ITEMS.register("dust_lead", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_LIMESTONE = MOD_ITEMS.register("dust_limestone", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_LITHIUM = MOD_ITEMS.register("dust_lithium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_MAGNESIUM = MOD_ITEMS.register("dust_magnesium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_MAGNESIUM_DIBORIDE = MOD_ITEMS.register("dust_magnesium_diboride", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_NEPTUNIUM = MOD_ITEMS.register("dust_neptunium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_NICKEL = MOD_ITEMS.register("dust_nickel", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_PHOSPHORUS = MOD_ITEMS.register("dust_phosphorus", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_PIG_IRON = MOD_ITEMS.register("dust_pig_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_PLUTONIUM = MOD_ITEMS.register("dust_plutonium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_POTASSIUM = MOD_ITEMS.register("dust_potassium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_SILICON = MOD_ITEMS.register("dust_silicon", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_SILVER = MOD_ITEMS.register("dust_silver", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_SODIUM = MOD_ITEMS.register("dust_sodium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_STEEL = MOD_ITEMS.register("dust_steel", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_SULFUR = MOD_ITEMS.register("dust_sulfur", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_TIN = MOD_ITEMS.register("dust_tin", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_THORIUM = MOD_ITEMS.register("dust_thorium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_TUNGSTEN = MOD_ITEMS.register("dust_tungsten", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_TUNGSTEN_CARBIDE = MOD_ITEMS.register("dust_tungsten_carbide", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_URANIUM = MOD_ITEMS.register("dust_uranium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_ZINC = MOD_ITEMS.register("dust_zinc", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DUST_ZIRCONIUM = MOD_ITEMS.register("dust_zirconium", () -> new Item(PROPERTIES));

    public static final RegistryObject<Item> NUGGET_ALUMINUM = MOD_ITEMS.register("nugget_aluminum", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_AMERICIUM = MOD_ITEMS.register("nugget_americium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_BERYLLIUM = MOD_ITEMS.register("nugget_beryllium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_BORON = MOD_ITEMS.register("nugget_boron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_BRASS = MOD_ITEMS.register("nugget_brass", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_BRONZE = MOD_ITEMS.register("nugget_bronze", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_CAST_IRON = MOD_ITEMS.register("nugget_cast_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_COBALT = MOD_ITEMS.register("nugget_cobalt", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_COPPER = MOD_ITEMS.register("nugget_copper", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_GRAPHITE = MOD_ITEMS.register("nugget_graphite", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_LEAD = MOD_ITEMS.register("nugget_lead", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_LITHIUM = MOD_ITEMS.register("nugget_lithium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_MAGNESIUM = MOD_ITEMS.register("nugget_magnesium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_MAGNESIUM_DIBORIDE = MOD_ITEMS.register("nugget_magnesium_diboride", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_NEPTUNIUM = MOD_ITEMS.register("nugget_neptunium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_NICKEL = MOD_ITEMS.register("nugget_nickel", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_PIG_IRON = MOD_ITEMS.register("nugget_pig_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_PLUTONIUM = MOD_ITEMS.register("nugget_plutonium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_POTASSIUM = MOD_ITEMS.register("nugget_potassium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_SILICON = MOD_ITEMS.register("nugget_silicon", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_SILVER = MOD_ITEMS.register("nugget_silver", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_SODIUM = MOD_ITEMS.register("nugget_sodium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_STEEL = MOD_ITEMS.register("nugget_steel", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_TIN = MOD_ITEMS.register("nugget_tin", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_THORIUM = MOD_ITEMS.register("nugget_thorium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_TUNGSTEN = MOD_ITEMS.register("nugget_tungsten", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_TUNGSTEN_CARBIDE = MOD_ITEMS.register("nugget_tungsten_carbide", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_URANIUM = MOD_ITEMS.register("nugget_uranium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_ZINC = MOD_ITEMS.register("nugget_zinc", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> NUGGET_ZIRCONIUM = MOD_ITEMS.register("nugget_zirconium", () -> new Item(PROPERTIES));

    public static final RegistryObject<Item> SMALL_DUST_ALUMINUM = MOD_ITEMS.register("small_dust_aluminum", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_AMERICIUM = MOD_ITEMS.register("small_dust_americium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_BERYLLIUM = MOD_ITEMS.register("small_dust_beryllium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_BORON = MOD_ITEMS.register("small_dust_boron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_BRASS = MOD_ITEMS.register("small_dust_brass", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_BRONZE = MOD_ITEMS.register("small_dust_bronze", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_CAST_IRON = MOD_ITEMS.register("small_dust_cast_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_COBALT = MOD_ITEMS.register("small_dust_cobalt", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_COPPER = MOD_ITEMS.register("small_dust_copper", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_GOLD = MOD_ITEMS.register("small_dust_gold", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_GRAPHITE = MOD_ITEMS.register("small_dust_graphite", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_IRON = MOD_ITEMS.register("small_dust_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_LEAD = MOD_ITEMS.register("small_dust_lead", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_LITHIUM = MOD_ITEMS.register("small_dust_lithium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_MAGNESIUM = MOD_ITEMS.register("small_dust_magnesium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_MAGNESIUM_DIBORIDE = MOD_ITEMS.register("small_dust_magnesium_diboride", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_NEPTUNIUM = MOD_ITEMS.register("small_dust_neptunium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_NICKEL = MOD_ITEMS.register("small_dust_nickel", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_PHOSPHORUS = MOD_ITEMS.register("small_dust_phosphorus", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_PIG_IRON = MOD_ITEMS.register("small_dust_pig_iron", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_PLUTONIUM = MOD_ITEMS.register("small_dust_plutonium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_POTASSIUM = MOD_ITEMS.register("small_dust_potassium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_SILICON = MOD_ITEMS.register("small_dust_silicon", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_SILVER = MOD_ITEMS.register("small_dust_silver", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_SODIUM = MOD_ITEMS.register("small_dust_sodium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_STEEL = MOD_ITEMS.register("small_dust_steel", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_SULFUR = MOD_ITEMS.register("small_dust_sulfur", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_TIN = MOD_ITEMS.register("small_dust_tin", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_THORIUM = MOD_ITEMS.register("small_dust_thorium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_TUNGSTEN = MOD_ITEMS.register("small_dust_tungsten", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_TUNGSTEN_CARBIDE = MOD_ITEMS.register("small_dust_tungsten_carbide", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_URANIUM = MOD_ITEMS.register("small_dust_uranium", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_ZINC = MOD_ITEMS.register("small_dust_zinc", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> SMALL_DUST_ZIRCONIUM = MOD_ITEMS.register("small_dust_zirconium", () -> new Item(PROPERTIES));


    public static final RegistryObject<Item> SLAG = MOD_ITEMS.register("slag", () -> new Item(PROPERTIES));


    /* STONE AGE UPDATE ITEMS */
    public static final RegistryObject<Item> SHARD_STONE = MOD_ITEMS.register("shard_stone", ShardItem::new);
    public static final RegistryObject<Item> SHARD_BONE = MOD_ITEMS.register("shard_bone", ShardItem::new);
    public static final RegistryObject<Item> FLAKED_FLINT = MOD_ITEMS.register("flaked_flint", ShardItem::new);
    public static final RegistryObject<Item> LEATHER_TANNED = MOD_ITEMS.register("leather_tanned", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> PLANT_FIBER = MOD_ITEMS.register("plant_fiber", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> DRIED_PLANT_FIBER = MOD_ITEMS.register("dried_plant_fiber", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> MESH_PLANT_FIBER = MOD_ITEMS.register("mesh_plant_fiber", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> MESH_STRING = MOD_ITEMS.register("mesh_string", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> RAW_TREE_SAP = MOD_ITEMS.register("raw_tree_sap", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> TREE_SAP_GLUE = MOD_ITEMS.register("tree_sap_glue", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> CRUDE_TOOL_BINDING = MOD_ITEMS.register("crude_tool_binding", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> BONE_SPLINTER = MOD_ITEMS.register("bone_splinter", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> BONE_NEEDLE_AND_THREAD = MOD_ITEMS.register("bone_needle_and_thread", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> ANCIENT_TEXTILES = MOD_ITEMS.register("ancient_textiles", () -> new Item(PROPERTIES));

    public static final RegistryObject<Item> LEATHER_WATER_JUG = MOD_ITEMS.register("leather_water_jug", () -> new WaterJug(32, 2000));
    public static final RegistryObject<Item> CRUDE_SIRE_STARTER = MOD_ITEMS.register("crude_fire_starter", () -> new FireStarter(48));

    public static final RegistryObject<Item> REFRACTORY_CEMENT = MOD_ITEMS.register("refractory_cement", () -> new Item(PROPERTIES));
    public static final RegistryObject<Item> REFRACTORY_BRICK = MOD_ITEMS.register("refractory_brick", () -> new Item(PROPERTIES));

    public static final RegistryObject<AxeItem> AXE_BONE = MOD_ITEMS.register("axe_bone", () -> new AxeItem(TierInit.BONE, 6.0F, -3.2F, PROPERTIES_TOOL));
    public static final RegistryObject<HoeItem> HOE_BONE = MOD_ITEMS.register("hoe_bone", () -> new HoeItem(TierInit.BONE, 0, -3.0f, PROPERTIES_TOOL));
    public static final RegistryObject<PickaxeItem> PICKAXE_BONE = MOD_ITEMS.register("pickaxe_bone", () -> new PickaxeItem(TierInit.BONE, 1, -2.8F, PROPERTIES_TOOL));
    public static final RegistryObject<ShovelItem> SHOVEL_BONE = MOD_ITEMS.register("shovel_bone", () -> new ShovelItem(TierInit.BONE, 1.5F, -3.0F, PROPERTIES_TOOL));
    public static final RegistryObject<SwordItem> SWORD_BONE = MOD_ITEMS.register("sword_bone", () -> new SwordItem(TierInit.BONE, 3, -2.4F, PROPERTIES_TOOL));

    public static final RegistryObject<AxeItem> AXE_FLINT = MOD_ITEMS.register("axe_flint", () -> new AxeItem(TierInit.FLINT, 7.0F, -3.2F, PROPERTIES_TOOL));
    public static final RegistryObject<HoeItem> HOE_FLINT = MOD_ITEMS.register("hoe_flint", () -> new HoeItem(TierInit.FLINT, -1, -2.0f, PROPERTIES_TOOL));
    public static final RegistryObject<PickaxeItem> PICKAXE_FLINT = MOD_ITEMS.register("pickaxe_flint", () -> new PickaxeItem(TierInit.FLINT, 1, -2.8F, PROPERTIES_TOOL));
    public static final RegistryObject<ShovelItem> SHOVEL_FLINT = MOD_ITEMS.register("shovel_flint", () -> new ShovelItem(TierInit.FLINT, 1.5F, -3.0F, PROPERTIES_TOOL));
    public static final RegistryObject<SwordItem> SWORD_FLINT = MOD_ITEMS.register("sword_flint", () -> new SwordItem(TierInit.FLINT, 3, -2.4F, PROPERTIES_TOOL));

    public static final RegistryObject<HoeItem> SCYTHE_WOODEN = MOD_ITEMS.register("scythe_wooden", () -> new ScytheItem(Tiers.WOOD, 0, -3.0f));
    public static final RegistryObject<HoeItem> SCYTHE_STONE = MOD_ITEMS.register("scythe_stone", () -> new ScytheItem(Tiers.STONE, -1, -2.0f));
    public static final RegistryObject<HoeItem> SCYTHE_BONE = MOD_ITEMS.register("scythe_bone", () -> new ScytheItem(TierInit.BONE, 0, -3.0f));
    public static final RegistryObject<HoeItem> SCYTHE_FLINT = MOD_ITEMS.register("scythe_flint", () -> new ScytheItem(TierInit.FLINT, -1, -2.0f));

    public static final RegistryObject<Item> CRUDE_PLANT_SIFTER = MOD_ITEMS.register("crude_plant_sifter", () -> new Sifter(Tiers.WOOD, 0, -3.0f, 32));
    public static final RegistryObject<Item> CRUDE_STRING_SIFTER = MOD_ITEMS.register("crude_string_sifter", () -> new Sifter(Tiers.WOOD, 0, -3.0f,64));

    public static final RegistryObject<Item> HAMMER_WOODEN = MOD_ITEMS.register("hammer_wooden", () -> new HammerTool(32));
    public static final RegistryObject<Item> HAMMER_STONE = MOD_ITEMS.register("hammer_stone", () -> new HammerTool(64));
    public static final RegistryObject<Item> HAMMER_BONE = MOD_ITEMS.register("hammer_bone", () -> new HammerTool(48));
    public static final RegistryObject<Item> HAMMER_FLINT = MOD_ITEMS.register("hammer_flint", () -> new HammerTool(64));

    public static final RegistryObject<Item> WOODEN_TREETAP = MOD_ITEMS.register("wooden_treetap", () -> new Treetap(64));
}