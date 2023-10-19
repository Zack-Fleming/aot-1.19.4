package com.lightning_flash.aot.core.world.features;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.enums.OreTypes;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures
{
//    // helper constants
//    private static final List<PlacementModifier> COM_POOR_TOP = orePlacement(
//            CountPlacement.of(OreTypes.COM_POOR_TOP.getNumVeins()),
//            HeightRangePlacement.triangle(
//                    VerticalAnchor.absolute(OreTypes.COM_POOR_TOP.getMinHeight()),
//                    VerticalAnchor.absolute(OreTypes.COM_POOR_TOP.getMaxHeight())));
//    private static final List<PlacementModifier> COM_POOR_BOT = orePlacement(
//            CountPlacement.of(OreTypes.COM_POOR_BOT.getNumVeins()),
//            HeightRangePlacement.triangle(
//                    VerticalAnchor.absolute(OreTypes.COM_POOR_BOT.getMinHeight()),
//                    VerticalAnchor.absolute(OreTypes.COM_POOR_BOT.getMaxHeight())));
//    private static final List<PlacementModifier> COM_RICH = orePlacement(
//            CountPlacement.of(OreTypes.COM_RICH.getNumVeins()),
//            HeightRangePlacement.triangle(
//                    VerticalAnchor.absolute(OreTypes.COM_RICH.getMinHeight()),
//                    VerticalAnchor.absolute(OreTypes.COM_RICH.getMaxHeight())));
//    private static final List<PlacementModifier> UNC_POOR = orePlacement(
//            CountPlacement.of(OreTypes.UNC_POOR.getNumVeins()),
//            HeightRangePlacement.triangle(
//                    VerticalAnchor.absolute(OreTypes.UNC_POOR.getMinHeight()),
//                    VerticalAnchor.absolute(OreTypes.UNC_POOR.getMaxHeight())));
//    private static final List<PlacementModifier> UNC_RICH = orePlacement(
//            CountPlacement.of(OreTypes.UNC_RICH.getNumVeins()),
//            HeightRangePlacement.triangle(
//                    VerticalAnchor.absolute(OreTypes.UNC_RICH.getMinHeight()),
//                    VerticalAnchor.absolute(OreTypes.UNC_RICH.getMaxHeight())));
//    private static final List<PlacementModifier> RAR_POOR = rareOrePlacement(
//            OreTypes.RAR_POOR.getNumVeins(),
//            HeightRangePlacement.triangle(
//                    VerticalAnchor.absolute(OreTypes.RAR_POOR.getMinHeight()),
//                    VerticalAnchor.absolute(OreTypes.RAR_POOR.getMaxHeight())));
//    private static final List<PlacementModifier> RAR_RICH = rareOrePlacement(
//            OreTypes.RAR_RICH.getNumVeins(),
//            HeightRangePlacement.triangle(
//                    VerticalAnchor.absolute(OreTypes.RAR_RICH.getMinHeight()),
//                    VerticalAnchor.absolute(OreTypes.RAR_RICH.getMaxHeight())));
//
//    public static final DeferredRegister<PlacedFeature> MOD_PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, AOTMain.MODID);
//
//    // natural stone variants
//    public static final RegistryObject<PlacedFeature> LIMESTONE =
//        MOD_PLACED_FEATURES.register("limestone_ore",
//                () -> new PlacedFeature(ModConfiguredFeatures.LIMESTONE.getHolder().get(), commonOrePlacement(2,
//                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)))));
//    public static final RegistryObject<PlacedFeature> MARBLE =
//        MOD_PLACED_FEATURES.register("marble_ore",
//                () -> new PlacedFeature(ModConfiguredFeatures.MARBLE.getHolder().get(), commonOrePlacement(2,
//                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)))));
//
//
//    // poor ores
//    public static final RegistryObject<PlacedFeature> POOR_ORE_ALUMINUM_TOP =
//            MOD_PLACED_FEATURES.register("poor_ore_aluminum_top",
//                    () -> new PlacedFeature(ModConfiguredFeatures.POOR_ORE_ALUMINUM.getHolder().get(), COM_POOR_TOP));
//    public static final RegistryObject<PlacedFeature> POOR_ORE_ALUMINUM_BOT =
//            MOD_PLACED_FEATURES.register("poor_ore_aluminum_bottom",
//                    () -> new PlacedFeature(ModConfiguredFeatures.POOR_ORE_ALUMINUM.getHolder().get(), COM_POOR_BOT));
//
//    public static final RegistryObject<PlacedFeature> POOR_ORE_BERYLLIUM =
//            MOD_PLACED_FEATURES.register("poor_ore_beryllium",
//                    () -> new PlacedFeature(ModConfiguredFeatures.POOR_ORE_BERYLLIUM.getHolder().get(), UNC_POOR));
//
//    public static final RegistryObject<PlacedFeature> POOR_ORE_BORON =
//            MOD_PLACED_FEATURES.register("poor_ore_boron",
//                    () -> new PlacedFeature(ModConfiguredFeatures.POOR_ORE_BORON.getHolder().get(), UNC_POOR));
//    public static final RegistryObject<PlacedFeature> POOR_ORE_COBALT =
//            MOD_PLACED_FEATURES.register("poor_ore_cobalt",
//                    () -> new PlacedFeature(ModConfiguredFeatures.POOR_ORE_COBALT.getHolder().get(), UNC_POOR));
//
//    public static final RegistryObject<PlacedFeature> POOR_ORE_COPPER_TOP =
//            MOD_PLACED_FEATURES.register("poor_ore_copper_top",
//                    () -> new PlacedFeature(ModConfiguredFeatures.POOR_ORE_COPPER.getHolder().get(), COM_POOR_TOP));
//    public static final RegistryObject<PlacedFeature> POOR_ORE_COPPER_BOT =
//            MOD_PLACED_FEATURES.register("poor_ore_copper_bottom",
//                    () -> new PlacedFeature(ModConfiguredFeatures.POOR_ORE_COPPER.getHolder().get(), COM_POOR_BOT));
//
//    public static final RegistryObject<PlacedFeature> POOR_ORE_GOLD =
//            MOD_PLACED_FEATURES.register("poor_ore_gold",
//                    () -> new PlacedFeature(ModConfiguredFeatures.POOR_ORE_GOLD.getHolder().get(), RAR_POOR));
//
//
//
//    /* HELPER METHODS */
//    public static List<PlacementModifier> orePlacement(PlacementModifier modifier1, PlacementModifier modifier2)
//    {
//        return List.of(modifier1, InSquarePlacement.spread(), modifier2, BiomeFilter.biome());
//    }
//
//    public static List<PlacementModifier> commonOrePlacement(int numVeins, PlacementModifier modifier)
//    {
//        return orePlacement(CountPlacement.of(numVeins), modifier);
//    }
//
//    public static List<PlacementModifier> rareOrePlacement(int numVeins, PlacementModifier modifier)
//    {
//        return orePlacement(RarityFilter.onAverageOnceEvery(numVeins), modifier);
//    }
//    /* END OF HELPER METHODS */
//
//    public static void register(IEventBus eventBus)
//    {
//        MOD_PLACED_FEATURES.register(eventBus);
//    }
}