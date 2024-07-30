package com.lightning_flash.aot.core.objects.blocks.debug;


import com.lightning_flash.aot.core.objects.blocks.ToolTipBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DebugBlock extends ToolTipBlock
{
    public DebugBlock() { super(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN), "This is a debug block. It does nothing. yet......"); }
}