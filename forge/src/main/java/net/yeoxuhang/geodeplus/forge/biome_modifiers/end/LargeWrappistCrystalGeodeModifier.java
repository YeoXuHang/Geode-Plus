package net.yeoxuhang.geodeplus.forge.biome_modifiers.end;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.yeoxuhang.geodeplus.common.config.GeodePlusCommonConfigs;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusTagRegistry;


public class LargeWrappistCrystalGeodeModifier implements BiomeModifier {
    private final Holder<PlacedFeature> features;

    public LargeWrappistCrystalGeodeModifier(Holder<PlacedFeature> features) {
        this.features = features;
    }
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {
            biomeModificationAddPhase(biome, builder);
        }
    }

    private void biomeModificationAddPhase(Holder<Biome> biome, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (biome.is(GeodePlusTagRegistry.Biomes.HAS_WRAPPIST_CRYSTAL) && !biome.is(GeodePlusTagRegistry.Biomes.BLACKLIST_BIOMES) && GeodePlusCommonConfigs.SHOULD_GENERATE_LARGE_END_WRAPPIST_CRYSTAL.get()) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.SURFACE_STRUCTURES, features);
        }
    }
    @Override
    public Codec<? extends BiomeModifier> codec() {
        return LargeWrappistCrystalGeodeModifier.makeCodec();
    }

    public static Codec<LargeWrappistCrystalGeodeModifier> makeCodec() {
        return RecordCodecBuilder.create((config) -> {
            return config.group(PlacedFeature.CODEC.fieldOf("feature").forGetter((otherConfig) -> {
                return otherConfig.features;
            })).apply(config, LargeWrappistCrystalGeodeModifier::new);
        });
    }
}