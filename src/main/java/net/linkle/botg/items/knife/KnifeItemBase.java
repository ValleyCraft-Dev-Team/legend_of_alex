package net.linkle.botg.items.knife;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class KnifeItemBase extends ShearsItem {
    public KnifeItemBase(Settings settings) {
        super(settings);
    }
    
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add( Text.translatable("item.ia.amethyst_knife.tooltip_1").formatted(Formatting.LIGHT_PURPLE) );
        tooltip.add( Text.translatable("item.ia.amethyst_knife.tooltip_2").formatted(Formatting.LIGHT_PURPLE) );
    }
}
