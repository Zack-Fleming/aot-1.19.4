package com.lightning_flash.aot.core.world.features;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.init.BlockInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.Tags;

import java.util.List;

public class ModConfiguredFeatures
{
    // feature keys
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIMESTONE_KEY = registerKey("limestone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARBLE_KEY = registerKey("marble_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context)
    {
        // tests for block replacement
        RuleTest replaceStone = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest replaceDeepS = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest replaceNethR = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest replaceendSt = new BlockMatchTest(Blocks.END_STONE);

        // lists of ores
        List<OreConfiguration.TargetBlockState> limestoneOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.LIMESTONE.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.LIMESTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> marbleOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.MARBLE.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.MARBLE.get().defaultBlockState()));


        // register the new configurations
        register(context, LIMESTONE_KEY, Feature.ORE, new OreConfiguration(limestoneOres, 30));
        register(context, MARBLE_KEY, Feature.ORE, new OreConfiguration(marbleOres, 30));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(AOTMain.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}