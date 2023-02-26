package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusTagRegistry;

import javax.annotation.Nullable;

public class GeodePlusItemTagProvider extends ItemTagsProvider {


    public GeodePlusItemTagProvider(DataGenerator generatorIn, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, blockTagProvider, GeodePlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {

        this.tag(GeodePlusTagRegistry.Items.CELESTITE).add(GeodePlusItemsRegistry.CELESTITE_SHARD.get());

    }
}

