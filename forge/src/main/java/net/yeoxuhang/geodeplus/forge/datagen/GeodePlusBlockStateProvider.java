package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;

import java.util.function.Supplier;

import static net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry.SMOOTH_END_STONE;

public class GeodePlusBlockStateProvider extends BlockStateProvider {
    public GeodePlusBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GeodePlus.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.EMERALD_CLUSTER_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK.get());
        simpleBlock(SMOOTH_END_STONE.get());
        simpleBlock(GeodePlusBlocksRegistry.GALCITE.get());
        simpleBlock(GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_GLOWSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_ECHO.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_LAPIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_REDSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_EMERALD.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_DIAMOND.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_PRISMARINE.get());
        simpleBlock(GeodePlusBlocksRegistry.BUDDING_CELESTINE.get());
        simpleBlock(GeodePlusBlocksRegistry.CELESTINE_CLUSTER_BLOCK.get());

        stairsBlock(GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get(), blockLoc(SMOOTH_END_STONE));
        wallBlock(GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL, blockLoc(SMOOTH_END_STONE));
        slabBlock(GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(), blockLoc(SMOOTH_END_STONE),
                blockLoc(SMOOTH_END_STONE));

        directionalBlock(GeodePlusBlocksRegistry.ECHO_CRYSTAL.get(), models().cross(getName(GeodePlusBlocksRegistry.ECHO_CRYSTAL), blockLoc(GeodePlusBlocksRegistry.ECHO_CRYSTAL)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_ECHO_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_ECHO_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_ECHO_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_ECHO_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get(), models().cross(getName(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL), blockLoc(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get(), models().cross(getName(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER), blockLoc(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get(), models().cross(getName(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER), blockLoc(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get(), models().cross(getName(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER), blockLoc(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(), models().cross(getName(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER), blockLoc(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.LAPIS_CLUSTER.get(), models().cross(getName(GeodePlusBlocksRegistry.LAPIS_CLUSTER), blockLoc(GeodePlusBlocksRegistry.LAPIS_CLUSTER)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get(), models().cross(getName(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL), blockLoc(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.EMERALD_CLUSTER.get(), models().cross(getName(GeodePlusBlocksRegistry.EMERALD_CLUSTER), blockLoc(GeodePlusBlocksRegistry.EMERALD_CLUSTER)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get(), models().cross(getName(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL), blockLoc(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get(), models().cross(getName(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER), blockLoc(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD)));

        directionalBlock(GeodePlusBlocksRegistry.CELESTINE_CLUSTER.get(), models().cross(getName(GeodePlusBlocksRegistry.CELESTINE_CLUSTER), blockLoc(GeodePlusBlocksRegistry.CELESTINE_CLUSTER)));
        directionalBlock(GeodePlusBlocksRegistry.LARGE_CELESTINE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.LARGE_CELESTINE_BUD), blockLoc(GeodePlusBlocksRegistry.LARGE_CELESTINE_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.MEDIUM_CELESTINE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.MEDIUM_CELESTINE_BUD), blockLoc(GeodePlusBlocksRegistry.MEDIUM_CELESTINE_BUD)));
        directionalBlock(GeodePlusBlocksRegistry.SMALL_CELESTINE_BUD.get(), models().cross(getName(GeodePlusBlocksRegistry.SMALL_CELESTINE_BUD), blockLoc(GeodePlusBlocksRegistry.SMALL_CELESTINE_BUD)));
    }


    public void wallBlock(Supplier<WallBlock> block, ResourceLocation texture) {
        super.wallBlock(block.get(), texture);
        models().wallInventory(getName(block) + "_inventory", texture);
    }

    public String getName(Supplier<? extends Block> block) {
        return block.get().builtInRegistryHolder().key().location().getPath();
    }

    public ResourceLocation blockLoc(Supplier<? extends Block> block) {
        return new ResourceLocation(GeodePlus.MOD_ID, "block/" + getName(block));
    }


    public ResourceLocation blockLoc(Supplier<? extends Block> block, String suffix) {
        return new ResourceLocation(GeodePlus.MOD_ID, "block/" + getName(block) + "_" + suffix);
    }
}
