package net.yeoxuhang.geodeplus.common.registry;

import net.yeoxuhang.geodeplus.common.block.entity.CelestitePedestalBlockEntity;
import net.yeoxuhang.geodeplus.common.block.entity.WrappistPedestalBlockEntity;
import net.yeoxuhang.geodeplus.platform.BlockEntityTypeHelper;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class GeodePlusBlockEntityRegistry {
    public static final Supplier<BlockEntityType<WrappistPedestalBlockEntity>> WRAPPIST_PEDESTAL_ENTITY = BlockEntityTypeHelper.createWrappistPedastle();
    public static final Supplier<BlockEntityType<CelestitePedestalBlockEntity>> CELESTITE_PEDESTAL_ENTITY = BlockEntityTypeHelper.createCelestitePedastle();

    public static void initialize() {
    }
}
