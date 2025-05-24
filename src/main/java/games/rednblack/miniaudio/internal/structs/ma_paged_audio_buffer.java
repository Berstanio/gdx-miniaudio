package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_data_source_base;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer_data;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer_page;

public final class ma_paged_audio_buffer extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(178).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_paged_audio_buffer(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_paged_audio_buffer(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_paged_audio_buffer() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_paged_audio_buffer.ma_paged_audio_bufferPointer asPointer() {
        return new ma_paged_audio_buffer.ma_paged_audio_bufferPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_paged_audio_buffer.ma_paged_audio_bufferPointer ptr) {
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

    public ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData() {
        return new ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), false);
    }

    public void pData(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, pData.getPointer());
    }

    public ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer pCurrent() {
        return new ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 60), false);
    }

    public void pCurrent(ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer pCurrent) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 60, pCurrent.getPointer());
    }

    public long relativeCursor() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88);
    }

    public void relativeCursor(long relativeCursor) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88, relativeCursor);
    }

    public long absoluteCursor() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 68 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 96 : 72);
    }

    public void absoluteCursor(long absoluteCursor) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 68 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 96 : 72, absoluteCursor);
    }

    public static final class ma_paged_audio_bufferPointer extends StackElementPointer<ma_paged_audio_buffer> {

        public ma_paged_audio_bufferPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_paged_audio_bufferPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_paged_audio_bufferPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_paged_audio_bufferPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_paged_audio_bufferPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_paged_audio_bufferPointer() {
            this(1, true);
        }

        public ma_paged_audio_bufferPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_paged_audio_buffer createStackElement(long ptr, boolean freeOnGC) {
            return new ma_paged_audio_buffer(ptr, freeOnGC);
        }
    }
}
