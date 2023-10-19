package com.lightning_flash.aot.core.init;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.objects.blocks.AlkaliResourceBlock;
import com.lightning_flash.aot.core.objects.blocks.ToolTipBlock;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit
{
    // block properties (for similar blocks)
    private static final Item.Properties ITEM_PROPS = ItemInit.PROPERTIES;
    private static final BlockBehaviour.Properties STONE_TYPE = BlockBehaviour.Properties
            .of(Material.STONE, MaterialColor.STONE)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(1.5f, 6.0f);
    private static final BlockBehaviour.Properties ORES = BlockBehaviour.Properties
            .of(Material.STONE, MaterialColor.STONE)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(3.0f, 3.0f);
    private static final BlockBehaviour.Properties RESOURCES = BlockBehaviour.Properties
            .of(Material.METAL, MaterialColor.METAL)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .strength(5.0f, 6.0f);
    private static final BlockBehaviour.Properties RAW_BLOCKS = BlockBehaviour.Properties
            .of(Material.METAL, MaterialColor.METAL)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .strength(5.0f, 6.0f);


    // block registry
    public static final DeferredRegister<Block> MOD_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AOTMain.MODID);

    // limestone stuff
    public static final RegistryObject<Block> LIMESTONE =
            register("limestone", () -> new Block(STONE_TYPE), ITEM_PROPS);
    public static final RegistryObject<Block> LIMESTONE_SLAB =
            register("limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIMESTONE.get())), ITEM_PROPS);
    public static final RegistryObject<Block> LIMESTONE_STAIRS =
            register("limestone_stairs", () -> new StairBlock(LIMESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(LIMESTONE.get())), ITEM_PROPS);
    public static final RegistryObject<Block> LIMESTONE_WALL =
            register("limestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(LIMESTONE.get())), ITEM_PROPS);

    // marble stuff
    public static final RegistryObject<Block> MARBLE =
            register("marble", () -> new Block(STONE_TYPE), ITEM_PROPS);
    public static final RegistryObject<Block> MARBLE_SLAB =
            register("marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MARBLE.get())), ITEM_PROPS);
    public static final RegistryObject<Block> MARBLE_STAIRS =
            register("marble_stairs", () -> new StairBlock(MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MARBLE.get())), ITEM_PROPS);
    public static final RegistryObject<Block> MARBLE_WALL =
            register("marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MARBLE.get())), ITEM_PROPS);

    public static final RegistryObject<Block> POLISHED_MARBLE =
            register("polished_marble", () -> new Block(STONE_TYPE), ITEM_PROPS);
    public static final RegistryObject<Block> POLISHED_MARBLE_SLAB =
            register("polished_marble_slab", ()-> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_MARBLE.get())), ITEM_PROPS);
    public static final RegistryObject<Block> POLISHED_MARBLE_STAIRS =
            register("polished_marble_stairs", () -> new StairBlock(POLISHED_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_MARBLE.get())), ITEM_PROPS);
    public static final RegistryObject<Block> POLISHED_MARBLE_WALL =
            register("polished_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(POLISHED_MARBLE.get())), ITEM_PROPS);

    public static final RegistryObject<Block> MARBLE_BRICKS =
            register("marble_bricks", () -> new Block(STONE_TYPE), ITEM_PROPS);
    public static final RegistryObject<Block> MARBLE_BRICK_SLAB =
            register("marble_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MARBLE_BRICKS.get())), ITEM_PROPS);
    public static final RegistryObject<Block> MARBLE_BRICK_STAIRS =
            register("marble_brick_stairs", () -> new StairBlock(MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MARBLE_BRICKS.get())), ITEM_PROPS);
    public static final RegistryObject<Block> MARBLE_BRICK_WALL =
            register("marble_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MARBLE_BRICKS.get())), ITEM_PROPS);

    public static final RegistryObject<Block> LARGE_MARBLE_BRICKS =
            register("large_marble_bricks", () -> new Block(STONE_TYPE), ITEM_PROPS);
    public static final RegistryObject<Block> LARGE_MARBLE_BRICK_SLAB =
            register("large_marble_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LARGE_MARBLE_BRICKS.get())), ITEM_PROPS);
    public static final RegistryObject<Block> LARGE_MARBLE_BRICK_STAIRS =
            register("large_marble_brick_stairs", () -> new StairBlock(LARGE_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(LARGE_MARBLE_BRICKS.get())), ITEM_PROPS);
    public static final RegistryObject<Block> LARGE_MARBLE_BRICK_WALL =
            register("large_marble_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(LARGE_MARBLE_BRICKS.get())), ITEM_PROPS);

    public static final RegistryObject<Block> MARBLE_PILLAR =
            register("marble_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(MARBLE.get())), ITEM_PROPS);
    public static final RegistryObject<Block> GILDED_MARBLE_PILLAR =
            register("gilded_marble_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(MARBLE.get())), ITEM_PROPS);



    // poor ores
    public static final RegistryObject<Block> POOR_ORE_ALUMINUM =
            register("poor_ore_aluminum", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Aluminum"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_BERYLLIUM =
            register("poor_ore_beryllium", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Beryllium"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_BORON =
            register("poor_ore_boron", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Boron"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_COBALT =
            register("poor_ore_cobalt", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Cobalt"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_COPPER =
            register("poor_ore_copper", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Copper"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_GOLD =
            register("poor_ore_gold", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Gold"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_IRON =
            register("poor_ore_iron", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Iron"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_LEAD =
            register("poor_ore_lead", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Lead"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_LITHIUM =
            register("poor_ore_lithium", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Lithium"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_NICKEL =
            register("poor_ore_nickel", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Nickel"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_PHOSPHORUS =
            register("poor_ore_phosphorus", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Phosphorus"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_SILVER =
            register("poor_ore_silver", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Silver"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_SULFUR =
            register("poor_ore_sulfur", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Sulfur"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_THORIUM =
            register("poor_ore_thorium", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Thorium"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_TIN =
            register("poor_ore_tin", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Tin"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_TUNGSTEN =
            register("poor_ore_tungsten", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Tungsten"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_URANIUM =
            register("poor_ore_uranium", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Uranium"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_ZINC =
            register("poor_ore_zinc", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Zinc"), ITEM_PROPS);
    public static final RegistryObject<Block> POOR_ORE_ZIRCONIUM =
            register("poor_ore_zirconium", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Zirconium"), ITEM_PROPS);

    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_ALUMINUM =
            register("deepslate_poor_ore_aluminum", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Aluminum"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_BERYLLIUM =
            register("deepslate_poor_ore_beryllium", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Beryllium"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_BORON =
            register("deepslate_poor_ore_boron", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Boron"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_COBALT =
            register("deepslate_poor_ore_cobalt", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Cobalt"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_COPPER =
            register("deepslate_poor_ore_copper", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Copper"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_GOLD =
            register("deepslate_poor_ore_gold", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Gold"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_IRON =
            register("deepslate_poor_ore_iron", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Iron"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_LEAD =
            register("deepslate_poor_ore_lead", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Lead"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_LITHIUM =
            register("deepslate_poor_ore_lithium", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Lithium"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_NICKEL =
            register("deepslate_poor_ore_nickel", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Nickel"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_PHOSPHORUS =
            register("deepslate_poor_ore_phosphorus", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Phosphorus"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_SILVER =
            register("deepslate_poor_ore_silver", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Silver"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_SULFUR =
            register("deepslate_poor_ore_sulfur", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Sulfur"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_THORIUM =
            register("deepslate_poor_ore_thorium", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Thorium"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_TIN =
            register("deepslate_poor_ore_tin", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Tin"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_TUNGSTEN =
            register("deepslate_poor_ore_tungsten", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Tungsten"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_URANIUM =
            register("deepslate_poor_ore_uranium",() -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Uranium"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_ZINC =
            register("deepslate_poor_ore_zinc", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Zinc"),ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_POOR_ORE_ZIRCONIUM =
            register("deepslate_poor_ore_zirconium", () -> new ToolTipBlock(ORES,ChatFormatting.DARK_AQUA + "Ore of Zirconium"),ITEM_PROPS);


    // rich ores
    public static final RegistryObject<Block> ORE_ALUMINUM =
            register("ore_aluminum", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Aluminum"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_BERYLLIUM =
            register("ore_beryllium", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Beryllium"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_BORON =
            register("ore_boron", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Boron"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_COBALT =
            register("ore_cobalt", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Cobalt"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_COPPER =
            register("ore_copper", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Copper"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_LEAD =
            register("ore_lead", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Lead"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_LITHIUM =
            register("ore_lithium", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Lithium"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_NICKEL =
            register("ore_nickel", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Nickel"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_PHOSPHORUS =
            register("ore_phosphorus", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Phosphorus"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_SILVER =
            register("ore_silver", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Silver"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_SULFUR =
            register("ore_sulfur", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Sulfur"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_THORIUM =
            register("ore_thorium", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Thorium"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_TIN =
            register("ore_tin", () -> new ToolTipBlock(RESOURCES, ChatFormatting.DARK_AQUA + "Ore of Tin"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_TUNGSTEN =
            register("ore_tungsten", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Tungsten"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_URANIUM =
            register("ore_uranium", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Uranium"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_ZINC =
            register("ore_zinc", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Zinc"), ITEM_PROPS);
    public static final RegistryObject<Block> ORE_ZIRCONIUM =
            register("ore_zirconium", () -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Zirconium"), ITEM_PROPS);

    public static final RegistryObject<Block> DEEPSLATE_ORE_ALUMINUM =
            register("deepslate_ore_aluminum",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Aluminum"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_BERYLLIUM =
            register("deepslate_ore_beryllium",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Beryllium"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_BORON =
            register("deepslate_ore_boron",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Boron"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_COBALT =
            register("deepslate_ore_cobalt",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Cobalt"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_LEAD =
            register("deepslate_ore_lead",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Lead"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_LITHIUM =
            register("deepslate_ore_lithium",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Lithium"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_NICKEL =
            register("deepslate_ore_nickel",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Nickel"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_PHOSPHORUS =
            register("deepslate_ore_phosphorus",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Phosphorus"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_SILVER =
            register("deepslate_ore_silver",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Silver"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_SULFUR =
            register("deepslate_ore_sulfur",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Sulfur"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_THORIUM =
            register("deepslate_ore_thorium",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Thorium"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_TIN =
            register("deepslate_ore_tin",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Tin"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_TUNGSTEN =
            register("deepslate_ore_tungsten",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Tungsten"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_URANIUM =
            register("deepslate_ore_uranium",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Uranium"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_ZINC =
            register("deepslate_ore_zinc",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Zinc"), ITEM_PROPS);
    public static final RegistryObject<Block> DEEPSLATE_ORE_ZIRCONIUM =
            register("deepslate_ore_zirconium",() -> new ToolTipBlock(ORES, ChatFormatting.DARK_AQUA + "Ore of Zirconium"), ITEM_PROPS);


    // resource blocks
    public static final RegistryObject<Block> BlOCK_ALUMINUM =
            register("block_aluminum", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_AMERICIUM =
            register("block_americium", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_BERYLLIUM =
            register("block_beryllium", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_BORON =
            register("block_boron", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_BRASS =
            register("block_brass", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_BRONZE =
            register("block_bronze", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_CAST_IRON =
            register("block_cast_iron", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_COAL_COKE =
            register("block_coal_coke", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_COBALT =
            register("block_cobalt", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_COPPER =
            register("block_copper", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_GRAPHITE =
            register("block_graphite", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_LEAD =
            register("block_lead", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_LITHIUM =
            register("block_lithium", () -> new AlkaliResourceBlock(2, "Do not touch water..."), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_MAGNESIUM =
            register("block_magnesium", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_MAGNESIUM_DIBORIDE =
            register("block_magnesium_diboride", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_NEPTUNIUM =
            register("block_neptunium", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_NICKEL =
            register("block_nickel", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_PHOSPHORUS =
            register("block_phosphorus", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_PIG_IRON =
            register("block_pig_iron", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_PLUTONIUM =
            register("block_plutonium", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_POTASSIUM =
            register("block_potassium", () -> new AlkaliResourceBlock(8, "Do not touch water..."), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_RUBBER =
            register("block_rubber", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_SILICON =
            register("block_silicon", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_SILVER =
            register("block_silver", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_SODIUM =
            register("block_sodium", () -> new AlkaliResourceBlock(4, "Do not touch water..."), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_STEEL =
            register("block_steel", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_SULFUR =
            register("block_sulfur", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_THORIUM =
            register("block_thorium", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_TIN =
            register("block_tin", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_TUNGSTEN =
            register("block_tungsten", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_TUNGSTEN_CARBIDE =
            register("block_tungsten_carbide", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_URANIUM =
            register("block_uranium", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_ZINC =
            register("block_zinc", () -> new Block(RESOURCES), ITEM_PROPS);
    public static final RegistryObject<Block> BlOCK_ZIRCONIUM =
            register("block_zirconium", () -> new Block(RESOURCES), ITEM_PROPS);


    // raw blocks
    public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK =
            register("raw_aluminum_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Aluminum Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_BERYLLIUM_BLOCK =
            register("raw_beryllium_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Beryllium Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_BORON_BLOCK =
            register("raw_boron_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Boron Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_COBALT_BLOCK =
            register("raw_cobalt_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Cobalt Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_LEAD_BLOCK =
            register("raw_lead_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Lead Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_LITHIUM_BLOCK =
            register("raw_lithium_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Lithium Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_NICKEL_BLOCK =
            register("raw_nickel_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Nickel Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_PHOSPHORUS_BLOCK =
            register("raw_phosphorus_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Phosphorus Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_SILVER_BLOCK =
            register("raw_silver_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Silver Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_SULFUR_BLOCK =
            register("raw_sulfur_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Sulfur Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_THORIUM_BLOCK =
            register("raw_thorium_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Thorium Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_TIN_BLOCK =
            register("raw_tin_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Tin Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK =
            register("raw_tungsten_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Tungsten Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_URANIUM_BLOCK =
            register("raw_uranium_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Uranium Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_ZINC_BLOCK =
            register("raw_zinc_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Zinc Block"), ITEM_PROPS);
    public static final RegistryObject<Block> RAW_ZIRCONIUM_BLOCK =
            register("raw_zirconium_block", () -> new ToolTipBlock(RAW_BLOCKS, ChatFormatting.DARK_AQUA + "Raw Zirconium Block"), ITEM_PROPS);


    // misc. machine blocks
    public static final RegistryObject<Block> REFRACTORY_BRICKS =
            register("refractory_bricks", () -> new Block(STONE_TYPE), ITEM_PROPS);
    public static final RegistryObject<Block> REFRACTORY_BRICK_STAIRS =
            register("refractory_brick_stairs", () -> new StairBlock(REFRACTORY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(REFRACTORY_BRICKS.get())), ITEM_PROPS);
    public static final RegistryObject<Block> REFRACTORY_BRICK_SLAB =
            register("refractory_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(REFRACTORY_BRICKS.get())), ITEM_PROPS);
    public static final RegistryObject<Block> REFRACTORY_BRICK_WALL =
            register("refractory_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(REFRACTORY_BRICKS.get())), ITEM_PROPS);


    
    //auto registering of item version of blocks
    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties)
    {
        RegistryObject<T> block = MOD_BLOCKS.register(name, supplier);
        ItemInit.MOD_ITEMS.register(name, () -> new BlockItem(block.get(), properties));

        return block;
    }
}