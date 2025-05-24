package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;

public final class ma_biquad_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(84).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_biquad_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_biquad_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_biquad_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_biquad_config.ma_biquad_configPointer asPointer() {
        return new ma_biquad_config.ma_biquad_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_biquad_config.ma_biquad_configPointer ptr) {
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

    public double b0() {
        return getBufPtr().getDouble(8);
    }

    public void b0(double b0) {
        getBufPtr().setDouble(8, b0);
    }

    public double b1() {
        return getBufPtr().getDouble(16);
    }

    public void b1(double b1) {
        getBufPtr().setDouble(16, b1);
    }

    public double b2() {
        return getBufPtr().getDouble(24);
    }

    public void b2(double b2) {
        getBufPtr().setDouble(24, b2);
    }

    public double a0() {
        return getBufPtr().getDouble(32);
    }

    public void a0(double a0) {
        getBufPtr().setDouble(32, a0);
    }

    public double a1() {
        return getBufPtr().getDouble(40);
    }

    public void a1(double a1) {
        getBufPtr().setDouble(40, a1);
    }

    public double a2() {
        return getBufPtr().getDouble(48);
    }

    public void a2(double a2) {
        getBufPtr().setDouble(48, a2);
    }

    public static final class ma_biquad_configPointer extends StackElementPointer<ma_biquad_config> {

        public ma_biquad_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_biquad_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_biquad_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_biquad_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_biquad_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_biquad_configPointer() {
            this(1, true);
        }

        public ma_biquad_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_biquad_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_biquad_config(ptr, freeOnGC);
        }
    }
}
