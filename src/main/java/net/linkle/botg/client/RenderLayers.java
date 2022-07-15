package net.linkle.botg.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.linkle.botg.init.LoA_Blocks;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class RenderLayers {

    @SuppressWarnings("unused")
    public static void initialize() {
        // Only use cullout if the block's texture contains empty pixels.
        var cullout = RenderLayer.getCutout();
        put(LoA_Blocks.TAN_POT, cullout);
        put(LoA_Blocks.BLUE_POT, cullout);
        put(LoA_Blocks.OLD_COBWEB, cullout);
        put(LoA_Blocks.BRAZIER, cullout);
        put(LoA_Blocks.SOUL_BRAZIER, cullout);
        //put(IABlocks.AMETHYST_GLASS_PANE,cullout);
        // Only use translucent if the block's texture contains translucent pixels.
        var translucent = RenderLayer.getTranslucent();
        put(LoA_Blocks.WINDOW,translucent);
        //put(IABlocks.AMETHYST_GLASS_PANE, translucent);
        // Example:
        // put(Blocks.GLASS, cullout);
    }

    private static void put(Block block, RenderLayer layer) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, layer);
    }
}
