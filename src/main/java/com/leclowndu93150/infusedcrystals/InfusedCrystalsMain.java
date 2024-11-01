package com.leclowndu93150.infusedcrystals;

import com.leclowndu93150.infusedcrystals.registry.BlockRegistry;
import com.leclowndu93150.infusedcrystals.registry.CreativeTabRegistry;
import com.leclowndu93150.infusedcrystals.registry.ItemRegistry;
import com.leclowndu93150.infusedcrystals.registry.Tags;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(InfusedCrystalsMain.MODID)
public class InfusedCrystalsMain
{
    public static final String MODID = "infused_crystals";

    public InfusedCrystalsMain(IEventBus modEventBus, ModContainer modContainer)
    {
        BlockRegistry.BLOCKS.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modEventBus);
        Tags.init();
    }

}
