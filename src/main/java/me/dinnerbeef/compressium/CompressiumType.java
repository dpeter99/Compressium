package me.dinnerbeef.compressium;

import me.dinnerbeef.compressium.blocks.Clay;
import me.dinnerbeef.compressium.blocks.Cobblestone;
import me.dinnerbeef.compressium.blocks.Diamond;
import me.dinnerbeef.compressium.blocks.Emerald;
import me.dinnerbeef.compressium.blocks.Gold;
import me.dinnerbeef.compressium.blocks.Gravel;
import me.dinnerbeef.compressium.blocks.Iron;
import me.dinnerbeef.compressium.blocks.Netherrack;
import me.dinnerbeef.compressium.blocks.Sand;
import me.dinnerbeef.compressium.blocks.Snow;
import me.dinnerbeef.compressium.blocks.Soulsand;
import me.dinnerbeef.compressium.blocks.Stone;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author LatvianModder
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
	CLAY("clay", Clay::new);

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