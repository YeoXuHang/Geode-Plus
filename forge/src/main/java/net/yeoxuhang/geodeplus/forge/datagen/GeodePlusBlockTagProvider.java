package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusTagRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;

public class GeodePlusBlockTagProvider extends BlockTagsProvider {
    public GeodePlusBlockTagProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GeodePlus.MOD_ID, exFileHelper);
    }

    protected void addTags() {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get(),
                GeodePlusBlocksRegistry.LAPIS_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get(),
                GeodePlusBlocksRegistry.EMERALD_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get(),
                GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_LAPIS.get(),
                GeodePlusBlocksRegistry.BUDDING_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_DIAMOND.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND.get(),
                GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get(),
                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get(),
                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get(),
                GeodePlusBlocksRegistry.GALCITE.get(),
                GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get(),
                GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get(),
                GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_ECHO.get(),
                GeodePlusBlocksRegistry.ECHO_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get(),
                GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_PRISMARINE.get(),
                GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get(),
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK.get(),
                GeodePlusBlocksRegistry.EMERALD_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK.get(),
                GeodePlusBlocksRegistry.BUDDING_CELESTINE.get(),
                GeodePlusBlocksRegistry.CELESTINE_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.CELESTINE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_CELESTINE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_CELESTINE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_CELESTINE_BUD.get(),
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get()
        );
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                GeodePlusBlocksRegistry.LAPIS_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_LAPIS.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get(),

                GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS.get(),

                GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get(),
                GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get(),

                GeodePlusBlocksRegistry.BUDDING_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(),
                GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(),
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get(),
                GeodePlusBlocksRegistry.GALCITE.get(),

                GeodePlusBlocksRegistry.BUDDING_PRISMARINE.get(),
                GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get()
        );
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get(),

                GeodePlusBlocksRegistry.EMERALD_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get(),

                GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_DIAMOND.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD.get(),
                GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND.get(),
                GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_ECHO.get(),
                GeodePlusBlocksRegistry.ECHO_CRYSTAL.get(),
                GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get()
        );
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get(),
                GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get(),
                GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(),
                GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get(),
                GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get(),
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(),
                GeodePlusBlocksRegistry.BUDDING_CELESTINE.get(),
                GeodePlusBlocksRegistry.CELESTINE_CLUSTER_BLOCK.get(),
                GeodePlusBlocksRegistry.CELESTINE_CLUSTER.get(),
                GeodePlusBlocksRegistry.LARGE_CELESTINE_BUD.get(),
                GeodePlusBlocksRegistry.MEDIUM_CELESTINE_BUD.get(),
                GeodePlusBlocksRegistry.SMALL_CELESTINE_BUD.get()
        );
        this.tag(GeodePlusTagRegistry.Blocks.CAN_LARGE_ECHO_CRYSTAL_PLACE).add(Blocks.SCULK,
                Blocks.STONE,
                Blocks.DEEPSLATE);

        this.tag(GeodePlusTagRegistry.Blocks.CAN_LARGE_PRISMARINE_CRYSTAL_PLACE).add(Blocks.SAND,
                Blocks.STONE,
                Blocks.GRAVEL,
                Blocks.CLAY,
                Blocks.SANDSTONE);

        this.tag(GeodePlusTagRegistry.Blocks.CAN_LARGE_WRAPPIST_CRYSTAL_PLACE).add(Blocks.END_STONE);

        this.tag(GeodePlusTagRegistry.Blocks.WRAPPIST_PEDESTAL_CANNOT_PLACE_ON).add(Blocks.AIR,
                Blocks.CAVE_AIR,
                Blocks.VOID_AIR);

        this.tag(BlockTags.WALLS).add(
                GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get()
        );
        this.tag(GeodePlusTagRegistry.Blocks.GEODE_INVALID_BLOCKS).add(
                Blocks.BEDROCK,
                Blocks.ICE,
                Blocks.BLUE_ICE,
                Blocks.PACKED_ICE,
                Blocks.LAVA
        );
    }
}

