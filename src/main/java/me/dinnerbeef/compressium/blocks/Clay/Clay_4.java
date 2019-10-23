package me.dinnerbeef.compressium.blocks.Clay;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;


public class Clay_4 extends Block {
    public Clay_4() {
        super(Properties.create(Material.CLAY)
                .sound(SoundType.GROUND).hardnessAndResistance(2.0f));
        setRegistryName("clay_4");
    }
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}
