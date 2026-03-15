package flowless24.practicemod.datagen;

import flowless24.practicemod.block.ModBlocks;
import flowless24.practicemod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Custom Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WALKBLOCK);

        // REgular Items
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Custom Items
        itemModelGenerator.register(ModItems.PRINTER, Models.GENERATED);

        // Regular Items
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_INGOT, Models.GENERATED);

        // Food
        itemModelGenerator.register(ModItems.OMLET, Models.GENERATED);
    }
}
