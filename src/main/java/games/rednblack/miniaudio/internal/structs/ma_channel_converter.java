package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.enums.ma_channel_mix_mode;
import games.rednblack.miniaudio.internal.enums.ma_channel_conversion_path;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;
import games.rednblack.miniaudio.internal.structs.ma_channel_converter.weights;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SIntPointer;

public final class ma_channel_converter extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(93).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_channel_converter(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_channel_converter(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_channel_converter() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_channel_converter.ma_channel_converterPointer asPointer() {
        return new ma_channel_converter.ma_channel_converterPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_channel_converter.ma_channel_converterPointer ptr) {
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

    public ma_channel_mix_mode mixingMode() {
        return ma_channel_mix_mode.getByIndex((int) getBufPtr().getUInt(12));
    }

    public void mixingMode(ma_channel_mix_mode mixingMode) {
        getBufPtr().setUInt(12, mixingMode.getIndex());
    }

    public ma_channel_conversion_path conversionPath() {
        return ma_channel_conversion_path.getByIndex((int) getBufPtr().getUInt(16));
    }

    public void conversionPath(ma_channel_conversion_path conversionPath) {
        getBufPtr().setUInt(16, conversionPath.getIndex());
    }

    public UBytePointer pChannelMapIn() {
        return new UBytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 20), false);
    }

    public void pChannelMapIn(UBytePointer pChannelMapIn) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 20, pChannelMapIn.getPointer());
    }

    public UBytePointer pChannelMapOut() {
        return new UBytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 24), false);
    }

    public void pChannelMapOut(UBytePointer pChannelMapOut) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 24, pChannelMapOut.getPointer());
    }

    public UBytePointer pShuffleTable() {
        return new UBytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 28), false);
    }

    public void pShuffleTable(UBytePointer pShuffleTable) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 28, pShuffleTable.getPointer());
    }

    public weights weights() {
        return new weights(getPointer() + (CHandler.IS_64_BIT ? 48 : 32), false);
    }

    public void weights(weights toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 48 : 32), CHandler.IS_64_BIT ? 8 : 4, this);
    }

    public weights getWeights() {
        return new weights(getBufPtr().duplicate(CHandler.IS_64_BIT ? 48 : 32, CHandler.IS_64_BIT ? 8 : 4), true);
    }

    public void getWeights(weights toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 48 : 32, CHandler.IS_64_BIT ? 8 : 4);
    }

    public void setWeights(weights toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 48 : 32, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 8 : 4);
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 56 : 36), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 56 : 36, _pHeap.getPointer());
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 64 : 40);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 64 : 40, _ownsHeap);
    }

    public static final class ma_channel_converterPointer extends StackElementPointer<ma_channel_converter> {

        public ma_channel_converterPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_channel_converterPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_channel_converterPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_channel_converterPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_channel_converterPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_channel_converterPointer() {
            this(1, true);
        }

        public ma_channel_converterPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_channel_converter createStackElement(long ptr, boolean freeOnGC) {
            return new ma_channel_converter(ptr, freeOnGC);
        }
    }

    public final static class weights extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(250).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public weights(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public weights(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public weights() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public weights.weightsPointer asPointer() {
            return new weights.weightsPointer(getPointer(), false, 1, this);
        }

        public void asPointer(weights.weightsPointer ptr) {
            ptr.setPointer(this);
        }

        public PointerPointer<FloatPointer> f32() {
            return new PointerPointer<>(getBufPtr().getNativePointer(0), false, FloatPointer::new);
        }

        public void f32(PointerPointer<FloatPointer> f32) {
            getBufPtr().setNativePointer(0, f32.getPointer());
        }

        public PointerPointer<SIntPointer> s16() {
            return new PointerPointer<>(getBufPtr().getNativePointer(0), false, SIntPointer::new);
        }

        public void s16(PointerPointer<SIntPointer> s16) {
            getBufPtr().setNativePointer(0, s16.getPointer());
        }

        public static final class weightsPointer extends StackElementPointer<weights> {

            public weightsPointer(VoidPointer pointer) {
                super(pointer);
            }

            public weightsPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public weightsPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public weightsPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public weightsPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public weightsPointer() {
                this(1, true);
            }

            public weightsPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected weights createStackElement(long ptr, boolean freeOnGC) {
                return new weights(ptr, freeOnGC);
            }
        }
    }
}
