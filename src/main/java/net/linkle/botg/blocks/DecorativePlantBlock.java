package net.linkle.botg.blocks;

import net.linkle.botg.init.LoA_Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class DecorativePlantBlock extends PlantBlock {
    public DecorativePlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        var block = floor.getBlock();
        return  super.canPlantOnTop(floor, world, pos) ||
                block == Blocks.GRASS_BLOCK ||
                block == Blocks.DIRT ||
                block == LoA_Blocks.SKY_GRASS ||
                block == LoA_Blocks.SKY_PATH ||
                block == LoA_Blocks.LANAYRU_POT;
    }
}
