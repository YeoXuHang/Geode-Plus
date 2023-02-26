package net.yeoxuhang.geodeplus.fabric;

import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.fabricmc.api.ModInitializer;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;

public class GeodePlusFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GeodePlus.init();
        registerBrewingRecipes();
        new GeodePlusGeodeBiomeModifier().biomeModificationHelper();
    }
    public static void registerBrewingRecipes(){
        PotionBrewing.addMix(Potions.WATER, GeodePlusItemsRegistry.CELESTITE_SHARD.get(), Potions.STRONG_HEALING);
    }
}