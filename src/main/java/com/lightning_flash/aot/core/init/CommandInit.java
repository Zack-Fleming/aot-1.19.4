package com.lightning_flash.aot.core.init;


import com.lightning_flash.aot.common.commands.AOTGive;
import com.lightning_flash.aot.common.commands.AOTMan;
import com.lightning_flash.aot.common.commands.AOTMisc;
import com.lightning_flash.aot.common.commands.AOTRegTest;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CommandInit
{
    @SubscribeEvent
    public static void registerModCommands(final RegisterCommandsEvent event)
    {
        // get the command dispatcher from the game
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();

        // register custom commands
        AOTGive.register(dispatcher);
        AOTMan.register(dispatcher);
        AOTRegTest.register(dispatcher);
        AOTMisc.register(dispatcher);
    }
}