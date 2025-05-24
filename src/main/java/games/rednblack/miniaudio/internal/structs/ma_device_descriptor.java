package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_device_id;
import games.rednblack.miniaudio.internal.enums.ma_share_mode;
import games.rednblack.miniaudio.internal.enums.ma_format;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;

public final class ma_device_descriptor extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(115).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_device_descriptor(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_device_descriptor(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_device_descriptor() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_device_descriptor.ma_device_descriptorPointer asPointer() {
        return new ma_device_descriptor.ma_device_descriptorPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_device_descriptor.ma_device_descriptorPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_device_id.ma_device_idPointer pDeviceID() {
        return new ma_device_id.ma_device_idPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pDeviceID(ma_device_id.ma_device_idPointer pDeviceID) {
        getBufPtr().setNativePointer(0, pDeviceID.getPointer());
    }

    public ma_share_mode shareMode() {
        return ma_share_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4));
    }

    public void shareMode(ma_share_mode shareMode) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, shareMode.getIndex());
    }

    public ma_format format() {
        return ma_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 12 : 8));
    }

    public void format(ma_format format) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 12 : 8, format.getIndex());
    }

    public long channels() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 16 : 12);
    }

    public void channels(long channels) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 16 : 12, channels);
    }

    public long sampleRate() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 20 : 16);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 20 : 16, sampleRate);
    }

    public UBytePointer channelMap() {
        return new UBytePointer(getPointer() + (CHandler.IS_64_BIT ? 24 : 20), false, 254);
    }

    public void channelMap(UBytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 24 : 20), 254, this);
    }

    public UBytePointer getChannelMap() {
        return new UBytePointer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 24 : 20, 254), false, 254);
    }

    public void getChannelMap(UBytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 24 : 20, 254);
    }

    public void setChannelMap(UBytePointer toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 24 : 20, toCopyFrom.getBufPtr(), 0, 254);
    }

    public long periodSizeInFrames() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 280 : 276);
    }

    public void periodSizeInFrames(long periodSizeInFrames) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 280 : 276, periodSizeInFrames);
    }

    public long periodSizeInMilliseconds() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 284 : 280);
    }

    public void periodSizeInMilliseconds(long periodSizeInMilliseconds) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 284 : 280, periodSizeInMilliseconds);
    }

    public long periodCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 288 : 284);
    }

    public void periodCount(long periodCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 288 : 284, periodCount);
    }

    public static final class ma_device_descriptorPointer extends StackElementPointer<ma_device_descriptor> {

        public ma_device_descriptorPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_device_descriptorPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_device_descriptorPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_device_descriptorPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_device_descriptorPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_device_descriptorPointer() {
            this(1, true);
        }

        public ma_device_descriptorPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_device_descriptor createStackElement(long ptr, boolean freeOnGC) {
            return new ma_device_descriptor(ptr, freeOnGC);
        }
    }
}
