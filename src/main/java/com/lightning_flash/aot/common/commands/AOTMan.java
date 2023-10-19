package com.lightning_flash.aot.common.commands;

import com.lightning_flash.aot.AOTMain;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class AOTMan
{
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher)
    {
        LiteralArgumentBuilder<CommandSourceStack> aotMan =
                Commands.literal(AOTMain.MODID)
                        .requires(source -> source.hasPermission(4))
                        .then(Commands.literal("--help")
                                .then(Commands.literal("give")
                                        .executes(context -> execute(context, "give"))
                                )
                                .then(Commands.literal("registry")
                                        .executes(context -> execute(context, "regTest"))
                                )
                                .then(Commands.literal("config")
                                        .executes(context -> execute(context,"config"))
                                )
                                .executes(context -> execute(context, "?"))
                        );

        dispatcher.register(aotMan);
    }

    static int execute(CommandContext<CommandSourceStack> context, String flag)
    {
        try
        {
            ServerPlayer player = context.getSource().getPlayerOrException();

            switch (flag) {
                case "?" -> player.displayClientMessage(Component.literal(
                        """
                                AOT Mod Command Main Help:
                                  a command that tests the mod, or used
                                  to change the mod config.

                                USEAGE:
                                  /aot [MAIN_OPTIONS] [COMMAND_OPTIONS]
                                  ex: running the registry command
                                    /aot -r -a -i

                                MAIN OPTIONS:
                                  --help,   Shows this help screen
                                  -g,       Give sub-command
                                  -r,       Registry test sub-command
                                  -c,       Config sub-command (WIP)
                                """
                ), false);
                case "give" -> player.displayClientMessage(Component.literal(
                        """
                                AOT Give Command Help:
                                  Gives the player various categories
                                  of resources from the AOT mod. This
                                  command is mainly for the testing of
                                  the crafting recipes (as grabbing
                                  all the required resources from the
                                  creative menu was more time consuming
                                  than the time taken to develop this
                                  command).
                                
                                USEAGE:
                                  /aot -g [OPTIONS] [QTY]
                                  ex: give 5 ores
                                     /aot -g ores 5
                                
                                OPTIONS:
                                  poor_ores     - poor ores
                                  rich_ores     - regular ores
                                  raw_chunks    - small raw ores
                                  raw_ores      - raw ores
                                  ingots        - ingots
                                  nuggets       - nuggets
                                  dusts         - dusts
                                  small_dusts   - small dusts
                                
                                QTY:
                                  number from 1 to 64
                                """
                ), false);
                case "regTest" -> player.displayClientMessage(Component.literal(
                        """
                                AOT Registry Test Command Help:
                                  Lists the values in each of the
                                  registries of Forge, Minecraft,
                                  or AOT. Other mods may be added.
                                  There is also an option to write
                                  the output of the command to a
                                  book, rather than write output to
                                  the chat window.

                                USEAGE:
                                  /aot -r [OUTPUT OPTIONS] [OPTIONS]
                                  ex: select minecraft items reg.
                                    /aot -r -B -m -i
                                    
                                NAMESPACE SELECT OPTIONS:
                                  -a,   AOT mod registries
                                  -m,   MineCraft Registries

                                REGISTRY OPTIONS:
                                  -i,   Items
                                  -b,   Blocks
                                  -f,   Fluids (WIP)
                                
                                OUTPUT OPTIONS:
                                  -B,   write output to a book
                                  -C,   write output to the chat
                                """
                ), false);
                case "config" -> player.displayClientMessage(Component.literal(
                        """
                                AOT Config Command Help:
                                ===================================
                                currently a WIP
                                """
                ), false);
            }
        }
        catch (CommandSyntaxException e) { AOTMain.LOGGER.error(e.getMessage()); }

        return Command.SINGLE_SUCCESS;
    }
}