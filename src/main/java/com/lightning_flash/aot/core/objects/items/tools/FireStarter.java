package com.lightning_flash.aot.core.objects.items.tools;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.init.ItemGroupInit;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

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
    public InteractionResult useOn(UseOnContext context) {
        // get some data, lessen accessing
        Player player = context.getPlayer();
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);

        //play the flint and steel use sound
        level.playSound(player,pos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS,1.0f , AOTMain.RANDOM.nextFloat());

        // actually use the item
        if (player != null)
        {
            // damage the item
            context.getItemInHand().hurtAndBreak(1,player,(event) ->
            {
                event.broadcastBreakEvent(context.getHand());
            });

            // catch shit on fire
            if (AOTMain.RANDOM.nextInt(101) % 3 == 0)
            {
                // try ot light campfire
                if (CampfireBlock.canLight(state))
                {
                    level.setBlock(pos,state.setValue(BlockStateProperties.LIT,Boolean.TRUE),11);
                    return InteractionResult.SUCCESS;
                }
            }
        }

        return InteractionResult.PASS;
    }

//    @Override
//    public boolean isRepairable(ItemStack stack) {
//        return stack.equals(new ItemStack(ItemInit.SHARD_STONE.get()));
//    }
}