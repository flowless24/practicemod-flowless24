package flowless24.practicemod.datagen;

import flowless24.practicemod.PracticeMod;
import flowless24.practicemod.item.ModItemGroup;
import flowless24.practicemod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD, ModItems.OMLET, 1f, 100)
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier(PracticeMod.MOD_ID, "omlet_from_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD, ModItems.OMLET, 1f, 100)
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier(PracticeMod.MOD_ID, "omlet_from_smoking"));

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD, ModItems.OMLET, 1f, 100)
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier(PracticeMod.MOD_ID, "omlet_from_campfire_cooking"));
    }
}
