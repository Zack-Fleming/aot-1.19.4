package com.lightning_flash.aot.core.objects.items.tools;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.init.EnchantmentInit;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ScytheItem extends HoeItem
{
    public ScytheItem(Tier tier, int atkBase, float atkSpeed)
    {
        super(tier, atkBase, atkSpeed, new Item.Properties().stacksTo(1));
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext context)
    {
        Level level = context.getLevel();
        Player player = context.getPlayer();
        InteractionHand hand = context.getHand();
        ItemStack stack = context.getItemInHand();

        if (!level.isClientSide() && player != null)
        {
            BlockPos pos = context.getClickedPos();
            Block block = level.getBlockState(pos).getBlock();

            if(block instanceof CropBlock)
            {
                level.playSound(null, pos, block.getSoundType(level.getBlockState(pos), level, pos, player).getBreakSound(), SoundSource.BLOCKS, 1.0F, AOTMain.RANDOM.nextFloat());
                Map<Enchantment, Integer> enchantments = stack.getAllEnchantments();
                int harvestSize = 1 + enchantments.getOrDefault(EnchantmentInit.HARVESTING_SIZE.get(), 0);

                for (int xOff = -harvestSize; xOff <= harvestSize; xOff++) {
                    for (int zOff = -harvestSize; zOff <= harvestSize; zOff++) {
                        BlockPos cropPos = pos.offset(xOff, 0, zOff);
                        BlockPos SoilPos = pos.offset(xOff, -1, zOff);
                        Block cropBlock = level.getBlockState(cropPos).getBlock();
                        Block soilBlock = level.getBlockState(SoilPos).getBlock();

                        if (soilBlock instanceof FarmBlock && cropBlock instanceof CropBlock crop)
                        {
                            if (crop.isMaxAge(level.getBlockState(cropPos)))
                            {
                                if (enchantments.containsKey(EnchantmentInit.AUTO_PLANTER.get()))
                                {
                                    dropLoot(level, cropPos, level.getBlockState(cropPos), block);

                                    level.setBlockAndUpdate(cropPos, crop.getStateForAge(0));   // the broken bit
                                } else
                                    level.destroyBlock(cropPos, true);                                       // the broken bit
                            }
                        }
                    }
                }
                stack.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(hand));
            }
        }

        return super.useOn(context);
    }

    private void dropLoot(@NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Block block)
    {
        List<ItemStack> drops = getDrops(level, pos, state);
        findSeeds(block, drops).ifPresent(seed -> seed.shrink(1));
        drops.forEach((drop) -> Block.popResource(level, pos, drop));
    }

    private List<ItemStack> getDrops(@NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state) { return Block.getDrops(state, (ServerLevel) level, pos, null); }

    private Optional<ItemStack> findSeeds(@NotNull Block block, final Collection<ItemStack> stacks)
    {
        Item seedsItem = block.asItem();
        return stacks.stream().filter((stack) -> stack.getItem() == seedsItem).findAny();
    }
}