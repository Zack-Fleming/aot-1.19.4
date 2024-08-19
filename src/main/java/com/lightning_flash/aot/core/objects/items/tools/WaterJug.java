package com.lightning_flash.aot.core.objects.items.tools;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;

public class WaterJug extends Item
{
    private int maxCapacity, currentCapacity;

    public WaterJug(int uses, int maxCapacity) {
        super(new Properties()
                .stacksTo(1)
                .durability(uses));

        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
    }

    public int getMaxCapacity() { return maxCapacity; }
    public int getCurrentCapacity() { return currentCapacity; }

    //    @Override
//    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
//    {
//        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
//    }

    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        Level level = context.getLevel();

        if (!level.isClientSide())
        {
            Player player = context.getPlayer();
            ItemStack itemStack = context.getItemInHand();
            BlockHitResult hitResult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
            BlockPos pos = hitResult.getBlockPos();
            Direction direction = hitResult.getDirection();
            BlockPos newPos = pos.relative(direction);
            Block block = level.getBlockState(pos).getBlock();
            Block newBlock = level.getBlockState(newPos).getBlock();

            if (level.mayInteract(player, pos) && player.mayUseItemAt(newPos, direction, itemStack))
            {
                player.sendSystemMessage(Component.literal("Block: " + block));
                player.sendSystemMessage(Component.literal("New Block: " + newBlock));
            }
        }

        return InteractionResult.sidedSuccess(context.getLevel().isClientSide());
    }
}