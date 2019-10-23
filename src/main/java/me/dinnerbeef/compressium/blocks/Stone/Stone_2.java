package me.dinnerbeef.compressium.blocks.Stone;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class Stone_2 extends Block {

    public Stone_2() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE).hardnessAndResistance(2.0f));
        setRegistryName("stone_2");
    }
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}
