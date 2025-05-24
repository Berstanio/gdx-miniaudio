package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_slot_allocator_group;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UIntPointer;

public final class ma_slot_allocator extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(206).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_slot_allocator(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_slot_allocator(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_slot_allocator() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_slot_allocator.ma_slot_allocatorPointer asPointer() {
        return new ma_slot_allocator.ma_slot_allocatorPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_slot_allocator.ma_slot_allocatorPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_slot_allocator_group.ma_slot_allocator_groupPointer pGroups() {
        return new ma_slot_allocator_group.ma_slot_allocator_groupPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pGroups(ma_slot_allocator_group.ma_slot_allocator_groupPointer pGroups) {
        getBufPtr().setNativePointer(0, pGroups.getPointer());
    }

    public UIntPointer pSlots() {
        return new UIntPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
    }

    public void pSlots(UIntPointer pSlots) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pSlots.getPointer());
    }

    public long count() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 16 : 8);
    }

    public void count(long count) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 16 : 8, count);
    }

    public long capacity() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 20 : 12);
    }

    public void capacity(long capacity) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 20 : 12, capacity);
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 24 : 16);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 24 : 16, _ownsHeap);
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 20), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 20, _pHeap.getPointer());
    }

    public static final class ma_slot_allocatorPointer extends StackElementPointer<ma_slot_allocator> {

        public ma_slot_allocatorPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_slot_allocatorPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_slot_allocatorPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_slot_allocatorPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_slot_allocatorPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_slot_allocatorPointer() {
            this(1, true);
        }

        public ma_slot_allocatorPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_slot_allocator createStackElement(long ptr, boolean freeOnGC) {
            return new ma_slot_allocator(ptr, freeOnGC);
        }
    }
}
