package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.enums.ma_resample_algorithm;
import games.rednblack.miniaudio.internal.structs.ma_resampling_backend_vtable;
import games.rednblack.miniaudio.internal.structs.ma_resampler_config.linear;

public final class ma_resampler_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(193).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resampler_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resampler_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resampler_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resampler_config.ma_resampler_configPointer asPointer() {
        return new ma_resampler_config.ma_resampler_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resampler_config.ma_resampler_configPointer ptr) {
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

    public long sampleRateIn() {
        return getBufPtr().getUInt(8);
    }

    public void sampleRateIn(long sampleRateIn) {
        getBufPtr().setUInt(8, sampleRateIn);
    }

    public long sampleRateOut() {
        return getBufPtr().getUInt(12);
    }

    public void sampleRateOut(long sampleRateOut) {
        getBufPtr().setUInt(12, sampleRateOut);
    }

    public ma_resample_algorithm algorithm() {
        return ma_resample_algorithm.getByIndex((int) getBufPtr().getUInt(16));
    }

    public void algorithm(ma_resample_algorithm algorithm) {
        getBufPtr().setUInt(16, algorithm.getIndex());
    }

    public ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer pBackendVTable() {
        return new ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 20), false);
    }

    public void pBackendVTable(ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer pBackendVTable) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 20, pBackendVTable.getPointer());
    }

    public VoidPointer pBackendUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 24), false);
    }

    public void pBackendUserData(VoidPointer pBackendUserData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 24, pBackendUserData.getPointer());
    }

    public linear linear() {
        return new linear(getPointer() + (CHandler.IS_64_BIT ? 40 : 28), false);
    }

    public void linear(linear toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 40 : 28), 4, this);
    }

    public linear getLinear() {
        return new linear(getBufPtr().duplicate(CHandler.IS_64_BIT ? 40 : 28, 4), true);
    }

    public void getLinear(linear toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 40 : 28, 4);
    }

    public void setLinear(linear toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 40 : 28, toCopyFrom.getBufPtr(), 0, 4);
    }

    public static final class ma_resampler_configPointer extends StackElementPointer<ma_resampler_config> {

        public ma_resampler_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resampler_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resampler_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resampler_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resampler_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resampler_configPointer() {
            this(1, true);
        }

        public ma_resampler_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resampler_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resampler_config(ptr, freeOnGC);
        }
    }

    public final static class linear extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(64).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public linear(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public linear(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public linear() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public linear.linearPointer asPointer() {
            return new linear.linearPointer(getPointer(), false, 1, this);
        }

        public void asPointer(linear.linearPointer ptr) {
            ptr.setPointer(this);
        }

        public long lpfOrder() {
            return getBufPtr().getUInt(0);
        }

        public void lpfOrder(long lpfOrder) {
            getBufPtr().setUInt(0, lpfOrder);
        }

        public static final class linearPointer extends StackElementPointer<linear> {

            public linearPointer(VoidPointer pointer) {
                super(pointer);
            }

            public linearPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public linearPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public linearPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public linearPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public linearPointer() {
                this(1, true);
            }

            public linearPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected linear createStackElement(long ptr, boolean freeOnGC) {
                return new linear(ptr, freeOnGC);
            }
        }
    }
}
