package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.enums.ma_dither_mode;
import games.rednblack.miniaudio.internal.enums.ma_data_converter_execution_path;
import games.rednblack.miniaudio.internal.structs.ma_channel_converter;
import games.rednblack.miniaudio.internal.structs.ma_resampler;

public final class ma_data_converter extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(97).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_data_converter(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_data_converter(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_data_converter() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_data_converter.ma_data_converterPointer asPointer() {
        return new ma_data_converter.ma_data_converterPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_data_converter.ma_data_converterPointer ptr) {
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

    public ma_dither_mode ditherMode() {
        return ma_dither_mode.getByIndex((int) getBufPtr().getUInt(24));
    }

    public void ditherMode(ma_dither_mode ditherMode) {
        getBufPtr().setUInt(24, ditherMode.getIndex());
    }

    public ma_data_converter_execution_path executionPath() {
        return ma_data_converter_execution_path.getByIndex((int) getBufPtr().getUInt(28));
    }

    public void executionPath(ma_data_converter_execution_path executionPath) {
        getBufPtr().setUInt(28, executionPath.getIndex());
    }

    public ma_channel_converter channelConverter() {
        return new ma_channel_converter(getPointer() + (32), false);
    }

    public void channelConverter(ma_channel_converter toSetPtr) {
        toSetPtr.setPointer(getPointer() + (32), CHandler.IS_64_BIT ? 72 : 44, this);
    }

    public ma_channel_converter getChannelConverter() {
        return new ma_channel_converter(getBufPtr().duplicate(32, CHandler.IS_64_BIT ? 72 : 44), true);
    }

    public void getChannelConverter(ma_channel_converter toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 32, CHandler.IS_64_BIT ? 72 : 44);
    }

    public void setChannelConverter(ma_channel_converter toCopyFrom) {
        getBufPtr().copyFrom(32, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 72 : 44);
    }

    public ma_resampler resampler() {
        return new ma_resampler(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104), false);
    }

    public void resampler(ma_resampler toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104), (CHandler.IS_COMPILED_ANDROID_X86) ? 132 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 192 : 144, this);
    }

    public ma_resampler getResampler() {
        return new ma_resampler(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104, (CHandler.IS_COMPILED_ANDROID_X86) ? 132 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 192 : 144), true);
    }

    public void getResampler(ma_resampler toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104, (CHandler.IS_COMPILED_ANDROID_X86) ? 132 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 192 : 144);
    }

    public void setResampler(ma_resampler toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 104, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 132 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 192 : 144);
    }

    public char hasPreFormatConversion() {
        return getBufPtr().getUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 208 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 224 : 296);
    }

    public void hasPreFormatConversion(char hasPreFormatConversion) {
        getBufPtr().setUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 208 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 224 : 296, hasPreFormatConversion);
    }

    public char hasPostFormatConversion() {
        return getBufPtr().getUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 209 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 225 : 297);
    }

    public void hasPostFormatConversion(char hasPostFormatConversion) {
        getBufPtr().setUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 209 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 225 : 297, hasPostFormatConversion);
    }

    public char hasChannelConverter() {
        return getBufPtr().getUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 210 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 226 : 298);
    }

    public void hasChannelConverter(char hasChannelConverter) {
        getBufPtr().setUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 210 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 226 : 298, hasChannelConverter);
    }

    public char hasResampler() {
        return getBufPtr().getUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 211 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 227 : 299);
    }

    public void hasResampler(char hasResampler) {
        getBufPtr().setUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 211 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 227 : 299, hasResampler);
    }

    public char isPassthrough() {
        return getBufPtr().getUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 212 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 228 : 300);
    }

    public void isPassthrough(char isPassthrough) {
        getBufPtr().setUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 212 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 228 : 300, isPassthrough);
    }

    public char _ownsHeap() {
        return getBufPtr().getUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 213 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 229 : 301);
    }

    public void _ownsHeap(char _ownsHeap) {
        getBufPtr().setUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 213 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 229 : 301, _ownsHeap);
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 216 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 304 : 232), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 216 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 304 : 232, _pHeap.getPointer());
    }

    public static final class ma_data_converterPointer extends StackElementPointer<ma_data_converter> {

        public ma_data_converterPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_data_converterPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_data_converterPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_data_converterPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_data_converterPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_data_converterPointer() {
            this(1, true);
        }

        public ma_data_converterPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_data_converter createStackElement(long ptr, boolean freeOnGC) {
            return new ma_data_converter(ptr, freeOnGC);
        }
    }
}
