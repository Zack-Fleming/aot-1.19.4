package com.lightning_flash.aot.common.commands;

import com.lightning_flash.aot.AOTMain;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

public class AOTMisc
{
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher)
    {
        LiteralArgumentBuilder<CommandSourceStack> aotmisc =
                Commands.literal(AOTMain.MODID)
                        .requires(source -> source.hasPermission(4))
                        .then(Commands.literal("--misc")
                                .then(Commands.literal("getPlayerAttributes")
                                        .executes(AOTMisc::getPlayerAttributes)
                                )
                                .then(Commands.literal("getPlayerCurrentHealth")
                                        .executes(AOTMisc::getPlayerHealth)
                                )
                                .then(Commands.literal("setPlayerMaxHealth")
                                        .then(Commands.argument("health", IntegerArgumentType.integer(1, 1024))
                                                .executes(context -> setPlayerHealth(context,
                                                        IntegerArgumentType.getInteger(context, "health"))
                                                )
                                        )
                                )
                                .then(Commands.literal("setPlayerKnockbackResistance")
                                        .then(Commands.argument("resistance", IntegerArgumentType.integer(0, 100))
                                                .executes(context -> setPlayerKnockbackResistance(context,
                                                        IntegerArgumentType.getInteger(context, "resistance") / 100.0f)
                                                )
                                        )
                                )
                                .then(Commands.literal("setPlayerMovementSpeed")
                                        .then(Commands.argument("speed", IntegerArgumentType.integer(0, 1024))
                                                .executes(context -> setPlayerMovementSpeed(context,
                                                        IntegerArgumentType.getInteger(context, "speed"))
                                                )
                                        )
                                )
                        );

        dispatcher.register(aotmisc);
    }

    static int getPlayerAttributes(CommandContext<CommandSourceStack> context)
    {
        try{
            Player player = context.getSource().getPlayerOrException();

            player.displayClientMessage(Component.literal("Player Attributes:"), false);
            player.displayClientMessage(Component.literal("  Max health           : " + player.getAttribute(Attributes.MAX_HEALTH).getValue() + " of 1024.0"), false);
            player.displayClientMessage(Component.literal("  Knockback resistance : " + player.getAttribute(Attributes.KNOCKBACK_RESISTANCE).getValue() + " of 1.0"), false);
            player.displayClientMessage(Component.literal("  Movement speed       : " + player.getAttribute(Attributes.MOVEMENT_SPEED).getValue() + " of 1024.0"), false);
            player.displayClientMessage(Component.literal("  Attack speed         : " + player.getAttribute(Attributes.ATTACK_SPEED).getValue() + " of 1024.0"), false);
            player.displayClientMessage(Component.literal("  Attack knockback     : " + player.getAttribute(Attributes.ATTACK_KNOCKBACK).getValue() + " of 5.0"), false);
            player.displayClientMessage(Component.literal("  Attack damage        : " + player.getAttribute(Attributes.ATTACK_DAMAGE).getValue() + " of 2048.0"), false);
            player.displayClientMessage(Component.literal("  Armor                : " + player.getAttribute(Attributes.ARMOR).getValue() + " of 30.0"), false);
            player.displayClientMessage(Component.literal("  Armor Toughness      : " + player.getAttribute(Attributes.ARMOR_TOUGHNESS).getValue() + " of 20.0"), false);
            player.displayClientMessage(Component.literal("  Luck                 : " + player.getAttribute(Attributes.LUCK).getValue() + " of 1024.0"), false);
        }
        catch (CommandSyntaxException e) { AOTMain.LOGGER.error("Error getting player attributes: " + e.getMessage()); }

        return Command.SINGLE_SUCCESS;
    }

    static int getPlayerHealth(CommandContext<CommandSourceStack> context)
    {
        try
        {
            ServerPlayer player = context.getSource().getPlayerOrException();
            AOTMain.LOGGER.info("Player health: " + player.getHealth());
            player.displayClientMessage(Component.literal("Player health: " + player.getHealth()), false);
        }
        catch (Exception e) { AOTMain.LOGGER.error("Error getting player health: " + e.getMessage()); }

        return Command.SINGLE_SUCCESS;
    }

    static int setPlayerHealth(CommandContext<CommandSourceStack> context, int health)
    {
        try
        {
            Player player = context.getSource().getPlayerOrException();
            float currentHealth = player.getHealth();
            player.getAttribute(Attributes.MAX_HEALTH).setBaseValue(health);
            if (currentHealth > health) player.setHealth(health);
        }
        catch (Exception e) { AOTMain.LOGGER.error("Error setting player health: " + e.getMessage()); }

        return Command.SINGLE_SUCCESS;
    }

    static int setPlayerKnockbackResistance(CommandContext<CommandSourceStack> context, float resistance)
    {
        try { context.getSource().getPlayerOrException().getAttribute(Attributes.KNOCKBACK_RESISTANCE).setBaseValue(resistance); }
        catch (Exception e) { AOTMain.LOGGER.error("Error setting player knockback resistance: " + e.getMessage()); }

        return Command.SINGLE_SUCCESS;
    }

    static int setPlayerMovementSpeed(CommandContext<CommandSourceStack> context, float speed)
    {
        try { context.getSource().getPlayerOrException().getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(speed); }
        catch (Exception e) { AOTMain.LOGGER.error("Error setting player movement speed: " + e.getMessage()); }

        return Command.SINGLE_SUCCESS;
    }
}
