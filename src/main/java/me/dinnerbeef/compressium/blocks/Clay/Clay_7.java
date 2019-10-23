package me.dinnerbeef.compressium.blocks.Clay;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;


public class Clay_7 extends Block {
    public Clay_7() {
        super(Properties.create(Material.CLAY)
                .sound(SoundType.GROUND).hardnessAndResistance(2.0f));
        setRegistryName("clay_7");
    }
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}
