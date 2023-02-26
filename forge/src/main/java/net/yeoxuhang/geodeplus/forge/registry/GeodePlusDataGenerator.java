package net.yeoxuhang.geodeplus.forge.registry;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.forge.datagen.*;

@Mod.EventBusSubscriber(modid = GeodePlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GeodePlusDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        GeodePlusBlockTagProvider blockTags = new GeodePlusBlockTagProvider(generator, existingFileHelper);
        generator.addProvider(true, new GeodePlusRecipeProvider(generator));
        generator.addProvider(true, new GeodePlusLootTableProvider(generator));
        generator.addProvider(true, new GeodePlusLangProvider(generator, "en_us", false));
        generator.addProvider(true, new GeodePlusItemModelProvider(generator, existingFileHelper));
        generator.addProvider(true ,new GeodePlusBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(true ,new GeodePlusBlockTagProvider(generator, existingFileHelper));
        generator.addProvider(true ,new GeodePlusBiomeTagProvider(generator, existingFileHelper));
        generator.addProvider(true ,new GeodePlusItemTagProvider(generator, blockTags,existingFileHelper));
    }
}