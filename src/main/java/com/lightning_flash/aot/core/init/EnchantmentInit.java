package com.lightning_flash.aot.core.init;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.objects.enchantments.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentInit
{
    public static final DeferredRegister<Enchantment> MOD_ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, AOTMain.MODID);

    public static final RegistryObject<Enchantment> AUTO_PLANTER = MOD_ENCHANTMENTS.register("auto_planter", AutoPlantEnchantment::new);
    public static final RegistryObject<Enchantment> AUTO_SMELTING = MOD_ENCHANTMENTS.register("auto_smelting", AutoSmeltEnchantment::new);
    public static final RegistryObject<Enchantment> ORE_EXCAVATOR = MOD_ENCHANTMENTS.register("ore_excavator", ExcavatorEnchantment::new);
    public static final RegistryObject<Enchantment> HARVESTING_SIZE = MOD_ENCHANTMENTS.register("harvest_size", HarvestSizeEnchantment::new);



    public static void register(IEventBus eventBus) { MOD_ENCHANTMENTS.register(eventBus); }
}