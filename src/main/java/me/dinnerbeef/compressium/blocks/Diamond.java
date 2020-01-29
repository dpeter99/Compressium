package me.dinnerbeef.compressium.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class Diamond extends Block {

    public Diamond(Integer number) {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0f)
        );
        setRegistryName("diamond_" + number);
        RenderType.cutout();
    }
}

