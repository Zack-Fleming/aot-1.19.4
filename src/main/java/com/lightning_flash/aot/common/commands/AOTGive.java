package com.lightning_flash.aot.common.commands;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.init.ItemInit;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.Map;

public class AOTGive
{
    private static String itemName = "";
    private static Item item;

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher)
    {
        // create the command
        LiteralArgumentBuilder<CommandSourceStack> aotGive =
                Commands.literal(AOTMain.MODID)
                        .requires(source -> source.hasPermission(4))
                        .then(Commands.literal("-g")
                                .then(Commands.literal("-a")
                                        .then(Commands.literal("raw_chunks")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1,64))
                                                        .executes(context -> executeAOT(context,"Chunk","",
                                                                IntegerArgumentType.getInteger(context,"amount"))
                                                        )
                                                )
                                        )
                                        .then(Commands.literal("raw_ores")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context,"Raw","Chunk",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        )
                                        .then(Commands.literal("raw_blocks")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context, "Raw", "Block",
                                                                IntegerArgumentType.getInteger(context, "amount")))
                                                )
                                        )
                                        .then(Commands.literal("poor_ores")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context,"Poor","Deepslate",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        )
                                        .then(Commands.literal("poor_deepslate_ores")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context, "Deepslate Poor", "",
                                                                IntegerArgumentType.getInteger(context, "amount")))
                                                )
                                        )
                                        .then(Commands.literal("rich_ores")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context,"Ore","Poor",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        )
                                        .then(Commands.literal("rich_deepslate_ores")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context, "Deepslate", "Poor",
                                                                IntegerArgumentType.getInteger(context, "amount")))
                                                )
                                        )
                                        .then(Commands.literal("blocks")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context,"Block","",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        )
                                        .then(Commands.literal("ingots")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context,"Ingot","",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        )
                                        .then(Commands.literal("dusts")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context,"Dust","Small",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        )
                                        .then(Commands.literal("nuggets")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context,"Nugget","",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        )
                                        .then(Commands.literal("small_dusts")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeAOT(context,"Small","",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        )
                                )
                                .then(Commands.literal("-m")
                                        .then(Commands.literal("dyes")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeMC(context, "dye", "item",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        ).then(Commands.literal("wools")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeMC(context, "wool", "block",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        )
                                        .then(Commands.literal("carpets")
                                                .then(Commands.argument("amount", IntegerArgumentType.integer(1, 64))
                                                        .executes(context -> executeMC(context, "carpet", "block",
                                                                IntegerArgumentType.getInteger(context, "amount"))
                                                        )
                                                )
                                        )
                                )
                        );

        dispatcher.register(aotGive); // send command to dispatcher
    }

    static int executeAOT(CommandContext<CommandSourceStack> context, String name, String opposite, int num)
    {
        try
        {
            ServerPlayer player = context.getSource().getPlayerOrException();

            for (RegistryObject<Item> itemRegistryObject : ItemInit.MOD_ITEMS.getEntries())
            {
                item = itemRegistryObject.get().asItem();
                itemName = item.getName(new ItemStack(item)).getString();

                if (name.equals("Raw"))
                {
                    if (opposite.equals("Chunk"))
                    {
                        if (itemName.contains(name) && !itemName.contains(opposite) && !itemName.contains("Block"))
                        {
                            player.displayClientMessage(Component.literal("given: " + itemName + " * " + num), false);
                            player.getInventory().add(new ItemStack(item, num));
                        }
                    }
                    else if (opposite.equals("Block"))
                    {
                        if (itemName.contains(name) && itemName.contains(opposite))
                        {
                            player.displayClientMessage(Component.literal("given: " + itemName + " * " + num), false);
                            player.getInventory().add(new ItemStack(item, num));
                        }
                    }
                }
                else
                {
                    if ((opposite.isEmpty() && itemName.contains(name)) || (itemName.contains(name) && !itemName.contains(opposite)))
                    {
                        player.displayClientMessage(Component.literal("given: " + itemName + " * " + num), false);
                        player.getInventory().add(new ItemStack(item, num));
                    }
                }
            }
        }
        catch (CommandSyntaxException e) { AOTMain.LOGGER.error(e.getMessage()); }

        return Command.SINGLE_SUCCESS;
    }

    static int executeMC(CommandContext<CommandSourceStack> context, String name, String registry, int num)
    {
        try
        {
            ServerPlayer player = context.getSource().getPlayerOrException();

            if (registry.equals("item"))
            {
                for (Item item : ForgeRegistries.ITEMS)
                {
                    String iname = item.getName(new ItemStack(item)).getContents().toString();
                    if (iname.contains("minecraft"))
                    {
                        String[] temp = iname.split("[.']");

                        if (temp[3].contains(name))
                            player.getInventory().add(new ItemStack(item, num));
                    }
                }
            }
            else if (registry.equals("block"))
            {
                for (Block block : ForgeRegistries.BLOCKS)
                {
                    String bname = block.getName().getContents().toString();
                    if (bname.contains("minecraft"))
                    {
                        String[] temp = bname.split("[.']");

                        if (temp[3].contains(name))
                            player.getInventory().add(new ItemStack(block.asItem(), num));
                    }
                }
            }
        }
        catch (CommandSyntaxException e) { AOTMain.LOGGER.error(e.getMessage()); }

        return Command.SINGLE_SUCCESS;
    }
}
