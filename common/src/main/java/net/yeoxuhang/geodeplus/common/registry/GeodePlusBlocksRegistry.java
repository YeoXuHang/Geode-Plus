package net.yeoxuhang.geodeplus.common.registry;

import net.minecraft.world.level.block.*;
import net.yeoxuhang.geodeplus.platform.RegistryHelper;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.yeoxuhang.geodeplus.common.block.*;

import java.util.function.Supplier;

public class GeodePlusBlocksRegistry {

    public static final Supplier<Block> BUDDING_PINK_TOPAZ = registerBlock("budding_pink_topaz",
            () -> new BuddingPinkTopazBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).randomTicks().strength(3F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Supplier<Block> PINK_TOPAZ_BLOCK = registerBlock("pink_topaz_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK)
                    .strength(4f).sound(SoundType.AMETHYST)));
    public static final Supplier<PinkTopazCrystalBlock> PINK_TOPAZ_CRYSTAL = registerBlock("pink_topaz_crystal",
            () -> new PinkTopazCrystalBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final Supplier<PinkTopazCrystalBlock> LARGE_PINK_TOPAZ_BUD = registerBlock("large_pink_topaz_bud",
            () -> new PinkTopazCrystalBlock(5, 3, BlockBehaviour.Properties.copy(PINK_TOPAZ_CRYSTAL.get()).lightLevel((p_60929_) -> 2)));
    public static final Supplier<PinkTopazCrystalBlock> MEDIUM_PINK_TOPAZ_BUD = registerBlock("medium_pink_topaz_bud",
            () -> new PinkTopazCrystalBlock(4, 3, BlockBehaviour.Properties.copy(PINK_TOPAZ_CRYSTAL.get()).lightLevel((p_60929_) -> 1)));
    public static final Supplier<PinkTopazCrystalBlock> SMALL_PINK_TOPAZ_BUD = registerBlock("small_pink_topaz_bud",
            () -> new PinkTopazCrystalBlock(3, 4, BlockBehaviour.Properties.copy(PINK_TOPAZ_CRYSTAL.get())));

    public static final Supplier<Block> BUDDING_CELESTITE = registerBlock("budding_celestite",
            () -> new BuddingCelestiteBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).randomTicks().strength(3F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final Supplier<Block> CELESTITE_BLOCK = registerBlock("celestite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN)
                    .strength(4f).sound(SoundType.STONE)));
    public static final Supplier<CelestiteClusterBlock> CELESTITE_CLUSTER = registerBlock("celestite_cluster",
            () -> new CelestiteClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final Supplier<CelestiteClusterBlock> LARGE_CELESTITE_BUD = registerBlock("large_celestite_bud",
            () -> new CelestiteClusterBlock(5, 3, BlockBehaviour.Properties.copy(CELESTITE_CLUSTER.get()).lightLevel((p_60929_) -> 2)));
    public static final Supplier<CelestiteClusterBlock> MEDIUM_CELESTITE_BUD = registerBlock("medium_celestite_bud",
            () -> new CelestiteClusterBlock(4, 3, BlockBehaviour.Properties.copy(CELESTITE_CLUSTER.get()).lightLevel((p_60929_) -> 1)));
    public static final Supplier<CelestiteClusterBlock> SMALL_CELESTITE_BUD = registerBlock("small_celestite_bud",
            () -> new CelestiteClusterBlock(3, 4, BlockBehaviour.Properties.copy(CELESTITE_CLUSTER.get())));

    public static final Supplier<Block> BUDDING_PRISMARINE = registerBlock("budding_prismarine",
            () -> new BuddingPrismarineBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).randomTicks().strength(3F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final Supplier<Block> PRISMARINE_CLUSTER_BLOCK = registerBlock("prismarine_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN)
                    .strength(4f).sound(SoundType.STONE)));
    public static final Supplier<PrismarineClusterBlock> PRISMARINE_CLUSTER = registerBlock("prismarine_cluster",
            () -> new PrismarineClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final Supplier<PrismarineClusterBlock> LARGE_PRISMARINE_BUD = registerBlock("large_prismarine_bud",
            () -> new PrismarineClusterBlock(5, 3, BlockBehaviour.Properties.copy(PRISMARINE_CLUSTER.get()).lightLevel((p_60929_) -> 2)));
    public static final Supplier<PrismarineClusterBlock> MEDIUM_PRISMARINE_BUD = registerBlock("medium_prismarine_bud",
            () -> new PrismarineClusterBlock(4, 3, BlockBehaviour.Properties.copy(PRISMARINE_CLUSTER.get()).lightLevel((p_60929_) -> 1)));
    public static final Supplier<PrismarineClusterBlock> SMALL_PRISMARINE_BUD = registerBlock("small_prismarine_bud",
            () -> new PrismarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(PRISMARINE_CLUSTER.get())));

    public static final Supplier<BuddingLapisBlock> BUDDING_LAPIS = registerBlock("budding_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final Supplier<BuddingLapisBlock> BUDDING_DEEPSLATE_LAPIS = registerBlock("budding_deepslate_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

    public static final Supplier<BuddingLapisBlock> BUDDING_SCULK_LAPIS = registerBlock("budding_sculk_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()));
    public static final Supplier<Block> LAPIS_CLUSTER_BLOCK = registerBlock("lapis_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE)
                    .strength(4f).sound(SoundType.STONE)));

    public static final Supplier<OresClusterBlock> LAPIS_CLUSTER = registerBlock("lapis_cluster",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final Supplier<LargeOresClusterBlock> LARGE_LAPIS_BUD = registerBlock("large_lapis_bud",
            () -> new LargeOresClusterBlock(5, 3, BlockBehaviour.Properties.copy(LAPIS_CLUSTER.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 2)));
    public static final Supplier<MediumOresClusterBlock> MEDIUM_LAPIS_BUD = registerBlock("medium_lapis_bud",
            () -> new MediumOresClusterBlock(4, 3, BlockBehaviour.Properties.copy(LAPIS_CLUSTER.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 1)));
    public static final Supplier<SmallOresClusterBlock> SMALL_LAPIS_BUD = registerBlock("small_lapis_bud",
            () -> new SmallOresClusterBlock(3, 4, BlockBehaviour.Properties.copy(LAPIS_CLUSTER.get()).sound(SoundType.AMETHYST)));

    public static final Supplier<Block> BUDDING_REDSTONE = registerBlock("budding_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Supplier<Block> BUDDING_DEEPSLATE_REDSTONE = registerBlock("budding_deepslate_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Supplier<Block> BUDDING_SCULK_REDSTONE = registerBlock("budding_sculk_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()));
    public static final Supplier<Block> REDSTONE_CRYSTAL_BLOCK = registerBlock("redstone_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
                    .strength(4f).sound(SoundType.STONE)));

    public static final Supplier<RedstoneOresClusterBlock> REDSTONE_CRYSTAL = registerBlock("redstone_crystal",
            () -> new RedstoneOresClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final Supplier<RedstoneOresClusterBlock> LARGE_REDSTONE_BUD = registerBlock("large_redstone_bud",
            () -> new RedstoneOresClusterBlock(5, 3, BlockBehaviour.Properties.copy(REDSTONE_CRYSTAL.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 2)));
    public static final Supplier<RedstoneOresClusterBlock> MEDIUM_REDSTONE_BUD = registerBlock("medium_redstone_bud",
            () -> new RedstoneOresClusterBlock(4, 3, BlockBehaviour.Properties.copy(REDSTONE_CRYSTAL.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 1)));
    public static final Supplier<RedstoneOresClusterBlock> SMALL_REDSTONE_BUD = registerBlock("small_redstone_bud",
            () -> new RedstoneOresClusterBlock(3, 4, BlockBehaviour.Properties.copy(REDSTONE_CRYSTAL.get()).sound(SoundType.AMETHYST)));

    public static final Supplier<Block> BUDDING_EMERALD = registerBlock("budding_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Supplier<Block> BUDDING_DEEPSLATE_EMERALD = registerBlock("budding_deepslate_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Supplier<Block> BUDDING_SCULK_EMERALD = registerBlock("budding_sculk_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()));
    public static final Supplier<Block> EMERALD_CLUSTER_BLOCK = registerBlock("emerald_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD)
                    .strength(4f).sound(SoundType.STONE)));
    public static final Supplier<OresClusterBlock> EMERALD_CLUSTER = registerBlock("emerald_cluster",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final Supplier<LargeOresClusterBlock> LARGE_EMERALD_BUD = registerBlock("large_emerald_bud",
            () -> new LargeOresClusterBlock(5, 3, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 2)));
    public static final Supplier<MediumOresClusterBlock> MEDIUM_EMERALD_BUD = registerBlock("medium_emerald_bud",
            () -> new MediumOresClusterBlock(4, 3, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 1)));
    public static final Supplier<SmallOresClusterBlock> SMALL_EMERALD_BUD = registerBlock("small_emerald_bud",
            () -> new SmallOresClusterBlock(3, 4, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.AMETHYST)));

    public static final Supplier<Block> BUDDING_DIAMOND = registerBlock("budding_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final Supplier<Block> BUDDING_DEEPSLATE_DIAMOND = registerBlock("budding_deepslate_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

    public static final Supplier<Block> BUDDING_SCULK_DIAMOND = registerBlock("budding_sculk_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()));
    public static final Supplier<Block> DIAMOND_CRYSTAL_BLOCK = registerBlock("diamond_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .strength(4f).sound(SoundType.STONE)));
    public static final Supplier<OresClusterBlock> DIAMOND_CRYSTAL = registerBlock("diamond_crystal",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final Supplier<LargeOresClusterBlock> LARGE_DIAMOND_BUD = registerBlock("large_diamond_bud",
            () -> new LargeOresClusterBlock(5, 3, BlockBehaviour.Properties.copy(DIAMOND_CRYSTAL.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 2)));
    public static final Supplier<MediumOresClusterBlock> MEDIUM_DIAMOND_BUD = registerBlock("medium_diamond_bud",
            () -> new MediumOresClusterBlock(4, 3, BlockBehaviour.Properties.copy(DIAMOND_CRYSTAL.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 1)));
    public static final Supplier<SmallOresClusterBlock> SMALL_DIAMOND_BUD = registerBlock("small_diamond_bud",
            () -> new SmallOresClusterBlock(3, 4, BlockBehaviour.Properties.copy(DIAMOND_CRYSTAL.get()).sound(SoundType.AMETHYST)));

    public static final Supplier<Block> BUDDING_NETHER_QUARTZ = registerBlock("budding_nether_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).randomTicks().strength(3F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()));
    public static final Supplier<Block> BUDDING_BASALT_QUARTZ = registerBlock("budding_basalt_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final Supplier<Block> BUDDING_BLACKSTONE_QUARTZ = registerBlock("budding_blackstone_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()));
    public static final Supplier<Block> QUARTZ_CRYSTAL_BLOCK = registerBlock("nether_quartz_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ)
                    .strength(3f).sound(SoundType.STONE)));

    public static final Supplier<Block> QUARTZ_CRYSTAL = registerBlock("nether_quartz_crystal",
            () -> new QuartzCrystalBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.NETHER_ORE).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final Supplier<Block> LARGE_QUARTZ_BUD = registerBlock("large_nether_quartz_bud",
            () -> new QuartzCrystalBlock(5, 3, BlockBehaviour.Properties.copy(QUARTZ_CRYSTAL.get()).sound(SoundType.NETHER_ORE).lightLevel((p_60929_) -> 2)));
    public static final Supplier<Block> MEDIUM_QUARTZ_BUD = registerBlock("medium_nether_quartz_bud",
            () -> new QuartzCrystalBlock(4, 3, BlockBehaviour.Properties.copy(QUARTZ_CRYSTAL.get()).sound(SoundType.NETHER_ORE).lightLevel((p_60929_) -> 1)));
    public static final Supplier<Block> SMALL_QUARTZ_BUD = registerBlock("small_nether_quartz_bud",
            () -> new QuartzCrystalBlock(3, 4, BlockBehaviour.Properties.copy(QUARTZ_CRYSTAL.get()).sound(SoundType.NETHER_ORE)));

    public static final Supplier<Block> BUDDING_GOLD_NUGGET = registerBlock("budding_nether_gold_nugget",
            () -> new BuddingNetherGoldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).randomTicks().strength(3F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final Supplier<Block> BUDDING_BASALT_GOLD_NUGGET = registerBlock("budding_basalt_gold_nugget",
            () -> new BuddingNetherGoldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final Supplier<Block> BUDDING_BLACKSTONE_GOLD_NUGGET = registerBlock("budding_blackstone_gold_nugget",
            () -> new BuddingNetherGoldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final Supplier<Block> GOLD_NUGGET_CLUSTER_BLOCK = registerBlock("nether_gold_nugget_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD)
                    .strength(4f).sound(SoundType.STONE)));

    public static final Supplier<Block> GOLD_NUGGET_CLUSTER = registerBlock("nether_gold_nugget_cluster",
            () -> new NetherGoldClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.NETHER_GOLD_ORE).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final Supplier<Block> LARGE_GOLD_NUGGET_BUD = registerBlock("large_nether_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(5, 3, BlockBehaviour.Properties.copy(GOLD_NUGGET_CLUSTER.get()).sound(SoundType.NETHER_GOLD_ORE).lightLevel((p_60929_) -> 2)));
    public static final Supplier<Block> MEDIUM_GOLD_NUGGET_BUD = registerBlock("medium_nether_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(4, 3, BlockBehaviour.Properties.copy(GOLD_NUGGET_CLUSTER.get()).sound(SoundType.NETHER_GOLD_ORE).lightLevel((p_60929_) -> 1)));
    public static final Supplier<Block> SMALL_GOLD_NUGGET_BUD = registerBlock("small_nether_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(3, 4, BlockBehaviour.Properties.copy(GOLD_NUGGET_CLUSTER.get()).sound(SoundType.NETHER_GOLD_ORE)));

    public static final Supplier<Block> BUDDING_GLOWSTONE = registerBlock("budding_nether_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final Supplier<Block> BUDDING_BASALT_GLOWSTONE = registerBlock("budding_basalt_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final Supplier<Block> BUDDING_BLACKSTONE_GLOWSTONE = registerBlock("budding_blackstone_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final Supplier<Block> GLOWSTONE_CLUSTER_BLOCK = registerBlock("nether_glowstone_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
                    .strength(4f).sound(SoundType.GLASS).lightLevel( (p_60929_) -> 15)
            ));

    public static final Supplier<Block> GLOWSTONE_CLUSTER = registerBlock("nether_glowstone_cluster",
            () -> new GlowstoneClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.SAND).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.GLASS).strength(3F).lightLevel( (p_60929_) -> 15)));
    public static final Supplier<Block> LARGE_GLOWSTONE_BUD = registerBlock("large_nether_glowstone_bud",
            () -> new GlowstoneClusterBlock(5, 3, BlockBehaviour.Properties.copy(GLOWSTONE_CLUSTER.get()).sound(SoundType.GLASS).lightLevel((p_60929_) -> 5)));
    public static final Supplier<Block> MEDIUM_GLOWSTONE_BUD = registerBlock("medium_nether_glowstone_bud",
            () -> new GlowstoneClusterBlock(4, 3, BlockBehaviour.Properties.copy(GLOWSTONE_CLUSTER.get()).sound(SoundType.GLASS).lightLevel((p_60929_) -> 3)));
    public static final Supplier<Block> SMALL_GLOWSTONE_BUD = registerBlock("small_nether_glowstone_bud",
            () -> new GlowstoneClusterBlock(3, 4, BlockBehaviour.Properties.copy(GLOWSTONE_CLUSTER.get()).sound(SoundType.GLASS).lightLevel((p_60929_) -> 2)));

    public static final Supplier<Block> BUDDING_ANCIENT_DEBRIS = registerBlock("budding_nether_ancient_debris",
            () -> new BuddingAncientDebrisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).randomTicks().strength(10F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final Supplier<Block> BUDDING_BASALT_ANCIENT_DEBRIS = registerBlock("budding_basalt_ancient_debris",
            () -> new BuddingAncientDebrisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(10F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final Supplier<Block> BUDDING_BLACKSTONE_ANCIENT_DEBRIS = registerBlock("budding_blackstone_ancient_debris",
            () -> new BuddingAncientDebrisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(10F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final Supplier<Block> ANCIENT_DEBRIS_CLUSTER_BLOCK = registerBlock("nether_ancient_debris_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(4f).sound(SoundType.STONE)));


    public static final Supplier<Block> ANCIENT_DEBRIS_CLUSTER = registerBlock("nether_ancient_debris_cluster",
            () -> new WrappistClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.ANCIENT_DEBRIS).strength(10F).lightLevel((p_60929_) -> 8)));
    public static final Supplier<Block> LARGE_ANCIENT_DEBRIS_BUD = registerBlock("large_nether_ancient_debris_bud",
            () -> new AncientDebrisClusterBlock(5, 3, BlockBehaviour.Properties.copy(ANCIENT_DEBRIS_CLUSTER.get()).sound(SoundType.ANCIENT_DEBRIS).lightLevel((p_60929_) -> 5)));
    public static final Supplier<Block> MEDIUM_ANCIENT_DEBRIS_BUD = registerBlock("medium_nether_ancient_debris_bud",
            () -> new AncientDebrisClusterBlock(4, 3, BlockBehaviour.Properties.copy(ANCIENT_DEBRIS_CLUSTER.get()).sound(SoundType.ANCIENT_DEBRIS).lightLevel((p_60929_) -> 3)));
    public static final Supplier<Block> SMALL_ANCIENT_DEBRIS_BUD = registerBlock("small_nether_ancient_debris_bud",
            () -> new AncientDebrisClusterBlock(3, 4, BlockBehaviour.Properties.copy(ANCIENT_DEBRIS_CLUSTER.get()).sound(SoundType.ANCIENT_DEBRIS).lightLevel((p_60929_) -> 2)));

    public static final Supplier<Block> SMOOTH_END_STONE = registerBlock("smooth_end_stone",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
                    .strength(4f).sound(SoundType.BASALT)));
    public static final Supplier<StairBlock> SMOOTH_END_STONE_STAIRS = registerBlock("smooth_end_stone_stairs",
            () -> new StairBlock(SMOOTH_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(SMOOTH_END_STONE.get())));
    public static final Supplier<SlabBlock> SMOOTH_END_STONE_SLAB = registerBlock("smooth_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
                    .strength(4f).sound(SoundType.BASALT)));
    public static final Supplier<WallBlock> SMOOTH_END_STONE_WALL = registerBlock("smooth_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(SMOOTH_END_STONE.get())));
    public static final Supplier<Block> GALCITE = registerBlock("galcite",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
                    .strength(5f, 1200).sound(SoundType.CALCITE)));
    public static final Supplier<StairBlock> GALCITE_STAIRS = registerBlock("galcite_stairs",
            () -> new StairBlock(GALCITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(GALCITE.get())));
    public static final Supplier<SlabBlock> GALCITE_SLAB = registerBlock("galcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
                    .strength(4f).sound(SoundType.CALCITE)));
    public static final Supplier<WallBlock> GALCITE_WALL = registerBlock("galcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(GALCITE.get())));
    public static final Supplier<Block> WRAPPIST_BLOCK = registerBlock("wrappist_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(5f).sound(SoundType.AMETHYST)));

    public static final Supplier<Block> BUDDING_WRAPPIST = registerBlock("budding_wrappist",
            () -> new BuddingWrappistBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).randomTicks().strength(5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Supplier<Block> WRAPPIST_CLUSTER = registerBlock("wrappist_cluster",
            () -> new WrappistClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(3F).lightLevel((p_60929_) -> 8)));
    public static final Supplier<Block> LARGE_WRAPPIST_BUD = registerBlock("large_wrappist_bud",
            () -> new WrappistClusterBlock(5, 3, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_60929_) -> 6)));
    public static final Supplier<Block> MEDIUM_WRAPPIST_BUD = registerBlock("medium_wrappist_bud",
            () -> new WrappistClusterBlock(4, 3, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_60929_) -> 3)));
    public static final Supplier<Block> SMALL_WRAPPIST_BUD = registerBlock("small_wrappist_bud",
            () -> new WrappistClusterBlock(3, 4, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_60929_) -> 2)));

    public static final Supplier<Block> ECHO_CRYSTAL_BLOCK = registerBlock("echo_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
                    .strength(5f).sound(SoundType.SCULK_CATALYST)));
    public static final Supplier<BuddingEchoBlock> BUDDING_ECHO = registerBlock("budding_echo",
            () -> new BuddingEchoBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(5F).sound(SoundType.SCULK).requiresCorrectToolForDrops()));


    public static final Supplier<Block> ECHO_CRYSTAL = registerBlock("echo_crystal",
            () -> new EchoCrystalBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.SCULK_CATALYST).strength(4F).lightLevel((p_60929_) -> 3)));
    public static final Supplier<EchoCrystalBlock> LARGE_ECHO_BUD = registerBlock("large_echo_bud",
            () -> new EchoCrystalBlock(5, 3, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST).lightLevel((p_60929_) -> 2)));
    public static final Supplier<EchoCrystalBlock> MEDIUM_ECHO_BUD = registerBlock("medium_echo_bud",
            () -> new EchoCrystalBlock(4, 3, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST).lightLevel((p_60929_) -> 1)));
    public static final Supplier<EchoCrystalBlock> SMALL_ECHO_BUD = registerBlock("small_echo_bud",
            () -> new EchoCrystalBlock(3, 4, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST)));

    public static final Supplier<WrappistPedestalBlock> WRAPPIST_PEDESTAL = registerBlock("wrappist_pedestal",
            () -> new WrappistPedestalBlock(BlockBehaviour.Properties.copy(WRAPPIST_BLOCK.get()).randomTicks().noOcclusion().lightLevel((p_60929_) -> 8)));

    public static final Supplier<GlassBlock> WRAPPIST_GLASS = registerBlock("wrappist_glass", ()-> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Supplier<GlassBlock> CELESTITE_GLASS = registerBlock("celestite_glass", ()-> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(MapColor.COLOR_CYAN)));
    public static final Supplier<GlassBlock> PINK_TOPAZ_GLASS = registerBlock("pink_topaz_glass", ()-> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(MapColor.COLOR_PINK)));

    private static <T extends Block> Supplier<T> registerWithoutItemBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = RegistryHelper.registerBlock(name, block);
        return toReturn;
    }

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = RegistryHelper.registerBlock(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block) {
        RegistryHelper.registerItem(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void init(){};
}
