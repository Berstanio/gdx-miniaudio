package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_vec3f extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(220).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_vec3f(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_vec3f(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_vec3f() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_vec3f.ma_vec3fPointer asPointer() {
        return new ma_vec3f.ma_vec3fPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_vec3f.ma_vec3fPointer ptr) {
        ptr.setPointer(this);
    }

    public float x() {
        return getBufPtr().getFloat(0);
    }

    public void x(float x) {
        getBufPtr().setFloat(0, x);
    }

    public float y() {
        return getBufPtr().getFloat(4);
    }

    public void y(float y) {
        getBufPtr().setFloat(4, y);
    }

    public float z() {
        return getBufPtr().getFloat(8);
    }

    public void z(float z) {
        getBufPtr().setFloat(8, z);
    }

    public static final class ma_vec3fPointer extends StackElementPointer<ma_vec3f> {

        public ma_vec3fPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_vec3fPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_vec3fPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_vec3fPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_vec3fPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_vec3fPointer() {
            this(1, true);
        }

        public ma_vec3fPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_vec3f createStackElement(long ptr, boolean freeOnGC) {
            return new ma_vec3f(ptr, freeOnGC);
        }
    }
}
