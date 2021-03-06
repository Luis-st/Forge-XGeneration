package net.luis.nero.event.client;

import net.luis.nero.Nero;
import net.luis.nero.init.block.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.DrawSelectionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Nero.MOD_ID, value = Dist.CLIENT)
public class OnHighlightBlockEvent {
	
	@SubscribeEvent
	@SuppressWarnings("resource")
	public static void highlightBlock(DrawSelectionEvent.HighlightBlock event) {
		LocalPlayer localPlayer = Minecraft.getInstance().player;
		BlockPos headPos = localPlayer.eyeBlockPosition();
		if (Minecraft.getInstance().level.getBlockState(headPos).getBlock() == ModBlocks.DRIFT_SAND.get()) {
			event.setCanceled(true);
		} else if (Minecraft.getInstance().level.getBlockState(headPos).getBlock() == Blocks.POWDER_SNOW) {
			event.setCanceled(true);
		}
	}
}
