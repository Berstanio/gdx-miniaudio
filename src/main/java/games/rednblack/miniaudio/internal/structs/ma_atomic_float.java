package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_atomic_float extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(75).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_atomic_float(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_atomic_float(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_atomic_float() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_atomic_float.ma_atomic_floatPointer asPointer() {
        return new ma_atomic_float.ma_atomic_floatPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_atomic_float.ma_atomic_floatPointer ptr) {
        ptr.setPointer(this);
    }

    public float value() {
        return getBufPtr().getFloat(0);
    }

    public void value(float value) {
        getBufPtr().setFloat(0, value);
    }

    public static final class ma_atomic_floatPointer extends StackElementPointer<ma_atomic_float> {

        public ma_atomic_floatPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_atomic_floatPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_atomic_floatPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_atomic_floatPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_atomic_floatPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_atomic_floatPointer() {
            this(1, true);
        }

        public ma_atomic_floatPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_atomic_float createStackElement(long ptr, boolean freeOnGC) {
            return new ma_atomic_float(ptr, freeOnGC);
        }
    }
}
