package com.lightning_flash.aot.core.objects.blocks;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ToolTipBlock extends Block
{
    private final String tooltip, shiftTip, altTip, ctrlTip;

    public ToolTipBlock(Properties properties, String tooltip) {
        super(properties);

        this.tooltip = tooltip;
        this.shiftTip = null;
        this.altTip = null;
        this.ctrlTip = null;
    }

    public ToolTipBlock(Properties properties, String tooltip, String shiftTip)
    {
        super(properties);

        this.tooltip = tooltip;
        this.shiftTip = shiftTip;
        this.altTip = null;
        this.ctrlTip = null;
    }

    public ToolTipBlock(Properties properties, String tooltip, String shiftTip, String altTip)
    {
        super(properties);

        this.tooltip = tooltip;
        this.shiftTip = shiftTip;
        this.altTip = altTip;
        this.ctrlTip = null;
    }

    public ToolTipBlock(Properties properties, String tooltip, String shiftTip, String altTip, String ctrlTip)
    {
        super(properties);

        this.tooltip = tooltip;
        this.shiftTip = shiftTip;
        this.altTip = altTip;
        this.ctrlTip = ctrlTip;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable BlockGetter getter, List<Component> tip, TooltipFlag flag) {
        // adding regular tooltip, if it exists
        if (!(this.tooltip == null)) tip.add(Component.translatable(tooltip));

        // adding the shift tooltip
        if(!Screen.hasShiftDown() && !(this.shiftTip == null))
            tip.add(Component.literal("Hold shift for additional info..."));
        if (Screen.hasShiftDown() && !(this.shiftTip == null))
            tip.add(Component.translatable(this.shiftTip));

        // adding the alt tooltip
        if(!Screen.hasAltDown() && !(this.altTip == null))
            tip.add(Component.literal("Hold alt for additional info..."));
        if (Screen.hasAltDown() && !(this.altTip == null))
            tip.add(Component.translatable(this.altTip));

        // adding the ctrl tooltip
        if(!Screen.hasControlDown() && !(this.ctrlTip == null))
            tip.add(Component.literal("Hold ctrl for additional info..."));
        if (Screen.hasControlDown() && !(this.ctrlTip == null))
            tip.add(Component.translatable(this.ctrlTip));
    }
}