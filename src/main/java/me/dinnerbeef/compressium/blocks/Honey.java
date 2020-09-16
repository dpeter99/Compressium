package me.dinnerbeef.compressium.blocks;


import net.minecraft.block.HoneyBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Honey extends HoneyBlock
{
	public Honey()
	{
		super(Properties.create(Material.CLAY, MaterialColor.ADOBE).speedFactor(0.4F).jumpFactor(0.5F).notSolid().sound(SoundType.field_226947_m_));
	}

}

