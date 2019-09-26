package me.dinnerbeef.compressium.blocks.Gravel;

import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.FallingBlockEntity;

public class Gravel_2 extends FallingBlock {
    public Gravel_2() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.GROUND).hardnessAndResistance(2.0f));
        setRegistryName("gravel_2");
    }
    protected void onStartFalling(FallingBlockEntity fallingEntity) {
        fallingEntity.setHurtEntities(true);
    }
}
