package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;

public final class ma_audio_buffer_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(79).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_audio_buffer_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_audio_buffer_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_audio_buffer_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_audio_buffer_config.ma_audio_buffer_configPointer asPointer() {
        return new ma_audio_buffer_config.ma_audio_buffer_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_audio_buffer_config.ma_audio_buffer_configPointer ptr) {
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

    public long sizeInFrames() {
        return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16);
    }

    public void sizeInFrames(long sizeInFrames) {
        getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16, sizeInFrames);
    }

    public VoidPointer pData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24), false);
    }

    public void pData(VoidPointer pData) {
        getBufPtr().setNativePointer(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24, pData.getPointer());
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 24 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : 28), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 24 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : 28), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 24 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : 28, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 24 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : 28, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 24 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : 28, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public static final class ma_audio_buffer_configPointer extends StackElementPointer<ma_audio_buffer_config> {

        public ma_audio_buffer_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_audio_buffer_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_audio_buffer_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_audio_buffer_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_audio_buffer_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_audio_buffer_configPointer() {
            this(1, true);
        }

        public ma_audio_buffer_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_audio_buffer_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_audio_buffer_config(ptr, freeOnGC);
        }
    }
}
