package me.dinnerbeef.compressium.blocks.Clay;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;


public class Clay_6 extends Block {
    public Clay_6() {
        super(Properties.create(Material.CLAY)
                .sound(SoundType.GROUND).hardnessAndResistance(2.0f));
        setRegistryName("clay_6");
    }
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}
