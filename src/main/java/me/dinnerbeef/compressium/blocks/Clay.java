package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MagmaBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class Clay extends Block
{

	public Clay()
	{
		super(Properties.create(Material.CLAY).sound(SoundType.GROUND).hardnessAndResistance(0.6f).harvestTool(ToolType.SHOVEL));




	}
	@Override
	public void onBlockClicked(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
		super.onBlockClicked(state, worldIn, pos, player);

		player.jump();
	}
}

