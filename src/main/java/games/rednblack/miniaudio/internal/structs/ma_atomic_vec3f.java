package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_vec3f;

public final class ma_atomic_vec3f extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(77).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_atomic_vec3f(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_atomic_vec3f(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_atomic_vec3f() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_atomic_vec3f.ma_atomic_vec3fPointer asPointer() {
        return new ma_atomic_vec3f.ma_atomic_vec3fPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_atomic_vec3f.ma_atomic_vec3fPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_vec3f v() {
        return new ma_vec3f(getPointer(), false);
    }

    public void v(ma_vec3f toSetPtr) {
        toSetPtr.setPointer(getPointer(), 12, this);
    }

    public ma_vec3f getV() {
        return new ma_vec3f(getBufPtr().duplicate(0, 12), true);
    }

    public void getV(ma_vec3f toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 12);
    }

    public void setV(ma_vec3f toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 12);
    }

    public long lock() {
        return getBufPtr().getUInt(12);
    }

    public void lock(long lock) {
        getBufPtr().setUInt(12, lock);
    }

    public static final class ma_atomic_vec3fPointer extends StackElementPointer<ma_atomic_vec3f> {

        public ma_atomic_vec3fPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_atomic_vec3fPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_atomic_vec3fPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_atomic_vec3fPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_atomic_vec3fPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_atomic_vec3fPointer() {
            this(1, true);
        }

        public ma_atomic_vec3fPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_atomic_vec3f createStackElement(long ptr, boolean freeOnGC) {
            return new ma_atomic_vec3f(ptr, freeOnGC);
        }
    }
}
