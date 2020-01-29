package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;


public class Snow extends Block {
    public Snow() {
        super(Properties.create(Material.SNOW_BLOCK)
                .sound(SoundType.SNOW).hardnessAndResistance(2.0f));
        setRegistryName("snow");
        RenderType.cutout();
    }
}
