package com.beep67.simplicity;

import com.beep67.simplicity.block.BlockInit;
import com.beep67.simplicity.item.ItemInit;
import com.beep67.simplicity.item.ModCreativeTab;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Simplicity.MODID)
public class Simplicity {

    public static final String MODID = "simplicity";
    private static final Logger LOGGER = LogUtils.getLogger();


    public Simplicity() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        ModCreativeTab.TABS.register(bus);


    }


    private void commonSetup(final FMLCommonSetupEvent event) {
    }
}



