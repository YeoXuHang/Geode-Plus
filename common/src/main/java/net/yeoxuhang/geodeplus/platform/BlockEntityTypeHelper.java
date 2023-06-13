package net.yeoxuhang.geodeplus.platform;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yeoxuhang.geodeplus.common.block.entity.CelestitePedestalBlockEntity;
import net.yeoxuhang.geodeplus.common.block.entity.WrappistPedestalBlockEntity;

import java.util.function.Supplier;

public class BlockEntityTypeHelper {
    @ExpectPlatform
    public static Supplier<BlockEntityType<WrappistPedestalBlockEntity>> createWrappistPedastle() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Supplier<BlockEntityType<CelestitePedestalBlockEntity>> createCelestitePedastle() {
        throw new AssertionError();
    }
}
