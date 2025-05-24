package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer_page;

public final class ma_paged_audio_buffer_data extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(180).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_paged_audio_buffer_data(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_paged_audio_buffer_data(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_paged_audio_buffer_data() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer asPointer() {
        return new ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer ptr) {
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

    public ma_paged_audio_buffer_page head() {
        return new ma_paged_audio_buffer_page(getPointer() + (8), false);
    }

    public void head(ma_paged_audio_buffer_page toSetPtr) {
        toSetPtr.setPointer(getPointer() + (8), CHandler.IS_COMPILED_ANDROID_X86 ? 16 : 24, this);
    }

    public ma_paged_audio_buffer_page getHead() {
        return new ma_paged_audio_buffer_page(getBufPtr().duplicate(8, CHandler.IS_COMPILED_ANDROID_X86 ? 16 : 24), true);
    }

    public void getHead(ma_paged_audio_buffer_page toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, CHandler.IS_COMPILED_ANDROID_X86 ? 16 : 24);
    }

    public void setHead(ma_paged_audio_buffer_page toCopyFrom) {
        getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 16 : 24);
    }

    public ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer pTail() {
        return new ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer(getBufPtr().getNativePointer(CHandler.IS_COMPILED_ANDROID_X86 ? 24 : 32), false);
    }

    public void pTail(ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer pTail) {
        getBufPtr().setNativePointer(CHandler.IS_COMPILED_ANDROID_X86 ? 24 : 32, pTail.getPointer());
    }

    public static final class ma_paged_audio_buffer_dataPointer extends StackElementPointer<ma_paged_audio_buffer_data> {

        public ma_paged_audio_buffer_dataPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_paged_audio_buffer_dataPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_paged_audio_buffer_dataPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_paged_audio_buffer_dataPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_paged_audio_buffer_dataPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_paged_audio_buffer_dataPointer() {
            this(1, true);
        }

        public ma_paged_audio_buffer_dataPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_paged_audio_buffer_data createStackElement(long ptr, boolean freeOnGC) {
            return new ma_paged_audio_buffer_data(ptr, freeOnGC);
        }
    }
}
