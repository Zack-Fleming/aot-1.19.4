package com.lightning_flash.aot.core.objects.items.tools.debug;

import com.lightning_flash.aot.core.init.ItemGroupInit;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DebugStick extends Item
{
    public DebugStick() { super(new Item.Properties().stacksTo(1)); }

    @Override
    public boolean isFoil(ItemStack stack) { return true; }

    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        Level level = context.getLevel();

        if (!level.isClientSide)
        {
            // get some information for repeated reference
            Player player = context.getPlayer();
            Direction direction = context.getClickedFace();

            BlockPos pos = context.getClickedPos();
            Block cBlock = level.getBlockState(pos).getBlock();
            SoundType cType = cBlock.getSoundType(cBlock.defaultBlockState(), level, pos, null);

            BlockPos oPos = pos.relative(direction);
            Block oBlock = level.getBlockState(oPos).getBlock();

            assert player != null;
            player.displayClientMessage(Component.literal(
                    "\nClicked Block:" +
                            "\n -name: " + cBlock +
                            "\n -pos : " + pos.getX() + ", " + pos.getY() + ", " + pos.getZ() +
                            "\n -resistance: " + cBlock.getExplosionResistance(cBlock.defaultBlockState(),level,pos,null) +
                            "\n -drops: " + Block.getDrops(cBlock.defaultBlockState(), (ServerLevel) level, pos, null) +
                            "\n -Sound Events:" +
                            "\n   -break: " + cBlock.getSoundType(cBlock.defaultBlockState(), level, pos, player).getBreakSound().getLocation().getPath() +
                            "\n   -place: " + cBlock.getSoundType(cBlock.defaultBlockState(),level,pos,player).getPlaceSound().getLocation().getPath() +
                            "\n   -step: " + cBlock.getSoundType(cBlock.defaultBlockState(),level,pos,player).getStepSound().getLocation().getPath() +
                            "\n   -fall: " + cBlock.getSoundType(cBlock.defaultBlockState(),level,pos,player).getFallSound().getLocation().getPath() +
                            "\n   -hit: " + cBlock.getSoundType(cBlock.defaultBlockState(),level,pos,player).getHitSound().getLocation().getPath() +
                            "\n\nOffset Block:" +
                            "\n -name: " + oBlock +
                            "\n -pos : " + oPos.getX() + ", "  + oPos.getY() + ", " + oPos.getX()
            ), false);
        }

        return InteractionResult.PASS;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(
                Component.literal(ChatFormatting.RED +
                        "Used to grab information of the clicked block, and the offset block. Information such as " +
                        "sound events, block properties, etc. Other testing features are currently planned, but are " +
                        "in a testing phase." + ChatFormatting.DARK_RED + " Warning: any features in testing phases, " +
                        "may be a bit buggy and cause crashes; tread lightly with these features."
                )
        );
    }
}