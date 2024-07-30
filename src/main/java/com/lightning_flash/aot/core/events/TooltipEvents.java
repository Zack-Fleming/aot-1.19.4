package com.lightning_flash.aot.core.events;

import com.lightning_flash.aot.AOTMain;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AOTMain.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TooltipEvents
{
    @SubscribeEvent
    public static void addToVanillaTooltip(ItemTooltipEvent event)
    {
        ItemStack stack = event.getItemStack();

        //"Smelts " + (burnTime / 200) + " items/fuel [" + ((burnTime / 200) * stack.getCount()) + " for this stack]"
        if (stack.getItem().equals(Items.COAL))
            event.getToolTip().add(Component.literal("Smelts " + (8) + " items/fuel [" + (8 * stack.getCount()) + " for this stack]"));
        if (stack.getItem().equals(Items.CHARCOAL))
            event.getToolTip().add(Component.literal("Smelts " + (8) + " items/fuel [" + (8 * stack.getCount()) + " for this stack]"));
        if (stack.getItem().equals(Items.LAVA_BUCKET))
            event.getToolTip().add(Component.literal("Smelts " + (100) + " items/fuel [" + (100 * stack.getCount()) + " for this stack]"));
        if (stack.getItem().equals(Items.COAL_BLOCK))
            event.getToolTip().add(Component.literal("Smelts " + (80) + " items/fuel [" + (80 * stack.getCount()) + " for this stack]"));
    }
}
