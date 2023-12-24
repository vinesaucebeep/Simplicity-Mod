package com.beep67.simplicity.block;

import com.beep67.simplicity.Simplicity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Simplicity.MODID);

    public static final RegistryObject<Block> PINK_SALT_ROCK = BLOCKS.register("pink_salt_rock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));
    public static final RegistryObject<Block> PINK_SALT_DUST_BLOCK = BLOCKS.register("pink_salt_dust_block", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> POLISHED_PINK_SALT_ROCK = BLOCKS.register("polished_pink_salt_rock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)));
    public static final RegistryObject<Block> POLISHED_PINK_SALT_ROCK_BRICKS = BLOCKS.register("polished_pink_salt_rock_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)));
    public static final RegistryObject<Block> CHISELED_POLISHED_PINK_SALT_ROCK = BLOCKS.register("chiseled_polished_pink_salt_rock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)));
    public static final RegistryObject<Block> POLISHED_PINK_SALT_ROCK_TILES = BLOCKS.register("polished_pink_salt_rock_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)));
    public static final RegistryObject<Block> WEATHERED_POLISHED_PINK_SALT_ROCK_TILES = BLOCKS.register("weathered_polished_pink_salt_rock_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)));
    public static final RegistryObject<Block> CRACKED_POLISHED_PINK_SALT_ROCK_BRICKS = BLOCKS.register("cracked_polished_pink_salt_rock_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)));
    public static final RegistryObject<Block> CRACKED_POLISHED_PINK_SALT_ROCK_TILES = BLOCKS.register("cracked_polished_pink_salt_rock_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)));

}
