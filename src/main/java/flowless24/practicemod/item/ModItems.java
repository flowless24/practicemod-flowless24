package flowless24.practicemod.item;

import flowless24.practicemod.PracticeMod;
import flowless24.practicemod.block.custom.WalkBlock;
import flowless24.practicemod.item.custom.PrinterItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PRINTER = addItem("printer",
            new PrinterItem(new FabricItemSettings().maxDamage(64)));

    private static Item addItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(PracticeMod.MOD_ID, name), item);
    }

    public static void RegisterModItems(){
    PracticeMod.LOGGER.info("Registering mod items for " + PracticeMod.MOD_ID);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS);
    }
}
