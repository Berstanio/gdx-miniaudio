package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;
import games.rednblack.miniaudio.internal.enums.ma_dither_mode;
import games.rednblack.miniaudio.internal.enums.ma_channel_mix_mode;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;
import games.rednblack.miniaudio.internal.structs.ma_resampler_config;

/**
 * **********************************************************************************************************************************************************
 * Data Conversion
 * ***********************************************************************************************************************************************************
 */
public final class ma_data_converter_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(98).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_data_converter_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_data_converter_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_data_converter_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_data_converter_config.ma_data_converter_configPointer asPointer() {
        return new ma_data_converter_config.ma_data_converter_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_data_converter_config.ma_data_converter_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_format formatIn() {
        return ma_format.getByIndex((int) getBufPtr().getUInt(0));
    }

    public void formatIn(ma_format formatIn) {
        getBufPtr().setUInt(0, formatIn.getIndex());
    }

    public ma_format formatOut() {
        return ma_format.getByIndex((int) getBufPtr().getUInt(4));
    }

    public void formatOut(ma_format formatOut) {
        getBufPtr().setUInt(4, formatOut.getIndex());
    }

    public long channelsIn() {
        return getBufPtr().getUInt(8);
    }

    public void channelsIn(long channelsIn) {
        getBufPtr().setUInt(8, channelsIn);
    }

    public long channelsOut() {
        return getBufPtr().getUInt(12);
    }

    public void channelsOut(long channelsOut) {
        getBufPtr().setUInt(12, channelsOut);
    }

    public long sampleRateIn() {
        return getBufPtr().getUInt(16);
    }

    public void sampleRateIn(long sampleRateIn) {
        getBufPtr().setUInt(16, sampleRateIn);
    }

    public long sampleRateOut() {
        return getBufPtr().getUInt(20);
    }

    public void sampleRateOut(long sampleRateOut) {
        getBufPtr().setUInt(20, sampleRateOut);
    }

    public UBytePointer pChannelMapIn() {
        return new UBytePointer(getBufPtr().getNativePointer(24), false);
    }

    public void pChannelMapIn(UBytePointer pChannelMapIn) {
        getBufPtr().setNativePointer(24, pChannelMapIn.getPointer());
    }

    public UBytePointer pChannelMapOut() {
        return new UBytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 28), false);
    }

    public void pChannelMapOut(UBytePointer pChannelMapOut) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 28, pChannelMapOut.getPointer());
    }

    public ma_dither_mode ditherMode() {
        return ma_dither_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 40 : 32));
    }

    public void ditherMode(ma_dither_mode ditherMode) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 40 : 32, ditherMode.getIndex());
    }

    public ma_channel_mix_mode channelMixMode() {
        return ma_channel_mix_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 44 : 36));
    }

    public void channelMixMode(ma_channel_mix_mode channelMixMode) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 44 : 36, channelMixMode.getIndex());
    }

    public long calculateLFEFromSpatialChannels() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 48 : 40);
    }

    public void calculateLFEFromSpatialChannels(long calculateLFEFromSpatialChannels) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 48 : 40, calculateLFEFromSpatialChannels);
    }

    public PointerPointer<FloatPointer> ppChannelWeights() {
        return new PointerPointer<>(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 56 : 44), false, FloatPointer::new);
    }

    public void ppChannelWeights(PointerPointer<FloatPointer> ppChannelWeights) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 56 : 44, ppChannelWeights.getPointer());
    }

    public long allowDynamicSampleRate() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 64 : 48);
    }

    public void allowDynamicSampleRate(long allowDynamicSampleRate) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 64 : 48, allowDynamicSampleRate);
    }

    public ma_resampler_config resampling() {
        return new ma_resampler_config(getPointer() + (CHandler.IS_64_BIT ? 72 : 52), false);
    }

    public void resampling(ma_resampler_config toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 72 : 52), CHandler.IS_64_BIT ? 48 : 32, this);
    }

    public ma_resampler_config getResampling() {
        return new ma_resampler_config(getBufPtr().duplicate(CHandler.IS_64_BIT ? 72 : 52, CHandler.IS_64_BIT ? 48 : 32), true);
    }

    public void getResampling(ma_resampler_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 72 : 52, CHandler.IS_64_BIT ? 48 : 32);
    }

    public void setResampling(ma_resampler_config toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 72 : 52, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 48 : 32);
    }

    public static final class ma_data_converter_configPointer extends StackElementPointer<ma_data_converter_config> {

        public ma_data_converter_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_data_converter_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_data_converter_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_data_converter_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_data_converter_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_data_converter_configPointer() {
            this(1, true);
        }

        public ma_data_converter_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_data_converter_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_data_converter_config(ptr, freeOnGC);
        }
    }
}
