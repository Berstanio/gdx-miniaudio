package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_data_source_base;
import games.rednblack.miniaudio.internal.enums.ma_format;

public final class ma_audio_buffer_ref extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(80).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_audio_buffer_ref(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_audio_buffer_ref(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_audio_buffer_ref() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_audio_buffer_ref.ma_audio_buffer_refPointer asPointer() {
        return new ma_audio_buffer_ref.ma_audio_buffer_refPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_audio_buffer_ref.ma_audio_buffer_refPointer ptr) {
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

    public ma_format format() {
        return ma_format.getByIndex((int) getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56));
    }

    public void format(ma_format format) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, format.getIndex());
    }

    public long channels() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 76 : 60);
    }

    public void channels(long channels) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 76 : 60, channels);
    }

    public long sampleRate() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64, sampleRate);
    }

    public long cursor() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 88 : 72);
    }

    public void cursor(long cursor) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 88 : 72, cursor);
    }

    public long sizeInFrames() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 72 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 96 : 80);
    }

    public void sizeInFrames(long sizeInFrames) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 72 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 96 : 80, sizeInFrames);
    }

    public VoidPointer pData() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 88), false);
    }

    public void pData(VoidPointer pData) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 88, pData.getPointer());
    }

    public static final class ma_audio_buffer_refPointer extends StackElementPointer<ma_audio_buffer_ref> {

        public ma_audio_buffer_refPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_audio_buffer_refPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_audio_buffer_refPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_audio_buffer_refPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_audio_buffer_refPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_audio_buffer_refPointer() {
            this(1, true);
        }

        public ma_audio_buffer_refPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_audio_buffer_ref createStackElement(long ptr, boolean freeOnGC) {
            return new ma_audio_buffer_ref(ptr, freeOnGC);
        }
    }
}
