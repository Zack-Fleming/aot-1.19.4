package com.lightning_flash.aot.core.loot;

import com.google.common.base.Suppliers;
import com.lightning_flash.aot.AOTMain;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class AddMobLootModifier extends LootModifier
{

    public static final Supplier<Codec<AddMobLootModifier>> CODEC = Suppliers.memoize(
            () -> RecordCodecBuilder.create(inst -> codecStart(inst).and(
                    inst.group(
                            ForgeRegistries.ITEMS.getCodec().fieldOf("item").forGetter(m -> m.item),
                            Codec.STRING.fieldOf("mob_size").forGetter(m -> m.size)
                    )).apply(inst, AddMobLootModifier::new)
            ));

    private final Item item;
    private final String size;

    protected AddMobLootModifier(LootItemCondition[] conditionsIn, Item itemIn, String size) {
        super(conditionsIn);
        this.item = itemIn;
        this.size = size;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext lootContext) {
        int num = switch (size)
        {
            case "small" -> AOTMain.RANDOM.nextInt(0, 2);
            case "medium" -> AOTMain.RANDOM.nextInt(1, 4);
            case "large" -> AOTMain.RANDOM.nextInt(3, 7);
            default -> 0;
        };

        generatedLoot.add(new ItemStack(item, num));
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() { return CODEC.get(); }
}
