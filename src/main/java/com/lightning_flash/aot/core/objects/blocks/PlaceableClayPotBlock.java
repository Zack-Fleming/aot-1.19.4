package com.lightning_flash.aot.core.objects.blocks;

import com.lightning_flash.aot.core.init.BlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class PlaceableClayPotBlock extends Block
{
    public static final float AABB_SIZE = 3.0F;
    protected static final VoxelShape SHAPE = Block.box(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);

    public PlaceableClayPotBlock(Properties properties) { super(properties); }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) { return SHAPE; }

    @Override
    public PushReaction getPistonPushReaction(BlockState p_60584_) { return PushReaction.DESTROY; }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source)
    {
        super.tick(state, level, pos, source);
        level.setBlockAndUpdate(pos, BlockInit.DRY_UNFIRED_FLOWER_POT.get().defaultBlockState());
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader reader, BlockPos pos) { return !reader.isEmptyBlock(pos.below()); }

    @Override
    public BlockState updateShape(BlockState state1, Direction dir, BlockState state2, LevelAccessor level, BlockPos pos1, BlockPos pos2) {
        return !state1.canSurvive(level, pos1) ? Blocks.AIR.defaultBlockState() : super.updateShape(state1, dir, state2, level, pos1, pos2);
    }
}