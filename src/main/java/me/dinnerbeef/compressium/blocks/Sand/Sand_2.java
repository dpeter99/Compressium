package me.dinnerbeef.compressium.blocks.Sand;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Sand_2 extends Block {
    public Sand_2() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.SAND).hardnessAndResistance(2.0f));
        setRegistryName("sand_2");
    }
}
