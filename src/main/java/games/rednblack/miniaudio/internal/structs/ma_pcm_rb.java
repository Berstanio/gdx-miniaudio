package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_data_source_base;
import games.rednblack.miniaudio.internal.structs.ma_rb;
import games.rednblack.miniaudio.internal.enums.ma_format;

public final class ma_pcm_rb extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(184).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_pcm_rb(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_pcm_rb(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_pcm_rb() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_pcm_rb.ma_pcm_rbPointer asPointer() {
        return new ma_pcm_rb.ma_pcm_rbPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_pcm_rb.ma_pcm_rbPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_data_source_base ds() {
        return new ma_data_source_base(getPointer(), false);
    }

    public void ds(ma_data_source_base toSetPtr) {
        toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, this);
    }

    public ma_data_source_base getDs() {
        return new ma_data_source_base(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), true);
    }

    public void getDs(ma_data_source_base toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56);
    }

    public void setDs(ma_data_source_base toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56);
    }

    public ma_rb rb() {
        return new ma_rb(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), false);
    }

    public void rb(ma_rb toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), CHandler.IS_64_BIT ? 64 : 44, this);
    }

    public ma_rb getRb() {
        return new ma_rb(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, CHandler.IS_64_BIT ? 64 : 44), true);
    }

    public void getRb(ma_rb toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, CHandler.IS_64_BIT ? 64 : 44);
    }

    public void setRb(ma_rb toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 64 : 44);
    }

    public ma_format format() {
        return ma_format.getByIndex((int) getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 100 : 136));
    }

    public void format(ma_format format) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 100 : 136, format.getIndex());
    }

    public long channels() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 104 : 140);
    }

    public void channels(long channels) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 104 : 140, channels);
    }

    public long sampleRate() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 104 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 144 : 108);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 104 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 144 : 108, sampleRate);
    }

    public static final class ma_pcm_rbPointer extends StackElementPointer<ma_pcm_rb> {

        public ma_pcm_rbPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_pcm_rbPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_pcm_rbPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_pcm_rbPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_pcm_rbPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_pcm_rbPointer() {
            this(1, true);
        }

        public ma_pcm_rbPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_pcm_rb createStackElement(long ptr, boolean freeOnGC) {
            return new ma_pcm_rb(ptr, freeOnGC);
        }
    }
}
