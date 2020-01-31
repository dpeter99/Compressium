package me.dinnerbeef.compressium;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("compressium")
public class Compressium
{
	public static final ItemGroup creativeTab = new ItemGroup("compressium")
	{
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon()
		{
			return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("compressium:cobblestone_1")));
		}
	};

	public Compressium()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Block.class, this::registerBlocks);
		FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, this::registerItems);

		//noinspection Convert2MethodRef
		DistExecutor.runForDist(() -> () -> new CompressiumClient(), () -> () -> new CompressiumCommon()).init();
	}

	private void registerBlocks(RegistryEvent.Register<Block> event)
	{
		for (CompressiumType type : CompressiumType.VALUES)
		{
			for (int i = 0; i < 9; i++)
			{
				Block block = type.factory.get();
				event.getRegistry().register(block.setRegistryName(type.name + "_" + (i + 1)));
				type.blocks.add(block);
			}
		}
	}

	private void registerItems(RegistryEvent.Register<Item> event)
	{
		for (CompressiumType type : CompressiumType.VALUES)
		{
			for (Block block : type.blocks)
			{
				event.getRegistry().register(new BlockItem(block, new Item.Properties().group(creativeTab)).setRegistryName(block.getRegistryName()));
			}
		}
	}
}