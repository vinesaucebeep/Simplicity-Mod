package com.beep67.simplicity.datagen.provider;

import com.beep67.simplicity.Simplicity;
import com.beep67.simplicity.block.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.beep67.simplicity.Simplicity.MODID;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        cubeAllModBlock(BlockInit.PINK_SALT_ROCK.get());
        cubeAllModBlock(BlockInit.PINK_SALT_DUST_BLOCK.get());
        cubeAllModBlock(BlockInit.POLISHED_PINK_SALT_ROCK.get());
        cubeAllModBlock(BlockInit.POLISHED_PINK_SALT_ROCK_BRICKS.get());
        cubeAllModBlock(BlockInit.CHISELED_POLISHED_PINK_SALT_ROCK.get());
        cubeAllModBlock(BlockInit.POLISHED_PINK_SALT_ROCK_TILES.get());
        cubeAllModBlock(BlockInit.WEATHERED_POLISHED_PINK_SALT_ROCK_TILES.get());
        cubeAllModBlock(BlockInit.CRACKED_POLISHED_PINK_SALT_ROCK_BRICKS.get());
        cubeAllModBlock(BlockInit.CRACKED_POLISHED_PINK_SALT_ROCK_TILES.get());
        axisBlock(((RotatedPillarBlock) BlockInit.POLISHED_PINK_SALT_ROCK_PILLAR.get()), blockTexture(BlockInit.POLISHED_PINK_SALT_ROCK_PILLAR.get()), new ResourceLocation(MODID, "block/polished_pink_salt_rock_pillar_top"));

        blockItem(BlockInit.POLISHED_PINK_SALT_ROCK_PILLAR);


    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void cubeAllModBlock(Block block) {
        ResourceLocation loc = ForgeRegistries.BLOCKS.getKey(block);
        String path = loc.getPath();
        simpleBlock(block, models().cubeAll(path, new ResourceLocation(loc.getNamespace(), "block/" + path)));
        itemModels().withExistingParent(path, new ResourceLocation(loc.getNamespace(), "block/" + path));
    }



    private String getName(RotatedPillarBlock block) {
        return null;
    }
}

