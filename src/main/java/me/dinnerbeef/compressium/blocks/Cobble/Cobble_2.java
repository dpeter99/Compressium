package me.dinnerbeef.compressium.blocks.Cobble;

import net.minecraft.block.Block;
import net.minecraft.block.CommandBlockBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.spectator.categories.TeleportToPlayer;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureAtlasSpriteStitcher;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.world.storage.loot.conditions.WeatherCheck;
import net.minecraftforge.client.model.b3d.B3DModel;


public class Cobble_2 extends Block {
    public Cobble_2() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE).hardnessAndResistance(2.0f));
        setRegistryName("cobble_2");
    }
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}
