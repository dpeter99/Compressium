package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Snow extends Block
{
	public Snow()
	{
		super(Properties.create(Material.SNOW_BLOCK).sound(SoundType.SNOW).hardnessAndResistance(0.2f).harvestTool(ToolType.SHOVEL).harvestTool(ToolType.SHOVEL));
	}
}