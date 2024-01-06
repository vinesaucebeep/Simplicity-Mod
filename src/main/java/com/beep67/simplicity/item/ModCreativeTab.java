package com.beep67.simplicity.item;

import com.beep67.simplicity.Simplicity;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


@Mod.EventBusSubscriber(modid = Simplicity.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModCreativeTab {


     public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Simplicity.MODID);


     public static final RegistryObject<CreativeModeTab> TAB = TABS.register("simplicity", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + Simplicity.MODID + ".simplicity"))
            .icon(ItemInit.PINK_SALT_ROCK_ITEM.get()::getDefaultInstance)
            .build());




        }


