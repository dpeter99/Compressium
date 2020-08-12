package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraftforge.common.ToolType;

public class RedSand extends FallingBlock
{
	public RedSand()
	{
		super(Properties.create(Material.SAND, MaterialColor.ADOBE).sound(SoundType.SAND).hardnessAndResistance(0.5f).harvestTool(ToolType.SHOVEL));
	}

	protected void onStartFalling(FallingBlockEntity fallingEntity)
	{
		fallingEntity.setHurtEntities(true);
	}
}
