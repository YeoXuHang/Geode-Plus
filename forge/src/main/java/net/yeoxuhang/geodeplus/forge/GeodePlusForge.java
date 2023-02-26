package net.yeoxuhang.geodeplus.forge;

import com.mojang.datafixers.util.Pair;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.client.GeodePlusClient;
import net.yeoxuhang.geodeplus.client.model.layer.GeodePlusModelLayersRegistry;
import net.yeoxuhang.geodeplus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlockEntityRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;
import net.yeoxuhang.geodeplus.forge.registry.GeodePlusBiomeModifierRegistry;
import net.yeoxuhang.geodeplus.forge.registry.GeodePlusLootModifierRegistry;
import net.yeoxuhang.geodeplus.forge.util.BrewingRecipe;
import net.yeoxuhang.geodeplus.platform.forge.BlockEntityTypeHelperImpl;
import net.yeoxuhang.geodeplus.platform.forge.ClientHelperImpl;
import net.yeoxuhang.geodeplus.platform.forge.RegistryHelperImpl;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.function.Supplier;

@Mod(GeodePlus.MOD_ID)
public class GeodePlusForge {
    public GeodePlusForge() {
        GeodePlus.init();
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> GeodePlusModelLayersRegistry::initialize);
        RegistryHelperImpl.ITEMS.register(eventBus);
        RegistryHelperImpl.BLOCKS.register(eventBus);
        BlockEntityTypeHelperImpl.BLOCK_ENTITIES.register(eventBus);
        RegistryHelperImpl.FEATURES.register(eventBus);
        RegistryHelperImpl.PLACED_FEATURES.register(eventBus);

        GeodePlusBiomeModifierRegistry.register(eventBus);
        GeodePlusLootModifierRegistry.register(eventBus);
        eventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            BrewingRecipeRegistry.addRecipe(new BrewingRecipe(Potions.WATER,
                    GeodePlusItemsRegistry.CELESTITE_SHARD.get(), Potions.STRONG_HEALING));
        });
    }

    @Mod.EventBusSubscriber(modid = GeodePlus.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class GeodeModClient {

        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent e) {
            GeodePlusClient.initClient();
            BlockEntityRenderers.register(GeodePlusBlockEntityRegistry.WRAPPIST_PEDESTAL_ENTITY.get(), WrappistPedestalBlockEntityRenderer::new);
        }

        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            for (Pair<ModelLayerLocation, Supplier<LayerDefinition>> modelLayerLocation : ClientHelperImpl.modelLayerLocations) {
                event.registerLayerDefinition(modelLayerLocation.getFirst(), modelLayerLocation.getSecond());
            }
        }
    }
}