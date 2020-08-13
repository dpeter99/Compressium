package me.dinnerbeef.compressium.blocks;


import net.minecraft.block.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import net.minecraftforge.common.ToolType;

public class Diamond extends Block
{
	public Diamond()
	{
		super(Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f,6.0f).harvestTool(ToolType.PICKAXE).func_235861_h_());
	}
}