package com.lightning_flash.aot.core.events;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.util.UTFC;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
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
        Item item = stack.getItem();

        //"Smelts " + (burnTime / 200) + " items/fuel [" + ((burnTime / 200) * stack.getCount()) + " for this stack]"
        if (item.equals(Items.COAL))
        {
            event.getToolTip().add(Component.literal(ChatFormatting.DARK_AQUA + "C"));
            event.getToolTip().add(Component.literal(ChatFormatting.YELLOW + "Smelts 8 items/fuel [" + (8 * stack.getCount()) + " for this stack]"));
        }
        if (item.equals(Items.CHARCOAL))
        {
            event.getToolTip().add(Component.literal(ChatFormatting.DARK_AQUA + "C"));
            event.getToolTip().add(Component.literal(ChatFormatting.YELLOW + "Smelts 8 items/fuel [" + (8 * stack.getCount()) + " for this stack]"));
        }
        if (item.equals(Items.LAVA_BUCKET))
            event.getToolTip().add(Component.literal(ChatFormatting.YELLOW + "Smelts 100 items/fuel [" + (100 * stack.getCount()) + " for this stack]"));
        if (item.equals(Items.COAL_BLOCK))
        {
            event.getToolTip().add(Component.literal(ChatFormatting.DARK_AQUA + "C"));
            event.getToolTip().add(Component.literal(ChatFormatting.YELLOW + "Smelts 80 items/fuel [" + (80 * stack.getCount()) + " for this stack]"));
        }
        if (item.equals(Items.WATER_BUCKET))
            event.getToolTip().add(Component.literal(ChatFormatting.DARK_AQUA + "H" + UTFC.TWO + "O"));
    }
}
