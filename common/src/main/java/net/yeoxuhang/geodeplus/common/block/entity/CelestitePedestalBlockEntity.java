package net.yeoxuhang.geodeplus.common.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.yeoxuhang.geodeplus.common.registry.GeodePlusBlockEntityRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CelestitePedestalBlockEntity extends BlockEntity implements WorldlyContainer {
    ItemStack item;
    public int age;

    public CelestitePedestalBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(GeodePlusBlockEntityRegistry.CELESTITE_PEDESTAL_ENTITY.get(), pWorldPosition, pBlockState);
        this.item = ItemStack.EMPTY;
    }

    public int tick() {
        age++;
        return age;
    }
    @Override
    public int[] getSlotsForFace(Direction p_19238_) {
        return new int[0];
    }

    @Override
    public boolean canPlaceItemThroughFace(int p_19235_, ItemStack p_19236_, @Nullable Direction p_19237_) {
        return false;
    }

    @Override
    public boolean canTakeItemThroughFace(int p_19239_, ItemStack p_19240_, Direction p_19241_) {
        return false;
    }

    @Override
    public int getContainerSize() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return this.item.isEmpty();
    }

    @Override
    public ItemStack getItem(int i) {
        return i == 0 ? this.item : ItemStack.EMPTY;
    }

    @Override
    public ItemStack removeItem(int i, int j) {
        ItemStack item = this.removeItemNoUpdate(i);
        this.update(j);
        return item;
    }

    public void update(int j) {
        this.setChanged();
        if (this.getLevel() != null) {
            this.getLevel().sendBlockUpdated(this.getBlockPos(), this.getBlockState(), this.getBlockState(), j);
        }

    }

    @Override
    public ItemStack removeItemNoUpdate(int i) {
        if (i == 0) {
            ItemStack crystal = this.item;
            this.item = ItemStack.EMPTY;
            return crystal;
        } else {
            return ItemStack.EMPTY;
        }
    }

    @Override
    public void setItem(int i, ItemStack itemStack) {
        if (i == 0) {
            this.item = itemStack;
            this.setChanged();
        }
    }

    public void clearContent() {
        this.item = ItemStack.EMPTY;
    }


    public void load(@NotNull CompoundTag compoundTag) {
        super.load(compoundTag);
        if (compoundTag.contains("item")) {
            this.item = ItemStack.of(compoundTag.getCompound("item"));
        }

    }

    protected void saveAdditional(@NotNull CompoundTag compoundTag) {
        super.saveAdditional(compoundTag);
        if (!this.item.isEmpty()) {
            compoundTag.put("item", this.item.save(new CompoundTag()));
        }
    }

    public CompoundTag getUpdateTag() {
        CompoundTag tag = new CompoundTag();
        this.saveAdditional(tag);
        return tag;
    }

    public boolean stillValid(Player player) {
        return this.worldPosition.distSqr(player.blockPosition()) <= 16.0;
    }

    public int getMaxStackSize() {
        return 64;
    }

    public boolean Test(boolean b){
        return false;
    }
}
