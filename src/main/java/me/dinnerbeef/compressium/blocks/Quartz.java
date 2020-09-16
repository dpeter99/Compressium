package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Quartz extends Block
{
	public Quartz()
	{
		super(Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(0.8F).harvestTool(ToolType.PICKAXE));
	}

}