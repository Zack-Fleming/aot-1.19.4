package com.lightning_flash.aot.core.world.features;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.init.BlockInit;
import com.lightning_flash.aot.enums.OreTypes;
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

import java.util.List;

public class ModConfiguredFeatures
{
    // feature keys
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIMESTONE_KEY = registerKey("limestone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARBLE_KEY = registerKey("marble_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_ALUMINUM_KEY = registerKey("poor_aluminum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_BERYLLIUM_KEY = registerKey("poor_beryllium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_BORON_KEY = registerKey("poor_boron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_COBALT_KEY = registerKey("poor_cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_COPPER_KEY = registerKey("poor_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_GOLD_KEY = registerKey("poor_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_IRON_KEY = registerKey("poor_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_LEAD_KEY = registerKey("poor_lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_LITHIUM_KEY = registerKey("poor_lithium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_NICKEL_KEY = registerKey("poor_nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_PHOSPHORUS_KEY = registerKey("poor_phosphorus_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_SILVER_KEY = registerKey("poor_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_SULFUR_KEY = registerKey("poor_sulfur_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_THORIUM_KEY = registerKey("poor_thorium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_TIN_KEY = registerKey("poor_tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_TUNGSTEN_KEY = registerKey("poor_tungsten_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_URANIUM_KEY = registerKey("poor_uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_ZINC_KEY = registerKey("poor_zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POOR_ZIRCONIUM_KEY = registerKey("poor_zirconium_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINUM_KEY = registerKey("aluminum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERYLLIUM_KEY = registerKey("beryllium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BORON_KEY = registerKey("boron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LITHIUM_KEY = registerKey("lithium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NICKEL_KEY = registerKey("nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PHOSPHORUS_KEY = registerKey("phosphorus_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SULFUR_KEY = registerKey("sulfur_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> THORIUM_KEY = registerKey("thorium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_KEY = registerKey("tungsten_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> URANIUM_KEY = registerKey("uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZINC_KEY = registerKey("zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZIRCONIUM_KEY = registerKey("zirconium_ore");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context)
    {
        // tests for block replacement
        RuleTest replaceStone = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest replaceDeepS = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest replaceNethR = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest replaceEndSt = new BlockMatchTest(Blocks.END_STONE);

        // lists of ores
        List<OreConfiguration.TargetBlockState> limestoneOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.LIMESTONE.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.LIMESTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> marbleOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.MARBLE.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.MARBLE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> poorAluminumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_ALUMINUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_ALUMINUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorBerylliumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_BERYLLIUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_BERYLLIUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorBoronOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_BORON.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_BORON.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorCobaltOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_COBALT.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_COBALT.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorCopperOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_COPPER.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_COPPER.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorGoldOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_GOLD.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_GOLD.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorIronOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_IRON.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_IRON.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorLeadOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_LEAD.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_LEAD.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorLithiumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_LITHIUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_LITHIUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorNickelOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_NICKEL.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_NICKEL.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorPhosphorusOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_PHOSPHORUS.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_PHOSPHORUS.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorSilverOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_SILVER.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_SILVER.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorSulfurOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_SULFUR.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_SULFUR.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorThoriumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_THORIUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_THORIUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorTinOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_TIN.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_TIN.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorTungstenOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_TUNGSTEN.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_TUNGSTEN.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorUraniumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_URANIUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_URANIUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorZincOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_ZINC.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_ZINC.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> poorZirconiumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.POOR_ORE_ZIRCONIUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_POOR_ORE_ZIRCONIUM.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> aluminumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_ALUMINUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_ALUMINUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> berylliumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_BERYLLIUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_BERYLLIUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> boronOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_BORON.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_BORON.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> cobaltOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_COBALT.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_COBALT.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> leadOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_LEAD.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_LEAD.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> lithiumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_LITHIUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_LITHIUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> phosphorusOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_PHOSPHORUS.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_PHOSPHORUS.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> nickelOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_NICKEL.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_NICKEL.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> silverOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_SILVER.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_SILVER.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> sulfurOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_SULFUR.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_SULFUR.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> thoriumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_THORIUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_THORIUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> tinOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_TIN.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_TIN.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> tungstenOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_TUNGSTEN.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_TUNGSTEN.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> uraniumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_URANIUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_TUNGSTEN.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> zincOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_ZINC.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_ZINC.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> zirconiumOres = List.of(
                OreConfiguration.target(replaceStone, BlockInit.ORE_ZIRCONIUM.get().defaultBlockState()),
                OreConfiguration.target(replaceDeepS, BlockInit.DEEPSLATE_ORE_ZIRCONIUM.get().defaultBlockState()));


        // register the new configurations
        register(context, LIMESTONE_KEY, Feature.ORE, new OreConfiguration(limestoneOres, OreTypes.NATURAL_STONES.getVeinSize()));
        register(context, MARBLE_KEY,    Feature.ORE, new OreConfiguration(marbleOres, OreTypes.NATURAL_STONES.getVeinSize()));

        register(context, POOR_ALUMINUM_KEY, Feature.ORE, new OreConfiguration(poorAluminumOres, OreTypes.COM_POOR_TOP.getVeinSize()));
        register(context, POOR_BERYLLIUM_KEY, Feature.ORE, new OreConfiguration(poorBerylliumOres, OreTypes.UNC_POOR.getVeinSize()));
        register(context, POOR_BORON_KEY, Feature.ORE, new OreConfiguration(poorBoronOres, OreTypes.UNC_POOR.getVeinSize()));
        register(context, POOR_COBALT_KEY, Feature.ORE, new OreConfiguration(poorCobaltOres, OreTypes.UNC_POOR.getVeinSize()));
        register(context, POOR_COPPER_KEY, Feature.ORE, new OreConfiguration(poorCopperOres, OreTypes.COM_POOR_TOP.getVeinSize()));
        register(context, POOR_GOLD_KEY, Feature.ORE, new OreConfiguration(poorGoldOres, OreTypes.RAR_POOR.getVeinSize()));
        register(context, POOR_IRON_KEY, Feature.ORE, new OreConfiguration(poorIronOres, OreTypes.COM_POOR_TOP.getVeinSize()));
        register(context, POOR_LEAD_KEY, Feature.ORE, new OreConfiguration(poorLeadOres, OreTypes.COM_POOR_TOP.getVeinSize()));
        register(context, POOR_LITHIUM_KEY, Feature.ORE, new OreConfiguration(poorLithiumOres, OreTypes.UNC_POOR.getVeinSize()));
        register(context, POOR_NICKEL_KEY, Feature.ORE, new OreConfiguration(poorNickelOres, OreTypes.COM_POOR_TOP.getVeinSize()));
        register(context, POOR_PHOSPHORUS_KEY, Feature.ORE, new OreConfiguration(poorPhosphorusOres, OreTypes.COM_POOR_TOP.getVeinSize()));
        register(context, POOR_SILVER_KEY, Feature.ORE, new OreConfiguration(poorSilverOres, OreTypes.RAR_POOR.getVeinSize()));
        register(context, POOR_SULFUR_KEY, Feature.ORE, new OreConfiguration(poorSulfurOres, OreTypes.COM_POOR_TOP.getVeinSize()));
        register(context, POOR_THORIUM_KEY, Feature.ORE, new OreConfiguration(poorThoriumOres, OreTypes.UNC_POOR.getVeinSize()));
        register(context, POOR_TIN_KEY, Feature.ORE, new OreConfiguration(poorTinOres, OreTypes.COM_POOR_TOP.getVeinSize()));
        register(context, POOR_TUNGSTEN_KEY, Feature.ORE, new OreConfiguration(poorTungstenOres, OreTypes.RAR_POOR.getVeinSize()));
        register(context, POOR_URANIUM_KEY, Feature.ORE, new OreConfiguration(poorUraniumOres, OreTypes.UNC_POOR.getVeinSize()));
        register(context, POOR_ZINC_KEY, Feature.ORE, new OreConfiguration(poorZincOres, OreTypes.COM_POOR_TOP.getVeinSize()));
        register(context, POOR_ZIRCONIUM_KEY, Feature.ORE, new OreConfiguration(poorZirconiumOres, OreTypes.UNC_POOR.getVeinSize()));

        register(context, ALUMINUM_KEY,Feature.ORE, new OreConfiguration(aluminumOres, OreTypes.COM_RICH.getVeinSize()));
        register(context, BERYLLIUM_KEY,Feature.ORE, new OreConfiguration(berylliumOres, OreTypes.UNC_RICH.getVeinSize()));
        register(context, BORON_KEY,Feature.ORE, new OreConfiguration(boronOres, OreTypes.UNC_RICH.getVeinSize()));
        register(context, COBALT_KEY,Feature.ORE, new OreConfiguration(cobaltOres, OreTypes.UNC_RICH.getVeinSize()));
        register(context, LEAD_KEY,Feature.ORE, new OreConfiguration(leadOres, OreTypes.COM_RICH.getVeinSize()));
        register(context, LITHIUM_KEY,Feature.ORE, new OreConfiguration(lithiumOres, OreTypes.UNC_RICH.getVeinSize()));
        register(context, PHOSPHORUS_KEY,Feature.ORE, new OreConfiguration(phosphorusOres, OreTypes.COM_RICH.getVeinSize()));
        register(context, NICKEL_KEY,Feature.ORE, new OreConfiguration(nickelOres, OreTypes.COM_RICH.getVeinSize()));
        register(context, SILVER_KEY,Feature.ORE, new OreConfiguration(silverOres, OreTypes.RAR_RICH.getVeinSize()));
        register(context, SULFUR_KEY,Feature.ORE, new OreConfiguration(sulfurOres, OreTypes.COM_RICH.getVeinSize()));
        register(context, THORIUM_KEY,Feature.ORE, new OreConfiguration(thoriumOres, OreTypes.UNC_RICH.getVeinSize()));
        register(context, TIN_KEY,Feature.ORE, new OreConfiguration(tinOres, OreTypes.COM_RICH.getVeinSize()));
        register(context, TUNGSTEN_KEY,Feature.ORE, new OreConfiguration(tungstenOres, OreTypes.UNC_RICH.getVeinSize()));
        register(context, URANIUM_KEY,Feature.ORE, new OreConfiguration(uraniumOres, OreTypes.UNC_RICH.getVeinSize()));
        register(context, ZINC_KEY,Feature.ORE, new OreConfiguration(zincOres, OreTypes.COM_RICH.getVeinSize()));
        register(context, ZIRCONIUM_KEY,Feature.ORE, new OreConfiguration(zirconiumOres, OreTypes.UNC_RICH.getVeinSize()));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(AOTMain.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}