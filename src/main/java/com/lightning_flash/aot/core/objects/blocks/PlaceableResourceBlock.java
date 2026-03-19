package com.lightning_flash.aot.core.objects.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PlaceableResourceBlock extends Block
{
    public final float AABB_SIZE;
    protected final VoxelShape shape;

    public PlaceableResourceBlock(Properties properties, float AABB, VoxelShape shape)
    {
        super(properties);

        this.AABB_SIZE = AABB;
        this.shape = shape;
    }
}