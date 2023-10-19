package com.lightning_flash.aot.core.objects.items.tools.debug;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.init.ItemGroupInit;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;


public class BlockWand extends Item
{

    public BlockWand() { super(new Item.Properties().stacksTo(1)); }

    @Override
    public boolean isFoil(ItemStack stack) { return true; }

    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        Level level = context.getLevel();

        if (!level.isClientSide)
        {
            if((context.getPlayer() != null))
            {
                // get required info
                Direction offsetDir = context.getClickedFace();
                BlockPos clickedPos = context.getClickedPos();
                BlockPos offsetPos = clickedPos.relative(offsetDir);

                ArrayList<Block> blocksList = new ArrayList<>(ForgeRegistries.BLOCKS.getValues());
                int length = blocksList.size();

                int index = AOTMain.RANDOM.nextInt(length);
                BlockState block = blocksList.get(index).defaultBlockState();

                // switch modes
                if (!Screen.hasShiftDown()) level.setBlock(clickedPos, block, 11);
                else level.setBlock(offsetPos, block, 11);
            }
        }

        return InteractionResult.PASS;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag)
    {
        tooltip.add(Component.literal(ChatFormatting.RED + "Operation: changes the clicked block to a random one\n"));

        // modes tooltips
        if(!Screen.hasShiftDown()) tooltip.add(Component.literal(ChatFormatting.YELLOW + "Modes: [hold SHIFT for mode info]"));
        else
            tooltip.add(Component.literal(ChatFormatting.YELLOW +
                    "Modes (BASE = RIGHT CLICK):\n" +
                    "-Normal [BASE]: change the clicked block\n" +
                    "-Offset [BASE + SHIFT]: change the clicked block plus the player's facing offset"
            ));
        tooltip.add(Component.literal(ChatFormatting.DARK_RED + "Warning: This tool may cause your game to crash..."));
    }
}