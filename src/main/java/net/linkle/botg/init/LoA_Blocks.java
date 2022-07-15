package net.linkle.botg.init;

import net.linkle.botg.utils.Util;
import net.minecraft.block.*;
import net.minecraft.item.Item;

public class LoA_Blocks {
    public static final Block TAN_POT = new OreBlock(AbstractBlock.Settings.copy(Blocks.GLASS).breakInstantly());
    public static final Block BLUE_POT = new OreBlock(AbstractBlock.Settings.copy(Blocks.GLASS).breakInstantly());

    public static final Block SKY_STONE = new Block(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block SKY_GRASS = new Block(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block SKY_PATH = new Block(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block SKY_COBBLE = new Block(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));


    public static final Block CRATE = new BarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL));

    public static final Block OLD_COBWEB = new CobwebBlock(AbstractBlock.Settings.copy(Blocks.COBWEB));

    public static final Block ELDIN_STEEL_BLOCK = new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));

    public static void initialize() {
        Util.registerWithItem("tan_clay_pot", TAN_POT, itemSettings());
        Util.registerWithItem("blue_clay_pot", BLUE_POT, itemSettings());

        Util.registerWithItem("sky_stone", SKY_STONE, itemSettings());
        Util.registerWithItem("sky_cobblestone", SKY_COBBLE, itemSettings());
        Util.registerWithItem("sky_grass", SKY_GRASS, itemSettings());
        Util.registerWithItem("sky_path", SKY_PATH, itemSettings());

        Util.registerWithItem("crate", CRATE, itemSettings());

        Util.registerWithItem("old_cobweb", OLD_COBWEB, itemSettings());

        Util.registerWithItem("eldin_steel_block", ELDIN_STEEL_BLOCK, itemSettings());
    }
    
    private static final Item.Settings itemSettings() {
        return new Item.Settings().group(LoA_Group.LoA_Group);
    }
}