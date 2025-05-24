package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_slot_allocator_group extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(208).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_slot_allocator_group(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_slot_allocator_group(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_slot_allocator_group() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_slot_allocator_group.ma_slot_allocator_groupPointer asPointer() {
        return new ma_slot_allocator_group.ma_slot_allocator_groupPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_slot_allocator_group.ma_slot_allocator_groupPointer ptr) {
        ptr.setPointer(this);
    }

    public long bitfield() {
        return getBufPtr().getUInt(0);
    }

    public void bitfield(long bitfield) {
        getBufPtr().setUInt(0, bitfield);
    }

    public static final class ma_slot_allocator_groupPointer extends StackElementPointer<ma_slot_allocator_group> {

        public ma_slot_allocator_groupPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_slot_allocator_groupPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_slot_allocator_groupPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_slot_allocator_groupPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_slot_allocator_groupPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_slot_allocator_groupPointer() {
            this(1, true);
        }

        public ma_slot_allocator_groupPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_slot_allocator_group createStackElement(long ptr, boolean freeOnGC) {
            return new ma_slot_allocator_group(ptr, freeOnGC);
        }
    }
}
