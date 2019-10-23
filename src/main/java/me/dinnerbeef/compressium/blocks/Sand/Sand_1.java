package me.dinnerbeef.compressium.blocks.Sand;

import me.dinnerbeef.compressium.Compressium;
import me.dinnerbeef.compressium.blocks.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.world.BlockEvent;

public class Sand_1 extends FallingBlock {
    public Sand_1() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.SAND)
                .hardnessAndResistance(2.0f)
        );
        setRegistryName("sand_1");
    }
    protected void onStartFalling(FallingBlockEntity fallingEntity) {
        fallingEntity.setHurtEntities(true);
    }
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}