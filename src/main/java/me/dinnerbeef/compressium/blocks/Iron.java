package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class Iron extends Block
{
	public Iron()
	{
		super(Properties.create(Material.IRON, MaterialColor.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f,6.0f).harvestTool(ToolType.PICKAXE).func_235861_h_());
	}

}