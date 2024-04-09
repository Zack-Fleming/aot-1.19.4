package com.lightning_flash.aot.core.objects.items.tools;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class Sifter extends Item
{
    public Sifter(int uses) {
        super(
                new Item.Properties()
                        .stacksTo(1)
                        .durability(uses)
        );
    }
}