package me.dinnerbeef.compressium.blocks.Stone;


import net.minecraft.block.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class Stone_1 extends Block {

    public Stone_1() {


        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE).hardnessAndResistance(2.0f));
        setRegistryName("stone_1");

    }
}




