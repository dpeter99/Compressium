package me.dinnerbeef.compressium.blocks.Gravel;


import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.FallingBlockEntity;

public class Gravel_4 extends FallingBlock {

    public Gravel_4() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.GROUND)
                .hardnessAndResistance(2.0f)
        );
        setRegistryName("gravel_4");

    }

    protected void onStartFalling(FallingBlockEntity fallingEntity) {
        fallingEntity.setHurtEntities(true);
    }

}