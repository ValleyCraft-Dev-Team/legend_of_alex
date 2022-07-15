package net.linkle.botg.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.linkle.botg.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class LoA_Group {
    public static final ItemGroup LoA_Group = FabricItemGroupBuilder.create(
            Main.makeId("legend_of_alex")).icon(() -> new ItemStack(LoA_Blocks.TAN_POT)).build();

    public static void initialize() {
    }
}
