package com.beep67.simplicity.item;

import com.beep67.simplicity.Simplicity;
import com.beep67.simplicity.block.BlockInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Simplicity.MODID);

    public static final RegistryObject<Item> PINK_SALT_ROCK_ITEM = ITEMS.register("pink_salt_rock", () -> new BlockItem(BlockInit.PINK_SALT_ROCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SALT_DUST_BLOCK = ITEMS.register("pink_salt_dust_block", () -> new BlockItem(BlockInit.PINK_SALT_DUST_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PINK_SALT_ROCK_ITEM = ITEMS.register("polished_pink_salt_rock", () -> new BlockItem(BlockInit.POLISHED_PINK_SALT_ROCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PINK_SALT_ROCK_BRICKS_ITEM = ITEMS.register("polished_pink_salt_rock_bricks", () -> new BlockItem(BlockInit.POLISHED_PINK_SALT_ROCK_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_POLISHED_PINK_SALT_ROCK = ITEMS.register("chiseled_polished_pink_salt_rock", () -> new BlockItem(BlockInit.CHISELED_POLISHED_PINK_SALT_ROCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PINK_SALT_ROCK_TILES = ITEMS.register("polished_pink_salt_rock_tiles", () -> new BlockItem(BlockInit.POLISHED_PINK_SALT_ROCK_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_POLISHED_PINK_SALT_ROCK_BRICKS_ITEM = ITEMS.register("cracked_polished_pink_salt_rock_bricks", () -> new BlockItem(BlockInit.CRACKED_POLISHED_PINK_SALT_ROCK_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_POLISHED_PINK_SALT_ROCK_TILES = ITEMS.register("weathered_polished_pink_salt_rock_tiles", () -> new BlockItem(BlockInit.WEATHERED_POLISHED_PINK_SALT_ROCK_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_POLISHED_PINK_SALT_ROCK_TILES = ITEMS.register("cracked_polished_pink_salt_rock_tiles", () -> new BlockItem(BlockInit.CRACKED_POLISHED_PINK_SALT_ROCK_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PINK_SALT_ROCK_PILAR_ITEM = ITEMS.register("polished_pink_salt_rock_pillar", () -> new BlockItem(BlockInit.POLISHED_PINK_SALT_ROCK_PILLAR.get(), new Item.Properties()));

}
