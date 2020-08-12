package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.BeaconBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagCollection;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class Diamond extends Block
{
	public Diamond()
	{
		super(Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f,6.0f).harvestTool(ToolType.PICKAXE).func_235861_h_());
	}
}