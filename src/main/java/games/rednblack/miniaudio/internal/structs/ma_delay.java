package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_delay_config;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;

public final class ma_delay extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(109).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_delay(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_delay(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_delay() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_delay.ma_delayPointer asPointer() {
        return new ma_delay.ma_delayPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_delay.ma_delayPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_delay_config config() {
        return new ma_delay_config(getPointer(), false);
    }

    public void config(ma_delay_config toSetPtr) {
        toSetPtr.setPointer(getPointer(), 28, this);
    }

    public ma_delay_config getConfig() {
        return new ma_delay_config(getBufPtr().duplicate(0, 28), true);
    }

    public void getConfig(ma_delay_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 28);
    }

    public void setConfig(ma_delay_config toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 28);
    }

    public long cursor() {
        return getBufPtr().getUInt(28);
    }

    public void cursor(long cursor) {
        getBufPtr().setUInt(28, cursor);
    }

    public long bufferSizeInFrames() {
        return getBufPtr().getUInt(32);
    }

    public void bufferSizeInFrames(long bufferSizeInFrames) {
        getBufPtr().setUInt(32, bufferSizeInFrames);
    }

    public FloatPointer pBuffer() {
        return new FloatPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 36), false);
    }

    public void pBuffer(FloatPointer pBuffer) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 36, pBuffer.getPointer());
    }

    public static final class ma_delayPointer extends StackElementPointer<ma_delay> {

        public ma_delayPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_delayPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_delayPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_delayPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_delayPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_delayPointer() {
            this(1, true);
        }

        public ma_delayPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_delay createStackElement(long ptr, boolean freeOnGC) {
            return new ma_delay(ptr, freeOnGC);
        }
    }
}
