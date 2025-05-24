package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_gainer_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(134).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_gainer_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_gainer_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_gainer_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_gainer_config.ma_gainer_configPointer asPointer() {
        return new ma_gainer_config.ma_gainer_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_gainer_config.ma_gainer_configPointer ptr) {
        ptr.setPointer(this);
    }

    public long channels() {
        return getBufPtr().getUInt(0);
    }

    public void channels(long channels) {
        getBufPtr().setUInt(0, channels);
    }

    public long smoothTimeInFrames() {
        return getBufPtr().getUInt(4);
    }

    public void smoothTimeInFrames(long smoothTimeInFrames) {
        getBufPtr().setUInt(4, smoothTimeInFrames);
    }

    public static final class ma_gainer_configPointer extends StackElementPointer<ma_gainer_config> {

        public ma_gainer_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_gainer_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_gainer_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_gainer_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_gainer_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_gainer_configPointer() {
            this(1, true);
        }

        public ma_gainer_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_gainer_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_gainer_config(ptr, freeOnGC);
        }
    }
}
