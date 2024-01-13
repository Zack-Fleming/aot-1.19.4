package com.lightning_flash.aot.core.world.features;

import com.lightning_flash.aot.AOTMain;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures
{
    // resource keys
    public static final ResourceKey<PlacedFeature> LIMESTONE_PLACED_KEY = createKey("limestone_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_PLACED_KEY = createKey("marble_placed");


    // registration method
    public static void bootstrap(BootstapContext<PlacedFeature> context)
    {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeature = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, LIMESTONE_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.LIMESTONE_KEY),
                ModOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(140))));
        register(context, MARBLE_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeatures.MARBLE_KEY),
                ModOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(140))));
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