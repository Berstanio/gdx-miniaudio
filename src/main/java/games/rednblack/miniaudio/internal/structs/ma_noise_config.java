package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.enums.ma_noise_type;

public final class ma_noise_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(173).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_noise_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_noise_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_noise_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_noise_config.ma_noise_configPointer asPointer() {
        return new ma_noise_config.ma_noise_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_noise_config.ma_noise_configPointer ptr) {
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

    public ma_noise_type type() {
        return ma_noise_type.getByIndex((int) getBufPtr().getUInt(8));
    }

    public void type(ma_noise_type type) {
        getBufPtr().setUInt(8, type.getIndex());
    }

    public int seed() {
        return getBufPtr().getInt(12);
    }

    public void seed(int seed) {
        getBufPtr().setInt(12, seed);
    }

    public double amplitude() {
        return getBufPtr().getDouble(16);
    }

    public void amplitude(double amplitude) {
        getBufPtr().setDouble(16, amplitude);
    }

    public long duplicateChannels() {
        return getBufPtr().getUInt(24);
    }

    public void duplicateChannels(long duplicateChannels) {
        getBufPtr().setUInt(24, duplicateChannels);
    }

    public static final class ma_noise_configPointer extends StackElementPointer<ma_noise_config> {

        public ma_noise_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_noise_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_noise_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_noise_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_noise_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_noise_configPointer() {
            this(1, true);
        }

        public ma_noise_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_noise_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_noise_config(ptr, freeOnGC);
        }
    }
}
