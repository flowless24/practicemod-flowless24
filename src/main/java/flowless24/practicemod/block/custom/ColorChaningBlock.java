package flowless24.practicemod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.awt.*;
import java.util.Random;

public class ColorChaningBlock extends Block {

    public static final IntProperty COLOR = IntProperty.of("color", 0, 15);

    public ColorChaningBlock(Settings settings) {
        super(settings);
        setDefaultState(this.getDefaultState().with(COLOR, 1));
    }

    Random random = new Random();


    Block[] woolType = {Blocks.BLACK_WOOL, Blocks.WHITE_WOOL, Blocks.BLUE_WOOL, Blocks.BROWN_WOOL, Blocks.YELLOW_WOOL, Blocks.RED_WOOL, Blocks.PURPLE_WOOL, Blocks.PINK_WOOL, Blocks.ORANGE_WOOL,
            Blocks.MAGENTA_WOOL, Blocks.LIME_WOOL, Blocks.LIGHT_GRAY_WOOL, Blocks.LIGHT_BLUE_WOOL, Blocks.GREEN_WOOL, Blocks.GRAY_WOOL, Blocks.CYAN_WOOL};

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(COLOR);
    }

    @Override
    public void onUse(BlockState blockState, World world, BlockPos pos,
                      PlayerEntity player, Hand hand, BlockHitResult hit) {

        if(!world.isClient){
            int newNumber = random.nextInt(0, woolType.length);
                world.setBlockState(pos, blockState.cycle(COLOR));
        }
    }

}
