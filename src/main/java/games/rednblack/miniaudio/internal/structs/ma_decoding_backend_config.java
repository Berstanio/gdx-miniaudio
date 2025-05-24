package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;

public final class ma_decoding_backend_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(106).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_decoding_backend_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_decoding_backend_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_decoding_backend_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_decoding_backend_config.ma_decoding_backend_configPointer asPointer() {
        return new ma_decoding_backend_config.ma_decoding_backend_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_decoding_backend_config.ma_decoding_backend_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_format preferredFormat() {
        return ma_format.getByIndex((int) getBufPtr().getUInt(0));
    }

    public void preferredFormat(ma_format preferredFormat) {
        getBufPtr().setUInt(0, preferredFormat.getIndex());
    }

    public long seekPointCount() {
        return getBufPtr().getUInt(4);
    }

    public void seekPointCount(long seekPointCount) {
        getBufPtr().setUInt(4, seekPointCount);
    }

    public static final class ma_decoding_backend_configPointer extends StackElementPointer<ma_decoding_backend_config> {

        public ma_decoding_backend_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_decoding_backend_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_decoding_backend_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_decoding_backend_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_decoding_backend_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_decoding_backend_configPointer() {
            this(1, true);
        }

        public ma_decoding_backend_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_decoding_backend_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_decoding_backend_config(ptr, freeOnGC);
        }
    }
}
