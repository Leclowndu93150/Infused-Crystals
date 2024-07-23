package com.leclowndu93150.infusedcrystals.common;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class InfusedCrystalItem extends Item {

    public InfusedCrystalItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }
}
