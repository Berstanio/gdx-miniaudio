package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;

/**
 * **********************************************************************************************************************************************************
 * High-Pass Filtering
 * ***********************************************************************************************************************************************************
 */
public final class ma_hpf1_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(141).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_hpf1_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_hpf1_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_hpf1_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_hpf1_config.ma_hpf1_configPointer asPointer() {
        return new ma_hpf1_config.ma_hpf1_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_hpf1_config.ma_hpf1_configPointer ptr) {
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

    public double cutoffFrequency() {
        return getBufPtr().getDouble(CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16);
    }

    public void cutoffFrequency(double cutoffFrequency) {
        getBufPtr().setDouble(CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16, cutoffFrequency);
    }

    public double q() {
        return getBufPtr().getDouble(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24);
    }

    public void q(double q) {
        getBufPtr().setDouble(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24, q);
    }

    public static final class ma_hpf1_configPointer extends StackElementPointer<ma_hpf1_config> {

        public ma_hpf1_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_hpf1_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_hpf1_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_hpf1_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_hpf1_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_hpf1_configPointer() {
            this(1, true);
        }

        public ma_hpf1_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_hpf1_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_hpf1_config(ptr, freeOnGC);
        }
    }
}
