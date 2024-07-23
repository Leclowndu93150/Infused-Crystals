package com.leclowndu93150.infusedcrystals.registry;

import com.leclowndu93150.infusedcrystals.InfusedCrystalsMain;
import com.leclowndu93150.infusedcrystals.common.AllInOneTool;
import com.leclowndu93150.infusedcrystals.common.InfusedCrystalItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(InfusedCrystalsMain.MODID);

    public static final DeferredItem<Item> IRONIUM_CRYSTAL = ITEMS.register("ironium_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COALIUM_CRYSTAL = ITEMS.register("coalium_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONIUM_CRYSTAL = ITEMS.register("redstonium_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAPISIUM_CRYSTAL = ITEMS.register("lapisium_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMONDIUM_CRYSTAL = ITEMS.register("diamondium_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMRALDIUM_CRYSTAL = ITEMS.register("emraldium_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDIUM_CRYSTAL = ITEMS.register("goldium_crystal", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> INFUSED_IRONIUM_CRYSTAL = ITEMS.register("infused_ironium_crystal", () -> new InfusedCrystalItem(new Item.Properties()));
    public static final DeferredItem<Item> INFUSED_COALIUM_CRYSTAL = ITEMS.register("infused_coalium_crystal", () -> new InfusedCrystalItem(new Item.Properties()));
    public static final DeferredItem<Item> INFUSED_REDSTONIUM_CRYSTAL = ITEMS.register("infused_redstonium_crystal", () -> new InfusedCrystalItem(new Item.Properties()));
    public static final DeferredItem<Item> INFUSED_LAPISIUM_CRYSTAL = ITEMS.register("infused_lapisium_crystal", () -> new InfusedCrystalItem(new Item.Properties()));
    public static final DeferredItem<Item> INFUSED_DIAMONDIUM_CRYSTAL = ITEMS.register("infused_diamondium_crystal", () -> new InfusedCrystalItem(new Item.Properties()));
    public static final DeferredItem<Item> INFUSED_EMRALDIUM_CRYSTAL = ITEMS.register("infused_emraldium_crystal", () -> new InfusedCrystalItem(new Item.Properties()));
    public static final DeferredItem<Item> INFUSED_GOLDIUM_CRYSTAL = ITEMS.register("infused_goldium_crystal", () -> new InfusedCrystalItem(new Item.Properties()));

    public static final DeferredItem<BlockItem> IRONIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ironium_block", BlockRegistry.IRONIUM_BLOCK);
    public static final DeferredItem<BlockItem> COALIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("coalium_block", BlockRegistry.COALIUM_BLOCK);
    public static final DeferredItem<BlockItem> REDSTONIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("redstonium_block", BlockRegistry.REDSTONIUM_BLOCK);
    public static final DeferredItem<BlockItem> LAPISIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("lapisium_block", BlockRegistry.LAPISIUM_BLOCK);
    public static final DeferredItem<BlockItem> DIAMONDIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("diamondium_block", BlockRegistry.DIAMONDIUM_BLOCK);
    public static final DeferredItem<BlockItem> EMRALDIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("emraldium_block", BlockRegistry.EMRALDIUM_BLOCK);
    public static final DeferredItem<BlockItem> GOLDIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("goldium_block", BlockRegistry.GOLDIUM_BLOCK);

    public static final DeferredItem<BlockItem> INFUSED_IRONIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("infused_ironium_block", BlockRegistry.INFUSED_IRONIUM_BLOCK);
    public static final DeferredItem<BlockItem> INFUSED_COALIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("infused_coalium_block", BlockRegistry.INFUSED_COALIUM_BLOCK);
    public static final DeferredItem<BlockItem> INFUSED_REDSTONIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("infused_redstonium_block", BlockRegistry.INFUSED_REDSTONIUM_BLOCK);
    public static final DeferredItem<BlockItem> INFUSED_LAPISIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("infused_lapisium_block", BlockRegistry.INFUSED_LAPISIUM_BLOCK);
    public static final DeferredItem<BlockItem> INFUSED_DIAMONDIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("infused_diamondium_block", BlockRegistry.INFUSED_DIAMONDIUM_BLOCK);
    public static final DeferredItem<BlockItem> INFUSED_EMRALDIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("infused_emraldium_block", BlockRegistry.INFUSED_EMRALDIUM_BLOCK);
    public static final DeferredItem<BlockItem> INFUSED_GOLDIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("infused_goldium_block", BlockRegistry.INFUSED_GOLDIUM_BLOCK);

    public static final DeferredItem<Item> INFUSED_IRONIUM_AIOT = ITEMS.register("infused_ironium_aiot", () -> new AllInOneTool(Tiers.IRON));
    public static final DeferredItem<Item> INFUSED_COALIUM_AIOT = ITEMS.register("infused_coalium_aiot", () -> new AllInOneTool(Tiers.STONE));
    public static final DeferredItem<Item> INFUSED_REDSTONIUM_AIOT = ITEMS.register("infused_redstonium_aiot", () -> new AllInOneTool(Tiers.IRON));
    public static final DeferredItem<Item> INFUSED_LAPISIUM_AIOT = ITEMS.register("infused_lapisium_aiot", () -> new AllInOneTool(Tiers.IRON));
    public static final DeferredItem<Item> INFUSED_DIAMONDIUM_AIOT = ITEMS.register("infused_diamondium_aiot", () -> new AllInOneTool(Tiers.DIAMOND));
    public static final DeferredItem<Item> INFUSED_EMRALDIUM_AIOT = ITEMS.register("infused_emraldium_aiot", () -> new AllInOneTool(Tiers.DIAMOND));
    public static final DeferredItem<Item> INFUSED_GOLDIUM_AIOT = ITEMS.register("infused_goldium_aiot", () -> new AllInOneTool(Tiers.GOLD));

}
