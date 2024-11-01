package com.leclowndu93150.infusedcrystals.registry;

import com.leclowndu93150.infusedcrystals.InfusedCrystalsMain;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class Tags {
    public static void init() {
        Blocks.touch();
    }
    public static class Blocks {
        public static void touch() {
            // load the stupid tags
        }

        public static final TagKey<Block> MINEABLE_WITH_AIO = tag("mineable/aio");

        private static TagKey<Block> tag(String name) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(InfusedCrystalsMain.MODID, name));
        }
    }

}
