package com.lightning_flash.aot.datagen;

import com.lightning_flash.aot.AOTMain;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = AOTMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneratorInit
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        // setup stuff
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();

        // register the data generators
        generator.addProvider(event.includeServer(), new ModWorldGenProvider(output, provider));
    }
}