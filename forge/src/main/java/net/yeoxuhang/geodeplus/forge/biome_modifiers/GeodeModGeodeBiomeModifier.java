package net.yeoxuhang.geodeplus.forge.biome_modifiers;

import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.yeoxuhang.geodeplus.common.config.GeodePlusCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusPlacedFeatureRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusTagRegistry;
import net.yeoxuhang.geodeplus.forge.registry.GeodePlusBiomeModifierRegistry;


public class GeodeModGeodeBiomeModifier implements BiomeModifier {
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {
            biomeModificationAddPhase(biome, builder);
        }
    }

    private static void biomeModificationAddPhase(Holder<Biome> biome, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_PRISMARINE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEP_OCEAN_PRISMARINE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.PRISMARINE_GEODE.get()));
        }
        //Stone
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_DIAMOND_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_DIAMOND_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.DIAMOND_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_EMERALD_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_EMERALD_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.EMERALD_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_LAPIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_LAPIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.LAPIS_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_REDSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_STONE_REDSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.REDSTONE_GEODE.get()));
        }
        //Deepslate
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_DIAMOND_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.DEEPSLATE_DIAMOND_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_EMERALD_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.DEEPSLATE_EMERALD_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_LAPIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.DEEPSLATE_LAPIS_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_REDSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.DEEPSLATE_REDSTONE_GEODE.get()));
        }
        //Sculk
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_DIAMOND_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.SCULK_DIAMOND_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_EMERALD_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.SCULK_EMERALD_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_LAPIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.SCULK_LAPIS_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_SCULK_REDSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.SCULK_REDSTONE_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_ECHO_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.ECHO_GEODE.get()));
        }
        //Netherrack
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_ANCIENT_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.ANCIENT_DEBRIS_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.GLOWSTONE_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_GOLD_NUGGET_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.GOLD_NUGGET_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_NETHER_QUARTZ_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.QUARTZ_GEODE.get()));
        }
        //Basalt
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_ANCIENT_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.BASALT_ANCIENT_DEBRIS_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.BASALT_GLOWSTONE_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_GOLD_NUGGET_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.BASALT_GOLD_NUGGET_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BASALT_QUARTZ_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.BASALT_QUARTZ_GEODE.get()));
        }
        //Blackstone
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_ANCIENT_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.BLACKSTONE_ANCIENT_DEBRIS_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_GLOWSTONE_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_GLOWSTONE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.BLACKSTONE_GLOWSTONE_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_GOLD_NUGGET_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_GOLD_NUGGET_DEBRIS_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.BLACKSTONE_GOLD_NUGGET_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_BLACKSTONE_QUARTZ_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_BLACKSTONE_QUARTZ_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.BLACKSTONE_QUARTZ_GEODE.get()));
        }
        //End
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_WRAPPIST_GEODE )&& GeodePlusCommonConfigs.SHOULD_GENERATE_END_WRAPPIST_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.WRAPPIST_GEODE.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_CELESTITE_GEODE)&& GeodePlusCommonConfigs.SHOULD_GENERATE_CELESTITE_GEODE.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.CELESTITE_GEODE.get()));
        }
        //Crystals
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_PRISMARINE_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_PRISMARINE_CRYSTAL.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Holder.direct(GeodePlusPlacedFeatureRegistry.PRISMARINE_CRYSTAL_SPIKE_FLOOR.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_ECHO_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_ECHO_CRYSTAL.get()){
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.ECHO_CRYSTAL_SPIKE.get()));
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.ECHO_CRYSTAL_SPIKE_FLOOR.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_QUARTZ_CRYSTAL )&& GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_NETHER_QUARTZ_CRYSTAL.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.QUARTZ_CRYSTAL_SPIKE.get()));
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.QUARTZ_CRYSTAL_SPIKE_FLOOR.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_NETHER_GLOWSTONE_CRYSTAL.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE.get()));
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.GLOWSTONE_CRYSTAL_SPIKE_FLOOR.get()));
        }
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_WRAPPIST_CRYSTAL) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_END_WRAPPIST_CRYSTAL.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(GeodePlusPlacedFeatureRegistry.WRAPPIST_CRYSTAL_SPIKE.get()));
        }
    }


    @Override
    public Codec<? extends BiomeModifier> codec() {
        return GeodePlusBiomeModifierRegistry.GEODE_MODIFIER.get();
    }
}