package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.*;

import java.util.function.Supplier;

public class GeodePlusItemModelProvider extends ItemModelProvider {

    private final ModelFile GENERATED = getExistingFile(mcLoc("item/generated"));
    private final ModelFile HANDHELD = getExistingFile(mcLoc("item/handheld"));

    private final ModelFile GOAT_HORN = getExistingFile(mcLoc("item/goat_horn"));

    public GeodePlusItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GeodePlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        itemModel(GeodePlusItemsRegistry.CELESTITE_SHARD, GENERATED);
        itemModel(GeodePlusItemsRegistry.WRAPPIST_SHARD, GENERATED);
        itemModel(GeodePlusItemsRegistry.WRAPPIST_GOAT_HORN, GOAT_HORN);
        singleLayerBlockModel(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.EMERALD_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.LAPIS_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.ECHO_CRYSTAL, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_ECHO_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_ECHO_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD, GENERATED);

        singleLayerBlockModel(GeodePlusBlocksRegistry.CELESTINE_CLUSTER, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.SMALL_CELESTINE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.MEDIUM_CELESTINE_BUD, GENERATED);
        singleLayerBlockModel(GeodePlusBlocksRegistry.LARGE_CELESTINE_BUD, GENERATED);
    }
    public void blockModel(Supplier<? extends Block> block) {
        getExistingFile(modLoc("block/" + getName(block.get())));
    }

    public String getName(Block block) {
        return block.builtInRegistryHolder().key().location().getPath();
    }

    public String getName(Supplier<? extends Item> item) {
        return item.get().builtInRegistryHolder().key().location().getPath();
    }

    public void blockModel(Supplier<? extends Block> block, String suffix) {
        withExistingParent(getName(block.get()), modLoc("block/" + getName(block.get()) + "_" + suffix));
    }

    public void itemModel(Supplier<? extends Item> item, ModelFile modelFile) {
        getBuilder(getName(item)).parent(modelFile).texture("layer0", "item/" + getName(item));
    }

    public void singleLayerBlockModel(Supplier<? extends Block> block, ModelFile modelFile) {
        getBuilder(getName(block.get())).parent(modelFile).texture("layer0", "block/" + getName(block.get()));
    }
}
