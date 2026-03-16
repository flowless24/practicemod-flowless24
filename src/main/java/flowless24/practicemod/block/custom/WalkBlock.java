package flowless24.practicemod.block.custom;

import flowless24.practicemod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WalkBlock extends Block {
    public WalkBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity){
        if (!world.isClient && entity instanceof PlayerEntity player){
            player.getItemCooldownManager().set(ModBlocks.WALKBLOCK.asItem(), 10);
            player.sendMessage(Text.literal(player.getEntityName() + " walked on the block!"));
        }
    }
}
