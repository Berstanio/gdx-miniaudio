package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;
import games.rednblack.miniaudio.internal.enums.ma_channel_mix_mode;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;

public final class ma_channel_converter_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(94).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_channel_converter_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_channel_converter_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_channel_converter_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_channel_converter_config.ma_channel_converter_configPointer asPointer() {
        return new ma_channel_converter_config.ma_channel_converter_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_channel_converter_config.ma_channel_converter_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_format format() {
        return ma_format.getByIndex((int) getBufPtr().getUInt(0));
    }

    public void format(ma_format format) {
        getBufPtr().setUInt(0, format.getIndex());
    }

    public long channelsIn() {
        return getBufPtr().getUInt(4);
    }

    public void channelsIn(long channelsIn) {
        getBufPtr().setUInt(4, channelsIn);
    }

    public long channelsOut() {
        return getBufPtr().getUInt(8);
    }

    public void channelsOut(long channelsOut) {
        getBufPtr().setUInt(8, channelsOut);
    }

    public UBytePointer pChannelMapIn() {
        return new UBytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false);
    }

    public void pChannelMapIn(UBytePointer pChannelMapIn) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 12, pChannelMapIn.getPointer());
    }

    public UBytePointer pChannelMapOut() {
        return new UBytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 16), false);
    }

    public void pChannelMapOut(UBytePointer pChannelMapOut) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 16, pChannelMapOut.getPointer());
    }

    public ma_channel_mix_mode mixingMode() {
        return ma_channel_mix_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 32 : 20));
    }

    public void mixingMode(ma_channel_mix_mode mixingMode) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 32 : 20, mixingMode.getIndex());
    }

    public long calculateLFEFromSpatialChannels() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 36 : 24);
    }

    public void calculateLFEFromSpatialChannels(long calculateLFEFromSpatialChannels) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 36 : 24, calculateLFEFromSpatialChannels);
    }

    public PointerPointer<FloatPointer> ppWeights() {
        return new PointerPointer<>(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 28), false, FloatPointer::new);
    }

    public void ppWeights(PointerPointer<FloatPointer> ppWeights) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 28, ppWeights.getPointer());
    }

    public static final class ma_channel_converter_configPointer extends StackElementPointer<ma_channel_converter_config> {

        public ma_channel_converter_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_channel_converter_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_channel_converter_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_channel_converter_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_channel_converter_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_channel_converter_configPointer() {
            this(1, true);
        }

        public ma_channel_converter_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_channel_converter_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_channel_converter_config(ptr, freeOnGC);
        }
    }
}
