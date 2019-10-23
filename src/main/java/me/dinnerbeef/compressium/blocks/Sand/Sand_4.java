package me.dinnerbeef.compressium.blocks.Sand;


import net.minecraft.block.AnvilBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.util.BlockRenderLayer;

public class Sand_4 extends FallingBlock {

    public Sand_4() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.SAND)
                .hardnessAndResistance(2.0f)
        );
        setRegistryName("sand_4");
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
