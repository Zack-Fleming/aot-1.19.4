package com.lightning_flash.aot.core.objects.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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

public class PlaceableClayBrickBlock extends Block
{
    public static final float AABB_SIZE = 3.0F;
    protected static final VoxelShape SHAPE = Block.box(4.0, 0.0, 6.0, 12.0, 2.0, 10.0);
    private final BlockState dryState;

    public PlaceableClayBrickBlock(Properties properties, BlockState dryState)
    {
        super(properties);
        this.dryState = dryState;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter wolrd, BlockPos pos, CollisionContext context) { return SHAPE; }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) { return PushReaction.DESTROY; }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source)
    {
        super.tick(state, level, pos, source);
        level.setBlockAndUpdate(pos, dryState);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader reader, BlockPos pos) { return !reader.isEmptyBlock(pos.below()); }

    @Override
    public BlockState updateShape(BlockState state1, Direction dir, BlockState state2, LevelAccessor level, BlockPos pos1, BlockPos pos2) {
        return !state1.canSurvive(level, pos1) ? Blocks.AIR.defaultBlockState() : super.updateShape(state1, dir, state2, level, pos1, pos2);
    }
}