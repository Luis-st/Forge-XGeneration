package net.luis.nero.event;

import net.luis.nero.init.block.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.DrawHighlightEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(value = Dist.CLIENT)
public class OnHighlightBlockEvent {
	
	@SubscribeEvent
	@SuppressWarnings("resource")
	public static void highlightBloc(DrawHighlightEvent.HighlightBlock event) {
		if (Minecraft.getInstance().level.getBlockState(event.getTarget().getBlockPos()).getBlock() == ModBlocks.BRIDGE_BLOCK.get()) {
			event.setCanceled(true);
		}
	}
}
