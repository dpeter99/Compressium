package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Dirt extends Block
{
	public Dirt()
	{
		super(Properties.create(Material.CLAY).sound(SoundType.GROUND).hardnessAndResistance(2.0f));
	}
}