package com.leclowndu93150.infusedcrystals.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.leclowndu93150.infusedcrystals.InfusedCrystalsMain.MODID;
import static com.leclowndu93150.infusedcrystals.registry.ItemRegistry.ITEMS;

public class CreativeTabRegistry {


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CRYSTAL_TAB = CREATIVE_MODE_TABS.register("infused_crystals", () -> CreativeModeTab.builder()
            .title(Component.literal("Infused Crystals")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemRegistry.INFUSED_REDSTONIUM_CRYSTAL.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (DeferredHolder<Item, ? extends Item> item : ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());

}
