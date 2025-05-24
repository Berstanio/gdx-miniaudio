package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_fence extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(131).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_fence(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_fence(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_fence() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_fence.ma_fencePointer asPointer() {
        return new ma_fence.ma_fencePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_fence.ma_fencePointer ptr) {
        ptr.setPointer(this);
    }

    public static final class ma_fencePointer extends StackElementPointer<ma_fence> {

        public ma_fencePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_fencePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_fencePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_fencePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_fencePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_fencePointer() {
            this(1, true);
        }

        public ma_fencePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_fence createStackElement(long ptr, boolean freeOnGC) {
            return new ma_fence(ptr, freeOnGC);
        }
    }
}
