package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer_data;

public final class ma_paged_audio_buffer_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(179).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_paged_audio_buffer_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_paged_audio_buffer_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_paged_audio_buffer_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_paged_audio_buffer_config.ma_paged_audio_buffer_configPointer asPointer() {
        return new ma_paged_audio_buffer_config.ma_paged_audio_buffer_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_paged_audio_buffer_config.ma_paged_audio_buffer_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData() {
        return new ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pData(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData) {
        getBufPtr().setNativePointer(0, pData.getPointer());
    }

    public static final class ma_paged_audio_buffer_configPointer extends StackElementPointer<ma_paged_audio_buffer_config> {

        public ma_paged_audio_buffer_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_paged_audio_buffer_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_paged_audio_buffer_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_paged_audio_buffer_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_paged_audio_buffer_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_paged_audio_buffer_configPointer() {
            this(1, true);
        }

        public ma_paged_audio_buffer_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_paged_audio_buffer_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_paged_audio_buffer_config(ptr, freeOnGC);
        }
    }
}
