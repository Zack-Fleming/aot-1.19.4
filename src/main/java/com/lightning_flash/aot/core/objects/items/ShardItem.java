package com.lightning_flash.aot.core.objects.items;

import com.lightning_flash.aot.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.TallGrassBlock;
import org.jetbrains.annotations.NotNull;

public class ShardItem extends Item
{
    public ShardItem() { super(new Item.Properties()); }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext context)
    {
        Level level = context.getLevel();
        Player player = context.getPlayer();
        InteractionHand hand = context.getHand();
        ItemStack stack = context.getItemInHand();

        if (!level.isClientSide() && player != null)
        {
            BlockPos pos = context.getClickedPos();
            Block block = level.getBlockState(pos).getBlock();

            if (block instanceof TallGrassBlock)
            {
                level.playSound(null, pos, block.getSoundType(level.getBlockState(pos), level, pos, player).getBreakSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
                level.setBlock(pos, Blocks.AIR.defaultBlockState(), Block.UPDATE_CLIENTS);
                Block.popResource(level, pos, new ItemStack(ItemInit.PLANT_FIBER.get(), 1 + level.random.nextInt(2)));
            }
        }

        return super.useOn(context);
    }
}
