package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_hpf1;
import games.rednblack.miniaudio.internal.structs.ma_hpf2;

public final class ma_hpf extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(139).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_hpf(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_hpf(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_hpf() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_hpf.ma_hpfPointer asPointer() {
        return new ma_hpf.ma_hpfPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_hpf.ma_hpfPointer ptr) {
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

    public long hpf1Count() {
        return getBufPtr().getUInt(12);
    }

    public void hpf1Count(long hpf1Count) {
        getBufPtr().setUInt(12, hpf1Count);
    }

    public long hpf2Count() {
        return getBufPtr().getUInt(16);
    }

    public void hpf2Count(long hpf2Count) {
        getBufPtr().setUInt(16, hpf2Count);
    }

    public ma_hpf1.ma_hpf1Pointer pHPF1() {
        return new ma_hpf1.ma_hpf1Pointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 20), false);
    }

    public void pHPF1(ma_hpf1.ma_hpf1Pointer pHPF1) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 20, pHPF1.getPointer());
    }

    public ma_hpf2.ma_hpf2Pointer pHPF2() {
        return new ma_hpf2.ma_hpf2Pointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 24), false);
    }

    public void pHPF2(ma_hpf2.ma_hpf2Pointer pHPF2) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 24, pHPF2.getPointer());
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

    public static final class ma_hpfPointer extends StackElementPointer<ma_hpf> {

        public ma_hpfPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_hpfPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_hpfPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_hpfPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_hpfPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_hpfPointer() {
            this(1, true);
        }

        public ma_hpfPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_hpf createStackElement(long ptr, boolean freeOnGC) {
            return new ma_hpf(ptr, freeOnGC);
        }
    }
}
