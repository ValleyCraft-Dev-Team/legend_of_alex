package net.linkle.botg.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PotBlock extends BlockWithWater {
    
    private static final VoxelShape SHAPE = createCuboidShape(2, 0, 2, 14, 14, 14);
    
    public PotBlock() {
        this(Settings.of(Material.GLASS)
                .breakInstantly()
                .sounds(BlockSoundGroup.GLASS)
                .strength(0.5f, 2.5f));
        setDefaultState();
    }

    public PotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
