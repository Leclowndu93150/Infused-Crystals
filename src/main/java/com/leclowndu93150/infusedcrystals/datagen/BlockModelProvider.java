package com.leclowndu93150.infusedcrystals.datagen;

import com.leclowndu93150.infusedcrystals.InfusedCrystalsMain;
import com.leclowndu93150.infusedcrystals.registry.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlockModelProvider extends BlockStateProvider {
    public BlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, InfusedCrystalsMain.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockRegistry.IRONIUM_BLOCK.get());
        simpleBlock(BlockRegistry.COALIUM_BLOCK.get());
        simpleBlock(BlockRegistry.REDSTONIUM_BLOCK.get());
        simpleBlock(BlockRegistry.LAPISIUM_BLOCK.get());
        simpleBlock(BlockRegistry.DIAMONDIUM_BLOCK.get());
        simpleBlock(BlockRegistry.EMRALDIUM_BLOCK.get());
        simpleBlock(BlockRegistry.GOLDIUM_BLOCK.get());
        simpleBlock(BlockRegistry.INFUSED_IRONIUM_BLOCK.get());
        simpleBlock(BlockRegistry.INFUSED_COALIUM_BLOCK.get());
        simpleBlock(BlockRegistry.INFUSED_REDSTONIUM_BLOCK.get());
        simpleBlock(BlockRegistry.INFUSED_LAPISIUM_BLOCK.get());
        simpleBlock(BlockRegistry.INFUSED_DIAMONDIUM_BLOCK.get());
        simpleBlock(BlockRegistry.INFUSED_EMRALDIUM_BLOCK.get());
        simpleBlock(BlockRegistry.INFUSED_GOLDIUM_BLOCK.get());
        simpleBlockItem(BlockRegistry.IRONIUM_BLOCK.get(), models().getExistingFile(modLoc("block/ironium_block")));
        simpleBlockItem(BlockRegistry.COALIUM_BLOCK.get(), models().getExistingFile(modLoc("block/coalium_block")));
        simpleBlockItem(BlockRegistry.REDSTONIUM_BLOCK.get(), models().getExistingFile(modLoc("block/redstonium_block")));
        simpleBlockItem(BlockRegistry.LAPISIUM_BLOCK.get(), models().getExistingFile(modLoc("block/lapisium_block")));
        simpleBlockItem(BlockRegistry.DIAMONDIUM_BLOCK.get(), models().getExistingFile(modLoc("block/diamondium_block")));
        simpleBlockItem(BlockRegistry.EMRALDIUM_BLOCK.get(), models().getExistingFile(modLoc("block/emraldium_block")));
        simpleBlockItem(BlockRegistry.GOLDIUM_BLOCK.get(), models().getExistingFile(modLoc("block/goldium_block")));
        simpleBlockItem(BlockRegistry.INFUSED_IRONIUM_BLOCK.get(), models().getExistingFile(modLoc("block/infused_ironium_block")));
        simpleBlockItem(BlockRegistry.INFUSED_COALIUM_BLOCK.get(), models().getExistingFile(modLoc("block/infused_coalium_block")));
        simpleBlockItem(BlockRegistry.INFUSED_REDSTONIUM_BLOCK.get(), models().getExistingFile(modLoc("block/infused_redstonium_block")));
        simpleBlockItem(BlockRegistry.INFUSED_LAPISIUM_BLOCK.get(), models().getExistingFile(modLoc("block/infused_lapisium_block")));
        simpleBlockItem(BlockRegistry.INFUSED_DIAMONDIUM_BLOCK.get(), models().getExistingFile(modLoc("block/infused_diamondium_block")));
        simpleBlockItem(BlockRegistry.INFUSED_EMRALDIUM_BLOCK.get(), models().getExistingFile(modLoc("block/infused_emraldium_block")));
        simpleBlockItem(BlockRegistry.INFUSED_GOLDIUM_BLOCK.get(), models().getExistingFile(modLoc("block/infused_goldium_block")));
    }
}