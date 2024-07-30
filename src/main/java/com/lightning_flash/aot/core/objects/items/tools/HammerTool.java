package com.lightning_flash.aot.core.objects.items.tools;

import net.minecraft.world.item.Item;

public class HammerTool extends Item
{
    public HammerTool(int uses) {
        super(new Item.Properties()
                .stacksTo(1)
                .durability(uses));
    }
}