package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_lpf1;
import games.rednblack.miniaudio.internal.structs.ma_lpf2;

public final class ma_lpf extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(158).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_lpf(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_lpf(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_lpf() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_lpf.ma_lpfPointer asPointer() {
        return new ma_lpf.ma_lpfPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_lpf.ma_lpfPointer ptr) {
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

    public long sampleRate() {
        return getBufPtr().getUInt(8);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt(8, sampleRate);
    }

    public long lpf1Count() {
        return getBufPtr().getUInt(12);
    }

    public void lpf1Count(long lpf1Count) {
        getBufPtr().setUInt(12, lpf1Count);
    }

    public long lpf2Count() {
        return getBufPtr().getUInt(16);
    }

    public void lpf2Count(long lpf2Count) {
        getBufPtr().setUInt(16, lpf2Count);
    }

    public ma_lpf1.ma_lpf1Pointer pLPF1() {
        return new ma_lpf1.ma_lpf1Pointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 20), false);
    }

    public void pLPF1(ma_lpf1.ma_lpf1Pointer pLPF1) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 20, pLPF1.getPointer());
    }

    public ma_lpf2.ma_lpf2Pointer pLPF2() {
        return new ma_lpf2.ma_lpf2Pointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 24), false);
    }

    public void pLPF2(ma_lpf2.ma_lpf2Pointer pLPF2) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 24, pLPF2.getPointer());
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 28), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 28, _pHeap.getPointer());
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 48 : 32);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 48 : 32, _ownsHeap);
    }

    public static final class ma_lpfPointer extends StackElementPointer<ma_lpf> {

        public ma_lpfPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_lpfPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_lpfPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_lpfPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_lpfPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_lpfPointer() {
            this(1, true);
        }

        public ma_lpfPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_lpf createStackElement(long ptr, boolean freeOnGC) {
            return new ma_lpf(ptr, freeOnGC);
        }
    }
}
