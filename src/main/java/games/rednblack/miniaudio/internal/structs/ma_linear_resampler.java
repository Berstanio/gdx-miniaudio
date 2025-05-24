package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_linear_resampler_config;
import games.rednblack.miniaudio.internal.structs.ma_linear_resampler.x0;
import games.rednblack.miniaudio.internal.structs.ma_linear_resampler.x1;
import games.rednblack.miniaudio.internal.structs.ma_lpf;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SShortPointer;

public final class ma_linear_resampler extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(150).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_linear_resampler(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_linear_resampler(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_linear_resampler() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_linear_resampler.ma_linear_resamplerPointer asPointer() {
        return new ma_linear_resampler.ma_linear_resamplerPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_linear_resampler.ma_linear_resamplerPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_linear_resampler_config config() {
        return new ma_linear_resampler_config(getPointer(), false);
    }

    public void config(ma_linear_resampler_config toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32, this);
    }

    public ma_linear_resampler_config getConfig() {
        return new ma_linear_resampler_config(getBufPtr().duplicate(0, CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32), true);
    }

    public void getConfig(ma_linear_resampler_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32);
    }

    public void setConfig(ma_linear_resampler_config toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32);
    }

    public long inAdvanceInt() {
        return getBufPtr().getUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32);
    }

    public void inAdvanceInt(long inAdvanceInt) {
        getBufPtr().setUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32, inAdvanceInt);
    }

    public long inAdvanceFrac() {
        return getBufPtr().getUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 32 : 36);
    }

    public void inAdvanceFrac(long inAdvanceFrac) {
        getBufPtr().setUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 32 : 36, inAdvanceFrac);
    }

    public long inTimeInt() {
        return getBufPtr().getUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40);
    }

    public void inTimeInt(long inTimeInt) {
        getBufPtr().setUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40, inTimeInt);
    }

    public long inTimeFrac() {
        return getBufPtr().getUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 40 : 44);
    }

    public void inTimeFrac(long inTimeFrac) {
        getBufPtr().setUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 40 : 44, inTimeFrac);
    }

    public x0 x0() {
        return new x0(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 44 : 48), false);
    }

    public void x0(x0 toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 44 : 48), CHandler.IS_64_BIT ? 8 : 4, this);
    }

    public x0 getX0() {
        return new x0(getBufPtr().duplicate(CHandler.IS_COMPILED_ANDROID_X86 ? 44 : 48, CHandler.IS_64_BIT ? 8 : 4), true);
    }

    public void getX0(x0 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_COMPILED_ANDROID_X86 ? 44 : 48, CHandler.IS_64_BIT ? 8 : 4);
    }

    public void setX0(x0 toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_COMPILED_ANDROID_X86 ? 44 : 48, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 8 : 4);
    }

    public x1 x1() {
        return new x1(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 48 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 52 : 56), false);
    }

    public void x1(x1 toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 48 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 52 : 56), CHandler.IS_64_BIT ? 8 : 4, this);
    }

    public x1 getX1() {
        return new x1(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 48 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 52 : 56, CHandler.IS_64_BIT ? 8 : 4), true);
    }

    public void getX1(x1 toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 48 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 52 : 56, CHandler.IS_64_BIT ? 8 : 4);
    }

    public void setX1(x1 toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 48 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 52 : 56, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 8 : 4);
    }

    public ma_lpf lpf() {
        return new ma_lpf(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 56), false);
    }

    public void lpf(ma_lpf toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 56), CHandler.IS_64_BIT ? 56 : 36, this);
    }

    public ma_lpf getLpf() {
        return new ma_lpf(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 56, CHandler.IS_64_BIT ? 56 : 36), true);
    }

    public void getLpf(ma_lpf toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 56, CHandler.IS_64_BIT ? 56 : 36);
    }

    public void setLpf(ma_lpf toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 56, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 56 : 36);
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 88 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 92), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 88 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 92, _pHeap.getPointer());
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 128 : 96);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 128 : 96, _ownsHeap);
    }

    public static final class ma_linear_resamplerPointer extends StackElementPointer<ma_linear_resampler> {

        public ma_linear_resamplerPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_linear_resamplerPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_linear_resamplerPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_linear_resamplerPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_linear_resamplerPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_linear_resamplerPointer() {
            this(1, true);
        }

        public ma_linear_resamplerPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_linear_resampler createStackElement(long ptr, boolean freeOnGC) {
            return new ma_linear_resampler(ptr, freeOnGC);
        }
    }

    public final static class x0 extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(251).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public x0(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public x0(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public x0() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public x0.x0Pointer asPointer() {
            return new x0.x0Pointer(getPointer(), false, 1, this);
        }

        public void asPointer(x0.x0Pointer ptr) {
            ptr.setPointer(this);
        }

        public FloatPointer f32() {
            return new FloatPointer(getBufPtr().getNativePointer(0), false);
        }

        public void f32(FloatPointer f32) {
            getBufPtr().setNativePointer(0, f32.getPointer());
        }

        public SShortPointer s16() {
            return new SShortPointer(getBufPtr().getNativePointer(0), false);
        }

        public void s16(SShortPointer s16) {
            getBufPtr().setNativePointer(0, s16.getPointer());
        }

        public static final class x0Pointer extends StackElementPointer<x0> {

            public x0Pointer(VoidPointer pointer) {
                super(pointer);
            }

            public x0Pointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public x0Pointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public x0Pointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public x0Pointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public x0Pointer() {
                this(1, true);
            }

            public x0Pointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected x0 createStackElement(long ptr, boolean freeOnGC) {
                return new x0(ptr, freeOnGC);
            }
        }
    }

    public final static class x1 extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(252).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public x1(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public x1(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public x1() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public x1.x1Pointer asPointer() {
            return new x1.x1Pointer(getPointer(), false, 1, this);
        }

        public void asPointer(x1.x1Pointer ptr) {
            ptr.setPointer(this);
        }

        public FloatPointer f32() {
            return new FloatPointer(getBufPtr().getNativePointer(0), false);
        }

        public void f32(FloatPointer f32) {
            getBufPtr().setNativePointer(0, f32.getPointer());
        }

        public SShortPointer s16() {
            return new SShortPointer(getBufPtr().getNativePointer(0), false);
        }

        public void s16(SShortPointer s16) {
            getBufPtr().setNativePointer(0, s16.getPointer());
        }

        public static final class x1Pointer extends StackElementPointer<x1> {

            public x1Pointer(VoidPointer pointer) {
                super(pointer);
            }

            public x1Pointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public x1Pointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public x1Pointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public x1Pointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public x1Pointer() {
                this(1, true);
            }

            public x1Pointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected x1 createStackElement(long ptr, boolean freeOnGC) {
                return new x1(ptr, freeOnGC);
            }
        }
    }
}
