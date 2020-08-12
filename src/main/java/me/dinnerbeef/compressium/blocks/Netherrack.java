package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherrackBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class Netherrack extends NetherrackBlock
{
	public Netherrack()
	{
		super(Properties.create(Material.ROCK, MaterialColor.NETHERRACK).sound(SoundType.field_235589_K_).hardnessAndResistance(0.4f).harvestTool(ToolType.PICKAXE).func_235861_h_());
	}

	@Override
	public boolean isFireSource(BlockState state, IWorldReader world, BlockPos pos, Direction side) {
		return true;
	}
}