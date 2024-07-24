package com.leclowndu93150.infusedcrystals.datagen;

import com.leclowndu93150.infusedcrystals.registry.BlockRegistry;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Set;

public class ICLootTableProvider extends BlockLootSubProvider {

    private final Set<Block> knownBlocks = new ReferenceOpenHashSet<>();

    protected ICLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Collections.emptySet(), FeatureFlags.VANILLA_SET, pRegistries);
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return knownBlocks;
    }

    @Override
    protected void add(@NotNull Block block, @NotNull LootTable.Builder table) {
        //Overwrite the core register method to add to our list of known blocks
        super.add(block, table);
        knownBlocks.add(block);
    }

    @Override
    protected void generate() {
        dropSelf(BlockRegistry.IRONIUM_BLOCK.get());
        dropSelf(BlockRegistry.COALIUM_BLOCK.get());
        dropSelf(BlockRegistry.REDSTONIUM_BLOCK.get());
        dropSelf(BlockRegistry.LAPISIUM_BLOCK.get());
        dropSelf(BlockRegistry.DIAMONDIUM_BLOCK.get());
        dropSelf(BlockRegistry.EMRALDIUM_BLOCK.get());
        dropSelf(BlockRegistry.GOLDIUM_BLOCK.get());
        dropSelf(BlockRegistry.INFUSED_IRONIUM_BLOCK.get());
        dropSelf(BlockRegistry.INFUSED_COALIUM_BLOCK.get());
        dropSelf(BlockRegistry.INFUSED_REDSTONIUM_BLOCK.get());
        dropSelf(BlockRegistry.INFUSED_LAPISIUM_BLOCK.get());
        dropSelf(BlockRegistry.INFUSED_DIAMONDIUM_BLOCK.get());
        dropSelf(BlockRegistry.INFUSED_EMRALDIUM_BLOCK.get());
        dropSelf(BlockRegistry.INFUSED_GOLDIUM_BLOCK.get());
    }
}
