package com.lightning_flash.aot.core.world.features;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.init.BlockInit;
import com.lightning_flash.aot.enums.OreTypes;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures
{
//    // values to hold the vein size of the ore types
//    private static final int COM_POOR_VS = OreTypes.COM_POOR_BOT.getVeinSize();
//    private static final int COM_RICH_VS = OreTypes.COM_RICH.getVeinSize();
//    private static final int UNC_POOR_VS = OreTypes.UNC_POOR.getVeinSize();
//    private static final int UNC_RICH_VS = OreTypes.UNC_RICH.getVeinSize();
//    private static final int RAR_POOR_VS = OreTypes.RAR_POOR.getVeinSize();
//    private static final int RAR_RICH_VS = OreTypes.RAR_RICH.getVeinSize();
//
//
//    // main features registry
//    public static final DeferredRegister<ConfiguredFeature<?, ?>> MOD_FEATURES =
//            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, AOTMain.MODID);
//
//
//    // stone variants
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> LIMESTONE_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.LIMESTONE.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.LIMESTONE.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> MARBLE_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.MARBLE.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.MARBLE.get().defaultBlockState())));
//
//
//    // poor ore replacement configs
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_ALUMINUM_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_ALUMINUM.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_ALUMINUM.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_BERYLLIUM_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_BERYLLIUM.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_BERYLLIUM.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_BORON_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_BORON.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_BORON.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_COBALT_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_COBALT.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_COBALT.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_COPPER_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_COPPER.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_COPPER.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_GOLD_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_GOLD.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_GOLD.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_IRON_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_IRON.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_IRON.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_LEAD_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_LEAD.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_LEAD.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_LITHIUM_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_LITHIUM.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_LITHIUM.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_NICKEL_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_NICKEL.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_NICKEL.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_PHOSPHORUS_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_PHOSPHORUS.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_PHOSPHORUS.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_SILVER_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_SILVER.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_SILVER.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_SULFUR_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_SULFUR.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_SULFUR.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_TIN_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_TIN.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_TIN.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_THORIUM_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_THORIUM.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_THORIUM.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_TUNGSTEN_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_TUNGSTEN.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_TUNGSTEN.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_URANIUM_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_URANIUM.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_URANIUM.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_ZINC_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_ZINC.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_ZINC.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> POOR_ZIRCONIUM_ORES =
//            Suppliers.memoize(() -> List.of(
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.POOR_ORE_ZIRCONIUM.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.DEEPSLATE_POOR_ORE_ZIRCONIUM.get().defaultBlockState())));
//
//
//
//    // register placement configs
//    public static final RegistryObject<ConfiguredFeature<?, ?>> LIMESTONE = MOD_FEATURES.register("limestone",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(LIMESTONE_ORES.get(), 60)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> MARBLE = MOD_FEATURES.register("marble",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(MARBLE_ORES.get(), 60)));
//
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_ALUMINUM = MOD_FEATURES.register("poor_ore_aluminum",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_ALUMINUM_ORES.get(), COM_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_BERYLLIUM = MOD_FEATURES.register("poor_ore_beryllium",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_BERYLLIUM_ORES.get(), UNC_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_BORON = MOD_FEATURES.register("poor_ore_boron",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_BORON_ORES.get(), UNC_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_COBALT = MOD_FEATURES.register("poor_ore_cobalt",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_COBALT_ORES.get(), UNC_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_COPPER = MOD_FEATURES.register("poor_ore_copper",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_COPPER_ORES.get(), COM_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_GOLD = MOD_FEATURES.register("poor_ore_gold",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_GOLD_ORES.get(), RAR_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_IRON = MOD_FEATURES.register("poor_ore_iron",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_IRON_ORES.get(), COM_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_LEAD = MOD_FEATURES.register("poor_ore_lead",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_LEAD_ORES.get(), COM_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_LITHIUM = MOD_FEATURES.register("poor_ore_lithium",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_LITHIUM_ORES.get(), UNC_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_NICKEL = MOD_FEATURES.register("poor_ore_nickel",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_NICKEL_ORES.get(), COM_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_PHOSPHORUS = MOD_FEATURES.register("poor_ore_phosphorus",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_PHOSPHORUS_ORES.get(), COM_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_SILVER = MOD_FEATURES.register("poor_ore_silver",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_SILVER_ORES.get(), COM_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_SULFUR = MOD_FEATURES.register("poor_ore_sulfur",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_SULFUR_ORES.get(), COM_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_TIN = MOD_FEATURES.register("poor_ore_tin",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_TIN_ORES.get(), COM_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_THORIUM = MOD_FEATURES.register("poor_ore_thorium",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_THORIUM_ORES.get(), UNC_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_TUNGSTEN = MOD_FEATURES.register("poor_ore_tungsten",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_TUNGSTEN_ORES.get(), UNC_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_URANIUM = MOD_FEATURES.register("poor_ore_uranium",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_URANIUM_ORES.get(), UNC_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_ZINC = MOD_FEATURES.register("poor_ore_zinc",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_ZINC_ORES.get(), COM_POOR_VS)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> POOR_ORE_ZIRCONIUM = MOD_FEATURES.register("poor_ore_zirconium",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(POOR_ZIRCONIUM_ORES.get(), COM_POOR_VS)));
//
//
//    public static void register(IEventBus eventBus)
//    {
//        MOD_FEATURES.register(eventBus);
//    }
}