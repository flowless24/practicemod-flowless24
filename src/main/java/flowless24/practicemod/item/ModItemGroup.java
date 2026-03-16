package flowless24.practicemod.item;

import flowless24.practicemod.PracticeMod;
import flowless24.practicemod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup NEW_STUFF = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PracticeMod.MOD_ID, "new_stuff"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.new_stuff"))
                    .icon(() -> new ItemStack(Items.IRON_INGOT)).entries((displayContext, entries) -> {
                        // Food
                        entries.add(ModItems.OMELET);

                        // Items
                        entries.add(ModItems.PRINTER);

                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY_INGOT);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);


                        // Blocks
                        entries.add(ModBlocks.WALKBLOCK);
                    }).build());

    public static void registerItemGroups(){

    }
}

