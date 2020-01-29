package me.dinnerbeef.compressium.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;

public class Cobblestone extends Block {

    public Cobblestone() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE).hardnessAndResistance(2.0f));
        setRegistryName("cobble");
        RenderType.cutout();
    }
}




