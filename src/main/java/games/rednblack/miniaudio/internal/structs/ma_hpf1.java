package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_biquad_coefficient;

public final class ma_hpf1 extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(140).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_hpf1(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_hpf1(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_hpf1() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_hpf1.ma_hpf1Pointer asPointer() {
        return new ma_hpf1.ma_hpf1Pointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_hpf1.ma_hpf1Pointer ptr) {
        ptr.setPointer(this);
    }

    public ma_format format() {
        return ma_format.getByIndex((int) getBufPtr().getUInt(0));
    }

    public void format(ma_format format) {
        getBufPtr().setUInt(0, format.getIndex());
    }

    public long channels() {
        return getBufPtr().getUInt(4);
    }

    public void channels(long channels) {
        getBufPtr().setUInt(4, channels);
    }

    public ma_biquad_coefficient a() {
        return new ma_biquad_coefficient(getPointer() + (8), false);
    }

    public void a(ma_biquad_coefficient toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 4, this);
    }

    public ma_biquad_coefficient getA() {
        return new ma_biquad_coefficient(getBufPtr().duplicate(8, 4), true);
    }

    public void getA(ma_biquad_coefficient toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 4);
    }

    public void setA(ma_biquad_coefficient toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 4);
    }

    public ma_biquad_coefficient.ma_biquad_coefficientPointer pR1() {
        return new ma_biquad_coefficient.ma_biquad_coefficientPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false);
    }

    public void pR1(ma_biquad_coefficient.ma_biquad_coefficientPointer pR1) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 12, pR1.getPointer());
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 16), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 16, _pHeap.getPointer());
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 32 : 20);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 32 : 20, _ownsHeap);
    }

    public static final class ma_hpf1Pointer extends StackElementPointer<ma_hpf1> {

        public ma_hpf1Pointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_hpf1Pointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_hpf1Pointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_hpf1Pointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_hpf1Pointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_hpf1Pointer() {
            this(1, true);
        }

        public ma_hpf1Pointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_hpf1 createStackElement(long ptr, boolean freeOnGC) {
            return new ma_hpf1(ptr, freeOnGC);
        }
    }
}
