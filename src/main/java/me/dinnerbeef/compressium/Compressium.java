package me.dinnerbeef.compressium;


import me.dinnerbeef.compressium.blocks.*;
import me.dinnerbeef.compressium.setup.ClientProxy;
import me.dinnerbeef.compressium.setup.IProxy;
import me.dinnerbeef.compressium.setup.ServerProxy;
import net.minecraft.block.Block;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("compressium")
public class Compressium {

    public static final String MOD_ID = "compressium";
    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public static final Logger LOGGER = LogManager.getLogger();

    public Compressium() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientsetup);


    }

    private void clientsetup(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLE_1, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLE_2, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLE_3, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLE_4, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLE_5, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLE_6, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLE_7, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLE_8, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLE_9, RenderType.cutout());
        //TODO: Dinnerbeef Add the rest
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
            for(int x = 1; x < 10; x++) {
                event.getRegistry().register(new Soulsand(x));
                event.getRegistry().register(new Snow(x));
                event.getRegistry().register(new Netherrack(x));
                event.getRegistry().register(new Clay(x));
                event.getRegistry().register(new Cobblestone(x));
                event.getRegistry().register(new Sand(x));
                event.getRegistry().register(new Gravel(x));
                event.getRegistry().register(new Stone(x));
                event.getRegistry().register(new Iron(x));
                event.getRegistry().register(new Gold(x));
                event.getRegistry().register(new Diamond(x));
                event.getRegistry().register(new Emerald(x));
            }
        }


    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {

        event.getRegistry().register(new BlockItem(ModBlocks.SOUL_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("soul_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.SOUL_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("soul_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.SOUL_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("soul_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.SOUL_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("soul_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.SOUL_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("soul_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.SOUL_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("soul_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.SOUL_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("soul_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.SOUL_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("soul_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.SOUL_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("soul_9"));

        event.getRegistry().register(new BlockItem(ModBlocks.SNOW_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("snow_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.SNOW_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("snow_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.SNOW_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("snow_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.SNOW_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("snow_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.SNOW_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("snow_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.SNOW_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("snow_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.SNOW_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("snow_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.SNOW_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("snow_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.SNOW_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("snow_9"));

        event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("netherrack_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("netherrack_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("netherrack_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("netherrack_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("netherrack_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("netherrack_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("netherrack_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("netherrack_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("netherrack_9"));

        event.getRegistry().register(new BlockItem(ModBlocks.CLAY_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("clay_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.CLAY_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("clay_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.CLAY_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("clay_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.CLAY_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("clay_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.CLAY_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("clay_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.CLAY_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("clay_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.CLAY_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("clay_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.CLAY_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("clay_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.CLAY_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("clay_9"));


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

        event.getRegistry().register(new BlockItem(ModBlocks.STONE_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("stone_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.STONE_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("stone_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.STONE_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("stone_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.STONE_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("stone_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.STONE_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("stone_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.STONE_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("stone_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.STONE_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("stone_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.STONE_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("stone_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.STONE_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("stone_9"));

        event.getRegistry().register(new BlockItem(ModBlocks.IRON_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("iron_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.IRON_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("iron_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.IRON_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("iron_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.IRON_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("iron_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.IRON_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("iron_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.IRON_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("iron_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.IRON_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("iron_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.IRON_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("iron_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.IRON_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("iron_9"));

        event.getRegistry().register(new BlockItem(ModBlocks.GOLD_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gold_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.GOLD_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gold_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.GOLD_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gold_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.GOLD_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gold_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.GOLD_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gold_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.GOLD_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gold_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.GOLD_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gold_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.GOLD_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gold_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.GOLD_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("gold_9"));

        event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("diamond_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("diamond_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("diamond_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("diamond_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("diamond_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("diamond_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("diamond_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("diamond_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("diamond_9"));

        event.getRegistry().register(new BlockItem(ModBlocks.EMERALD_1, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("emerald_1"));
        event.getRegistry().register(new BlockItem(ModBlocks.EMERALD_2, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("emerald_2"));
        event.getRegistry().register(new BlockItem(ModBlocks.EMERALD_3, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("emerald_3"));
        event.getRegistry().register(new BlockItem(ModBlocks.EMERALD_4, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("emerald_4"));
        event.getRegistry().register(new BlockItem(ModBlocks.EMERALD_5, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("emerald_5"));
        event.getRegistry().register(new BlockItem(ModBlocks.EMERALD_6, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("emerald_6"));
        event.getRegistry().register(new BlockItem(ModBlocks.EMERALD_7, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("emerald_7"));
        event.getRegistry().register(new BlockItem(ModBlocks.EMERALD_8, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("emerald_8"));
        event.getRegistry().register(new BlockItem(ModBlocks.EMERALD_9, new Item.Properties().group(Compressium.creativeTab)).setRegistryName("emerald_9"));

        }
    }

}
