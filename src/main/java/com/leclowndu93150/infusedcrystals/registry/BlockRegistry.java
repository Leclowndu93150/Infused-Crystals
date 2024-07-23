package com.leclowndu93150.infusedcrystals.registry;

import com.leclowndu93150.infusedcrystals.InfusedCrystalsMain;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(InfusedCrystalsMain.MODID);

    public static final DeferredBlock<Block> IRONIUM_BLOCK = BLOCKS.registerSimpleBlock("ironium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> COALIUM_BLOCK = BLOCKS.registerSimpleBlock("coalium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> REDSTONIUM_BLOCK = BLOCKS.registerSimpleBlock("redstonium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> LAPISIUM_BLOCK = BLOCKS.registerSimpleBlock("lapisium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> DIAMONDIUM_BLOCK = BLOCKS.registerSimpleBlock("diamondium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> EMRALDIUM_BLOCK = BLOCKS.registerSimpleBlock("emraldium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> GOLDIUM_BLOCK = BLOCKS.registerSimpleBlock("goldium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));

    public static final DeferredBlock<Block> INFUSED_IRONIUM_BLOCK = BLOCKS.registerSimpleBlock("infused_ironium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> INFUSED_COALIUM_BLOCK = BLOCKS.registerSimpleBlock("infused_coalium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> INFUSED_REDSTONIUM_BLOCK = BLOCKS.registerSimpleBlock("infused_redstonium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> INFUSED_LAPISIUM_BLOCK = BLOCKS.registerSimpleBlock("infused_lapisium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> INFUSED_DIAMONDIUM_BLOCK = BLOCKS.registerSimpleBlock("infused_diamondium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> INFUSED_EMRALDIUM_BLOCK = BLOCKS.registerSimpleBlock("infused_emraldium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));
    public static final DeferredBlock<Block> INFUSED_GOLDIUM_BLOCK = BLOCKS.registerSimpleBlock("infused_goldium_block", BlockBehaviour.Properties.of().sound(SoundType.METAL).destroyTime(3.0f));

}
