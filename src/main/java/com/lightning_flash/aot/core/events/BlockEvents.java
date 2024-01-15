package com.lightning_flash.aot.core.events;

import com.lightning_flash.aot.AOTMain;
import com.lightning_flash.aot.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.SurfaceSystem;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@Mod.EventBusSubscriber(modid = AOTMain.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BlockEvents
{
    private static final List<Block> HOT_BLOCKS = List.of(Blocks.LAVA, Blocks.LAVA_CAULDRON, Blocks.MAGMA_BLOCK, Blocks.FIRE);
    private static final List<Item> WOOLEN_BLOCKS = List.of(
            Blocks.ORANGE_WOOL.asItem(), Blocks.MAGENTA_WOOL.asItem(), Blocks.LIGHT_BLUE_WOOL.asItem(), Blocks.YELLOW_WOOL.asItem(),
            Blocks.LIME_WOOL.asItem(), Blocks.PINK_WOOL.asItem(), Blocks.GRAY_WOOL.asItem(), Blocks.LIGHT_GRAY_WOOL.asItem(),
            Blocks.CYAN_WOOL.asItem(), Blocks.PURPLE_WOOL.asItem(), Blocks.BLUE_WOOL.asItem(), Blocks.BROWN_WOOL.asItem(),
            Blocks.GREEN_WOOL.asItem(), Blocks.RED_WOOL.asItem(), Blocks.BLACK_WOOL.asItem());

    @SubscribeEvent
    public static void rightClickBlock(PlayerInteractEvent.RightClickBlock event)
    {
        Player player       = event.getEntity();
        Level level         = player.getLevel();
        BlockPos pos        = event.getPos();
        BlockState state    = level.getBlockState(pos);
        ItemStack stack     = player.getItemInHand(event.getHand());
        Item held_item      = stack.getItem();

        if (!level.isClientSide)
        {
            // bone shard event
            if (state.is(Tags.Blocks.STONE) || state.is(Blocks.DRIPSTONE_BLOCK) || state.is(Blocks.OBSIDIAN) || state.is(Blocks.CRYING_OBSIDIAN))
            {
                if (held_item == Items.BONE)
                {
                    int count = AOTMain.RANDOM.nextInt(0, 3);
                    level.playSound((Player) null, pos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS,1.0f , (1.0F + level.random.nextFloat() * 0.2F) * 0.7F);
                    stack.setCount(stack.getCount() - 1);
                    player.drop(new ItemStack(ItemInit.SHARD_BONE.get().asItem(), count), true);
                }
            }

            // wool undye event
            else if (state.is(Blocks.WATER_CAULDRON))
            {
                if (WOOLEN_BLOCKS.contains(held_item))
                {
                    ((LayeredCauldronBlock) state.getBlock()).lowerFillLevel(state, level, pos);
                    level.playSound((Player) null, pos, SoundEvents.PLAYER_SPLASH, SoundSource.BLOCKS, 1.0F, (1.0F + level.random.nextFloat() * 0.2F) * 0.7F);
                    player.drop(new ItemStack(Items.WHITE_WOOL, 1), true);
                    stack.setCount(stack.getCount() - 1);
                }
            }
        }
    }

    @SubscribeEvent
    public static void neighborChanged(BlockEvent.NeighborNotifyEvent event)
    {
        BlockPos pos = event.getPos();
        LevelAccessor world = event.getLevel();
        Block block = world.getBlockState(pos).getBlock();
        int lookDist = 7/2;

        // sponge drying next to 'hot blocks'
        if (block instanceof WetSpongeBlock)
        {
//            System.out.println("i am triggered!!!!");
//            world.setBlock(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), Blocks.RED_WOOL.defaultBlockState(), 3);
//            world.setBlock(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), Blocks.RED_WOOL.defaultBlockState(), 3);
//
//            world.setBlock(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), Blocks.BLUE_WOOL.defaultBlockState(), 3);
//            world.setBlock(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), Blocks.BLUE_WOOL.defaultBlockState(), 3);
//
//            world.setBlock(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), Blocks.GREEN_WOOL.defaultBlockState(), 3);
//            world.setBlock(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1), Blocks.GREEN_WOOL.defaultBlockState(), 3);

            for (int h = -lookDist; h <= lookDist; h++)
            {
                for (int j = -lookDist; j <= lookDist; j ++)
                {
                    for (int i = -lookDist; i <= lookDist; i++)
                    {
                        BlockPos newPos = new BlockPos(pos.getX() + i, pos.getY() + j, pos.getZ() + h);

                        if (HOT_BLOCKS.contains(world.getBlockState(newPos).getBlock()))
                        {
                            world.setBlock(pos, Blocks.SPONGE.defaultBlockState(), 3);
                            world.levelEvent(2009, pos, 0);
                            world.playSound((Player) null, pos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 1.0F, (1.0F + world.getRandom().nextFloat() * 0.2F) * 0.7F);
                            return;
                        }
                    }
                }
            }
        }

        // 'hot blocks' drying sponges
        else if (HOT_BLOCKS.contains(block))
        {
            for (int h = -lookDist; h <= lookDist; h++)
            {
                for (int j = -lookDist; j <= lookDist; j++)
                {
                    for (int i = -lookDist; i <= lookDist; i++)
                    {
                        BlockPos newPos = new BlockPos(pos.getX() + i, pos.getY() + j, pos.getZ() + h);

                        if (world.getBlockState(newPos).getBlock() instanceof WetSpongeBlock)
                        {
                            world.setBlock(newPos, Blocks.SPONGE.defaultBlockState(), 3);
                            world.levelEvent(2009, pos, 0);
                            world.playSound((Player) null, pos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 1.0F, (1.0F + world.getRandom().nextFloat() * 0.2F) * 0.7F);
                        }
                    }
                }
            }
        }
    }
}
