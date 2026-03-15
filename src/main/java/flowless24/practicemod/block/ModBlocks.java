package flowless24.practicemod.block;

import flowless24.practicemod.PracticeMod;
import flowless24.practicemod.block.custom.WalkBlock;
import flowless24.practicemod.item.custom.PrinterItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block WALKBLOCK = addBlock("walk_block",
            new WalkBlock(FabricBlockSettings.copyOf(Blocks.NOTE_BLOCK)));

    public static final Block RUBY_ORE = addBlock("ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_RUBY_ORE = addBlock("deepslate_ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block RUBY_BLOCK = addBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    private static Block addBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PracticeMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PracticeMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }



    public static void RegisterModBlocks(){
    PracticeMod.LOGGER.info("Registering mod items for " + PracticeMod.MOD_ID);
    }
}
