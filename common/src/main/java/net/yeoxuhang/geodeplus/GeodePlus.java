package net.yeoxuhang.geodeplus;

import com.kyanite.paragon.api.ConfigManager;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.yeoxuhang.geodeplus.common.config.GeodePlusCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.*;
import net.yeoxuhang.geodeplus.platform.RegistryHelper;

public class GeodePlus {
    public static final CreativeModeTab TAB = RegistryHelper.registerCreativeModeTab(() -> new ItemStack(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get()));
    public static final String MOD_ID = "geode";
    public static void init() {
        GeodePlusItemsRegistry.initialize();
        GeodePlusBlocksRegistry.initialize();
        GeodePlusBlockEntityRegistry.initialize();
        GeodePlusFeatureRegistry.initialize();
        GeodePlusPlacedFeatureRegistry.initialize();
        ConfigManager.register(GeodePlus.MOD_ID ,new GeodePlusCommonConfigs());
    }
}