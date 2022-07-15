package net.linkle.botg.utils;

import static net.linkle.botg.Main.MOD_ID;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Util {
    public static Item register(String ID, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, ID), item);
    }

    public static Block register(String ID, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, ID), block);
    }

    public static void register(String ID, BlockItem item) {
        var id = new Identifier(MOD_ID, ID);
        Registry.register(Registry.BLOCK, id, item.getBlock());
        Registry.register(Registry.ITEM, id, item);
    }

    public static void registerWithItem(String ID, Block block, Item.Settings settings) {
        var id = new Identifier(MOD_ID, ID);
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, settings));
    }
}
