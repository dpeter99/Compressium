package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Lapis extends Block
{

	public Lapis()
	{
		super(Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(3.0F,3.0F).harvestTool(ToolType.PICKAXE));
	}
}

