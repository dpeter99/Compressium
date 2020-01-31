package me.dinnerbeef.compressium.setup;

import com.sun.org.apache.xpath.internal.operations.Mod;
import me.dinnerbeef.compressium.blocks.Clay;
import me.dinnerbeef.compressium.blocks.ModBlocks;
import net.minecraft.block.CactusBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;

    }

    @Override
    public PlayerEntity getClientPlayer() {
        return null;
    }
}

