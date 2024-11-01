package com.leclowndu93150.infusedcrystals.datagen;

import com.leclowndu93150.infusedcrystals.InfusedCrystalsMain;
import com.leclowndu93150.infusedcrystals.registry.BlockRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.swing.*;
import java.util.concurrent.CompletableFuture;

public class BlockTagsGenerator extends BlockTagsProvider {
    public BlockTagsGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, InfusedCrystalsMain.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(@Nonnull HolderLookup.Provider provider) {
        for (DeferredHolder<Block, ? extends Block> block : BlockRegistry.BLOCKS.getEntries()) {
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block.get());
        }

        this.tag(com.leclowndu93150.infusedcrystals.registry.Tags.Blocks.MINEABLE_WITH_AIO).addTags(
                BlockTags.MINEABLE_WITH_AXE,
                BlockTags.MINEABLE_WITH_HOE,
                BlockTags.MINEABLE_WITH_PICKAXE,
                BlockTags.MINEABLE_WITH_SHOVEL
        );
    }
}