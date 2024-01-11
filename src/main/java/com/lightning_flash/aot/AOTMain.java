package com.lightning_flash.aot;

import com.lightning_flash.aot.core.init.BlockInit;
import com.lightning_flash.aot.core.init.CommandInit;
import com.lightning_flash.aot.core.init.ItemGroupInit;
import com.lightning_flash.aot.core.init.ItemInit;
import com.lightning_flash.aot.core.loot.ModLootModifiers;
import com.lightning_flash.aot.core.util.TabLists;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import java.util.Random;
import java.util.function.Supplier;


@Mod(AOTMain.MODID)
public class  AOTMain
{
    public static final String MODID = "aot";                       // Define mod id in a common place for everything to reference
    public static final Logger LOGGER = LogUtils.getLogger();       // Directly reference a slf4j logger
    public static final Random RANDOM = new Random();               // instance of java.util.Random for public use within mod

    public AOTMain() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.MOD_ITEMS.register(modEventBus);                   // register blocks and items here
        BlockInit.MOD_BLOCKS.register(modEventBus);

        modEventBus.addListener(this::commonSetup);                 // Register the commonSetup method for modloading
        modEventBus.addListener(this::addTabItems);                 // add items to the creative tabs

//        ModConfiguredFeatures.register(modEventBus);                // register the configured features
//        ModPlacedFeatures.register(modEventBus);

        ModLootModifiers.register(modEventBus);                     // register the loot modifiers

        MinecraftForge.EVENT_BUS.register(this);              // register the mod
    }

    // commands go here
    private void commonSetup(final FMLCommonSetupEvent event) { MinecraftForge.EVENT_BUS.register(CommandInit.class); }

    private void addTabItems(CreativeModeTabEvent.BuildContents event)  // adding items to creative tabs
    {
        CreativeModeTab tab = event.getTab();

        if (tab == ItemGroupInit.AOT_DEBUG_TAB)
            for (RegistryObject<?> item : TabLists.DEBUG_TAB_ITEMS) event.accept((Supplier<? extends ItemLike>) item);

        if (tab == ItemGroupInit.AOT_TOOL_TAB)
            for (RegistryObject<?> item : TabLists.TOOL_TAB_ITEMS) event.accept((Supplier<? extends ItemLike>) item);

        if (tab == ItemGroupInit.AOT_RESOURCE_TAB)
            for (RegistryObject<?> item : TabLists.RESOURCE_TAB_ITEMS) event.accept((Supplier<? extends ItemLike>) item);

        if (tab == ItemGroupInit.AOT_BUILDING_TAB)
            for (RegistryObject<?> item : TabLists.BUILDING_TAB_ITEMS) event.accept((Supplier<? extends ItemLike>) item);
    }
}
