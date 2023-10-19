package com.lightning_flash.aot.common.commands;

import com.google.common.collect.Lists;
import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.common.commands.enums.OutEnum;
import com.lightning_flash.aot.common.commands.enums.ModEnum;
import com.lightning_flash.aot.common.commands.enums.RegEnum;
import com.lightning_flash.aot.core.init.BlockInit;
import com.lightning_flash.aot.core.init.ItemInit;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class AOTRegTest
{
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher)
    {
        LiteralArgumentBuilder<CommandSourceStack> aotRegTest =
                Commands.literal(AOTMain.MODID).requires(context -> context.hasPermission(4));

        for (OutEnum output : OutEnum.values())
            for (ModEnum mod : ModEnum.values())
                for (RegEnum reg : RegEnum.values())
                {
                    aotRegTest.then(Commands.literal("-r")
                        .then(Commands.literal(output.getValue())
                            .then(Commands.literal(mod.getValue())
                                .then(Commands.literal(reg.getValue())
                                    .executes(context -> execute(context, mod, reg, output))
                                )
                            )
                        )
                    );
                }

        dispatcher.register(aotRegTest);
    }

    static int execute(CommandContext<CommandSourceStack> context, ModEnum modID, RegEnum reg, OutEnum out)
    {
        try {
            ServerPlayer player = context.getSource().getPlayerOrException();
            ArrayList<String> output_lines = new ArrayList<>();

            // get lines of output
            if (modID.equals(ModEnum.AOT))
            {
                if (reg.equals(RegEnum.BLOCKS))
                    for (RegistryObject<Block> blocks : BlockInit.MOD_BLOCKS.getEntries())
                    {
                        String[] temp = blocks.get().getName().getContents().toString().split("[.,]");
                        output_lines.add(AOTMain.MODID + ":" + temp[2].substring(0, temp[2].length()-1));
                    }
                if (reg.equals(RegEnum.ITEMS))
                    for (RegistryObject<Item> items : ItemInit.MOD_ITEMS.getEntries())
                        output_lines.add(AOTMain.MODID + ":" + items.get());
            }
            else if (modID.equals(ModEnum.MINECRAFT))
            {
                if (reg.equals(RegEnum.BLOCKS))
                    for (Block block : ForgeRegistries.BLOCKS)
                    {
                        String temp = block.getName().getContents().toString();
                        if (temp.contains("minecraft"))
                        {
                            String[] val = temp.split("[.,]");
                            output_lines.add("minecraft:" + val[2].substring(0, val[2].length() - 1));
                        }
                    }
                if (reg.equals(RegEnum.ITEMS))
                {
                    // get array of names for filter comparison
                    List<String> names = new ArrayList<>();
                    for (RegistryObject<Item> rItem : ItemInit.MOD_ITEMS.getEntries())
                        names.add(rItem.get().toString());

                    for (Item item : ForgeRegistries.ITEMS)
                    {
                        if (!names.contains(item.toString()))
                        {
                            output_lines.add("minecraft:" + item);
                        }
                    }
                }
            }
            else player.displayClientMessage(Component.literal("invalid options or incomplete command..."), false);

            if (out.equals(OutEnum.CHAT))
                for (String line : output_lines)
                    player.displayClientMessage(Component.translatable(line), false);
            else if (out.equals(OutEnum.BOOK))
            {
                // create the book item
                ItemStack book = new ItemStack(Items.WRITTEN_BOOK);

                // create the main NBT tag
                book.setTag(new CompoundTag());
                // set the title and author
                book.getTag().putString("author", "AOT Command");
                book.getTag().putString("title", "Registry Out");

                // list of pages
                ListTag pages = new ListTag();
                //list of page content
                List<String> page_content = Lists.newArrayList();

                // fill page content list with text
            }
/*
            // print longest line of text and total length of lines
            int tot_len = 0, long_len = 0;
            String long_line = "";

            for (String s : output_lines)
            {
                int temp_len = s.length();
                tot_len += temp_len;
                if (temp_len > long_len)
                {
                    long_len = temp_len;
                    long_line = s;
                }
            }

            player.displayClientMessage(Component.translatable(
                    modID + reg + "output:" +
                            "\n--longest line: " + long_line +
                            "\n--longest leng: " + long_len + " chars" +
                            "\n--total length: " + tot_len + "\n\n"
            ),false);
*/
/*
                // fill the page strings with some basic text
                for (int i = 0; i < 10; i++) pages.add("i = " + i);

                // add the page string to the list tag
                pages.stream()
                        .map(page -> Component.Serializer.toJson(Component.literal(page)))
                        .map(StringTag::valueOf).forEach(book_pages::add);

                // add the list tag to the NBT to the itemstack
                stack.addTagElement("pages",book_pages);

                // drop finalized book to player
                player.drop(stack, false, false);
            }
            else if (output.equals("chat"))
            {
                player.displayClientMessage(Component.translatable("this is a chat message..."), false);
            }
*/


        }
        catch (CommandSyntaxException e) { AOTMain.LOGGER.error(e.getMessage()); }

        return Command.SINGLE_SUCCESS;
    }
}