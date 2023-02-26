package net.yeoxuhang.geodeplus.common.registry;

import net.yeoxuhang.geodeplus.common.config.GeodePlusCommonConfigs;
import net.yeoxuhang.geodeplus.platform.RegistryHelper;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;
import java.util.function.Supplier;

public class GeodePlusPlacedFeatureRegistry {
    public static final Supplier<PlacedFeature> BASALT_ANCIENT_DEBRIS_GEODE = RegistryHelper.registerPlacedFeature("basalt_ancient_debris_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.BASALT_ANCIENT_DEBRIS_GEODE, List.of(rarityBasaltAncientDebrisGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));
    public static final Supplier<PlacedFeature> BASALT_GLOWSTONE_GEODE = RegistryHelper.registerPlacedFeature("basalt_glowstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.BASALT_GLOWSTONE_GEODE, List.of(rarityBasaltGlowstoneGeode(), inSquarePlacement(), placementNetherBasaltModifier(), biomeFilter())));
    public static final Supplier<PlacedFeature> BASALT_GOLD_NUGGET_GEODE = RegistryHelper.registerPlacedFeature("basalt_gold_nugget_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.BASALT_GOLD_NUGGET_GEODE, List.of(rarityBasaltGoldNuggetGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));
    public static final Supplier<PlacedFeature> BASALT_QUARTZ_GEODE = RegistryHelper.registerPlacedFeature("basalt_quartz_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.BASALT_QUARTZ_GEODE, List.of(rarityBasaltQuartzGeode(), inSquarePlacement(), placementNetherBasaltModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> PRISMARINE_GEODE = RegistryHelper.registerPlacedFeature("prismarine_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.PRISMARINE_GEODE, List.of(rarityPrismarineGeode(), inSquarePlacement(), placementPrismarineModifier(), biomeFilter())));
    public static final Supplier<PlacedFeature> QUARTZ_GEODE = RegistryHelper.registerPlacedFeature("quartz_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.QUARTZ_GEODE, List.of(rarityNetherQuartzGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));
    public static final Supplier<PlacedFeature> BLACKSTONE_QUARTZ_GEODE = RegistryHelper.registerPlacedFeature("blackstone_quartz_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.BLACKSTONE_QUARTZ_GEODE, List.of(rarityBlackstoneQuartzGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> WRAPPIST_GEODE = RegistryHelper.registerPlacedFeature("wrappist_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.WRAPPIST_GEODE, List.of(rarityEndWrappistGeode(), inSquarePlacement(), placementEndModifier(), biomeFilter())));


    public static final Supplier<PlacedFeature> GLOWSTONE_GEODE = RegistryHelper.registerPlacedFeature("glowstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.GLOWSTONE_GEODE, List.of(rarityNetherGlowstoneGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> ANCIENT_DEBRIS_GEODE = RegistryHelper.registerPlacedFeature("ancient_debris_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.ANCIENT_DEBRIS_GEODE, List.of(rarityNetherAncientDebrisGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));


    public static final Supplier<PlacedFeature> BLACKSTONE_ANCIENT_DEBRIS_GEODE = RegistryHelper.registerPlacedFeature("blackstone_ancient_debris_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE, List.of(rarityBlackstoneAncientDebrisGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));


    public static final Supplier<PlacedFeature> BLACKSTONE_GLOWSTONE_GEODE = RegistryHelper.registerPlacedFeature("blackstone_glowstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.BLACKSTONE_GLOWSTONE_GEODE, List.of(rarityBlackstoneGlowstoneGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> GOLD_NUGGET_GEODE = RegistryHelper.registerPlacedFeature("gold_nugget_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.GOLD_NUGGET_GEODE, List.of(rarityNetherGoldNuggetGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));


    public static final Supplier<PlacedFeature> BLACKSTONE_GOLD_NUGGET_GEODE = RegistryHelper.registerPlacedFeature("blackstone_gold_nugget_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.BLACKSTONE_GOLD_NUGGET_GEODE, List.of(rarityBlackstoneGoldNuggetGeode(), inSquarePlacement(), placementNetherModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> ECHO_GEODE = RegistryHelper.registerPlacedFeature("echo_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.ECHO_GEODE, List.of(rarityEchoGeode(), inSquarePlacement(), placementDeepDarkModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> LAPIS_GEODE = RegistryHelper.registerPlacedFeature("lapis_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.LAPIS_GEODE, List.of(rarityOreGeode(), inSquarePlacement(), placementOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> REDSTONE_GEODE = RegistryHelper.registerPlacedFeature("redstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.REDSTONE_GEODE, List.of(rarityOreGeode(), inSquarePlacement(), placementOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> EMERALD_GEODE = RegistryHelper.registerPlacedFeature("emerald_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.EMERALD_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(), placementRareModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> DIAMOND_GEODE = RegistryHelper.registerPlacedFeature("diamond_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.DIAMOND_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(), placementRareModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> DEEPSLATE_LAPIS_GEODE = RegistryHelper.registerPlacedFeature("deepslate_lapis_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.DEEPSLATE_LAPIS_GEODE, List.of(rarityOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> DEEPSLATE_REDSTONE_GEODE = RegistryHelper.registerPlacedFeature("deepslate_redstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.DEEPSLATE_REDSTONE_GEODE, List.of(rarityOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> DEEPSLATE_EMERALD_GEODE = RegistryHelper.registerPlacedFeature("deepslate_emerald_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.DEEPSLATE_EMERALD_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> DEEPSLATE_DIAMOND_GEODE = RegistryHelper.registerPlacedFeature("deepslate_diamond_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.DEEPSLATE_DIAMOND_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(), placementDeepOreModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> SCULK_LAPIS_GEODE = RegistryHelper.registerPlacedFeature("sculk_lapis_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.SCULK_LAPIS_GEODE, List.of(rarityOreGeode(), inSquarePlacement(), placementDeepDarkModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> SCULK_REDSTONE_GEODE = RegistryHelper.registerPlacedFeature("sculk_redstone_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.SCULK_REDSTONE_GEODE, List.of(rarityOreGeode(), inSquarePlacement(),  placementDeepDarkModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> SCULK_EMERALD_GEODE = RegistryHelper.registerPlacedFeature("sculk_emerald_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.SCULK_EMERALD_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(),  placementDeepDarkModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> SCULK_DIAMOND_GEODE = RegistryHelper.registerPlacedFeature("sculk_diamond_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.SCULK_DIAMOND_GEODE, List.of(rarityRareOreGeode(), inSquarePlacement(),  placementDeepDarkModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> QUARTZ_CRYSTAL_SPIKE = RegistryHelper.registerPlacedFeature("quartz_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> QUARTZ_CRYSTAL_SPIKE_FLOOR = RegistryHelper.registerPlacedFeature("quartz_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE = RegistryHelper.registerPlacedFeature("glowstone_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> GLOWSTONE_CRYSTAL_SPIKE_FLOOR = RegistryHelper.registerPlacedFeature("glowstone_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> ECHO_CRYSTAL_SPIKE = RegistryHelper.registerPlacedFeature("echo_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.ECHO_CRYSTAL_SPIKE, List.of(inSquarePlacement(), placementEchoCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> ECHO_CRYSTAL_SPIKE_FLOOR = RegistryHelper.registerPlacedFeature("echo_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.ECHO_CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementEchoCrystalModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> WRAPPIST_CRYSTAL_SPIKE = RegistryHelper.registerPlacedFeature("wrappist_crystal_spike", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.WRAPPIST_CRYSTAL_SPIKE, List.of(placementEndCrystal(), inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));
    public static final Supplier<PlacedFeature> PRISMARINE_CRYSTAL_SPIKE_FLOOR = RegistryHelper.registerPlacedFeature("prismarine_crystal_spike_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.PRISMARINE_CRYSTAL_SPIKE_FLOOR, List.of(placementCrystal() ,inSquarePlacement(), placementPrismarineModifier(), biomeFilter())));

    public static final Supplier<PlacedFeature> CELESTITE_GEODE = RegistryHelper.registerPlacedFeature("celestite_geode", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) GeodePlusConfiguredFeatureRegistry.CELESTITE_GEODE, List.of(raritySwampGeode(), inSquarePlacement(), placementSwampModifier(), biomeFilter())));

    //private static RarityFilter rarityOceanGeode() {
    //        return RarityFilter.onAverageOnceEvery(TEST.get());
    //    }
    private static RarityFilter rarityPrismarineGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_DEEP_OCEAN_PRISMARINE_GEODE.get());
    }
    //Netherrack
    private static RarityFilter rarityNetherAncientDebrisGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_NETHER_DEBRIS_GEODE.get());}
    private static RarityFilter rarityNetherGlowstoneGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_NETHER_GLOWSTONE_GEODE.get());}
    private static RarityFilter rarityNetherGoldNuggetGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_NETHER_GOLD_NUGGET_GEODE.get());}
    private static RarityFilter rarityNetherQuartzGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_NETHER_QUARTZ_GEODE.get());}
    //Basalt
    private static RarityFilter rarityBasaltAncientDebrisGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BASALT_DEBRIS_GEODE.get());}
    private static RarityFilter rarityBasaltGlowstoneGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BASALT_GLOWSTONE_GEODE.get());}
    private static RarityFilter rarityBasaltGoldNuggetGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BASALT_GOLD_NUGGET_GEODE.get());}
    private static RarityFilter rarityBasaltQuartzGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BASALT_QUARTZ_GEODE.get());}
    //Blackstone
    private static RarityFilter rarityBlackstoneAncientDebrisGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BLACKSTONE_DEBRIS_GEODE.get());}
    private static RarityFilter rarityBlackstoneGlowstoneGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BLACKSTONE_GLOWSTONE_GEODE.get());}
    private static RarityFilter rarityBlackstoneGoldNuggetGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BLACKSTONE_GOLD_NUGGET_GEODE.get());}
    private static RarityFilter rarityBlackstoneQuartzGeode(){return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_BLACKSTONE_QUARTZ_GEODE.get());}


    private static CountPlacement placementCrystal() {
        return CountPlacement.of(20);
    }

    private static CountPlacement placementEndCrystal() {
        return CountPlacement.of(5);
    }
    private static RarityFilter rarityEndWrappistGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_END_WRAPPIST_GEODE.get());
    }
    private static RarityFilter rarityEchoGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_ECHO_GEODE.get());
    }

    private static RarityFilter rarityOreGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_ORES_GEODE.get());
    }

    private static RarityFilter rarityRareOreGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_RARE_ORES_GEODE.get());
    }
    private static RarityFilter raritySwampGeode() {
        return RarityFilter.onAverageOnceEvery(GeodePlusCommonConfigs.RARITY_SWAMP_GEODE.get());
    }


    private static InSquarePlacement inSquarePlacement() {
        return InSquarePlacement.spread();
    }

    private static PlacementModifier placementPrismarineModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(60));
    }
    private static PlacementModifier placementNetherModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(110));
    }
    private static PlacementModifier placementNetherCrystalModifier() {
        return PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT;
    }

    private static PlacementModifier placementEchoCrystalModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30));
    }

    private static PlacementModifier placementNetherBasaltModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(110));
    }

    private static PlacementModifier placementDeepDarkModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30));
    }

    private static PlacementModifier placementOreModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(60), VerticalAnchor.absolute(30));
    }

    private static PlacementModifier placementDeepOreModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(0));
    }

    private static PlacementModifier placementRareModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(40));
    }
    private static PlacementModifier placementEndModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(32));
    }
    private static PlacementModifier placementSwampModifier() {
        return HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(50), VerticalAnchor.absolute(110));
    }
    private static BiomeFilter biomeFilter() {
        return BiomeFilter.biome();
    }

    public static void initialize() {};
}
