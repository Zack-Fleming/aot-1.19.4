package com.lightning_flash.aot.core.objects.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class AlkaliResourceBlock extends ToolTipBlock
{
    float explosionRadius;
    Player placedBy;

    public AlkaliResourceBlock(float explosionRadius, String tooltip) {
        super(BlockBehaviour.Properties
                .of(Material.METAL, MaterialColor.METAL)
                .requiresCorrectToolForDrops()
                .strength(5.0f, 6.0f)
                .sound(SoundType.METAL),
                tooltip
        );

        this.explosionRadius = explosionRadius;
    }

    @Override
    public void onPlace(BlockState state1, Level level, BlockPos pos, BlockState state2, boolean something) {
        // debugging
        placedBy.displayClientMessage(Component.translatable(
                "BlockState1: " + state1 +
                         "\nBlockState2: " + state2 +
                         "\nBlockPos   : " + pos +
                         "\n\n"
        ), false);
    }

    @Override
    public void setPlacedBy(Level p_49847_, BlockPos p_49848_, BlockState p_49849_, @Nullable LivingEntity p_49850_, ItemStack p_49851_) {
        super.setPlacedBy(p_49847_, p_49848_, p_49849_, p_49850_, p_49851_);
        if (p_49850_ instanceof Player) placedBy = (Player) p_49850_;
    }

    /**
     *
     * @param state      - parent block (block that fired the method)
     * @param level      - current level
     * @param pos        - position of parent block
     * @param block      - block before th change
     * @param fromPos    - position of the change
     * @param something  - something ???
     */
    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean something) {
        // debugging
        placedBy.displayClientMessage(Component.translatable(
                "Neighbor Changed Info:" +
                         "\n  Level     : " + level +
                         "\n  BlockPos1 : " + pos +
                         "\n  BlockPos2 : " + fromPos +
                         "\n  BlockState: " + state +
                         "\n  Block     : " + block +
                         "\n  Boolean   : " + something +
                         "\n\n"
        ), false);

        Block newBlock = level.getBlockState(fromPos).getBlock();

        placedBy.displayClientMessage(Component.translatable("New Block: " + newBlock), false);
    }

    public float getExplosionRadius() { return this.explosionRadius; }

    @Override
    public InteractionResult use(BlockState state, Level lvl, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitRes) {
        ItemStack stack = player.getItemInHand(hand);
        if(stack.is(Items.FLINT_AND_STEEL))
        {
            System.out.println("FIRE!!!");
        }

        return InteractionResult.sidedSuccess(lvl.isClientSide);
    }
}