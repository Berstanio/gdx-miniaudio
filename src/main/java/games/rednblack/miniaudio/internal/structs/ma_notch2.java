package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_biquad;

public final class ma_notch2 extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(174).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_notch2(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_notch2(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_notch2() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_notch2.ma_notch2Pointer asPointer() {
        return new ma_notch2.ma_notch2Pointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_notch2.ma_notch2Pointer ptr) {
        ptr.setPointer(this);
    }

    public ma_biquad bq() {
        return new ma_biquad(getPointer(), false);
    }

    public void bq(ma_biquad toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 64 : 44, this);
    }

    public ma_biquad getBq() {
        return new ma_biquad(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 64 : 44), true);
    }

    public void getBq(ma_biquad toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 64 : 44);
    }

    public void setBq(ma_biquad toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 64 : 44);
    }

    public static final class ma_notch2Pointer extends StackElementPointer<ma_notch2> {

        public ma_notch2Pointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_notch2Pointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_notch2Pointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_notch2Pointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_notch2Pointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_notch2Pointer() {
            this(1, true);
        }

        public ma_notch2Pointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_notch2 createStackElement(long ptr, boolean freeOnGC) {
            return new ma_notch2(ptr, freeOnGC);
        }
    }
}
