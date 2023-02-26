package net.yeoxuhang.geodeplus.forge.datagen;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusItemsRegistry;
import net.yeoxuhang.geodeplus.platform.forge.RegistryHelperImpl;

public class GeodePlusBlockLootTableProvider extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get());
        this.dropSelf(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL_BLOCK.get());
        this.dropSelf(GeodePlusBlocksRegistry.EMERALD_CLUSTER_BLOCK.get());
        this.dropSelf(GeodePlusBlocksRegistry.LAPIS_CLUSTER_BLOCK.get());
        this.dropSelf(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL_BLOCK.get());
        this.dropSelf(GeodePlusBlocksRegistry.CELESTINE_CLUSTER_BLOCK.get());
        this.dropSelf(GeodePlusBlocksRegistry.GALCITE.get());
        this.dropSelf(GeodePlusBlocksRegistry.WRAPPIST_BLOCK.get());
        this.dropSelf(GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get());
        this.dropSelf(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL_BLOCK.get());
        this.dropSelf(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get());
        this.dropSelf(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER_BLOCK.get());
        this.dropSelf(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER_BLOCK.get());
        this.add(GeodePlusBlocksRegistry.SMOOTH_END_STONE.get(), (arg) -> createSingleItemTableWithSilkTouch(arg, Blocks.END_STONE));
        this.dropSelf(GeodePlusBlocksRegistry.SMOOTH_END_STONE_STAIRS.get());
        this.dropSelf(GeodePlusBlocksRegistry.SMOOTH_END_STONE_WALL.get());
        this.add(GeodePlusBlocksRegistry.ECHO_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.ECHO_SHARD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.ECHO_SHARD)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        this.add(GeodePlusBlocksRegistry.GOLD_NUGGET_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.GOLD_NUGGET)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.GOLD_NUGGET)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        /**this.add(GeodePlusBlocksRegistry.ECHO_CRYSTAL.get(),
         (block) -> createOreDrop(block, Items.ECHO_SHARD));**/
        this.add(GeodePlusBlocksRegistry.QUARTZ_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.QUARTZ)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.QUARTZ)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3.0F)))))));
        this.add(GeodePlusBlocksRegistry.WRAPPIST_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(GeodePlusItemsRegistry.WRAPPIST_SHARD.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(GeodePlusItemsRegistry.WRAPPIST_SHARD.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        this.add(GeodePlusBlocksRegistry.GLOWSTONE_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.GLOWSTONE_DUST)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.GLOWSTONE_DUST)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        this.add(GeodePlusBlocksRegistry.LAPIS_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.LAPIS_LAZULI)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        this.add(GeodePlusBlocksRegistry.REDSTONE_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.REDSTONE)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(6F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.REDSTONE)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3.0F)))))));
        this.add(GeodePlusBlocksRegistry.EMERALD_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.EMERALD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.EMERALD)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        this.add(GeodePlusBlocksRegistry.DIAMOND_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.DIAMOND)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.DIAMOND)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));

        this.add(GeodePlusBlocksRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.NETHERITE_SCRAP)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.NETHERITE_SCRAP)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        this.add(GeodePlusBlocksRegistry.PRISMARINE_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.PRISMARINE_SHARD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.PRISMARINE_SHARD)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        this.add(GeodePlusBlocksRegistry.CELESTINE_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(GeodePlusItemsRegistry.CELESTITE_SHARD.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(GeodePlusItemsRegistry.CELESTITE_SHARD.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));

        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_QUARTZ_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_ECHO_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_GLOWSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_WRAPPIST_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_GOLD_NUGGET_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_LAPIS_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_REDSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_EMERALD_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_DIAMOND_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_ANCIENT_DEBRIS_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_PRISMARINE_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.LARGE_CELESTINE_BUD.get());

        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_QUARTZ_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_ECHO_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_GLOWSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_WRAPPIST_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_GOLD_NUGGET_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_LAPIS_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_REDSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_EMERALD_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_DIAMOND_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_PRISMARINE_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.MEDIUM_CELESTINE_BUD.get());

        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_QUARTZ_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_ECHO_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_GLOWSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_WRAPPIST_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_GOLD_NUGGET_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_LAPIS_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_REDSTONE_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_EMERALD_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_DIAMOND_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_ANCIENT_DEBRIS_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_PRISMARINE_BUD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.SMALL_CELESTINE_BUD.get());

        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_BASALT_GLOWSTONE.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_BASALT_QUARTZ.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_QUARTZ.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_ECHO.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_GLOWSTONE.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_NETHER_QUARTZ.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_WRAPPIST.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_GOLD_NUGGET.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_BASALT_GOLD_NUGGET.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_LAPIS.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_REDSTONE.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_EMERALD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_DIAMOND.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_LAPIS.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_REDSTONE.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_EMERALD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_DEEPSLATE_DIAMOND.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_SCULK_LAPIS.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_SCULK_REDSTONE.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_SCULK_EMERALD.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_SCULK_DIAMOND.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_ANCIENT_DEBRIS.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_PRISMARINE.get());
        this.dropWhenSilkTouch(GeodePlusBlocksRegistry.BUDDING_CELESTINE.get());

        this.add(GeodePlusBlocksRegistry.SMOOTH_END_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RegistryHelperImpl.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}


