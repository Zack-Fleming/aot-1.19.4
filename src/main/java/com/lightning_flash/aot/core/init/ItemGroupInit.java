package com.lightning_flash.aot.core.init;

import com.lightning_flash.aot.AOTMain;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(modid = AOTMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroupInit
{
    // tabs
    public static CreativeModeTab   AOT_DEBUG_TAB,
                                    AOT_TOOL_TAB,
                                    AOT_RESOURCE_TAB,
                                    AOT_BUILDING_TAB;

    @SubscribeEvent
    public static void registerCreativeTabs(CreativeModeTabEvent.Register event)
    {
        AOT_DEBUG_TAB = event.registerCreativeModeTab(new ResourceLocation(AOTMain.MODID, "aot_debug_tab"),
                builder -> builder.icon(() -> new ItemStack(ItemInit.DEBUG_STICK.get()))
                                  .title(Component.translatable("creativemodetab.aot_debug_tab")));

        AOT_TOOL_TAB = event.registerCreativeModeTab(new ResourceLocation(AOTMain.MODID, "aot_tool_tab"),
                builder -> builder.icon(() -> new ItemStack(ItemInit.CRUDE_SIRE_STARTER.get()))
                                  .title(Component.translatable("creativemodetab.aot_tool_tab")));

        AOT_RESOURCE_TAB = event.registerCreativeModeTab(new ResourceLocation(AOTMain.MODID, "aot_resource_tab"),
                builder -> builder.icon(() -> new ItemStack(ItemInit.RAW_ALUMINUM.get()))
                                  .title(Component.translatable("creativemodetab.aot_resource_tab")));
        AOT_BUILDING_TAB = event.registerCreativeModeTab(new ResourceLocation(AOTMain.MODID, "aot_building_tab"),
                builder -> builder.icon(() -> new ItemStack(BlockInit.LIMESTONE.get()))
                                  .title(Component.translatable("creativemodetab.aot_building_tab")));
    }


}