package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_delay_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(110).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_delay_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_delay_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_delay_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_delay_config.ma_delay_configPointer asPointer() {
        return new ma_delay_config.ma_delay_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_delay_config.ma_delay_configPointer ptr) {
        ptr.setPointer(this);
    }

    public long channels() {
        return getBufPtr().getUInt(0);
    }

    public void channels(long channels) {
        getBufPtr().setUInt(0, channels);
    }

    public long sampleRate() {
        return getBufPtr().getUInt(4);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt(4, sampleRate);
    }

    public long delayInFrames() {
        return getBufPtr().getUInt(8);
    }

    public void delayInFrames(long delayInFrames) {
        getBufPtr().setUInt(8, delayInFrames);
    }

    public long delayStart() {
        return getBufPtr().getUInt(12);
    }

    public void delayStart(long delayStart) {
        getBufPtr().setUInt(12, delayStart);
    }

    public float wet() {
        return getBufPtr().getFloat(16);
    }

    public void wet(float wet) {
        getBufPtr().setFloat(16, wet);
    }

    public float dry() {
        return getBufPtr().getFloat(20);
    }

    public void dry(float dry) {
        getBufPtr().setFloat(20, dry);
    }

    public float decay() {
        return getBufPtr().getFloat(24);
    }

    public void decay(float decay) {
        getBufPtr().setFloat(24, decay);
    }

    public static final class ma_delay_configPointer extends StackElementPointer<ma_delay_config> {

        public ma_delay_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_delay_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_delay_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_delay_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_delay_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_delay_configPointer() {
            this(1, true);
        }

        public ma_delay_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_delay_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_delay_config(ptr, freeOnGC);
        }
    }
}
