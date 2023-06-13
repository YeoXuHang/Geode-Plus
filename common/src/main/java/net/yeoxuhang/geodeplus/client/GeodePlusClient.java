package net.yeoxuhang.geodeplus.client;

import net.minecraft.client.renderer.RenderType;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.platform.ClientHelper;

/*
 * Thx to Lucasmellof, Lucas de Mello Freitas created on 16/11/2022
 */
public class GeodePlusClient {

	public static void initClient() {
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LAPIS_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.EMERALD_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get(), RenderType.cutout());
		//Quartz Crystal
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(), RenderType.cutout());
		//Glowstone Cluster
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.ECHO_CRYSTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.CELESTINE_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_CELESTINE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_CELESTINE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_CELESTINE_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.CELESTITE_PEDESTAL.get(), RenderType.cutout());
	}
}
