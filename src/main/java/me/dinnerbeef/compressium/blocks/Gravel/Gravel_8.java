package me.dinnerbeef.compressium.blocks.Gravel;


import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.util.BlockRenderLayer;

public class Gravel_8 extends FallingBlock {

    public Gravel_8() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.GROUND)
                .hardnessAndResistance(2.0f)
        );
        setRegistryName("gravel_8");
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
