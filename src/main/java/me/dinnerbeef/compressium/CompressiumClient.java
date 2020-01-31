package me.dinnerbeef.compressium;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * @author LatvianModder
 */
public class CompressiumClient extends CompressiumCommon
{
	public void init()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
	}

	private void clientSetup(FMLClientSetupEvent event)
	{
		for (CompressiumType type : CompressiumType.VALUES)
		{
			for (Block block : type.blocks)
			{
				RenderTypeLookup.setRenderLayer(block, RenderType.cutout());
			}
		}
	}
}