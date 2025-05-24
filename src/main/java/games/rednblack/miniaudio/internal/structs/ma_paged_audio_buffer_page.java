package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer_page;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;

public final class ma_paged_audio_buffer_page extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(181).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_paged_audio_buffer_page(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_paged_audio_buffer_page(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_paged_audio_buffer_page() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer asPointer() {
        return new ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer ptr) {
        ptr.setPointer(this);
    }

    public ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer pNext() {
        return new ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer(getBufPtr().getNativePointer(0), false);
    }

    public void pNext(ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer pNext) {
        getBufPtr().setNativePointer(0, pNext.getPointer());
    }

    public long sizeInFrames() {
        return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8);
    }

    public void sizeInFrames(long sizeInFrames) {
        getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8, sizeInFrames);
    }

    public UBytePointer pAudioData() {
        return new UBytePointer(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16), false, 1);
    }

    public void pAudioData(UBytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16), 1, this);
    }

    public UBytePointer getPAudioData() {
        return new UBytePointer(getBufPtr().duplicate(CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16, 1), false, 1);
    }

    public void getPAudioData(UBytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16, 1);
    }

    public void setPAudioData(UBytePointer toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16, toCopyFrom.getBufPtr(), 0, 1);
    }

    public static final class ma_paged_audio_buffer_pagePointer extends StackElementPointer<ma_paged_audio_buffer_page> {

        public ma_paged_audio_buffer_pagePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_paged_audio_buffer_pagePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_paged_audio_buffer_pagePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_paged_audio_buffer_pagePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_paged_audio_buffer_pagePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_paged_audio_buffer_pagePointer() {
            this(1, true);
        }

        public ma_paged_audio_buffer_pagePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_paged_audio_buffer_page createStackElement(long ptr, boolean freeOnGC) {
            return new ma_paged_audio_buffer_page(ptr, freeOnGC);
        }
    }
}
