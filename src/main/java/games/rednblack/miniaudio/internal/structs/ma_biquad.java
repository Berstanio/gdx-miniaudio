package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_biquad_coefficient;

public final class ma_biquad extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(82).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_biquad(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_biquad(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_biquad() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_biquad.ma_biquadPointer asPointer() {
        return new ma_biquad.ma_biquadPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_biquad.ma_biquadPointer ptr) {
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

    public ma_biquad_coefficient b0() {
        return new ma_biquad_coefficient(getPointer() + (8), false);
    }

    public void b0(ma_biquad_coefficient toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), 4, this);
    }

    public ma_biquad_coefficient getB0() {
        return new ma_biquad_coefficient(getBufPtr().duplicate(8, 4), true);
    }

    public void getB0(ma_biquad_coefficient toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 4);
    }

    public void setB0(ma_biquad_coefficient toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 4);
    }

    public ma_biquad_coefficient b1() {
        return new ma_biquad_coefficient(getPointer() + (12), false);
    }

    public void b1(ma_biquad_coefficient toSetPtr) {
        toSetPtr.setPointer(getPointer() + (12), 4, this);
    }

    public ma_biquad_coefficient getB1() {
        return new ma_biquad_coefficient(getBufPtr().duplicate(12, 4), true);
    }

    public void getB1(ma_biquad_coefficient toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 12, 4);
    }

    public void setB1(ma_biquad_coefficient toCopyFrom) {
        getBufPtr().copyFrom(12, toCopyFrom.getBufPtr(), 0, 4);
    }

    public ma_biquad_coefficient b2() {
        return new ma_biquad_coefficient(getPointer() + (16), false);
    }

    public void b2(ma_biquad_coefficient toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), 4, this);
    }

    public ma_biquad_coefficient getB2() {
        return new ma_biquad_coefficient(getBufPtr().duplicate(16, 4), true);
    }

    public void getB2(ma_biquad_coefficient toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 4);
    }

    public void setB2(ma_biquad_coefficient toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 4);
    }

    public ma_biquad_coefficient a1() {
        return new ma_biquad_coefficient(getPointer() + (20), false);
    }

    public void a1(ma_biquad_coefficient toSetPtr) {
        toSetPtr.setPointer(getPointer() + (20), 4, this);
    }

    public ma_biquad_coefficient getA1() {
        return new ma_biquad_coefficient(getBufPtr().duplicate(20, 4), true);
    }

    public void getA1(ma_biquad_coefficient toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 20, 4);
    }

    public void setA1(ma_biquad_coefficient toCopyFrom) {
        getBufPtr().copyFrom(20, toCopyFrom.getBufPtr(), 0, 4);
    }

    public ma_biquad_coefficient a2() {
        return new ma_biquad_coefficient(getPointer() + (24), false);
    }

    public void a2(ma_biquad_coefficient toSetPtr) {
        toSetPtr.setPointer(getPointer() + (24), 4, this);
    }

    public ma_biquad_coefficient getA2() {
        return new ma_biquad_coefficient(getBufPtr().duplicate(24, 4), true);
    }

    public void getA2(ma_biquad_coefficient toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 24, 4);
    }

    public void setA2(ma_biquad_coefficient toCopyFrom) {
        getBufPtr().copyFrom(24, toCopyFrom.getBufPtr(), 0, 4);
    }

    public ma_biquad_coefficient.ma_biquad_coefficientPointer pR1() {
        return new ma_biquad_coefficient.ma_biquad_coefficientPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 28), false);
    }

    public void pR1(ma_biquad_coefficient.ma_biquad_coefficientPointer pR1) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 28, pR1.getPointer());
    }

    public ma_biquad_coefficient.ma_biquad_coefficientPointer pR2() {
        return new ma_biquad_coefficient.ma_biquad_coefficientPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 32), false);
    }

    public void pR2(ma_biquad_coefficient.ma_biquad_coefficientPointer pR2) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 32, pR2.getPointer());
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 36), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 36, _pHeap.getPointer());
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 56 : 40);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 56 : 40, _ownsHeap);
    }

    public static final class ma_biquadPointer extends StackElementPointer<ma_biquad> {

        public ma_biquadPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_biquadPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_biquadPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_biquadPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_biquadPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_biquadPointer() {
            this(1, true);
        }

        public ma_biquadPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_biquad createStackElement(long ptr, boolean freeOnGC) {
            return new ma_biquad(ptr, freeOnGC);
        }
    }
}
