package com.lightning_flash.aot.core.loot;

import com.lightning_flash.aot.AOTMain;
import com.mojang.serialization.Codec;
import net.minecraft.world.entity.animal.Cod;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers
{
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> MOD_LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, AOTMain.MODID);


    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_REPLACE_ITEM =
        MOD_LOOT_MODIFIER_SERIALIZERS.register("enchanted_replace_item", EnchantmentReplaceItemModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_MOB_LOOT_MODIFIER =
        MOD_LOOT_MODIFIER_SERIALIZERS.register("add_mob_loot_modifier", AddMobLootModifier.CODEC);


    public static void register(IEventBus bus){ MOD_LOOT_MODIFIER_SERIALIZERS.register(bus); }
}