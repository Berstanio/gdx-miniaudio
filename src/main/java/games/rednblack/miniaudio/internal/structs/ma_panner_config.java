package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.enums.ma_pan_mode;

public final class ma_panner_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(183).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_panner_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_panner_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_panner_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_panner_config.ma_panner_configPointer asPointer() {
        return new ma_panner_config.ma_panner_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_panner_config.ma_panner_configPointer ptr) {
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

    public ma_pan_mode mode() {
        return ma_pan_mode.getByIndex((int) getBufPtr().getUInt(8));
    }

    public void mode(ma_pan_mode mode) {
        getBufPtr().setUInt(8, mode.getIndex());
    }

    public float pan() {
        return getBufPtr().getFloat(12);
    }

    public void pan(float pan) {
        getBufPtr().setFloat(12, pan);
    }

    public static final class ma_panner_configPointer extends StackElementPointer<ma_panner_config> {

        public ma_panner_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_panner_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_panner_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_panner_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_panner_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_panner_configPointer() {
            this(1, true);
        }

        public ma_panner_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_panner_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_panner_config(ptr, freeOnGC);
        }
    }
}
