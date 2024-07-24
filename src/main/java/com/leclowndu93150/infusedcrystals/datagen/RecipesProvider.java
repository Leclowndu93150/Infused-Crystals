package com.leclowndu93150.infusedcrystals.datagen;

import com.leclowndu93150.infusedcrystals.registry.ItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class RecipesProvider extends RecipeProvider {
    public RecipesProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.IRONIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.IRONIUM_CRYSTAL)
                .unlockedBy("has_ironium_ingot", has(ItemRegistry.IRONIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/ironium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.COALIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.COALIUM_CRYSTAL)
                .unlockedBy("has_coalium_ingot", has(ItemRegistry.COALIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/coalium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.REDSTONIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.REDSTONIUM_CRYSTAL)
                .unlockedBy("has_redstonium_ingot", has(ItemRegistry.REDSTONIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/redstonium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.LAPISIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.LAPISIUM_CRYSTAL)
                .unlockedBy("has_lapisium_ingot", has(ItemRegistry.LAPISIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/lapisium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.DIAMONDIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.DIAMONDIUM_CRYSTAL)
                .unlockedBy("has_diamondium_ingot", has(ItemRegistry.DIAMONDIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/diamondium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.EMRALDIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.EMRALDIUM_CRYSTAL)
                .unlockedBy("has_emraldium_ingot", has(ItemRegistry.EMRALDIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/emraldium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.GOLDIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.GOLDIUM_CRYSTAL)
                .unlockedBy("has_goldium_ingot", has(ItemRegistry.GOLDIUM_CRYSTAL));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_IRONIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.INFUSED_IRONIUM_CRYSTAL)
                .unlockedBy("has_infused_ironium_ingot", has(ItemRegistry.INFUSED_IRONIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/infused_ironium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_COALIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.INFUSED_COALIUM_CRYSTAL)
                .unlockedBy("has_infused_coalium_ingot", has(ItemRegistry.INFUSED_COALIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/infused_coalium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_REDSTONIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.INFUSED_REDSTONIUM_CRYSTAL)
                .unlockedBy("has_infused_redstonium_ingot", has(ItemRegistry.INFUSED_REDSTONIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/infused_redstonium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_LAPISIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.INFUSED_LAPISIUM_CRYSTAL)
                .unlockedBy("has_infused_lapisium_ingot", has(ItemRegistry.INFUSED_LAPISIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/infused_lapisium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_DIAMONDIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.INFUSED_DIAMONDIUM_CRYSTAL)
                .unlockedBy("has_infused_diamondium_ingot", has(ItemRegistry.INFUSED_DIAMONDIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/infused_diamondium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_EMRALDIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.INFUSED_EMRALDIUM_CRYSTAL)
                .unlockedBy("has_infused_emraldium_ingot", has(ItemRegistry.INFUSED_EMRALDIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/infused_emraldium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_GOLDIUM_BLOCK_ITEM.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemRegistry.INFUSED_GOLDIUM_CRYSTAL)
                .unlockedBy("has_infused_goldium_ingot", has(ItemRegistry.INFUSED_GOLDIUM_CRYSTAL))
                .save(pRecipeOutput, "shaped/infused_goldium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.IRONIUM_CRYSTAL, 9)
                .requires(ItemRegistry.IRONIUM_BLOCK_ITEM)
                .unlockedBy("has_ironium_block", has(ItemRegistry.IRONIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/ironium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.COALIUM_CRYSTAL, 9)
                .requires(ItemRegistry.COALIUM_BLOCK_ITEM)
                .unlockedBy("has_coalium_block", has(ItemRegistry.COALIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/coalium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.REDSTONIUM_CRYSTAL, 9)
                .requires(ItemRegistry.REDSTONIUM_BLOCK_ITEM)
                .unlockedBy("has_redstonium_block", has(ItemRegistry.REDSTONIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/redstonium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.LAPISIUM_CRYSTAL, 9)
                .requires(ItemRegistry.LAPISIUM_BLOCK_ITEM)
                .unlockedBy("has_lapisium_block", has(ItemRegistry.LAPISIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/lapisium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.DIAMONDIUM_CRYSTAL, 9)
                .requires(ItemRegistry.DIAMONDIUM_BLOCK_ITEM)
                .unlockedBy("has_diamondium_block", has(ItemRegistry.DIAMONDIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/diamondium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.EMRALDIUM_CRYSTAL, 9)
                .requires(ItemRegistry.EMRALDIUM_BLOCK_ITEM)
                .unlockedBy("has_emraldium_block", has(ItemRegistry.EMRALDIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/emraldium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.GOLDIUM_CRYSTAL, 9)
                .requires(ItemRegistry.GOLDIUM_BLOCK_ITEM)
                .unlockedBy("has_goldium_block", has(ItemRegistry.GOLDIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/goldium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.INFUSED_IRONIUM_CRYSTAL, 9)
                .requires(ItemRegistry.INFUSED_IRONIUM_BLOCK_ITEM)
                .unlockedBy("has_infused_ironium_block", has(ItemRegistry.INFUSED_IRONIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/infused_ironium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.INFUSED_COALIUM_CRYSTAL, 9)
                .requires(ItemRegistry.INFUSED_COALIUM_BLOCK_ITEM)
                .unlockedBy("has_infused_coalium_block", has(ItemRegistry.INFUSED_COALIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/infused_coalium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.INFUSED_REDSTONIUM_CRYSTAL, 9)
                .requires(ItemRegistry.INFUSED_REDSTONIUM_BLOCK_ITEM)
                .unlockedBy("has_infused_redstonium_block", has(ItemRegistry.INFUSED_REDSTONIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/infused_redstonium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.INFUSED_LAPISIUM_CRYSTAL, 9)
                .requires(ItemRegistry.INFUSED_LAPISIUM_BLOCK_ITEM)
                .unlockedBy("has_infused_lapisium_block", has(ItemRegistry.INFUSED_LAPISIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/infused_lapisium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.INFUSED_DIAMONDIUM_CRYSTAL, 9)
                .requires(ItemRegistry.INFUSED_DIAMONDIUM_BLOCK_ITEM)
                .unlockedBy("has_infused_diamondium_block", has(ItemRegistry.INFUSED_DIAMONDIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/infused_diamondium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.INFUSED_EMRALDIUM_CRYSTAL, 9)
                .requires(ItemRegistry.INFUSED_EMRALDIUM_BLOCK_ITEM)
                .unlockedBy("has_infused_emraldium_block", has(ItemRegistry.INFUSED_EMRALDIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/infused_emraldium_crystal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegistry.INFUSED_GOLDIUM_CRYSTAL, 9)
                .requires(ItemRegistry.INFUSED_GOLDIUM_BLOCK_ITEM)
                .unlockedBy("has_infused_goldium_block", has(ItemRegistry.INFUSED_GOLDIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shapeless/infused_goldium_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_IRONIUM_AIOT.get())
                .pattern("IAI")
                .pattern("ABA")
                .pattern(" B ")
                .define('I', ItemRegistry.INFUSED_IRONIUM_BLOCK_ITEM)
                .define('A', ItemRegistry.INFUSED_IRONIUM_CRYSTAL)
                .define('B', Items.STICK)
                .unlockedBy("has_ironium_block", has(ItemRegistry.INFUSED_IRONIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shaped/ironium_aiot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_COALIUM_AIOT.get())
                .pattern("IAI")
                .pattern("ABA")
                .pattern(" B ")
                .define('I', ItemRegistry.INFUSED_COALIUM_BLOCK_ITEM)
                .define('A', ItemRegistry.INFUSED_COALIUM_CRYSTAL)
                .define('B', Items.STICK)
                .unlockedBy("has_coalium_block", has(ItemRegistry.INFUSED_COALIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shaped/coalium_aiot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_REDSTONIUM_AIOT.get())
                .pattern("IAI")
                .pattern("ABA")
                .pattern(" B ")
                .define('I', ItemRegistry.INFUSED_REDSTONIUM_BLOCK_ITEM)
                .define('A', ItemRegistry.INFUSED_REDSTONIUM_CRYSTAL)
                .define('B', Items.STICK)
                .unlockedBy("has_redstonium_block", has(ItemRegistry.INFUSED_REDSTONIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shaped/redstonium_aiot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_LAPISIUM_AIOT.get())
                .pattern("IAI")
                .pattern("ABA")
                .pattern(" B ")
                .define('I', ItemRegistry.INFUSED_LAPISIUM_BLOCK_ITEM)
                .define('A', ItemRegistry.INFUSED_LAPISIUM_CRYSTAL)
                .define('B', Items.STICK)
                .unlockedBy("has_lapisium_block", has(ItemRegistry.INFUSED_LAPISIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shaped/lapisium_aiot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_DIAMONDIUM_AIOT.get())
                .pattern("IAI")
                .pattern("ABA")
                .pattern(" B ")
                .define('I', ItemRegistry.INFUSED_DIAMONDIUM_BLOCK_ITEM)
                .define('A', ItemRegistry.INFUSED_DIAMONDIUM_CRYSTAL)
                .define('B', Items.STICK)
                .unlockedBy("has_diamondium_block", has(ItemRegistry.INFUSED_DIAMONDIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shaped/diamondium_aiot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_EMRALDIUM_AIOT.get())
                .pattern("IAI")
                .pattern("ABA")
                .pattern(" B ")
                .define('I', ItemRegistry.INFUSED_EMRALDIUM_BLOCK_ITEM)
                .define('A', ItemRegistry.INFUSED_EMRALDIUM_CRYSTAL)
                .define('B', Items.STICK)
                .unlockedBy("has_emraldium_block", has(ItemRegistry.INFUSED_EMRALDIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shaped/emraldium_aiot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.INFUSED_GOLDIUM_AIOT.get())
                .pattern("IAI")
                .pattern("ABA")
                .pattern(" B ")
                .define('I', ItemRegistry.INFUSED_GOLDIUM_BLOCK_ITEM)
                .define('A', ItemRegistry.INFUSED_GOLDIUM_CRYSTAL)
                .define('B', Items.STICK)
                .unlockedBy("has_goldium_block", has(ItemRegistry.INFUSED_GOLDIUM_BLOCK_ITEM))
                .save(pRecipeOutput, "shaped/goldium_aiot");

    }
}
