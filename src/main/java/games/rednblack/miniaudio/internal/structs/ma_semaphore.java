package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_semaphore extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(205).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_semaphore(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_semaphore(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_semaphore() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_semaphore.ma_semaphorePointer asPointer() {
        return new ma_semaphore.ma_semaphorePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_semaphore.ma_semaphorePointer ptr) {
        ptr.setPointer(this);
    }

    public static final class ma_semaphorePointer extends StackElementPointer<ma_semaphore> {

        public ma_semaphorePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_semaphorePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_semaphorePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_semaphorePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_semaphorePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_semaphorePointer() {
            this(1, true);
        }

        public ma_semaphorePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_semaphore createStackElement(long ptr, boolean freeOnGC) {
            return new ma_semaphore(ptr, freeOnGC);
        }
    }
}
