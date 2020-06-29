package me.dinnerbeef.compressium;

import me.dinnerbeef.compressium.blocks.*;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author LatvianModder / DinnerBeef (Just Coped And Pasted Some Of This)
 */
public enum CompressiumType
{
	COBBLESTONE("cobblestone", Cobblestone::new),
	STONE("stone", Stone::new),
	SAND("sand", Sand::new),
	GRAVEL("gravel", Gravel::new),
	NETHERRACK("netherrack", Netherrack::new),
	SNOW("snow", Snow::new),
	SOULSAND("soulsand", Soulsand::new),
	IRON("iron", Iron::new),
	GOLD("gold", Gold::new),
	DIAMOND("diamond", Diamond::new),
	EMERALD("emerald", Emerald::new),
	CLAY("clay", Clay::new),
	NETHERITE("netherite", Netherite::new),
	DIRT("dirt", Dirt::new);

	public static final CompressiumType[] VALUES = values();

	public final String name;
	public final Supplier<Block> factory;
	public final List<Block> blocks;

	CompressiumType(String n, Supplier<Block> f)
	{
		name = n;
		factory = f;
		blocks = new ArrayList<>();
	}
}