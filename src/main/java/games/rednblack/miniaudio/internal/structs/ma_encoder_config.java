package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_encoding_format;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;

public final class ma_encoder_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(123).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_encoder_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_encoder_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_encoder_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_encoder_config.ma_encoder_configPointer asPointer() {
        return new ma_encoder_config.ma_encoder_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_encoder_config.ma_encoder_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_encoding_format encodingFormat() {
        return ma_encoding_format.getByIndex((int) getBufPtr().getUInt(0));
    }

    public void encodingFormat(ma_encoding_format encodingFormat) {
        getBufPtr().setUInt(0, encodingFormat.getIndex());
    }

    public ma_format format() {
        return ma_format.getByIndex((int) getBufPtr().getUInt(4));
    }

    public void format(ma_format format) {
        getBufPtr().setUInt(4, format.getIndex());
    }

    public long channels() {
        return getBufPtr().getUInt(8);
    }

    public void channels(long channels) {
        getBufPtr().setUInt(8, channels);
    }

    public long sampleRate() {
        return getBufPtr().getUInt(12);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt(12, sampleRate);
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer() + (16), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + (16), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate(16, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public static final class ma_encoder_configPointer extends StackElementPointer<ma_encoder_config> {

        public ma_encoder_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_encoder_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_encoder_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_encoder_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_encoder_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_encoder_configPointer() {
            this(1, true);
        }

        public ma_encoder_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_encoder_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_encoder_config(ptr, freeOnGC);
        }
    }
}
