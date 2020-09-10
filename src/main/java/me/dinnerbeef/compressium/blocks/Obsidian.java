package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

import java.awt.*;

public class Obsidian extends Block
{
	public Obsidian()
	{
		super(Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(50.0f, 1200.0F).harvestTool(ToolType.PICKAXE).func_235861_h_());
	}



}