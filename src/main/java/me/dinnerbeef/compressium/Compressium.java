package me.dinnerbeef.compressium;

import me.dinnerbeef.compressium.blocks.Cobble.Cobble_1;
import me.dinnerbeef.compressium.blocks.Cobble.Cobble_2;
import me.dinnerbeef.compressium.blocks.ModBlocks;
import me.dinnerbeef.compressium.setup.ClientProxy;
import me.dinnerbeef.compressium.setup.IProxy;
import me.dinnerbeef.compressium.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new Cobble_1());
            event.getRegistry().register(new Cobble_2());
        }


    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_1, new Item.Properties()).setRegistryName("cobble_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLE_2, new Item.Properties()).setRegistryName("cobble_2"));
    }
    }
}