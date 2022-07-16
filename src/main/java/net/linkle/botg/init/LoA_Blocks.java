package net.linkle.botg.init;

import net.linkle.botg.blocks.*;
import net.linkle.botg.utils.Util;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

public class LoA_Blocks {
    public static final Block TAN_POT = new PotBlock();
    public static final Block BLUE_POT = new PotBlock();

    //public static final Block SKY_STONE = new Block(Block.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block SKY_GRASS = new Block(Block.Settings.copy(Blocks.COARSE_DIRT).sounds(BlockSoundGroup.DEEPSLATE));

    //plants
    public static final Block BUSH = new DecorativePlantBlock(Block.Settings.copy(Blocks.FERN).sounds(BlockSoundGroup.GRASS));
    public static final Block SHIVER_FERN = new DecorativePlantBlock(Block.Settings.copy(Blocks.FERN).sounds(BlockSoundGroup.GRASS));
    public static final Block STARFLOWER = new DecorativePlantBlock(Block.Settings.copy(Blocks.FERN).sounds(BlockSoundGroup.GRASS));
    public static final Block PINK_ORCA = new DecorativePlantBlock(Block.Settings.copy(Blocks.FERN).sounds(BlockSoundGroup.GRASS));
    public static final Block SILENT_PRINCESS = new DecorativePlantBlock(Block.Settings.copy(Blocks.FERN).sounds(BlockSoundGroup.GRASS));
    public static final Block VILEBLOOM = new DecorativePlantBlock(Block.Settings.copy(Blocks.FERN).sounds(BlockSoundGroup.GRASS));
    public static final Block VILESHROOM = new DecorativePlantBlock(Block.Settings.copy(Blocks.FERN).sounds(BlockSoundGroup.GRASS));

    public static final Block LANAYRU_POT = new Block(Block.Settings.copy(Blocks.COARSE_DIRT).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block LANAYRU_GRAVEL = new FallingBlock(Block.Settings.copy(Blocks.GRAVEL).sounds(BlockSoundGroup.GRAVEL));

    public static final Block LANAYRU_SYMBOL = new Block(Block.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_MOSSY = new Block(Block.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_BRICKS = new Block(Block.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_CRACKED = new Block(Block.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_HARDENED = new Block(Block.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_SMOOTH = new Block(Block.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_DRAIN = new MagmaBlock(Block.Settings.copy(Blocks.MAGMA_BLOCK).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_FLOOR = new Block(Block.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block BANISTER = new Block(Block.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block LANAYRU_WALL = new Block(Block.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block WINDOW = new GlassBlock(Block.Settings.copy(Blocks.GLASS).sounds(BlockSoundGroup.GLASS));

    public static final Block SKY_PATH = new Block(Block.Settings.copy(Blocks.COARSE_DIRT).sounds(BlockSoundGroup.DEEPSLATE));
    //public static final Block SKY_COBBLE = new Block(Block.Settings.copy(Blocks.COARSE_DIRT));

    public static final Block CRATE = new BarrelBlock(Block.Settings.copy(Blocks.BARREL));
    
    public static final Block BRAZIER = new BrazierBlock(15, 1);
    public static final Block SOUL_BRAZIER = new BrazierBlock(10, 2);
    
    public static final Block ROPE_BRIDGE = new BridgeBlock(
            Block.Settings.of(Material.CARPET).nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f,1f));

    public static final Block ROPE_BRIDGE_ANCHOR = new BridgeBlock(
            Block.Settings.of(Material.CARPET).nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f,1f).noCollision());
    
    public static final Block NET = new NetBlock();
    
    public static final Block ROPE = new ChainBlock(
            Block.Settings.of(Material.CARPET)
            .nonOpaque().strength(0,0.1f)
            .sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block OLD_COBWEB = new CobwebBlock(Block.Settings.copy(Blocks.COBWEB));

    public static final Block ELDIN_STEEL_BLOCK = new Block(Block.Settings.copy(Blocks.IRON_BLOCK));

    public static void initialize() {
        Util.registerWithItem("tan_clay_pot", TAN_POT, itemSettings());
        Util.registerWithItem("blue_clay_pot", BLUE_POT, itemSettings());

        //Util.registerWithItem("sky_stone", SKY_STONE, itemSettings());
        //Util.registerWithItem("sky_cobblestone", SKY_COBBLE, itemSettings());
        Util.registerWithItem("sky_grass", SKY_GRASS, itemSettings());
        Util.registerWithItem("sky_path", SKY_PATH, itemSettings());

        //plants
        Util.registerWithItem("bush", BUSH, itemSettings());
        Util.registerWithItem("shiver_fern", SHIVER_FERN, itemSettings());
        Util.registerWithItem("starflower", STARFLOWER, itemSettings());
        Util.registerWithItem("pink_orca", PINK_ORCA, itemSettings());
        Util.registerWithItem("silent_princess", SILENT_PRINCESS, itemSettings());
        Util.registerWithItem("vilebloom", VILEBLOOM, itemSettings());
        Util.registerWithItem("vileshroom", VILESHROOM, itemSettings());

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
        Util.registerWithItem("lanayru_wall", LANAYRU_WALL, itemSettings());
        Util.registerWithItem("lanayru_window", WINDOW, itemSettings());

        Util.registerWithItem("banister", BANISTER, itemSettings());
        //
        Util.registerWithItem("lanayru_pot", LANAYRU_POT, itemSettings());

        Util.registerWithItem("crate", CRATE, itemSettings());
        Util.registerWithItem("rope_bridge", ROPE_BRIDGE, itemSettings());
        Util.registerWithItem("rope_bridge_anchor", ROPE_BRIDGE_ANCHOR, itemSettings());
        Util.registerWithItem("net", NET, itemSettings());
        Util.registerWithItem("rope", ROPE, itemSettings());
        
        Util.registerWithItem("brazier", BRAZIER, itemSettings());
        Util.registerWithItem("soul_brazier", SOUL_BRAZIER, itemSettings());

        Util.registerWithItem("old_cobweb", OLD_COBWEB, itemSettings());

        Util.registerWithItem("eldin_steel_block", ELDIN_STEEL_BLOCK, itemSettings());
    }
    
    private static final Item.Settings itemSettings() {
        return new Item.Settings().group(LoA_Group.LoA_Group);
    }
}