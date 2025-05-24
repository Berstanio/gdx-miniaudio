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
import games.rednblack.miniaudio.internal.enums.ma_dither_mode;
import games.rednblack.miniaudio.internal.structs.ma_resampler_config;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import games.rednblack.miniaudio.internal.enums.ma_encoding_format;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import games.rednblack.miniaudio.internal.structs.ma_decoding_backend_vtable;

public final class ma_decoder_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(105).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_decoder_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_decoder_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_decoder_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_decoder_config.ma_decoder_configPointer asPointer() {
        return new ma_decoder_config.ma_decoder_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_decoder_config.ma_decoder_configPointer ptr) {
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

    public UBytePointer pChannelMap() {
        return new UBytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false);
    }

    public void pChannelMap(UBytePointer pChannelMap) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 12, pChannelMap.getPointer());
    }

    public ma_channel_mix_mode channelMixMode() {
        return ma_channel_mix_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 24 : 16));
    }

    public void channelMixMode(ma_channel_mix_mode channelMixMode) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 24 : 16, channelMixMode.getIndex());
    }

    public ma_dither_mode ditherMode() {
        return ma_dither_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 28 : 20));
    }

    public void ditherMode(ma_dither_mode ditherMode) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 28 : 20, ditherMode.getIndex());
    }

    public ma_resampler_config resampling() {
        return new ma_resampler_config(getPointer() + (CHandler.IS_64_BIT ? 32 : 24), false);
    }

    public void resampling(ma_resampler_config toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 32 : 24), CHandler.IS_64_BIT ? 48 : 32, this);
    }

    public ma_resampler_config getResampling() {
        return new ma_resampler_config(getBufPtr().duplicate(CHandler.IS_64_BIT ? 32 : 24, CHandler.IS_64_BIT ? 48 : 32), true);
    }

    public void getResampling(ma_resampler_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 32 : 24, CHandler.IS_64_BIT ? 48 : 32);
    }

    public void setResampling(ma_resampler_config toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 32 : 24, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 48 : 32);
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer() + (CHandler.IS_64_BIT ? 80 : 56), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 80 : 56), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate(CHandler.IS_64_BIT ? 80 : 56, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 80 : 56, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 80 : 56, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public ma_encoding_format encodingFormat() {
        return ma_encoding_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 112 : 72));
    }

    public void encodingFormat(ma_encoding_format encodingFormat) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 112 : 72, encodingFormat.getIndex());
    }

    public long seekPointCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 116 : 76);
    }

    public void seekPointCount(long seekPointCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 116 : 76, seekPointCount);
    }

    public PointerPointer<ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer> ppCustomBackendVTables() {
        return new PointerPointer<>(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 120 : 80), false, ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer::new);
    }

    public void ppCustomBackendVTables(PointerPointer<ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer> ppCustomBackendVTables) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 120 : 80, ppCustomBackendVTables.getPointer());
    }

    public long customBackendCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 128 : 84);
    }

    public void customBackendCount(long customBackendCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 128 : 84, customBackendCount);
    }

    public VoidPointer pCustomBackendUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 136 : 88), false);
    }

    public void pCustomBackendUserData(VoidPointer pCustomBackendUserData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 136 : 88, pCustomBackendUserData.getPointer());
    }

    public static final class ma_decoder_configPointer extends StackElementPointer<ma_decoder_config> {

        public ma_decoder_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_decoder_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_decoder_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_decoder_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_decoder_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_decoder_configPointer() {
            this(1, true);
        }

        public ma_decoder_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_decoder_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_decoder_config(ptr, freeOnGC);
        }
    }
}
