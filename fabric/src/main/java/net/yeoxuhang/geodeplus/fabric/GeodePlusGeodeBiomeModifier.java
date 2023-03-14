package net.yeoxuhang.geodeplus.fabric;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.config.GeodePlusCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusPlacedFeatureRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusTagRegistry;

public class GeodePlusGeodeBiomeModifier {

    public ResourceKey<PlacedFeature> getKey(PlacedFeature feature) {
        return BuiltinRegistries.PLACED_FEATURE.getResourceKey(feature).get();
    }
    public void biomeModificationHelper() {
        var modifications = BiomeModifications.create(new ResourceLocation(GeodePlus.MOD_ID, "biome_modifications"));
        modifications.add(ModificationPhase.ADDITIONS, biomeSelectionContext -> true, (biomeSelectionContext, builder) -> {
            Holder<Biome> biome = biomeSelectionContext.getBiomeRegistryEntry();
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_PRISMARINE_GEODE) && GeodePlusCommonConfigs.SHOULD_GENERATE_DEEP_OCEAN_PRISMARINE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.PRISMARINE_GEODE.get()));
            }
            //Stone
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_DIAMOND_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_DIAMOND_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.DIAMOND_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_EMERALD_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_EMERALD_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.EMERALD_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_LAPIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_LAPIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.LAPIS_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_REDSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_REDSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.REDSTONE_GEODE.get()));
            }
            //Deepslate
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_DIAMOND_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.DEEPSLATE_DIAMOND_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_EMERALD_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.DEEPSLATE_EMERALD_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_LAPIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.DEEPSLATE_LAPIS_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_REDSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.DEEPSLATE_REDSTONE_GEODE.get()));
            }
            //Sculk
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_DIAMOND_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.SCULK_DIAMOND_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_EMERALD_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.SCULK_EMERALD_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_LAPIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.SCULK_LAPIS_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_REDSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.SCULK_REDSTONE_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_ECHO_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.ECHO_GEODE.get()));
            }
            //Netherrack
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_ANCIENT_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.ANCIENT_DEBRIS_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.GLOWSTONE_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_GOLD_NUGGET_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.GOLD_NUGGET_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.QUARTZ_GEODE.get()));
            }
            //Basalt
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_ANCIENT_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.BASALT_ANCIENT_DEBRIS_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.BASALT_GLOWSTONE_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_GOLD_NUGGET_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.BASALT_GOLD_NUGGET_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.BASALT_QUARTZ_GEODE.get()));
            }
            //Blackstone
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_ANCIENT_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_GLOWSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_GLOWSTONE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.BLACKSTONE_GLOWSTONE_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_GOLD_NUGGET_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_GOLD_NUGGET_DEBRIS_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.BLACKSTONE_GOLD_NUGGET_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_QUARTZ_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_QUARTZ_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.BLACKSTONE_QUARTZ_GEODE.get()));
            }
            //End
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_WRAPPIST_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_END_WRAPPIST_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.WRAPPIST_GEODE.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_CELESTITE_GEODE) && GeodePlusCommonConfigs.SHOULD_GENERATE_CELESTITE_GEODE.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.CELESTITE_GEODE.get()));
            }
            //Crystals
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_PRISMARINE_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_PRISMARINE_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.PRISMARINE_CRYSTAL_SPIKE_FLOOR.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_ECHO_CRYSTAL.get()){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.ECHO_CRYSTAL_SPIKE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.ECHO_CRYSTAL_SPIKE_FLOOR.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_QUARTZ_CRYSTAL )&& GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_NETHER_QUARTZ_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.QUARTZ_CRYSTAL_SPIKE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.QUARTZ_CRYSTAL_SPIKE_FLOOR.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_NETHER_GLOWSTONE_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE.get()));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR.get()));
            }
            if (biome.is(GeodePlusTagRegistry.Biomes.HAS_WRAPPIST_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_END_WRAPPIST_CRYSTAL.get()) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getKey(GeodePlusPlacedFeatureRegistry.WRAPPIST_CRYSTAL_SPIKE.get()));
            }
        });
    }
}

