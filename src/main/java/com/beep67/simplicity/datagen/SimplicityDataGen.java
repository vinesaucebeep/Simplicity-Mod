package com.beep67.simplicity.datagen;

import com.beep67.simplicity.Simplicity;
import com.beep67.simplicity.datagen.provider.ModBlockStateProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;


@Mod.EventBusSubscriber(modid = Simplicity.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SimplicityDataGen {

    @SubscribeEvent
    public static void onGatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, helper));


    }
}