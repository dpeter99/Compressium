package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.item.FallingBlockEntity;

public class Gravel extends FallingBlock
{
	public Gravel()
	{
		super(Properties.create(Material.SAND, MaterialColor.STONE).sound(SoundType.GROUND).hardnessAndResistance(0.6f));
	}

	protected void onStartFalling(FallingBlockEntity fallingEntity)
	{
		fallingEntity.setHurtEntities(true);
	}
}
