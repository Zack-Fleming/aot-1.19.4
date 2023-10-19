package com.lightning_flash.aot.core.objects.items.tools.debug;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.init.ItemGroupInit;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ItemWand extends Item
{
    public ItemWand() { super(new Item.Properties().stacksTo(1)); }

    @Override
    public boolean isFoil(@NotNull ItemStack p_41453_) { return true; }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand hand)
    {
        ItemStack stack = player.getItemInHand(hand);

        // get the list of registered items
        ArrayList<Item> itemsList = new ArrayList<>(ForgeRegistries.ITEMS.getValues());
        int length = itemsList.size();

        int index = AOTMain.RANDOM.nextInt(length);
        Item item = itemsList.get(index);

        if (!Screen.hasShiftDown()) player.drop(new ItemStack(item, 1), false);
        else player.drop(new ItemStack(item, item.getMaxStackSize(new ItemStack(item))), false);

        return InteractionResultHolder.success(stack);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag flag)
    {
        tooltip.add(Component.literal(ChatFormatting.RED + "Operation: drops a random item at the player"));

        if (!Screen.hasShiftDown()) tooltip.add(Component.translatable(ChatFormatting.YELLOW + "Modes: [hold SHIFT for mode info]"));
        else
            tooltip.add(Component.literal(ChatFormatting.YELLOW +
                    "Modes (BASE = RIGHT CLICK):\n" +
                    "-Normal [BASE]: generates a random item, and drop it at the player\n" +
                    "-Stack [BASE + SHIFT]: generates a full stack of the generated item"
            ));

        tooltip.add(Component.literal(ChatFormatting.DARK_RED + "Warning: This tool may cause your game to crash..."));
    }
}