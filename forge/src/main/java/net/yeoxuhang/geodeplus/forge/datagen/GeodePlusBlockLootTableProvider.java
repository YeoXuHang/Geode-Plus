package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.*;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;
import net.yeoxuhang.geodeplus.platform.forge.RegistryHelperImpl;

import java.util.Set;

public class GeodePlusBlockLootTableProvider extends BlockLootSubProvider {

    public GeodePlusBlockLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.EMERALD_CLUSTER_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.CELESTITE_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.PINK_TOPAZ_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.GALCITE.get());
        dropSelf(GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get());
        dropSelf(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK.get());
        dropSelf(GeodePlusBlocksRegistry.ECHO_CRYSTAL_BLOCK.get());
        add(GeodePlusBlocksRegistry.SMOOTH_END_STONE.get(), (arg) -> createSingleItemTableWithSilkTouch(arg, Blocks.END_STONE));
        dropSelf(GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get());
        dropSelf(GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get());
        dropSelf(GeodePlusBlocksRegistry.GALCITE_STAIRS.get());
        dropSelf(GeodePlusBlocksRegistry.GALCITE_WALL.get());
        add(GeodePlusBlocksRegistry.ECHO_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.ECHO_SHARD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.ECHO_SHARD)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        add(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.GOLD_NUGGET)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.GOLD_NUGGET)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        add(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.QUARTZ)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.QUARTZ)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3.0F)))))));
        add(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(GeodePlusItemsRegistry.WRAPPIST_SHARD.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(GeodePlusItemsRegistry.WRAPPIST_SHARD.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        add(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.GLOWSTONE_DUST)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.GLOWSTONE_DUST)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        add(GeodePlusBlocksRegistry.LAPIS_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.LAPIS_LAZULI)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        add(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.REDSTONE)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(6F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.REDSTONE)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3.0F)))))));
        add(GeodePlusBlocksRegistry.EMERALD_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.EMERALD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.EMERALD)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        add(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.DIAMOND)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.DIAMOND)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));

        add(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.NETHERITE_SCRAP)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.NETHERITE_SCRAP)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        add(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.PRISMARINE_SHARD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.PRISMARINE_SHARD)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        add(GeodePlusBlocksRegistry.CELESTITE_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(GeodePlusItemsRegistry.CELESTITE_SHARD.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(GeodePlusItemsRegistry.CELESTITE_SHARD.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        add(GeodePlusBlocksRegistry.PINK_TOPAZ_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(GeodePlusItemsRegistry.PINK_TOPAZ.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(GeodePlusItemsRegistry.PINK_TOPAZ.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));


        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_CELESTITE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_PINK_TOPAZ_BUD.get());

        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_CELESTITE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_PINK_TOPAZ_BUD.get());

        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_CELESTITE_BUD.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_PINK_TOPAZ_BUD.get());

        add(GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_ECHO.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_GLOWSTONE.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_LAPIS.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_REDSTONE.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_EMERALD.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_DIAMOND.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_PRISMARINE.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_CELESTITE.get(), noDrop());
        add(GeodePlusBlocksRegistry.BUDDING_PINK_TOPAZ.get(), noDrop());
        registerSlab(GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get());
        registerSlab(GeodePlusBlocksRegistry.GALCITE_SLAB.get());

        dropWhenSilkTouch(GeodePlusBlocksRegistry.WRAPPIST_GLASS.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.CELESTITE_GLASS.get());
        dropWhenSilkTouch(GeodePlusBlocksRegistry.PINK_TOPAZ_GLASS.get());
    }

    private void registerSlab(Block b) {
        add(b, createSlabItemTable(b));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RegistryHelperImpl.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}


