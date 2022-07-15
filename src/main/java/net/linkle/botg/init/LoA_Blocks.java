package net.linkle.botg.init;

import net.linkle.botg.blocks.*;
import net.linkle.botg.utils.Util;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

public class LoA_Blocks {
    public static final Block TAN_POT = new PotBlock();
    public static final Block BLUE_POT = new PotBlock();

    //public static final Block SKY_STONE = new Block(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block SKY_GRASS = new Block(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block LANAYRU_POT = new Block(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block LANAYRU_GRAVEL = new FallingBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL).sounds(BlockSoundGroup.GRAVEL));

    public static final Block LANAYRU_SYMBOL = new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_MOSSY = new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_CRACKED = new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_HARDENED = new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_SMOOTH = new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_DRAIN = new MagmaBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_FLOOR = new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block BANISTER = new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));

    public static final Block SKY_PATH = new Block(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).sounds(BlockSoundGroup.DEEPSLATE));
    //public static final Block SKY_COBBLE = new Block(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));

    public static final Block CRATE = new BarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL));
    
    public static final Block BRAZIER = new BrazierBlock(15, 1);
    public static final Block SOUL_BRAZIER = new BrazierBlock(10, 2);

    public static final Block OLD_COBWEB = new CobwebBlock(AbstractBlock.Settings.copy(Blocks.COBWEB));

    public static final Block ELDIN_STEEL_BLOCK = new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));

    public static void initialize() {
        Util.registerWithItem("tan_clay_pot", TAN_POT, itemSettings());
        Util.registerWithItem("blue_clay_pot", BLUE_POT, itemSettings());

        //Util.registerWithItem("sky_stone", SKY_STONE, itemSettings());
        //Util.registerWithItem("sky_cobblestone", SKY_COBBLE, itemSettings());
        Util.registerWithItem("sky_grass", SKY_GRASS, itemSettings());
        Util.registerWithItem("sky_path", SKY_PATH, itemSettings());

        Util.registerWithItem("lanayru_gravel", LANAYRU_GRAVEL, itemSettings());
        Util.registerWithItem("lanayru_symbol_brick", LANAYRU_SYMBOL, itemSettings());
        Util.registerWithItem("lanayru_bricks", LANAYRU_BRICKS, itemSettings());
        Util.registerWithItem("lanayru_mossy_bricks", LANAYRU_MOSSY, itemSettings());
        Util.registerWithItem("lanayru_cracked_bricks", LANAYRU_CRACKED, itemSettings());
        Util.registerWithItem("lanayru_hardened_bricks", LANAYRU_HARDENED, itemSettings());
        Util.registerWithItem("lanayru_drain", LANAYRU_DRAIN, itemSettings());
        Util.registerWithItem("lanayru_smooth_stone", LANAYRU_SMOOTH, itemSettings());
        //skyloft specific blocks i guess
        Util.registerWithItem("lanayru_floor", LANAYRU_FLOOR, itemSettings());
        Util.registerWithItem("banister", BANISTER, itemSettings());
        //
        Util.registerWithItem("lanayru_pot", LANAYRU_POT, itemSettings());

        Util.registerWithItem("crate", CRATE, itemSettings());
        
        Util.registerWithItem("brazier", BRAZIER, itemSettings());
        Util.registerWithItem("soul_brazier", SOUL_BRAZIER, itemSettings());

        Util.registerWithItem("old_cobweb", OLD_COBWEB, itemSettings());

        Util.registerWithItem("eldin_steel_block", ELDIN_STEEL_BLOCK, itemSettings());
    }
    
    private static final Item.Settings itemSettings() {
        return new Item.Settings().group(LoA_Group.LoA_Group);
    }
}