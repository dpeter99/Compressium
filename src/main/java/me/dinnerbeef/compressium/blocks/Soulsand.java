package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Soulsand extends SoulSandBlock
{
	public Soulsand()
	{
		super(Properties.create(Material.EARTH, MaterialColor.BROWN).hardnessAndResistance(0.5F).sound(SoundType.field_235586_H_).speedFactor(0.4f).harvestTool(ToolType.SHOVEL));

	}
}