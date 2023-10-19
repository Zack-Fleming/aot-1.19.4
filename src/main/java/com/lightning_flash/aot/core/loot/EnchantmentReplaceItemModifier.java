package com.lightning_flash.aot.core.loot;

import com.google.common.base.Suppliers;
import com.lightning_flash.aot.AOTMain;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class EnchantmentReplaceItemModifier extends LootModifier
{
    public static final Supplier<Codec<EnchantmentReplaceItemModifier>> CODEC = Suppliers.memoize(
            () -> RecordCodecBuilder.create(inst -> codecStart(inst).and(ForgeRegistries.ITEMS.getCodec()
                    .fieldOf("item").forGetter(m -> m.item)).apply(inst, EnchantmentReplaceItemModifier::new)));
    private final Item item;

    /**
     * Constructs a LootModifier.
     *
     * @param conditionsIn the ILootConditions that need to be matched before the loot is modified.
     */
    protected EnchantmentReplaceItemModifier(LootItemCondition[] conditionsIn, Item itemIn)
    {
        super(conditionsIn);
        this.item = itemIn;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context)
    {
        ItemStack tool = context.getParamOrNull(LootContextParams.TOOL);
        int count = AOTMain.RANDOM.nextInt(1,4);

        // if tool is null or is enchanted with silktouch
        if (tool == null || EnchantmentHelper.getTagEnchantmentLevel(Enchantments.SILK_TOUCH, tool) > 0) return generatedLoot;

        generatedLoot.clear();
        int fortune_level = EnchantmentHelper.getTagEnchantmentLevel(Enchantments.BLOCK_FORTUNE, tool);

        // if tool has fortune
        if(fortune_level > 0) count += AOTMain.RANDOM.nextInt(1, fortune_level + 1);

        generatedLoot.add(new ItemStack(item, count));
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() { return CODEC.get(); }
}