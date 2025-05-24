package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;

public final class ma_fader_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(130).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_fader_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_fader_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_fader_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_fader_config.ma_fader_configPointer asPointer() {
        return new ma_fader_config.ma_fader_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_fader_config.ma_fader_configPointer ptr) {
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

    public static final class ma_fader_configPointer extends StackElementPointer<ma_fader_config> {

        public ma_fader_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_fader_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_fader_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_fader_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_fader_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_fader_configPointer() {
            this(1, true);
        }

        public ma_fader_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_fader_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_fader_config(ptr, freeOnGC);
        }
    }
}
