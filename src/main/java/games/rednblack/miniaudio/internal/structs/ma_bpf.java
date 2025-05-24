package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_bpf2;

public final class ma_bpf extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(87).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_bpf(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_bpf(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_bpf() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_bpf.ma_bpfPointer asPointer() {
        return new ma_bpf.ma_bpfPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_bpf.ma_bpfPointer ptr) {
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

    public long bpf2Count() {
        return getBufPtr().getUInt(8);
    }

    public void bpf2Count(long bpf2Count) {
        getBufPtr().setUInt(8, bpf2Count);
    }

    public ma_bpf2.ma_bpf2Pointer pBPF2() {
        return new ma_bpf2.ma_bpf2Pointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false);
    }

    public void pBPF2(ma_bpf2.ma_bpf2Pointer pBPF2) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 12, pBPF2.getPointer());
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

    public static final class ma_bpfPointer extends StackElementPointer<ma_bpf> {

        public ma_bpfPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_bpfPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_bpfPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_bpfPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_bpfPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_bpfPointer() {
            this(1, true);
        }

        public ma_bpfPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_bpf createStackElement(long ptr, boolean freeOnGC) {
            return new ma_bpf(ptr, freeOnGC);
        }
    }
}
