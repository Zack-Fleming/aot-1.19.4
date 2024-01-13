package com.lightning_flash.aot.core.world.features;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.enums.OreTypes;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures
{
    // resource keys
    public static final ResourceKey<PlacedFeature> LIMESTONE_PLACED_KEY = createKey("limestone_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_PLACED_KEY = createKey("marble_placed");

    public static final ResourceKey<PlacedFeature> POOR_ALUMINUM_TOP_PLACED_KEY = createKey("poor_aluminum_top_placed");
    public static final ResourceKey<PlacedFeature> POOR_ALUMINUM_BOT_PLACED_KEY = createKey("poor_aluminum_bot_placed");
    public static final ResourceKey<PlacedFeature> POOR_BERYLLIUM_PLACED_KEY = createKey("poor_beryllium_placed");
    public static final ResourceKey<PlacedFeature> POOR_BORON_PLACED_KEY = createKey("poor_boron_placed");
    public static final ResourceKey<PlacedFeature> POOR_COBALT_PLACED_KEY = createKey("poor_cobalt_placed");
    public static final ResourceKey<PlacedFeature> POOR_COPPER_TOP_PLACED_KEY = createKey("poor_copper_top_placed");
    public static final ResourceKey<PlacedFeature> POOR_COPPER_BOT_PLACED_KEY = createKey("poor_copper_bot_placed");
    public static final ResourceKey<PlacedFeature> POOR_GOLD_PLACED_KEY = createKey("poor_gold_placed");
    public static final ResourceKey<PlacedFeature> POOR_IRON_TOP_PLACED_KEY = createKey("poor_iron_top_placed");
    public static final ResourceKey<PlacedFeature> POOR_IRON_BOT_PLACED_KEY = createKey("poor_iron_bot_placed");
    public static final ResourceKey<PlacedFeature> POOR_LEAD_TOP_PLACED_KEY = createKey("poor_lead_top_placed");
    public static final ResourceKey<PlacedFeature> POOR_LEAD_BOT_PLACED_KEY = createKey("poor_lead_bot_placed");
    public static final ResourceKey<PlacedFeature> POOR_LITHIUM_PLACED_KEY = createKey("poor_lithium_placed");
    public static final ResourceKey<PlacedFeature> POOR_NICKEL_TOP_PLACED_KEY = createKey("poor_nickel_top_placed");
    public static final ResourceKey<PlacedFeature> POOR_NICKEL_BOT_PLACED_KEY = createKey("poor_nickel_bot_placed");
    public static final ResourceKey<PlacedFeature> POOR_PHOSPHORUS_TOP_PLACED_KEY = createKey("poor_phosphorus_top_placed");
    public static final ResourceKey<PlacedFeature> POOR_PHOSPHORUS_BOT_PLACED_KEY = createKey("poor_phosphorus_bot_placed");
    public static final ResourceKey<PlacedFeature> POOR_SILVER_PLACED_KEY = createKey("poor_silver_placed");
    public static final ResourceKey<PlacedFeature> POOR_SULFUR_TOP_PLACED_KEY = createKey("poor_sulfur_top_placed");
    public static final ResourceKey<PlacedFeature> POOR_SULFUR_BOT_PLACED_KEY = createKey("poor_sulfur_bot_placed");
    public static final ResourceKey<PlacedFeature> POOR_THORIUM_PLACED_KEY = createKey("poor_thorium_placed");
    public static final ResourceKey<PlacedFeature> POOR_TIN_TOP_PLACED_KEY = createKey("poor_tin_top_placed");
    public static final ResourceKey<PlacedFeature> POOR_TIN_BOT_PLACED_KEY = createKey("poor_tin_bot_placed");
    public static final ResourceKey<PlacedFeature> POOR_TUNGSTEN_PLACED_KEY = createKey("poor_tungsten_placed");
    public static final ResourceKey<PlacedFeature> POOR_URANIUM_PLACED_KEY = createKey("poor_uranium_placed");
    public static final ResourceKey<PlacedFeature> POOR_ZINC_TOP_PLACED_KEY = createKey("poor_zinc_top_placed");
    public static final ResourceKey<PlacedFeature> POOR_ZINC_BOT_PLACED_KEY = createKey("poor_zinc_bot_placed");
    public static final ResourceKey<PlacedFeature> POOR_ZIRCONIUM_PLACED_KEY = createKey("poor_zirconium_placed");


    // placement configurations
    private static final List<PlacementModifier> NAT_STONE = ModOrePlacement.commonOrePlacement(
            OreTypes.NATURAL_STONES.getNumVeins(),
            HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(OreTypes.NATURAL_STONES.getMinHeight()),
                    VerticalAnchor.absolute(OreTypes.NATURAL_STONES.getMaxHeight())));
    private static final List<PlacementModifier> COM_POOR_TOP = ModOrePlacement.orePlacement(
            CountPlacement.of(OreTypes.COM_POOR_TOP.getNumVeins()),
            HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(OreTypes.COM_POOR_TOP.getMinHeight()),
                    VerticalAnchor.absolute(OreTypes.COM_POOR_TOP.getMaxHeight())));
    private static final List<PlacementModifier> COM_POOR_BOT = ModOrePlacement.orePlacement(
            CountPlacement.of(OreTypes.COM_POOR_BOT.getNumVeins()),
            HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(OreTypes.COM_POOR_BOT.getMinHeight()),
                    VerticalAnchor.absolute(OreTypes.COM_POOR_BOT.getMaxHeight())));
    private static final List<PlacementModifier> COM_RICH = ModOrePlacement.orePlacement(
            CountPlacement.of(OreTypes.COM_RICH.getNumVeins()),
            HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(OreTypes.COM_RICH.getMinHeight()),
                    VerticalAnchor.absolute(OreTypes.COM_RICH.getMaxHeight())));
    private static final List<PlacementModifier> UNC_POOR = ModOrePlacement.orePlacement(
            CountPlacement.of(OreTypes.UNC_POOR.getNumVeins()),
            HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(OreTypes.UNC_POOR.getMinHeight()),
                    VerticalAnchor.absolute(OreTypes.UNC_POOR.getMaxHeight())));
    private static final List<PlacementModifier> UNC_RICH = ModOrePlacement.orePlacement(
            CountPlacement.of(OreTypes.UNC_RICH.getNumVeins()),
            HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(OreTypes.UNC_RICH.getMinHeight()),
                    VerticalAnchor.absolute(OreTypes.UNC_RICH.getMaxHeight())));
    private static final List<PlacementModifier> RAR_POOR = ModOrePlacement.rareOrePlacement(
            OreTypes.RAR_POOR.getNumVeins(),
            HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(OreTypes.RAR_POOR.getMinHeight()),
                    VerticalAnchor.absolute(OreTypes.RAR_POOR.getMaxHeight())));
    private static final List<PlacementModifier> RAR_RICH = ModOrePlacement.rareOrePlacement(
            OreTypes.RAR_RICH.getNumVeins(),
            HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(OreTypes.RAR_RICH.getMinHeight()),
                    VerticalAnchor.absolute(OreTypes.RAR_RICH.getMaxHeight())));


    // registration method
    public static void bootstrap(BootstapContext<PlacedFeature> context)
    {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeature = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, LIMESTONE_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.LIMESTONE_KEY), NAT_STONE);
        register(context, MARBLE_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.MARBLE_KEY), NAT_STONE);

        register(context, POOR_ALUMINUM_TOP_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_ALUMINUM_KEY), COM_POOR_TOP);
        register(context, POOR_ALUMINUM_BOT_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_ALUMINUM_KEY), COM_POOR_BOT);
        register(context, POOR_BERYLLIUM_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_BERYLLIUM_KEY), UNC_POOR);
        register(context, POOR_BORON_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_BORON_KEY), UNC_POOR);
        register(context, POOR_COBALT_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_COBALT_KEY), UNC_POOR);
        register(context, POOR_COPPER_TOP_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_COPPER_KEY), COM_POOR_TOP);
        register(context, POOR_COPPER_BOT_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_COPPER_KEY), COM_POOR_BOT);
        register(context, POOR_GOLD_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_GOLD_KEY), RAR_POOR);
        register(context, POOR_IRON_TOP_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_IRON_KEY), COM_POOR_TOP);
        register(context, POOR_IRON_BOT_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_IRON_KEY), COM_POOR_BOT);
        register(context, POOR_LEAD_TOP_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_LEAD_KEY), COM_POOR_TOP);
        register(context, POOR_LEAD_BOT_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_LEAD_KEY), COM_POOR_BOT);
        register(context, POOR_LITHIUM_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_LITHIUM_KEY), UNC_POOR);
        register(context, POOR_NICKEL_TOP_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_NICKEL_KEY), COM_POOR_TOP);
        register(context, POOR_NICKEL_BOT_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_NICKEL_KEY), COM_POOR_BOT);
        register(context, POOR_PHOSPHORUS_TOP_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_PHOSPHORUS_KEY), COM_POOR_TOP);
        register(context, POOR_PHOSPHORUS_BOT_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_PHOSPHORUS_KEY), COM_POOR_BOT);
        register(context, POOR_SILVER_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_SILVER_KEY), RAR_POOR);
        register(context, POOR_SULFUR_TOP_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_SULFUR_KEY), COM_POOR_TOP);
        register(context, POOR_SULFUR_BOT_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_SULFUR_KEY), COM_POOR_BOT);
        register(context, POOR_THORIUM_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_THORIUM_KEY), UNC_POOR);
        register(context, POOR_TIN_TOP_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_TIN_KEY), COM_POOR_TOP);
        register(context, POOR_TIN_BOT_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_TIN_KEY), COM_POOR_BOT);
        register(context, POOR_TUNGSTEN_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_TUNGSTEN_KEY), UNC_POOR);
        register(context, POOR_URANIUM_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_URANIUM_KEY), UNC_POOR);
        register(context, POOR_ZINC_TOP_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_ZINC_KEY), COM_POOR_TOP);
        register(context, POOR_ZINC_BOT_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_ZINC_KEY), COM_POOR_BOT);
        register(context, POOR_ZIRCONIUM_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.POOR_ZIRCONIUM_KEY), UNC_POOR);
    }


    // helper functions
    private static ResourceKey<PlacedFeature> createKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(AOTMain.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers)
    {
        register(context, key, configuration, List.of(modifiers));
    }
}