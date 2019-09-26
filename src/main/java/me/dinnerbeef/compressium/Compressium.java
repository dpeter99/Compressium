package me.dinnerbeef.compressium;

import me.dinnerbeef.compressium.blocks.Cobble.*;
import me.dinnerbeef.compressium.blocks.Gravel.*;
import me.dinnerbeef.compressium.blocks.ModBlocks;
import me.dinnerbeef.compressium.blocks.Sand.*;
import me.dinnerbeef.compressium.setup.ClientProxy;
import me.dinnerbeef.compressium.setup.IProxy;
import me.dinnerbeef.compressium.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("compressium")
public class Compressium {

    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    private static final Logger LOGGER = LogManager.getLogger();

    public Compressium() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    public static final ItemGroup creativeTab = new ItemGroup(MOD_ID + ".compressium") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.COBBLE_1);
        }
    };

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new Cobble_1());
            event.getRegistry().register(new Cobble_2());
            event.getRegistry().register(new Cobble_3());
            event.getRegistry().register(new Cobble_4());
            event.getRegistry().register(new Cobble_5());
            event.getRegistry().register(new Cobble_6());
            event.getRegistry().register(new Cobble_7());
            event.getRegistry().register(new Cobble_8());
            event.getRegistry().register(new Cobble_9());

            event.getRegistry().register(new Sand_1());
            event.getRegistry().register(new Sand_2());
            event.getRegistry().register(new Sand_3());
            event.getRegistry().register(new Sand_4());
            event.getRegistry().register(new Sand_5());
            event.getRegistry().register(new Sand_6());
            event.getRegistry().register(new Sand_7());
            event.getRegistry().register(new Sand_8());
            event.getRegistry().register(new Sand_9());

            event.getRegistry().register(new Gravel_1());
            event.getRegistry().register(new Gravel_2());
            event.getRegistry().register(new Gravel_3());
            event.getRegistry().register(new Gravel_4());
            event.getRegistry().register(new Gravel_5());
            event.getRegistry().register(new Gravel_6());
            event.getRegistry().register(new Gravel_7());
            event.getRegistry().register(new Gravel_8());
            event.getRegistry().register(new Gravel_9());

        }


    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("cobble_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("cobble_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("cobble_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("cobble_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("cobble_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("cobble_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("cobble_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("cobble_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("cobble_9"));


        event.getRegistry().register(new BlockItem(ModBlocks.SAND_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("sand_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.SAND_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("sand_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.SAND_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("sand_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.SAND_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("sand_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.SAND_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("sand_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.SAND_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("sand_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.SAND_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("sand_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.SAND_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("sand_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.SAND_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("sand_9"));

        event.getRegistry().register(new BlockItem(ModBlocks.GRAVEL_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gravel_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.GRAVEL_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gravel_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.GRAVEL_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gravel_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.GRAVEL_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gravel_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.GRAVEL_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gravel_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.GRAVEL_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gravel_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.GRAVEL_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gravel_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.GRAVEL_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gravel_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.GRAVEL_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gravel_9"));

    }
    }
}