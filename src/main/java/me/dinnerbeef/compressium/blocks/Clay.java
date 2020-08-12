package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.MagmaBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraftforge.common.ToolType;

public class Clay extends Block
{ public Clay()
	{
		super(Properties.create(Material.CLAY).sound(SoundType.GROUND).hardnessAndResistance(0.6f).harvestTool(ToolType.SHOVEL));
	}}

