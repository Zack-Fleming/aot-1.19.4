package com.lightning_flash.aot.core.objects.items.tools.debug;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ParticleWand extends Item
{

    public ParticleWand() { super(new Item.Properties().stacksTo(1)); }

    @Override
    public boolean isFoil(@NotNull ItemStack p_41453_) { return true; }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level world, Player player, @NotNull InteractionHand hand)
    {
        BlockPos pos = new BlockPos( player.blockPosition().getX(),  player.blockPosition().getY() + 1, player.blockPosition().getZ());

        /*
            * v1, v2, v3: the velocity of the particle
            * v1: the velocity in the x direction
            * v2: the velocity in the y direction
            * v3: the velocity in the z direction
         */
        world.addParticle(ParticleTypes.FLAME, pos.getX(), pos.getY(), pos.getZ(), 0.2D, 0.0D, 0.0D);

        return InteractionResultHolder.success(player.getItemInHand(hand));
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag flag)
    {
        tooltip.add(Component.literal(ChatFormatting.RED + "Operation: generate some random particles"));

        tooltip.add(Component.literal(ChatFormatting.DARK_RED + "Warning: This tool may cause game crashes (especially if spammed)"));
    }
}