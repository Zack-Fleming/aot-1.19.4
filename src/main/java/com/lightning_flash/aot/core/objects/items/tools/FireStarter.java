package com.lightning_flash.aot.core.objects.items.tools;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.init.ItemGroupInit;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.gameevent.GameEvent;

public class FireStarter extends Item
{

    public FireStarter(int uses)
    {
        super(new Item.Properties()
                .stacksTo(1)
                .durability(uses)
        );
    }

    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        // get some data, lessen accessing
        Player player = context.getPlayer();
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);

        if (!level.isClientSide())
        {
            //play the flint and steel use sound
            level.playSound(null, pos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS,1.0f , AOTMain.RANDOM.nextFloat());

            // catch shit on fire
            if (AOTMain.RANDOM.nextInt(101) % 3 == 0)
            {
                if (!CampfireBlock.canLight(state) && !CandleBlock.canLight(state) && !CandleCakeBlock.canLight(state))
                {
                    BlockPos firePos = pos.relative(context.getClickedFace());
                    if (BaseFireBlock.canBePlacedAt(level, firePos, context.getHorizontalDirection()))
                    {
                        BlockState fireState = BaseFireBlock.getState(level, firePos);
                        level.setBlock(firePos, fireState, 11);
                        level.gameEvent(player, GameEvent.BLOCK_PLACE, pos);

                        ItemStack stack = context.getItemInHand();
                        if (player instanceof ServerPlayer)
                        {
                            CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) player, firePos, stack);
                            stack.hurtAndBreak(1, player, (e) -> e.broadcastBreakEvent(context.getHand()));
                        }

                        return InteractionResult.sidedSuccess(level.isClientSide());
                    }
                    else return InteractionResult.FAIL;
                }
                else // try to light campfires and candles
                {
                    level.setBlock(pos,state.setValue(BlockStateProperties.LIT, Boolean.TRUE),11);
                    level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);

                    if (player != null)
                        context.getItemInHand().hurtAndBreak(1, player, (e) -> e.broadcastBreakEvent(context.getHand()));

                    return InteractionResult.sidedSuccess(level.isClientSide());
                }
            }
        }

        return InteractionResult.sidedSuccess(level.isClientSide());
    }

//    @Override
//    public boolean isRepairable(ItemStack stack) {
//        return stack.equals(new ItemStack(ItemInit.SHARD_STONE.get()));
//    }
}