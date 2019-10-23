package me.dinnerbeef.compressium.blocks.Cobble;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class Cobble_1 extends Block {

    public Cobble_1() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE).hardnessAndResistance(2.0f));
        setRegistryName("cobble_1");
    }
    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (player instanceof PlayerEntity) {
            if (player.getUniqueID().toString().equals("a77837bb-be6e-4423-9e55-da0da80fbc27")) {
                ItemStack pick = new ItemStack(Items.DIAMOND_PICKAXE);
                if (!player.inventory.hasItemStack(pick)) {
                    int randEnchLowLvl = worldIn.rand.nextInt((3 - 1) + 1) + 1;
                    int randRange = worldIn.rand.nextInt((100 - 10) + 1) + 10;
                    pick.addEnchantment(Enchantments.UNBREAKING, 10);
                    pick.addEnchantment(Enchantments.EFFICIENCY, 10);
                    if (randRange > 95) {
                        pick.addEnchantment(Enchantments.FORTUNE, randEnchLowLvl);
                    }
                    player.inventory.addItemStackToInventory(pick);
                }
            }
        }
        return false;
    }
}




