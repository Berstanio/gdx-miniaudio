package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;

public final class ma_stack extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(218).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_stack(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_stack(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_stack() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_stack.ma_stackPointer asPointer() {
        return new ma_stack.ma_stackPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_stack.ma_stackPointer ptr) {
        ptr.setPointer(this);
    }

    public long offset() {
        return getBufPtr().getNativeULong(0);
    }

    public void offset(long offset) {
        getBufPtr().setNativeULong(0, offset);
    }

    public long sizeInBytes() {
        return getBufPtr().getNativeULong((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX) ? 8 : 4);
    }

    public void sizeInBytes(long sizeInBytes) {
        getBufPtr().setNativeULong((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX) ? 8 : 4, sizeInBytes);
    }

    public UBytePointer _data() {
        return new UBytePointer(getPointer() + ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX) ? 16 : 8), false, 1);
    }

    public void _data(UBytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX) ? 16 : 8), 1, this);
    }

    public UBytePointer get_data() {
        return new UBytePointer(getBufPtr().duplicate((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX) ? 16 : 8, 1), false, 1);
    }

    public void get_data(UBytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX) ? 16 : 8, 1);
    }

    public void set_data(UBytePointer toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX) ? 16 : 8, toCopyFrom.getBufPtr(), 0, 1);
    }

    public static final class ma_stackPointer extends StackElementPointer<ma_stack> {

        public ma_stackPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_stackPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_stackPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_stackPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_stackPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_stackPointer() {
            this(1, true);
        }

        public ma_stackPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_stack createStackElement(long ptr, boolean freeOnGC) {
            return new ma_stack(ptr, freeOnGC);
        }
    }
}
