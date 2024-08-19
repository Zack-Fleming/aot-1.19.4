package com.lightning_flash.aot.core.objects.blocks;

import com.lightning_flash.aot.core.init.BlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Arrays;

public class PlaceableClayBucketBlock extends Block
{
    private int counter = 0;

    public final float AABB_SIZE = 0.5F;
    protected final VoxelShape SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 11.0, 14.0);

    public PlaceableClayBucketBlock(Properties properties) { super(properties); }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) { return SHAPE; }

    @Override
    public PushReaction getPistonPushReaction(BlockState p_60584_) { return PushReaction.DESTROY; }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {
        super.tick(state, level, pos, source);

        //level.getServer().sendSystemMessage(Component.literal("ticked....."));
        level.setBlockAndUpdate(pos, BlockInit.DRY_UNFIRED_CLAY_BUCKET.get().defaultBlockState());

//        counter++;
//        if (counter == 10)
//        {
//            level.setBlockAndUpdate(pos, BlockInit.DRY_UNFIRED_CLAY_BUCKET.get().defaultBlockState());
//            counter = 0;
//        }
    }
}