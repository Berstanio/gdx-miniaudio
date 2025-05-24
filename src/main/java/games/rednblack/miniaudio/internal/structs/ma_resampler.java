package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_resampling_backend_vtable;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_resampler.state;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import games.rednblack.miniaudio.internal.structs.ma_linear_resampler;

public final class ma_resampler extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(192).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resampler(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resampler(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resampler() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resampler.ma_resamplerPointer asPointer() {
        return new ma_resampler.ma_resamplerPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resampler.ma_resamplerPointer ptr) {
        ptr.setPointer(this);
    }

    public VoidPointer pBackend() {
        return new VoidPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pBackend(VoidPointer pBackend) {
        getBufPtr().setNativePointer(0, pBackend.getPointer());
    }

    public ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer pBackendVTable() {
        return new ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
    }

    public void pBackendVTable(ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer pBackendVTable) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackendVTable.getPointer());
    }

    public VoidPointer pBackendUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
    }

    public void pBackendUserData(VoidPointer pBackendUserData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pBackendUserData.getPointer());
    }

    public ma_format format() {
        return ma_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 24 : 12));
    }

    public void format(ma_format format) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 24 : 12, format.getIndex());
    }

    public long channels() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 28 : 16);
    }

    public void channels(long channels) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 28 : 16, channels);
    }

    public long sampleRateIn() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 32 : 20);
    }

    public void sampleRateIn(long sampleRateIn) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 32 : 20, sampleRateIn);
    }

    public long sampleRateOut() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 36 : 24);
    }

    public void sampleRateOut(long sampleRateOut) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 36 : 24, sampleRateOut);
    }

    public state state() {
        return new state(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 32 : 40), false);
    }

    public void state(state toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 32 : 40), (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104, this);
    }

    public state getState() {
        return new state(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 32 : 40, (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104), true);
    }

    public void getState(state toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 32 : 40, (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104);
    }

    public void setState(state toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 32 : 40, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104);
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 124 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 176 : 136), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 124 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 176 : 136, _pHeap.getPointer());
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 128 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 184 : 140);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 128 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 184 : 140, _ownsHeap);
    }

    public static final class ma_resamplerPointer extends StackElementPointer<ma_resampler> {

        public ma_resamplerPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resamplerPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resamplerPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resamplerPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resamplerPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resamplerPointer() {
            this(1, true);
        }

        public ma_resamplerPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resampler createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resampler(ptr, freeOnGC);
        }
    }

    public final static class state extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(243).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public state(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public state(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public state() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public state.statePointer asPointer() {
            return new state.statePointer(getPointer(), false, 1, this);
        }

        public void asPointer(state.statePointer ptr) {
            ptr.setPointer(this);
        }

        public ma_linear_resampler linear() {
            return new ma_linear_resampler(getPointer(), false);
        }

        public void linear(ma_linear_resampler toSetPtr) {
            toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104, this);
        }

        public ma_linear_resampler getLinear() {
            return new ma_linear_resampler(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104), true);
        }

        public void getLinear(ma_linear_resampler toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104);
        }

        public void setLinear(ma_linear_resampler toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104);
        }

        public static final class statePointer extends StackElementPointer<state> {

            public statePointer(VoidPointer pointer) {
                super(pointer);
            }

            public statePointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public statePointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public statePointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public statePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public statePointer() {
                this(1, true);
            }

            public statePointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected state createStackElement(long ptr, boolean freeOnGC) {
                return new state(ptr, freeOnGC);
            }
        }
    }
}
