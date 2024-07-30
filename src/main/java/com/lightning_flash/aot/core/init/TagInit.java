package com.lightning_flash.aot.core.init;

import com.lightning_flash.aot.AOTMain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit
{



    private static TagKey<Block> createBlock(String location) { return BlockTags.create(new ResourceLocation(AOTMain.MODID, location)); }
}
