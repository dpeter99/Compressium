package me.dinnerbeef.compressium.blocks.Cobble;


import net.minecraft.block.Block;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class Cobble_9 extends Block {

    public Cobble_9() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.0f)
        );
        setRegistryName("cobble_9");
    }
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}
