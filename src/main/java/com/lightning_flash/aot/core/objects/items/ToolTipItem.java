package com.lightning_flash.aot.core.objects.items;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ToolTipItem extends Item
{
    private final String tooltip, shiftTip, altTip, ctrlTip;

    public ToolTipItem(Properties prop, String tooltip)
    {
        super(prop);

        this.tooltip = tooltip;
        this.shiftTip = null;
        this.altTip = null;
        this.ctrlTip = null;
    }

    public ToolTipItem(Properties prop, String tooltip, String shiftTip)
    {
        super(prop);

        this.tooltip = tooltip;
        this.shiftTip = shiftTip;
        this.altTip = null;
        this.ctrlTip = null;
    }

    public ToolTipItem(Properties prop, String tooltip, String shiftTip, String altTip)
    {
        super(prop);

        this.tooltip = tooltip;
        this.shiftTip = shiftTip;
        this.altTip = altTip;
        this.ctrlTip = null;
    }

    public ToolTipItem(Properties prop, String tooltip, String shiftTip, String altTip, String ctrlTip)
    {
        super(prop);

        this.tooltip = tooltip;
        this.shiftTip = shiftTip;
        this.altTip = altTip;
        this.ctrlTip = ctrlTip;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tip, TooltipFlag flag) {
        super.appendHoverText(stack, level, tip, flag);

        // adding regular tooltip, if it exists
        if (!(this.tooltip == null)) tip.add(Component.literal(tooltip));

        // adding the shift tooltip
        if(!Screen.hasShiftDown() && !(this.shiftTip == null))
            tip.add(Component.literal("Hold shift for additional info..."));
        if (Screen.hasShiftDown() && !(this.shiftTip == null))
            tip.add(Component.literal(this.shiftTip));

        // adding the alt tooltip
        if(!Screen.hasAltDown() && !(this.altTip == null))
            tip.add(Component.literal("Hold alt for additional info..."));
        if (Screen.hasAltDown() && !(this.altTip == null))
            tip.add(Component.literal(this.altTip));

        // adding the ctrl tooltip
        if(!Screen.hasControlDown() && !(this.ctrlTip == null))
            tip.add(Component.literal("Hold ctrl for additional info..."));
        if (Screen.hasControlDown() && !(this.ctrlTip == null))
            tip.add(Component.literal(this.ctrlTip));
    }
}