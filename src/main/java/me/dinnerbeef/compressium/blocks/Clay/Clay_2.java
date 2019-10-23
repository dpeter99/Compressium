package me.dinnerbeef.compressium.blocks.Clay;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;


public class Clay_2 extends Block {
    public Clay_2() {
        super(Properties.create(Material.CLAY)
                .sound(SoundType.GROUND).hardnessAndResistance(2.0f));
        setRegistryName("clay_2");
    }
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}
