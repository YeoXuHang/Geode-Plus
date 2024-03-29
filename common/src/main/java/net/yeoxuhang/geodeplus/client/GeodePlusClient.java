package net.yeoxuhang.geodeplus.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.client.model.WrappistPedestalBlockEntityModel;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.platform.ClientHelper;

import java.util.function.Supplier;

/*
 * Thx to Lucasmellof, Lucas de Mello Freitas created on 16/11/2022
 */
public class GeodePlusClient {

	public static final ModelLayerLocation WRAPPIST_PEDESTAL = register("wrappist_pedestal", "main", WrappistPedestalBlockEntityModel::createBodyLayer);
	private static ModelLayerLocation register(String model, String layer, Supplier<LayerDefinition> createBodyLayer) {
		return ClientHelper.registerModelLayer(new ModelLayerLocation(new ResourceLocation(GeodePlus.MOD_ID, model), layer), createBodyLayer);
	}

	public static void initClient() {
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.PINK_TOPAZ_CRYSTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_PINK_TOPAZ_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_PINK_TOPAZ_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_PINK_TOPAZ_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.CELESTITE_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD.get(), RenderType.cutout());

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

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(), RenderType.cutout());

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

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.WRAPPIST_GLASS.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.CELESTITE_GLASS.get(), RenderType.cutout());
		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.PINK_TOPAZ_GLASS.get(), RenderType.cutout());

		ClientHelper.putRenderLayer(GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get(), RenderType.cutout());
	}
	public static void init(){}
}
