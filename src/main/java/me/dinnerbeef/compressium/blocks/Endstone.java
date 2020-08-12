package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Endstone extends Block
{
	public Endstone()
	{
		super(Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(3.0f,9.0f).harvestTool(ToolType.PICKAXE).func_235861_h_());
	}
}