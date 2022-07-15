package net.linkle.botg.items.hammer;

import java.util.List;

import net.linkle.botg.init.LoA_Group;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class HammerItemBase extends PickaxeItem {
    public HammerItemBase(ToolMaterial material) {
        super(material, 1, 0.0f, new Settings().group(LoA_Group.IA_GROUP));
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.ia.geode_hammer.tooltip_1").formatted(Formatting.LIGHT_PURPLE));
        tooltip.add(Text.translatable("item.ia.geode_hammer.tooltip_2").formatted(Formatting.LIGHT_PURPLE));
    }
}
