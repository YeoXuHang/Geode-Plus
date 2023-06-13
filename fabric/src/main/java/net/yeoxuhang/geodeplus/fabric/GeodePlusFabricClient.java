package net.yeoxuhang.geodeplus.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.yeoxuhang.geodeplus.client.GeodePlusClient;
import net.yeoxuhang.geodeplus.client.model.layer.GeodePlusModelLayersRegistry;
import net.yeoxuhang.geodeplus.client.render.CelestitePedestalBlockEntityRenderer;
import net.yeoxuhang.geodeplus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlockEntityRegistry;

public class GeodePlusFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeodePlusModelLayersRegistry.initialize();

        GeodePlusClient.initClient();
        BlockEntityRendererRegistry.register(GeodePlusBlockEntityRegistry.WRAPPIST_PEDESTAL_ENTITY.get(), WrappistPedestalBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(GeodePlusBlockEntityRegistry.CELESTITE_PEDESTAL_ENTITY.get(), CelestitePedestalBlockEntityRenderer::new);


    }
}
