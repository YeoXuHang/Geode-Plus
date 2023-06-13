package net.yeoxuhang.geodeplus.platform.fabric;

import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.common.block.entity.CelestitePedestalBlockEntity;
import net.yeoxuhang.geodeplus.common.block.entity.WrappistPedestalBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlocksRegistry;

import java.util.function.Supplier;

public class BlockEntityTypeHelperImpl {
    public static Supplier<BlockEntityType<WrappistPedestalBlockEntity>> createWrappistPedastle() {
        BlockEntityType<?> type = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(GeodePlus.MOD_ID, "wrappist_pedestal"), FabricBlockEntityTypeBuilder.create(WrappistPedestalBlockEntity::new).addBlock(GeodePlusBlocksRegistry.WRAPPIST_PEDESTAL.get()).build());
        return () -> (BlockEntityType<WrappistPedestalBlockEntity>) type;
    }

    public static Supplier<BlockEntityType<CelestitePedestalBlockEntity>> createCelestitePedastle() {
        BlockEntityType<?> type = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(GeodePlus.MOD_ID, "wrappist_pedestal"), FabricBlockEntityTypeBuilder.create(CelestitePedestalBlockEntity::new).addBlock(GeodePlusBlocksRegistry.CELESTITE_PEDESTAL.get()).build());
        return () -> (BlockEntityType<CelestitePedestalBlockEntity>) type;
    }
}
