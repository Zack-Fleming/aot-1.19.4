package com.lightning_flash.aot.core.objects.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class AlkaliResourceBlock extends ToolTipBlock
{
    float explosionRadius;

    public AlkaliResourceBlock(float explosionRadius, String tooltip) {
        super(BlockBehaviour.Properties
                .of(Material.WOOD, MaterialColor.METAL)
                .requiresCorrectToolForDrops()
                .strength(5.0f, 6.0f)
                .sound(SoundType.METAL),
                tooltip
        );

        this.explosionRadius = explosionRadius;
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return true; }

    @Override
    public void onCaughtFire(BlockState state, Level level, BlockPos pos, @Nullable Direction direction, @Nullable LivingEntity igniter)
    {
        //super.onCaughtFire(state, level, pos, direction, igniter);

        if (!level.isClientSide)
        {
            PrimedTnt primedTnt = new PrimedTnt(level, pos.getX() + 0.5, pos.getY() + 0.5,  pos.getZ() + 0.5, igniter);
            level.addFreshEntity(primedTnt);
            level.gameEvent(igniter, GameEvent.PRIME_FUSE, pos);
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult)
    {
        ItemStack tool = player.getItemInHand(hand);

        if (!tool.is(Items.FLINT_AND_STEEL) && !tool.is(Items.FIRE_CHARGE))
        {
            return super.use(state, level, pos, player, hand, hitResult);
        }
        else
        {
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
    }

    public float getExplosionRadius() { return this.explosionRadius; }
}