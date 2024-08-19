package com.lightning_flash.aot.core.objects.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ShappedBlock extends Block
{
    public final float AABB_SIZE;
    protected final VoxelShape SHAPE;

    public ShappedBlock(Properties properties, float AABB, VoxelShape shape)
    {
        super(properties);
        this.AABB_SIZE = AABB;
        this.SHAPE = shape;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) { return SHAPE; }
    public float getAABB_SIZE() { return AABB_SIZE; }
}