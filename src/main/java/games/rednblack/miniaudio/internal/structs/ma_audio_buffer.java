package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_audio_buffer_ref;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;

public final class ma_audio_buffer extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(78).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_audio_buffer(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_audio_buffer(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_audio_buffer() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_audio_buffer.ma_audio_bufferPointer asPointer() {
        return new ma_audio_buffer.ma_audio_bufferPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_audio_buffer.ma_audio_bufferPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_audio_buffer_ref ref() {
        return new ma_audio_buffer_ref(getPointer(), false);
    }

    public void ref(ma_audio_buffer_ref toSetPtr) {
        toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96, this);
    }

    public ma_audio_buffer_ref getRef() {
        return new ma_audio_buffer_ref(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96), true);
    }

    public void getRef(ma_audio_buffer_ref toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96);
    }

    public void setRef(ma_audio_buffer_ref toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96);
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public long ownsData() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 144 : 112);
    }

    public void ownsData(long ownsData) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 144 : 112, ownsData);
    }

    public UBytePointer _pExtraData() {
        return new UBytePointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 104 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 148 : 116), false, 1);
    }

    public void _pExtraData(UBytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 104 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 148 : 116), 1, this);
    }

    public UBytePointer get_pExtraData() {
        return new UBytePointer(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 104 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 148 : 116, 1), false, 1);
    }

    public void get_pExtraData(UBytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 104 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 148 : 116, 1);
    }

    public void set_pExtraData(UBytePointer toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 104 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 148 : 116, toCopyFrom.getBufPtr(), 0, 1);
    }

    public static final class ma_audio_bufferPointer extends StackElementPointer<ma_audio_buffer> {

        public ma_audio_bufferPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_audio_bufferPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_audio_bufferPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_audio_bufferPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_audio_bufferPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_audio_bufferPointer() {
            this(1, true);
        }

        public ma_audio_bufferPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_audio_buffer createStackElement(long ptr, boolean freeOnGC) {
            return new ma_audio_buffer(ptr, freeOnGC);
        }
    }
}
