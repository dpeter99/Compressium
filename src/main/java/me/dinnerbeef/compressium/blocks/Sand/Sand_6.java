package me.dinnerbeef.compressium.blocks.Sand;


import net.minecraft.block.AnvilBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.util.BlockRenderLayer;

public class Sand_6 extends FallingBlock {

    public Sand_6() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.SAND)
                .hardnessAndResistance(2.0f)
        );
        setRegistryName("sand_6");
    }
    protected void onStartFalling(FallingBlockEntity fallingEntity) {
        fallingEntity.setHurtEntities(true);
    }
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}

