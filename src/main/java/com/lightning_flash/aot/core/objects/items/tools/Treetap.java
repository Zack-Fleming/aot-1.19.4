package com.lightning_flash.aot.core.objects.items.tools;

import net.minecraft.world.item.Item;

public class Treetap extends Item
{
    public Treetap(int uses)
    {
        super(new Item.Properties()
                .stacksTo(1)
                .durability(uses));
    }
}