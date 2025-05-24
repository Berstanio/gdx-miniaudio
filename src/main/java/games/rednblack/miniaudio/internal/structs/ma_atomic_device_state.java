package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_device_state;

public final class ma_atomic_device_state extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(74).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_atomic_device_state(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_atomic_device_state(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_atomic_device_state() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_atomic_device_state.ma_atomic_device_statePointer asPointer() {
        return new ma_atomic_device_state.ma_atomic_device_statePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_atomic_device_state.ma_atomic_device_statePointer ptr) {
        ptr.setPointer(this);
    }

    public ma_device_state value() {
        return ma_device_state.getByIndex((int) getBufPtr().getUInt(0));
    }

    public void value(ma_device_state value) {
        getBufPtr().setUInt(0, value.getIndex());
    }

    public static final class ma_atomic_device_statePointer extends StackElementPointer<ma_atomic_device_state> {

        public ma_atomic_device_statePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_atomic_device_statePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_atomic_device_statePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_atomic_device_statePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_atomic_device_statePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_atomic_device_statePointer() {
            this(1, true);
        }

        public ma_atomic_device_statePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_atomic_device_state createStackElement(long ptr, boolean freeOnGC) {
            return new ma_atomic_device_state(ptr, freeOnGC);
        }
    }
}
