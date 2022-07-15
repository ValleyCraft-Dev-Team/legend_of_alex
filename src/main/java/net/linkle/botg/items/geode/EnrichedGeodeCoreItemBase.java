package net.linkle.botg.items.geode;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class EnrichedGeodeCoreItemBase extends Item {
    public EnrichedGeodeCoreItemBase(Settings settings) {
        super(settings);
    }
    
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add( Text.translatable("item.ia.enriched_geode.tooltip_1").formatted(Formatting.GOLD) );
        tooltip.add( Text.translatable("item.ia.enriched_geode.tooltip_2").formatted(Formatting.GOLD) );
    }
}
