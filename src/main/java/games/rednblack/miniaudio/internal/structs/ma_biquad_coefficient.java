package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

/**
 * **********************************************************************************************************************************************************
 * Biquad Filtering
 * ***********************************************************************************************************************************************************
 */
public final class ma_biquad_coefficient extends Union {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(83).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_biquad_coefficient(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_biquad_coefficient(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_biquad_coefficient() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_biquad_coefficient.ma_biquad_coefficientPointer asPointer() {
        return new ma_biquad_coefficient.ma_biquad_coefficientPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_biquad_coefficient.ma_biquad_coefficientPointer ptr) {
        ptr.setPointer(this);
    }

    public float f32() {
        return getBufPtr().getFloat(0);
    }

    public void f32(float f32) {
        getBufPtr().setFloat(0, f32);
    }

    public int s32() {
        return getBufPtr().getInt(0);
    }

    public void s32(int s32) {
        getBufPtr().setInt(0, s32);
    }

    public static final class ma_biquad_coefficientPointer extends StackElementPointer<ma_biquad_coefficient> {

        public ma_biquad_coefficientPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_biquad_coefficientPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_biquad_coefficientPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_biquad_coefficientPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_biquad_coefficientPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_biquad_coefficientPointer() {
            this(1, true);
        }

        public ma_biquad_coefficientPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_biquad_coefficient createStackElement(long ptr, boolean freeOnGC) {
            return new ma_biquad_coefficient(ptr, freeOnGC);
        }
    }
}
