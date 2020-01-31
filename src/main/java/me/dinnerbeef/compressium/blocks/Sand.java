package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.FallingBlockEntity;

public class Sand extends FallingBlock
{
	public Sand()
	{
		super(Properties.create(Material.SAND).sound(SoundType.SAND).hardnessAndResistance(2.0f));
	}

	protected void onStartFalling(FallingBlockEntity fallingEntity)
	{
		fallingEntity.setHurtEntities(true);
	}
}
